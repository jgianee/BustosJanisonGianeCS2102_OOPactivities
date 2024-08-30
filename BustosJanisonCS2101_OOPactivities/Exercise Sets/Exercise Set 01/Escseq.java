public class Escseq {
    public static void main(String[] args) {
        int range = 10;
        for (int i = 1; i <= range; i++) {
            int multipleOfSeven = i * 7;
            if (i % 2 == 0) {
                System.out.println("\t" + multipleOfSeven);
            } else {
                System.out.println(multipleOfSeven);
            }
        }
    }
}
