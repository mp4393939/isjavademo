package Interface;

public class InterfaceDemo {
    public static void main(String[] args) {
        new Developer().getJobs("��λ��");
        new Test().getJobs("��λ��");
    }
}

interface Jobs {
    void getJobs(String job);
}

class Developer implements Jobs {

    @Override
    public void getJobs(String job) {

        System.out.println(job + "Java��������ʦ");
    }
}

class Test implements Jobs {
    @Override
    public void getJobs(String job) {

        System.out.println(job + "������Թ���ʦ");
    }
}