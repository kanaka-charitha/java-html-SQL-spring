class A{
int x;
int y;
int get(int p,int q){
x=p;y=q;
return(0);
}
void show(){
System.out.println(x);
}
}
class B extends A{
public static void main(String [] args){
//B a=new B();
A aa;
aa=new A();
aa.show();
aa.get(5,6);
aa=new B();
aa.show();
aa.get(10,20);
//a.display();
}
void show(){
System.out.println(y);
}
}

