@echo off
set EXTRACT=jar
set COMMAND=xf
set TARGET=bin
set ZIP=word-search-puzzle-solver

if not exist bin\ (
    mkdir %TARGET%
    cd %TARGET%
    %EXTRACT% %COMMAND% ../%ZIP%.jar
) else (
    cd %TARGET%
    %EXTRACT% %COMMAND% ../%ZIP%.jar
)