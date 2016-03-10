package wdsr.exercise1.conversions;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ArrayConverterTest 
{
	private ArrayConverter arrayConverter;
	
	@Before
	public void setup()
	{
		arrayConverter = new ArrayConverter();
	}
	
	@Test
	public void shouldReturnArrayOfIntegersWhenArgumentIsArrayOfstr()
	{
		String[] str = {"-10", "30", "50"};
		int[] result = arrayConverter.convertToInts(str);
        assertEquals(str.length, result.length);
	}
	
    @Test(expected = NullPointerException.class)
	public void shouldRiseAnExceptionWhenArgumentIsNull()
	{
		String[] str = null;
		int[] result  = arrayConverter.convertToInts(str);
	}
	
	@Test(expected = NumberFormatException.class)
	public void shouldRiseAnExceptionWhenElementOfArrayCouldNotToBeAnInteger()
	{
		String[] str = {"-10", "3d", "50"};
		int[] result = arrayConverter.convertToInts(str);
	}
}
