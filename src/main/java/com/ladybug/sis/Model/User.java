package com.ladybug.sis.Model;

import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@Data
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

    public User(long userProfileID, String userName, String password, String email, String firstName, String lastName, String phone, String mobile, String gender, long companyID) {
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

    public User() {
    }
}

