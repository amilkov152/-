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
        if (isBlank(list) || list.get(list.size()-1) == null)
            throw new IllegalArgumentException();
        else {
           return list.get(list.size()-1);
        }
    }

    public static <T> T findElem(List<T> list, T elem) {
        if(elem == null)
            throw new IllegalArgumentException();
        for(T el: list) {
            if (el == null)
                throw new IllegalArgumentException();
            if (el == elem)
                return el;
        }
        return null;
    }

    public static <T> List<T> union(List<T> list1, List<T> list2) {
        if(isBlank(list1) || isBlank(list2))
            throw new IllegalArgumentException();
        List<T> res = new ArrayList<T>();
        res.addAll(list1);
        res.addAll(list2);
        return res;
    }

    public static <T> List<T> removeAll(List<T> list1, List<T> list2) {
        if(isBlank(list1) || isBlank(list2))
            throw new IllegalArgumentException();
        List<T> res = new ArrayList<T>(list1);
        res.removeAll(list2);
        return res;
    }

    public static double sum(List<? extends Number> list1, List<? extends Number> list2) {
        if(isBlank(list1) || isBlank(list2))
            throw new IllegalArgumentException();
        double res = 0;
        for(int i = 0; i < list1.size();++i)
            res += list1.get(i).doubleValue();
        for(int i = 0; i < list2.size();++i)
            res += list2.get(i).doubleValue();
        return res;
    }
}

