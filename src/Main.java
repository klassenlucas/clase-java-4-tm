import comparators.ComparatorIntAscImpl;
import comparators.ComparatorStrAscImpl;
import sorters.Sorter;

import java.io.FileReader;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws  Exception {
        FileReader reader = new FileReader("MiFactory.properties");

        Properties p = new Properties();

        p.load(reader);

        Sorter sorter = (Sorter) MiFactory.getInstance(p.getProperty("sorter"));

        Integer iarr [] = {1,3,4,1,6,8,1122,323,14512,63645,85686,2432,123,54,7,47,124};
        String sarr [] = {"a","b","c","asd","z","dsad","dsd"};

        sorter.sort(iarr, new ComparatorIntAscImpl());
        sorter.sort(sarr, new ComparatorStrAscImpl());

        for (Integer n: iarr
             ) {
            System.out.println(n);
        }

        System.out.println("----");

        for (String s: sarr
             ) {
            System.out.println(s);
        }

        Integer longArray[] = new Integer[100000];

        int n = 100000;

        for (int i = 0; i < longArray.length; i++) {
            longArray[i] = n;
            n--;
        }

        Time t = new Time();

        t.start();
        sorter.sort(longArray,new ComparatorIntAscImpl());
        t.stop();

        System.out.println(t.timeElapsed());

    }
}
