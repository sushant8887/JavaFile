package SetB;

public class AllinOne {

	public class ASCII {

		public static void main(String[] args) {

			char ch = '}';

			int ascii = ch;

			System.out.println("The ASCII value of " + ch + " is: " + ascii);
		}
	}
	
	
	
	
	public class AdditionOfTwoMatrices{  
		public static void main(String args[]){  
		//creating two matrices    
		int a[][]={{1,3,4},{2,4,3}};    
		int b[][]={{1,1,1},{1,1,1}};    
		    
		//creating another matrix to store the sum of two matrices    
		int c[][]=new int[2][3];  //3 rows and 3 columns  
		    
		//adding and printing addition of 2 matrices    
		for(int i=0;i<2;i++){    
		for(int j=0;j<3;j++){    
		c[i][j]=a[i][j]+b[i][j];    //use - for subtraction  
		System.out.print(c[i][j]+" ");    
		}    
		System.out.println();//new line    
		}    
		}}  
	
	
	
	
	
	
	import java.util.Arrays;

	public class AnagramString {
	public static void main(String[] args) {
		String str1="LIVE";
		String str2="EVIL";
				if (str1.length()==str2.length()) {
					char[]a=str1.toCharArray();
					char[]b=str2.toCharArray();
					Arrays.sort(a);
					Arrays.sort(b);
					boolean result=Arrays.equals(a,b);
					if (result) {
						System.out.println("Strings are Anagram");
					}else {
						System.out.println("strings are not Anagram ");
					}
				}
				
	}
	}
	
	
	
	
	
	
	
	
	class ArrayAsceOrder {

		static int length;

		public static void printArray(int[] array) {
			for (int i = 0; i < length; i++) {
				System.out.print(array[i] + " ");
			}
			System.out.println();
		}

		public static void sortArray(int[] array) {
			int temporary = 0;

			for (int i = 0; i < length; i++) {
				for (int j = i + 1; j < length; j++) {
					if (array[i] > array[j]) {
						temporary = array[i];
						array[i] = array[j];
						array[j] = temporary;
					}
				}
			}

			System.out.println("Elements of array sorted in ascending order: ");
			printArray(array);
		}

		public static void main(String[] args) {

			int[] array = new int[] { -5, -9, 8, 12, 1, 3 };

			length = array.length;

			System.out.print("Elements of original array: ");

			printArray(array);

			sortArray(array);
		}
	}
	
	
	
	
	public class Automorphic {
		public static void main(String[] args) {
			int a;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Number");
			a = sc.nextInt();
			int sqrt = a*a;
			int value = sqrt%10;
			if (value == a) {
				System.out.println("is Automorphic");
				
			}else {
				System.out.println("not automorphic");
			}
		}
		}
	
	
	
	
	
	
	
	class Camelcase {
		static void CamelCase(ArrayList<String> words, String pattern) {
			Map<String, List<String>> map = new HashMap<String, List<String>>();
			for (int i = 0; i < words.size(); i++) {
				String str = "";
				int l = words.get(i).length();
				for (int j = 0; j < l; j++) {
					if (words.get(i).charAt(j) >= 'A' && words.get(i).charAt(j) <= 'Z') {
						str += words.get(i).charAt(j);
						map.put(str, list(map.get(str), words.get(i)));
					}
				}
			}
			boolean wordFound = false;
			for (Map.Entry<String, List<String>> it : map.entrySet()) {
				if (it.getKey().equals(pattern)) {
					wordFound = true;
					for (String s : it.getValue())
						System.out.print(s + "\n");
				}
			}
			if (!wordFound) {
				System.out.print("No match found");
			}
		}

		private static List<String> list(List<String> list, String str) {
			List<String> temp = new ArrayList<String>();
			if (list != null)
				temp.addAll(list);
			temp.add(str);
			return temp;
		}

