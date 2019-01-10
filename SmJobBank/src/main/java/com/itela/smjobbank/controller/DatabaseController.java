/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itela.smjobbank.controller;

/**
 *
 * @author Eranga K
 */

//import com.itela.smjobbank.service.DatabasesService;
//import com.itela.smjobbank.model.Databases;
//import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Component
public class DatabaseController {

//    @Autowired
//    DatabasesService databasesService;
    

//    @RequestMapping(value = "database/{userID}", method = RequestMethod.GET, produces = "application/json")
//    public List<Databases> selectDatabases(@PathVariable int userID) {
//        List<Databases> dbs = databasesService.findAllDatabasess(userID);
//        return dbs;
//    }
    
    @RequestMapping(value = "database/{userId}", method = RequestMethod.GET, produces = "application/json")
    public String getdata(@PathVariable String userId) {
       System.out.println(userId);

        return "{\"getuser\":1}";
    }
}
