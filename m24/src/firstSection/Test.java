package firstSection;

//public class Test

class Test
{
public static void main(String args[])
{
	try
	{
		int a = args . length;
		int b = 10 / a;
		System. out . print(a) ;
		try
		{
			if (a == 1)
				a = a / a - a;
			if (a == 2)
			{
				int []c = {1};
				c [8] = 9;
			}
		}
		catch (ArrayIndexOutOfBoundException e)
		{
			System . out . println("TypeA" );
		}
		catch (ArithmeticException e)
		{
			System. out . println("TypeB" ) ;
		}
	}
	}
	}
