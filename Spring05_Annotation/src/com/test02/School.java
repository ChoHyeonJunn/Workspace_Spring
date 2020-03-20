package com.test02;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class School {

//	@Autowired				byType
//	@Qualifier("cho")

	@Resource(name = "cho") // byName -> byType
	private Student student;
	private int grade;

	public School() {
		super();
	}

	public School(Student student, int grade) {
		super();
		this.student = student;
		this.grade = grade;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "School [student=" + student + ", 학년=" + grade + "]";
	}

}
