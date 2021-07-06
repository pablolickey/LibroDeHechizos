package hechizos;

public class Agrandar extends Hechizo{

	public Agrandar(String conjuro) {
		super(conjuro);
	}
	
	public void aplicarHechizo(Hechizable hechizable) {
		hechizable.serAgrandado();
	}

}
