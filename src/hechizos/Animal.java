package hechizos;

public class Animal implements Hechizable {
	
	private String estado;

	@Override
	public String getEstado() {
		return estado;
	}

	@Override
	public void serDesarmado() {
		this.estado="Me desarmaron";
		
	}

	@Override
	public void serAgrandado() {
		this.estado="Me agrandaron";
		
	}
	

}