		public static void main(String[] args) {
			String arr[] = { "Hi", "Hello", "HelloWorld", "HiTech", "HiGeek", "HiTechWorld", "HiTechCity", "HiTechLab" };

			ArrayList<String> words = new ArrayList<String>(Arrays.asList(arr));
			String pattern = "HT";
			CamelCase(words, pattern);
		}
	}
	
	
	
	
	
	
	
	class CapitalizeLetter {
		static String FirstAndLast(String str) {
			// Create an equivalent char array of given string
			char[] ch = str.toCharArray();
			for (int i = 0; i < ch.length; i++) {
				// k stores index of first character and i is going to store index of last
				// character.
				int k = i;
				while (i < ch.length && ch[i] != ' ')
					i++;
				// Check if the character is a small letter If yes, then Capitalise
				ch[k] = (char) (ch[k] >= 'a' && ch[k] <= 'z' ? ((int) ch[k] - 32) : (int) ch[k]);
				ch[i - 1] = (char) (ch[i - 1] >= 'a' && ch[i - 1] <= 'z' ? ((int) ch[i - 1] - 32) : (int) ch[i - 1]);
			}
			return new String(ch);
		}
		public static void main(String args[]) {
			String str = "sushant from sdac";
			System.out.println("Input String:- " + str);
			System.out.println(
					"String after Capitalize :- " + FirstAndLast(str));
		}
	}
	
	
	
	
	
	
	
	import java.io.*;

	class DeciToOct {

		static void decToOctal(int n) {

			int[] octalNum = new int[100];

			int i = 0;
			while (n != 0) {

				octalNum[i] = n % 8;
				n = n / 8;
				i++;
			}

			for (int j = i - 1; j >= 0; j--)
				System.out.print(octalNum[j]);
		}

		public static void main(String[] args) {
			int n = 33;

			decToOctal(n);
		}
	}
	
	
	
	
	
	
	
	import java.io.*;

	class Deci_to_Bin {

		static void decToBinary(int n) {

			int[] binaryNum = new int[32];

			int i = 0;
			while (n > 0) {

				binaryNum[i] = n % 2;
				n = n / 2;
				i++;
			}

			for (int j = i - 1; j >= 0; j--)
				System.out.print(binaryNum[j]);
		}

		public static void main(String[] args) {
			int n = 17;
			decToBinary(n);
		}
	}
	
	
	
	
	
	
	
	
	public class DecimaltoBinary {
		public static void main(String[] args) {
			int y;
			System.out.println("Enter the decimal number");
			Scanner sc = new Scanner(System.in);
			y = sc.nextInt();
			String binary = " ";
			while (y!=0) {
				int rem = y%2;
				binary = rem + binary;
				y = y/2;
			}
			System.out.println(binary);
		}
		}
	
	
	
	
	
	import java.util.Arrays;
	import java.util.Scanner;

	public class DivideArray {
	   public static void main(String args[]) {
	      Scanner s =new Scanner(System.in);
	      System.out.println("Enter the required size of the array ::");
	      int size = s.nextInt();
	      int [] myArray = new int[size];
	      System.out.println("Enter elements of the array");
	      for(int i=0; i< size; i++) {
	         myArray[i] = s.nextInt();
	      }
	      System.out.println(Arrays.toString(myArray));
	      int[] myArray1 = Arrays.copyOfRange(myArray, 0, myArray.length/2);
	      int[] myArray2 = Arrays.copyOfRange(myArray, myArray.length/2, myArray.length);
	      System.out.println("First half of the array:: "+Arrays.toString(myArray1));
	      System.out.println("First second of the array:: "+Arrays.toString(myArray2));
	   }
	}
	
	
	
	
	
	
	
	
	package SetB;
	import java.util.*;
	public class Factorial
	{
	     public static void main(String []args)
	     {
	        
	        Scanner sc=new Scanner(System.in);
	       
	        System.out.println("Enter the number: ");
	        int num=sc.nextInt();
	        int i=1,fact=1;
	        while(i<=num)
	        {
	            fact=fact*i;
	            i++;
	        }
	        System.out.println("Factorial of the number: "+fact);  
	     }   
	}
	
	
	
	
	
	
	
	
	
	
	
	
	package SetB;

