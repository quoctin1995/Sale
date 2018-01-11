package com.tma.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tma.entity.Time;
import com.tma.repository.TimeRepository;

@RunWith(SpringJUnit4ClassRunner.class)
public class TimeServiceTest {
//	@Mock
//	private TimeRepository timeRepository;
//	
//	@InjectMocks
//	private TimeServiceImpl timeService;
//	
//	@Before
//	public void setup(){
//		MockitoAnnotations.initMocks(this);
//	}
//	
//	@Test
//	public void testGetAll(){
//		UUID uuid=UUID.randomUUID();
//		List<Time> timeList = new ArrayList<Time>();
//		timeList.add(new Time(uuid));
//		when(timeRepository.findAll()).thenReturn(timeList);
//		
//		Iterable<Time> result = timeService.getAllTime();
//		Assert.assertNotNull("failure - expected not null", result);
//		Assert.assertThat(result, is(timeList));
//	}
	
	@Mock
	private TimeRepository timeRepository;

	@InjectMocks
	private TimeServiceImpl timeService;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testGetAllTime() {
		List<Time> timeList = new ArrayList<Time>();
		timeList.add(new Time());
		timeList.add(new Time());
		timeList.add(new Time());
		when(timeRepository.findAll()).thenReturn(timeList);
		List<Time> result = timeService.getAllTime();

		assertEquals(3, result.size());
	}

	@Test
	public void saveTime() {
		UUID uuid=UUID.randomUUID();
		Time time = new Time(uuid);
        time.setTimeId(uuid);
        time.setMonth(1);
        time.setQuarter(2);
        time.setYear(2017);
		
		when(timeRepository.save(time)).thenReturn(time);
		Time result = timeService.saveTime(time);
		assertEquals(result.getTimeId(), uuid);
        assertNotNull(result.getMonth());
        assertNotNull(result.getQuarter());
        assertNotNull(result.getYear());
	}

}
