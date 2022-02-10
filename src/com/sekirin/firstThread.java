package com.sekirin;

import java.io.*;
import java.util.Scanner;

public class firstThread extends Thread{
    private Buffer __buffer;

    public firstThread(Buffer buffer)
    {
        __buffer = buffer;
    }


    /**
     * Главный метод потока. Запускается при вызове start
     */
    @Override
    public void run() {

        try {

            method();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    /**
     *Бесконечно генерирует рандомные числа и добавляет их в буфер.
     */
    private void method() throws IOException {

            File file = new File("text.txt");
            FileWriter fileWriter = new FileWriter(file);
            System.out.print("Ввведите содержимое файла: ");
            Scanner console = new Scanner(System.in);
            String fromUser = console.nextLine();

            fileWriter.write(fromUser);
            fileWriter.flush();
            fileWriter.close();

            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            StringBuilder stringBuilder = new StringBuilder();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line);
            }
            String response = stringBuilder.toString();

            __buffer.add(response);


    }
}
