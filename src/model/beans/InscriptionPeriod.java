package model.beans;
// Generated 7 janv. 2020 11:56:55 by Hibernate Tools 5.4.7.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * InscriptionPeriod generated by hbm2java
 */
public class InscriptionPeriod implements java.io.Serializable {

	private Integer id;
	private ScholarYear scholarYear;
	private Date startInscDate;
	private Date endInscDate;
	private Date startReinscDate;
	private Date endReinscDate;
	private Set studentInscriptions = new HashSet(0);

	public InscriptionPeriod() {
	}

	public InscriptionPeriod(ScholarYear scholarYear, Date startInscDate, Date endInscDate, Date startReinscDate,
			Date endReinscDate) {
		this.scholarYear = scholarYear;
		this.startInscDate = startInscDate;
		this.endInscDate = endInscDate;
		this.startReinscDate = startReinscDate;
		this.endReinscDate = endReinscDate;
	}

	public InscriptionPeriod(ScholarYear scholarYear, Date startInscDate, Date endInscDate, Date startReinscDate,
			Date endReinscDate, Set studentInscriptions) {
		this.scholarYear = scholarYear;
		this.startInscDate = startInscDate;
		this.endInscDate = endInscDate;
		this.startReinscDate = startReinscDate;
		this.endReinscDate = endReinscDate;
		this.studentInscriptions = studentInscriptions;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public ScholarYear getScholarYear() {
		return this.scholarYear;
	}

	public void setScholarYear(ScholarYear scholarYear) {
		this.scholarYear = scholarYear;
	}

	public Date getStartInscDate() {
		return this.startInscDate;
	}

	public void setStartInscDate(Date startInscDate) {
		this.startInscDate = startInscDate;
	}

	public Date getEndInscDate() {
		return this.endInscDate;
	}

	public void setEndInscDate(Date endInscDate) {
		this.endInscDate = endInscDate;
	}

	public Date getStartReinscDate() {
		return this.startReinscDate;
	}

	public void setStartReinscDate(Date startReinscDate) {
		this.startReinscDate = startReinscDate;
	}

	public Date getEndReinscDate() {
		return this.endReinscDate;
	}

	public void setEndReinscDate(Date endReinscDate) {
		this.endReinscDate = endReinscDate;
	}

	public Set getStudentInscriptions() {
		return this.studentInscriptions;
	}

	public void setStudentInscriptions(Set studentInscriptions) {
		this.studentInscriptions = studentInscriptions;
	}

}
