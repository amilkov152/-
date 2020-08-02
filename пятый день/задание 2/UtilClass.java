package generic;

import java.util.ArrayList;
import java.util.List;

public class UtilClass {

    public static boolean isBlank(List list) {
        if(list == null || list.size() == 0)
            return true;
        else
            return false;
    }

    public static <T> T getLastElem(List<T> list) {
        if (isBlank(list))
            throw new IllegalArgumentException();
        else {
            return list.get(list.size() - 1);
        }

    }

    public static <T> T findElem(List<T> list, T elem) {
        if(isBlank(list))
            throw new IllegalArgumentException();
        for(T el: list) {
            if (el == elem)
                return el;
        }
        return null;
    }

    public static <T> List<T> union(List<T> list1, List<T> list2) {
        if(isBlank(list1) && isBlank(list2))
            return new ArrayList <> () ;

        List<T> res = new ArrayList<T>();
        res.addAll(list1);
        res.addAll(list2);
        return res;
    }

    public static <T> List<T> removeAll(List<T> list1, List<T> list2) {
        if(isBlank(list1) && isBlank(list2))
            return new ArrayList <> ();
        if (isBlank(list1))
            return new ArrayList <> ();

        List<T> res = new ArrayList<>(list1);
        if(isBlank(list2))
            return res;
        res.removeAll(list2);
        return res;
    }

    public static double sum(List<? extends Number> list1, List<? extends Number> list2) {
        double res = 0;
        for(int i = 0; i < list1.size();++i)
            res += list1.get(i).doubleValue();
        for(int i = 0; i < list2.size();++i)
            res += list2.get(i).doubleValue();
        return res;
    }
}

