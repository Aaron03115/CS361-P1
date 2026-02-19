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


 Give the command for compiling the program, the command
 for running the program, and any usage instructions the
 user needs.
 
 These are command-line instructions for a system like onyx.
 They have nothing to do with Eclipse or any other IDE. They
 must be specific - assume the user has Java installed, but
 has no idea how to compile or run a Java program from the
 command-line.
 
 e.g.
 From the directory containing all source files, compile the
 driver class (and all dependencies) with the command:
 $ javac Class1.java


 Run the compiled class file with the command:
 $ java Class1


 Console output will give the results after the program finishes.




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
 
 Discuss the issues you encountered during programming (development)
 and testing. What problems did you have? What did you have to research
 and learn on your own? What kinds of errors did you get? How did you 
 fix them?
 
 What parts of the project did you find challenging? Is there anything
 that finally "clicked" for you in the process of working on this project?
 
 
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
