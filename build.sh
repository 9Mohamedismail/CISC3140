#! /bin/bash

compileJava() {
        javac labTwo.java #Complies the java code
}

runJava() {
    java labTwo < input.txt > shellOutput.txt #File redirection from input.txt and writes out the output into a log.txt
}

#calls both functions
complieAndRun() {
    compileJava 
    runJava
}