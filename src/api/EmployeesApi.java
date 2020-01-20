package api;

import model.beans.Employees;
import model.dao.daos.EmployeesDAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

public class EmployeesApi {

    EmployeesDAO dao;

    public Object getById(int id) {
        return   dao.getById(id);
    }

    public boolean isAuth(String username, String password) {
        return  dao.isAuth(username,password);
    }



    public boolean deleteById(int id) {
        return dao.deleteById(id, "Employees");
    }


    public boolean update(Object object) {

        return  dao.update(object);
    }


    public boolean add(Object object) {
        return dao.add(object);
    }


    public LinkedList<Employees> getAll() {
        return dao.getAll();
    }

    public int countAll() {
      return dao.countAll();
}
}
