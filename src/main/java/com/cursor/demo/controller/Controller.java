package com.cursor.demo.controller;

import com.cursor.demo.entity.Account;
import com.cursor.demo.entity.Profile;
import com.cursor.demo.service.AccountService;
import com.cursor.demo.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class Controller {
    private final static int ID = 500;
    private final AccountService accountService;
    private final ProfileService profileService;
    private Account account;
    private Profile profile;

    @Autowired
    public Controller(AccountService accountService, ProfileService profileService) {
        this.accountService = accountService;
        this.profileService = profileService;
    }

    @Transactional
    public void executeSequenceOfCrudOperation() {
        printAccountAndProfile();
        saveAccountAndProfile();
        printAllAccountsAndProfiles();
        removeAccountAndProfile();
    }

    private void saveAccountAndProfile() {
        createAccountAndProfile();
        accountService.save(account);
        profileService.save(profile);
    }

    private void printAccountAndProfile() {
        System.err.println(accountService.getById(ID) + "\n" + profileService.getById(ID));
    }

    private void printAllAccountsAndProfiles() {
        printAllAccounts();
        printAllProfiles();
    }

    private void printAllProfiles() {
        System.out.println("All profiles:");
        profileService.findAll().forEach(System.out::println);
    }

    private void printAllAccounts() {
        System.out.println("All accounts:");
        accountService.findAll().forEach(System.out::println);
    }

    private void createAccountAndProfile() {
        this.account = new Account(1001, "petro", "Petro",
                "Kim", "Kiev", "male");
        this.profile = new Profile(1001, "petro", "Technician",
                "Engineering", "Centimia", "ZoomInfo");
    }

    private void removeAccountAndProfile() {
        accountService.deleteById(account.getAccountId());
        profileService.deleteById(profile.getId());
    }
}