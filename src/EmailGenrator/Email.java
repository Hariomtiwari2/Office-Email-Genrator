package EmailGenrator;

import java.util.Locale;
import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private int length = 10;
	private String department;
	private String email;
	private int mailboxCapacity;
	private String altEmail;
	private int phonenumber;

	// create a constructor to receive first and last name;
	Email(String firstName, String lastName ){
		this.firstName = firstName;
		this.lastName = lastName;
		this.phonenumber = phonenumber;
		System.out.println("Email for: "+ this.firstName+" "+this.lastName);

		// we will get department through method department
		this.department = departmentName();
		System.out.println("Department name: "+ this.department);

		// method to get random default password
		this.password = passwordGenrator(length);
		System.out.println("Default password: "+this.password);

		// method to get email
		email = firstName.toLowerCase(Locale.ROOT)+"."+lastName.toLowerCase()+"@"+this.department+"."+"ORACLE"+"."+"com";
		System.out.println(email);
	}

	// Method to get department name

	private String departmentName(){
		System.out.println("Department Codes\n1 for sales\n2 for Development\n3 for Accounts\n4 for Temporary");
		Scanner sc  = new Scanner(System.in);
		System.out.print ("Enter code: " );
		int deptCode = sc.nextInt();
		if (deptCode == 1){
			return "Sales";
		} else if (deptCode == 2) {
			return "Development";
		} else if (deptCode == 3) {
			return "Accounts";
		}else {
			return "temporary";
		}
	}
	// Phone numebr set

	/*public void setPhonenumber(int phonenumber) {
		if (phonenumber)
	}*/ // how do i set the number of digits of phonenumebr ao that it does'nt exceed 10 digits;

	// method to set random password
	private String passwordGenrator(int length){
		String passwordSet = "ABCDEFGHIJKLMONPQRSTWUVXYZabcdefghijklmonpqrstwuvxyz1234567890!@#$%^&*";
		char[] password = new char[length];
		for(int i = 0; i< length; i++){
			int random = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(random);
		}
		return  new String(password);
	}

	// method to get defaultailbx capacity;
	public void setMailboxCapacity(int capacity){
		this.mailboxCapacity = capacity;
	}
	// method to get mailbox capacity;

	public int getMailboxCapacity() {
		return mailboxCapacity;
	}

	//  to set alternate email
	public void alternatemail(/*String alternateEmail*/){
		System.out.println("Enter the alternate email");
		Scanner sc = new Scanner(System.in);
		this.altEmail = sc.next();
	}
//  ways to get print  alternate email addresss
	public String getAltEmail() {
		System.out.print("Alternate Email: ");
		return altEmail;
	}

	// ways to change the password
	public String chgPass(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the new password: ");
		this.password = sc.next();
		return this.password;
	}
//  ways to print new password on console!
	public String getPassword() {
		System.out.println("Pass changes successfully");
		return password;

	}
	// method to show information;
	public void info(){
		System.out.println("First Name:     "+firstName);
		System.out.println("Last  Name:     "+lastName);
		System.out.println("Comapny Email: "+email);
		System.out.println("Alternate Email: "+altEmail);
	}
}
