package com.tn.isamm.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="matiere")
public class Matiere {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String code;
	private String libelle;
	@ManyToOne
	private Formateur formateur;
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name = "filierematiere", joinColumns = @JoinColumn(name = "id_m", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "id_f", referencedColumnName = "id"))
	private Set<Filiere> filieres;
	
	public Matiere(String code, String libelle) {
		this.code = code;
		this.libelle = libelle;
	}
	
	public Matiere(String code, String libelle, Formateur formateur) {
		super();
		this.code = code;
		this.libelle = libelle;
		this.formateur = formateur;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Formateur getFormateur() {
		return formateur;
	}

	public void setFormateur(Formateur formateur) {
		this.formateur = formateur;
	}
	
	

}
