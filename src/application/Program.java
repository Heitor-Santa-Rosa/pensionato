package application;

import java.text.ParseException;
import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		
		Rent[] vect = new Rent[10];
		
		System.out.print("How many rooms will be rented? ");
		int N = sc.nextInt();
				
		for (int i=0; i<N; i++) {
			System.out.println();
			System.out.println("Rent #" + (i+1) + ":" );
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("E-mail: ");
			String eMail = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			vect[room] = new Rent(name, eMail);
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		for (int i=0; i<10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
		}
			
			sc.close();
		}
	}
}
