public class Sorts{
  public static void selectionSort(int [] ary) {
    int smallest;
    int index;
    for (int x = 0; x < ary.length; x++){
      smallest = x;
      //loop to find the smallest variable from x
      for (int y = x ; y < ary.length;y ++){
        if (ary[y] < ary[smallest]){
          smallest = y;
        }
      }
      //puts smallest from x into correct spot (x)
      int first = ary[x];
      ary[x] = ary[smallest];
      ary[smallest] = first;
    }
  }
  public static void bubbleSort(int[] data){
		boolean switched = true;
		//loop until there is no switch
		while (switched){
      switched = false;
			//if greater, switch the variables
			for (int x =0; x< data.length - 1;x++){
				if (data[x] > data[x + 1]){
					int old = data[x];
					data[x] = data[x + 1];
					data[x + 1] = old;
          switched = true;
				}
			}
		}
	}

  public static void insertionSort(int[] ary){
    int ind = 0;
    int y;
    //loop for loop
  	for (int x = 1;x < ary.length; x++){
      int old = ary[x];
      //shifts elements over where they are needed.
  		for (y = x - 1;y >= 0 && old < ary[y]; y--){
        if (old < ary[y]){
    			ary[y + 1] = ary[y];
          ind = y - 1;
        }
  		}
      //places new elemnt in hole
      ary[y + 1] = old;
  	}
  }


  public static void shift(int[] ary, int start, int end){
  	for (int x = start; x <= end; x++){
  		ary[x] = ary[x + 1];
	 }
  }


//main................
  public static void main(String[] args){
    int[] arr = {-1231231, 2, 3, 3, 4, 2, 4, 8, 12};
    selectionSort(arr);
    for (int x = 0; x < arr.length;x++){
      System.out.println(arr[x]);
    }
    int[] arr2 = {-12321312, 2, 3, 3, 4, 4, 8, 12, 3,3,4,3,4,34,0,6,2,45,2,45,234,5,23,45};
    bubbleSort(arr2);
    for (int x = 0; x < arr2.length; x++){
    	System.out.println(arr2[x]);
    }
    int[] arr3 = {-12321312, 2, 3, 3, 4, 4, 8, 12, 3,3,4,3,4,34,0,6,2,45,2,45,234,5,23};
    insertionSort(arr3);
    for (int x = 0; x < arr3.length; x++){
      System.out.println(arr3[x]);
    }
  }

}
