package day;

public class Person{
	String name,address;
	int age;
	void talk() {
		System.out.println("我叫"+name+"，今年"+age+"，住在"+address);
	}
	String talk2() {
		System.out.println("我叫"+name+"，今年"+age+"，住在"+address);
		return "java.lang.String";
	}
}
