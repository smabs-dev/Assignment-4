package week3;
/*
* File: Mystery.java
* ------------------
* This program doesn't do anything useful and exists only to test
* your understanding of method calls and parameter passing.
*/
import acm.program.ConsoleProgram;

public class Mystery extends ConsoleProgram {
	public void run() {
		ghost(13);
	}

	private void ghost(int x) {
		int y = 0; //<-
		for (int i = 1; i < x; i *= 2) { // int i=1, 1<13, i=2
			y = witch(y, skeleton(x, i)); // witch(1, skeleton(1, 1))
		} // i=1, i=2, i=4, i=8
		println("ghost: x = " + x + ", y = " + y); // ghost: x= 13, y=
	}

	private int witch(int x, int y) { // witch(13,0)
		x = 10 * x + y; // x=13
		println("witch: x = " + x + ", y = " + y); // witch: x = 130, y= 0
		return x; // return 130
	}

	private int skeleton(int x, int y) { // skeleton(13, 0)
		return x / y % 2; // return 13/1/2 remainder= 0
	}
}

/* Heap
*$1000: ...
*$1008: ...
*$1010: ...
*
*Stack
*$100: x: int = 13
*$092: y: int = 0
*$090: i: int = 1
* -- skeleton
*$088: x: int = 13
*$080: y: int = 1
* -- witch
* 088: x: int = 1
* 080: y: int = 1
* -- first loop
* 100 x int 13
* 098 y int 1
* 090 i int = 2
*  -- witch
* 088 x int = 10
* 080 y int = 0
*  -- skeleton
* 088 
* 080 
* -- 2nd loop
* 100 x int = 13
* 098 y int = 10
* 090 i int = 4
* 
* println x 1 y 1
* println x 10 y 0
* println x 101 y 1
* println x 1011 y 1
* println x 13 y 1011
* 
*x=13
*y=2
*every value inside paranthesis is called 
*before what is outside the paranthesis
*13/2 %remainder 1
* % modular operator needs integars
*always do the right side of assignments first
*/