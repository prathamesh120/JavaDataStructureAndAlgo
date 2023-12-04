package array;

public class TwoDimArray {
		
	int arr[][] = null;
	//constructor 
	
	public TwoDimArray(int numberOfRows, int numberOfColumns) {
		this.arr = new int[numberOfRows][numberOfColumns];
		for(int row = 0; row< arr.length; row++) {
			for(int col = 0; col < arr[0].length; col++) {
				arr[row][col] = Integer.MIN_VALUE;
				
			}
		}
	}
	
	//Inserting value in the Array time and space comp -> O(1)
	public void insertValueInArray(int row, int col, int value) {
		try {
			if(arr[row][col] == Integer.MIN_VALUE) {
				arr[row][col] =value;
				System.out.println("The value is successfully inserted");
			}else {
				System.out.println("This cell is already occupied");
			}
		
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Invalid index for 2D array");
	}
}
	
	// Access a cell Element of Two dimensional Array O(N)
	public void accessCell(int row, int col) {
		System.out.println("\n Accessing Row" + row + ", Col" + col);
		try {
			System.out.println("Cell value is: "+ arr[row][col]);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Index for 2D array");
			
		}
		
	}
	// Traverse 2D array t and s ->> O(MN)
	public void traverse2DArray() {
		for (int row = 0; row < arr.length; row++) {
			for(int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col]+ " ");
			}
			System.out.println();
		}
	}
	
	// Linear Search O(MN)
	public void searchingValue(int value) {
		for (int row = 0; row < arr.length; ++row) {
			for(int col = 0; col < arr[row].length; ++col) {
				if( arr[row][col] == value) {
				   System.out.println("Value is found at row: "+ row + " col: "+col);
				   return;
				}
				}
			
			}
		System.out.println("Value not found");
	}
	
	// Deleting Array Element in 2D array O(1)
	public void deleteValuefromArray(int row, int col) {
		try {
			System.out.println("Successfully deleted: " + arr[row][col]);
			arr[row][col] = Integer.MIN_VALUE;
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index is invalid");
		}
	}
}
