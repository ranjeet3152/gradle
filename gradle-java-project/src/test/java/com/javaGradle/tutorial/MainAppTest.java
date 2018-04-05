package com.javaGradle.tutorial;

import static org.junit.Assert.*;
import org.junit.Test;

import com.javaGradle.tutorial.MainApp;

public class MainAppTest {

	@Test
	public void testSayHello() {
		MainApp app = new MainApp();
		assertNotNull("Success", app.sayHello());
	}

	@Test
	public void testAddElementsInMaps() {
		// Arrange
		MainApp hashMap = new MainApp();
		hashMap.addElementsInMaps(3, "three");
		hashMap.addElementsInMaps(10, "ten");
		hashMap.addElementsInMaps(7, "seven");
		// Act
		int size = hashMap.hmap.size();
		// Assert
		assertEquals("size", 3, size);
	}

}
