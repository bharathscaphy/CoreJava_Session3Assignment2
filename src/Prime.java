
public class Prime {
	public void isPrime(int num)
	{
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==2)
			System.out.println(num+" is a Prime Number");
		else
			System.out.println(num+" is Not a Prime Number");
	}
}
