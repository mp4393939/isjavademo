package Extends;

class box {
    private double width, height, depth;

    box(box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    box(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}

class boxweight extends box {
    double weight;

    boxweight(boxweight ob) {
        //super()必须是子类的构造函数中执行的第一条语句
        super(ob);
        weight = ob.weight;
    }

    boxweight(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    boxweight() {
        super();
        weight = -1;
    }

    boxweight(double len, double m) {
        super(len);
        weight = m;
    }
}

public class super_volume {
    public static void main(String[] args) {
        boxweight mybox1 = new boxweight(10, 20, 15, 34.3);
        boxweight mybox2 = new boxweight(2, 3, 4, 0.076);
        boxweight mybox3 = new boxweight();//default
        boxweight mycube = new boxweight(3, 2);
        boxweight myclone = new boxweight(mybox1);
        /*double arr[]={mybox1.volume(),mybox2.volume(),mybox3.volume(),myclone.volume(),mycube.volume()};
        boxweight[] arr2={mybox1,mybox2,mybox3,mycube,myclone};
        for(int i=0;i<arr.length;i++){
            double vol=arr[i];
            boxweight object=arr2[i];
            System.out.println("volume of"+arr[i]+"is"+vol);
            System.out.println("weight of"+object+"is"+object.weight);
            System.out.println();
        }*/
        double vol;
        vol = mybox1.volume();
        System.out.println("volume of mybox1 is" + vol);
        System.out.println("weight of mybox1 is" + mybox1.weight);
        System.out.println();
        vol = mybox2.volume();
        System.out.println("volume of mybox2 is" + vol);
        System.out.println("weight of mybox2 is" + mybox2.weight);
        System.out.println();
        vol = mybox3.volume();
        System.out.println("volume of mybox3 is" + vol);
        System.out.println("weight of mybox3 is" + mybox3.weight);
        System.out.println();
        vol = myclone.volume();
        System.out.println("volume of myclone is" + vol);
        System.out.println("weight of myclone is" + myclone.weight);
        System.out.println();
        vol = mycube.volume();
        System.out.println("volume of mycube is" + vol);
        System.out.println("weight of mycube is" + mycube.weight);
        System.out.println();
    }
}
