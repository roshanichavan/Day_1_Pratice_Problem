package day1_pratice_problem;

public class SumCammadLineArgument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, cna=0, sum=0;
		System.out.println(args);
		for(int i=0; i<args.length; i++)
		{
			try
			{
				n=Integer.parseInt(args[i]);
				sum= sum+n;
			}
			catch (NumberFormatException e)
			{
				//system.out.println("invalid integer: ");
				cna++;
			}
		}
		System.out.println("Sum of Only Valid Integers: "+sum);
		System.out.println("Invalid Integers Are: "+cna);
	}

}