	public class FactorialusingRecursion {

	    public static void main(String[] args) {
	        int num = 6;
	        long factorial = multiplyNumbers(num);
	        System.out.println("Factorial of " + num + " = " + factorial);
	    }
	    public static long multiplyNumbers(int num)
	    {
	        if (num >= 1)
	            return num * multiplyNumbers(num - 1);
	        else
	            return 1;
	    }
	}
	
	
	
	
	
	
	
	
	
	import java.util.Iterator;
	import java.util.Scanner;
	public class Fibonacci {
	public static void main(String[] args) {
		int a = 0; int b = 1; int c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the term");
		int term = sc.nextInt();
		for (int i = 1; i<= term; i++) {
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}
	}
	}
	
	
	
	
	
	
	
	

public class GCD {
public static void main(String[] args) {
	int a = 12;
	int b = 18;
	int gcd = 1;
	int i = 1;
	while (i<=a && i<=b) {
		if(a%i==0 && b%i==0) {
			gcd = i;
		}i++;
	}
System.out.println(gcd);
}
}












package SetB;

import java.io.*;

class HexToDeci {

	static int hexadecimalToDecimal(String hexVal) {
		int len = hexVal.length();

		int base = 1;

		int dec_val = 0;

		for (int i = len - 1; i >= 0; i--) {

			if (hexVal.charAt(i) >= '0' && hexVal.charAt(i) <= '9') {
				dec_val += (hexVal.charAt(i) - 48) * base;

				base = base * 16;
			}

			else if (hexVal.charAt(i) >= 'A' && hexVal.charAt(i) <= 'F') {
				dec_val += (hexVal.charAt(i) - 55) * base;

				base = base * 16;
			}
		}
		return dec_val;
	}

	public static void main(String[] args) {
		String hexNum = "1A";
		System.out.println(hexadecimalToDecimal(hexNum));
	}
}
	








package SetB;

class LargestNuminArray {
	static int arr[] = { 10, 324, 45, 90, 9808 };

	static int largest() {
		int i;

		int max = arr[0];

		for (i = 1; i < arr.length; i++)
			if (arr[i] > max)
				max = arr[i];

		return max;
	}

