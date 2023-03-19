package project;

import java.util.Scanner;

public class LettoreMultimediale {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		ElementoMultimediale[] arrayOfMedia = new ElementoMultimediale[5];
		
		LettoreMultimediale.setArray(arrayOfMedia);
	}
	
	static public void setArray(ElementoMultimediale[] arrayOfMedia) {
		//ElementoMultimediale[] arrayOfMedia = new ElementoMultimediale[5];
		for(int i = 0; i < arrayOfMedia.length; i++) {
			System.out.println("inserisci la tipologia di media (audio, video o immagine)");
			String elem = scanner.nextLine();
			if(elem.equals("audio")) {
				System.out.println("inserisci il titolo");
				String title = scanner.nextLine();
				System.out.println("Inserisci il volume");
				int volume = scanner.nextInt();
				System.out.println("Inserisci la durata");
				int durata = scanner.nextInt();
				Audio audio = new Audio(title, volume, durata);
				arrayOfMedia[i] = audio; 
			} else if(elem.equals("video")) {
				System.out.println("inserisci il titolo");
				String title = scanner.nextLine();
				System.out.println("Inserisci il volume");
				int volume = scanner.nextInt();
				System.out.println("Inserisci la durata");
				int durata = scanner.nextInt();
				System.out.println("Inserisci la luminosità");
				int luminosità = scanner.nextInt();
				Video video = new Video(title, volume, durata, luminosità);
				arrayOfMedia[i] = video;
			} else if(elem.equals("immagine")) {
				System.out.println("inserisci il titolo");
				String title = scanner.nextLine();
				System.out.println("Inserisci la luminosità");
				int luminosità = scanner.nextInt();
				Immagine immagine = new Immagine(title, luminosità);
				arrayOfMedia[i] = immagine;
			} else {
				System.out.println("comando sconoscito, riprova selezionando uno tra 'audio', 'video' o 'immagine'");
				i--;
				continue;
			}
			scanner.nextLine();
		}
		
		
		
		int answer = 10;
		while(answer != 0) {
			System.out.println("Inserisci un valore da 1 a 5, oppure 0 per uscire");
			answer = scanner.nextInt();
			if(answer != 0) {
				if(arrayOfMedia[answer-1] instanceof Video) {
					Video v = (Video) arrayOfMedia[answer-1];
					v.play();
				}else if (arrayOfMedia[answer-1] instanceof Immagine){
					Immagine i = (Immagine) arrayOfMedia[answer-1];
					i.show();
				}else {
					Audio a = (Audio) arrayOfMedia[answer-1];
					a.play();
				}
			}else {
				break;
			}
		}	
	}
}
