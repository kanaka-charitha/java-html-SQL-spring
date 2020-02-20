class Student{
String name;
Student(String s){
}
void setName(String na){
name=na;
}
String getName(){
return name;
}
}
public class Test{
public static void change(Student p){
p.setName("mary");
//p.setName("charitha");
}
public static void main(String[] args){
Student s1[]=new Student[2];
s1[0]=new Student("charitha");
s1[1]=new Student("goud");
for(int i=0;i<s1.length;i++){
System.out.println("Name:"+s1[i].getName());

}
} 
}