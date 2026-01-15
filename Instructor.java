
public class Instructor extends Person {
	 private String department;
	/* Constructor for Instructor class
	 * @Paramater String firstName, String middleName, String lastName, String email, String ssn, int age, String department
	 */
	    public Instructor(String firstName, String middleName, String lastName, String email, String ssn, int age, String department) {
	        super(firstName, middleName, lastName, email, ssn, age);
	        this.department = department;
	    }
	 /* Getter for department
	  * @Return department
	  */
	    public String getDepartment() {
	        return department;
	    }
	 /* Setter for department
	  *  @Paramater String department
	  */
	    public void setDepartment(String department) {
	        this.department = department;
	    }
}
