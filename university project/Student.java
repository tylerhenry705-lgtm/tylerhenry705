
public class Student extends Person {
	private String major;
	/* Constructor for Student class
	 * @Paramater String firstName, String middleName, String lastName, String email, String ssn, int age, String major
	 */
    public Student(String firstName, String middleName, String lastName, String email, String ssn, int age, String major) {
        super(firstName, middleName, lastName, email, ssn, age);
        this.major = major;
    }
    /* Getter for major
     * @Return major
     */
    public String getMajor() {
        return major;
    }
    /* Setter for major
     *  @Paramater String major
     */
    public void setMajor(String major) {
        this.major = major;
    }
}
