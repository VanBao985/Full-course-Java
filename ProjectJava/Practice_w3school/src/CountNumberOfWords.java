public class CountNumberOfWords {
    static String word = "Van Baoooo!";
    static int countNum = word.split("\\s").length;

    public static void main(String[] args) {
        System.out.println(countNum);   //output: 2
    }
}
