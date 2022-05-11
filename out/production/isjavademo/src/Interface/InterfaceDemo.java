package Interface;

public class InterfaceDemo {
    public static void main(String[] args) {
        new Developer().getJobs("岗位：");
        new Test().getJobs("岗位：");
    }
}

interface Jobs {
    void getJobs(String job);
}

class Developer implements Jobs {

    @Override
    public void getJobs(String job) {

        System.out.println(job + "Java初级工程师");
    }
}

class Test implements Jobs {
    @Override
    public void getJobs(String job) {

        System.out.println(job + "软件测试工程师");
    }
}