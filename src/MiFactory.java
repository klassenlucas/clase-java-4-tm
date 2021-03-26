import java.lang.reflect.Constructor;

public class MiFactory {
    public static Object getInstance(String objName) throws Exception {
        Class<?> c = Class.forName(objName);
        Constructor<?> cons = c.getConstructor();
        return cons.newInstance();
    }
}
