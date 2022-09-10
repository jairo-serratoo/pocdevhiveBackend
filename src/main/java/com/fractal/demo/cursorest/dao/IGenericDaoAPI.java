package com.fractal.demo.cursorest.dao;

import java.util.List;

import com.google.cloud.firestore.CollectionReference;

public interface IGenericDaoAPI<Entity> {

	String save(Entity entity, String id) throws Exception;

	String save(Entity entity) throws Exception;

	void delete(String id) throws Exception;

	Entity get(String id) throws Exception;

	List<Entity> getAll() throws Exception;

	public CollectionReference getCollection();
}
