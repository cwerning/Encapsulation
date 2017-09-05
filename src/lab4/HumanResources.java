/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Chad Werning
 */
public class HumanResources {

    private List<lab4.Employee> employees;

    public HumanResources() {
        employees = new ArrayList();
    }

    public void hireEmployee(String firstName, String lastName, String ssn) {
        lab4.Employee e = new lab4.Employee(firstName, lastName, ssn);
        employees.add(e);
        orientEmployee(e);
    }

    public void orientEmployee(Employee e) {
        e.doFirstTimeOrientation("Cube101");
    }
    
    

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public static void main(String[] args) {
        HumanResources hr = new HumanResources();
        hr.hireEmployee("Chad", "Werning", "444-44-4444");
        hr.hireEmployee("Jim", "Smith", "555-55-5555");
        //System.out.println(hr.getEmployees());
        for(Employee emp : hr.getEmployees()) {
            System.out.println(emp.toString());
        }

    }
    
    
}
