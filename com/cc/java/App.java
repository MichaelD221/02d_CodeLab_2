package com.cc.java;

public class App {

	// Absatz und Trennlinie
	public static String line = "\n" + "----------------------------------";

	public static void main(String[] args) {
	
		Mitarbeiter mitarbeiter1 = new Mitarbeiter("White", "John", "CEO", 2019);
		output("surname: " + mitarbeiter1.getInfo("familyName"));
		output("name: " + mitarbeiter1.getInfo("firstName") );
		output("role: " + mitarbeiter1.getInfo("role") );
		output("year of entry: " + mitarbeiter1.getInfo("yearOfEntry") + line);
		

		Mitarbeiter mitarbeiter2 = new Mitarbeiter("Jefferson", "Paula", "Chief Financial Officer", 2022);
		output("surname: " + mitarbeiter2.getInfo("familyName"));
		output("name: " + mitarbeiter2.getInfo("firstName") );
		output("role: " + mitarbeiter2.getInfo("role") );
		output("year of entry: " + mitarbeiter2.getInfo("yearOfEntry") + line);


		Mitarbeiter mitarbeiter3 = new Mitarbeiter("Clean", "Gordy", "Janitor", 2021);
		output("surname: " + mitarbeiter3.getInfo("familyName"));
		output("name: " + mitarbeiter3.getInfo("firstName") );
		output("role: " + mitarbeiter3.getInfo("role") );
		output("year of entry: " + mitarbeiter3.getInfo("yearOfEntry") + line);
	}


	private static void output(String outStr) {
		System.out.println(outStr);
	}
}
