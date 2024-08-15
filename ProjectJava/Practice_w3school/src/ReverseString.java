public class ReverseString {
    public static void main(String[] args) {
        String beforeStr = "Van Baooo";
        String afterStr = "";
        for (int i=0; i < beforeStr.length(); i++) {
            afterStr = beforeStr.charAt(i) + afterStr;
        }
        System.out.println(afterStr);
    }
}
