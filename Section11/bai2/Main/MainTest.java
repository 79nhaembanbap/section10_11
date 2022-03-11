package Main;

import Model.Employee;

public class MainTest {
	public static void main(String[] args) {
		Employee employee = new Employee() {
			@Override
			public void salary() {
				System.out.println("10 trieu");
			}
		};
		employee.salary();
	}

}
