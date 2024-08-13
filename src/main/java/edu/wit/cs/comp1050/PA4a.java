package edu.wit.cs.comp1050;

//TODO: document this class
public class PA4a {
	
	/**
	 * Error if incorrect command-line arguments are supplied
	 */
	public static final String ERR_USAGE = "Please supply correct inputs: <encrypted string> <substring>";
	
	/**
	 * Error if shift could not be found
	 */
	public static final String ERR_NONE = "No valid shifts found.";

	/**
	 * Outputs all shifts of the encrypted string
	 * that contain the supplied substring
	 * 
	 * @param args command-line arguments: <encrypted string> <substring>
	 */
	public static void main(String[] args) {
		 if (args.length != 2) {
	            System.out.println(ERR_USAGE);
	        }
int result [] = new int[26];
Shifter obj = new Shifter(args[0]);
result = obj.findShift(args[1]);
if(result[0] == -1) {
	System.out.println(ERR_NONE);
	            }
for(int i = 0; i<26; i++) {
	if(result[i]==1) {
	break;
	        }
System.out.println(result[i]);
	    }
	
	}
}



