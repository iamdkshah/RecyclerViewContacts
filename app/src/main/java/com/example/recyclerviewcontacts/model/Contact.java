package com.example.recyclerviewcontacts.model;

public class Contact {
    private String name;
    private String mobileNumber;
    private int img;

    public Contact(String name, String mobileNumber, int img) {
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
