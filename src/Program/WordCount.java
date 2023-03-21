package Program;

public class WordCount {

	public static void main(String[] args) {
		//Scanner in = new Scanner(System.in);
        System.out.print("Input the string: ");
        //String str = in.nextLine();
        String str="Priya Prasd   Harsh";
        int count = 0;
        if (!(" ".equals(str.substring(0, 1))) || !(" ".equals(str.substring(str.length() - 1))))
        {
            for (int i = 0; i < str.length(); i++)
            {
                if (str.charAt(i) == ' ')
                {
                    count++;
                }
            }
            count = count + 1; 
        }
        //else System.out.print("string is not valid");
        System.out.print("Number of words in the string: " + count+"\n");

	}

}
