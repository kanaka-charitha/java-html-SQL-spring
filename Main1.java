package practice;
class One {
int var1;
One(){
	
}
One(int x){
	var1=x;
}
}
class Derived extends One{
int var2;
Derived(){
	
}
void display() {
System.out.println("var1="+var1+"var2="+var2);
}
}
class Main1 {

	public static void main(String[] args) {
		Derived obj=new Derived();
		obj.display();
	}

}
