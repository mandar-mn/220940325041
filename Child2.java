
class GrandParent
{
   String grandFatherName;
   String grandMotherName;

   
   public GrandParent(String grandFatherName, String grandMotherName)
   {
       this.grandFatherName=grandFatherName;
       this.grandMotherName=grandMotherName;

       System.out.println("Name of Grand Father is : "+grandFatherName);
       System.out.println("Name of Grand Mother is : "+grandMotherName);
   }
}


class Parent extends GrandParent
{
   String FatherName;
   String MotherName;

   
   public Parent(String FatherName,String MotherName,String grandFatherName, String grandMotherName)
   {
       super(grandFatherName, grandMotherName);
       this.FatherName=FatherName;
       this.MotherName=MotherName;

       System.out.println("Name of Father is : "+FatherName);
       System.out.println("Name of Mother is : "+MotherName);
   }

   
   public Parent(String grandFatherName, String grandMotherName) {
       super(grandFatherName, grandMotherName);
   }
}

public class Child2 extends Parent
{
	public Child2(String FatherName, String MotherName, String grandFatherName, String grandMotherName);
		
    super(FatherName, MotherName, grandFatherName, grandMotherName);
	public static void main(String args[])
	{
		Child2 c = new Child2("Ram","Seeta","Sham","Neeta");
	}
	 
	 
}