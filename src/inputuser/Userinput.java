package inputuser;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Userinput {

	public static void main(String[] args) {
		 String choice="";
		 String userInputContent="";
		 
		 
		 User user = new User();
			
	        while(true){
	            System.out.println("*******************");
	            System.out.println("Enter option .");
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
		        	          		  
		        	  String userEmailId= user.getEmailid();
		        	  //System.out.println(userEmailId);
	                 if(userEmailId==null){
	                	 
	      	          System.out.println("Set Email Id");
	      	          
                     }else {
                    	
                     
	                  System.out.println(user.getEmailid());
                    	
		        	  int num = userEmailId.indexOf("@");
	                  String firstPart = (user.getEmailid()).substring(0,num);
	                  user.setUsername(firstPart);
	                 
	                 try {
	                	 FileWriter fileWriter = new FileWriter("d:/userinput.txt");
						 fileWriter.write(user.getFirstName()+"\r\n"+user.getLastName()+"\r\n"+user.getEmailid()+"\r\n"+user.getUsername());
						 
						 fileWriter.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	                 System.out.println("Username: "+user.getUsername());
	                 System.out.println("First name: "+user.getFirstName());
	                 System.out.println("Last Name: "+user.getLastName());
	                 System.out.println("EmailId: "+user.getEmailid());
	                 System.out.println("Successful user name");
	                  
	                 System.exit(1);
	                  
                    
		          }
		          default:
		          break; 
                   
                    	
	            }
	            

	        } 
	     
	       
	}
	
}
