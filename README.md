****************
* Project 1: Deterministic Finite Automata
* Class CS361 001
* Date 2/4/2026
* @author AEagleton, DCunningham
**************** 


OVERVIEW:

 Concisely explain what the program does. If this exceeds a couple
 of sentences, you're going too far. The details go in other
 sections.

This program is used by instantiating instances of the DFA class, which
implements DFAInterface and uses DFAState objects. The program creates
Determinate Finite Automatas with the instantiation method DFA(). This
can then be built using methods to add characters to the language, add
states, transitions, and set the start state and final state(s). 
Existing transitions can be augmented with the swap function. The
toString() method will print out the 5-tuple for a given DFA object.


INCLUDED FILES:
 * DFA.java
 * DFAInterface.java
 * DFAState.java
 * FAInterface.java
 * State.java
 * DFATest.java
 * README.md - readme doc

 List the files required for the project with a brief
 explanation of why each is included.

 e.g.
 * Class1.java - source file
 * Class2.java - source file
 * README - this file




COMPILING AND RUNNING:

From the project directory, run the following to compile the program:
javac fa/dfa/*.java

To use the DFA class, instantiate a DFA object in a new class
containing a main method.

To clean up frmo the project directory, run
rm fa/dfa/*.class
rm fa/*.class

PROGRAM DESIGN AND IMPORTANT CONCEPTS:


 This is the sort of information someone who really wants to
 understand your program - possibly to make future enhancements -
 would want to know.


 Explain the main concepts and organization of your program so that
 the reader can understand how your program works. This is not a repeat
 of javadoc comments or an exhaustive listing of all methods, but an
 explanation of the critical algorithms and object interactions that make
 up the program.


 Explain the main responsibilities of the classes and interfaces that make
 up the program. Explain how the classes work together to achieve the program
 goals. If there are critical algorithms that a user should understand, 
 explain them as well.
 
 If you were responsible for designing the program's classes and choosing
 how they work together, why did you design the program this way? What, if 
 anything, could be improved? 


TESTING:

We used the existing tests as well as a few addition tests for small DFAs to
make sure the program meets all the requirements. Based on the existing tests,
tests were run to check instantiating a DFA, checking that its properties are
the correct expected values, testing the toString, and running similar tests
after performing a swap. The program should be able to handle bad input as
functions were made to return false if an invalid input is given. We used
assertFalse to check such cases. We are not aware of any known issues and bugs
remaining in the program.


DISCUSSION:
 
The main topic that had to be researched for this project was what set
and map to use, which led to the discovery of the linked hash map and
linked hash set. Beyond that, the program was written without much issue.
The other problem encountered was getting JUnit tests to work, which just
required getting the packages.

The most difficult part of this project was figuring out the logistics
before beginning, such as selecting what version of set and map to use.
One thing that clicked is the expected logic here is very similar to
JFLAP, which gave a good visual representation of how the methods should
work. 
 
SOURCES:

https://www.geeksforgeeks.org/java/linkedhashmap-class-in-java/
Used as primary source for understanding how to use a linked hash map

https://docs.oracle.com/javase/8/docs/api/java/util/LinkedHashMap.html
Used as an additional source for how to use a linked hash map

https://www.geeksforgeeks.org/java/linkedhashset-in-java-with-examples/
Used as primary source for understanding how to use a linked hash set

https://docs.oracle.com/javase/8/docs/api/java/util/LinkedHashSet.html
Used as primary source for how to use a linked hash set

https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
Used to recall syntax for iterators

Google AI overview/gemini for generic questions typed directly into google since it answers them quicker than clicking on links



----------------------------------------------------------------------------


All content in a README file is expected to be written in clear English with
proper grammar, spelling, and punctuation. If you are not a strong writer,
be sure to get someone else to help you with proofreading. Consider all project
documentation to be professional writing for your boss and/or potential
customers.
