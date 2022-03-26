package anonymousClasses;

import java.util.ArrayList;

public class SpecialList {
    ArrayList<String> list = new ArrayList() {
        @Override
        public boolean add(Object o) {
            return super.add("name: " + o);
        }
    };
    public void addNames() {
        list.add("emma");
        list.add("john");
        list.add("tim");
        list.add("simon");
    }
    public void printNames() {
        for (String names: list) {
            System.out.println(names);
        }
    }



}
