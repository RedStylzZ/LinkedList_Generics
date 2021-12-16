package model;

import java.util.Objects;

public class GenericListItem<T extends Generic> {

    private final T value;
    private GenericListItem<T> next;

    public GenericListItem(T value) {
        this.value = value;
    }

    public void setNext(GenericListItem<T> next) {
        this.next = next;
    }

    public T getValue() {
        return this.value;
    }

    public GenericListItem<T> getNext() {
        return this.next;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GenericListItem<?> that = (GenericListItem<?>) o;
        return Objects.equals(value, that.value) && Objects.equals(next, that.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, next);
    }
}
