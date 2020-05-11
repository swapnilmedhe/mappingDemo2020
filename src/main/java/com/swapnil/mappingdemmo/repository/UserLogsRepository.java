package com.swapnil.mappingdemmo.repository;

import com.swapnil.mappingdemmo.model.UserLogs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserLogsRepository extends JpaRepository<UserLogs ,Integer> {
}
