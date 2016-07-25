package com.gubaidullin;

import java.io.File;

/**
 * Created by Renat_Gubaidullin on 7/25/2016.
 */
// Singleton approach was chosen as we have the condition: Data source is  one and only one File from a file system.

public enum JoshuaBlochDataSourceFile {

    INSTANCE;

    public File createFile(){
        //do something
        File dataSourceFile = new File ("C:\\data.txt");
        return dataSourceFile;
    }

}
