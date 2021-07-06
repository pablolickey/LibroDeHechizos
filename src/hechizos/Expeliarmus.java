package hechizos;

public class Expeliarmus extends Hechizo {
	
	public Expeliarmus(String conjuro) {
		super(conjuro);
	}

	public void aplicarHechizo(Hechizable hechizado) {
		hechizado.serDesarmado();
	}



}
