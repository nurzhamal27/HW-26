import model.Dictionary;
import util.FileService;

import java.util.Arrays;

public class Simulation {
    Dictionary dictionary = new Dictionary("1", "One");
    public void run(){
    dictionary.openDatabase();
    dictionary.closeDatabase();
    dictionary.checkConnection();
    dictionary.readOneRowByIndex();
    dictionary.checkRecordByKey();
    dictionary.readOneRecordByKey();
    dictionary.readDataBaseRecord();
    dictionary.findDatabaseNumber();
    dictionary.addRecord();
    dictionary.upDateValueByIndex();
    dictionary.updateContentByKey();

    }
}
