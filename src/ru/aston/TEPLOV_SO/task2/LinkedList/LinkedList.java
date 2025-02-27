package ru.aston.TEPLOV_SO.task2.LinkedList;

import java.util.Collection;
import java.util.Objects;

public class LinkedList<T> {
    private int count;
    private Node node;

    private Node first;
    private Node last;

    public LinkedList() {
        this.count = 0;
        this.node = null;
    }

    public LinkedList(T elem) {
        add(elem);
    }

    private class Node {
        private Node next;
        private Node prev;

        private int index;
        private T value;

        private Node() {}

        private Node(T elem) {
            this.value = elem;
            this.index = 0;
        }
    }

    public void add(T elem) {
        node = last;

        if (count == 0) {
            node = firstAddNode(elem);
        }
        else {
            node = addNode(elem);
        }

        count++;
    }

    public void add(T[] arr) {
        for (T obj : arr) {
            add(obj);
        }
    }

    public void add(Collection<? extends T> arr) {
        for (T obj : arr) {
            add(obj);
        }
    }

    public void insert(T t, int index) {
        getArrayIndexOutOfBoundsException(index);
        node = first;
        findToIndex(index);

        if (index == count - 1) {
            add(t);
        }
        else {
            Node tmp = new Node();
            tmp.value = t;
            tmp.index = index;

            if (index == 0) {
                first = tmp;
            }

            if (index != 0)  {
                node.prev.next = tmp;
                tmp.prev = node.prev;
            }

            tmp.next = node;
            node.prev = tmp;

            while (!Objects.isNull(node)) {
                node.index++;
                node = node.next;
            }

            count++;
        }
    }

    public T get(int index) {
        getArrayIndexOutOfBoundsException(index);

        this.node = this.first;
        findToIndex(index);

        return node.value;
    }

    public void remove(int index) {
        getArrayIndexOutOfBoundsException(index);

        Node tmpNode;

        if (index == 0) {
            tmpNode = first;
            first = first.next;
            first.prev = null;
            node = first;
        }
        else if (index == count - 1) {
            tmpNode = last;
            last = last.prev;
            last.next = null;
        }
        else {
            node = first;
            findToIndex(index);

            tmpNode = node;
            node.prev.next = node.next;
            node.next.prev = node.prev;
            node = node.next;
        }

        while (!Objects.isNull(node)) {
            node.index--;
            node = node.next;
        }

        count--;
        cleanNode(tmpNode);
    }

    public void clean() {
        last = null;
        first = null;
        node = null;
        count = 0;
    }

    public int count() {
        return count;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        node = first;

        for (int i = 0; i < count; i++) {
            str.append("(" + node.value.toString() + " index: " + node.index + ") ");
            node = node.next;
        }

        return str.toString();
    }

    private Node firstAddNode(T elem) {
        Node node = new Node(elem);
        this.first = node;
        this.last = node;

        return node;
    }

    private Node addNode(T elem) {
        Node node = new Node(elem);

        node.prev = this.node;
        this.node.next = node;
        node.index = this.node.index + 1;
        this.last = node;

        return node;
    }

    private void findToIndex(int index) {
        while (node.index != index) {
            node = node.next;
        }
    }

    private void getArrayIndexOutOfBoundsException(int index)
            throws ArrayIndexOutOfBoundsException {
        if (index < 0 || index >= count) {
            throw new ArrayIndexOutOfBoundsException("Выход за пределы допустимого диапазона");
        }
    }

    private void cleanNode(Node node) {
        node.next = null;
        node.prev = null;
    }
}
