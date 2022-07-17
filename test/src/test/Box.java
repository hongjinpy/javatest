package test;

public class Box {
	private int width, height;
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public char getFillChar() {
		return fillChar;
	}
	public void setFillChar(char fillChar) {
		this.fillChar = fillChar;
	}
	private char fillChar;
	public Box()
	{
		this(10,1);
		
	}
	public Box(int width, int height)
	{
		this.width=width;
		this.height=height;
	}
	public void draw()
	{
		for(int i=0;i<height;i++)
		{
			for(int j=0;j<width;j++)
			{
				System.out.print(fillChar);
			}
			System.out.println("");
		}
	}
	public void fill(char c)
	{
		fillChar=c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box a=new Box();
		Box b=new Box(20,3);
		a.fill('*');
		b.fill('%');
		a.draw();
		b.draw();
		
	}

}
