package edu.wit.cs.comp1050;

import java.util.ArrayList;
import java.util.Scanner;
//TODO: document this class
public class PA4c {
	
	/**
	 * Removes all duplicate values
	 * from the supplied list
	 * 
	 * @param list list from which to remove repeated elements
	 */
	public static void removeRepeated(ArrayList<Integer> list) {
		 ArrayList<Integer> tmp = new ArrayList<>();

		    for(Integer c:list){

		        boolean f = false;
		        for(Integer k:tmp){

		            if (c.intValue() == k.intValue()){
		                f = true;
		            }    
		        }
		        if(!f){
		            tmp.add(c);
		        }
		    }

		    list.removeAll(list);
		    list.addAll(tmp);

		}
	

	/**
	 * Reads numbers from the keyboard and
	 * outputs the list of distinct values
	 * 
	 * @param args command-line arguments, ignored
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter integers: ");
		
		ArrayList<Integer> mylist = new ArrayList<Integer>();
		while (scan.hasNextInt()) {
		    int i = scan.nextInt();
		    mylist.add(i);
		}
		
		if(mylist.size() <= 0) {
			System.out.println("No values entered.");
			System.exit(0);
		}
		
		removeRepeated(mylist);
		
		System.out.print("The distinct integer(s): ");
		//If there is only 1
		if(mylist.size() == 1) {
			System.out.print(mylist.get(0));
			 System.out.println();
			 System.exit(0);
		}
		
		ArrayList<String> tmp = new ArrayList<String>();

		for (Integer i: mylist) {
		    tmp.add(String.valueOf(i));
		}
		

		for(int i = 0; i < tmp.size() - 1; i++){

			if(i < tmp.size()) {
	            System.out.print(tmp.get(i)+" ");

			}
			
          }
		
		 System.out.print(tmp.get(tmp.size() - 1));
		 System.out.println();
		
	}

}
