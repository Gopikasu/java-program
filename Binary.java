import java.util.Scanner;
class Main
{
   public static void main(String[] args)
   {
      int size=10, i, search, first, last, middle;
      int[] arr = new int[size];
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter 10 Elements (in Ascending): ");
      for(i=0; i<size; i++)
      {
         arr[i] = scan.nextInt();
      }
      System.out.print("Enter an Element to Search: ");
      search = scan.nextInt();
      
      first = 0;
      last = size-1;
      middle = (first+last)/2;
      
      while(first<=last)
      {
         if(arr[middle]<search)
         {
            first = middle+1;
         }
         else if(arr[middle]==search)
         {
            System.out.println("\nThe element is available at Index No." +middle);
            break;
         }
         else
         {
            last = middle-1;
         }
         middle = (first+last)/2;
      }
      
      if(first>last)
      {
         System.out.println("\nThe element is not available in given array");
      }
   }
}
