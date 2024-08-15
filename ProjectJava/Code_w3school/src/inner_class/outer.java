package inner_class;

class outer {
    int x=5;
    // inner class can access method and attribute from outer class
    public class inner {
        public int myx() {
            return x;
        }
    }
}
