package practice;
class X{
	X(){}
	int x;
	X(int x){
		x=2;
		System.out.println(x);
	}
}
 class Y extends X{
Y(){
}
void displayX() {
	System.out.println(x);
}
	public static void main(String[] args) {
new Y().displayX();}

}
