package Main;

import Model.Boss;
import Model.Employee;
import Model.Person;

public class MainTest {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.salary();

		Boss boss = new Boss();
		boss.salary();

		Person person = new Boss();
		person.salary(); 
	}

}
