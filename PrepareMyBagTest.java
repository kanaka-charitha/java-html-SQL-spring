package sss123;

import org.junit.Test;
import static org.junit.Assert.*;
import  org.junit.Before;
public class PrepareMyBagTest {
FirstDaySchool school;
String[]bag= {"books","notebooks","pens"};

@Before
public void setUp() throws Exception{
	System.out.println("initialization");
	school=new FirstDaySchool();
}
@Test
public void testprepareMyBag(){
	System.out.println("inside testprepareMyBag()");
	assertArrayEquals(bag,school.PrepareMyBag());
}
@Test
public void testCheckMyName(){
	System.out.println("inside test check name()");
	school.checkmyName("charitha");
	assertTrue(school.res);
}
}
