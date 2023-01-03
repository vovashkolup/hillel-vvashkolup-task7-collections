
import phonebook.Contact;
import phonebook.PhoneBook;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
         PhoneBook phoneBook = new PhoneBook(new ArrayList<Contact>() {
            {
                add(new Contact("Volodymyr Vashkolup", "0504221821"));
                add(new Contact("Volodymyr Vashkolup", "0504222021"));
                add(new Contact("Alice Wonderland", "0509752021"));
            }
        });

        phoneBook.add(new Contact("Petro Poroshenko","09422xxxxx"));
        phoneBook.add(new Contact("Darth Vader","xyt-12-zx-kk"));

        phoneBook.find("Alice Wonderland");
        phoneBook.findAll("Volodymyr Vashkolup");

        phoneBook.isEmpty(new Contact("Volodymyr",null));
        phoneBook.isValid(new Contact("Volodymyr Vashkolup", "0504221821"));
        phoneBook.isValid(new Contact("Darth Vader","xyt-12-zx-kk"));
        phoneBook.isVodafone(new Contact("Volodymyr","0953047654"));

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
