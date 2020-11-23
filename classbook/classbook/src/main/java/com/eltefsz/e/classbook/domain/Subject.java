package com.eltefsz.e.classbook.domain;

public enum Subject {

	MATEK("Matek"), IRODALOM("Irodalom"), NYELVTAN("Nyelvtan"), TORTENELEM("Történelem"), FOLDRAJZ("Földrajz"), KEMIA("Kémia"), FIZIKA("Fizzika"), TESTNEVELES("Testnevelés");
	
	private final String name;
	
	Subject(String name){
		this.name=name;
	}

	public String getName() {
		return name;
	}
	
	
	
	
}