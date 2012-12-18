/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conwet.practice.ejbs;

import com.conwet.practice.entities.Student;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author mjimenez
 */
@Stateless
@javax.inject.Named
public class StudentSB {

    @PersistenceContext
    EntityManager em;
    
    public List<Student> getStudents() {
        return (List<Student>)em.createNamedQuery("Student.findAll").getResultList();
    }

}
