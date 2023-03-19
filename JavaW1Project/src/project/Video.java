package project;

public class Video extends ElementoMultimediale implements Play, Volume, Luminosità{

	

	public Video(String titolo, int volume, int durata, int luminosità){
		super(titolo);
		this.durata = 4;
		this.luminosità = 10;
		this.volume = 7;
	}
	
	
	@Override
	public void play() {
		String stringa = this.titolo;
		for(int i = 0; i < this.volume; i++) {
			stringa = stringa + "!";
		}
		for(int i = 0; i < this.durata; i++) {
			stringa = stringa + "*";
		}
		for(int i = 0; i < this.luminosità; i++) {
			System.out.println(stringa);
		}
		
	}
	
	
	@Override
	public void aumentaLuminosità() {
		this.luminosità++;
		
	}

	@Override
	public void diminuisciLuminosità() {
		this.luminosità--;
		
	}

	@Override
	public void abbassaVolume() {
		this.volume--;
		
	}

	@Override
	public void alzaVolume() {
		this.volume++;
		
	}

	

}
