import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Predicate;

//class java doc
public class Person {
	// The last used ID
	 private static long lastId = 916421998;
	 private static int oldestAge = 0;
	 private static int youngestAge = 100;
	 	// The instance variables
	    private long id;
	    private String firstName;
	    private String middleName;
	    private String lastName;
	    private String email;
	    private String ssn;
	    private int age;
	    
	    /* Constructor for Person class
	     * @Paramater String firstName, String middleName, String lastName, String email, String ssn, int age
	     * 
	     */
	    public Person(String firstName, String middleName, String lastName, String email, String ssn, int age) {
	        this.id = ++lastId;
	        this.firstName = firstName;
	        this.middleName = middleName;
	        this.lastName = lastName;
	        this.email = email;
	        this.ssn = ssn;
	        this.age = age;
	        if (oldestAge < age){
	        	oldestAge = age;
	        }
	        
	        if (youngestAge > age){
	        	youngestAge = age;
	        }
	    }
	    /* Getter for ID
	     * @Return id
	    */ 
	    public long getId() {
	        return id;
	    }
	   /*Getter for firstName
	    * @Return firstname
	    */
	    public String getFirstName() {
	        return firstName;
	    }
	 /* Setter for firstname
	  *@Paramater String firstname
	  * 
	  */
	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }
	 /* Getter for middleName
      *  @Return middleName
      */
	    public String getMiddleName() {
	        return middleName;
	    }
	 /* Setter for middleName
	 * @Paramater String middleName
	 */
	    public void setMiddleName(String middleName) {
	        this.middleName = middleName;
	    }
	 /* Getter for lastName
	  * @Return lastName
	  */
	    public String getLastName() {
	        return lastName;
	    }
	 /* Setter for lastName 
	 * @Paramater String lastName
	 */
	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }
	 /* Getter for email
	 * @Return email
	 */
	    public String getEmail() {
	        return email;
	    }
	 /* Setter for email
	 *  @Paramater String email
	 */
	    public void setEmail(String email) {
	        this.email = email;
	    }
	 /* Getter for ssn
	  * @Return ssn
	  */
	    public String getSsn() {
	        return ssn;
	    }
	 /* Setter for ssn
	  * @Paramater String ssn
	  */
	    public void setSsn(String ssn) {
	        this.ssn = ssn;
	    }
	    /* Getter for age 
	     * @Return age
	     */
	    public int getAge() {
	        return age;
	    }
	 /* Setter for age
	  * @Paramater Int age
	  */
	    public void setAge(int age) {
	        this.age = age;
	    }
	/* toString() Method to create full names should there be no middle name
	 * 
	 */
	    @Override
	    public String toString() {
	        if (middleName == null || middleName.isEmpty()) {
	            return firstName + " " + lastName;
	        } else {
	            return firstName + " " + middleName + " " + lastName;
	        }
	    }
	/* Returns the domain of the email
	 * @Return email.substring(atIndex + 1)
	 */
	    public String getEmailDomain() {
	        int atIndex = email.indexOf('@');
	        return email.substring(atIndex + 1);
	    }
	/* Returns the last 4 digits of ssn 
	 * @Return ssn.substring(ssn.length() - 4)    
	 */
	    public String getLast4SSN() {
	        return ssn.substring(ssn.length() - 4);
	    }
	 /* validates age
	  * @Return age > 16
	  */
	    public static boolean validateAge(int age) {
	        return age > 16;
	    }
	 /* validates email
	  *  @Return true
	  */
	    public static boolean validateEmail(String email) {
	        return true;
	    }
	 /* validates ssn 
	  * @Return true
	  */
	    public static boolean validateSSN(String ssn) {
	        return true;
	    }

	    /* Creating the Static Hash Map
	     * 
	     */
	    public static Map<String, Predicate<Person>> evaluators = new HashMap<>();

	    static {
	        evaluators.put("oldest", person -> person.getAge() == oldestAge);
	        evaluators.put("youngest", person -> person.getAge() == youngestAge);
	    }
}
    
   
