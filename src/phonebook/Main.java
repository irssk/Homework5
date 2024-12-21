package phonebook;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        TelephoneDirectory directory = new TelephoneDirectory();

        directory.add("John", "123-456-7890");
        directory.add("Jane", "987-654-3210");
        directory.add("John", "555-555-5555");
        directory.add("Alice", "333-333-3333");
        directory.add("John", "555-555-5555");

        System.out.println("All records:");
        for (Record record : directory.getAllRecords()) {
            System.out.println(record);
        }

        System.out.println("\nFirst matching record for 'John':");
        Record johnRecord = directory.find("John");
        System.out.println(johnRecord);

        System.out.println("\nAll matching records for 'John':");
        List<Record> allJohnRecords = directory.findAll("John");
        if (allJohnRecords != null) {
            for (Record record : allJohnRecords) {
                System.out.println(record);
            }
        } else {
            System.out.println("No records found.");
        }

        System.out.println("\nRemoving duplicates...");
        directory.removeDuplicates();
        System.out.println("Records after removing duplicates:");
        for (Record record : directory.getAllRecords()) {
            System.out.println(record);
        }

        System.out.println("\nDeleting all records for 'John'...");
        directory.deleteByName("John");
        System.out.println("Records after deleting 'John':");
        for (Record record : directory.getAllRecords()) {
            System.out.println(record);
        }

        System.out.println("\nSorting records by name...");
        directory.sortByName();
        System.out.println("Records after sorting:");
        for (Record record : directory.getAllRecords()) {
            System.out.println(record);
        }
    }
}