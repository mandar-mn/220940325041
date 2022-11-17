class GrandParent
{
	public String grandFathername,grandMothername;
	
	public GrandParent(String x , String y)
	{
		grandFathername = x;
		grandMothername = y;
		
		System.out.println("name of grandfather is  "+grandFathername+"  and name of grandmother is  "+grandMothername);
		
	}
	
}
class Parent extends GrandParent
{
	public String FatherName,MotherName;
	public void Parent(String x,String y,String w,String z)
	{
		this(w,z);
		FatherName = x;
		MotherName = y;
		System.out.println("Fathers name is "+FatherName + "Mothers name is "+MotherName);
	}
	public void Parent(String x,String y);
	{
		super(x,y);
	}
}
public class child extends Parent
{
	child(String x,String y,String w,String z)
	{
		super(x,y,w,z);
	}
	public static void main(String args[])
	{
		child c = new child("Manohar","Madhuri","Manish","Manasi");
	}
}