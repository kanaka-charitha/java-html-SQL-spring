package sss123;

import java.util.Arrays;

public class FirstDaySchool {
public boolean res;
public void checkmyName(String myname) {
	if(myname.compareTo("charitha")==0)
		res=true;
	else
		res=false;
}
public String[] PrepareMyBag() 
{
	String[] schoolbag= {"books","notebooks","pens"};
	System.out.println("my school bag contains:"+Arrays.deepToString(schoolbag));
	return schoolbag;
}
public String[] addPencils() {
	String[] schoolbag= {"books","notebooks","pens","pencils"};
	System.out.println("now my school bag contains:"+Arrays.toString(schoolbag));
	return schoolbag;
}
public static void main(String[] args) {
	FirstDaySchool fds=new FirstDaySchool();
			String[] sb=fds.PrepareMyBag();
	System.out.println(sb);
	for(String s:sb)
		System.out.println("bag contains:"+s);
	String[] pencil=fds.addPencils();
	for(String s:pencil)
		System.out.println("pencil box contains:"+s);
	}
}
