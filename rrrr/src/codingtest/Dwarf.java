package codingtest;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Dwarf {

	public static void main(String[] args) {
		
	
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
		int[] dwarf = new int[9];
 		
		for(int i = 0; i<9; i++) {
			
			sum += dwarf[i] = sc.nextInt();
		
		}
		Arrays.sort(dwarf);

		
		for(int i = 0; i<dwarf.length-1; i++) {
			for (int j=i+1; j<dwarf.length; j++) {
				if(sum - dwarf[i] - dwarf[j] == 100) {
					for(int k = 0; k < dwarf.length; k++) {
						if(k != i && k != j) {
							System.out.println(dwarf[k]);
							
						}
					}
					return;
					
				}
			}
		}
		


	}

}
