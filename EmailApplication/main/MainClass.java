package main;
import java.util.Scanner; 
import model.*;
import service.*;

public class MainClass{
	
	public static void main(String[] args){
		
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		
		//Take user input
		System.out.print("Enter first name : ");
		String firstName = myObj.nextLine();
		
		System.out.print("Enter last name : ");
		String lastName = myObj.nextLine();
		
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human");
		System.out.println("4. Legal");
		System.out.print("Select the department from above options : ");
		String option = myObj.next();
		
		String departmentName = "";
		switch(option){
					case "1": departmentName = "technical";
					break;
					
					case "2": departmentName = "admin";
					break;
					
					case "3": departmentName = "human";
					break;
					
					case "4": departmentName = "legal";
					break;
					
					default: System.out.println("Invalid department input, selecting default department");
							 departmentName = "technical";	
							
		}

		//Generate and show credentials
		Employee emp = new Employee(firstName,lastName,departmentName);
		CredentialService service = new CredentialService();
		service.showCredential(emp);		

	}
}