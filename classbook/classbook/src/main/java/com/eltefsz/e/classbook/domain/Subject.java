package com.eltefsz.e.classbook.domain;

public enum Subject {

	MATEK("Matek"), IRODALOM("Irodalom"), NYELVTAN("Nyelvtan"), TORTENELEM("T�rt�nelem"), FOLDRAJZ("F�ldrajz"), KEMIA("K�mia"), FIZIKA("Fizzika"), TESTNEVELES("Testnevel�s");
	
	private final String name;
	
	Subject(String name){
		this.name=name;
	}

	public String getName() {
		return name;
	}
	
	
	
	
}