#!/bin/zsh

start=`date -j +%s`

labOne=$(date -j -f "%m %d %Y" "09 28 2022" +%s)
labTwo=$(date -j -f "%m %d %Y" "10 26 2022" +%s)
labThree=$(date -j -f "%m %d %Y" "11 23 2022" +%s)
labFour=$(date -j -f "%m %d %Y" "12 07 2022" +%s)

printf "Hello Student! Your current date is: `date +%b` `date +%d` "
printf "\nDays until the next labs: \n"

printf "\nLAB ONE: $(( ($labOne - $start) / (60 * 60 *24) )) days"
printf "\nLAB TWO: $(( ($labTwo - $start) / (60 * 60 *24) )) days"
printf "\nLAB THREE: $(( ($labThree - $start) / (60 * 60 *24) )) days"
printf "\nLAB FOUR: $(( ($labFour - $start) / (60 * 60 *24) )) days"
