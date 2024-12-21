package phonebook;

import java.util.ArrayList;
import java.util.List;

public class TelephoneDirectory {
    private List<Record> records;

    public TelephoneDirectory() {
        this.records = new ArrayList<>();
    }

    public void add(String name, String phoneNumber) {
        records.add(new Record(name, phoneNumber));
    }

    public Record find(String name) {
        for (Record record : records) {
            if (record.getName().equalsIgnoreCase(name)) {
                return record;
            }
        }
        return null;
    }

    public List<Record> findAll(String name) {
        List<Record> matchingRecords = new ArrayList<>();
        for (Record record : records) {
            if (record.getName().equalsIgnoreCase(name)) {
                matchingRecords.add(record);
            }
        }
        return matchingRecords.isEmpty() ? null : matchingRecords;
    }
}