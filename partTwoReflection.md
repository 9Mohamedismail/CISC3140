﻿# LAB 2: PART 2 SHELL AND MAKE REFLECTION

**Working with both a makefile and a shell script was challenging yet exciting. Being able to observe the differences between both programming languages was something I don’t normally get to do in my other classes. Nonetheless, I think it’s fair for me to make the assumption based on my own experience that makefile is superior to shell script. Sure, there are tasks that shell script just does better, for example when working with variables I had such a tough time with the makefile. Matter of fact, I was unable to solve the trouble I was having. With makefile, I wanted to let the user input a java file name as well as an input file name, and I used the *“read”* command that’s available in a makefile. However, what I realized with makefile was that for some reason it would not transfer the variable read in *(for example the java file name)* to multiple functions. Working with variables was a nightmare, whereas compared to the shell I was able to do it without any trouble. My workaround to this problem was simply only allowing one variable to be read in - the java file name - and instead, default the input file to always be input.txt. With this amount of trouble that I endured, you’d be surprised why I still choose makefile over shell. I’ve worked with makefiles before, specifically in c++ programming so I had some experience in what was possible with it. Tasks like functions are much easier here. For example, I could make multiple targets that the user can choose to run, and sometimes I could even make a target call another target! Shell can do this, but the user *(as far as I know)* is unable to choose *which* function to run; unless however you have the default function call that function. One thing I do enjoy about shell is that it allows you to import other shell scripts and run them without any trouble. You can even choose what parts of those shell scripts to run and I think that’s something a makefile can’t do. I believe with more experience shell could grow on me, but for now, makefile is my go-to choice**