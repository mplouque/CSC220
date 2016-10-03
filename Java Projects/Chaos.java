public class Chaos
{
	public static final int MIN_X = 0;
	public static final int MIN_Y = 0;
	public static final int MAX_X = 25;
	public static final int MAX_y = 25;
	
	
	
	public static void main(String[] args)
	{
		new Chaos();
	}
	
	public Chaos()
	{
		Point p = new Point(5,10);
		
		System.out.println(p);
	}
	class Point
	{
			private int x;
			private int y;
			
			public Point(int x, int y)
			{
				this.setX(x);
				this.setY(y);
			}
			
			public int getX()
			{
				return this.x;
			}
			
			public void setX(int x)
			{
				if (x >= MIN_X && x <= MAX_X)
				{
					this.x = x;
				}
			}
			public int getY()
			{
				return this.y;
			}
			
			public void setY(int y)
			{
				if (y >= MIN_Y && y <= MAX_Y)
				{
					this.y = y;
				}
			}
	}
}