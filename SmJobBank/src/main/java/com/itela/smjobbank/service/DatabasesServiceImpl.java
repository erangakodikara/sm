/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itela.smjobbank.service;
import com.itela.smjobbank.dao.DatabasesDao;
import com.itela.smjobbank.model.Databases;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service("databasesService")
@Transactional
public class DatabasesServiceImpl implements DatabasesService {

	@Autowired
	private DatabasesDao dao;


        @Override
	public void saveDatabases(Databases databases) {
		dao.saveDatabases(databases);
	}

        @Override
	public void deleteDatabasesBySsn(String user_dbname) {
		dao.deleteDatabasesBySsn(user_dbname);
	}
	
        @Override
	public List<Databases> findAllDatabasess(int ssn) {
		return dao.findAllDatabasess(ssn);
	}

}

