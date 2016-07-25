package com.gubaidullin;

import java.io.*;

/**
 * Created by Renat_Gubaidullin on 7/25/2016.
 */
public class ConcreteFileDataManager extends AbstractDataManager {

    //private LazyInitializedDataSourceFile context;

    public String ReadData(Object context) {

        String fileData = null;
        File file = (File) context;
        InputStream fileInpetStream = null;
        try {
            fileInpetStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            fileData = String.valueOf(fileInpetStream.read());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return fileData;
    }

    public void WriteData(Object context, String writingData){

        File file = (File) context;

        PrintWriter out = null;
        try {
            out = new PrintWriter(file.getAbsoluteFile());
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }

        try {
                //Записываем текст у файл
                out.print(writingData);
            } finally {
                //После чего мы должны закрыть файл
                //Иначе файл не запишется
                out.close();
            }

        }

   }