	public static void main(String[] args) {
		System.out.println("Largest in given array is " + largest());
	}
}











import java.util.Scanner;
public class Leapyear {
public static void main(String[] args) {
	int y;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the valid year");
	y = sc.nextInt();
	if(y%4 == 0) {
		System.out.println("Leap year");
	}
	else {
		System.out.println("not a leap year");
	}
}
}
	
	







public class  LengthofLast{
    public int lengthOfLastWord(String s) {
        // check input
        if (s == null || s.length() == 0) {
            return 0;
        }
        // split string by space
        String[] strs = s.split(" ");
        // check if there is any word
        if (strs.length == 0) {
            return 0;
        }
        // return the length of the last word
        return strs[strs.length - 1].length();
    }
}








package SetB;

public class LowerTriangular {
	public static void main(String[] args) {
		int rows, cols;
		int a[][] = { { 1, 2, 3 }, { 8, 6, 4 }, { 4, 5, 6 } };

		// Calculates number of rows and columns present in given matrix
		rows = a.length;
		cols = a[0].length;

		if (rows != cols) {
			System.out.println("Matrix should be a square matrix");
		} else {

			System.out.println("Lower triangular matrix: ");
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < cols; j++) {
					if (j > i)
						System.out.print("0 ");
					else
						System.out.print(a[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
}












import java.util.*;

class Maximum1 {

static int R = 4 ;
static int C = 4 ;

// Function that returns index of row
// with maximum number of 1s.
static int rowWithMax1s(int mat[][], int R, int C)
{
	// Flag to check if there is not even a single 1 in the matrix. 
	boolean flag = true;
	// Initialize max values
	int max_row_index = 0, max_ones = 0;;

	// Traverse for each row and count number of 1s
	for(int i = 0 ; i < R ; i++){

			int count1 = 0 ;
			for(int j = 0 ; j < C ; j++){
				if(mat[i][j] == 1){
					count1++;
					flag = false;
				}
			}
			if(count1>max_ones){
				max_ones = count1;
				max_row_index = i;
			}

		}
	// Edge case where there are no 1 in the matrix
	if(flag){
			return -1;
		}

	return max_row_index;
}

	// Driver Code
	public static void main(String[] args) {
		
	int mat[][] = { {0, 0, 0, 1},
					{0, 1, 1, 1},
					{1, 1, 1, 1},
					{0, 0, 0, 0}};

	System.out.print("Index of row with maximum 1s is " + rowWithMax1s(mat,R,C));
	}
}











package SetB;

import java.util.Scanner;

public class MissingNuminArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value: ");
		int n = sc.nextInt();
		int inpuArray[] = new int[n];
		System.out.println("Enter (n-1) numbers: ");
		for (int i = 0; i <= n - 2; i++) {
			inpuArray[i] = sc.nextInt();
		}

		int sumOfAll = (n * (n + 1)) / 2;
		int sumOfArray = 0;
		for (int i = 0; i <= n - 2; i++) {
			sumOfArray = sumOfArray + inpuArray[i];
		}
		int missingNumber = sumOfAll - sumOfArray;
		System.out.println("Missing number is: " + missingNumber);
	}
}










package SetB;

public class Multiply2Matrices {
	public static void main(String args[]) {
		int a[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
		int b[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };

		int c[][] = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = 0;
				for (int k = 0; k < 3; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
				System.out.print(c[i][j] + " ");
			}
			System.out.println();// new line
		}
	}
}











public class Occurance {
public static void main(String[] args) {
	String text = "Hi how are Hi you Hi sushant Hi";
	String substring = "Hi";
	int count = 0;
	String temp [] = text.split(" ");
	for(int i = 0; i<temp.length; i++ ) {
		if (substring.equals(temp[i])) {
			count ++;
		}
	}
	System.out.println(count);
}
}










package SetB;

import java.util.Scanner;
public class Odd_Even 
{
    public static void main(String[] args) 
    {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number you want to check:");
        n = s.nextInt();
        if(n % 2 == 0)
        {
            System.out.println("The given number "+n+" is Even ");
        }
        else
        {
            System.out.println("The given number "+n+" is Odd ");
	}
    }
}









import java.util.Scanner;
public class Replace
{	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int newnum = 0;
		if (num == 0)
			newnum = 1;
		while (num > 0)
		{
			int rem = num % 10;
			if (rem == 0)
				rem = 1;
			num = num / 10;
			newnum = newnum * 10 + rem;
		}
		num = 0;
		while (newnum > 0)		{
			int r = newnum % 10;
			num = num * 10 + r;
			newnum = newnum / 10;
		}
		System.out.println("New number is: " + num);
	}
}










package SetB;

//Basic Java program that reverses an array 
public class ReverseAnArray { 
	// function that reverses array and stores it 
	// in another array 
	static void reverse(int a[], int n) 
	{ 
		int[] b = new int[n]; 
		int j = n; 
		for (int i = 0; i < n; i++) { 
			b[j - 1] = a[i]; 
			j = j - 1; 
		} 

		// printing the reversed array 
		System.out.println("Reversed array is: \n"); 
		for (int k = 0; k < n; k++) { 
			System.out.println(b[k]); 
		} 
	} 

