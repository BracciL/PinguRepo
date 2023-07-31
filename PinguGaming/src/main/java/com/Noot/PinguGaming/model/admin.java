package com.Noot.PinguGaming.model;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
public class admin implements Serializable 
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
	private int id_admin;
	private String username_admin;
	private String email_admin;
	private String password_admin;
	
	
	
	
	
	
	
	
	
	
	public admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public admin(int id_admin, String username_admin, String email_admin, String password_admin) {
		super();
		this.id_admin = id_admin;
		this.username_admin = username_admin;
		this.email_admin = email_admin;
		this.password_admin = password_admin;
	}
	public int getId_admin() {
		return id_admin;
	}
	public void setId_admin(int id_admin) {
		this.id_admin = id_admin;
	}
	public String getUsername_admin() {
		return username_admin;
	}
	public void setUsername_admin(String username_admin) {
		this.username_admin = username_admin;
	}
	public String getEmail_admin() {
		return email_admin;
	}
	public void setEmail_admin(String email_admin) {
		this.email_admin = email_admin;
	}
	public String getPassword_admin() {
		return password_admin;
	}
	public void setPassword_admin(String password_admin) {
		this.password_admin = password_admin;
	}
	
	
	
	
}
