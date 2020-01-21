package utils;

import model.beans.InscriptionPeriod;
import model.beans.ScholarYear;
import model.dao.daos.InscriptionPeriodDAO;
import model.dao.daos.ScholarYearDAO;

import java.util.Date;


public class ScholarYearHelper {

    public static boolean isYearOpen() {
        ScholarYearDAO scholarYearDAO = new ScholarYearDAO();
        ScholarYear sy = scholarYearDAO.GetLastScholarYear();
        return new Date().after(sy.getStartDate()) && new Date().before(sy.getEndDate());

    }

    public static boolean isInscPeriodOpen() {
        InscriptionPeriodDAO periodDAO = new InscriptionPeriodDAO();
        InscriptionPeriod lp = periodDAO.GetLastPeriode();
        return isYearOpen() && new Date().after(lp.getStartInscDate()) && new Date().before(lp.getEndInscDate());
    }

    public static boolean isReInscPeriodOpen() {
        InscriptionPeriodDAO periodDAO = new InscriptionPeriodDAO();
        InscriptionPeriod lp = periodDAO.GetLastPeriode();
        return isYearOpen() && new Date().after(lp.getStartReinscDate()) && new Date().before(lp.getEndReinscDate());
    }
}
;