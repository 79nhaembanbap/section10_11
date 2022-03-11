package ServiceImpl;

import java.util.Scanner;

import Model.Address;
import Model.Laptop;
import Model.School;
import Model.Student;
import Service.LaptopService;
import Service.StudentService;

public class StudentServiceImpl implements StudentService {

	@Override
	public void input(Student student) {
		System.out.println("Vui long nhap thong tin student");

		
		System.out.println("Vui long nhap ID");
		student.setId(new Scanner(System.in).nextInt());

		Scanner scan2 = new Scanner(System.in);
		System.out.println("Vui long nhap Name");
		student.setName(new Scanner(System.in).nextLine());

		Scanner scan3 = new Scanner(System.in);
		System.out.println("Vui long nhap Age");
		student.setAge(new Scanner(System.in).nextInt());

		School school = new School();
		SchoolServiceImpl schoolServiceImpl = new SchoolServiceImpl();
		schoolServiceImpl.input(school);

		Address address = new Address();
		AddressServiceImpl addressServiceImpl = new AddressServiceImpl();
		addressServiceImpl.input(address);

		student.setSchool(school);
		student.setAddress(address);

	}

	@Override
	public void info(Student st) {

		System.out.println("ID: " + st.getId() + " Name: " + st.getName() + " Age: " + st.getAge());

		if (st.getAddress() != null) {
			AddressServiceImpl adsv = new AddressServiceImpl();
			adsv.info(st.getAddress());
		}

		if (st.getSchool() != null) {
			SchoolServiceImpl scsv = new SchoolServiceImpl();
			scsv.info(st.getSchool());
		}
	}
}
