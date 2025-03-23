package com.youtube.central.Service;

import com.youtube.central.Repository.AppUserRepo;
import com.youtube.central.models.AppUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    AppUserRepo appUserRepo;

    @Autowired
     UserService(AppUserRepo appUserRepo){
        this.appUserRepo=appUserRepo;

}
    public void registerUser(AppUser user){
          appUserRepo.save(user);
    }

}
