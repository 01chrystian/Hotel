package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Registration;

public class Bedrooms {

	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String name;
		String email;
		int room = 0;

		Registration[] emptyRooms = new Registration[10];
		System.out.print("How many rooms will be rented? ");
		int numberBedrooms = sc.nextInt();

		for (int i = 0; i < numberBedrooms; i++) {

			System.out.println("__________________________");
			System.out.println("Rent #" + (i + 1) + ":");

			System.out.print("Name: ");
			sc.nextLine();
			name = sc.nextLine();

			System.out.print("Email: ");
			email = sc.next();

			System.out.print("Room: ");
			room = sc.nextInt();
			emptyRooms[room] = new Registration(name, email, room);

		}
		System.out.print("\nBusy rooms: \n");
		for (Registration elemento : emptyRooms) {
			if (elemento != null) {
				System.out.print(elemento.Print() + "\n");
			}
		}

		sc.close();
	}

}
