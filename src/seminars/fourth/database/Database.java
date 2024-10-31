package seminars.fourth.database;

import java.util.ArrayList;
import java.util.List;

public class Database {
    public List<String> query(String sql) {

        List<String> fakeData = new ArrayList<>();
        fakeData.add("Data1");
        fakeData.add("Data2");
        fakeData.add("Data3");
        return fakeData;
    }
}
