# Micro Compiler

A Java-based compiler for the Micro programming language, developed using ANTLR 4.

## Overview

This project implements a compiler that translates programs written in the Micro programming language into Tiny Assembly code.

The compiler uses ANTLR 4 for lexical analysis and parsing, followed by a Visitor-based approach for processing the syntax tree and generating target code.

## Compiler Architecture

The compilation process consists of the following stages:

1. **Lexical Analysis:** Tokenizes the input source code using ANTLR-generated Lexer.
2. **Syntax Analysis:** Parses tokens using the ANTLR-generated Parser.
3. **Semantic Processing:** Processes the syntax tree using Visitor classes.
4. **Symbol Table Management:** Tracks symbols and their associated information.
5. **Code Generation:** Generates Tiny Assembly instructions.

## Technologies Used

- Java
- ANTLR 4
- Visitor Design Pattern
- Compiler Design

## Project Structure

| File | Description |
|---|---|
| `Micro.g4` | ANTLR grammar definition |
| `Driver.java` | Main compiler entry point |
| `Symbol.java` | Symbol representation |
| `SymbolTable.java` | Symbol table management |
| `Step4Visitor.java` | Visitor implementation |
| `TinyGenerator.java` | Tiny Assembly code generation |

Additional Java files implement the generated Lexer, Parser, Listener, and Visitor components.

## Author

**Nicola Qaisyah**

Computer Engineering Student  
University of Jordan
