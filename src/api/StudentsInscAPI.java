package api;
// Generated 7 janv. 2020 11:56:55 by Hibernate Tools 5.4.7.Final

import model.beans.ScholarYear;
import model.beans.StudentInscription;
import model.beans.Students;
import model.dao.DAO;
import model.dao.DAOInterface;
import model.dao.daos.ScholarYearDAO;
import model.dao.daos.StudentsDAO;
import model.dao.daos.StudentsInscDAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

public class StudentsInscAPI {

   StudentsInscDAO dao;
    public Object getById(int id) {

        return dao.getById(id);
    }


    public boolean deleteById(int id, String employees) {
        return dao.deleteById(id, "students_biblio_insc");
    }


    public boolean update(Object object) {
        return dao.update(object);
    }


    public boolean add(Object object) {

        return dao.add(object);
    }


    public LinkedList<StudentInscription> getAll() {

        return dao.getAll();
    }

    public int countAll() {

      return dao.countAll();
    }
}
