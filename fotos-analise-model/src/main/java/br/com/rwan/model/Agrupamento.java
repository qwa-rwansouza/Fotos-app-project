package br.com.rwan.model;

public class Agrupamento {
	private Integer codigoAgrupamento;
	private String textoNome;
	
	public Agrupamento() {
		super();
	}
	
	public Integer getCodigoAgrupamento() {
		return codigoAgrupamento;
	}
	public void setCodigoAgrupamento(Integer codigoAgrupamento) {
		this.codigoAgrupamento = codigoAgrupamento;
	}
	public String getTextoNome() {
		return textoNome;
	}
	public void setTextoNome(String textoNome) {
		this.textoNome = textoNome;
	}
}
