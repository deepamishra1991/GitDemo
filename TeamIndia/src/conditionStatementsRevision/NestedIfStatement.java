package conditionStatementsRevision;

public class NestedIfStatement {

	public static void main(String[] args) {
		System.out.println("Program starts here");
		int age = 70;

		if (age >= 18) {
			if (age <= 60) {
				System.out.println("You are eligible for blood donation");
			}

		}
		System.out.println("Program ends here");
	}

}
// if age is between 18 to 60 then you are eligible for 
// blood donation