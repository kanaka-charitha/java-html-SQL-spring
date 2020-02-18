package sss123;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase{
public CalculatorTest(String name) {
	super(name);
}
public void test()
{
	Calculator c1=new Calculator();
	//Factorial f1=new Factorial(4);
	//c1.add(f1);
	assertEquals(120,c1.factorial(5));
	//assertEquals(40,m2.getValue());
	}
}

