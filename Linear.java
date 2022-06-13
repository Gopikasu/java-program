import java.util.Scanner;
class Main
{
    public static void main(String args[])
{
    int c,n,search,arr[];
    Scanner in=new Scanner(System.in);
    System.out.println("Enter the number of elements:");
    n=in.nextInt();
    arr=new int[n];
     System.out.println("Enter those"+n+"elements");
     for(c=0;c<n;c++)
     arr[c]=in.nextInt();
     System.out.println("Enter value to find");
     search=in.nextInt();
     for(c=0;c<n;c++)
     {
         if(arr[c]==search)
     {
         System.out.println(search +" is present at location" +(c+1)+".");
         break;
     }
     }
     if(c==n)
     System.out.println(search+" isn't present in array");
}
}
