package design;

public class TestStaticProxy {
    public static void main(String[] args) {
        ProxyInterface proxyInterface = new WeddingCompany(new NormalHome());
        proxyInterface.marry();
    }
}

//婚庆公司类：婚庆公司相当于代理角色
class WeddingCompany implements ProxyInterface {

    private ProxyInterface proxyInterface;

    WeddingCompany(ProxyInterface proxyInterface) {
        this.proxyInterface = proxyInterface;
    }

    @Override
    public void marry() {
        System.out.println("我们是婚庆公司的");
        System.out.println("我们在做结婚前的准备工作");
        System.out.println("节目彩排...");
        System.out.println("礼物购买...");
        System.out.println("工作人员分工...");
        System.out.println("可以开始结婚了");
        proxyInterface.marry();
        System.out.println("结婚完毕，我们需要做后续处理，你们可以回家了，其余的事情我们公司来做");
    }
}

//结婚家庭类
class NormalHome implements ProxyInterface {

    @Override
    public void marry() {
        System.out.println("我们结婚啦～");
    }
}