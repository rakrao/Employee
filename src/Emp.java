//This program creates employee details
public class Emp {
	private final int id = 101;
	private String name;
	private double monthlybasic; // Instance member
	double MonthlyGrossSalary;
	double MonthlyDeduction;
	double MonthlyTakeHome;
	static double pf;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) // getter and setter
	{
		this.name = name;
	}

	public double getAnnualBasic() {
		double annualBasics = monthlybasic * 12;
		return annualBasics;
	}

	public double getMonthlyBasic() {
		return monthlybasic;
	}

	public void setMonthlyBasic(double monthlyBasics) {
		this.monthlybasic = monthlyBasics;
	}

	public double getMonthlyGrossSalary() {
		double hra = monthlybasic * 0.5;
		double medical = 1250, conveyance = 800;
		MonthlyGrossSalary = monthlybasic + medical + conveyance + hra;
		return MonthlyGrossSalary;
	}

	public double getAnnualGrossSalary() {
		double AnnualGrossSalary = 12 * MonthlyGrossSalary;
		return AnnualGrossSalary;
	}

	double getMonthlyDeductions() {
		double pf, esic, profTax;

		if (monthlybasic > 6500) {
			pf = monthlybasic * 0.1;
		} else {
			pf = 6500;
		}
		if (monthlybasic <= 5000) {
			esic = monthlybasic * 0.475;
		} else {
			esic = 0;
		}
		if (monthlybasic <= 10000) {
			profTax = 50;
		} else {
			profTax = 100;
		}
		MonthlyDeduction = pf + esic + profTax;
		return MonthlyDeduction;
	}

	double getmonthlyTakeHome() {
		MonthlyTakeHome = MonthlyGrossSalary - MonthlyDeduction;
		return MonthlyTakeHome;
	}

	double getAnnualTakeHome() {
		double AnnualTakeHome = MonthlyTakeHome * 12;
		return AnnualTakeHome;
	}

	public static double getpf() {
		return pf;
	}

	public static void setpf(double pf) { // static method
		Emp.pf = pf;
	}

}
