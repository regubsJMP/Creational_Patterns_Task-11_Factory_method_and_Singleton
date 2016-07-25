package com.gubaidullin;

/**
 * Created by Renat_Gubaidullin on 7/25/2016.
 */
public class ConsumerCard {
    String cardNumber;
    private String name;
    private String address;
    public ConsumerCard(String cardNumber, String name, String address) {
        this.cardNumber = cardNumber;
        this.name = name;
        this.address = address;
    }

     public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public void handleConsumerData () {
            String handledCardNimber = cardNumber;
            if (handledCardNimber.startsWith("4")){
                FactoryMethod dataManager = new FactoryMethod();
                dataManager.getDataManager(LazyInitializedDataSourceFile.getInstance());
                // or  dataManager.getDataManager(JoshuaBlochDataSourceFile.INSTANCE.createFile());
            } else if (handledCardNimber.startsWith("5")){
                FactoryMethod dataManager = new FactoryMethod();
                dataManager.getDataManager(new DBConnection());
            }
    }

    // further realization og data matching and  file or db update........


}
