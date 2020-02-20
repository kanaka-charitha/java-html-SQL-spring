package practice;
class One1 {
int var1;
One1(){
	
}
One1(int x){
	var1=x;
}
}
class Derived1 extends One1{
int var2;
Derived1(){
	
}
void display() {
System.out.println("var1="+var1+"var2="+var2);
}
}
class Main1 {
	public static void main(String[] args) {
		Derived1 obj=new Derived1();
		obj.display();
	}

}
