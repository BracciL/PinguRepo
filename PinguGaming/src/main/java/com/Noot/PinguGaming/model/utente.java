package com.Noot.PinguGaming.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class utente implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, updatable = false)
	private int id_utente;
	private String username_utente;
	private String password_utente;
	private String email_utente;
	
	public int getId_admin() {
		return id_utente;
	}
	public void setId_admin(int id_admin) {
		this.id_utente = id_admin;
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
	public String getEmail_utente() {
		return email_utente;
	}
	public void setEmail_utente(String email_utente) {
		this.email_utente = email_utente;
	}
	public String getSaldo_utente() {
		return saldo_utente;
	}
	public void setSaldo_utente(String saldo_utente) {
		this.saldo_utente = saldo_utente;
	}
	private String saldo_utente;
	

}
