package com.akshay.acting;

public class Juggler implements Performer{
	
	private int numRings=3;
	
	
	
	
	public Juggler(int numRings) {
		super();
		this.numRings = numRings;
		System.out.println("In Juggler Para Constr numRings = "+ numRings);
	}

	public Juggler() {
		System.out.println("In Juggler no arg constructor");
	}
	
	public int getNumRings() {
		return numRings;
		
	}

	public void setNumRings(int numRings) {
		this.numRings = numRings;
		System.out.println("In Juggler setNumRings() numRings "+ numRings);
	}

	public void perform() {
		System.out.println("I am a Juggler juggling "+ numRings + " rings Juggling.....Juggling");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numRings;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Juggler other = (Juggler) obj;
		if (numRings != other.numRings)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Juggler [numRings=" + numRings + "]";
	}
	
	
}
