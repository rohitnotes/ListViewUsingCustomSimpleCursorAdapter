package list.view.using.custom.simple.cursor.adapter;

public class CollageStudentDetailModel {

    private String firstName;
    private String lastName;
    private String branchName;
    private String rollNumber;
    private String grade;
    private String contactNumber;

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

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public CollageStudentDetailModel(String firstName, String lastName, String branchName, String rollNumber, String grade, String contactNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.branchName = branchName;
        this.rollNumber = rollNumber;
        this.grade = grade;
        this.contactNumber = contactNumber;
    }

    public String getStudentDetail(){
        return "FIRST NAME: "+getFirstName()+"\n" +
                "LAST NAME: "+getLastName()+"\n" +
                "BRANCH NAME: "+getBranchName()+"\n" +
                "ROLL NUMBER: "+getRollNumber()+"\n" +
                "GRADE: "+getGrade()+"\n" +
                "CONTACT NUMBER : "+getGrade();
    }
}