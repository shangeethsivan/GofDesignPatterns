package com.shrappz.gof_design_patterns.creational.prototype_pattern;

import java.util.ArrayList;

/**
 * Created by Shangeeth on 31/07/18.
 */
public class PrototypePatternTester {

    public static void main(String[] args) throws CloneNotSupportedException {

        Companies lCompanies = new Companies();
        lCompanies.loadData();

        Companies lCompanies1 = (Companies) lCompanies.clone();
        Companies lCompanies2 = (Companies) lCompanies.clone();

        lCompanies.getCompanies().add(0,"New Company");
        lCompanies1.getCompanies().remove("Full Creative");

        System.out.println("Data in Original Companies Object: "+lCompanies.getCompanies());
        System.out.println("Data in Clone 1 Companies Object: "+lCompanies1.getCompanies());
        System.out.println("Data in Clone 2 Companies Object: "+lCompanies2.getCompanies());

//      If the object cloning was not provided,
//      we will have to make database call to fetch the employee list every time.



    }

}
