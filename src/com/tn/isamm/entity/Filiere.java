package com.tn.isamm.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="filiere")
public class Filiere {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id ;
	private String code ;
	private String libelle ;
	@OneToMany
	private Set<Etudiant> etudiant ;
	@ManyToMany(mappedBy="filieres")
	private Set<Matiere> matieres;
	public Filiere( String code, String libelle) {
		this.code = code;
		this.libelle = libelle;
		etudiant = new HashSet<Etudiant>();
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
	
	
}
