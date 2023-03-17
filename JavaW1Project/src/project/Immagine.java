package project;

public class Immagine extends ElementoMultimediale implements Luminosità, Show{

	
	
	public Immagine(String titolo) {
		super(titolo);
		this.luminosità = 5;
	}
	
	@Override
	public String show() {
		String stringa = this.titolo;
		for(int i = 0; i < this.luminosità; i++) {
			stringa = stringa + "*"; 
		}
		return stringa;
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
