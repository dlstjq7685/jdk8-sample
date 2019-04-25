package com.ysd.sysInOut.files;

import java.io.*;

public class basic {

    public basic(){

        System.out.println("file tutorials");

        File file = new File(".\\file-tutorial.txt");

        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{
            if(file.length() != 0){

                try {
                    FileInputStream read = new FileInputStream(file);

                    int meg;
                    while ((meg = read.read()) != -1){
                        System.out.println(meg);
                    }

                    read.close();

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        try {
            FileOutputStream write = new FileOutputStream (file);

            write.write(97);

            write.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
