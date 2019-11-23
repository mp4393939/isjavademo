package Pets;

import java.util.Scanner;

/*
 * ʹ�ü���ģ������̳ǵĹ���
 * ����ѡ������һ�ּ���ʵ����������
 * ����
 * 1.���˵�������ӣ��޸ģ��鿴��ɾ������
 * (1)��ӣ����̳�����ӳ���
 * (2)�޸ģ��޸ĳ������Ϣ
 * (3)�鿴�����Ե����鿴һ������Ͳ鿴���г���
 * (4)ɾ����ɾ��������һ������
 * 2.��������������
 * (1)���
 * (2)���ࣨ����è������
 * (3)�ǳƣ�����������������
 * (4)����
 * 3.����Ƿֱ�����Ψһ��ʶ�������޸ģ������ظ���
 *
 *
 *
 * @author Cansor
 * @version 1.1 �Ա���������������ƣ��������븺����
 * 				��ʼĬ�������������������
 * 				�ع����ֱ�������������
 *
 */

public class PetShop {

    public static void main(String[] args) {
        menu();
    }

    //------------------------�˵�����--------------------------
    private static void menu() {
        Scanner input = new Scanner(System.in);
        PetAdm pa = new PetAdm();

        //��Ĭ�������������������
        pa.add(new Pet(1001, "è", "����", 1));
        pa.add(new Pet(1002, "��", "����", 2));

        while (true) {
            System.out.println();
            System.out.println("===================�����̳�======================");
            System.out.println("Ŀǰ��" + (pa.hashSetPet.size()) + "ֻ���");

            System.out.println("\n1������   2��ɾ��   3���޸�   4������   5���鿴����   6���˳�");
            System.out.println("��Ҫ���̳ǽ��в�������������ţ�Ȼ��س�");
            int i = input.nextInt();

            switch (i) {
                //��ӳ���
                case 1:
                    input = new Scanner(System.in);
                    System.out.println("�����ţ�");
                    int number = input.nextInt();

                    //�ж��Ƿ����б���Լ�����Ƿ�Ϸ�
                    if (pa.find(number) != null) {
                        System.out.println("���б��" + number + "�����������룡");
                        break;
                    } else if (number < 0) {
                        System.out.println("��Ų��Ϸ������������룡");
                        break;
                    }

                    System.out.println("�������ࣺ");
                    String type = input.nextLine();
                    type = input.nextLine();

                    System.out.println("�����ǳƣ�");
                    String name = input.nextLine();

                    System.out.println("�������䣺");
                    int age = input.nextInt();

                    //�ж������Ƿ���ȷ
                    if (age < 0) {
                        System.out.println("��������ȷ�����䣡");
                        break;
                    }

                    if (pa.add(new Pet(number, type, name, age))) {
                        System.out.println("��ӳɹ���");
                    } else {
                        System.out.println("���ʧ�ܣ�");
                    }
                    break;

                //ɾ������
                case 2:
                    input = new Scanner(System.in);
                    System.out.println("�����ţ�");
                    number = input.nextInt();
                    if (pa.delete(number)) {
                        System.out.println("ɾ���ɹ���");
                    } else {
                        System.out.println("ɾ��ʧ�ܣ�");
                    }
                    break;

                //�޸ĳ�����Ϣ
                case 3:
                    input = new Scanner(System.in);
                    System.out.println("�����ţ�");
                    number = input.nextInt();

                    //�ж��Ƿ��иó���
                    if (pa.find(number) == null) {
                        System.out.println("û�б��Ϊ" + number + "�ĳ�����������룡");
                        break;
                    }

                    System.out.println("������ĳɣ�");
                    type = input.nextLine();
                    type = input.nextLine();

                    System.out.println("���ǳƸĳɣ�");
                    name = input.nextLine();

                    System.out.println("������ĳɣ�");
                    age = input.nextInt();

                    //�ж������Ƿ���ȷ
                    if (age < 0) {
                        System.out.println("��������ȷ�����䣡");
                        break;
                    }

                    pa.update(new Pet(number, type, name, age));
                    break;

                //���ҳ���
                case 4:
                    //�ж���û�г���
                    if (pa.hashSetPet.size() == 0) {
                        System.out.println("��û�г���Ŷ��");
                        break;
                    }
                    input = new Scanner(System.in);
                    System.out.println("�������Ų��ң�");
                    number = input.nextInt();
                    System.out.println(pa.find(number));
                    break;

                //�鿴���г���
                case 5:
                    pa.print();
                    break;

                //�˳�
                case 6:
                    System.out.println("�˳�ϵͳ");
                    return;

                default:
                    System.out.println("û��������ܣ�");
                    break;
            }
        }
    }
}
