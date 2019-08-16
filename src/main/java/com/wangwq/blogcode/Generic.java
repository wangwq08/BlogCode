package com.wangwq.blogcode;

import java.util.ArrayList;
import java.util.List;

public class Generic {

    public static void method1() {
        List arrayList = new ArrayList();
        arrayList.add("wangwq");
        arrayList.add(8);

        for (int i = 0; i < arrayList.size(); i++) {
            String item = (String) arrayList.get(i);
            System.out.println("Generic test" + "item = " + item);
        }
    }

    public static void method2() {
        List<String> arrayList = new ArrayList<String>();
        arrayList.add("wangwq");
        //arrayList.add(8);

        for (int i = 0; i < arrayList.size(); i++) {
            String item = (String) arrayList.get(i);
            System.out.println("Generic test" + "item = " + item);
        }
    }

    private static <T extends  Number & Comparable<? super T>> T min(T[] values) {
        if(values == null || values.length == 0)
            return null;
        T min = values[0];

        for (int i = 1; i < values.length; i++) {
            if(min.compareTo(values[i]) > 0)
                min = values[i];
        }
        return min;
    }

    public static void main(String[] args) {
//        method1();

        int minInteger = min(new Integer[] {1, 2, 3});
        System.out.println(minInteger);

        double minDouble = min(new Double[] {1.2, 2.2, -1d});
        System.out.println(minDouble);

//        String typeError = min(new String[] {"1", "3"});;
    }
}
