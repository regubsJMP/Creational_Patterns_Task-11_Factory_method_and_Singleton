package com.gubaidullin;

/**
 * Created by Renat_Gubaidullin on 7/26/2016.
 */
public class ConcreteDataBaseManager extends AbstractDataManager {

    public String ReadData(Object context) {

        String fileData = null;
        DBConnection dbConnection = (DBConnection) context;

        // realization of db reading...

        return fileData;
    }

    public void WriteData(Object context, String writingData){

        DBConnection dbConnection = (DBConnection) context;

        // realization of db writing...

    }

}


