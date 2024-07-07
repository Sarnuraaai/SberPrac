package oop.book;

import java.awt.*;

public class Author {
    private String name;
    private String gender;
    private String email;

    public Author(String name, String gender, String email) {
        this.name = name;
        this.gender = gender;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setName(String gender) {
        this.name = gender;
    }

    @Override
    public String toString() {
        System.out.println("Author's name: " + this.name + ", gender: " + this.gender + ", email: " + this.email);
        return "";
    }
}
