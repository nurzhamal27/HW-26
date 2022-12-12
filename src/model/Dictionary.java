package model;

import util.FileService;

import java.io.IOException;
import java.util.Arrays;

public class Dictionary implements Connectible{
    private String key;
    private String value;
    private Connectible connectibleObj;
    Dictionary[] dictionaries = FileService.getInfo();


    public Dictionary(String key, String value) {
        this.key = key;
        this.value = value;
    }


    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "model.Dictionary{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }


    @Override
    public boolean openDatabase() {
        System.out.println("Соединение открыто");
        return true;
    }


    @Override
    public boolean closeDatabase() {
        System.out.println("Соединение закрыто");
        return false;
    }

    @Override
    public boolean checkConnection() {
        if (true) {
            System.out.println("Соединение открыто");
        } else  {
            System.out.println("Соединение закрыто");
        }
        return false;
    }


    @Override
    public void readOneRowByIndex() {
        System.out.println(dictionaries[0]);

    }

    @Override
    public void checkRecordByKey() {
        if(getKey() == key){
            System.out.println(getKey());
        }
    }

    @Override
    public void readOneRecordByKey() {
        try {
            System.out.println(dictionaries[4].getKey());

        } catch (Exception e) {
            System.out.println("Ошибка");
        }
    }

    @Override
    public void readDataBaseRecord() {
        System.out.println(dictionaries[0]);
        System.out.println(dictionaries[5]);
    }

    @Override
    public void findDatabaseNumber() {
        int array = dictionaries.length;
        System.out.println(array);

    }

    @Override
    public void addRecord() {
        dictionaries[5].setKey("2");
        dictionaries[5].setValue("Two");
        FileService.writeFile(dictionaries);

    }

    @Override
    public void upDateValueByIndex() {
        dictionaries[0].setValue("AAA");
        dictionaries[1].setValue("BBB");
        dictionaries[2].setValue("CCC");
        dictionaries[3].setValue("DDD");
        dictionaries[4].setValue("EEE");
        dictionaries[5].setValue("FFF");
        FileService.writeFile(dictionaries);
    }

    @Override
    public void updateContentByKey() {
        dictionaries[0].setKey("1");
        dictionaries[1].setKey("2");
        dictionaries[2].setKey("3");
        dictionaries[3].setKey("4");
        dictionaries[4].setKey("5");
        dictionaries[5].setKey("6");
        FileService.writeFile(dictionaries);

    }
}
