public class Fact2 {
    public static void main(String[] args) {
        int a = 100;
        for (int i = 1; i <= a; i++) {
            if (i % 5 == 0) {
                System.out.println(i + " fizz for 5");
            } else if (i % 7 == 0) {
                System.out.println(i + " buzz for 7");
            } else
                System.out.println("No one march!");
        }
    }
}