package com.tn.isamm.project.inter;

import java.util.List;

public interface IDao<T> {
	public boolean create(T obj);
	public List<T> getAll();
	public boolean delete (int id);
	public boolean update (int id,T obj);
	public T getById(int id);
}
