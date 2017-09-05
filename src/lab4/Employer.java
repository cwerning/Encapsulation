/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import lab4.HumanResources;

/**
 *
 * @author Chad Werning
 */
public class Employer {
    private HumanResources hr = new HumanResources();
    
 
    
    public void hireEmployee(String firstName, String lastName, String ssn) {
        hr.hireEmployee(firstName, lastName, ssn);
      
    }

    public HumanResources getHr() {
        return hr;
    }

    public void setHr(HumanResources hr) {
        this.hr = hr;
    }
        public static void main(String[] args) {
        HumanResources hr = new HumanResources();
        hr.hireEmployee("Chad", "Werning", "444-44-4444");
        hr.hireEmployee("Jim", "Mallas", "555-55-5555");
        //System.out.println(hr.getEmployees());
        for(Employee emp : hr.getEmployees()) {
            System.out.println(emp.toString());
        }

    }
    
}
