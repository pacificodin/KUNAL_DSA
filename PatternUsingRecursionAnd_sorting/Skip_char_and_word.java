public class Skip_char_and_word {
    public static void main(String[] args) {
        String str = "praf apple good appl   gshant";
        System.out.println(skipApple(str));
    }

    // this is by using the extra argument inside the function
    // public static String Skip(String str, String ans) {
    // if (str.isEmpty()) {
    // return ans;
    // }
    // char ch = str.charAt(0);
    // if (ch == 'a') {
    // return Skip(str.substring(1), ans);
    // } else {
    // return Skip(str.substring(1), ans + ch);
    // }
    // }

    // this is without of the argument
    // public static String skip(String str) {
    // if (str.isEmpty()) {
    // return "";
    // }
    // char ch = str.charAt(0);
    // if (ch == 'a') {
    // return skip(str.substring(1));
    // } else {
    // return ch + skip(str.substring(1));
    // }

    // }

    // this is for the removing the word from the string
    public static String skipApple(String str) {
        if (str.isEmpty()) {
            return "";
        }
        if (str.startsWith("apple")) {
            return skipApple(str.substring(5));
        } else {
            return str.charAt(0) + skipApple(str.substring(1));
        }

    }
}
