package com.batraining.javabase.course10;


import java.util.*;

/**
 * 自行实现一个ArrayList
 */
public class MyArrayList implements List {
    private Object[] elements;

    private int count; //标记元素的个数

    public MyArrayList() {
        elements = new Object[10];
        count = 0;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }


    /**
     * 判断是否包含某个元素O
     *
     * @param o
     * @return
     */
    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < count; i++) {
            Object temp = elements[i];
            if (temp.equals(o)) {
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


    public boolean add(Object o) {

        if (count == elements.length) {
            //扩容数组
            java.lang.Object[] oldElements = this.elements;
            elements = new Object[count + 10];
            System.arraycopy(oldElements, 0, elements, 0, count);
            oldElements = null;
            elements[count ] = o;
            count++;
        } else {
            elements[count] = o;
            count++;
        }

        return true;
    }

    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < count; i++) {
            Object temp = elements[i];
            if (temp.equals(o)) {
                //删除元素
                remove(i);

            }
        }

        return false;
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
        count = 0;
        for (int i = 0; i < count; i++) {
            elements[i] = null;
        }

    }

    @Override
    public Object get(int index) {
        return elements[index];
    }

    @Override
    public Object set(int index, Object element) {
        Object temp = elements[index];
        elements[index] = element;
        return temp;

    }


    @Override
    public void add(int index, Object element) {
        if (elements[index] != null) {
            if (count == elements.length) {
                //扩容数组
                java.lang.Object[] oldElements = this.elements;
                elements = new Object[count + 10];
                System.arraycopy(oldElements, 0, elements, 0, count);
            }

            System.arraycopy(elements, index, elements, index + 1, count - index );
            elements[index] = element;
            count ++;
        } else {
            elements[index] = element;
            count++;
        }


    }

    @Override
    public Object remove(int index) {
        Object temp = elements[index];
        System.arraycopy(elements, index + 1, elements, index, count - index - 1);
        elements[count - 1] = null;
        count--;
        return temp;
    }


    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < elements.length; i++) {
            Object temp = elements[i];
            if (temp.equals(o)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        for (int i = elements.length; i > 0; i--) {
            Object temp = elements[i];
            if (temp.equals(o)) {
                return i;
            }

        }
        return -1;
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

    public String toString(){
        String str ="[" ;
        for (int i = 0; i < count; i++) {
            str = str+ elements[i]+",";
        }
        str =str +"]";
        return str;
    }

    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        for (int i = 0; i < 88; i++) {
            myArrayList.add(i);
        }
        System.out.println(myArrayList);
        myArrayList.remove((Object)2);
        System.out.println(myArrayList);
        myArrayList.add(1,20);
        System.out.println(myArrayList);

    }
}
