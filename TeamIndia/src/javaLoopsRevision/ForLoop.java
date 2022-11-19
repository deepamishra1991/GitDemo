package javaLoopsRevision;

public class ForLoop {

	public static void main(String[] args) {
/*		for(int i = 1; i <= 100; i++) {
			System.out.println(i);
		}*/
		
		for(int i = 1; i <= 100; i=i+3) {
			System.out.println(i);
		}
	}

}
// i++ ==> i = i + 1;
/*
1 - decalaration i.e int i = 1;
2 - condition check, if true then go to step 3, if false for exit the for loop
3 - execute the for loop body
4 - perform the operation
5 - jump to step 2
*/
/*
1
2
3
4
5
6
7
8
9
10
*/