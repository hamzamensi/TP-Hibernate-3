package com.tn.isamm.project.beans;

import java.util.HashSet;
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
	private Formateur formateurs;
    @OneToMany(mappedBy = "matiere", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<LigneMatiereFiliere> filieres;
	
	public Matiere(String code, String libelle) {
		this.code = code;
		this.libelle = libelle;
		this.filieres = new HashSet<LigneMatiereFiliere>();
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

	public Formateur getFormateurs() {
		return formateurs;
	}



	public void setFormateurs(Formateur formateurs) {
		this.formateurs = formateurs;
	}



	public Set<LigneMatiereFiliere> getFilieres() {
		return filieres;
	}



	public void setFilieres(Set<LigneMatiereFiliere> filieres) {
		this.filieres = filieres;
	}



	@Override
	public String toString() {
		return "Matiere [id=" + id + ", code=" + code + ", libelle=" + libelle
				+ "]";
	}

	
	
	

}
