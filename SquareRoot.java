public class SquareRoot {
    public static void main(String[] args) {
        int a = 8;
        double sqrt = Math.sqrt(Double.parseDouble(a + ""));
        int inInt = Integer.parseInt(String.valueOf(sqrt).split("\\.")[0]);
        System.out.println(inInt);
    }
}
