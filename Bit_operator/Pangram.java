public class Pangram {
    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println(matsum(mat));
    }

    public static int matsum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat[0].length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (i == j || i == (mat[0].length - 1 - j)) {
                    sum += mat[i][j];
                    System.out.print(mat[i][j] + "+");
                }
            }
        }
        System.out.println();
        return sum;
    }

    // static boolean pangram(String sentence) {
    // boolean[] alphabet = new boolean[26];
    // if (sentence.length() < 26) {
    // return false;
    // }
    // for (int i = 0; i < sentence.length(); i++) {
    // alphabet[sentence.charAt(i) - 'a'] = true;
    // }
    // for (int i = 0; i < alphabet.length; i++) {
    // if (!alphabet[i]) {
    // return false;
    // }
    // }
    // return true;
    // }
}
