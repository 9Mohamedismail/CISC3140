#! /bin/bash

source ./build.sh
printf "\nrunning build.sh to run java version of date calculator"
complieAndRun

printf "\nDone! now running bash version of the date calculator\n\n"
sh ./daysUntil.sh