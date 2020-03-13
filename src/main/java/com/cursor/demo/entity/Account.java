package com.cursor.demo.entity;

import lombok.*;

import javax.persistence.*;

import java.io.Serializable;

@SuppressWarnings("SyntaxError")
@Data
@NoArgsConstructor
@Entity(name = "Account")
@Table(name = "accounts",schema = "public")
public class Account implements Serializable {
    @Id
    @Column(name = "id",updatable = false, nullable = false)
    private int accountId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private String city;

    private String gender;

    @Column(name = "user_name")
    private String userName;

    @Getter(AccessLevel.NONE)
    @OneToOne
    @JoinTable(name = "account_profile",
            joinColumns = @JoinColumn(name = "account_id"),
            inverseJoinColumns = @JoinColumn(name = "profile_id"))
    private Account account;

    public Account(int accountId, String userName, String firstName, String lastName, String city, String gender) {
        this.accountId = accountId;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.gender = gender;
    }
}