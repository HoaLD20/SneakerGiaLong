package com.sneaker.snakergialong.Model.Entities;

public class User {
    public User() {
    }

    private int uId; //Stores id of user
    private String uName;   //Stores name of user
    private String uEmail; //Stores email of user
    private String uJob;    //Stores job of user
    private String uPassword; //Stores password of user
    private String uRole; //Stores role of user
    private String uPhoto; //Stores photo of user
    private String uAddress; //Stores address of user

    // private String uCreditCard; //Stores credit card of user
    //private double uCash; //Stores cash of user
    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuEmail() {
        return uEmail;
    }

    public void setuEmail(String uEmail) {
        this.uEmail = uEmail;
    }

    public String getuJob() {
        return uJob;
    }

    public void setuJob(String uJob) {
        this.uJob = uJob;
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
    }

    public String getuRole() {
        return uRole;
    }

    public void setuRole(String uRole) {
        this.uRole = uRole;
    }

    public String getuPhoto() {
        return uPhoto;
    }

    public void setuPhoto(String uPhoto) {
        this.uPhoto = uPhoto;
    }

    public String getuAddress() {
        return uAddress;
    }

    public void setuAddress(String uAddress) {
        this.uAddress = uAddress;
    }


    public User(int uId, String uName, String uEmail, String uJob, String uPassword, String uRole, String uPhoto, String uAddress) {
        this.uId = uId;
        this.uName = uName;
        this.uEmail = uEmail;
        this.uJob = uJob;
        this.uPassword = uPassword;
        this.uRole = uRole;
        this.uPhoto = uPhoto;
        this.uAddress = uAddress;
    }
}
