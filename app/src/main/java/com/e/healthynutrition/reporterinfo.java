package com.e.healthynutrition;

public class reporterinfo {
    String name;
    String age;
    String idno;
    String residence;
    String gender;
    String email;
    String status;

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

    public reporterinfo ( String pname, String pstatus, String page, String pemail, String presidence, String pidno ) {
        this.name = pname;
        this.age = page;
        this.idno = pidno;
        this.residence = presidence;
        this.gender = pidno;
        this.email = pemail;
        this.status = pstatus;
    }
}
