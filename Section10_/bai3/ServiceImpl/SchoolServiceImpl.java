package ServiceImpl;

import java.util.Scanner;

import Model.Laptop;
import Model.School;
import Service.LaptopService;
import Service.SchoolService;

public class SchoolServiceImpl implements SchoolService {

	@Override
	public void input(School school) {
		System.out.println("Vui long nhap thong tin School");

		System.out.println("Vui long nhap ID");
		school.setId(new Scanner(System.in).nextInt());
		
		System.out.println("Vui long nhap Name");
		school.setName(new Scanner(System.in).nextLine());

	}

	@Override
	public void info(School school) {
		System.out.println("ID: " + school.getId() + " Name: " + school.getName());
	}
}
