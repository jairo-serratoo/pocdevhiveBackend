package com.example.demoJava.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demoJava.models.TrackingModel;

//@Component("trackingDao")
@Repository
public interface TrackingDao extends JpaRepository<TrackingModel, String> {

//	@Autowired
//	private Firestore firestore;
//	final Logger logger = LoggerFactory.getLogger(TrackingDao.class);
//
//	public List<TrackingModel> getAll() throws Exception {
//		logger.info("inicia peticion en la consulta a firebase");
//		final List<TrackingModel> result = new ArrayList<TrackingModel>();
//		final ApiFuture<QuerySnapshot> query = getCollection().get();
//		if (query != null) {
//			final List<QueryDocumentSnapshot> documents = query.get().getDocuments();
//			for (final QueryDocumentSnapshot doc : documents) {
//				final TrackingModel object = doc.toObject(TrackingModel.class);
//				object.setId(doc.getId());
//				object.setLatitude("19.4183168");
//				object.setLongitude("-99.155968");
//				result.add(object);
//			}
//
//		}
//		return result;
//	}

//	public TrackingModel get(final String id) throws Exception {
//		final DocumentReference ref = getCollection().document(id);
//		final ApiFuture<DocumentSnapshot> futureDoc = ref.get();
//		final DocumentSnapshot document = futureDoc.get();
//		if (document.exists()) {
//			final TrackingModel object = document.toObject(TrackingModel.class);
//			object.setId(document.getId());
//			object.setLatitude("19.4183168");
//			object.setLongitude("-99.155968");
//			return object;
//		}
//		return null;
//	}
//
//	public String save(final TrackingModel entity, final String id) throws Exception {
//		if (id == null || id.length() == 0) {
//			return getCollection().add(entity).get().getId();
//		}
//		final DocumentReference reference = getCollection().document(id);
//		if (reference != null) {
//			reference.set(entity);
//			return reference.getId();
//		}
//		return "";
//
//	}
//
//	public String save(final TrackingModel entity) throws Exception {
//
//		return save(entity, null);
//	}
//
//	public void delete(final String id) throws Exception {
//		getCollection().document(id).delete().get();
//	}

//	public CollectionReference getCollection() {
//		final CollectionReference reference = firestore.collection("tracking");
//		return reference;
//	}

}
