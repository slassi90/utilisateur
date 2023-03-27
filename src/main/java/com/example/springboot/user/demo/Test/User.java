package com.example.springboot.user.demo.Test;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.Data;

import java.util.Objects;


@Entity
public class User {

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(firstname, user.firstname) && Objects.equals(lastname, user.lastname) && Objects.equals(birthDate, user.birthDate) && Objects.equals(city, user.city) && Objects.equals(country, user.country) && Objects.equals(avatar, user.avatar) && Objects.equals(company, user.company) && Objects.equals(jobposition, user.jobposition) && Objects.equals(mobile, user.mobile) && Objects.equals(username, user.username) && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, birthDate, city, country, avatar, company, jobposition, mobile, username, email);
    }

    @Override
    public String toString() {
        return "User{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", avatar='" + avatar + '\'' +
                ", company='" + company + '\'' +
                ", jobposition='" + jobposition + '\'' +
                ", mobile='" + mobile + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setJobposition(String jobposition) {
        this.jobposition = jobposition;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastname() {
        return lastname;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getAvatar() {
        return avatar;
    }

    public String getCompany() {
        return company;
    }

    public String getJobposition() {
        return jobposition;
    }

    public String getMobile() {
        return mobile;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    private String firstname;
    private String lastname;
    private String birthDate;

    private String city;
    private String country;
    private String avatar;
    private String company;
    private String jobposition;
    private String mobile;
    private String username;
    private String email;

}
