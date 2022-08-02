package com.example.sqlite.Models;

public class PayInForm {
    public String ID;
    public String name;
    public PayInForm() {
    }
    public PayInForm(String ID,String name) {
        this.ID = ID;
        this.name = name;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
}
