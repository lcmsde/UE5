public class SchlangeMitEVL<T> implements Schlange<T> {

    private EVL<T> schlange;

    public SchlangeMitEVL(){
        schlange = new EVL<>();
    }

    public void insert(T e) {
        schlange.addLast(e);
    }


    public void remove() {
        schlange.removeFirst();
    }


    public int size() {
        return schlange.size();
    }


    public boolean isEmpty() {
        return schlange.isEmpty();
    }


    public T first() {
        return schlange.getFirst();
    }
}
