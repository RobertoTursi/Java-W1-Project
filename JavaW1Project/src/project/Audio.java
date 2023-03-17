package project;

public class Audio extends ElementoMultimediale implements Play, Volume {
	
	
	
	public Audio(String titolo) {
		super(titolo);
		this.durata = 4;
		this.volume = 8;
	}

	@Override
	public void play() {
		String stringa = this.titolo;
		for(int i = 0; i < this.volume; i++) {
			stringa = stringa + "!";
		}
		for(int i = 0; i < this.durata; i++) {
			System.out.println(stringa);
		}
		
		
	}

	@Override
	public void abbassaVolume() {
		this.volume++;
		
	}

	@Override
	public void alzaVolume() {
		this.volume--;
		
	}
}
