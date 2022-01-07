import java.util.Scanner;


public class StudentMS
{
	
	String username;
	final int ID = 1;
	double fees;
	String performanceDetails;
	double balance;
		
		
		
	/* username = "Daniel";
	ID = 1;
	fees = 100;
	performanceDetails = "Quick learner.";
	balance = 50; */
	/*
	Student Management System is one of the best beginner-level projects in Java. This will require the concepts of Object-Oriented features and JDBC of Java.

	You will have to create an application that stores all details related to students. There will be operations like enrolling or adding a new student into the database, fees payment, show performance details, view balance, etc.

	This is one of the best Java projects to implement the database and OOPs concepts.
	*/
	public static void main(String[] args)
	{
		StudentMS sms = new StudentMS();
		sms.start();
	}
	
	static void printStudentInfo(String username, int ID, double fees, String performanceDetails, double balance)
	{
		System.out.println("Name: " + username);
		System.out.println("ID: " + ID);
		System.out.println("Fees: " + fees);
		System.out.println("Performance Details: " + performanceDetails);
		System.out.println("Balance: " + balance);
	}
	
	public void start()
	{
		Scanner scan = new Scanner(System.in);
		
		username = "Daniel";
		// ID = 1;
		fees = 100;
		performanceDetails = "Quick learner.";
		balance = 50; 
		
		System.out.println("Welcome! \nWhat would you like to do? 1: View student info. 2: Modify student info.");
		int userChoice1 = Integer.parseInt(scan.nextLine());
		if (userChoice1 == 1)
		{
			System.out.println("What student's info would you like to view?");
			int userChoice2 = Integer.parseInt(scan.nextLine());
			if (userChoice2 < 0)
			{
				// throw new OutOfRangeException("ID must be a positive number.");
				System.out.println("THIS SHIT ISN'T WORKING");
			}
			else if (userChoice2 == 1)
			{
				printStudentInfo(username, ID, fees, performanceDetails, balance);
			}
		}
		
		else if (userChoice1 == 2)
		{
			System.out.println("What student's info would you like to modify? Type 'Exit' to exit.");
			int userChoice2 = Integer.parseInt(scan.nextLine());
			while (userChoice2 != 0)
			{
				if (userChoice2 < 0)
				{
					//throw new OutOfRangeException("ID must be a positive number.");
					System.out.println("THIS SHIT ISN'T WORKING");
				}
				else if (userChoice2 == 1)
				{
					printStudentInfo(username, ID, fees, performanceDetails, balance);
					System.out.println("What would you like to change?");
					String userChoice3 = scan.nextLine();
					switch (userChoice3)
					{
						case "Username":
						{
							System.out.println("what do you want to change it to?");
							username = scan.nextLine();
							break;
						}
						case "ID":
						{
							System.out.println("You cannot change this.");
							break;
						}
						case "Fees":
						{
							System.out.println("what do you want to change it to?");
							fees = Integer.parseInt(scan.nextLine());
							break;
						}
						case "PerformanceDetails":
						{
							System.out.println("what do you want to change it to?");
							performanceDetails = scan.nextLine();
							break;
						}
						case "Balance":
						{
							System.out.println("what do you want to change it to?");
							balance = Integer.parseInt(scan.nextLine());
							break;
						}
						case "Exit":
						{
							userChoice2 = 0;
							break;
						}
					}
				}
			}
		}
	
	}
}

/*

String name;
	final int StudentID;
	double fees;
	String performanceDetails;
	double balance;
	
	public void printStudentInfo()
	{
		System.out.println("Name: " + name);
		System.out.println("StudentID: " + StudentID);
		System.out.println("Fees: " + fees);
		System.out.println("PerformanceDetails: " + performanceDetails);
		System.out.println("Balance: " + balance);
	}
	
	public static void main(String args[])
	{
		String name;
		final int StudentID;
		double fees;
		String performanceDetails;
		double balance;
		
		Scanner scan = new Scanner(System.in);
		
		name = "Daniel";
		StudentID = 1;
		fees = 100;
		performanceDetails = "Quick learner.";
		balance = 50;
		
		System.out.println("Good day!");
		System.out.println("What would you like to do? 1: View student info. 2: Modify student info.");
		int choice1 = Integer.parseInt(scan.nextLine());
		if (choice1 == 1)
		{
			System.out.println("What student's info would you like to view?");
			int studentIDNum = Integer.parseInt(scan.nextLine());
			//TODO make database call for studentInfo based on ID number given.
			if (studentIDNum < 0)
			{
				//throw new Exception("Number must be higher than 0.");
				System.out.println("THIS SHIT ISN'T WORKING");
			}
			else if (studentIDNum == 1)
			{
				System.out.println("Name: " + name);
				System.out.println("StudentID: " + StudentID);
				System.out.println("Fees: " + fees);
				System.out.println("PerformanceDetails: " + performanceDetails);
				System.out.println("Balance: " + balance);
			}
		}
		else if (choice1 == 2)
		{
			System.out.println("What student's info would you like to view?");
			int studentIDNum = Integer.parseInt(scan.nextLine());
			//TODO make database call for studentInfo based on ID number given.
			if (studentIDNum < 0)
			{
				system.out.println("THIS SHIT ISN'T WORKING");
			}
			else if (studentIDNum == 1)
			{
				System.out.println("What would you like to modify?");
				String choiceModify = scan.nextLine();
				switch (choiceModify)
				{
					case "name":
					{
						System.out.println("What name would you like to change to?");
						name = scan.nextLine();
						break;
					}
					case "studentid":
					{
						System.out.println("You cannot change this value.");
						break;
					}
					case "fees":
					{
						System.out.println("What is the new fees for the student?");
						fees = Integer.parseInt(scan.nextLine());
						break;
					}
					case "performancedetails":
					{
						System.out.println("What are the new performance details?");
						performanceDetails = scan.nextLine();
						break;
					}
					case "balance":
					{
						System.out.println("What is the new balance?");
						balance = Integer.parseInt(scan.nextLine());
						break;
					}
				}
			}
		}
	}

*/