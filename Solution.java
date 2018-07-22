import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<String> words = new ArrayList<String>();
        while(sc.hasNext())
        {
            words.add(sc.next());
        }
        int ctr = 0;
		for(int i=0;words.size()>ctr;i++)
		{
		    for(int j=0;j<i+1;j++)
		    {
		        if(ctr<words.size())
		        {
		        String temp = words.get(ctr++);
		        System.out.print(temp.substring(temp.length()-n,temp.length())+" ");
		        }
		        else
		        {
		            for(int k=0;k<n;k++)
		            {
		                System.out.print("*");
		            }
		            System.out.print(" ");
		        }
		    }
		    System.out.println();
		}

	}
}
