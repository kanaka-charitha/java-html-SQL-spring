class A7{
int x=10;
int y=20;
}
class B7 extends A7{
int x=40;
int y=20;
int z=30;
int a=20;
}
class TestAB7{
public static void main(String [] args){
B7 b=new B7();
A7 a=new A7();
System.out.println(b.x+" "+b.y);
System.out.println(a.x+" "+a.y);
}
}