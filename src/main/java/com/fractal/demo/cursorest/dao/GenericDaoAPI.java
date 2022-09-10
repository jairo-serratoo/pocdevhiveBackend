//package com.fractal.demo.cursorest.dao;
//
//import java.lang.reflect.ParameterizedType;
//import java.lang.reflect.Type;
//import java.util.ArrayList;
//import java.util.List;
//
//import org.apache.commons.beanutils.PropertyUtils;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import com.google.api.core.ApiFuture;
//import com.google.cloud.firestore.CollectionReference;
//import com.google.cloud.firestore.DocumentReference;
//import com.google.cloud.firestore.DocumentSnapshot;
//import com.google.cloud.firestore.QueryDocumentSnapshot;
//import com.google.cloud.firestore.QuerySnapshot;
//
//public abstract class GenericDaoAPI<Entity> implements IGenericDaoAPI<Entity> {
//
//	final Logger logger = LoggerFactory.getLogger(GenericDaoAPI.class);
//	private final Class<Entity> clazz;
//
//	@SuppressWarnings("unchecked")
//	public GenericDaoAPI() {
//		final Type t = getClass().getGenericSuperclass();
//		final ParameterizedType pt = (ParameterizedType) t;
//		clazz = (Class<Entity>) pt.getActualTypeArguments()[0];
//	}
//
//	@Override
//	public String save(final Entity entity, final String id) throws Exception {
//		if (id == null || id.length() == 0) {
//			return getCollection().add(entity).get().getId();
//		}
//		final DocumentReference reference = getCollection().document(id);
//		reference.set(reference);
//		return reference.getId();
//
//	}
//
//	@Override
//	public String save(final Entity entity) throws Exception {
//
//		return this.save(entity, null);
//	}
//
//	@Override
//	public void delete(final String id) throws Exception {
//		getCollection().document(id).delete().get();
//
//	}
//
//	@Override
//	public Entity get(final String id) throws Exception {
//		final DocumentReference ref = getCollection().document(id);
//		final ApiFuture<DocumentSnapshot> futureDoc = ref.get();
//		final DocumentSnapshot document = futureDoc.get();
//		if (document.exists()) {
//			final Entity object = document.toObject(clazz);
//			PropertyUtils.setProperty(object, "id", document.getId());
//			return object;
//		}
//		return null;
//	}
//
//	@Override
//	public List<Entity> getAll() throws Exception {
//		logger.info("inicia peticion en la consulta a firebase");
//		final List<Entity> result = new ArrayList<Entity>();
//		final ApiFuture<QuerySnapshot> query = getCollection().get();
//		final List<QueryDocumentSnapshot> documents = query.get().getDocuments();
//		logger.info("antes del for");
//		for (final QueryDocumentSnapshot doc : documents) {
//			final Entity object = doc.toObject(clazz);
//			PropertyUtils.setProperty(object, "id", doc.getId());
//			result.add(object);
//		}
//		return result;
//	}
//
//	@Override
//	public abstract CollectionReference getCollection();
//
//}
