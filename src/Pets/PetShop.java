package Pets;

import java.util.Scanner;

/*
 * 使用集合模拟宠物商城的管理
 * 自由选择任意一种集合实现以下需求。
 * 需求：
 * 1.主菜单，有添加，修改，查看和删除功能
 * (1)添加：往商城里添加宠物
 * (2)修改：修改宠物的信息
 * (3)查看：可以单独查看一个宠物和查看所有宠物
 * (4)删除：删除掉其中一个宠物
 * 2.宠物有以下属性
 * (1)编号
 * (2)种类（比如猫，狗）
 * (3)昵称（比如喵喵，旺旺）
 * (4)年龄
 * 3.编号是分辨宠物的唯一标识，不可修改，不可重复。
 *
 *
 *
 * @author Cansor
 * @version 1.1 对编号与年龄作出限制，不能输入负数。
 * 				初始默认添加两个宠物，方便测试
 * 				重构部分变量名、方法名
 *
 */

public class PetShop {

    public static void main(String[] args) {
        menu();
    }

    //------------------------菜单方法--------------------------
    private static void menu() {
        Scanner input = new Scanner(System.in);
        PetAdm pa = new PetAdm();

        //先默认添加两个宠物，方便测试
        pa.add(new Pet(1001, "猫", "喵喵", 1));
        pa.add(new Pet(1002, "狗", "旺旺", 2));

        while (true) {
            System.out.println();
            System.out.println("===================宠物商城======================");
            System.out.println("目前有" + (pa.hashSetPet.size()) + "只宠物。");

            System.out.println("\n1、增加   2、删除   3、修改   4、查找   5、查看所有   6、退出");
            System.out.println("需要对商城进行操作，请输入序号，然后回车");
            int i = input.nextInt();

            switch (i) {
                //添加宠物
                case 1:
                    input = new Scanner(System.in);
                    System.out.println("输入编号：");
                    int number = input.nextInt();

                    //判断是否已有编号以及编号是否合法
                    if (pa.find(number) != null) {
                        System.out.println("已有编号" + number + "，请重新输入！");
                        break;
                    } else if (number < 0) {
                        System.out.println("编号不合法，请重新输入！");
                        break;
                    }

                    System.out.println("输入种类：");
                    String type = input.nextLine();
                    type = input.nextLine();

                    System.out.println("输入昵称：");
                    String name = input.nextLine();

                    System.out.println("输入年龄：");
                    int age = input.nextInt();

                    //判断年龄是否正确
                    if (age < 0) {
                        System.out.println("请输入正确的年龄！");
                        break;
                    }

                    if (pa.add(new Pet(number, type, name, age))) {
                        System.out.println("添加成功！");
                    } else {
                        System.out.println("添加失败！");
                    }
                    break;

                //删除宠物
                case 2:
                    input = new Scanner(System.in);
                    System.out.println("输入编号：");
                    number = input.nextInt();
                    if (pa.delete(number)) {
                        System.out.println("删除成功！");
                    } else {
                        System.out.println("删除失败！");
                    }
                    break;

                //修改宠物信息
                case 3:
                    input = new Scanner(System.in);
                    System.out.println("输入编号：");
                    number = input.nextInt();

                    //判断是否有该宠物
                    if (pa.find(number) == null) {
                        System.out.println("没有编号为" + number + "的宠物，请重新输入！");
                        break;
                    }

                    System.out.println("将种类改成：");
                    type = input.nextLine();
                    type = input.nextLine();

                    System.out.println("将昵称改成：");
                    name = input.nextLine();

                    System.out.println("将年龄改成：");
                    age = input.nextInt();

                    //判断年龄是否正确
                    if (age < 0) {
                        System.out.println("请输入正确的年龄！");
                        break;
                    }

                    pa.update(new Pet(number, type, name, age));
                    break;

                //查找宠物
                case 4:
                    //判断有没有宠物
                    if (pa.hashSetPet.size() == 0) {
                        System.out.println("还没有宠物哦！");
                        break;
                    }
                    input = new Scanner(System.in);
                    System.out.println("请输入编号查找：");
                    number = input.nextInt();
                    System.out.println(pa.find(number));
                    break;

                //查看所有宠物
                case 5:
                    pa.print();
                    break;

                //退出
                case 6:
                    System.out.println("退出系统");
                    return;

                default:
                    System.out.println("没有这个功能！");
                    break;
            }
        }
    }
}
