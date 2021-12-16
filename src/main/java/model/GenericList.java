package model;

public class GenericList<T extends Generic> {

    private GenericListItem<T> head;

    public GenericList(T generic) {
        this.head = new GenericListItem<>(generic);
    }

    public void add(T generic) {
        if (head == null) {
            this.head = new GenericListItem<>(generic);
            return;
        }

        GenericListItem<T> nextGenericList = head;

        while (nextGenericList.getNext() != null) {
            nextGenericList = nextGenericList.getNext();
        }
        nextGenericList.setNext(new GenericListItem<>(generic));
    }

    public void remove(T generic) {
        if (head == null) return;
        GenericListItem<T> nextGenericList = head;

        while (nextGenericList.getNext() != null) {
            if (head.equals(nextGenericList)) {
                head = nextGenericList.getNext();
                nextGenericList = nextGenericList.getNext();
            }
            if (nextGenericList.getNext().getValue().equals(generic)) {
                nextGenericList.setNext(nextGenericList.getNext().getNext());
                continue;
            }
            nextGenericList = nextGenericList.getNext();
        }
    }

    @Override
    public String toString() {
        if (head == null) return "";
        StringBuilder stringBuilder = new StringBuilder();
        GenericListItem<T> nextAnimalList = head;

        while (nextAnimalList != null) {
            stringBuilder.append(nextAnimalList.getValue().getName()).append(nextAnimalList.getNext() == null ? "" : " -> ");
            nextAnimalList = nextAnimalList.getNext();
        }

        return stringBuilder.toString();
    }
}
