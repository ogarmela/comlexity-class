
public class comlexity1 {
	public static int[] mystery1(int[] list) 

	{

	//Declare the result array of 2N size and its complexity of O(1) that is constant

	int[] result = new int[2*list.length];



	//Run the for loop for N time so complexity of this for loop is O(N)

	for (int i=0; i<list.length; i++) {

	//Assign the value to the result array and its complexity is constant that is O(1)

	result[2*i] = list[i] / 2+list[i] % 2;

	result[2*i+1] = list[i] / 2;

	}

	//Return the result and its complexity if constant. that is O(1)





	So overall the complexity of the above method is O(N) because it is  using the only one for loop for N time. and rest of the statement are of order O(1).

	So overall complexity of the program is O(N)

	return result;

	}



}
