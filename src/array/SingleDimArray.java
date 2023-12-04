package array;

public class SingleDimArray {
    int arr[] = null;
    public SingleDimArray(int sizeOfArray) {
    	arr = new int[sizeOfArray];
    	for(int i = 0; i< arr.length;i++) {
    		arr[i] = Integer.MIN_VALUE;
    		
    	}
    }
    public void insert(int location, int valueToBeInserted) {
    	try {
    		if(arr[location]== Integer.MIN_VALUE) {    // O(1)
        		arr[location] = valueToBeInserted;   //O(1)
        		System.out.println("Successfully inserted"); //O(1)
        		
        	}else { //O(1)
        		System.out.println("This cell is already occupied"); //O(1)
        	}
    		
    	} catch(ArrayIndexOutOfBoundsException e) {
    		System.out.println("Opps!! invalid index");
    	}
    	
    }
    
    //Array Traversal
    public void traverselArray() {
    	try {
    		for(int i = 0; i< arr.length; i++) {
        		System.out.println(arr[i] +" ");
        	}
    	}catch (Exception e) {
    		System.out.println("Array no Longer exists!");
    	}
    	
    }
    
    // Search for an element in the given Array
    public void searchInArray(int valueToSearch) {
    	for(int i = 0; i< arr.length; i++) { //O(N) time and O(1) space comp
    		if(arr[i] == valueToSearch) {
    			System.out.println("Value is found at the index of " + i);
    			return;
    		}
    	}
    	System.out.println(valueToSearch + " is not found");
    }
    
    
    
    
    // Delete value from Array  O(1) both time and space
    public void deleteValue(int valueToDeleteIndex) {
    	try {
    		arr[valueToDeleteIndex] = Integer.MIN_VALUE;
    		System.out.println("The value has been deleted successfully");
    	}catch(ArrayIndexOutOfBoundsException e) {
    		System.out.println("The value that is provided is not in the range of array index");
    	}
    }
    
    
    
    
    
    
    
    
}
