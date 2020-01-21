package api;

import model.beans.StudentInscription;
import model.beans.Students;
import model.dao.daos.StudentsDAO;
import utils.ScholarYearHelper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

public class StudentsApi {

    StudentsDAO dao;

    public Object getById(int id) {

        return dao.getById(id);


    }


    public boolean deleteById(int id) {

        return dao.deleteById(id);
    }


    public boolean update(Object object) {

        return dao.update(object);
    }


    public boolean add(Students student) {
        if (ScholarYearHelper.isInscPeriodOpen())
            return dao.add(student);
        else
            return false;
    }


    public LinkedList<Students> getAll() {

        return dao.getAll();
    }

    public int countAll() {

        return dao.countAll();

    }

    public boolean Reinscrire(StudentInscription studentInscription) {
        if (ScholarYearHelper.isReInscPeriodOpen())
        return dao.Reinscrire(studentInscription);
        else return false;
    }
}
