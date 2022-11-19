package conditionStatementsRevision;

public class IfElseStatement {

	public static void main(String[] args) {
		int marks = 55;
		if (marks >= 35) {
			int a = 10, b = 20;
			int result = a + b;
			System.out.println(result);
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
	}

}

// if marks is greater than or equal to 35 then print 'Pass'
// otherwise print 'Fail'