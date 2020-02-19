package sss123;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
@RunWith(Parameterized.class)

public class PrimeTest {
private Integer inputNumber;
private Boolean expectedResult;
private Prime prime;

@Before
public void initialize() {
	prime=new Prime();
}
public PrimeTest(Integer inputNumber,Boolean expectedResult) {
	this.inputNumber=inputNumber;
	this.expectedResult=expectedResult;
}
@Parameterized.Parameters
public static Collection primeNumbers() {
	return Arrays.asList(new Object[][] {
		{2,true},{6,false},{19,true},{22,false},{23,true}
		});
	}
@Test
public void testPrimeNumberChecker() {
	System.out.println("parameterized Number is:"+inputNumber);
	assertEquals(expectedResult,Prime.validate(inputNumber));
}
}





