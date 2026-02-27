public class Main
{
	public static String[] getOPattern(){
		return new String[] 
		{
			 "  ******  " ,
			 " **    ** " ,
			 "**      **" ,
			 "**      **" ,
			 "**      **" ,
			 " **    ** " ,
			 "  ******  " 
		};
	}	
	public static String[] getpPattern(){
		return new String[] 
		{
			 " ********  " ,
			 " **    **  " ,
			 " **    **  " ,
			 " ********  " ,
			 " **        " ,
			 " **        " ,
			 " **        " 
		};
	}	
	public static String[] getsPattern(){
		return new String[] 
		{
			 "  ******  " ,
			 " **    ** " ,
			 " **       " ,
			 "  *****   " ,
			 "       ** " ,
			 " **    ** " ,
			 "  *****   "
		};
	}	
	
	public static void main(String[] args)
	{
		String[] oPattern = getOPattern();
		String[] pPattern = getpPattern();
		String[] sPattern = getsPattern();
		
		for (int i=0; i< oPattern.length; i++)
		{
			System.out.println(String.join(" ",oPattern[i],pPattern[i],sPattern[i]));
		}
	}
}