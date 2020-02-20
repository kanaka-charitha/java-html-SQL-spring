package practice;

 class Order {
Order(){
	System.out.println("cat");
}
public static void main(String...Args) {
	Order obj=new Order();
	System.out.println("Ant");
}
static {
	System.out.println("dog");
}
}
