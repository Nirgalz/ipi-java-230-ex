package com.ipiecoles.java.java230.service;


import com.ipiecoles.java.java230.model.Employe;
import com.ipiecoles.java.java230.repository.EmployeRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployeService
{
    @Autowired
    private EmployeRepository employeRepository;


    public Employe findById(Long id)
    {
        return employeRepository.findOne(id);

    }

    public long countAllEmploye()
    {
        return employeRepository.count();
    }

    public void creerEmploye(Employe e)
    {
        employeRepository.save(e);
    }

    public void deleteEmploye(Long id)
    {
        employeRepository.delete(id);
    }
}
