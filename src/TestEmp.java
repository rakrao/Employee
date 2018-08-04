import java.util.Scanner;

public class TestEmp {

	public static void main(String[] args) { // main method

		Emp Ram = new Emp();
		Emp Shyam = new Emp();
		Emp Sam = new Emp();

		String Name;
		double MonthlyBasics;

		Scanner scanner = new Scanner(System.in); // accepting input

		System.out.println("Enter 1st employee name");
		Name = scanner.nextLine();
		Ram.setName(Name);

		System.out.println("Enter 1st employee Monthly basics");
		MonthlyBasics = scanner.nextDouble();
		Ram.setMonthlyBasic(MonthlyBasics);

		System.out.println("The Salary details of 1st Employee");
		System.out.println("Employee ID:" + Ram.getId());
		System.out.println("Employee Name:" + Ram.getName());
		System.out.println("Monthly basics:" + Ram.getMonthlyBasic());
		System.out.println("Annual basic:" + Ram.getAnnualBasic());
		System.out.println("Monthly Gross:" + Ram.getMonthlyGrossSalary()); // printing values

		System.out.println("AnnualGross=" + Ram.getAnnualGrossSalary());
		System.out.println("Monthly Deduction=" + Ram.getMonthlyDeductions());
		System.out.println("Monthly take home=" + Ram.getmonthlyTakeHome());
		System.out.println("Monthly take home=" + Ram.getmonthlyTakeHome());
	}
}
