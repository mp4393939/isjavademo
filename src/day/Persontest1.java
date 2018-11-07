package day;

public class Persontest1{
	public static void main (String[] args){
		Person p=new Person();//调用Person实例化对象p
		p.name="张三";
		p.age=20;
		p.address="江苏南京";
		p.talk();
		p.talk2();
	}
}
