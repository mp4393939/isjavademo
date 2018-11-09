package day;

public class Teacher{
	String name,gender,position,address;
	int age,exp;//experience工作经验
	double salary;
	public Teacher (String name,int age,String gender,String position,double salary,int exp,String address){
	this.name=name;
	this.age=age;
	this.gender=gender;
	this.position=position;
	this.salary=salary;
	this.exp=exp;
	this.address=address;
 }

	public Teacher(String 任月霞, int age, String 女, String 语文, int salary, double v, String 远涛公寓b341) {
	}

	public String talk()
	{
	return this.name+","+this.age+"岁,性别"+this.gender+","+this.position+"老师,月收入￥"+this.salary+","+this.exp+"年教学经验,住在"+this.address;
}
public static void main (String[] args){
	Teacher info[]={
		new Teacher("任月霞",29,"女","语文",5,4500.00,"远涛公寓b341"),
		new Teacher("王秋梅",34,"女","数学",8,4800.00,"远涛公寓c301"),
		new Teacher("约翰·尼德普",28,"男","英语",5,4500.00,"远涛公寓b111"),
		new Teacher("孙子涵",26,"男","物理",5,4500.00,"远涛公寓b439"),
		new Teacher("赵蓝天",25,"男","化学",4,4500.00,"远涛公寓a341"),
		new Teacher("绍荣",29,"男","生物",5,4500.00,"远涛公寓c31"),
		new Teacher("王德水",38,"男","政治",5,4500.00,"远涛公寓b231"),
		new Teacher("孙雪儿",30,"女","历史",6,4800.00,"远涛公寓b123"),
		new Teacher("刘云正",45,"男","地理",5,4500.00,"远涛公寓a180"),
		new Teacher("钱斐",30,"男","体育",4,4500.00,"远涛公寓c101"),
		};
		for (int i=0;i<info.length;i++){
			System.out.println("---------------------------------------------------------------"+"\n"
			+info[i].talk());
		}
}
}
