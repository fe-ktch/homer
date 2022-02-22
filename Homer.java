/*
* File: Homer.java
* Author: Sangare Fantha Felisha
* Copyright: 2022, Sangare Fantha Felisha
* Group: Szoft I N
* Date: 2022-02-22
* Github: https://github.com/fe-ktch/
* Licenc: GNU GPL
*/
import java.util.Scanner;

class Homer {
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);	

    	System.out.println("----------------------------------");
	System.out.println("Keszitette: Sangare Fantha Felisha\nFeladat: 0433\n2022-02-22, SZOFT I N");
	System.out.println("----------------------------------");

	double number1, number2, kul, a;
	
	System.out.print("Elso homerseklet erteke: ");
	number1 = scan.nextInt();
	
	System.out.print("Masodik homerseklet erteke: ");
	number2 = scan.nextInt();
	
	if(number1 > number2){
	kul = number1 - number2;
	a = number1;
	System.out.printf("A ket ertek kulonbsege: %.3f", kul);
        System.out.println("\nA nagyobbik ertek: " + a);
    }
	else {
	kul = number2 - number1;
	a = number2;
	System.out.printf("A ket ertek kulonbsege: %.3f", kul);
	System.out.println("\nA nagyobbik ertek: " + a);
	}

	}
}
