import java.math.BigInteger;

public class Factorial 
{
	public static void main(String[] args)
	{
		BigInteger n = new BigInteger("100");
		
		for (BigInteger i=n.subtract(BigInteger.ONE); i.compareTo(BigInteger.ONE); i=i.subtract(BigInteger.ONE))
			n = n.multiply((BigInteger)i);
		System.out.println(n);
		
		int sum= 0;
		while (n.compareTo(BigInteger.ZERO) >0)
		{
			sum +=n.mod(BigInteger.TEN).intValue();
			n = n.divide(BigInteger.TEN);
		}
		System.out.println(sum);
	}
}