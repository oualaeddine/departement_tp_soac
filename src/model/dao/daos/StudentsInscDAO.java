package model.dao.daos;
// Generated 7 janv. 2020 11:56:55 by Hibernate Tools 5.4.7.Final

import model.beans.ScholarYear;
import model.beans.StudentInscription;
import model.beans.Students;
import model.dao.DAO;
import model.dao.DAOInterface;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

public class StudentsInscDAO extends DAO implements DAOInterface {

    @Override
    public Object getById(int id) {

        return null;
    }

    @Override
    public boolean deleteById(int id) {
        return deleteById(id, "students_biblio_insc");
    }

    @Override
    public boolean update(Object object) {
        return false;
    }

    @Override
    public boolean add(Object object) {
        StudentInscription studentsInsc = (StudentInscription) object;
        try {
            statement.execute("INSERT INTO students_biblio_insc (`student_id`,`scholar_year_id`,`date_insc` ) VALUES(" +
                    "'" + studentsInsc.getStudent().getId() + "'," +
                    "'" + studentsInsc.getScholarYear().getId() + "'," +
                    "'" + studentsInsc.getDateInsc() + "'" + "," +
                    ");");
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public LinkedList<StudentInscription> getAll() {
        LinkedList<StudentInscription> list = new LinkedList<>();
        ResultSet result;
        try {
            result = statement.executeQuery("SELECT * FROM students_biblio_insc;");
            while (result.next()) {
				StudentInscription studentsInsc = new StudentInscription();
				studentsInsc.setDateInsc(result.getDate("id"));
				studentsInsc.setScholarYear((ScholarYear) new ScholarYearDAO().getById(result.getInt("scholar_year_id")));
				studentsInsc.setStudent((Students) new StudentsDAO().getById(result.getInt("student_id")));
				list.add(studentsInsc);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public int countAll() {
      return 0;
    }
}
