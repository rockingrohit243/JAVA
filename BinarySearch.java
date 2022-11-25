import java.util.Scanner;
class BinarySearch {
  int binarySearch(int array[], int x, int low, int high) {
    while (low <= high) {
      int mid = low + (high - low) / 2;

      if (array[mid] == x)
        return mid;

      if (array[mid] < x)
        low = mid + 1;

      else
        high = mid - 1;
    }

    return -1;
  }

  public static void main(String args[]) {
Scanner sob=new  Scanner(System.in);
    BinarySearch ob = new BinarySearch();
System.out.println("Enter the size");
int size=sob.nextInt();
int array[]=new int[size];
    System.out.println("Enter the array elements");
for(int i=0;i<size;i++)
{
array[i]=sob.nextInt();
}
    int n = array.length;
    int x = 4;
    int result = ob.binarySearch(array, x, 0, n - 1);
    if (result == -1)
      System.out.println("Not found");
    else
      System.out.println("Element found at index " + result);
  }
  }