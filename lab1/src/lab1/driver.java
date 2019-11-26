package lab1;
import java.util.*; 
import java.io.File;
import java.io.FileNotFoundException; 

public class driver 
{
	public static void main(String[] args) 
	{
		File file = new File("/home/examuser/Desktop/program.txt"); 
		dfa d=new dfa();
		regularExpression rg=new regularExpression();
		Scanner scan = null;
		try {
			scan = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("using dfa");
		String program;		
		while(scan.hasNext())
		{
		    program=scan.nextLine();
			StringTokenizer tokens=new StringTokenizer(program, "()+*/-;%&&||{}, ",true); 
		    while (tokens.hasMoreTokens()) 
		    {
		    	String token=tokens.nextToken();
		    	d.changeType(token);
		    	if(!d.type.equals("invalid"))	System.out.println(token+"-"+d.type);
		    }
		}	
		System.out.println("\n\nusing regex");	
		scan = null;
		try {
			scan = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		while(scan.hasNext())
		{
		    program=scan.nextLine();
			StringTokenizer tokens=new StringTokenizer(program, "()+*/-;%&&||{}, ",true); 
		    while (tokens.hasMoreTokens()) 
		    {
		    	String token=tokens.nextToken();
		    	rg.changeType(token);
		    	if(!rg.type.equals("invalid"))	System.out.println(token+"-"+rg.type);
		    }
		}	
	}
}
