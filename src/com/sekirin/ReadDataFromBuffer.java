package com.sekirin;

import java.io.IOException;

public class ReadDataFromBuffer extends Thread{
    private final Buffer __buffer;
    public ReadDataFromBuffer(Buffer buffer)
    {
        __buffer = buffer;
    }


    @Override
    public void run() {

        try {
            ReadData();

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void ReadData() throws IOException, InterruptedException {
        while(true) {
            System.out.println(__buffer.get());
            sleep(1000);
        }


    }
}
