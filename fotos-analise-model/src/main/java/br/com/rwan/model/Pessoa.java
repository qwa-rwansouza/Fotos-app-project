package br.com.rwan.model;

import java.util.Date;

public class Pessoa {
	
	private Integer sequencePessoa;
	private Integer numeroCpf;
	private Integer numeroCPf;
	private Date dataNascimento;
	private String textoNome;

	public Pessoa() {

	}
	
	
	public Integer getSequencePessoa() {
		return sequencePessoa;
	}
	public void setSequencePessoa(Integer sequencePessoa) {
		this.sequencePessoa = sequencePessoa;
	}
	public Integer getNumeroCpf() {
		return numeroCpf;
	}
	public void setNumeroCpf(Integer numeroCpf) {
		this.numeroCpf = numeroCpf;
	}
	public Integer getNumeroCPf() {
		return numeroCPf;
	}
	public void setNumeroCPf(Integer numeroCPf) {
		this.numeroCPf = numeroCPf;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getTextoNome() {
		return textoNome;
	}
	public void setTextoNome(String textoNome) {
		this.textoNome = textoNome;
	}
}
