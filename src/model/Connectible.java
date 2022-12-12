package model;

public interface Connectible {
    boolean openDatabase();

    boolean closeDatabase();

    boolean checkConnection();

    void readOneRowByIndex();

    void checkRecordByKey();

    void readOneRecordByKey();

    void readDataBaseRecord();

    void findDatabaseNumber();

    void addRecord();

    void upDateValueByIndex();

    void updateContentByKey();
}