public class Addition {
    public static void main(String[] args) {

        Addition addition = new Addition();
        int x = addition.add(6, 4);
        System.out.println("Value of x is " + x);
        System.out.println(addition.add(6, 0, 9));
        addition.add(3, 3, 60, 3);
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public void add(int a, int b, int c, int d) {
        System.out.println(a + b + c + d);
    }
}
