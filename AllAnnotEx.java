package sss123;
import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.*;
public class AllAnnotEx {
private ArrayList<String>list;
@BeforeClass
public static void m1() {
	System.out.println("using @BeforeClass,executed before all testcases");
}
@Before
public void m2() {
	list=new ArrayList<String>();
	System.out.println("using@Before annotations,executed beforeeach test cases");
}
@AfterClass
public static void m3() {
	System.out.println("using@AfterClass annotations,executed beforeeach test cases");
}
@After
public void m4() {
	System.out.println("using @BeforeClass,executed before all testcases");
}
}
