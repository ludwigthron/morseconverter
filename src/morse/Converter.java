package morse;

import java.util.Scanner;

public class Converter {

	public String convert(String input) {
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		int decision;
		String convert = "";
		
		//Dubbla arrays som motsvarar varandra i morse och alfabet
		char[] Letters = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
				's', 't', 'z', 'v', 'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', ',', '.', '?',
				' ' };
		String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
				"-.", "---", ".---.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
				"..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----", "--..--", ".-.-.-",
				"..--..", " " };
		
		
		
		// val mellan morse till ord eller ord till morse gjorde med do while loop
		System.out.println("Vill du �vers�tta bokst�ver till morse eller vice versa?");
		System.out.println("________________________________________________________");
		System.out.println("1 = bokst�ver till morse.");
		System.out.println("(Mata in bokst�ver i f�ljd utan mellanslag)");
		System.out.println("2 = morse till bokst�ver.");
		System.out.println("(Mata in dina kodade bokst�ver med mellanslag f�r varje ny bokstav)");
		do {
			decision = scan.nextInt();
		} while (decision < 1 || decision > 2);
		
		
		
		String userInput = scan2.nextLine();
		userInput = userInput.toLowerCase();
		// if sats f�r ���
		if(userInput.equals("�")) {
			System.out.println("That letter is not part of the english alphabet.");
		}
		if(userInput.equals("�")) {
			System.out.println("That letter is not part of the english alphabet.");
		}
		if(userInput.equals("�")) {
			System.out.println("That letter is not part of the english alphabet.");
		}
		
		if (decision == 1) { 
			// NESTED FOR LOOP SOM G�R IGENOM F�RST ARRAY CHAR SEN J�MNF�R S� ATT T.EX. ETT A=0 I CHAR ARRAYEN �R LIKA MED 0 I LETTERS ARRAY
			char[] chars = userInput.toCharArray();	
			for (int i = 0; i < chars.length; i++) 
				for (int j = 0; j < Letters.length; j++) {
																							
					if (chars[i] == Letters[j]) {
						convert += morse[j] + " ";																		
}
}

					System.out.println(convert);
					return convert;
}
		
		if (decision == 2) {
			// Samma som ovan fast morse till bokst�ver.								
			String[] strings = userInput.split(" ");
			for (int i = 0; i < strings.length; i++) {
				for (int j = 0; j < morse.length; j++) 
					
					if (strings[i].equals(morse[j])) {
						convert = convert + String.valueOf(Letters[j]  + "");
					
}
}
					System.out.println(convert);
}					
		return convert;
}
}