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
@Table(name = "subcategory")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Subcategory.findAll", query = "SELECT s FROM Subcategory s")
    , @NamedQuery(name = "Subcategory.findById", query = "SELECT s FROM Subcategory s WHERE s.id = :id")
    , @NamedQuery(name = "Subcategory.findByCategoryid", query = "SELECT s FROM Subcategory s WHERE s.categoryid = :categoryid")
    , @NamedQuery(name = "Subcategory.findBySubcategoryname", query = "SELECT s FROM Subcategory s WHERE s.subcategoryname = :subcategoryname")
    , @NamedQuery(name = "Subcategory.findByState", query = "SELECT s FROM Subcategory s WHERE s.state = :state")})
public class Subcategory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "categoryid")
    private int categoryid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "subcategoryname")
    private String subcategoryname;
    @Basic(optional = false)
    @NotNull
    @Column(name = "state")
    private int state;

    public Subcategory() {
    }

    public Subcategory(Integer id) {
        this.id = id;
    }

    public Subcategory(Integer id, int categoryid, String subcategoryname, int state) {
        this.id = id;
        this.categoryid = categoryid;
        this.subcategoryname = subcategoryname;
        this.state = state;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(int categoryid) {
        this.categoryid = categoryid;
    }

    public String getSubcategoryname() {
        return subcategoryname;
    }

    public void setSubcategoryname(String subcategoryname) {
        this.subcategoryname = subcategoryname;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }



    @Override
    public String toString() {
        return "com.itela.smjobbank.model.Subcategory[ id=" + id + " ]";
    }
    
}
