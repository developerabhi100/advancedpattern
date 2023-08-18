package advancedpattern;

public class inverted_half_pyramid_pattern_with_numbers {

    public static void inverted_half_pyramid_pattern_with(int n) {
        for (int i = 1; i <= n; i++) {
            // inner - numbers
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();

        }
    }

    public static void main(String args[]) {
        inverted_half_pyramid_pattern_with(4);
    }
}
