// Define a grammar called Micro
grammar Micro;
KEYWORD 
: 'PROGRAM' 
| 'BEGIN' 
| 'END' 
| 'FUNCTION' 
| 'RETURN' 
| 'READ' 
| 'WRITE' 
| 'IF' 
| 'ELSE' 
| 'ENDIF' 
| 'FOR' 
| 'ENDFOR' 
| 'INT' 
| 'VOID' 
| 'STRING'  
| 'FLOAT' 
; 
OPERATOR 
: ':=' 
| '+' 
| '-' 
| '*' 
| '/' 
| '=' 
| '!=' 
| '<' 
| '>' 
| '<=' 
| '>=' 
| ';' 
| ',' 
| '(' 
| ')' 
;
IDENTIFIERS 
:([A-Za-z]([A-Za-z0-9])*)
; 
INTLITERAL 
: [0-9]+ 
;
FLOATLITERAL 
:[0-9]*'.'[0-9]+
;
STRINGLITERAL 
:'"'(~["])*'"' 
; 
COMMENTS
: '--'(~[\n])*[\n] ->skip
;
 
 
 
WS : (' '|'\t'|'\r'|'\n')+ -> skip ;  // skip spaces, tabs, newlines 



//Grammar rules 
//Program 
program : 'PROGRAM' id 'BEGIN' pgm_body 'END' #programRule;
id : IDENTIFIERS;
pgm_body : decl func_declarations;
decl : string_decl decl #declRule
      | var_decl decl  #var_declRule
      |    #epsilon1Rule
      ; 

//String Declaration 
string_decl : 'STRING' id ':=' str ';' ;  
str : STRINGLITERAL; 

//Variable Declaration 
var_decl : var_type id_list ';'; 
var_type : 'FLOAT' #FloatRule
          | 'INT' #IntRule
          ; 
any_type : var_type  #any_typeRule
          | 'VOID' #voidRule
;
id_list : id id_tail; 
id_tail : ',' id id_tail  #id_tailRule
          |  #epsilon2Rule
          ; 

//Function Parameter List 
param_decl_list : param_decl param_decl_tail #param_decl_listRule
                 | #epsilon3Rule
                 ; 

param_decl : var_type id;
param_decl_tail : ',' param_decl param_decl_tail  #param_decl_tailRule
                |  #epsilon4Rule
                ; 


//Function Declarations 
func_declarations : func_decl func_declarations  #func_declarationsRule
                  |  #epsilon5Rule
                  ;
func_decl : 'FUNCTION' any_type id '('param_decl_list')' 'BEGIN' func_body 'END';
func_body : decl stmt_list; 


//Statement List 
stmt_list : stmt stmt_list  #stmt_listRule
            |  #epsilon6Rule
            ; 
stmt : basic_stmt  #basic_stmtRule
      | if_stmt  #if_stmtRule
      | for_stmt  #for_stmtRule
       ;
basic_stmt : assign_stmt  #assign_stmtRule
           | read_stmt #read_stmtRule
           | write_stmt  #wrire_stmtRule
           | return_stmt  #return_stmtRule
           ; 




//Basic Statements 
assign_stmt : assign_expr ';' ; 
assign_expr : id ':=' expr ; 
read_stmt :  'READ' '(' id_list ')' ';' ;  
write_stmt : 'WRITE' '('id_list')' ';' ; 
return_stmt : 'RETURN' expr ';' ; 


//if_stmt 
if_stmt : 'IF' '('cond')' decl stmt_list else_part 'ENDIF';
else_part : 'ELSE' decl stmt_list  #else_partRule
            | #epsilon7Rule
            ;
cond : expr compare expr;
compare : '='  #equalRule
          |'!=' #notequalRule
          |'<=' #greaterequalThanRule
          |'>=' #smallerequalThanRule
          |'<' #greaterThanRule
          |'>'#smallerThanRule
           ;



//for_stmt 
for_stmt : 'FOR' '(' init_expr ';' cond ';' incr_expr ')' decl stmt_list 'ENDFOR';
init_expr : assign_expr #init_exprRule
            | #epsilon8Rule
            ;
incr_expr : assign_expr  #incr_exprRule
            | #epsilon9Rule
            ;




//Expressions 
expr : expr_prefix term;
expr_prefix : expr_prefix term addop  #exprprefixRule
              | #epsilon10Rule
              ;
term : factor_prefix factor;
factor_prefix : factor_prefix factor mulop  #factorprefixRule
                | #epsilon11Rule
                ;
factor : primary      #primaryRule
        | call_expr  #call_exprRule
        ; 
primary : '(' expr ')'  #primaryexprRule
         | id  #idRule
         | INTLITERAL  #intliteralRule
         | FLOATLITERAL #floatliteralRule
         ;
call_expr : id '(' expr_list ')';
expr_list : expr expr_list_tail  #expr_listRule
           | #epsilon12Rule
           ;
expr_list_tail : ',' expr expr_list_tail #expr_list_tailRule
                 | #epsilon13Rule
                 ;
addop : '+'  #addopRule
       | '-' #subopRule
       ;
mulop : '*' #mulopRule
        |'/' #divopRule
        ;