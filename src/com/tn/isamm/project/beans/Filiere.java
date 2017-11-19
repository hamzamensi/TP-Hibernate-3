package com.tn.isamm.project.beans;

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

import com.tn.isamm.project.service.LigneMatiereFiliereService;

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
    @OneToMany(mappedBy = "filiere")
	private Set<LigneMatiereFiliere> matieres;
	public Filiere( String code, String libelle) {
		this.code = code;
		this.libelle = libelle;
		this.etudiant = new HashSet<Etudiant>();
		this.matieres = new HashSet<LigneMatiereFiliere>();
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
	public Set<Etudiant> getEtudiant() {
		return etudiant;
	}
	public void setEtudiant(Set<Etudiant> etudiant) {
		this.etudiant = etudiant;
	}
	public Set<LigneMatiereFiliere> getMatieres() {
		return matieres;
	}
	public void setMatieres(Set<LigneMatiereFiliere> matieres) {
		this.matieres = matieres;
	}
	@Override
	public String toString() {
		return "Filiere [id=" + id + ", code=" + code + ", libelle=" + libelle
				+ "]";
	}
	
	
	
}
