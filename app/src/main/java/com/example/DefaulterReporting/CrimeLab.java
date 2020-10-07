package com.example.DefaulterReporting;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CrimeLab {
    // singleton class
    private static CrimeLab sCrimeLab;

    // list of crimes in crimeLab
    private List<Crime> mCrimes;

    // add a new crime
    public void addCrime(Crime c){
        mCrimes.add(c);
    }

    // private constructor
    private CrimeLab(Context context) {
        mCrimes = new ArrayList<>();
    }

    // method to return a new or existing instance
    public static CrimeLab get(Context context){
        if(sCrimeLab == null){
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }

    //return the list
    public List<Crime> getCrimes(){
        return mCrimes;
    }

    // return the crime with the given id
    public Crime getCrime(UUID id){
        for(Crime crime: mCrimes){
            if(crime.getId().equals(id)){
                return crime;
            }
        }
        return null;
    }
}
