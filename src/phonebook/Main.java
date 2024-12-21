package phonebook;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        TelephoneDirectory directory = new TelephoneDirectory();

        directory.add("John", "123-456-7890");
        directory.add("Jane", "987-654-3210");
        directory.add("John", "555-555-5555");

        Record johnRecord = directory.find("John");
        System.out.println("First matching record for 'John':");
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

        System.out.println("\nSearching for 'Alice':");
        Record aliceRecord = directory.find("Alice");
        System.out.println(aliceRecord != null ? aliceRecord : "No record found.");
    }
}