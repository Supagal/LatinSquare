/*Cisc181 Lab 1
Lauren Griffith, Tejas Patel, 
Ahmed Masood,Mengqi Zhang
*/




package pkgHelper;

import java.util.Arrays;

import org.hibernate.mapping.Column;

public class LatinSquare {

	private int[][] myLatinSquare;
	//2 dimensional integer array [][] 1) column  2) row
	
	public LatinSquare(int [][] puzzle)
	//constructor is a method that creates an instance
	{
		this.myLatinSquare = puzzle;
	}
	
	public LatinSquare() {
	}

	public int[][] getMyLatinSquare() {
		return myLatinSquare;
	}

	public void setMyLatinSquare(int[][] myLatinSquare) {
		this.myLatinSquare = myLatinSquare;
	}

	public boolean ContainsZero()
	//returns true if any element is a 0 in the array
	{
		for (int iCol = 0; iCol < myLatinSquare.length; iCol++)
		{
			for(int iRow=0; iRow < myLatinSquare.length; iRow++)
			{
				if(myLatinSquare[iCol][iRow]==0)
				{
					return true;
				}
			}
		}
	return false;
	}
	
	public boolean doesElementExist(int[] arr, int iValue)
	{
		for (int i : arr)
		//for every integer in the array
		{ if (i==iValue)
			return true;
		}
		return false;
	}
	
	public int[] getColumn(int iCol)
	{
		int[] Column = new int[this.myLatinSquare.length];
		
		for (int i = 0; i < myLatinSquare.length ; i++)
		{
			Column[i] = myLatinSquare[iCol][i];
		}
		
		return Column;
	}

	public int[] getRow(int iRow)
	{
		int[] Row = new int[this.myLatinSquare.length];
		for (int i=0; i< myLatinSquare.length; i++)
		{
			Row[i]=myLatinSquare[iRow][i];
		}
			
		return Row;
			
	}
public boolean hasDuplicates(int [] arr) {
	//Write Method if statement
	boolean hasDuplicates= false;
	int[]sortArr=Arrays.copyOf(arr, arr.length);
	for (int i=0; i<sortArr.length -1; i++)
	{
		if (sortArr[i]==sortArr[i+1])
		{
			hasDuplicates = true;
			break;
		}
	}
	return hasDuplicates;
}


public boolean 	hasAllValues(int[] arr1, int[] arr2) {
	boolean hasAllValues = true;
	for (int i=0; i< arr2.length; i++)
	{
		boolean Found = false;
		
		for (int j = 0;  j < arr1.length; j++)
		{
			if (arr2[i]==arr2[j]) {
				Found=true;
				break;
			}
		}
		if (Found == false) {
			hasAllValues = false;
			break;
		}
	}
	return hasAllValues;
}


public boolean isLatinSquare() {
	// fill in method
	
	
	if (myLatinSquare==null)
	{
		return false;
	}
	
	
	for (int i = 0; i < myLatinSquare.length; i++)
	{
		if (hasDuplicates(getRow(i)))
		{
			return false;
		}
	}
	
	for (int j = 0; j < myLatinSquare.length; j++)
	{
		if (hasDuplicates(getColumn(j)))
		{
			return false;
		}
	}
	
	for (int h = 1; h < myLatinSquare.length; h++)
	{
		if (!hasAllValues(getRow(0),getRow(h)));
		{
			return false;
		}
	}
	
	for (int z = 1; z < myLatinSquare.length; z++)
	{
		if (!hasAllValues(getColumn(0),getColumn(z)));
		{
			return false;
		}
	}

	return true;
}
	
	
}

