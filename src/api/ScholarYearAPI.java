package api;
// Generated 7 janv. 2020 11:56:55 by Hibernate Tools 5.4.7.Final

import model.dao.DAO;
import model.dao.DAOInterface;
import model.dao.daos.ScholarYearDAO;

import java.util.LinkedList;

/**
 * ScholarYear generated by hbm2java
 */
public class ScholarYearAPI  {

 ScholarYearDAO dao;

	public Object getById(int id) {
		return dao.getById(id);
	}


	public boolean deleteById(int id) {
		return dao.deleteById(id);
	}


	public boolean update(Object object) {
		return dao.update(object);
	}


	public boolean add(Object object) {
		return dao.add(object);
	}




	public LinkedList getAll() {
		return dao.getAll();
	}


	public int countAll() {
		return dao.countAll();
	}
}
