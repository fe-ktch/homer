import java.util.Scanner;

class Homer {
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);	

    System.out.println("----------------------------------");
	System.out.println("Keszitette: Sangare Fantha Felisha\nFeladat: Homerseklet szamitas\n2022-02-17, SZOFT I N");
	System.out.println("----------------------------------");

	double number1, number2, kul, a;
	
	System.out.print("Elso homerseklet erteke: ");
	number1 = scan.nextInt();
	
	System.out.print("Masodik homerseklet erteke: ");
	number2 = scan.nextInt();
	
	if(number1 > number2){
	kul = number1 - number2;
	a = number1;
	System.out.print("A ket ertek kulonbsege: %.3f", kul);
    System.out.println("\nA nagyobbik ertek: " + a);
    }
	else {
	kul = number2 - number1;
	a = number2;
	System.out.print("A ket ertek kulonbsege: %.3f", kul);
	System.out.println("\nA nagyobbik ertek: " + a);
	}

	}
}