lab2:
	@read -p "javafile name: " FILENAME; \
	make compile-file f=$$FILENAME; \
	make run-file f=$$FILENAME 

compile-file:
	javac ${f}.java

run-file:
	java ${f}.java < input.txt > makeFileOutput.txt