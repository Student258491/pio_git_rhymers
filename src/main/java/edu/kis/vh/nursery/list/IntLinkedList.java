package edu.kis.vh.nursery.list;

/**
 * Klasa dla listy dwukierunkowej.
 */
public class IntLinkedList {

    /**
     * Klasa reprezentująca węzel listy.
     * Trzyma referencje oraz wartość poprzedniego oraz następniego węzła.
     */
    private class Node {

        private final int value;
        private Node prev;
        private Node next;

        /**
         * Tworzy nowy węzel z wartością i.
         *
         * @param i wartość węzła.
         */
        public Node(int i) {
            value = i;
        }

        /**
         * Zwraca wartość z węzwa.
         *
         * @return Wartość z węzła.
         */
        public int getValue() {
            return value;
        }

        /**
         * Zwraca referencje poprzedniego węzwa.
         *
         * @return Poprzedni węzel, lub null.
         */
        public Node getPrev() {
            return prev;
        }

        /**
         * Przypisuje referencje do poprzedniego węzła.
         *
         * @param prev Nowy poprzedni węzel.
         */
        public void setPrev(Node prev) {
            this.prev = prev;
        }

        /**
         * Zwraca referencje następnego węzwa.
         *
         * @return Następny węzel, lub null.
         */
        public Node getNext() {
            return next;
        }

        /**
         * Przypisuje referencje do następnego węzła.
         *
         * @param next Nowy następny węzel.
         */
        public void setNext(Node next) {
            this.next = next;
        }
    }

    /**
     *Wskazuje że lista  jest pusta.
     */
    private static final int EMPTY_RHYMER_INDICATOR = -1;
    /**
     * Ostatni element listy.
     */
    private Node last;
    /**
     * Aktualnie nieużywana zmenna.
     */
    private int i;

    /**
     * Dodanie wartości na koniec listy.
     *
     * @param i Dodawana wartość.
     */
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    /**
     * @return Zwraca, czy lista jest pusta.
     */
    public boolean isEmpty() {
        return last == null;
    }

    /**
     * @return Zwraca, czy lista jest pełna.
     */
    public boolean isFull() {
        return false;
    }

    /**
     * Zwraca ostatni element listy.
     *
     * @return Wartość ostatniego elementu lub EMPTY_RHYMER_INDICATOR, jeżeli owa jest pusta.
     */
    public int top() {
        if (isEmpty())
            return EMPTY_RHYMER_INDICATOR;
        return last.getValue();
    }

    /**
     * Zwraca ostatni element listy i usuwa go.
     *
     * @return Wartość ostatniego elementu lub EMPTY_RHYMER_INDICATOR, jeżeli owa jest pusta.
     */
    public int pop() {
        if (isEmpty())
            return EMPTY_RHYMER_INDICATOR;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }
}
