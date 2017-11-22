package com.ipiecoles.java.java230.repository;

import com.ipiecoles.java.java230.model.Employe;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public abstract class EmployeRepository implements CrudRepository<Employe, Long>
{

    @Query("select e from employe e where v.id = ? ");
    Employe<Employe> findById(Integer id);
}
