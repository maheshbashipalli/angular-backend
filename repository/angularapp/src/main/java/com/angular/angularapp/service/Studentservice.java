package com.angular.angularapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.angular.angularapp.entityclass.StudentEntity;
import com.angular.angularapp.repository.StudentRepository;
@Service
public class Studentservice {
	@Autowired
	private StudentRepository studentRepository;
	
	public StudentEntity insertStudent(StudentEntity student) {
		return studentRepository.save(student);
	}
	
	public List getAll() {
		return studentRepository.findAll();
		}
	
	//public Optional<StudentEntity> findByStudentId(long studentId);
	
	public Optional<StudentEntity> findByStudentId(long studentId){
	return studentRepository.findById(studentId);
	}
	
	public StudentEntity save(StudentEntity student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
		}
	public void delete(StudentEntity student){
		studentRepository.delete(student);
		}
	

	
	
}
	



