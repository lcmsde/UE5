public interface Puffer<T> {

    public void insert(T e);

    public void remove();

    public int size();

    public boolean isEmpty();

}
