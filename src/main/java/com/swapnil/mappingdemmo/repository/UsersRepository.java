package com.swapnil.mappingdemmo.repository;


import com.swapnil.mappingdemmo.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {
    List<Users> findByName(String name);

}
