package lab1;
import java.util.regex.*;  

public class regularExpression {
	String type="";
	void changeType(String token)
	{
		if(Pattern.matches(",",token))	type="invalid";
		else if(Pattern.matches(" ",token))	type="invalid";
		else if(Pattern.matches(";",token))	type="invalid";
		else if(Pattern.matches("\\+|\\*|-|\\/|%",token))
			type="Arithmetic operators";
		else if(Pattern.matches("|||&&|!=|==",token))
			type="Logical operetors";
		else if(Pattern.matches("=",token))
			type="Assignment operator";
		else if(Pattern.matches("\\(",token))
			type="Left paranthesis";
		else if(Pattern.matches("\\)",token))
			type="Right paranthesis";
		else if(Pattern.matches("\\{",token))
			type="Left curly braces";
		else if(Pattern.matches("\\}",token))
			type="Right curly braces";
		else if(Pattern.matches("integer|char|string|float",token))
			type="datatypes";
		else if(Pattern.matches("var|main",token))
			type="Keywords";
		else if(Pattern.matches("input|output",token))
			type=token;
		else
			type="Identifier";
	}
}
