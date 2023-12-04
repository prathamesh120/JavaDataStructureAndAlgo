package array;

import java.util.Arrays;

public class MainArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] intArray;
		//intArray = new int[3];
		/*
		int[] intArray = new int[3];
		intArray[0] = 1;
		intArray[1] = 2;
		intArray[2] =3;
		System.out.println(Arrays.toString(intArray));
		
		// All together
		
		String sArray[] = {"a", "b", "c"};
		System.out.println(Arrays.toString(sArray));
		*/
		/*
		SingleDimArray sda = new SingleDimArray(10);
		sda.insert(0, 0);
		sda.insert(1, 10);
		sda.insert(2, 20);
		sda.insert(6, 55);
		sda.insert(1, 66);
		sda.insert(12, 120);

		for(int i =0; i< sda.arr.length; i++) {
			System.out.println(sda.arr[i]);
		}
		
		sda.traverselArray();
		
		sda.searchInArray(55);
		sda.deleteValue(1);
		System.out.println(sda.arr[1]);
	*/
		
		
		// TWO DIMENSIONAL ARRAY Time and space compl-> O(mn) 
		//Step 1 -Declare
		int[][] int2DArray;
		
		// Step 2 - Instantiate
		int2DArray = new int[2][2];
		// Step 3 - Initialize
		int2DArray[0][0] =1;
		int2DArray[0][1] =2;
		int2DArray[1][0] =3;
		int2DArray[1][1] =4;
		
		System.out.println(Arrays.deepToString(int2DArray));
		// All together
		
		String s2DArray[][] = {{"a","b"},{"c","d"}};
		System.out.println(Arrays.deepToString(s2DArray));
		TwoDimArray tda = new TwoDimArray(3,3);
		tda.insertValueInArray(0, 0, 2);
		tda.insertValueInArray(0, 1, 55);
		tda.insertValueInArray(1, 1, 660);
		System.out.println(Arrays.deepToString(tda.arr));
		tda.accessCell(0, 1);
		tda.traverse2DArray();
		tda.searchingValue(660);
		tda.searchingValue(88);
		tda.deleteValuefromArray(1,1);
		}
	}


