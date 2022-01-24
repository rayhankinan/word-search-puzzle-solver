SOURCE=src
TARGET=bin
COMPILER=javac
RUNNER=java

all:
	@cd $(SOURCE);$(COMPILER) -d ../$(TARGET) App.java

clean:
	@rm -r $(TARGET)

run:
	@cd $(TARGET);$(RUNNER) App