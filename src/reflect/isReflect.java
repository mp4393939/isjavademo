package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class isReflect {
    public void useReflectNoParameters() {
        try {
            Class c = Class.forName("reflect.Entity");
            Object obj = c.newInstance();
            Method method = c.getMethod("printWord");
            method.invoke(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void useReflectHaveParameters1() {
        try {
            Class c = Class.forName("reflect.Entity");
            Object obj = c.newInstance();
            Method method = c.getMethod("printWord", int.class);
            method.invoke(obj, 888);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void useReflectHaveParameters2() {
        try {
            Class c = Class.forName("reflect.Entity");
            Object obj = c.newInstance();
            Method method = c.getMethod("useString", String.class);
            method.invoke(obj, "i hope my parents are safe and happy");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void useReflectHaveParameters3() {
        try {
            Class c = Class.forName("reflect.Entity");
            Object obj = c.newInstance();
            Method method = c.getMethod("returnString", String.class);
            method.invoke(obj, "i hope to be happy every day");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        isReflect isreflect = new isReflect();
        isreflect.useReflectNoParameters();
        isreflect.useReflectHaveParameters1();
        isreflect.useReflectHaveParameters2();
        isreflect.useReflectHaveParameters3();
    }
}
