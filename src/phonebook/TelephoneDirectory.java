package phonebook;

import java.util.*;

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

    public void removeDuplicates() {
        Set<Record> uniqueRecords = new HashSet<>(records);
        records.clear();
        records.addAll(uniqueRecords);
    }

    public void deleteByName(String name) {
        records.removeIf(record -> record.getName().equalsIgnoreCase(name));
    }

    public void sortByName() {
        records.sort(Comparator.comparing(Record::getName, String.CASE_INSENSITIVE_ORDER));
    }

    public List<Record> getAllRecords() {
        return records;
    }
}