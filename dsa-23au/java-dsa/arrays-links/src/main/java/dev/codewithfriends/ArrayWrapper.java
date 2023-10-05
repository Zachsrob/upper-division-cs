package dev.codewithfriends;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayWrapper implements List {
    
    private Object[] _array;
    private int theSize;
    private int currentSize;
    private boolean isEmpty;
    private String l1;

    public ArrayWrapper(int maxSize) {
        this._array = new Object[maxSize];
        this.currentSize = 0;
        this.isEmpty = true;
    }
    
    @Override
     // Returns the current size when called
    public int size() {
        return theSize;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < currentSize; i++) {
            if (_array[i] == o) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        this._array[currentSize]=o;
        this.currentSize++;
        this.isEmpty = false;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        for(i = 0; i <= List.size(); i++) {   //unfinished
            if (arr[].equals(o)) {
                count = i;
                break;
            }
            if (count = null) {
                return false;
            }
            String newArr[] = new String[arr.size() - 1]; 
            for (i = 0;)
        }
        //find index of element to remove
        //create a new array
        //add all elements to new array, sans one to remove
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Object get(int index) {
        return this._array[index];
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public Object remove(int index) {
        for(i = 0; i <= List.size(); i++) {   //this is for the other remove, is unfinished
            if (arr[].equals(o)) {
                count = i;
                break;
            }
            if (count = null) {
                return false;
            }
            String newArr[] = new String[arr.size() - 1]; 
            for (i = 0;)
        }
        //find index of element to remove
        //create a new array
        //add all elements to new array, sans one to remove
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
