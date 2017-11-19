package com.tn.isamm.project.service;

import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tn.isamm.project.beans.Filiere;
import com.tn.isamm.project.beans.LigneMatiereFiliere;
import com.tn.isamm.project.beans.Matiere;
import com.tn.isamm.project.inter.IDao;

public class LigneMatiereFiliereService implements IDao<LigneMatiereFiliere> {

	@Override
	public boolean create(LigneMatiereFiliere obj) {
		Configuration cfg = new Configuration().configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.save(obj);
			session.close();
			return true ;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}



	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(int id, LigneMatiereFiliere obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public LigneMatiereFiliere getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<LigneMatiereFiliere> getByFiliere(Filiere f){
		return f.getMatieres();
	}

	@Override
	public List<LigneMatiereFiliere> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
