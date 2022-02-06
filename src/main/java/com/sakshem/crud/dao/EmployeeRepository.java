package com.sakshem.crud.dao;

import com.sakshem.crud.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

// This annotation will replace /--/employee path to /--/members
//@RepositoryRestResource(path="members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    // that's it ... no need to write any code.
}
