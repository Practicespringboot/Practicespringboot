package security;

import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setName("SREEDHAR");
		emp.setPan("REDDY9876T");
		emp.setDob("06-06-1994");
		// Get first 2 characters of name ,numeric values in pan,date of year
		// Expected password--->SR98761994

		String s1 = getfirsttwocharofname(emp.getName());
		String s2 = getnumericvaluesinpan(emp.getPan());
		String s3 = getyearindob(emp.getDob());
		String filepassword = s1 + s2 + s3;
//		System.out.println(filepassword);
		System.out.println("ENTER YOUR FILE PASSWORD");
		Scanner sc = new Scanner(System.in);
			String password = sc.next();

			if (password.equalsIgnoreCase(filepassword)) {
				System.out.println("GOT ACESS TO YOUR FILE");
			} else {
				System.out.println("ACESS DENIED");
			}
		}

	

	public static String getfirsttwocharofname(String str) {
		return str.substring(0, 2);

	}

	public static String getnumericvaluesinpan(String str) {
		return str.replaceAll("\\D+", "");
	}

	public static String getyearindob(String str) {
		String[] arr = str.split("-");
		return arr[2];
	}

}
