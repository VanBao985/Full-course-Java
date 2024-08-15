package StringAndStringBuffer;

public class StringBuffer {
    public static void main(String[] args) {
        long start1 = System.nanoTime();
        String s = "";
        for (int i=0; i < 10000; i++) {
            s+=" ";
        }
        long end1 = System.nanoTime();
        long start2 = System.nanoTime();
        StringBuilder str = new StringBuilder();
        for (int i=0; i < 10000; i++) {
            str.append(" ");
        }
        long end2 = System.nanoTime();
        System.out.println(end1 - start1);
        System.out.println(end2 - start2);

    }

}
