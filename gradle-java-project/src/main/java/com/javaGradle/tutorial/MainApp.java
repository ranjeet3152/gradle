package com.javaGradle.tutorial;

import java.util.HashMap;

public class MainApp {
	public String sayHello() {
		return "Hello Gradle";
	}

	HashMap<Integer, String> hmap = new HashMap<Integer, String>();

	public void addElementsInMaps(int key, String Value) {
		hmap.put(key, Value);
	}

	public static void main(String[] args) {
		MainApp app = new MainApp();
		System.out.println(app.sayHello());

	}
}
