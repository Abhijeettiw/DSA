package Heaps;

import java.util.ArrayList;

public abstract class Heaps {
    protected ArrayList<Integer> innerList;

    abstract void offer(Integer val);

    abstract Integer poll();

    protected int size() {
        if (innerList == null) {
            return 0;
        }
        return innerList.size();
    }
    protected boolean isValidIndex(int idx) {
        return idx >= 0 && idx < innerList.size();
    }
}
