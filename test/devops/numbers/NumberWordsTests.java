package devops.numbers;

import org.junit.*;


import devops.numbers.NumberWords;

public class NumberWordsTests {
//	private NumberWords numberWords ;
	
	@Before
	public void setup() {
//		numberWords = new NumberWords() ;
	}

	@Test
	public void numberToWordsTest1() {
		Assert.assertEquals( "Pass", "seven", NumberWords.toWords( 7 ).trim() ) ;
	}
	
	@Test
	public void numberToWordsTest2() {
		Assert.assertEquals( "Pass", "seventy six", NumberWords.toWords( 76 ).trim() ) ;
	}
	
	@Test
	public void numberToWordsTest4() {
		Assert.assertEquals( "Pass", "seven thousand  seven hundred forty eight", NumberWords.toWords( 7748 ).trim() ) ;
	}
	
	@Test
	public void numberToWordsTest7() {
		Assert.assertEquals( "Pass", "six million  seven hundred sixty eight thousand  eight hundred forty five", NumberWords.toWords( 6768845 ).trim() ) ;
	}
	
	@Test
	public void numberToWordsTest3() {
		Assert.assertEquals( "Pass", "three hundred forty seven", NumberWords.toWords( 347 ).trim() ) ;
	}
	
	@Test
	public void numberToWordsTest5() {
		Assert.assertEquals( "Pass", "sixty seven thousand  eight hundred fifty nine", NumberWords.toWords( 67859 ).trim() ) ;
	}
	
	@Test
	public void numberToWordsTest9() {
		Assert.assertEquals( "Pass", "seven hundred sixty eight million  six hundred eighty six thousand  eight hundred ninety seven", NumberWords.toWords( 768686897 ).trim() ) ;

	}
	
	@Test
	public void numberToWordsTest10() {
		Assert.assertEquals( "Pass", "three billion  four hundred fifty eight million  seven hundred ninety two thousand  three hundred forty eight", NumberWords.toWords( 3458792348L ).trim() ) ;
	}

}