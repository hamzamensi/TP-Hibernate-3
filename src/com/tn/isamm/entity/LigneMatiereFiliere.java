package com.tn.isamm.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="filierematiere")
public class LigneMatiereFiliere {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private int massehoraire;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMassehoraire() {
		return massehoraire;
	}
	public void setMassehoraire(int massehoraire) {
		this.massehoraire = massehoraire;
	}
	
	
}
