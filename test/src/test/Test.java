package test;
import java.util.Scanner;

public class Test {
	private int width, height;
	public Test()
	{}
	
	public Test(int width,int height)
	{
		this.width = width;
		this.height = height;
	}
	public int getArea()
	{
		return width*height;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Test []test = new Test[4];
		int total=0;
		for(int i=0;i<4;i++)
		{
			Test square;
			square = new Test();
			System.out.println("너비와 높이");
			square.width=scanner.nextInt();
			square.height=scanner.nextInt();
			total=total+square.getArea();
			
		}
		System.out.print("사각형의 전체 합은 "+total);
		
	}

}
