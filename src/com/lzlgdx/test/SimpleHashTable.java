package com.lzlgdx.test;

public class SimpleHashTable {
    public static void main(String[] args) {
        SimpleHashTable test = new SimpleHashTable();
        test.put(2, 5);
        test.put(7,8);
        test.put(9,10);
        System.out.println(test.get(2));
        System.out.println(test.get(7));
        System.out.println(test.get(100));
    }

    Record[] records;

    public SimpleHashTable() {
        records = new Record[10];
        for (int i = 0; i < 10; i++) {
            records[i] = new Record();
        }
    }

    public int hashFunction(int key) {
        return key % records.length;

    }

    public void put(int key, int value) {
        int index = hashFunction(key);
        records[index].set(key, value);
    }

    public int get(int key) {
        int index = hashFunction(key);
        return records[index].getValue();
    }
}

class Record {
    int key = -1;
    int value = -1;

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void set(int key, int value) {
        setKey(key);
        setValue(value);
    }
}
