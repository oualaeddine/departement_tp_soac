package api;

import model.beans.Students;
import model.dao.daos.StudentsDAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

public class StudensApi {

    StudentsDAO dao;

    public Object getById(int id) {

        return dao.getById(id);


    }


    public boolean deleteById(int id) {

        return  dao.deleteById(id,"Students");
    }


    public boolean update(Object object) {

        return dao.update(object);
    }


    public boolean add(Object object) {

        return dao.add(object);
    }


    public LinkedList<Students> getAll() {

        return dao.getAll();
    }
    public int countAll() {

        return dao.countAll();

    }


}
