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
    String abusername;
    String abuserage;
    String abuseridno;
    String abuserresidence;
    String abusergender;
    String abuseremail;
    String abuserstatus;

    //reporter variables
    String reportername;
    String reporterage;
    String reporteridno;
    String repoterresidence;
    String repotergender;
    String reporteremail;
    String reporterstatus;

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
        return abusername;
    }

    public String getAaage () {
        return abuserage;
    }

    public String getAaidno () {
        return abuseridno;
    }

    public String getAaresidence () {
        return abuserresidence;
    }

    public String getAagender () {
        return abusergender;
    }

    public String getAaemail () {
        return abuseremail;
    }

    public String getAastatus () {
        return abuserstatus;
    }

    public String getRrname () {
        return reportername;
    }

    public String getRrage () {
        return reporterage;
    }

    public String getRridno () {
        return reporteridno;
    }

    public String getRrresidence () {
        return repoterresidence;
    }

    public String getRrgender () {
        return repotergender;
    }

    public String getRremail () {
        return reporteremail;
    }

    public String getRrstatus () {
        return reporterstatus;
    }

    public forminfo ( String name, String age,  String residence,String idno, String email,String status,
                      String abuser_name, String abuser_age, String abuser_residence, String abuser_idno,String abuser_email, String abuser_status,
                      String reporter_name, String reporter_age,  String reporter_residence,String reporter_idno, String reporter_email, String reporter_status ) {
        this.name = name;
        this.age = age;
        this.idno = idno;
        this.residence = residence;
        this.gender = gender;
        this.email = email;
        this.status = status;
        this.abusername = abuser_name;
        this.abuserage = abuser_age;
        this.abuseridno = abuser_idno;
        this.abuserresidence = abuser_residence;

        this.abuseremail = abuser_email;
        this.abuserstatus = abuser_status;
        this.reportername = reporter_name;
        this.reporterage = reporter_age;
        this.reporteridno = reporter_idno;
        this.repoterresidence = reporter_residence;

        this.reporteremail = reporter_email;
        this.reporterstatus = reporter_status;
    }





}
