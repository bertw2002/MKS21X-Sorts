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
    int least = 0;
    int secondi = 0;
    /*
    a-Find the smallest element located at index i or any of the higher indices.
    b-Swap that value into index i.
    c-Increase i
    */
    //loop to repeat steps a, b, and c.
    for (int x = 0; x < ary.length; x++){
      least = ary[x];
      //finds smallest from index x
      for (int y = x; y < ary.length; y ++){
        if (least > ary[y]){
          least = ary[y];
          secondi = y;
        }
      }
      //sets values
      int old = ary[x];
      ary[x] = least;
      ary[secondi] = old;
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
    int[] arr3 = {-12321312, 2, 3, 3, 4, 4, 8, 12, 3,3,4,3,4,34,0,6,2,45,2,45,234,5,23,45};
    insertionSort(arr3);
    for (int x = 0; x < arr3.length; x++){
      System.out.println(arr3[x]);
    }
  }

}
