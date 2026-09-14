package Heaps.HuffmanCodingGreedyAlgo;

import java.util.*;

public class HuffmanCode {
    private static class Node {
        String data;
        Integer cost;
        private Node left;
        private Node right;

        public Node() {
        }

        public Node(String data, Integer cost) {
            this.data = data;
            this.cost = cost;
        }

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public Integer getCost() {
            return cost;
        }

        public void setCost(Integer cost) {
            this.cost = cost;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }
    }

    static String getCharacterCode(Node node, String key) {
        return getCharacterCode(node, key, "");
    }

    static String getCharacterCode(Node node, String key, String curCode) {
        if (node == null) {
            return "";
        }
        if (node.getData() != null && Objects.equals(node.getData(), key)) {
            return curCode;
        }
        curCode = curCode + "0";
        String left = getCharacterCode(node.getLeft(), key, curCode);
        curCode = curCode.substring(0, curCode.length() - 1);
        if (Objects.nonNull(left) && !left.isEmpty()) {
            return left;
        }
        curCode = curCode + "1";
        String right = getCharacterCode(node.getRight(), key, curCode + "1");
        curCode = curCode.substring(0, curCode.length() - 1);
        return right;
    }

    static Map<String, Object> encode(String str) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String s : str.split("")) {
            frequencyMap.put(s, frequencyMap.getOrDefault(s, 0) + 1);
        }
        PriorityQueue<Node> minHeap = new PriorityQueue<>((a, b) -> a.getCost() - b.getCost());
        frequencyMap.forEach((key, value) -> {
            Node node = new Node(key, value);
            minHeap.offer(node);
        });
        while (minHeap.size() >= 2) {
            Node poll1 = minHeap.poll();
            Node poll2 = minHeap.poll();
            if (poll1 != null && poll2 != null) {
                Node newNode = new Node(null, poll1.getCost() + poll2.getCost());
                newNode.setLeft(poll1);
                newNode.setRight(poll2);
                minHeap.offer(newNode);
            }
        }
        Map<String, String> decoder = new HashMap<>();
        String[] codeArr = new String[str.length()];
        for (int i = 0; i < str.length(); i++) {
            String characterCode = getCharacterCode(minHeap.peek(), str.charAt(i) + "");
            codeArr[i] = characterCode;
            decoder.put(characterCode, str.charAt(i) + "");
        }
        return new HashMap<>() {{
            put("code", codeArr);
            put("decoder", decoder);
        }};
    }

    static String decode(String[] code, Map<String, String> decoder) {
        return Arrays.stream(code).map(decoder::get).reduce((a, v) -> a + v).get();
    }

    public static void main(String[] args) {
        Map<String, Object> encoder = encode("abhijeet");
        String[] code = (String[]) encoder.get("code");
        @SuppressWarnings({"", "unchecked"})
        Map<String, String> decoder = (Map<String, String>) encoder.get("decoder");
        System.out.println(decode(code,decoder));
    }
}
