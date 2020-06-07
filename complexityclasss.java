package chap3exercise;

import java.util.ListIterator;

import com.sun.tools.javac.util.List;

public class complexityclasss {public static void mystery(List<String> list){
    ListIterator<String> iterator = list.listIterator();
    int i = 0;
    while (i < list.size()-1) {
        String first = iterator.next();
        // Remove first
        iterator.remove();
        // Skip an element
        iterator.next();
        // insert at i+1
        iterator.add(first);
        i+=2;
    }
}


}
