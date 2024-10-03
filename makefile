JFLAGS = -g
JC = javac
JVM = java
MAIN = Juego
 
run: $(MAIN)
	$(JVM) $(MAIN)
 
$(MAIN):
	$(JC) $(JFLAGS) *.java
 
borrar:
	rm *.class
