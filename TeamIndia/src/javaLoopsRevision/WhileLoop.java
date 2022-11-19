package javaLoopsRevision;

public class WhileLoop {

	public static void main(String[] args) {
		char ch = 'a';
		while (ch <= 'z') { // comparison is based on character's ascii value
			System.out.println((int) ch + " " + ch);
			ch++;
		}

	}

}
