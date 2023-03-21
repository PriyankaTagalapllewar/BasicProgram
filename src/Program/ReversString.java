package Program;

public class ReversString {

	public static void main(String[] args) {
	String str = "My Life ";
	String MainStr=" "; 
	String []arrStr =str.split(" ");
	for(int j=0; j <arrStr.length; j++)
	{
		String RevStr="";
		String x=arrStr[j];
		for(int i=x.length()-1;i>=0;i--)
		{
			RevStr=RevStr+x.charAt(i);
		}
		MainStr=MainStr + " "+ RevStr;
		
	}
	System.out.println(MainStr);
	
	}
	
	

	}


