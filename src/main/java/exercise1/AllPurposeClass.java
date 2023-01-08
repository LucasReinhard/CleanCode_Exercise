package exercise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AllPurposeClass {
    private List<String> lst;

    public AllPurposeClass(){
        lst = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            lst.add("Item " + i);
        }
    }
    public void foo(int x) {
        Collections.sort(lst);
        for (int j = 0; j < lst.size(); j++) {
            String s = lst.get(j);
            if (s.contains(""+x)) {
                lst.remove(j);
            }
        }
        for (String s : lst) {
            System.out.println(s);
        }
    }
}