	public static void main(String[] args) 
	{ 
		int [] arr = {10, 20, 30, 40, 50}; 
		reverse(arr, arr.length); 
	} 
} 










package SetB;
import java.util.Scanner;
public class ReverseString {
public static void main(String[] args) {
	String str = "Hello", nctr = "";
	char ch;
	System.out.println("original word");
	System.out.println("Hello");
	for (int i=0; i<str.length(); i++)
	{
		ch=str.charAt(i);
		nctr = ch+nctr;
		
	}
	System.out.println("reverse word: "+ nctr);
}
}








package SetB;

public class Rotation {
public static boolean check (String s1, String s2) {
	if (s1.length() != s2.length())
		return false;
	String temp = s1+ s1;
	return temp.contains(s2);
}
public static void main(String[] args) {
	String s1 = "hellosk";
	String s2 = "skhello";
	boolean flag = check (s1, s2);
	if (flag) {
		System.out.println(s1 + " and " + s2 + " are rotation ");
		
	}else {
		System.out.println(s1 + " and " + s2 + " are not rotation ");
	}
}
}










package SetB;

public class RotationOfanArray {
void rightRotate(int arr[], int d, int n) {
	while (d>n) {
		d=d-n;
	}
	int temp[] = new int [n-d];
	for(int i=0; i<n-d; i++)
		temp [i]= arr[i];
	for (int i= n-d; i<n; i++) {
		arr [i-n+d]= arr[i];
	}
	for(int i=0; i<n-d; i++) {
		arr[i+d] = temp[i];
	}
}
void printArray(int arr[], int n) {
	for(int i=0; i<n; i++)
		System.out.println(arr[i]+ " ");
}
public static void main(String[] args) {
	RotationOfanArray ob = new RotationOfanArray();
	int arr [] = {1,2,3,4,5};
	ob.rightRotate(arr, 2, arr.length);
	ob.printArray(arr, arr.length);
}
}









package SetB;

import java.util.Arrays;
import java.util.stream.IntStream;

class SearchNuminArray {
	private static void check(int[] arr, int toCheckValue) {
		boolean test = false;
		for (int element : arr) {
			if (element == toCheckValue) {
				test = true;
				break;
			}
		}
		System.out.println("Is " + toCheckValue + " present in the array: " + test);
	}
	public static void main(String[] args) {
		int arr[] = { 5, 1, 1, 9, 7, 2, 6, 10 };
		int toCheckValue = 7;
		System.out.println("Array: " + Arrays.toString(arr));
		check(arr, toCheckValue);
	}
}










package SetB;
import java.util.*;
public class Sorting {
	 public static String solve(String str) {
		    char[] char_arr = str.toCharArray();
		    Arrays.sort(char_arr);
		    // Creating object of String class
		    String ans = new String(char_arr);
		    return ans;
		  }

		  public static void main(String args[]) {
		    String str = "dcab";

		    System.out.println("String after sorting:");
		    System.out.println(solve(str));
		  }
		}
                                








public class StringContainAnotherString {
public static void main(String[] args) {
	String txt = "This is Sushant";
	String str1 = "Sushant";
	String str2 = "Sushk";
	
	boolean result = txt.contains(str1);
	if (result) {
		System.out.println(str1 + " is present in the string");
	}
	else {
		System.out.println(str1 + " is not present");
	}
	result = txt.contains(str2);
	if (result) {
		System.out.println(str2 + " is present in the string");
	}
	else {
		System.out.println(str2 + " is not present");
	}

}
}














public class StringPalindrome  {
	  public static void main(String[] args) {

	    String str = "Radae", reverseStr = "";
	    
	    int strLength = str.length();

	    for (int i = (strLength - 1); i >=0; --i) {
	      reverseStr = reverseStr + str.charAt(i);
	    }

	    if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
	      System.out.println(str + " is a Palindrome String.");
	    }
	    else {
	      System.out.println(str + " is not a Palindrome String.");
	    }
	  }
	}











package SetB;

import java.io.*;

public class StringVowels {
	public static void main(String[] args) throws IOException {
		String str = "SDAC";
		str = str.toLowerCase();
		int count = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {

				count++;
			}
		}

