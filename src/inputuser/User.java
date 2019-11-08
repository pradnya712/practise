package inputuser;

public class User {

	    private String firstName;
	    private String lastName;
	    private  String emailid;
	    private String username;
	    
	    public User( String firstName, String lastName,String emailid,String username ) 
	    {
	    	this.firstName = firstName;
	        this.lastName = lastName;
	        this.emailid = emailid;
	        this.username = username;
	    }

		public User() {
			super();
			
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public  String getEmailid() {
			return emailid;
		}

		public void setEmailid(String emailid) {
			this.emailid = emailid;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}
	    
}
