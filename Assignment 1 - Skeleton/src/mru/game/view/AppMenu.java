package mru.game.view;

import java.util.Scanner;

public class AppMenu {

	/**
	 * This class will be used to show the menus and sub menus to the user
	 * It also prompts the user for the inputs and validates them 
	 */
	private Scanner input;
	public AppMenu() {
		input=new Scanner(System.in);
	}
	public void ShowMainMenu() {
		System.out.println("Select one of these options:");
		System.out.println("(P) Play");
		System.out.println("(S) Search");
		System.out.println("(E) Exit");
		
	}
}
