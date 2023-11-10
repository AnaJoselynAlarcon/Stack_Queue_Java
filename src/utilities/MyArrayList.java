package utilities;

public class MyArrayList<E> implements ListADT {

    private int size;
    private Object[] array;

    @Override
    public int size() {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                size++;
            }
        }
        return size;

    }

    @Override
    public void clear() {
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
    }

    @Override
    public boolean add(int index, Object toAdd) throws NullPointerException, IndexOutOfBoundsException {
        if (toAdd == null) {
            throw new NullPointerException("The specified element is null");
        }
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("The index is out of range");
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = toAdd;
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean add(Object toAdd) throws NullPointerException {
        if (toAdd == null) {
            throw new NullPointerException("The specified element is null");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = toAdd;
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean addAll(ListADT toAdd) throws NullPointerException {
        if (toAdd == null) {
            throw new NullPointerException("The specified element is null");

        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = toAdd;
                return true;
            }
        }
        return false;
    }

    @Override
    public Object get(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("The index is out of range");
        }
        for (int i = 0; i < array.length; i++) {
            // if the index is equal to the index of the array
            if (index == i) {
                // return the element at that index
                Object object = array[i];
                return object;
            }
        }
    }

    @Override
    public Object remove(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("The index is out of range");
        } else {
            for (int i = 0; i < array.length; i++) {
                // if the index is equal to the index of the array
                if (index == i) {
                    // return the element at that index
                    Object object = array[i];
                    array[i] = null;
                    return object;
                }
            }
        }
    }

    @Override
    public Object remove(Object toRemove) throws NullPointerException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public Object set(int index, Object toChange) throws NullPointerException, IndexOutOfBoundsException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'set'");
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
    }

    @Override
    public boolean contains(Object toFind) throws NullPointerException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'contains'");
    }

    @Override
    public Object[] toArray(Object[] toHold) throws NullPointerException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toArray'");
    }

    @Override
    public Object[] toArray() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toArray'");
    }

    @Override
    public Iterator iterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }

}
