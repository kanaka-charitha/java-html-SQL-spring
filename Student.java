class T1{
public static void change(Student p){
p.setName("Mary");
}
}
class Student extends T1{
Student(String s1){
}
public static void main(String [] args){
Student s1=new Student("John");
change(s1);
System.out.println("s1="+s1.getName());
}
String getName(){
System.out.println("john");
return "john";
}
}
