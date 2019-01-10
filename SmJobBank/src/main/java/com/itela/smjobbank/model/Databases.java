/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itela.smjobbank.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Eranga K
 */
@Entity
@Table(name = "user_databases")

public class Databases implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "user_dbname")
    private String userDbname;
    @Column(name = "userid")
    private Integer userid;

    public Databases() {
    }

    public Databases(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserDbname() {
        return userDbname;
    }

    public void setUserDbname(String userDbname) {
        this.userDbname = userDbname;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    @Override
    public String toString() {
        return "com.itela.smjobbank.model.Databases[ id=" + id + " ]";
    }
    
}
