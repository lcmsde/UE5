public class SchlangeMitRing<T> implements Schlange<T>{

    private Ringpuffer<T> schlange;

    public SchlangeMitRing(int capacity) {
        this.schlange = new Ringpuffer<>(capacity);
    }

    public void insert(T e){
        schlange.addLast(e);
    }

    public void remove() {
        schlange.removeFirst();
    }

    public int size() {
        return schlange.size();
    }

    public boolean isEmpty() {
        return schlange.size() == 0;
    }

    public T first(){
        return schlange.get(schlange.entrypos);
    }

}
