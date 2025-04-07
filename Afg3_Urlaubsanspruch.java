package Tag05_ks1;

import java.util.Scanner;

public class Afg3_Urlaubsanspruch {

	public static void main(String[] args) {
		// EINGABE
		Scanner input = new Scanner(System.in);
		System.out.print("Bitte geben Sie das Alter ein: ");
		int Alter = input.nextInt();
		System.out.print("Bitte geben Sie den Grad der Behinderung an: ");
		int Behinderung = input.nextInt();
		
		// VERARBEITUNG
		int Urlaub = 0;	
		if (Alter<18) {
			Urlaub = 35;
		} else if (Alter>55) {
			Urlaub = 32;
		} else if (Alter>=18 && Alter<=55) {
			Urlaub = 30;
		}
		if (Behinderung>=50) {
			Urlaub += 5;
		} else {
		}
		// AUSGABE
		System.out.print("Der Beschäftigte hat "+Urlaub+" Tage Urlaubsanspruch");
		input.close();
	}

}