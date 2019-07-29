package com.ladybug.sis.Model;

import javax.persistence.*;

@Entity
@Table(name = "tblUser")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long userID;

    @Column(name = "userProfileID", nullable = false)
    public long userProfileID;
    @Column(name = "userName", nullable = false, length = 50)
    public String userName;
    @Column(name = "password", nullable = false, length = 50)
    public String password;
    @Column(name = "email", nullable = false, length = 50)
    public String email;
    @Column(name = "firstName", nullable = false, length = 50)
    public String firstName;
    @Column(name = "lastName", nullable = false, length = 50)
    public String lastName;
    @Column(name = "phone", length = 50)
    public String phone;
    @Column(name = "mobile", length = 50)
    public String mobile;
    @Column(name = "gender", length = 50)
    public String gender;
    @Column(name = "companyID")
    public long companyID;

    public User() {
    }

    public User(int userID, int userProfileID, String userName, String password, String email, String firstName, String lastName, String phone, String mobile, String gender, int companyID) {
        this.userID = userID;
        this.userProfileID = userProfileID;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.mobile = mobile;
        this.gender = gender;
        this.companyID = companyID;
    }


    public long getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public long getUserProfileID() {
        return userProfileID;
    }

    public void setUserProfileID(int userProfileID) {
        this.userProfileID = userProfileID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getCompanyID() {
        return companyID;
    }

    public void setCompanyID(int companyID) {
        this.companyID = companyID;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", userProfileID=" + userProfileID +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", mobile='" + mobile + '\'' +
                ", gender='" + gender + '\'' +
                ", companyID=" + companyID +
                '}';
    }
}
