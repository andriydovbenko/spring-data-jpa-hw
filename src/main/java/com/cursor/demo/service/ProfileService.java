package com.cursor.demo.service;

import com.cursor.demo.entity.Profile;

public interface ProfileService extends CrudService<Profile, Integer> {

    void deleteById(int id);
}