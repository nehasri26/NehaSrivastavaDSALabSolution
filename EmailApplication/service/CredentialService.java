package service;
import model.*;
import java.util.Random;

public class CredentialService{

    //Method takes employee info as inputs and generates email
    public String generateEmail(Employee emp){
        return emp.getFirstName()+emp.getLastName()+"@"+emp.getDepartmentName()+".company.com";
    }

    //Generate password
    public String generatePassword() {
        Random random = new Random();
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*_=+-/.?<>)";

		String allowedChars = capitalLetters + smallLetters + numbers + specialCharacters;
		
        char[] password = new char[8];

        for(int i=0; i<8;i++){
            int index = random.nextInt(allowedChars.length());
            password[i] =  allowedChars.charAt(index);
        }

		return new String(password);	

    }

    //Generate and present credentials
    public void showCredential(Employee emp){
        System.out.println();
        System.out.println("*********************************");
        System.out.println("Hi "+emp.getFirstName()+" "+emp.getLastName());
        System.out.println("Here are your credentials");
        System.out.println("Email Address: "+generateEmail(emp));
        System.out.println("Password: "+generatePassword());
        System.out.println("*********************************");
        System.out.println();

    }
}