package com.sekirin;

import java.io.BufferedReader;
import java.io.IOException;

public class secondThread extends Thread{
    private final Buffer __buffer;
    String str;
    public secondThread(Buffer buffer)
    {
        __buffer = buffer;
    }


    @Override
    public void run() {

        try {
            method();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void method() throws IOException {
        __buffer.get();

    }
}
