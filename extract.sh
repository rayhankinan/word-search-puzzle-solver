#!/bin/bash

EXTRACT="jar"
COMMAND="xf"
TARGET="bin"
ZIP="word-search-puzzle-solver"

if [ ! -d TARGET ];
then
mkdir $TARGET
cd $TARGET
$EXTRACT $COMMAND ../$ZIP.jar
else
cd $TARGET
$EXTRACT $COMMAND ../$ZIP.jar
fi