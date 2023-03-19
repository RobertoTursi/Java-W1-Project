package project;

public class Immagine extends ElementoMultimediale implements Luminosità, Show{

	
	
	public Immagine(String titolo, int luminosità) {
		super(titolo);
		this.luminosità = luminosità;
	}
	
	@Override
	public void show() {
		String stringa = this.titolo;
		for(int i = 0; i < this.luminosità; i++) {
			stringa = stringa + "*"; 
		}
		System.out.println(stringa);
	}

	@Override
	public void aumentaLuminosità() {
		this.luminosità++;
		
	}

	@Override
	public void diminuisciLuminosità() {
		this.luminosità--;
		
	}

}
