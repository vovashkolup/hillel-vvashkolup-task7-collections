import java.lang.reflect.GenericArrayType;
import java.util.ArrayList;
import java.util.List;

public class Collections {

    public static void countOccurance(List<String> list, String word) {
        int counter = 0;
        for (String str : list) {
            if (str.equals(word)) {
                counter++;
            }
        }
        System.out.println(word + " occure " + counter + " times");
    }

    public static void toList(int arr[]) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        System.out.println(list);
    }

    public static List<Integer> findUnique(List<Integer> oldList) {
        List<Integer> newList = new ArrayList<>();
        for (Integer integer : oldList) {
            if (!newList.contains(integer)) {
                newList.add(integer);
            }
        }
        System.out.println(newList);
        return newList;
    }

    public static void calcOccurance(List<String> stringList) {
        List<String> newList = new ArrayList<>();
        for (int i = 0; i < stringList.size(); i++) {
            String temp = stringList.get(i);
            int counter = 0;
            for (String str : stringList) {
                if (str.equals(temp)) {
                    counter++;
                }
            }
            if(!newList.contains("\n"+temp+": "+counter)) {
                newList.add("\n"+temp+": "+counter);
            }
        }

        System.out.print(newList);
    }


    public static void findOccurance(List<String> stringList) {
        List<String> newList = new ArrayList<>();
        for (int i = 0; i < stringList.size(); i++) {
            String temp = stringList.get(i);
            int counter = 0;
            for (String str : stringList) {
                if (str.equals(temp)) {
                    counter++;
                }
            }
            if(!newList.contains("\n"+"{name: '"+temp+"',occurence: "+counter+"}")) {
                newList.add("\n"+"{name:'" + temp + "',occurence: " + counter+"}");
            }

        }
        System.out.println(newList);
    }


}
