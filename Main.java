public class Main {
    public static void main(String[] args) {
	String Letters[][]=
	{
	
	{"  ******  " ,
	 " **    ** " ,
	 "**      **" ,
	 "**      **" ,
	 "**      **" ,
	 " **    ** " ,
	 "  ******  "  },
	 
	{"  ******  " ,
	 " **    ** " ,
	 "**      **" ,
	 "**      **" ,
	 "**      **" ,
	 " **    ** " ,
	 "  ******  "  },
	 
	{" ********  " ,
	 " **    **  " ,
	 " **    **  " ,
	 " **    **  " ,
	 " ********  " ,
	 " **        " ,
	 " **        " ,
	 " **        " },
	 
	{"  ******  " ,
	 " **    ** " ,
	 " **       " ,
	 "  *****   " ,
	 "       ** " ,
	 " **    ** " ,
	 "  *****   " }
	 
	};
	 
	 for (int i=0;i<7;i++)
	 {
		String row[]=new String[Letters.length];
		for (int j=0;j<Letters.length;j++)
		{
			row[j]=Letters[j][row];
		}
		System.out.println(String.join(" ",row));
	 }
	}
}