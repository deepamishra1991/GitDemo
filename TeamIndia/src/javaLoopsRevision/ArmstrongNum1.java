package javaLoopsRevision;

public class ArmstrongNum1 {

	public static void main(String[] args) {
		int no = 153;
		int x, rem, sum = 0, count = 0, i, multi=1;
		x = no;
		while (x != 0) {
			count = count + 1;
			x = x / 10;
		}
		System.out.println("No of digits is : " + count);
		x = no;
		while (x != 0) {
			rem = x % 10;
			multi = 1;
			for (i = 1; i <= count; i++) {
				multi = multi * rem;
			}
			sum = sum + multi;
			x = x / 10;
		}
		if (sum == no) {
			System.out.println("Armstrong");

		} else {
			System.out.println("not armstrong");
		}

	}

}
