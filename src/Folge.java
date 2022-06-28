public interface Folge<T> extends Puffer<T> {

    public T get(int pos);

    public T set(int pos, T e);

    public T remove(int pos);

    public void insert(int pos, T e);


}
