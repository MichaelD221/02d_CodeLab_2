package com.cc.java;

public class Mitarbeiter {
    
    private String familyName;
    private String firstName;
    private String role;
    private int yearOfEntry;


    public Mitarbeiter(String familyName, String firstName, String role, int yearOfEntry) {
        this.familyName = familyName;
        this.firstName = firstName;
        this.role = role;
        this.yearOfEntry = yearOfEntry;
    }
    

    public String getInfo(String profil) {
        // == vergleicht Referenzen, ob zwei Variablen auf dasselbe Objekt zeigen
        // .equals() vergleicht Inhalte 
        if (profil.equals("familyName")) {
            return familyName;
        }
        else if (profil.equals("firstName")) {
            return firstName;
        } 
        else if (profil.equals("role")) {
            return role;
        }
        else if (profil.equals("yearOfEntry")) {
            return Integer.toString(yearOfEntry);
        }         
        else {
            return "Something went wrong";
        }
    }
}


