package com.Noot.PinguGaming.model;


import java.io.Serializable;

import jakarta.persistence.*;

@Entity
public class Videogiochi implements Serializable 
{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(nullable = false, updatable = false)
private Long id;
private String nome;
private String tipologia;
private String data_uscita;
private String piattaforma;
private int gioco_key;
@Column(nullable = false, updatable = false)
private int prezzo;


public Videogiochi() {
	
}


public Videogiochi(Long id, String nome, String tipologia, String data_uscita, String piattaforma, int gioco_key,
	int prezzo) {
	super();
	this.id = id;
	this.nome = nome;
	this.tipologia = tipologia;
	this.data_uscita = data_uscita;
	this.piattaforma = piattaforma;
	this.gioco_key = gioco_key;
	this.prezzo = prezzo;
}



public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getTipologia() {
	return tipologia;
}
public void setTipologia(String tipologia) {
	this.tipologia = tipologia;
}
public String getData_uscita() {
	return data_uscita;
}
public void setData_uscita(String data_uscita) {
	this.data_uscita = data_uscita;
}
public String getPiattaforma() {
	return piattaforma;
}
public void setPiattaforma(String piattaforma) {
	this.piattaforma = piattaforma;
}
public int getGioco_key() {
	return gioco_key;
}
public void setGioco_key(int gioco_key) {
	this.gioco_key = gioco_key;
}
public int getPrezzo() {
	return prezzo;
}
public void setPrezzo(int prezzo) {
	this.prezzo = prezzo;
}


















}






