package Loginandsignup;

import java.util.Scanner;

public class Ui {
	
	static Scanner sc = new Scanner(System.in);
	static SignUp sign = new SignUp();
	static Login login= new Login();
	static boolean b= false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		do {
			
			
			
			System.out.println("\t\tWelcome to my programming word\n");
			
		System.out.println("1.SignUp\n2.Login\n3.Forgot Passwor\n4.Exit");
	System.out.println("Enter your Selection Number");
	int user_ui_select = sc.nextInt();
	b=true;
	
	switch (user_ui_select) {
	
	case 1 : {
	
		
		sign.Signup_user();
		
		
		
		
		break;}
	case 2 : {
		
		login.User_Login();
		
		break;}
	case 3 : {break;}
	case 4 : {
		
		b=false;
		
		break;}
	

	default:
		break;
	}
		
			
			
			
			
			
			
			
			
			
			
			
			
		}while(b);
		System.out.println("\t\tThank you");
		

	}

}
