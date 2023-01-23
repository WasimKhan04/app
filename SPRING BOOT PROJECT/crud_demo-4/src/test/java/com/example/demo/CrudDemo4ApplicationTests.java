package com.example.demo;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entities.Student;
import com.example.demo.repository.StudentRepository;

@SpringBootTest
class CrudDemo4ApplicationTests {
	
	@Autowired
	private StudentRepository studentrepo;

	@Test
	void saveOneStudent() {
		Student s=new Student();
		s.setName("RITU");
		s.setCourse("WIPRO");
		s.setFee(36000);
		studentrepo.save(s);
	}
	
	@Test
	void deleteOneStudent() {
		studentrepo.deleteById(11L);
	}
	
	@Test
	void findById() {
		Optional<Student> findById = studentrepo.findById(2L);
		Student student = findById.get();
		System.out.println(student.getId());
		System.out.println(student.getName());
		System.out.println(student.getCourse());
		System.out.println(student.getFee());
	}
	
	@Test
	void findByCourse() {
		Student findByCourse = studentrepo.findByCourse("Testing");
        System.out.println(findByCourse.getId());
        System.out.println(findByCourse.getName());
        System.out.println(findByCourse.getCourse());
        System.out.println(findByCourse.getFee());
	}
	
	@Test
	void updateOneStudent() {
		Optional<Student> findById = studentrepo.findById(1L);
		Student student = findById.get();
		student.setCourse(".NET DEVELOPER");
		studentrepo.save(student);
	}
	
	@Test
	void findAllStudent() {
		Iterable<Student> findAll = studentrepo.findAll();
		for (Student student : findAll) {
			System.out.print(student.getId()+"  ");
			System.out.print(student.getName()+"  ");
			System.out.print(student.getCourse()+"  ");
			System.out.print(student.getFee()+"  ");
			System.out.println();
			
		}
	}

}
