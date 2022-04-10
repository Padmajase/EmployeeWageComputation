import java.util.Random;

class UC6 {

	static int wagePerHr = 20; 
	static int fullTimeHr = 8;
	static int partTimeHr = 8;
	static int dayPerMonth = 20;
	static int HrPerMonth = 20;
	static int workingHr = 0 ;

	public static void main(String args[]) {

	System.out.println("Welcome !");

	Random rand = new Random();
	int isEmployee = rand.nextInt(3);	
	System.out.println(isEmployee);
	
	while( workingHr != 100 ) {
	switch (isEmployee) {
	case 1 :
	{
		System.out.println("Employee is full time Present");
		int wage1 = (wagePerHr * fullTimeHr );
		System.out.println("Daily full time Employee Wage = " + wage1);
		workingHr = (wage1/wagePerHr);
		
	}
	break;
	case 2 :
	{
		System.out.println("Employee is part time Present");
		int wage2 = (wagePerHr * partTimeHr );
		System.out.println("Daily part time Employee Wage = " + wage2);
		workingHr = (wage2/wagePerHr);
	}	
	break;
	case 0 :
	{
		System.out.println("Employee is Absent");
		System.out.println("Daily Employee Wage = 0 " );
	}
	break;
	default :
		System.out.println("Invalid");
	break;

	}
	}
	}
}
