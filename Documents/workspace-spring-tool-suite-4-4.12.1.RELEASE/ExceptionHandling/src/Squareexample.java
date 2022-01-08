class NegativeNumberException extends Exception
{}
public class Squareexample {
	
	int Square(int num) throws NegativeNumberException
	{
		if (num<0)
		{
			throw new NegativeNumberException();
		}
		return num*num;
	}	

	public static void main(String[] args) {
		Squareexample s=new Squareexample();
		
			try {
				System.out.println(s.Square(4));
				System.out.println(s.Square(-4));
			} catch (NegativeNumberException ne) {
				
				System.out.println("Negative number exception");;
			}
			

	}

}
