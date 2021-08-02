package com.e.healthynutrition;

public class forminfo {
    //client variable
    String name;
    String age;
    String idno;
    String residence;
    String gender;
    String email;
    String status;

    //abuser info
    String aaname;
    String aaage;
    String aaidno;
    String aaresidence;
    String aagender;
    String aaemail;
    String aastatus;

    //reporter variables
    String rrname;
    String rrage;
    String rridno;
    String rrresidence;
    String rrgender;
    String rremail;
    String rrstatus;

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

    public String getAaname () {
        return aaname;
    }

    public String getAaage () {
        return aaage;
    }

    public String getAaidno () {
        return aaidno;
    }

    public String getAaresidence () {
        return aaresidence;
    }

    public String getAagender () {
        return aagender;
    }

    public String getAaemail () {
        return aaemail;
    }

    public String getAastatus () {
        return aastatus;
    }

    public String getRrname () {
        return rrname;
    }

    public String getRrage () {
        return rrage;
    }

    public String getRridno () {
        return rridno;
    }

    public String getRrresidence () {
        return rrresidence;
    }

    public String getRrgender () {
        return rrgender;
    }

    public String getRremail () {
        return rremail;
    }

    public String getRrstatus () {
        return rrstatus;
    }

    public forminfo ( String name, String age,  String residence,String idno, String email,String status,
                      String aaname, String aaage, String aaresidence, String aaidno,String aaemail, String aastatus,
                      String rrname, String rrage,  String rrresidence,String rridno, String rremail, String rrstatus ) {
        this.name = name;
        this.age = age;
        this.idno = idno;
        this.residence = residence;
        this.gender = gender;
        this.email = email;
        this.status = status;
        this.aaname = aaname;
        this.aaage = aaage;
        this.aaidno = aaidno;
        this.aaresidence = aaresidence;
        this.aagender = aagender;
        this.aaemail = aaemail;
        this.aastatus = aastatus;
        this.rrname = rrname;
        this.rrage = rrage;
        this.rridno = rridno;
        this.rrresidence = rrresidence;
        this.rrgender = rrgender;
        this.rremail = rremail;
        this.rrstatus = rrstatus;
    }





}
