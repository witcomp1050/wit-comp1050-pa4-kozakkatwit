package edu.wit.cs.comp1050;

import java.util.ArrayList;

//TODO: document this class
public class Shifter {
	
	/**
	 * Number of letters in the English alphabet
	 */
	public static final int NUM_LETTERS = ('z' - 'a') + 1;
	private String input;
	/**
	 * Initializes the shifter
	 * 
	 * @param s encrypted string
	 */
	public Shifter(String s) {
		this.input = s;
		}

    /**
     * A static method that shifts a character
     * by n positions (either positive or negative).
     * Ignores any non-letter characters.
     *
     * @param c the character
     * @param n amount to shift
     * @return shifted character by a supplied amount
     * 
     * @param n number of places to shift 
     * @return shifted string
     */
    public static char shift1(char c, int n) {
    	if (c <= 'z' && c >= 'a') {
			int shift = (int) c + n; // Shifted character value
			for (int i = 0; i <= n / 26; i++) { // Reset every time we shift 26 times
				if (shift > (int) 'z') {
					shift -= NUM_LETTERS; // Go back to a if we get past z
				} else if (shift < (int) 'a') {
					shift += NUM_LETTERS; // Go back to z if we get past a
				}
			}
			char shiftedChar = (char) shift;
			return shiftedChar;
		} 
		else if (c <= 'Z' && c >= 'A') {
			int shift = (int) c + n; // Shifted character value
			for (int i = 0; i <= n / 26; i++) { // Reset every time we shift 26 times
				if (shift > (int) 'Z') {
					shift -= NUM_LETTERS; // Go back to a if we get past z
				} else if (shift < (int) 'A') {
					shift += NUM_LETTERS; // Go back to z if we get past a
				}
			}
			char shiftedChar = (char) shift;
			return shiftedChar;
		}
		else
			return c;

	}
	
	/**
	 * Returns the result of shifting
	 * by a supplied amount
	 * 
	 * @param n number of places to shift 
	 * @return shifted string
	 */
	public String shift(int n) {
		StringBuilder stb = new StringBuilder(input.length());

		for (int i = 0; i < input.length(); i++) {
			char s1 = input.charAt(i);
			stb.append(shift1(s1, n));
		}
		String newS = stb.toString();
		return newS;
	    }
	
	
	/**
	 * Finds all shifts that contain
	 * the supplied substring
	 * 
	 * @param sub substring to find
	 * @return array of shifts (0-25) that contain the substring (in order)
	 */
	public int[] findShift(String sub) {
		ArrayList<Integer> found = new ArrayList<>();
		for (int i = 0; i < 26; i++) {
			String shifted = shift(i);
			if (shifted.contains(sub)){
				found.add(i);
			}
		}
        // replace with your code

        // Convert ArrayList to int array
        // Leave alone!
        int[] foundAsArray = new int[found.size()];
        for (int i = 0; i < found.size(); i++) {
            foundAsArray[i] = found.get(i);
        }

        return foundAsArray;
	}

}
