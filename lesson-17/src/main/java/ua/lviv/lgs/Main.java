package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.expression.ParseException;

import ua.lviv.lgs.domain.University;
import ua.lviv.lgs.service.UniversityService;

@SpringBootApplication
public class Main {

	public static void main(String[] args) throws ParseException {
		ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);
		
		UniversityService universityService = context.getBean(UniversityService.class);

		List<University> universitiesList = new ArrayList<>();
		universitiesList.add(new University("Київський національний університет імені Тараса Шевченка", 13, 18000, "Киев"));
		universitiesList.add(new University("Київський політехнічний інститут імені Ігоря Сікорського", 18, 16900, "Киев"));
		universitiesList.add(new University("Львівський національний університет імені Івана Франка", 19, 18000, "Львов"));
		universitiesList.add(new University("Одеський національний університет імені І. І. Мечникова", 15, 7700, "Одеса"));
		universitiesList.add(new University("Сумський державний університет", 12, 7500, "Сумы"));
		
		universityService.createAll(universitiesList);
		
		System.out.println(universityService.findById(1));

		System.out.println(universityService.findByNumberOfStudents(18000));
		
		University university = universityService.findByName("Сумський державний університет");
		university.setNumberOfFaculties(11);
		universityService.update(university);

		universityService.findAll().stream().forEach(System.out::println);
		
		universityService.deleteById(3);
	}
}
