package project;

import java.util.Scanner;

public class LettoreMultimediale {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
//		Immagine i1 = new Immagine("immagine");
//		System.out.println(i1.show());
//		
//		System.out.println(i1.show());
//		
//		Audio a1  = new Audio("audio");
//		a1.play();
//		
//		Video v1 = new Video("video");
//		v1.play();
		ElementoMultimediale[] arrayOfMedia = new ElementoMultimediale[5];
		
		LettoreMultimediale.setArray(arrayOfMedia);
	}
	
	static public void setArray(ElementoMultimediale[] arrayOfMedia) {
		//ElementoMultimediale[] arrayOfMedia = new ElementoMultimediale[5];
		for(int i = 0; i < 1; i++) {
			System.out.println("inserisci la tipologia di media (audio, video o immagine)");
			String elem = scanner.nextLine();
			System.out.println("inserisci il titolo");
			String title = scanner.nextLine();
			if(elem.equals("audio")) {
				Audio audio = new Audio(title);
				arrayOfMedia[i] = audio; 
			} else if(elem.equals("video")) {
				Video video = new Video(title);
				arrayOfMedia[i] = video;
			} else if(elem.equals("immagine")) {
				Immagine immagine = new Immagine(title);
				arrayOfMedia[i] = immagine;
			} else {
				System.out.println("comando sconoscito, riprova selezionando uno tra 'audio', 'video' o 'immagine'");
				i--;
			}
		}
		
		
		
		int answer = 10;
		while(answer != 0) {
			System.out.println("Inserisci un valore da 1 a 5, oppure 0 per uscire");
			answer = scanner.nextInt();
			if(answer != 0) {
				if(arrayOfMedia[answer-1] instanceof Video) {
					System.out.println("si");
					//arrayOfMedia[answer-1].show
				}else {
					System.out.println("no");
				}
			}else {
				break;
			}

		}
		
//		for(int i = 0; i < arrayOfMedia.length; i++) {
//			if(arrayOfMedia[i] instanceof Immagine) {
//				}
	}

	
	
	

}
