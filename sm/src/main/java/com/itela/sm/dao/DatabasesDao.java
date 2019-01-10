/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itela.sm.dao;

import com.itela.sm.model.Databases;
import java.util.List;
/**
 *
 * @author Eranga K
 */


public interface DatabasesDao {

	void saveDatabases(Databases database);
	
	void deleteDatabasesBySsn(String user_dbname);
	
	List<Databases> findAllDatabasess(int ssn);

}

