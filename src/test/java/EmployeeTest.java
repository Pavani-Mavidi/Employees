public class EmployeeTest {

	public static void main(String args[])
	{
		Employee emp=new Employee("Pavani","mavidipavani@gmail.com",635606,"8096683736");
		System.out.println("Name : " + emp.getName());
		System.out.println("Email : " + emp.getEmail());
		System.out.println("Phone : " + emp.getPhone());
		System.out.println("Employee ID : " + emp.getEmployeeId());
	}
}
