public class Main {
    public static void main(String[] args) {

        for (int a = 2; a <= 100; a++) {

            boolean kosul = true;

            for (int b = 2; b < a; b++) {

                if (a % b == 0) {
                    kosul = false;
                    break;
                }
            }
            if (kosul) {
                System.out.println(a + "Asal sayıdır");
            }
        }
    }
}