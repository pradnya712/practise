package inputuser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Userinput {

	public static void main(String[] args) {
		 String choice="";
		 User user = new User();
	        while(true){
	            System.out.println("*******************");
	            System.out.println("Enter option No.");
	            System.out.println("F.firstName");
	            System.out.println("L.lastNmae");  
	            System.out.println("E.emailId");
	            //System.out.println("U.userNmae"); 
	            System.out.println("Q. Exit");
	            System.out.println("*******************");
	            try {
	                choice = new BufferedReader(new InputStreamReader(System.in)).readLine();
	            } catch (Exception e) {
	                System.out.println(e);
	            }
	            switch (choice.toUpperCase()) {
                
		          case "F":
	                    System.out.println("User Entry/Update");
	                    System.out.println("Enter FirstName: ");
	                    try {
	                    	String fname= new BufferedReader(new InputStreamReader(System.in)).readLine();
	                    	user.setFirstName(fname);
	                    } catch (IOException e) {
	                        System.out.println(e);
	                    }
	                     break;
	                     
		          case "L":
		        	  System.out.println("Enter LastNmae: ");
		        	  try {
		        		  user.setLastName(new BufferedReader(new InputStreamReader(System.in)).readLine());
		        		  }
		        	  catch (IOException e) {
	                      System.out.println(e);
	                  }
	                   break;
	                   
		          case "E":
		        	  System.out.println("Enter Email Id: ");
		        	  try {
		        		  user.setEmailid(new BufferedReader(new InputStreamReader(System.in)).readLine());
		        		  }
		        	  catch (Exception e) {
	                      System.out.println(e);
	                  }
	                   break;
	                   	
		          case "Q":
	                  System.out.println("Q.Exit");
	                  System.out.println(user.getUsername());
	                  System.out.println(user.getFirstName());
	                  System.out.println(user.getLastName());
	                  System.out.println(user.getEmailid());
	             
	                  
	                  System.exit(1);
	              default:
	                  break;    
	        	  
	        	  
	            }
	            

	        } 
	        //System.out.println(user.getEmailid());
	        //int num=user.getEmailid().indexOf("@");
        	//String firstpart=user.getEmailid().substring(0,num);
        	//user.setUsername(firstpart);
	}	
}