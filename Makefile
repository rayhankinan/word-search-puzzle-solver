SOURCE=src
TARGET=bin
COMPILER=javac
PROGRAM=App

all:
	@cd $(SOURCE);$(COMPILER) -d ../$(TARGET) $(PROGRAM).java

clean:
	@rm -r $(TARGET)