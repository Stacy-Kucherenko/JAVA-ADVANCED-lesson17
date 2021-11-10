package ua.lviv.lgs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.lviv.lgs.dao.UniversityRepository;
import ua.lviv.lgs.domain.University;
import ua.lviv.lgs.service.UniversityService;

@Service
public class UniversityServiceImpl implements UniversityService {

	@Autowired
	private UniversityRepository universityRepository;

	@Override
	public University create(University university) {
		return universityRepository.save(university);
	}

	@Override
	public List<University> createAll(List<University> universitiesList) {
		return universityRepository.saveAll(universitiesList);
	}

	@Override
	public List<University> findAll() {
		return universityRepository.findAll();
	}

	@Override
	public University findById(int id) {
		return universityRepository.getOne(id);
	}

	@Override
	public University findByName(String name) {
		return universityRepository.findByName(name);
	}

	@Override
	public List<University> findByNumberOfStudents(int numberOfStudents) {
		return universityRepository.findByNumberOfStudents(numberOfStudents);
	}

	@Override
	public University update(University university) {
		return universityRepository.save(university);
	}

	@Override
	public void deleteById(int id) {
		universityRepository.deleteById(id);
	}

}
