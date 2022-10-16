package com.mav.MavenProject;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.nio.channels.NetworkChannel;
import java.sql.DatabaseMetaData;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class ApplicationTest {
		@InjectMocks
		MainClass mainClass;

		@Mock
		DatabaseMetaData dependentClassOne;

		@Mock
		NetworkChannel dependentClassTwo;

		@Before
		public void init() {
			MockitoAnnotations.openMocks(this);
		}

		@Test
		public void validateTest()
		{
	       when(((MainClass) dependentClassOne).save("sdfffg")).thenReturn(true);
	       when(((MainClass) dependentClassTwo).save("sdf")).thenReturn(true);

			boolean saved = mainClass.save("D://D:\\javaclassdemo.apptesting.txt");
			assertEquals(true, saved);
}}

