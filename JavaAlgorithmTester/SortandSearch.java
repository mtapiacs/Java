package sortandsearch;
import java.util.Random;
import java.util.Scanner;

public class SortandSearch {
	
	public static void main(String[] args) {
		int randNum;
		int[] arrA, arrB, arrC, arrD, arrE; 
		long startTime, endTime, elapsed;
		
		System.out.println("WELCOME TO MY SORT/SEARCH ALGORITHM TIMING PLAYGROUND!");
		System.out.println("Type: `Quick Sort`, `Insertion Sort`, `Selection Sort`, `Binary Search`, `Linear Search`, or `All`");
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String response = input.nextLine(); 

//		if (response.equals("Test")) { 		// Just some tests for 2D Matrix
//			int[][] test = createArrays();
//			int testTwo = test[1][0];
//			printArray(test[1]);
//			System.out.println(testTwo);
//		}

		if (response.equals("Quick Sort")) {
			// Quick Sort
				// Creating Arrays
				arrA = createArrays()[0];
				arrB = createArrays()[1];
				arrC = createArrays()[2];
				arrD = createArrays()[3];
				arrE = createArrays()[4];
				QuickSort qsObject = new QuickSort(); 
				
				// 100 Integers
				startTime = System.currentTimeMillis();
								
				qsObject.sort(arrA, 0, arrA.length-1); 
				
				endTime = System.currentTimeMillis();
				elapsed = endTime - startTime;
				
				System.out.println("`Quick Sort` took: \n" + "With 100: " + elapsed);
				
				// 1000 Integers
				startTime = System.currentTimeMillis();
				
				qsObject.sort(arrB, 0, arrB.length-1); 
		        
				endTime = System.currentTimeMillis();
				elapsed = endTime - startTime;
				
				System.out.println("With 1,000: " + elapsed);
			
				// 10000 Integers
				startTime = System.currentTimeMillis();
				
				qsObject.sort(arrC, 0, arrC.length-1); 
		        
				endTime = System.currentTimeMillis();
				elapsed = endTime - startTime;
				
				System.out.println("With 10,000: " + elapsed);
				
				// 100000 Integers
				startTime = System.currentTimeMillis();
				
				qsObject.sort(arrD, 0, arrD.length-1); 
		        
				endTime = System.currentTimeMillis();
				elapsed = endTime - startTime;
				
				System.out.println("With 100,000: " + elapsed);
				
				// 1000000 Integers
				startTime = System.currentTimeMillis();
				
				qsObject.sort(arrE, 0, arrE.length-1); 
		        
				endTime = System.currentTimeMillis();
				elapsed = endTime - startTime;
				
				System.out.println("With 1,000,000: " + elapsed);
		} else if (response.equals("Insertion Sort")) {
			// Insertion Sort
				// Creating Arrays
				arrA = createArrays()[0];
				arrB = createArrays()[1];
				arrC = createArrays()[2];
				arrD = createArrays()[3];
				arrE = createArrays()[4];
				
				// 100 Integers
				startTime = System.currentTimeMillis();
				
				insertionSort(arrA);
		        
				endTime = System.currentTimeMillis();
				elapsed = endTime - startTime;
				
				System.out.println("`Insertion Sort` took: \n" + "With 100: " + elapsed);
				
				// 1000 Integers
				startTime = System.currentTimeMillis();
				
				insertionSort(arrB);
		        
				endTime = System.currentTimeMillis();
				elapsed = endTime - startTime;
				
				System.out.println("With 1,000: " + elapsed);
				
				// 10000 Integers
				startTime = System.currentTimeMillis();
				
				insertionSort(arrC);
		        
				endTime = System.currentTimeMillis();
				elapsed = endTime - startTime;
				
				System.out.println("With 10,000: " + elapsed);
				
				// 100000 Integers
				startTime = System.currentTimeMillis();
				
				insertionSort(arrD);
		        
				endTime = System.currentTimeMillis();
				elapsed = endTime - startTime;
				
				System.out.println("With 100,000: " + elapsed);
				
				// 1000000 Integers
				//startTime = System.currentTimeMillis();
				
				//insertionSort(arrE);
		        
				//endTime = System.currentTimeMillis();
				//elapsed = endTime - startTime;
				
				//System.out.println("With 1,000,000: " + elapsed);
		} else if (response.equals("Selection Sort")) {
			// Selection Sort
				// Creating Arrays
				arrA = createArrays()[0];
				arrB = createArrays()[1];
				arrC = createArrays()[2];
				arrD = createArrays()[3];
				arrE = createArrays()[4];
				SelectionSort ssObject = new SelectionSort(); 
		        
				// 100 Integers
				startTime = System.currentTimeMillis();
				
			    ssObject.sort(arrA); 	
		        
				endTime = System.currentTimeMillis();
				elapsed = endTime - startTime;
				
				System.out.println("`Selection Sort` took: \n" + "With 100: " + elapsed);
				
				// 1000 Integers
				startTime = System.currentTimeMillis();
				
				ssObject.sort(arrB); 
				
				endTime = System.currentTimeMillis();
				elapsed = endTime - startTime;
				
				System.out.println("With 1,000: " + elapsed);
				
				// 10000 Integers
				startTime = System.currentTimeMillis();
				
				ssObject.sort(arrC); 
		        
				endTime = System.currentTimeMillis();
				elapsed = endTime - startTime;
				
				System.out.println("With 10,000: " + elapsed);
				
				// 100000 Integers
				startTime = System.currentTimeMillis();
				
				ssObject.sort(arrD); 
				
				endTime = System.currentTimeMillis();
				elapsed = endTime - startTime;
				
				System.out.println("With 100,000: " + elapsed);
				
				// 1000000 Integers
				//startTime = System.currentTimeMillis();
				
				//ssObject.sort(arrE); 
		        
				//endTime = System.currentTimeMillis();
				//elapsed = endTime - startTime;
				
				//System.out.println("With 1,000,000: " + elapsed);
		} else if (response.equals("Binary Search")) {
			// Binary Search
				// Creating Arrays
				arrA = createArrays()[0];
				arrB = createArrays()[1];
				arrC = createArrays()[2];
				arrD = createArrays()[3];
				arrE = createArrays()[4];
				randNum = randomInt();
				
				// 100 Integers
				startTime = System.currentTimeMillis(); // System.nanoTime(); To see things better
				
			    searchBinary(arrA, 0, arrA.length - 1, randNum);	
		        
				endTime = System.currentTimeMillis();
				elapsed = endTime - startTime;
				
				System.out.println("`Binary Search` took: \n" + "With 100: " + elapsed);
				
				// 1000 Integers
				startTime = System.currentTimeMillis();
				
			    searchBinary(arrB, 0, arrB.length - 1, randNum);	
		        
				endTime = System.currentTimeMillis();
				elapsed = endTime - startTime;
				
				System.out.println("With 1,000: " + elapsed);
				
				// 10000 Integers
				startTime = System.currentTimeMillis();
				
			    searchBinary(arrC, 0, arrC.length - 1, randNum);	
		        
				endTime = System.currentTimeMillis();
				elapsed = endTime - startTime;
				
				System.out.println("With 10,000: " + elapsed);
				
				// 100000 Integers
				startTime = System.currentTimeMillis();
				
			    searchBinary(arrD, 0, arrD.length - 1, randNum);	
		        
				endTime = System.currentTimeMillis();
				elapsed = endTime - startTime;
				
				System.out.println("With 100,000: " + elapsed);
				
				// 1000000 Integers
				startTime = System.currentTimeMillis();
				
			    searchBinary(arrE, 0, arrE.length - 1, randNum);	
		        
				endTime = System.currentTimeMillis();
				elapsed = endTime - startTime;
				
				System.out.println("With 1,000,000: " + elapsed);
		} else if (response.equals("Linear Search")) {
			// Linear Search
				// Creating Arrays
				arrA = createArrays()[0];
				arrB = createArrays()[1];
				arrC = createArrays()[2];
				arrD = createArrays()[3];
				arrE = createArrays()[4];
				randNum = randomInt();
				
				// 100 Integers
				startTime = System.currentTimeMillis(); 
				
			    searchLinear(arrA, randNum);	
		        
				endTime = System.currentTimeMillis();
				elapsed = endTime - startTime;
				
				System.out.println("`Linear Search` took: \n" + "With 100: " + elapsed);
				
				// 1000 Integers
				startTime = System.currentTimeMillis(); 
				
			    searchLinear(arrB, randNum);	
		        
				endTime = System.currentTimeMillis();
				elapsed = endTime - startTime;
				
				System.out.println("With 1,000: " + elapsed);
				
				// 10000 Integers
				startTime = System.currentTimeMillis(); 
				
			    searchLinear(arrC, randNum);	
		        
				endTime = System.currentTimeMillis();
				elapsed = endTime - startTime;
				
				System.out.println("With 10,000: " + elapsed);
				
				// 100000 Integers
				startTime = System.currentTimeMillis(); 
				
			    searchLinear(arrD, randNum);	
		        
				endTime = System.currentTimeMillis();
				elapsed = endTime - startTime;
				
				System.out.println("With 100,000: " + elapsed);
				
				// 1,000,000 Integers
				startTime = System.currentTimeMillis(); 
				
			    searchLinear(arrE, randNum);	
		        
				endTime = System.currentTimeMillis();
				elapsed = endTime - startTime;
				
				System.out.println("With 1,000,000: " + elapsed);
			
		} else {
			runAll();
		}
	}
	
