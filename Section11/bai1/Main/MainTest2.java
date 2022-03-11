package Main;

import Model.FoodMenu;

public class MainTest2 {

	public static void main(String[] args) {
		for (FoodMenu foodMenu : FoodMenu.values()) {
			System.out.println(foodMenu.getId());
			System.out.println(foodMenu.getName());
		}

	}

}
