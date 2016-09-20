package thread.singleton;

/*
 * This is normal employee DTO class
 */
public class Employee {

	/*
	 * employeeName
	 */

	private String employeeName;
	
	/*
	 * empCode
	 */
	private Long empCode;
	
	/*
	 * department
	 */
	private String department;
	
	public Employee(){
		
	}
	

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Long getEmpCode() {
		return empCode;
	}

	public void setEmpCode(Long empCode) {
		this.empCode = empCode;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}
