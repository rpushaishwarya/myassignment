package week1.day2;
public class EmployeeDetails {
	public void EmployeeName(String empName, int empId){
		String a=empName;
		int b=empId;
		System.out.printf(a,b);
		
	}
	public void EmployeeAddress(String empAddress) {
		String a=empAddress;
		System.out.println(a);
	}
	public void EmployeeSalary(double empSalary) {
		double a=empSalary;
		System.out.println(a);
	}
	public void EmployeeMobileNumber(long mobNum) {
		long a=mobNum;
		System.out.println(a);
		
	}
public static void main(String[] args) {
	EmployeeDetails emp=new EmployeeDetails();
	emp.EmployeeName("usha", 1308);
	emp.EmployeeAddress("no.13 krishnan street,vellore");
	emp.EmployeeSalary(70000.500);
	emp.EmployeeMobileNumber(90876543L);
	
	
}


}
