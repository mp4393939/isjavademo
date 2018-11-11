package day;

public class Emp{
	private String name,address;
		private int age;
		private String gender;
		private double salary;
		
public static void main (String[] args){
	Emp emp1=new Emp();
	emp1.name="张三";
	emp1.age=20;
	emp1.gender="男";
	emp1.salary=8000.55;
	emp1.address="江西赣州";
	System.out.println("------------------------------"+"\n"+"我叫"+emp1.name+"，年龄"+emp1.age+"岁，性别"+emp1.gender+"，月薪￥"+emp1.salary+"，居住地是"+emp1.address+"。"+"\n"+"妹子星期天约吗？求交往");
   }
}
