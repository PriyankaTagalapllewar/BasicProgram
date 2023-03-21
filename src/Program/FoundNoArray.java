package Program;

public class FoundNoArray {

	public static void main(String[] args) {
		int a[]={3,6,9,12,15,18};
		  int b = 12;
		  boolean bflag=false;
		
		  for(int i=0;i<a.length;i++)
		  {
		     if(a[i]==b)
			 {
			 bflag=true;
			 }
		  }
		  if(bflag==true)
		  {
		  System.out.println("Number is found in array");
		  
		  }
		  else
		  {
		  System.out.println("Number is not found in array");
		  
		  }

	}

}
