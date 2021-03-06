package model.beans;
// Generated 7 janv. 2020 11:56:55 by Hibernate Tools 5.4.7.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * ScholarYear generated by hbm2java
 */
public class ScholarYear implements java.io.Serializable {

	private Integer id;
	private String comments;
	private Date startDate;
	private Date endDate;
	private Set studentsBiblioInscs = new HashSet(0);
	private Set biblioInscPeriods = new HashSet(0);
	private Set inscriptionPeriods = new HashSet(0);

	public ScholarYear() {
	}

	public ScholarYear(Date startDate, Date endDate) {
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public ScholarYear(String comments, Date startDate, Date endDate, Set studentsBiblioInscs, Set biblioInscPeriods,
			Set inscriptionPeriods) {
		this.comments = comments;
		this.startDate = startDate;
		this.endDate = endDate;
		this.studentsBiblioInscs = studentsBiblioInscs;
		this.biblioInscPeriods = biblioInscPeriods;
		this.inscriptionPeriods = inscriptionPeriods;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Set getStudentsBiblioInscs() {
		return this.studentsBiblioInscs;
	}

	public void setStudentsBiblioInscs(Set studentsBiblioInscs) {
		this.studentsBiblioInscs = studentsBiblioInscs;
	}

	public Set getBiblioInscPeriods() {
		return this.biblioInscPeriods;
	}

	public void setBiblioInscPeriods(Set biblioInscPeriods) {
		this.biblioInscPeriods = biblioInscPeriods;
	}

	public Set getInscriptionPeriods() {
		return this.inscriptionPeriods;
	}

	public void setInscriptionPeriods(Set inscriptionPeriods) {
		this.inscriptionPeriods = inscriptionPeriods;
	}

}
