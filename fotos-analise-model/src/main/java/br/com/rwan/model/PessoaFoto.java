package br.com.rwan.model;

import java.math.BigInteger;

public class PessoaFoto {
	
	private BigInteger sequencePessoaFoto;
	private Foto sequenceFoto;
	private Pessoa sequencePessoa;
	
	public BigInteger getSequencePessoaFoto() {
		return sequencePessoaFoto;
	}
	public void setSequencePessoaFoto(BigInteger sequencePessoaFoto) {
		this.sequencePessoaFoto = sequencePessoaFoto;
	}
	public Foto getSequenceFoto() {
		return sequenceFoto;
	}
	public void setSequenceFoto(Foto sequenceFoto) {
		this.sequenceFoto = sequenceFoto;
	}
	public Pessoa getSequencePessoa() {
		return sequencePessoa;
	}
	public void setSequencePessoa(Pessoa sequencePessoa) {
		this.sequencePessoa = sequencePessoa;
	}
}
