package com.sekirin;

import java.io.*;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) throws IOException{


//        File file = new File("text.txt");
//        FileWriter fileWriter = new FileWriter(file);
//        System.out.print("Ввведите содержимое файла: ");
//        Scanner console = new Scanner(System.in);
//        String fromUser = console.nextLine();
//        fileWriter.write(fromUser);
//        fileWriter.flush();
//        fileWriter.close();
//        FileReader fileReader = new FileReader(file);
//        BufferedReader bufferedReader = new BufferedReader(fileReader);
//        String str;
//        while((str = bufferedReader.readLine()) != null){
//            System.out.println(str);
//        }


        Buffer _buffer = new Buffer();
        ReadFile t1 = new ReadFile(_buffer);
        ReadDataFromBuffer t2 = new ReadDataFromBuffer(_buffer);

        t1.start();
        t2.start();
    }
}

