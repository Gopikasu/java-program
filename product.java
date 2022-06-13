class ProductClass
{
int pcode;
String pname;
int price;
void insertRecord(int p, int pr,String n)
{
pcode=p;
pname=n;
price=pr;
}
void displayInformation()
{
System.out.println(pcode+""+price+""+pname);
}
}
class product
{
public static void main(String args[]) 
{
int s;
ProductClass p1=new ProductClass();
ProductClass p2=new ProductClass();
ProductClass p3=new ProductClass();
p1.insertRecord(101,29000,"lap");
p2.insertRecord(102,15000,"joystick");
p3.insertRecord(103,2000,"keyboard");
p1.displayInformation();
p2.displayInformation();
p3.displayInformation();
	if(p1.price<p2.price)
		{
			if(p3.price<p1.price)
		{	
			s=p3.price;
		}	
			else
		{
			s=p1.price;
		}
		}
		else
{
if(p2.price<p3.price)
{
s=p2.price;
}
else
{
s=p3.price;
}
}
System.out.println(s+" is smallest");
}
}
