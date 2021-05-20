package com.ram.junit.service;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(value = OrderAnnotation.class)
//@TestMethodOrder(value = MethodName.class)
//@TestMethodOrder(value = MethodOrderer.DisplayName)
public class JobImplTest {

	private static JobImpl jobImpl;
	
	@BeforeAll
	public static void setUpOnce()
	{
		 jobImpl = new JobImpl();
	}
	
	@Test
	public void testSearchJob()
	{
		String expected = "Got Job";
		assertEquals(expected, jobImpl.searchJob());
		
	}
	
	@Test
	public void testSearchJobWithPerformance()
	{
		assertTimeout(Duration.ofMillis(3000), ()->{jobImpl.searchJob();});
		
	}
	
	@Test
	//@DisplayName("DoesNotThrough")
	//@Disabled
	@Order(1)
	@Tag(value="dev")
	public void testSearchJobWithDoenNotThrow(TestInfo inf)
	{
		assertDoesNotThrow(()->{jobImpl.searchJob();});
		
	}
	
	@Test
	public void testSearchJobWithThrow()
	{
		assertThrows(IllegalArgumentException.class, ()->{jobImpl.searchJob();});
		
	}
	
	/*
	 * @Test public void testSearchJobWithTrue() { assertTrue(jobImpl.searchJob());
	 * 
	 * }
	 */
	
	@AfterAll
	public static void clearOnce()
	{
		jobImpl=null;
	}
}
