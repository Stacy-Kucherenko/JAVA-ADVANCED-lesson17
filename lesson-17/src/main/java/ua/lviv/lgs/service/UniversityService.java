package ua.lviv.lgs.service;

import java.util.List;

import ua.lviv.lgs.domain.University;

public interface UniversityService {

	University create(University university);

	List<University> createAll(List<University> universitiesList);

	University findById(int id);

	University update(University university);

	void deleteById(int id);

	List<University> findAll();

	University findByName(String name);

	List<University> findByNumberOfStudents(int numberOfStudents);
}
