package com.swapnil.mappingdemmo.resource;

import com.swapnil.mappingdemmo.model.UserLogs;
import com.swapnil.mappingdemmo.model.Users;
import com.swapnil.mappingdemmo.model.UsersContact;
import com.swapnil.mappingdemmo.repository.UsersContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/rest/userscontacts")
public class UsersContactResourse {

    @Autowired
    private UsersContactRepository usersContactRepository;
    @GetMapping(value = "/all")
    public List<UsersContact> getUsersContact(){
        return  usersContactRepository.findAll();
    }

    @GetMapping(value="/update/{name}")
    public List<UsersContact> update(@PathVariable final String name){
        Users user =new Users();
        UsersContact usersContact=new UsersContact();
        UserLogs  userLogs=new UserLogs();
        UserLogs  userLogs2=new UserLogs();
        userLogs.setLog("Hi Login info 1"); userLogs2.setLog("Hi Login info 2");

        // user.setName(name).setSalary(45000).setTeamName("Devloper").setUserLogs(Arrays.asList(userLogs,userLogs2));
        user.setName(name).setSalary(45000).setTeamName("Devloper");
        usersContact.setPhone(77418339).setUsers(user);
          usersContactRepository.save(usersContact);

          return usersContactRepository.findAll(); // just for tally purpose
    }

}
