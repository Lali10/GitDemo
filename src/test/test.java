package test;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str= "Welcome to Java world";
		// vowels
		
		
		char[] chararr = str.toCharArray();
		int i;
		int dupa=0;
		int dupe=0;
		int dupi=0;
		int dupo=0;
		int dupu=0;
		
				
		for (i=0;i<=str.length();i++)
		{
			if (chararr[i]== 'a') 
			{
				if (dupa ==1)
				{
					continue;
				}
				else {
				System.out.println(chararr[i]);
				dupa++;
			}}
				else if (chararr[i]== 'e')
				{
					if (dupe ==1)
					{
						continue;
					}
					else {
					System.out.println(chararr[i]);
					dupe++;
				}}
				else if (chararr[i]== 'i')
				{
					if (dupi ==1)
					{
						continue;
					}
					else {
					System.out.println(chararr[i]);
					dupi++;
				}}
				else if (chararr[i]== 'o')
				{
					if (dupo ==1)
					{
						continue;
					}
					else {
					System.out.println(chararr[i]);
					dupo++;
				}}
						
				else if (chararr[i]== 'u')
				{
					if (dupu ==1)
					{
						continue;
					}
					else {
					System.out.println(chararr[i]);
					dupu++;
				}}
			
		}
	}

}
