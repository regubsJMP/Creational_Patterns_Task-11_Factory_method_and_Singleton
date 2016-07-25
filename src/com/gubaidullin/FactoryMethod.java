package com.gubaidullin;

/**
 * Created by Renat_Gubaidullin on 7/26/2016.
 */
public class FactoryMethod {
    public AbstractDataManager getDataManager(Object object) {
        AbstractDataManager dataManager = null;
        if (object instanceof LazyInitializedDataSourceFile) {
            dataManager = new ConcreteFileDataManager();
        } else if (object instanceof DBConnection) {
            dataManager = new ConcreteDataBaseManager();
        }
        return dataManager;
    }
}