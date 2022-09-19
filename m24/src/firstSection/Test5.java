package firstSection;

//public class Test5 {
/*class Test5
{
	public static void main(String args[])
	{
		try
		{
			System. out . print( "Hello" + " " + 1 / 0);
		}
		catch (ArithmeticException e)
		{
	System . out . print( "World");
		}
	}
}*/
class Test5
{
	public static void main(String args[])
	{
		try
		{
			int a = 5;
			int b = 0;
			int c = b / a;
			System. out . print ("Hello") ;
		}
		catch (Exception e)
		{
			System. out . print ( "World") ;
		}
	}
}
