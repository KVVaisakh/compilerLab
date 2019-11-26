package lab1;
import java.util.*; 

public class dfa 
{
	public
	String type="Identifier";
	void changeType(String token)
	{
		if(token.equals(","))	type="invalid";
		else if(token.equals(" "))	type="invalid";
		else if(token.equals(";"))	type="invalid";
		else if(token.equals("+") || token.equals("*") || token.equals("-")  || token.equals("/") || token.equals("%"))
			type="Arithmetic operators";
		else if(token.equals("||") || token.equals("&&") || token.equals("!=") || token.equals("==") )
			type="Logical operetors";
		else if(token.equals("="))
			type="Assignment operator";
		else if(token.equals("("))
			type="Left paranthesis";
		else if(token.equals(")"))
			type="Right paranthesis";
		else if(token.equals("{"))
			type="Left curly braces";
		else if(token.equals("}"))
			type="Right curly braces";
		else if(token.equals("integer") || token.equals("char") || token.equals("string") || token.equals("float"))
			type="datatypes";
		else if(token.equals("var") || token.equals("main"))
			type="Keywords";
		else if(token.equals("input"))
			type="input";
		else if(token.equals("output"))
			type="output";
		else
			type="Identifier";
	}
}
