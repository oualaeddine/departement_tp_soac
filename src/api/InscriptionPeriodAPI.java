package api;
// Generated 7 janv. 2020 11:56:55 by Hibernate Tools 5.4.7.Final

import model.dao.DAO;
import model.dao.DAOInterface;
import model.dao.daos.InscriptionPeriodDAO;

import java.util.LinkedList;

/**
 * InscriptionPeriod generated by hbm2java
 */
public class InscriptionPeriodAPI  {

	InscriptionPeriodDAO dao;
	public Object getById(int id) {
		return dao.getById(id);
	}


	public boolean deleteById(int id, String employees) {
		return dao.deleteById(id,employees);
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