	// Utilities 
	
	public static int[][] createArrays () {
		Random rObject = new Random();
		int[] arrSizes = {100, 1000, 10000, 100000, 1000000};
		int[][] arrayGroup = new int[5][];
		
		for (int i = 0; i < arrSizes.length; i++) {
			int[] arr = new int[arrSizes[i]];
			for (int j = 0; j < arr.length; j++) {
				arr[j] = rObject.nextInt(1000000);
			}
			arrayGroup[i] = arr;
		}
		return arrayGroup;
	}
	
	public static int randomInt () {
		Random rObject = new Random();
		int num = rObject.nextInt(1000000);
		return num;
	}

	public static void printArray (int[] arr) {
		int n = arr.length; 
		for (int i = 0; i < n; ++i) 
			System.out.print(arr[i] + " "); 
		System.out.println(); 
	}
	
	public static void runAll() {
		int randNum;
		int[] arrA, arrB, arrC, arrD, arrE; 
		long startTime, endTime, elapsed;
		
		System.out.println("-----------------------Sorting Algorithms-----------------------");
		// Quick Sort
			// Creating Arrays
			arrA = createArrays()[0];
			arrB = createArrays()[1];
			arrC = createArrays()[2];
			arrD = createArrays()[3];
			arrE = createArrays()[4];
			QuickSort qsObject = new QuickSort(); 
			
			// 100 Integers
			startTime = System.currentTimeMillis();
			
			qsObject.sort(arrA, 0, arrA.length-1); 
	        
			endTime = System.currentTimeMillis();
			elapsed = endTime - startTime;
			
			System.out.println("`Quick Sort` took: \n" + "With 100: " + elapsed);
			
			// 1000 Integers
			startTime = System.currentTimeMillis();
			
			qsObject.sort(arrB, 0, arrB.length-1); 
	        
			endTime = System.currentTimeMillis();
			elapsed = endTime - startTime;
			
			System.out.println("With 1,000: " + elapsed);
		
			// 10000 Integers
			startTime = System.currentTimeMillis();
			
			qsObject.sort(arrC, 0, arrC.length-1); 
	        
			endTime = System.currentTimeMillis();
			elapsed = endTime - startTime;
			
			System.out.println("With 10,000: " + elapsed);
			
			// 100000 Integers
			startTime = System.currentTimeMillis();
			
			qsObject.sort(arrD, 0, arrD.length-1); 
	        
			endTime = System.currentTimeMillis();
			elapsed = endTime - startTime;
			
			System.out.println("With 100,000: " + elapsed);
			
			// 1000000 Integers
			startTime = System.currentTimeMillis();
			
			qsObject.sort(arrE, 0, arrE.length-1); 
	        
			endTime = System.currentTimeMillis();
			elapsed = endTime - startTime;
			
			System.out.println("With 1,000,000: " + elapsed);

		// Insertion Sort
			// Creating Arrays
			arrA = createArrays()[0];
			arrB = createArrays()[1];
			arrC = createArrays()[2];
			arrD = createArrays()[3];
			arrE = createArrays()[4];
			
			// 100 Integers
			startTime = System.currentTimeMillis();
			
			insertionSort(arrA);
	        
			endTime = System.currentTimeMillis();
			elapsed = endTime - startTime;
			
			System.out.println();
			System.out.println("`Insertion Sort` took: \n" + "With 100: " + elapsed);
			
			// 1000 Integers
			startTime = System.currentTimeMillis();
			
			insertionSort(arrB);
	        
			endTime = System.currentTimeMillis();
			elapsed = endTime - startTime;
			
			System.out.println("With 1,000: " + elapsed);
			
			// 10000 Integers
			startTime = System.currentTimeMillis();
			
			insertionSort(arrC);
	        
			endTime = System.currentTimeMillis();
			elapsed = endTime - startTime;
			
			System.out.println("With 10,000: " + elapsed);
			
			// 100000 Integers
			startTime = System.currentTimeMillis();
			
			insertionSort(arrD);
	        
			endTime = System.currentTimeMillis();
			elapsed = endTime - startTime;
			
			System.out.println("With 100,000: " + elapsed);
			
			//1000000 Integers
			startTime = System.currentTimeMillis();
			
			insertionSort(arrE);
	        
			endTime = System.currentTimeMillis();
			elapsed = endTime - startTime;
			
			System.out.println("With 1,000,000: " + elapsed);

		// Selection Sort
			// Creating Arrays
			arrA = createArrays()[0];
			arrB = createArrays()[1];
			arrC = createArrays()[2];
			arrD = createArrays()[3];
			arrE = createArrays()[4];
			SelectionSort ssObject = new SelectionSort(); 
	        
			// 100 Integers
			startTime = System.currentTimeMillis();
			
		    ssObject.sort(arrA); 	
	        
			endTime = System.currentTimeMillis();
			elapsed = endTime - startTime;
			
			System.out.println();
			System.out.println("`Selection Sort` took: \n" + "With 100: " + elapsed);
			
			// 1000 Integers
			startTime = System.currentTimeMillis();
			
			ssObject.sort(arrB); 
			
			endTime = System.currentTimeMillis();
			elapsed = endTime - startTime;
			
			System.out.println("With 1,000: " + elapsed);
			
			// 10000 Integers
			startTime = System.currentTimeMillis();
			
			ssObject.sort(arrC); 
	        
			endTime = System.currentTimeMillis();
			elapsed = endTime - startTime;
			
			System.out.println("With 10,000: " + elapsed);
			
			// 100000 Integers
			startTime = System.currentTimeMillis();
			
			ssObject.sort(arrD); 
			
			endTime = System.currentTimeMillis();
			elapsed = endTime - startTime;
			
			System.out.println("With 100,000: " + elapsed);
			
			// 1000000 Integers
			startTime = System.currentTimeMillis();
			
			ssObject.sort(arrE); 
	        
			endTime = System.currentTimeMillis();
			elapsed = endTime - startTime;
			
			System.out.println("With 1,000,000: " + elapsed);
		
		System.out.println("-----------------------Searching Algorithms-----------------------");
		// Binary Search
			// Creating Arrays
			arrA = createArrays()[0];
			arrB = createArrays()[1];
			arrC = createArrays()[2];
			arrD = createArrays()[3];
			arrE = createArrays()[4];
			randNum = randomInt();
			
			// 100 Integers
			startTime = System.currentTimeMillis(); // System.nanoTime(); To see things better
			
		    searchBinary(arrA, 0, arrA.length - 1, randNum);	
	        
			endTime = System.currentTimeMillis();
			elapsed = endTime - startTime;
			
			System.out.println("`Binary Search` took: \n" + "With 100: " + elapsed);
			
			// 1000 Integers
			startTime = System.currentTimeMillis();
			
		    searchBinary(arrB, 0, arrB.length - 1, randNum);	
	        
			endTime = System.currentTimeMillis();
			elapsed = endTime - startTime;
			
			System.out.println("With 1,000: " + elapsed);
			
			// 10000 Integers
			startTime = System.currentTimeMillis();
			
		    searchBinary(arrC, 0, arrC.length - 1, randNum);	
	        
			endTime = System.currentTimeMillis();
			elapsed = endTime - startTime;
			
			System.out.println("With 10,000: " + elapsed);
			
			// 100000 Integers
			startTime = System.currentTimeMillis();
			
		    searchBinary(arrD, 0, arrD.length - 1, randNum);	
	        
			endTime = System.currentTimeMillis();
			elapsed = endTime - startTime;
			
			System.out.println("With 100,000: " + elapsed);
			
			// 1000000 Integers
			startTime = System.currentTimeMillis();
			
		    searchBinary(arrE, 0, arrE.length - 1, randNum);	
	        
			endTime = System.currentTimeMillis();
			elapsed = endTime - startTime;
			
			System.out.println("With 1,000,000: " + elapsed);
	
		// Linear Search
			// Creating Arrays
			arrA = createArrays()[0];
			arrB = createArrays()[1];
			arrC = createArrays()[2];
			arrD = createArrays()[3];
			arrE = createArrays()[4];
			randNum = randomInt();
			
			// 100 Integers
			startTime = System.currentTimeMillis(); 
			
		    searchLinear(arrA, randNum);	
	        
			endTime = System.currentTimeMillis();
			elapsed = endTime - startTime;
			
			System.out.println();
			System.out.println("`Linear Search` took: \n" + "With 100: " + elapsed);
			
			// 1000 Integers
			startTime = System.currentTimeMillis(); 
			
		    searchLinear(arrB, randNum);	
	        
			endTime = System.currentTimeMillis();
			elapsed = endTime - startTime;
			
			System.out.println("With 1,000: " + elapsed);
			
			// 10000 Integers
			startTime = System.currentTimeMillis(); 
			
		    searchLinear(arrC, randNum);	
	        
			endTime = System.currentTimeMillis();
			elapsed = endTime - startTime;
			
			System.out.println("With 10,000: " + elapsed);
			
			// 100000 Integers
			startTime = System.currentTimeMillis(); 
			
		    searchLinear(arrD, randNum);	
	        
			endTime = System.currentTimeMillis();
			elapsed = endTime - startTime;
			
			System.out.println("With 100,000: " + elapsed);
			
			// 1000000 Integers
			startTime = System.currentTimeMillis(); 
			
		    searchLinear(arrE, randNum);	
	        
			endTime = System.currentTimeMillis();
			elapsed = endTime - startTime;
			
			System.out.println("With 1,000,000: " + elapsed);
	}

