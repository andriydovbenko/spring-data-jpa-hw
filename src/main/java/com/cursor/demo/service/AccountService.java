package com.cursor.demo.service;

import com.cursor.demo.entity.Account;

public interface AccountService extends CrudService<Account, Integer> {

    void deleteById(int id);
}