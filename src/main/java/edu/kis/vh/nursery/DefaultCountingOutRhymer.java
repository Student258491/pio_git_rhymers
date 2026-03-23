package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int MAX_SIZE = 12;
    public static final int EMPTYDEFAULT = -1;
    private int[] numbers = new int[MAX_SIZE];

    public int total = EMPTYDEFAULT;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTYDEFAULT;
    }

    public boolean isFull() {
        return total == MAX_SIZE-1;
    }

    protected int peekaboo() {
        if (callCheck())
            return EMPTYDEFAULT;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTYDEFAULT;
        return numbers[total--];
    }

}
