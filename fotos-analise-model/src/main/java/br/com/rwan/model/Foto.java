package br.com.rwan.model;


public class Foto {
	
	private Integer sequenceFoto;
	private String endereco;
	private String numeroCPf;
	
	public Foto() {
		
	}

	public Integer getSequenceFoto() {
		return sequenceFoto;
	}

	public void setSequenceFoto(Integer sequenceFoto) {
		this.sequenceFoto = sequenceFoto;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNumeroCPf() {
		return numeroCPf;
	}

	public void setNumeroCPf(String numeroCPf) {
		this.numeroCPf = numeroCPf;
	}
}
