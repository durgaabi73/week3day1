package week3day1;

public class Student {


	public void getStudentInfo(int x) {
		
		System.out.println( "ID" + x);
	
		}
	
	public void getStudentInfo (int x, String y) {
		
		System.out.println(x+y);
	}
		
	public void getStudentsInfo(String a, int b)	{
		
		System.out.println(a+b);
		}
	
	public static void main(String[] args) {
		
		Student obj= new Student();
		
		obj.getStudentInfo(13);
		obj.getStudentInfo(13, "Durga");
		obj.getStudentsInfo("durgaabi73@gmail.com", 958517585);
	}
	
	
	
}		
			
			
		
			
			
			
	

