package com.ysd.Log;

import com.ysd.start;

import java.io.File;
import java.io.IOException;
import java.util.TimeZone;
import java.util.logging.*;

public class basic implements start{

    final Logger L = Logger.getLogger(this.getClass().getName());
    final String Log_path = ".\\sample.log";

    public basic(){
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));

        this.set_file();
        try {

            FileHandler fileHandler = new FileHandler(Log_path, false);

            fileHandler.setFormatter(new SimpleFormatter());

            L.addHandler(fileHandler);
            L.setLevel(Level.FINE);

            ConsoleHandler consoleHandler = new ConsoleHandler();
            consoleHandler.setLevel(Level.CONFIG);
            L.addHandler(consoleHandler);

            L.setUseParentHandlers(false);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void Config_log(String meg){
        L.config(meg);
    }

    public void Info_log(String meg){
        L.info(meg);
    }

    public void Print_log(String meg){
        L.fine(meg);
    }

    public void Warnning_log(String meg){
        L.warning(meg);
    }

    public void Error_log(String meg){
        L.severe(meg);
    }

    private void set_file(){

        File file = new File(Log_path);

        if(!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run() {
        //Test log print
        L.info("test");
        L.config("test");
        L.fine("test");
        L.warning("test");
        L.severe("test");

    }
}
