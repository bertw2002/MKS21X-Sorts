public class Sorts{
  public static void selectionSort(int [] ary) {
    int smallest;
    int index;
    for (int x = 0; x < ary.length; x++){
      smallest = x;
      for (int y = x ; y < ary.length;y ++){
        if (ary[y] < ary[smallest]){
          smallest = y;
        }
      }
      int first = ary[x];
      ary[x] = ary[smallest];
      ary[smallest] = first;
    }
  }
  public static void bubbleSort(int[] data){
		boolean switched = true;
		while (switched){
      switched = false;
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
  }

}
