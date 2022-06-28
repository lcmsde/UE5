public class FolgeMitDynArray<T> implements Folge<T> {

    private DynArray<T> folge;

    public FolgeMitDynArray() {
        folge = new DynArray<>();
    }

    public T get(int pos) {
        return folge.get(pos);
    }

    public T set(int pos, T e) {
        return folge.set(pos,e);
    }

    public T remove(int pos) {
        return null;
    }

    public void insert(int pos, T e) {

    }

    public void insert(T e) {
    folge.addLast(e);
    }

    public void remove() {
    throw new UnsupportedOperationException();
    }

    public int size() {
        return folge.size();
    }

    public boolean isEmpty() {
        return folge.size()==0;
    }
}
