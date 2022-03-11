package maintest2;

import Model.Laptop;
import Model.Student;
import Service.LaptopService;
import Service.StudentService;
import ServiceImpl.LaptopServiceImpl;
import ServiceImpl.StudentServiceImpl;

public class maintest {

	public static void main(String[] args) {
		Student student = new Student();
		StudentService studentService = new StudentServiceImpl();
		studentService.input(student);
		studentService.info(student);
	}

}
