package comparable-objects;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;






public class Die implements Comparable<Die> {

	/**
	 * A random number generator to simulate rolling the die.
	 * DO NOT CHANGE THE DECLARATION OF rng. THE UNIT TESTS RELY
	 * ON BEGIN ABLE TO ACCESS THE RANDOM NUMBER GENERATOR.
	 */
	Random rng = new Random();
	
	/**
	 * The array of face values.
	 */
	private int[] faces;
		
	/**
	 * The current value of the die.
	 */
	private int value;

	
	/**
	 * The number of faces on a die.
	 */
	public static int NUMBER_OF_FACES = 6;
	

	public Die() {
		this.faces = new int[]{1, 2, 3, 4, 5, 6};
		this.value = 1;
	}
	

	private static boolean isInAscendingOrder(int[] a) {
		for (int i = 1; i < a.length; i++) {
			if (a[i] < a[i - 1]) {
				return false;
			}
		}
		return true;
	}
	

	public Die(int[] faces) {
		if (faces.length != 6) {
			throw new IllegalArgumentException();
		}
		if (!Die.isInAscendingOrder(faces)) {
			throw new IllegalArgumentException();
		}
		this.faces = Arrays.copyOf(faces, NUMBER_OF_FACES);
		this.value = this.faces[0];
	}
	

	public void setValueToFace(int face) {
		if (face < 0 || face >= NUMBER_OF_FACES) {
			throw new IllegalArgumentException();
		}
		this.value = this.faces[face];
	}
	

	public int value() {
		return this.value;
	}
	

	public int roll() {
		int idx = rng.nextInt(Die.NUMBER_OF_FACES);
		this.value = this.faces[idx];
		return this.value;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(this.value, this.faces);
	}

	

	@Override
	public int compareTo(Die other) {
		return this.value - other.value;
	}
	

	@Override
	public boolean equals(Object obj) {

		boolean returnStatement; 
		if (this == obj) { //if both objects point to the same memory address, then 
						   //return true
			returnStatement = true;
		}
		else if (obj == null) { //checking if obj has no object 
			returnStatement = false; 
		}
		else if (obj.getClass() != this.getClass()) { //checks if both objects are of class Die
			returnStatement = false;
		}
		else { //checking if both objects have the same states
			Die otherObj = (Die) obj; 
			returnStatement = this.value == otherObj.value && 
					(Arrays.equals(this.faces, otherObj.faces));
		}
		
		return returnStatement;
		
	}
	

}
