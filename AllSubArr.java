
import java.io.*;
import java.util.*;
public class AllSubArr {
    
class Pair
{
int first, second;
Pair(int a, int b)
{
	first = a;
	second = b;
}
}


static ArrayList<Pair> findSubArrays(int[] arr, int n)
{
	
	ArrayList<Pair> out = new ArrayList<>();

	for (int i = 0; i < n; i++)
	{
	int prefix = 0;
	for(int j = i; j < n; j++){
		prefix += arr[j];
		if(prefix == 0)
		out.add(AllSubArr.printPair(i, j));
	}
	}
	return out;
}

private static AllSubArr.Pair printPair(int i, int j) {
    return null;
}

// Function to print all subarrays with 0 sum
static void print(ArrayList<Pair> out)
{
	for (int i = 0; i < out.size(); i++)
	{
	Pair p = out.get(i);
	System.out.println("Subarray found from Index "
						+ p.first + " to " + p.second);
	}
}

// Driver code
public static void main(String args[])
{


	int[] arr = {8, 2, -5, -3, 6, -4, 2, 4, 6, -9, 8};
	int n = arr.length;


	ArrayList<Pair> out = findSubArrays(arr, n);

	
	if (out.size() == 0)
	System.out.println("if their is not any arrays");
	else
	print(out);
}
}

