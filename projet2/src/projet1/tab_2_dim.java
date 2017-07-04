package projet1;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class tab_2_dim {
	private static int vrai = 1;
	public static void main(String[] args) {
		//int pos[][] = new int [4][4];
		
		int pos1[][] = {{1,0,0,0},{1,0,0,0},{1,0,0,0},{1,0,0,0}};
		int pos2[][] = {{0,1,0,0},{0,1,0,0},{0,1,0,0},{0,1,0,0}};
	
		
		int posbis[][] = {{1,0,0,0},{1,0,0,0},{1,0,0,0},{1,0,0,0}};
		
		
		
		exp(pos1, posbis);
		
		System.out.println(vrai);
		
	}
	public static void exp(int[][] t1, int[][] t2) {
		for (int i = 0; i < t1.length; i++) {
			for (int j = 0; j < t1.length; j++) {
				if(t1[i][j] != t2[i][j]){
					vrai = 0;break;
				}
			}
		}
		
	}

}
