public class Sorts{
  public static void selectionsort(int [] ary) {
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
  public static void main(String[] args){
    int[] arr = {-1231231, 2, 3, 3, 4, 2, 4, 8, 12};
    selectionsort(arr);
    for (int x = 0; x < arr.length;x++){
      System.out.println(arr[x]);
    }
  }
}
