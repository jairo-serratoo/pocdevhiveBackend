package com.example.demoJava.dao;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demoJava.models.TrackingModel;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;

@Component("trackingDao")
public class TrackingDao {

	@Autowired
	private Firestore firestore;
	final Logger logger = LoggerFactory.getLogger(TrackingDao.class);

	public List<TrackingModel> getAll() throws Exception {
		logger.info("inicia peticion en la consulta a firebase");
		final List<TrackingModel> result = new ArrayList<TrackingModel>();
		final ApiFuture<QuerySnapshot> query = getCollection().get();
		final List<QueryDocumentSnapshot> documents = query.get().getDocuments();
		logger.info("antes del for");
		for (final QueryDocumentSnapshot doc : documents) {
			final TrackingModel object = doc.toObject(TrackingModel.class);
			object.setId(doc.getId());
			object.setLatitude("19.4183168");
			object.setLongitude("-99.155968");
			result.add(object);
		}
		return result;
	}

	public TrackingModel get(final String id) throws Exception {
		final DocumentReference ref = getCollection().document(id);
		final ApiFuture<DocumentSnapshot> futureDoc = ref.get();
		final DocumentSnapshot document = futureDoc.get();
		if (document.exists()) {
			final TrackingModel object = document.toObject(TrackingModel.class);
			object.setId(document.getId());
			object.setLatitude("19.4183168");
			object.setLongitude("-99.155968");
			return object;
		}
		return null;
	}

	public String save(final TrackingModel entity, final String id) throws Exception {
		if (id == null || id.length() == 0) {
			return getCollection().add(entity).get().getId();
		}
		final DocumentReference reference = getCollection().document(id);
		reference.set(reference);
		return reference.getId();

	}

	public String save(final TrackingModel entity) throws Exception {

		return save(entity, null);
	}

	public void delete(final String id) throws Exception {
		getCollection().document(id).delete().get();
	}

	public CollectionReference getCollection() {
		final CollectionReference reference = firestore.collection("tracking");
		return reference;
	}

}