	// Sorting Algorithms
	
	public static class QuickSort { 
	    int partition(int arr[], int low, int high) { 
	        int pivot = arr[high];  
	        int i = (low-1); 
	        for (int j=low; j<high; j++) { 
	            if (arr[j] <= pivot) { 
	                i++; 
	                int temp = arr[i]; 
	                arr[i] = arr[j]; 
	                arr[j] = temp; 
	            } 
	        } 
	  
	        int temp = arr[i+1]; 
	        arr[i+1] = arr[high]; 
	        arr[high] = temp; 
	  
	        return i+1; 
	    } 
	  
	    public void sort(int arr[], int low, int high) { 
	        if (low < high) { 
	            int pi = partition(arr, low, high); 
	            sort(arr, low, pi-1); 
	            sort(arr, pi+1, high); 
	        } 
	    } 
	}
	
	public static void insertionSort (int arr[]) { 
        int n = arr.length; 
        for (int i = 1; i < n; ++i) { 
            int key = arr[i]; 
            int j = i - 1; 
            
            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
        }
    } 
	
	public static class SelectionSort { 
	    public void sort(int arr[]) { 
	        int n = arr.length; 
	  
	        for (int i = 0; i < n-1; i++) { 
	            int min_idx = i; 
	            for (int j = i+1; j < n; j++) 
	                if (arr[j] < arr[min_idx]) 
	                    min_idx = j; 
	            
	            int temp = arr[min_idx]; 
	            arr[min_idx] = arr[i]; 
	            arr[i] = temp; 
	        } 
	    } 
	}
	
	// Searching Algorithms
	public static int searchLinear (int arr[], int x) { 
		int n = arr.length; 
		for(int i = 0; i < n; i++) { 
			if(arr[i] == x) 
				return i; 
	    } 
	    return -1; 
	}
	
	public static int searchBinary(int arr[], int l, int r, int x) { 
        if (r >= l) { 
            int mid = l + (r - l) / 2; 
  
            if (arr[mid] == x) 
                return mid; 
  
            if (arr[mid] > x) 
            	return searchBinary(arr, l, mid - 1, x); 
  
            return searchBinary(arr, mid + 1, r, x); 
        } 
        return -1; 
    } 
}
