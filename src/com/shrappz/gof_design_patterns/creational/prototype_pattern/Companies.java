package com.shrappz.gof_design_patterns.creational.prototype_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shangeeth on 31/07/18.
 */
public class Companies implements Cloneable{

    private List<String> mCompanieNames;


    public Companies(){
        mCompanieNames = new ArrayList<>();
    }


    private Companies(List<String> pCompanies){
        mCompanieNames = pCompanies;
    }


    public void loadData(){
        // Consider that you are reading data from database and adding to the list in this part
        mCompanieNames.add("Full Creative");
        mCompanieNames.add("HCL");
        mCompanieNames.add("TCS");
        mCompanieNames.add("Google");
        mCompanieNames.add("Wipro");
        mCompanieNames.add("Amazon");
    }

    public List<String> getCompanies(){
        return mCompanieNames;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        List<String> companienames = new ArrayList<>();
        for (String lCompanyName :
                mCompanieNames) {
            companienames.add(lCompanyName);
        }
        return new Companies(companienames);
    }
}
