package com.sekirin;

import java.io.BufferedReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Buffer {
    private Queue<String> __buffer = new ArrayDeque<>();


    /**
     * Метод для добавления элемента в очередь
     * @param i
     */
    public synchronized void add(String i)
    {
        __buffer.add(i);
    }

    /**
     * Метод для получения первого элемента очереди с удалением.
     * @return
     */
    public String get()
    {
        return __buffer.poll();
    }

}
