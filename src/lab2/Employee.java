package lab2;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * In this lab focus on METHOD encapsulation and fix/add code as necessary.
 * Pay special attention to the following issues:
 *    1. Not all methods need to be public
 *    2. When methods need to be called in a certain order you can do this
 *       by creating a parent method that calls the other, helper methods.
 *    3. There is some duplicate code used that violates the D.R.Y. principle.
 *       Eliminate that by encapsulating the duplicate code in a new method
 *       and then call that method in place of the duplicate code
 *    4. All method parameters should be validated.
 * 
 * Review the tips in the document "EncapCheckList.pdf" if needed.
 *
 * @author      Jim Lombardo, WCTC Instructor
 * @version     1.02
 */
public class Employee {
    private String firstName;
    private String lastName;
    private String ssn;
    private boolean metWithHr;
    private boolean metDeptStaff;
    private boolean reviewedDeptPolicies;
    private boolean movedIn;
    private String cubeId;
    private Date orientationDate;

    public Employee(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }
    
    private void simpleDateFormatDate(String index) {
       if(index.length() == 0){
           throw new IllegalArgumentException("Need to add whom the employee met with");
       }
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
        String fmtDate = sdf.format(orientationDate);
        System.out.println(firstName + " " + lastName + index
            + fmtDate);
       
    }
    
    //This is my Parent method that calls the helper methods.
    public void newEmployeeProtocol() {
        meetWithHrForBenefitAndSalryInfo();
        meetDepartmentStaff();
        reviewDeptPolicies();
        moveIntoCubicle(cubeId);
    }

    // Assume this must be performed first, and assume that an employee
    // would only do this once, upon being hired.
    private void meetWithHrForBenefitAndSalryInfo() {
        metWithHr = true;
        simpleDateFormatDate(" met with Hr on ");        
        
    }

    // Assume this must be performed first, and assume that an employee
    // would only do this once, upon being hired.:
    private void meetDepartmentStaff() {
        metDeptStaff = true;
        simpleDateFormatDate(" met with Dept. Staff on ");
    }

    // Assume this must be performed third. And assume that because department
    // policies may change that this method may need to be called 
    // independently from other classes.
    public void reviewDeptPolicies() {
        reviewedDeptPolicies = true;
        simpleDateFormatDate(" reviewed Dept policies on ");
    }

    // Assume this must be performed 4th. And assume that because employees
    // sometimes change office locations that this method may need to be called 
    // independently from other classes.
    public void moveIntoCubicle(String cubeId) {
        if(cubeId.length() == 0){
            throw new IllegalArgumentException("Employee Needs a cube ID");
        }
        this.cubeId = cubeId;
        this.movedIn = true;
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
        String fmtDate = sdf.format(orientationDate);        
        System.out.println(firstName + " " + lastName + " moved into cubicle "
                + cubeId + " on " + fmtDate);
    }

    public String getFirstName() {
        return firstName;
    }

    // setter methods give the developer the power to control what data is
    // allowed through validation.
    
    public void setFirstName(String firstName) {
         if(firstName.length() == 0){
            throw new IllegalArgumentException("Employee Needs a first name");
        }
       this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
         if(lastName.length() == 0){
            throw new IllegalArgumentException("Employee Needs a last name");
        }
       this.lastName = lastName;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
         if(ssn.length() == 0){
            throw new IllegalArgumentException("Employee Needs a ssn");
        }
        this.ssn = ssn;
    }

    public boolean isMetWithHr() {
        return metWithHr;
    }

    // boolean parameters need no validation
    public void setMetWithHr(boolean metWithHr) {
         if(metWithHr != true || metWithHr != false){
            throw new IllegalArgumentException("metWithHR needs to be true or false");
        }
        this.metWithHr = metWithHr;
    }

    public boolean isMetDeptStaff() {
        return metDeptStaff;
    }

    public void setMetDeptStaff(boolean metDeptStaff) {
         if(metDeptStaff != true || metDeptStaff != false){
            throw new IllegalArgumentException("metDeptStaff needs to be true or false");
        }
        this.metDeptStaff = metDeptStaff;
    }

    public boolean isReviewedDeptPolicies() {
        return reviewedDeptPolicies;
    }

    public void setReviewedDeptPolicies(boolean reviewedDeptPolicies) {
         if(reviewedDeptPolicies != true || reviewedDeptPolicies != false){
            throw new IllegalArgumentException("reviewedDeptPolicies  needs to be true or false");
        }
        this.reviewedDeptPolicies = reviewedDeptPolicies;
    }

    public boolean isMovedIn() {
        return movedIn;
    }

    public void setMovedIn(boolean movedIn) {
         if(movedIn != true || movedIn != false){
            throw new IllegalArgumentException("reviewedDeptPolicies  needs to be true or false");
        }
        this.movedIn = movedIn;
    }

    public String getCubeId() {
        return cubeId;
    }

    
    public void setCubeId(String cubeId) {
        if(cubeId.length() == 0){
           throw new IllegalArgumentException("Need to enter cube ID");
       }
        this.cubeId = cubeId;
    }

    public Date getOrientationDate() {
        return orientationDate;
    }

    public void setOrientationDate(Date orientationDate) {
        if(orientationDate == null){
           throw new IllegalArgumentException("Need to enter orentation date");
       }
        this.orientationDate = orientationDate;
    }}
