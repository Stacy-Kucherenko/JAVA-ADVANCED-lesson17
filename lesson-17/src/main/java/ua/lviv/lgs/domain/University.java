package ua.lviv.lgs.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class University {
	@Id
	@GeneratedValue
	private int id;
	@Column
	private String name;
	@Column
	private int numberOfFaculties;
	@Column
	private int numberOfStudents;
	@Column
	private String address;

	public University() {
	}

	public University(String name, int numberOfFaculties, int numberOfStudents, String address) {
		this.name = name;
		this.numberOfFaculties = numberOfFaculties;
		this.numberOfStudents = numberOfStudents;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfFaculties() {
		return numberOfFaculties;
	}

	public void setNumberOfFaculties(int numberOfFaculties) {
		this.numberOfFaculties = numberOfFaculties;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public void setNumberOfStudents(int numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "University [id=" + id + ", name=" + name + ", numberOfFaculties=" + numberOfFaculties
				+ ", numberOfStudents=" + numberOfStudents + ", address=" + address + "]";
	}

}
