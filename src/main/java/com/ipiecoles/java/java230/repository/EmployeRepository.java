package com.ipiecoles.java.java230.repository;

import com.ipiecoles.java.java230.model.Employe;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;



public  interface EmployeRepository extends  PagingAndSortingRepository<Employe, Long>
{

    //@Query("select e from Employe e where e.matricule = ?1 ")
    Employe findByMatricule(String id);

    //@Query("select e from Employe e where e.nom = ?1 AND e.prenom = ?1")
    List<Employe> findByNomAndPrenom(String nom, String prenom);

    //@Query("select e from employe e where lower(e.nom) = lower(:nom)")
    List<Employe> findByNomIgnoreCase(String nom);

    Page<Employe> findByNomIgnoreCase(String nom, Pageable page);

    @Query("select e from Employe e where lower(e.prenom) = lower(:nomOuPrenom) OR lower(e.nom) = lower(:nomOuPrenom)")
    List<Employe> findByNomOrPrenomAllIgnoreCase(@Param("nomOuPrenom") String nomOuPrenom);


    //@Query("select e from employe e where dateEmbauche < :date ")
    List<Employe> findByDateEmbaucheBefore(org.joda.time.LocalDate date);

    //@Query("select e from employe e where dateEmbauche > ?1 ")
    List<Employe> findByDateEmbaucheAfter(org.joda.time.LocalDate date);

    //@Query("select e from employe e where salaire > ?1 ORDER BY salaire DESC")
    List<Employe> findBySalaireGreaterThanOrderBySalaireDesc(Double salaire);


}
