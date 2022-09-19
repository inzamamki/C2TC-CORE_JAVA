package firstSection;

class A{
private void printName() {
System.out.println("Value-A");
}
}

class B extends A{
 void printName(){
System.out.println("Name-B");
 }
}
public class Quize3{
public static void main(String[] args){
B b = new B();
b.printName();
}
}


		