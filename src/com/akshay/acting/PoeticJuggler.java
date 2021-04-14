package com.akshay.acting;

public class PoeticJuggler extends Juggler{
	private Poem poem;

	public Poem getPoem() {
		return poem;
	}

	public void setPoem(Poem poem) {
		this.poem = poem;
		System.out.println("In PJ -> setPoem() param contsr");
	}

	public PoeticJuggler() {
		super();
		System.out.println("In PJ no arg contsr");
	}

	public PoeticJuggler(int numRings) {
		super(numRings);
		System.out.println("In PJ int param contsr");
	}
	
	public PoeticJuggler(Poem p, int numRings) {
		super(numRings);
		poem = p;
		System.out.println("In PJ int, Poem param contsr");
	}
	
	public void perform() {
		System.out.println("while reciting.....");
		poem.recite();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((poem == null) ? 0 : poem.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		PoeticJuggler other = (PoeticJuggler) obj;
		if (poem == null) {
			if (other.poem != null)
				return false;
		} else if (!poem.equals(other.poem))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PoeticJuggler [poem=" + poem + "]";
	}
	
	
}
