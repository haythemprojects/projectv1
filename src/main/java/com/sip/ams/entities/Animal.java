package com.sip.ams.entities;



public class Animal {

	private String nom;
	private int age;
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	public Animal(String nom,int age) {
		// TODO Auto-generated constructor stub
		this.nom=nom;
		this.age=age;
	}
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return this.nom+this.age;
	}
}
