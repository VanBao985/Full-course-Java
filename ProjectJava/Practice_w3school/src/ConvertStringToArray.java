public class ConvertStringToArray {
    public static void main(String[] args) {
        String str = "van Bao";
        char[] myArray = str.toCharArray();
        for (char i: myArray){
            System.out.println(i);
        }
    }
}
