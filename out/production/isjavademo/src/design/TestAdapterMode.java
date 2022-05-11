package design;

/*
适配器模式：将两种完全不同的事物联系到一起，就像现实生活中的变压器。假设一个手机充电器需要的电压是20V，但是正常的电压是220V，这时候就需要一个变压
器，将220V的电压转换成20V的电压，这样，变压器就将20V的电压和手机联系起来了。
 */
public class TestAdapterMode {
    public static void main(String[] args) {
        Phone phone = new Phone();
        VoltageAdapter adapter = new VoltageAdapter();
        phone.setAdapter(adapter);
        phone.charge();
    }
}

// 手机类
class Phone {

    // 正常电压220v，是一个常量
    static final int V = 220;

    private VoltageAdapter adapter;

    // 充电
    void charge() {
        adapter.changeVoltage();
    }

    void setAdapter(VoltageAdapter adapter) {
        this.adapter = adapter;
    }
}

// 变压器
class VoltageAdapter {
    // 改变电压的功能
    void changeVoltage() {
        System.out.println("正在充电...");
        System.out.println("原始电压：" + Phone.V + "V");
        System.out.println("经过变压器转换之后的电压:" + (Phone.V - 200) + "V");
    }
}