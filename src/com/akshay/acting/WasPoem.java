package com.akshay.acting;

import java.util.Arrays;

public class WasPoem implements Poem{
	
	String[] lines = {"All the world’s a stage",
			"And all the men and women merely players",
			"They have their exits and their entrances",
			"And one man in his time plays many parts",
			"His acts being seven ages. At first the infant",
			"Mewling and puking in the nurse’s arms",
					"..."};
	
	public void recite() {
		
		for(String l : lines )
			System.out.println(l);
	}

	@Override
	public String toString() {
		return "WasPoem [lines=" + Arrays.toString(lines) + "]";
	}
}
