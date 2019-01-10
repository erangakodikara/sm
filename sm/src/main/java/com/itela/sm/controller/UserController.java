/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itela.sm.controller;


import com.itela.sm.service.DatabasesService;
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
    
    @Autowired
    DatabasesService databasesService;
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
//        String dbName = jsonObj.getString("db_name");
//        String inser_data = jsonObj.getJSONObject("inser_data").toString();
//        String query = DMLQueries.InsertData(inser_data);
//        query = jsonStringGenarator.chanageToJSON(query);
//        String javaCode = DMLJava.InsertData(query, dbName);
//        javaCode = jsonStringGenarator.javaToJSON(javaCode);
//
//        String err = "false";
//        String msg = "success";
//        String runningState = DMLQueryRunner.insertData(dbName, query);
//        runningState = jsonStringGenarator.javaToJSON(runningState);
//        if (!"ok".equals(runningState)) {
//            err = "true";
//            msg = runningState;
//        }
//        query = "{\"msg\":\"" + msg + "\",\"err\":\"" + err + "\",\"query\":\"" + query + "\", \"java_code\":\"" + javaCode + "\"}";
//        return query;
        return "ttttttttt";
    }
    
    @RequestMapping(value = "/get/{userId}", method = RequestMethod.GET, produces = "application/json")
    public String getdata(@PathVariable String userId) {
       System.out.println(userId);
//
//        JSONObject jsonObj = new JSONObject(JSON);
//        String dbName = jsonObj.getString("db_name");
//        String update_data = jsonObj.getJSONObject("update_data").toString();
//        String query = DMLQueries.UpdateData(update_data);
//        query = jsonStringGenarator.chanageToJSON(query);
//        String runningState = DMLQueryRunner.updateData(dbName, query);
//        String javaCode = DMLJava.UpdateData(query, dbName);
//        javaCode = jsonStringGenarator.javaToJSON(javaCode);
//
//        String err = "false";
//        String msg = "success";
//        runningState = jsonStringGenarator.javaToJSON(runningState);
//        if (!"ok".equals(runningState)) {
//            err = "true";
//            msg = runningState;
//        }
//        query = "{\"msg\":\"" + msg + "\",\"err\":\"" + err + "\",\"query\":\"" + query + "\", \"java_code\":\"" + javaCode + "\"}";
//        return query;
        return "{\"getuser\":1}";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE, produces = "application/json")
    public String deletedata(@RequestBody String JSON) {
        System.out.println(JSON);
//        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
//        JSONObject jsonObj = new JSONObject(JSON);
//        String dbName = jsonObj.getString("db_name");
//        String delete_data = jsonObj.getJSONObject("delete_data").toString();
//        String query = DMLQueries.DeleteData(delete_data);
//        query = jsonStringGenarator.chanageToJSON(query);
//         String runningState  = DMLQueryRunner.deleteData(dbName, query);
//        String javaCode = DMLJava.DeleteData(query, dbName);
//        javaCode = jsonStringGenarator.javaToJSON(javaCode);
//
//        String err = "false";
//        String msg = "success";
//        System.out.println("eeeeeeee");
//        System.out.println("fffffffff");
//        runningState = jsonStringGenarator.javaToJSON(runningState);
//        System.out.println("gggggggg");
//        if (!"ok".equals(runningState)) {
//            System.out.println("hhhhhh");
//            err = "true";
//            msg = runningState;
//        }
//        System.out.println("iiiiii");
//        query = "{\"msg\":\"" + msg + "\",\"err\":\"" + err + "\",\"query\":\"" + query + "\", \"java_code\":\"" + javaCode + "\"}";
//        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
//        System.out.println(query);
        return "{}";
    }    
}
