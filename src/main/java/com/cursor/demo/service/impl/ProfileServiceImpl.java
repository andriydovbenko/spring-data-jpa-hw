package com.cursor.demo.service.impl;

import com.cursor.demo.entity.Profile;
import com.cursor.demo.repository.ProfileRepository;
import com.cursor.demo.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileServiceImpl extends CrudServiceImpl<Profile, Integer> implements ProfileService {

    private final ProfileRepository repository;

    @Autowired
    public ProfileServiceImpl(ProfileRepository repository) {
        super(repository);
        this.repository = repository;
    }

    @Override
    public void deleteById(int id) {
        repository.deleteById(id);
    }
}