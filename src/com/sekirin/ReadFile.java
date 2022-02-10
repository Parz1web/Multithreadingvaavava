package com.sekirin;

import java.io.*;

public class ReadFile extends Thread{
    private Buffer __buffer;

    public ReadFile(Buffer buffer)
    {
        __buffer = buffer;
    }


    /**
     * Главный метод потока. Запускается при вызове start
     */
    @Override
    public void run() {

        try {
            while (true){
            ReadFileToBuffer();
            }

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

    }


    /**
     *Бесконечно генерирует рандомные числа и добавляет их в буфер.
     */
    private void ReadFileToBuffer() throws IOException, InterruptedException {

            File file = new File("text.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);


            String line;
            while ((line = bufferedReader.readLine()) != null) {
                __buffer.add(line);
                sleep(1000);
            }






    }
}
