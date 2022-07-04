package br.com.rwan.model;

import java.math.BigInteger;

public class AlbumFoto {
	
	private BigInteger sequenceAlbumFoto;
	
	private Album sequenceAlbum;
	private Foto sequenceFoto;
	
	
	public BigInteger getSequenceAlbumFoto() {
		return sequenceAlbumFoto;
	}
	public void setSequenceAlbumFoto(BigInteger sequenceAlbumFoto) {
		this.sequenceAlbumFoto = sequenceAlbumFoto;
	}
	public Album getSequenceAlbum() {
		return sequenceAlbum;
	}
	public void setSequenceAlbum(Album sequenceAlbum) {
		this.sequenceAlbum = sequenceAlbum;
	}
	public Foto getSequenceFoto() {
		return sequenceFoto;
	}
	public void setSequenceFoto(Foto sequenceFoto) {
		this.sequenceFoto = sequenceFoto;
	}
}