		System.out.println("Total no of vowels in string are: " + count);
	}
}












public class StringequalorNot {
public static void main(String[] args) {
	String a = "Sushant";
	String b = "Sushant";
	if (a.equals(b)) {
		System.out.println("Strings are equal");
	}else {
		System.out.println("Strings are not equal");
	}
}
}








package SetB;
import java.util.*;
public class StrongNumber
{
public static void main(String[] args) {
int n,i;
int fact,rem;
Scanner sc = new Scanner(System.in);
System.out.print("\nEnter the number : ");
n = sc.nextInt();
int sum = 0;
int temp = n;
while(n != 0)
{
i = 1;
fact = 1;
rem = n % 10;

while(i <= rem)
{
fact = fact * i;
i++;
}
sum = sum + fact;
n = n / 10;
}

if(sum == temp)
System.out.println(temp + " is a strong number\n");
else
System.out.println(temp + " is not a strong number\n");

System.out.println();
}
}










package SetB;

public class SumOfAllPrime {

	static boolean checkPrime(int numberToCheck) {
		if (numberToCheck == 1) {
			return false;
		}
		for (int i = 2; i * i <= numberToCheck; i++) {
			if (numberToCheck % i == 0) {
				return false;
			}
		}
		return true;
	}

	static int primeSum(int l, int r) {
		int sum = 0;
		for (int i = r; i >= l; i--) {

			boolean isPrime = checkPrime(i);
			if (isPrime) {

				sum = sum + i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int l = 4, r = 13;

		System.out.println(primeSum(l, r));
	}
}











package SetB;

import java.util.Scanner;
public class SumOfDigits
{
    public static void main(String args[])
    {
        int m, n, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        m = s.nextInt();
        while(m > 0)
        {
            n = m % 10;
            sum = sum + n;
            m = m / 10;
        }
        System.out.println("Sum of Digits:"+sum);
    }
}









package SetB;

import java.util.Scanner;
public class Sum_Odd_Even 
{
    public static void main(String[] args) 
    {
        int n, sumE = 0, sumO = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements in array:");
        n = s.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        for(int i = 0; i < n; i++)
        {
            if(a[i] % 2 == 0)
            {
                sumE = sumE + a[i];
            }
            else
            {
                sumO = sumO + a[i];
            }
        }
        System.out.println("Sum of Even Numbers:"+sumE);
        System.out.println("Sum of Odd Numbers:"+sumO);
    }
}










package SetB;

public class SumoffirstNnatural {
	public static void main(String[] args) {
		int i, num = 10, sum = 0;
		for (i = 1; i <= num; ++i) {
			sum = sum + i;
		}
		System.out.println("Sum of First 10 Natural Numbers is = " + sum);
	}
}







package SetB;

class Transpose {
	static final int N = 3;

	// This function stores transpose
	// of A[][] in B[][]
	static void transpose(int A[][], int B[][]) {
		int i, j;
		for (i = 0; i < N; i++)
			for (j = 0; j < N; j++)
				B[i][j] = A[j][i];
	}

	// Driver code
	public static void main(String[] args) {
		int A[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
		int B[][] = new int[N][N], i, j;
		// Function call
		transpose(A, B);
		System.out.println("Result matrix is ");
		for (i = 0; i < N; i++) {
			for (j = 0; j < N; j++)
				System.out.print(B[i][j] + " ");
			System.out.print("\n");
		}
	}
}









package SetB;

import java.io.*;

public class UpperTriangular {

	static void upper(int matrix[][], int row, int col) {
		int i, j;
		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				if (i > j) {
					System.out.print("0" + " ");
				} else
					System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String args[]) {
		int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int row = 3, col = 3;

		System.out.println("Upper triangular matrix: ");
		upper(matrix, row, col);
	}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
