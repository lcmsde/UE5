public class EVL<T> {

    Listenelement first = null;
    Listenelement last = null;
    int size = 0;

    class Listenelement {
        T data;
        Listenelement next = null;

        Listenelement(T data) {
            this.data = data;
        }
    }


    public boolean isEmpty() {
        return this.first == null;
    }

    public void addFirst(T e) {
        Listenelement element = new Listenelement(e);
        element.next = this.first;
        this.first = element;
        if (last == null) {
            last = first;
        }
        size++;
    }

    public T removeFirst() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException();
        }
        Listenelement temp = first;
        first = first.next;
        return temp.data;
    }

    public T removeLast() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException();
        }
        Listenelement tmp = first;
        if (first == last) {
            first = null;
            last = null;
            return tmp.data;
        }

        while (last != tmp.next) {
            tmp = tmp.next;
        }
        T d = tmp.next.data;
        tmp.next = null;
        size--;
        last = tmp;
        return d;
    }

    public T getFirst() {
        return first.data;
    }

    public T getLast() {
        if (this.isEmpty()) {
            throw new java.util.NoSuchElementException();
        }
        return last.data;
    }

    public void addLast(T e) {
        if (this.isEmpty()) {
            addFirst(e);
        }
        Listenelement element = new Listenelement(e);
        last.next = element;
        last = element;
        size++;
    }

    public boolean contains(T e) {
        Listenelement tmp = this.first;
        for (int i = 1; i <= this.size; i++) {
            if (tmp.data == e) {
                return true;
            }
            tmp = tmp.next;
        }
        return false;
    }

    public int size() {
        return this.size;
    }

    public void zip(EVL<T> other) {
        if (this.isEmpty()) {
            Listenelement tmp = other.first;
            do {
                this.addLast(other.removeFirst());
            } while(tmp.next != other.last);
        }

        Listenelement tmp = this.first;
        if (other.size() >= this.size) {
            do {
                Listenelement n = tmp.next;
                tmp.next = other.first;
                tmp.next.next = n;
                tmp = tmp.next.next;
                other.removeFirst();
            } while (tmp.next != this.last);

            while (!other.isEmpty()) {
                this.addLast(other.removeFirst());
            }
        } else {
            while (!other.isEmpty()) {
                Listenelement n = tmp.next;
                tmp.next = other.first;
                tmp.next.next = n;
                tmp = tmp.next.next;
                other.removeFirst();
            }
        }
    }

}
