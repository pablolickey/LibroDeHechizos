package hechizos;

public abstract class Hechizo {
	
	private String conjuro;
	
	public Hechizo(String conjuro){
		this.conjuro=conjuro;
	}
	
	public abstract void aplicarHechizo(Hechizable hechizable);

	public String getConjuro() {
		return this.conjuro;
	}

}
