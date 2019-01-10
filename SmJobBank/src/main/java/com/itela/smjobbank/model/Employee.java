/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itela.smjobbank.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Eranga K
 */
@Entity
@Table(name = "employee")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Employee.findAll", query = "SELECT e FROM Employee e")
    , @NamedQuery(name = "Employee.findById", query = "SELECT e FROM Employee e WHERE e.id = :id")
    , @NamedQuery(name = "Employee.findByName", query = "SELECT e FROM Employee e WHERE e.name = :name")
    , @NamedQuery(name = "Employee.findByNic", query = "SELECT e FROM Employee e WHERE e.nic = :nic")
    , @NamedQuery(name = "Employee.findByGender", query = "SELECT e FROM Employee e WHERE e.gender = :gender")
    , @NamedQuery(name = "Employee.findByAddress", query = "SELECT e FROM Employee e WHERE e.address = :address")
    , @NamedQuery(name = "Employee.findByPhoneno", query = "SELECT e FROM Employee e WHERE e.phoneno = :phoneno")
    , @NamedQuery(name = "Employee.findByDistrict", query = "SELECT e FROM Employee e WHERE e.district = :district")
    , @NamedQuery(name = "Employee.findByWasama", query = "SELECT e FROM Employee e WHERE e.wasama = :wasama")
    , @NamedQuery(name = "Employee.findByEducation", query = "SELECT e FROM Employee e WHERE e.education = :education")
    , @NamedQuery(name = "Employee.findByOlsubject1", query = "SELECT e FROM Employee e WHERE e.olsubject1 = :olsubject1")
    , @NamedQuery(name = "Employee.findByOlresult1", query = "SELECT e FROM Employee e WHERE e.olresult1 = :olresult1")
    , @NamedQuery(name = "Employee.findByOlsubject2", query = "SELECT e FROM Employee e WHERE e.olsubject2 = :olsubject2")
    , @NamedQuery(name = "Employee.findByOlresult2", query = "SELECT e FROM Employee e WHERE e.olresult2 = :olresult2")
    , @NamedQuery(name = "Employee.findByOlsubject3", query = "SELECT e FROM Employee e WHERE e.olsubject3 = :olsubject3")
    , @NamedQuery(name = "Employee.findByOlresult3", query = "SELECT e FROM Employee e WHERE e.olresult3 = :olresult3")
    , @NamedQuery(name = "Employee.findByOlsubject4", query = "SELECT e FROM Employee e WHERE e.olsubject4 = :olsubject4")
    , @NamedQuery(name = "Employee.findByOlresult4", query = "SELECT e FROM Employee e WHERE e.olresult4 = :olresult4")
    , @NamedQuery(name = "Employee.findByOlsubject5", query = "SELECT e FROM Employee e WHERE e.olsubject5 = :olsubject5")
    , @NamedQuery(name = "Employee.findByOlresult5", query = "SELECT e FROM Employee e WHERE e.olresult5 = :olresult5")
    , @NamedQuery(name = "Employee.findByOlsubject6", query = "SELECT e FROM Employee e WHERE e.olsubject6 = :olsubject6")
    , @NamedQuery(name = "Employee.findByOlresult6", query = "SELECT e FROM Employee e WHERE e.olresult6 = :olresult6")
    , @NamedQuery(name = "Employee.findByOlsubject7", query = "SELECT e FROM Employee e WHERE e.olsubject7 = :olsubject7")
    , @NamedQuery(name = "Employee.findByOlresult7", query = "SELECT e FROM Employee e WHERE e.olresult7 = :olresult7")
    , @NamedQuery(name = "Employee.findByOlsubject8", query = "SELECT e FROM Employee e WHERE e.olsubject8 = :olsubject8")
    , @NamedQuery(name = "Employee.findByOlresult8", query = "SELECT e FROM Employee e WHERE e.olresult8 = :olresult8")
    , @NamedQuery(name = "Employee.findByOlsubject9", query = "SELECT e FROM Employee e WHERE e.olsubject9 = :olsubject9")
    , @NamedQuery(name = "Employee.findByOlresult9", query = "SELECT e FROM Employee e WHERE e.olresult9 = :olresult9")
    , @NamedQuery(name = "Employee.findByOlsubject10", query = "SELECT e FROM Employee e WHERE e.olsubject10 = :olsubject10")
    , @NamedQuery(name = "Employee.findByOlresult10", query = "SELECT e FROM Employee e WHERE e.olresult10 = :olresult10")
    , @NamedQuery(name = "Employee.findByAlsubject1", query = "SELECT e FROM Employee e WHERE e.alsubject1 = :alsubject1")
    , @NamedQuery(name = "Employee.findByAlresult1", query = "SELECT e FROM Employee e WHERE e.alresult1 = :alresult1")
    , @NamedQuery(name = "Employee.findByAlsubject2", query = "SELECT e FROM Employee e WHERE e.alsubject2 = :alsubject2")
    , @NamedQuery(name = "Employee.findByAlresult2", query = "SELECT e FROM Employee e WHERE e.alresult2 = :alresult2")
    , @NamedQuery(name = "Employee.findByAlsubject3", query = "SELECT e FROM Employee e WHERE e.alsubject3 = :alsubject3")
    , @NamedQuery(name = "Employee.findByAlresult3", query = "SELECT e FROM Employee e WHERE e.alresult3 = :alresult3")
    , @NamedQuery(name = "Employee.findByAlsubject4", query = "SELECT e FROM Employee e WHERE e.alsubject4 = :alsubject4")
    , @NamedQuery(name = "Employee.findByAlresult4", query = "SELECT e FROM Employee e WHERE e.alresult4 = :alresult4")
    , @NamedQuery(name = "Employee.findByAlsubject5", query = "SELECT e FROM Employee e WHERE e.alsubject5 = :alsubject5")
    , @NamedQuery(name = "Employee.findByAlresult5", query = "SELECT e FROM Employee e WHERE e.alresult5 = :alresult5")
    , @NamedQuery(name = "Employee.findByJobcategory", query = "SELECT e FROM Employee e WHERE e.jobcategory = :jobcategory")
    , @NamedQuery(name = "Employee.findByJobsubcategory", query = "SELECT e FROM Employee e WHERE e.jobsubcategory = :jobsubcategory")})
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "nic")
    private String nic;
    @Size(max = 7)
    @Column(name = "gender")
    private String gender;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "address")
    private String address;
    @Size(max = 10)
    @Column(name = "phoneno")
    private String phoneno;
    @Size(max = 50)
    @Column(name = "district")
    private String district;
    @Size(max = 50)
    @Column(name = "wasama")
    private String wasama;
    @Size(max = 15)
    @Column(name = "education")
    private String education;
    @Size(max = 15)
    @Column(name = "olsubject1")
    private String olsubject1;
    @Size(max = 15)
    @Column(name = "olresult1")
    private String olresult1;
    @Size(max = 15)
    @Column(name = "olsubject2")
    private String olsubject2;
    @Size(max = 15)
    @Column(name = "olresult2")
    private String olresult2;
    @Size(max = 15)
    @Column(name = "olsubject3")
    private String olsubject3;
    @Size(max = 15)
    @Column(name = "olresult3")
    private String olresult3;
    @Size(max = 15)
    @Column(name = "olsubject4")
    private String olsubject4;
    @Size(max = 15)
    @Column(name = "olresult4")
    private String olresult4;
    @Size(max = 15)
    @Column(name = "olsubject5")
    private String olsubject5;
    @Size(max = 15)
    @Column(name = "olresult5")
    private String olresult5;
    @Size(max = 15)
    @Column(name = "olsubject6")
    private String olsubject6;
    @Size(max = 15)
    @Column(name = "olresult6")
    private String olresult6;
    @Size(max = 15)
    @Column(name = "olsubject7")
    private String olsubject7;
    @Size(max = 15)
    @Column(name = "olresult7")
    private String olresult7;
    @Size(max = 15)
    @Column(name = "olsubject8")
    private String olsubject8;
    @Size(max = 15)
    @Column(name = "olresult8")
    private String olresult8;
    @Size(max = 15)
    @Column(name = "olsubject9")
    private String olsubject9;
    @Size(max = 15)
    @Column(name = "olresult9")
    private String olresult9;
    @Size(max = 15)
    @Column(name = "olsubject10")
    private String olsubject10;
    @Size(max = 15)
    @Column(name = "olresult10")
    private String olresult10;
    @Size(max = 15)
    @Column(name = "alsubject1")
    private String alsubject1;
    @Size(max = 15)
    @Column(name = "alresult1")
    private String alresult1;
    @Size(max = 15)
    @Column(name = "alsubject2")
    private String alsubject2;
    @Size(max = 15)
    @Column(name = "alresult2")
    private String alresult2;
    @Size(max = 15)
    @Column(name = "alsubject3")
    private String alsubject3;
    @Size(max = 15)
    @Column(name = "alresult3")
    private String alresult3;
    @Size(max = 15)
    @Column(name = "alsubject4")
    private String alsubject4;
    @Size(max = 15)
    @Column(name = "alresult4")
    private String alresult4;
    @Size(max = 15)
    @Column(name = "alsubject5")
    private String alsubject5;
    @Size(max = 15)
    @Column(name = "alresult5")
    private String alresult5;
    @Size(max = 50)
    @Column(name = "jobcategory")
    private String jobcategory;
    @Size(max = 50)
    @Column(name = "jobsubcategory")
    private String jobsubcategory;

    public Employee() {
    }

    public Employee(Integer id) {
        this.id = id;
    }

    public Employee(Integer id, String name, String nic, String address) {
        this.id = id;
        this.name = name;
        this.nic = nic;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getWasama() {
        return wasama;
    }

    public void setWasama(String wasama) {
        this.wasama = wasama;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getOlsubject1() {
        return olsubject1;
    }

    public void setOlsubject1(String olsubject1) {
        this.olsubject1 = olsubject1;
    }

    public String getOlresult1() {
        return olresult1;
    }

    public void setOlresult1(String olresult1) {
        this.olresult1 = olresult1;
    }

    public String getOlsubject2() {
        return olsubject2;
    }

    public void setOlsubject2(String olsubject2) {
        this.olsubject2 = olsubject2;
    }

    public String getOlresult2() {
        return olresult2;
    }

    public void setOlresult2(String olresult2) {
        this.olresult2 = olresult2;
    }

    public String getOlsubject3() {
        return olsubject3;
    }

    public void setOlsubject3(String olsubject3) {
        this.olsubject3 = olsubject3;
    }

    public String getOlresult3() {
        return olresult3;
    }

    public void setOlresult3(String olresult3) {
        this.olresult3 = olresult3;
    }

    public String getOlsubject4() {
        return olsubject4;
    }

    public void setOlsubject4(String olsubject4) {
        this.olsubject4 = olsubject4;
    }

    public String getOlresult4() {
        return olresult4;
    }

    public void setOlresult4(String olresult4) {
        this.olresult4 = olresult4;
    }

    public String getOlsubject5() {
        return olsubject5;
    }

    public void setOlsubject5(String olsubject5) {
        this.olsubject5 = olsubject5;
    }

    public String getOlresult5() {
        return olresult5;
    }

    public void setOlresult5(String olresult5) {
        this.olresult5 = olresult5;
    }

    public String getOlsubject6() {
        return olsubject6;
    }

    public void setOlsubject6(String olsubject6) {
        this.olsubject6 = olsubject6;
    }

    public String getOlresult6() {
        return olresult6;
    }

    public void setOlresult6(String olresult6) {
        this.olresult6 = olresult6;
    }

    public String getOlsubject7() {
        return olsubject7;
    }

    public void setOlsubject7(String olsubject7) {
        this.olsubject7 = olsubject7;
    }

    public String getOlresult7() {
        return olresult7;
    }

    public void setOlresult7(String olresult7) {
        this.olresult7 = olresult7;
    }

    public String getOlsubject8() {
        return olsubject8;
    }

    public void setOlsubject8(String olsubject8) {
        this.olsubject8 = olsubject8;
    }

    public String getOlresult8() {
        return olresult8;
    }

    public void setOlresult8(String olresult8) {
        this.olresult8 = olresult8;
    }

    public String getOlsubject9() {
        return olsubject9;
    }

    public void setOlsubject9(String olsubject9) {
        this.olsubject9 = olsubject9;
    }

    public String getOlresult9() {
        return olresult9;
    }

    public void setOlresult9(String olresult9) {
        this.olresult9 = olresult9;
    }

    public String getOlsubject10() {
        return olsubject10;
    }

    public void setOlsubject10(String olsubject10) {
        this.olsubject10 = olsubject10;
    }

    public String getOlresult10() {
        return olresult10;
    }

    public void setOlresult10(String olresult10) {
        this.olresult10 = olresult10;
    }

    public String getAlsubject1() {
        return alsubject1;
    }

    public void setAlsubject1(String alsubject1) {
        this.alsubject1 = alsubject1;
    }

    public String getAlresult1() {
        return alresult1;
    }

    public void setAlresult1(String alresult1) {
        this.alresult1 = alresult1;
    }

    public String getAlsubject2() {
        return alsubject2;
    }

    public void setAlsubject2(String alsubject2) {
        this.alsubject2 = alsubject2;
    }

    public String getAlresult2() {
        return alresult2;
    }

    public void setAlresult2(String alresult2) {
        this.alresult2 = alresult2;
    }

    public String getAlsubject3() {
        return alsubject3;
    }

    public void setAlsubject3(String alsubject3) {
        this.alsubject3 = alsubject3;
    }

    public String getAlresult3() {
        return alresult3;
    }

    public void setAlresult3(String alresult3) {
        this.alresult3 = alresult3;
    }

    public String getAlsubject4() {
        return alsubject4;
    }

    public void setAlsubject4(String alsubject4) {
        this.alsubject4 = alsubject4;
    }

    public String getAlresult4() {
        return alresult4;
    }

    public void setAlresult4(String alresult4) {
        this.alresult4 = alresult4;
    }

    public String getAlsubject5() {
        return alsubject5;
    }

    public void setAlsubject5(String alsubject5) {
        this.alsubject5 = alsubject5;
    }

    public String getAlresult5() {
        return alresult5;
    }

    public void setAlresult5(String alresult5) {
        this.alresult5 = alresult5;
    }

    public String getJobcategory() {
        return jobcategory;
    }

    public void setJobcategory(String jobcategory) {
        this.jobcategory = jobcategory;
    }

    public String getJobsubcategory() {
        return jobsubcategory;
    }

    public void setJobsubcategory(String jobsubcategory) {
        this.jobsubcategory = jobsubcategory;
    }

    @Override
    public String toString() {
        return "com.itela.smjobbank.model.Employee[ id=" + id + " ]";
    }
    
}
