package hechizos;

public class Mueble implements Hechizable {

	private String estado;

	@Override
	public String getEstado() {
		return estado;
	}

	@Override
	public void serDesarmado() {
		this.estado="No pasa nada";
		
	}

	@Override
	public void serAgrandado() {
		this.estado="Me agrandaron";
		
	}
	
}
