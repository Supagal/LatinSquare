package pkgHelper;

import static org.junit.Assert.*;

import org.junit.Test;

public class LatinSquareTest {

	@Test
	public void ContainsZerotest() {
		int[][] myArray= {{1,2,3},{2,3,1},{3,1,2}};
		//hard coded two dimensional array
		
		LatinSquare ls = new LatinSquare(myArray);
		
		assertFalse(ls.ContainsZero());
		//test passes if values put in are false (no zeros)
		
		myArray[0][1]=0;
		//changing array values to 0 so that all conditionals can be checked
		//run using coverage run to see what code is being tested and ran through and what is not
	
	}
	
	@Test
	public void DoesElementExistTest() {
		int[][] myArray= {{1,2,3},{2,3,1},{3,1,2}};
		LatinSquare ls = new LatinSquare(myArray);
		
		assertFalse(ls.ContainsZero());
		
	}
	
	@Test
	public void DoesElementExistTest2() {
		int[][] myArray = {{1,2,3},{2,0,1},{3,0,2}};
		LatinSquare ls = new LatinSquare(myArray);
		
		assertTrue(ls.ContainsZero());
	}
	@Test
	public void hasDuplicatesTest1() {
		LatinSquare ls = new LatinSquare();
		int[] arr = {1,2,3,4,5};
		boolean bHasDuplicates = ls.hasDuplicates(arr);
		
		assertEquals(bHasDuplicates, false);
	}
	
	@Test
	public void hasDuplicatesTest2() {
		LatinSquare ls = new LatinSquare();
		int[] arr = {1,1,2,2,3};
		boolean bHasDuplicates= ls.hasDuplicates(arr);
		
		assertEquals(bHasDuplicates, true);
 	}
	
	@Test
	public void hasAllValuesTest1() {
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {1,2,3,4,5};
		LatinSquare ls = new LatinSquare();
		boolean values = ls.hasAllValues(arr1, arr2);
		
		assertEquals(values, true);
		}
	
	@Test
	public void hasAllValuesTest2() {
		int[] arr1 = {1,2,3};
		int[] arr2 = {5,6,8};
		LatinSquare ls = new LatinSquare();
		boolean values = ls.hasAllValues(arr1, arr2);
		
		assertEquals(values, true);
		}
	
	
	@Test
	public void isLatinSquareTest1() {
		int[][] myLatinSquare = {{1,2,3},{3,1,2},{2,3,1}};
		LatinSquare ls = new LatinSquare(myLatinSquare);
		assertTrue(ls.isLatinSquare());
	}
	
	@Test
	public void isLatinSquareTest2()
	{
		int[][] myLatinSquare = {{1,2,0},{2,3,4},{3,1,2}};
		LatinSquare ls = new LatinSquare(myLatinSquare);
		assertFalse(ls.isLatinSquare());
		}
	}



