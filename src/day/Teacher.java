package day;

public class Teacher{
	String name,gender,position,address;
	int age,exp;//experience��������
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

	public Teacher(String ����ϼ, int age, String Ů, String ����, int salary, double v, String Զ�ι�Ԣb341) {
	}

	public String talk()
	{
	return this.name+","+this.age+"��,�Ա�"+this.gender+","+this.position+"��ʦ,�����룤"+this.salary+","+this.exp+"���ѧ����,ס��"+this.address;
}
public static void main (String[] args){
	Teacher info[]={
		new Teacher("����ϼ",29,"Ů","����",5,4500.00,"Զ�ι�Ԣb341"),
		new Teacher("����÷",34,"Ů","��ѧ",8,4800.00,"Զ�ι�Ԣc301"),
		new Teacher("Լ���������",28,"��","Ӣ��",5,4500.00,"Զ�ι�Ԣb111"),
		new Teacher("���Ӻ�",26,"��","����",5,4500.00,"Զ�ι�Ԣb439"),
		new Teacher("������",25,"��","��ѧ",4,4500.00,"Զ�ι�Ԣa341"),
		new Teacher("����",29,"��","����",5,4500.00,"Զ�ι�Ԣc31"),
		new Teacher("����ˮ",38,"��","����",5,4500.00,"Զ�ι�Ԣb231"),
		new Teacher("��ѩ��",30,"Ů","��ʷ",6,4800.00,"Զ�ι�Ԣb123"),
		new Teacher("������",45,"��","����",5,4500.00,"Զ�ι�Ԣa180"),
		new Teacher("Ǯ�",30,"��","����",4,4500.00,"Զ�ι�Ԣc101"),
		};
		for (int i=0;i<info.length;i++){
			System.out.println("---------------------------------------------------------------"+"\n"
			+info[i].talk());
		}
}
}
