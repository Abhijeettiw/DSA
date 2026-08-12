package Heaps;

import java.util.ArrayList;

public class MinHeap extends Heaps {
    public MinHeap() {
        this.innerList = new ArrayList<>();
    }

    @Override
    void offer(Integer val) {
        int insertionIndex = innerList.size();
        innerList.add(val);
        if (0 == insertionIndex) {
            return;
        } else if (1 == insertionIndex) {
            offer(val, 0, 1);
            return;
        } else if (2 == insertionIndex) {
            offer(val, 0, 2);
            return;
        }
        int parentIndex = insertionIndex % 2 != 0 ? insertionIndex / 2 : (insertionIndex - 1) / 2;
        offer(val, parentIndex, insertionIndex);
    }

    @Override
    Integer poll() {
        return null;
    }

    private void offer(Integer val, int parentIndex, int childIndex) {
        Integer parentValue = innerList.get(parentIndex);
        if (isValidIndex(parentIndex) && val < parentValue) {
            innerList.set(parentIndex, val);
            innerList.set(childIndex, parentValue);
            int newParentIndex = parentIndex % 2 != 0 ? parentIndex / 2 : (parentIndex - 1) / 2;
            offer(val, newParentIndex, parentIndex);
        }
    }


}
