
import phonebook.Contact;
import phonebook.PhoneBook;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
         PhoneBook phoneBook = new PhoneBook(new ArrayList<Contact>() {
            {
                add(new Contact("Volodymyr Vashkolup", "050 422 18 21"));
                add(new Contact("Volodymyr Vashkolup", "050 422 20 21"));
                add(new Contact("Alice Wonderland", "050 975 20 21"));
            }
        });

        phoneBook.add(new Contact("Petro Poroshenko","094 22x xx xx"));
        phoneBook.add(new Contact("Darth Vader","xyt-12-zx-kk"));

        phoneBook.find("Alice Wonderland");
        phoneBook.findAll("Volodymyr Vashkolup");
//        Collections.countOccurance(new ArrayList<>() {
//            {
//                add("string");
//                add("word");
//                add("java");
//                add("java");
//                add("java");
//                add("book");
//                add("electricity");
//                add("book");
//                add("crypto");
//                add("record");
//            }
//        }, "book");
//        Collections.toList(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
//
//        Collections.findUnique(new ArrayList<>() {
//            {
//                add(1);
//                add(2);
//                add(3);
//                add(1);
//                add(2);
//                add(3);
//                add(1);
//                add(2);
//                add(3);
//                add(1);
//            }
//        });
//
//        Collections.calcOccurance(new ArrayList<>() {
//            {
//                add("string");
//                add("word");
//                add("java");
//                add("java");
//                add("java");
//                add("book");
//                add("electricity");
//                add("book");
//                add("crypto");
//                add("record");
//            }
//        });
//        Collections.findOccurance(new ArrayList<>() {
//            {
//                add("string");
//                add("word");
//                add("java");
//                add("java");
//                add("java");
//                add("book");
//                add("electricity");
//                add("book");
//                add("crypto");
//                add("record");
//            }
//        });

    }
}
