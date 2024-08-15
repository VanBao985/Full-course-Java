package stack_of_chars_integer;

public class StackOfChars {
    private char[] elements;
    private int size;
    public StackOfChars(){}
    public StackOfChars(int capacity){
        this.size = capacity;
    }
    public boolean isEmpty(){
        return elements.length == 0;
    }
    public boolean isFull(){
        return elements.length == size;
    }
    public char peak(){
        return elements[elements.length-1];
    }
    public char pop(){
        char s = this.peak();
        char[] tmp = new char[elements.length-1];
        System.arraycopy(elements, 0, tmp, 0, elements.length - 1);
        this.elements = tmp;
        return s;
    }
    public void push(char value){
        char[] tmp = new char[elements.length+1];
        System.arraycopy(elements, 0, tmp, 0, elements.length);
        tmp[tmp.length-1] = value;
        this.elements = tmp;
    }
    public int getSize() {
        return size;
    }
}
