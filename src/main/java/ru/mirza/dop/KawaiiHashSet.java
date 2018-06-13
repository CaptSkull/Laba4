package ru.mirza.dop;

import java.util.ArrayList;

public class KawaiiHashSet {

    private ArrayList<BakaLinkedList> nyaHashSetTable = new ArrayList<>();

    public KawaiiHashSet() {
        nyaHashSetTable.add(new BakaLinkedList());
    }

    private int kawaiiHashCode(String t) {
        return t.hashCode() % nyaHashSetTable.size();
    }

    public void add(String t) {
        if (!nyaHashSetTable.get(kawaiiHashCode(t)).contains(t, kawaiiHashCode(t), nyaHashSetTable))
            nyaHashSetTable.get(kawaiiHashCode(t)).add(t);
    }

    public void remove(String t) {
        nyaHashSetTable.get(kawaiiHashCode(t)).remove(t, kawaiiHashCode(t), nyaHashSetTable);
    }

    public boolean contains(String t) {
        return nyaHashSetTable.get(kawaiiHashCode(t)).contains(t, kawaiiHashCode(t), nyaHashSetTable);
    }

    @Override
    public String toString() {
        ArrayList<ArrayList> result = new ArrayList<>();
        for (BakaLinkedList myLinkedList : nyaHashSetTable)
            result.add(myLinkedList.printResult());
        return result.toString();
    }
}