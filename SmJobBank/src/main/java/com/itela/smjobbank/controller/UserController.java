/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itela.smjobbank.controller;

import com.itela.smjobbank.model.User;
//import com.itela.smjobbank.service.UserService;
import java.util.List;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Eranga K
 */
@RestController
@Component
@RequestMapping("user")
public class UserController {
//    @Autowired
//    UserService userService;
//    @Autowired
//    User user;
    
   @RequestMapping(value = "/add", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public String insertData(@RequestBody String JSON) {
        JSONObject jsonObj = new JSONObject(JSON);
        String userName = jsonObj.getString("user_name");
        int password = jsonObj.getInt("password");
//        user.setUsername(userName);
//        user.setPassword(password);
//        
//        userService.saveUser(user);
        
        //System.out.println(jsonObj);
//        String dbName = jsonObj.getString("db_name");
//        String inser_data = jsonObj.getJSONObject("inser_data").toString();
//        String query = DMLQueries.InsertData(inser_data);
//        query = jsonStringGenarator.chanageToJSON(query);
//        String javaCode = DMLJava.InsertData(query, dbName);
//        javaCode = jsonStringGenarator.javaToJSON(javaCode);
//
        String err = "false";
        String msg = "success";
//        String runningState = DMLQueryRunner.insertData(dbName, query);
//        runningState = jsonStringGenarator.javaToJSON(runningState);
//        if (!"ok".equals(runningState)) {
//            err = "true";
//            msg = runningState;
//        }
         String query = "{}";//"{\"msg\":\"" + msg + "\",\"err\":\"" + err + "\"}";
        return query;
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT, consumes = "application/json", produces = "application/json")
    public String updateUser(@RequestBody String JSON) {
        JSONObject jsonObj = new JSONObject(JSON);

        return "ttttttttt";
    }
    
//    @RequestMapping(value = "/getall", method = RequestMethod.GET, produces = "application/json")
//    public List<User> selectDatabases() {
//        List<User> users = userService.findAllUser();
//        return users;
//    }
    
    @RequestMapping(value = "/get/{userId}", method = RequestMethod.GET, produces = "application/json")
    public String getdata(@PathVariable String userId) {
       System.out.println(userId);

        return "{\"getuser\":1}";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE, produces = "application/json")
    public String deletedata(@RequestBody String JSON) {
        System.out.println(JSON);

        return "{}";
    }    
}
