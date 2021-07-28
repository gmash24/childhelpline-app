package com.e.healthynutrition;

public class clientinfo {
    String name;
    String age;
    String idno;
    String residence;
    String gender;
    String email;

    public String getName () {
        return name;
    }

    public String getAge () {
        return age;
    }

    public String getIdno () {
        return idno;
    }

    public String getResidence () {
        return residence;
    }

    public String getGender () {
        return gender;
    }

    public String getEmail () {
        return email;
    }

    public String getStatus () {
        return status;
    }

    String status;

    public clientinfo ( String name, String age, String idno, String residence, String gender, String email, String status ) {
        this.name = name;
        this.age = age;
        this.idno = idno;
        this.residence = residence;
        this.gender = gender;
        this.email = email;
        this.status = status;
    }


}
