package Heaps;

import java.util.ArrayList;

public class MaxHeap extends Heaps {
    public MaxHeap() {
        this.innerList = new ArrayList<>();
    }

    @Override
    void offer(Integer val) {
        int currentIndex = innerList.size();
        innerList.add(val);
        if (0 == currentIndex) {
            return;
        } else if (1 == currentIndex) {
            offer(val, 0, currentIndex);
            return;
        } else if (2 == currentIndex) {
            offer(val, 0, currentIndex);
            return;
        }
        int parentIndex = currentIndex % 2 == 0 ? (currentIndex - 1) / 2 : currentIndex / 2;
        offer(val, parentIndex, currentIndex);
    }

    void offer(Integer val, int parentIndex, int childIndex) {
        Integer parentVal = innerList.get(parentIndex);
        if (parentVal < val) {
            innerList.set(parentIndex, val);
            innerList.set(childIndex, parentVal);
            int newParentIndex = parentIndex % 2 == 0 ? (parentIndex - 1) / 2 : parentIndex / 2;
            offer(val, newParentIndex, parentIndex);
        }
    }

    @Override
    Integer poll() {
        Integer removedElement = innerList.removeFirst();
        Integer lastElement = innerList.removeLast();
        innerList.addFirst(lastElement);
        poll(0);
        return removedElement;
    }

    void poll(int index) {
        if (!isValidIndex(index)) {
            return;
        }
        Integer leftIndex = (index * 2) + 1;
        if (isValidIndex(leftIndex)) {
            Integer value = innerList.get(index);
            if (value < innerList.get(leftIndex)) {
                innerList.set(index, innerList.get(leftIndex));
                innerList.set(leftIndex, value);
                poll(leftIndex);
            }
            int rightIndex = leftIndex + 1;
            if (isValidIndex(rightIndex)) {
                value = innerList.get(index);
                if (value < innerList.get(rightIndex)) {
                    innerList.set(index, innerList.get(rightIndex));
                    innerList.set(rightIndex, value);
                    poll(rightIndex);
                }
            }
        }
    }
}
