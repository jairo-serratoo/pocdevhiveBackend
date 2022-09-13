package com.example.demoJava.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.demoJava.dao.TrackingDao;
import com.example.demoJava.models.TrackingModel;

@RunWith(MockitoJUnitRunner.Silent.class)
@ExtendWith(MockitoExtension.class)
class TrackingServiceTest {
	@InjectMocks
	TrackingService trackingService;

	@Mock
	TrackingDao trackingDao;

	@Test
	void testGetAllService() {
		try {
			final List<TrackingModel> responseDao = new ArrayList<>();
			final TrackingModel model = new TrackingModel();
			model.setId("MbFyixxbHETremTEy5bH");
			model.setAppointmentId("1234567900");
			model.setName("Magno");
			model.setLastName("Perez Perez");
			model.setMail("magno@gmail.com");
			responseDao.add(model);

			Mockito.when(trackingDao.getAll()).thenReturn(responseDao);
			final List<TrackingModel> response = trackingService.listTracking();
			Mockito.verify(trackingDao).getAll();
			Assert.assertNotNull(response);

		} catch (final Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
