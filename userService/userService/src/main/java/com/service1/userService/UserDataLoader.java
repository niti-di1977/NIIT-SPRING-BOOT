package com.service1.userService;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.service1.userService.beans.User;
import com.service1.userService.repo.UserRepo;

@Component
public class UserDataLoader {

    private final UserRepo userRepository;
  

    @Autowired
   public UserDataLoader(UserRepo userRepository) {
        this.userRepository = userRepository;
       
    }

    @PostConstruct
    public void loadDummyData() {
        // Create dummy contacts
    

        // Create and save dummy users with their contacts
      
        User user1 = new User(1, "User1", "Address1");

       
        User user2 = new User(2, "User2", "Address2");
        
        User user3 = new User(3, "User3", "Address3");
        
        User user4 = new User(4, "User4", "Address4");

      userRepository.save(user1);
        userRepository.save(user2);
        userRepository.save(user3);
        userRepository.save(user4);

        System.out.println("Dummy user data loaded successfully.");
    }
}
