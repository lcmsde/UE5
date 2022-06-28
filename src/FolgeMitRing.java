public class FolgeMitRing<T> implements Folge<T> {

    private Ringpuffer<T> folge;

    public FolgeMitRing(int capacity) {
        folge = new Ringpuffer<>(capacity);
    }

    public T get(int pos) {
        return folge.get(pos);
    }

    public T set(int pos, T e) {
        return folge.set(pos, e);
    }

    public T remove(int pos) {
        Ringpuffer<T> folgeNeu = new Ringpuffer<>(folge.size());
        T el = null;
        for (int i = 0; i < folge.size(); i++) {
            if (i == pos) {
                el = folge.removeFirst();
            } else {
                folgeNeu.addLast(folge.removeFirst());
            }
        }
        folge = folgeNeu;
        return el;
    }

    public void insert(int pos, T e) {
        folge.insert(pos, e);
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
        return folge.size == 0;
    }
}
