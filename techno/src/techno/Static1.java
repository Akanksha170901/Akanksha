package techno;

public class Static1 {
	 int roll;
	 String name;
	 static String college="Mumbai unversity";
	 Static1(int r,String n)
	 {
		 roll=r;
		 name=n;
		 
	 }
	 void display()
			  {
		 System.out.println(roll+""+name+""+college);
	 }
	public static void main(String[] args) {
		Static1 s1=new Static1(1,"Aaki");
		Static1 s2=new Static1(1,"Akanksha");
		s1.display();
		s2.display();
	}

}
