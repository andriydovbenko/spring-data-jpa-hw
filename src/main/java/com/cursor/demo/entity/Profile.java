package com.cursor.demo.entity;

import lombok.*;

import javax.persistence.*;

@SuppressWarnings("SyntaxError")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Profile")
@Table(name = "profiles", schema = "public")
public class Profile {
    @Id
    private int id;

    @Column(name = "username")
    private String userName;

    @Column(name = "job_title")
    private String jobTitle;

    private String department;

    private String company;

    private String skill;

    @Getter(AccessLevel.NONE)
    @OneToOne
    @JoinTable(name = "account_profile",
            joinColumns = @JoinColumn(name = "account_id"),
            inverseJoinColumns = @JoinColumn(name = "profile_id"))
    private Profile profile;

    public Profile(int id, String userName, String jobTitle, String department, String company, String skill) {
        this.id = id;
        this.userName = userName;
        this.jobTitle = jobTitle;
        this.department = department;
        this.company = company;
        this.skill = skill;
    }
}