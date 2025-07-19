package demo18;



	import java.util.regex.Matcher;
	import java.util.regex.Pattern;

	public class Patternmatch {

		public static void main(String[] args) {
	String text1="Hello World";
	String regex2="hello";
	Pattern pattern2=Pattern.compile(regex2,Pattern.CASE_INSENSITIVE);
	Matcher matcher2=pattern2.matcher(text1);
	if(matcher2.find())
	{
		System.out.println("Found"+ matcher2.group());
	}
	else
	{
		System.out.println("No Match");
	}
		}

	}

