package com.swapnil.mappingdemmo.resource;

import com.swapnil.mappingdemmo.model.UserLogs;
import com.swapnil.mappingdemmo.model.Users;
import com.swapnil.mappingdemmo.repository.UserLogsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/user/logs")
public class UserLogsResources {

    @Autowired
    UserLogsRepository userLogsRepository;

    @GetMapping("all")
    public List<UserLogs> getAll(){
       return  userLogsRepository.findAll();
    }


    @GetMapping("/update/{name}")
    public List<UserLogs> update(@PathVariable final String name){
        Users user =new Users() ;
        user.setName(name).setTeamName("fullStack dev").setSalary(452160);
        UserLogs userLogs=new UserLogs();
        userLogs.setUsers(user);
        userLogs.setLog("log info ** 1");
        userLogsRepository.save(userLogs);
        UserLogs userLogs1=new UserLogs();
        userLogs1.setUsers(user);
        userLogs1.setLog("log info ** 2");
        userLogsRepository.save(userLogs1);



        return userLogsRepository.findAll();
    }

}
