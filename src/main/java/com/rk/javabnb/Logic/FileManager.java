package com.rk.javabnb.Logic;

import java.io.*;

public class FileManager {
    private String filename;
    private char mode;

    public FileManager(String filename, char mode) {
        this.filename = filename;
        this.mode = mode;
    }

    private void escribir(String data) {
        try {
            FileWriter fileWriter = new FileWriter(filename, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
}
