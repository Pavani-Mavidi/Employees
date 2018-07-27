

public class Employee {

	private String name;
	private String email;
	private int employeeId;
	private String phone;
	
	public Employee(String name, String email, int employeeId, String phone) {
		super();
		this.name = name;
		this.email = email;
		this.employeeId = employeeId;
		this.phone = phone;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}