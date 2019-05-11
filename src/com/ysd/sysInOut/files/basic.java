package com.ysd.sysInOut.files;

import com.ysd.start;

import java.io.*;

public class basic implements start {

    private File file;
    private BufferedReader  read;
    private FileOutputStream write;

    public basic(){
        file = new File(".\\file-tutorial.txt");
    }

    private void fileCheck(){
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void getFileInputStream(){
        try {
            FileReader fr = new FileReader(file);
            read = new BufferedReader(fr);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void getFileOutputStream(){
        try {
            write = new FileOutputStream (file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private String read_line() {
        try {
            return read.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private void write_line(byte...line){
        try {
            write.write(line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void file_close(){
        try {
            read.close();
            write.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void run() {
        System.out.println("file tutorials");


        fileCheck();

        if(file.length() != 0){
            getFileInputStream();

            String buffer;
            while((buffer = read_line()) != null)
                System.out.println(buffer);

        }

        getFileOutputStream();
        write_line("test\n".getBytes());
        write_line("test1".getBytes());
        file_close();
    }
}
