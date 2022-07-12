class OverloadingCalculation1{
void sum(int a,long b)
{
System.out.println(a+b);
}
void sum(int a,int b,int c)
{
System.out.println(a+b+c);
}
public static void main(String args[])
{
OverloadingCalculation1 obj=new OverloadingCalculation1();
obj.sum(10,10);
obj.sum(10,15,15);
}
}
