package br.com.rwan.model;

import java.util.Date;

public class FotoAgrupamento {
	
	private Foto sequenceFoto;
	private Agrupamento codigoAgrupamento;
	private String descricao;
	private Date dataCriacao;
	
	
	public Foto getSequenceFoto() {
		return sequenceFoto;
	}
	public void setSequenceFoto(Foto sequenceFoto) {
		this.sequenceFoto = sequenceFoto;
	}
	public Agrupamento getCodigoAgrupamento() {
		return codigoAgrupamento;
	}
	public void setCodigoAgrupamento(Agrupamento codigoAgrupamento) {
		this.codigoAgrupamento = codigoAgrupamento;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Date getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
}
