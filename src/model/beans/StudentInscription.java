package model.beans;
// Generated 7 janv. 2020 11:56:55 by Hibernate Tools 5.4.7.Final

/**
 * StudentInscription generated by hbm2java
 */
public class StudentInscription implements java.io.Serializable {

	private StudentInscriptionId id;
	private InscriptionPeriod inscriptionPeriod;
	private Students students;

	public StudentInscription() {
	}

	public StudentInscription(StudentInscriptionId id, InscriptionPeriod inscriptionPeriod, Students students) {
		this.id = id;
		this.inscriptionPeriod = inscriptionPeriod;
		this.students = students;
	}

	public StudentInscriptionId getId() {
		return this.id;
	}

	public void setId(StudentInscriptionId id) {
		this.id = id;
	}

	public InscriptionPeriod getInscriptionPeriod() {
		return this.inscriptionPeriod;
	}

	public void setInscriptionPeriod(InscriptionPeriod inscriptionPeriod) {
		this.inscriptionPeriod = inscriptionPeriod;
	}

	public Students getStudents() {
		return this.students;
	}

	public void setStudents(Students students) {
		this.students = students;
	}

}
