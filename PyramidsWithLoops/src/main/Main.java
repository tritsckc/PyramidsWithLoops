/* 
 * Kenneth Tritschler
 * tritsckc@mail.uc.edu
 * Assignment 04
 * Class: IS4010
 * Due: 9/26/2019
 * Printing pyramids using loops. It kind-of works. 
 * What I really want is
        1
       222
      33333
     4444444
    555555555 
*/
package main;

public class Main {

	public static void main(String[] args) {
		int lines = 5;
		for (int i = 1; i <= lines; i++) {
			for (int j = 0; j < lines -i; j++) {
				System.out.print(" ");	
			}	
			
		for (int k=1; k <=i+i-1; k++) { // must add another 'for' line using the variable k in order to create the shape. 
			System.out.print(i + ""); // once you add these two lines of code, you get the correct shape (pyramid)
		}
			System.out.println();
		}
	}
}
