package com.gubaidullin;

import java.io.File;

/**
 * Created by Renat_Gubaidullin on 7/25/2016.
 */

// Singleton approach was chosen as we have the condition: Data source is  one and only one File from a file system.


public class LazyInitializedDataSourceFile {

    private static File instance;

    private LazyInitializedDataSourceFile(){}

    public static File getInstance(){
        if(instance == null){
            instance = new File ("C:\\data.txt");
        }
        return instance;
    }


}
