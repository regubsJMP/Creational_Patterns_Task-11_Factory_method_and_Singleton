package com.gubaidullin;

import java.io.FileNotFoundException;

/**
 * Created by Renat_Gubaidullin on 7/25/2016.
 */
public abstract class AbstractDataManager {
    public abstract Object ReadData(Object context);
    public abstract void WriteData(Object context, String writingData);
}
