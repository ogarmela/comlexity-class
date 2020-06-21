
public class comlexity {
	public static int[] mystery1(int[] list)  {

	    int[] result = new int[2*list.length];

	    for (int i=0; i<list.length; i++)  {

	        result[2*i] = list[i] / 2+list[i] % 2;

	        result[2*i+1] = list[i] / 2;

	    }

	  return result;

	}



-->irrespective of statements inside the for loop..the for loop runs "n" times from i=0 to list.length ( As we pass "n" size array list.length gives "n")....the statements inside the for loop has not modifying the "i" value so the loop runs "n" times from i=0 to n...

