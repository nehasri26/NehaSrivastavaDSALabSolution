package model;

public class Employee{
	private String firstName;
	private String lastName;
	private String department;
	
	//Constructor
	public Employee(String firstName,String lastName,String department){
		this.firstName =firstName;
		this.lastName=lastName;
		this.department=department;
	}
	
	//Getter and Setter methods
	public String getFirstName(){
		return this.firstName;
	}
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
		
	public String getLastName(){
		return this.lastName;
	}
	
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	
		
	public String getDepartmentName(){
		return this.department;
	}
	
	public void setDepartmentName(String department){
		this.department = department;
	}
}
