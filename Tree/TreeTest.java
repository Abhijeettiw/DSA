package Tree;

public class TreeTest {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        String OP_TYPE = "SUM";
        SegmentTree segmentSum = new SegmentTree();
        segmentSum.createSegmentTree(array, OP_TYPE);
        System.out.println(segmentSum.getResult(1, 2));
        segmentSum.updateTree(0,5);
        System.out.println(segmentSum.getRoot().getData());
    }
}
