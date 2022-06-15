import java.util.*;
public class StringOperation{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter your name : ");
        String str=sc.nextLine();
        System.out.print("\nEntered name is : "+str+"\n);
        System.out.print("\nLength of the inputted string is :"+str.length()+"\n");
        String s1="Hello";
        String s2=s1.concat(str);
        System.out.print("\nAfter concatination the string is :"+s2+"\n");
        String s3="Java";
        String restr=str.replace(str,s3);
        System.out.print("\nReplaced the string "+str+ "to"+restr+"\n");
        String s4=s1.concat(restr);
        System.out.print("\nAfter replace the string is :"+s4+"\n");
    }
}
