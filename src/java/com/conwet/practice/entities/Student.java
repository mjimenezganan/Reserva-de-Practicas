/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conwet.practice.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.validation.constraints.Size;

/**
 *
 * @author mjimenez
 */
@NamedQueries({
    @NamedQuery(name = "Student.findByRegistration", query = "SELECT c FROM Student c WHERE c.registrationID = :registrationID"),
    @NamedQuery(name = "Student.findAll", query = "SELECT c FROM Student c")
})
@Entity
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    
    @Size(max = 10)
    @Column
    private String registrationID;
    
    @Size(max = 12)
    @Column
    private String passportID;
    
    @Size(max = 30)
    @Column
    private String name;
    
    @Size(max = 100)
    @Column
    private String surname;

    public String getRegistrationID() {
        return registrationID;
    }

    public void setRegistrationID(String registrationID) {
        this.registrationID = registrationID;
    }

    public String getPassportID() {
        return passportID;
    }

    public void setPassportID(String passportID) {
        this.passportID = passportID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Student)) {
            return false;
        }
        Student other = (Student) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return surname + " " + name + 
                "[ DNI=" + passportID + ", Matricula=" + registrationID + " ]";
    }
    
}
