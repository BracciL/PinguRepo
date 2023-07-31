package com.Noot.PinguGaming.model;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
public class Vendite implements Serializable {
     
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, updatable = false)
	private int id_vendita;
	private String email_utente;
	private String username_utente;
	private String password_utente;
	
	
	
	
	public Vendite() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vendite(int id_vendita, String email_utente, String username_utente, String password_utente) {
		super();
		this.id_vendita = id_vendita;
		this.email_utente = email_utente;
		this.username_utente = username_utente;
		this.password_utente = password_utente;
	}
	public int getId_vendita() {
		return id_vendita;
	}
	public void setId_vendita(int id_vendita) {
		this.id_vendita = id_vendita;
	}
	public String getEmail_utente() {
		return email_utente;
	}
	public void setEmail_utente(String email_utente) {
		this.email_utente = email_utente;
	}
	public String getUsername_utente() {
		return username_utente;
	}
	public void setUsername_utente(String username_utente) {
		this.username_utente = username_utente;
	}
	public String getPassword_utente() {
		return password_utente;
	}
	public void setPassword_utente(String password_utente) {
		this.password_utente = password_utente;
	}
	
	
	
	
	
}
