package workbench1;

import java.util.HashMap;

public class Library {

    public Library() {
    }

    void getFinishedBooks(HashMap<String, Boolean> library) {

        if (library.size() < 1) {
            System.out.println("HashMap is empty!");
        }
        else {
            for (String n : library.keySet()) {
                if (library.get(n)) {
                    System.out.println(library.get(n));
                }
            }
        }
    }

    public static void main(String[] args) {

        HashMap<String, Boolean> myBooks = new HashMap<String, Boolean>();

        myBooks.put("Road Down the Funnel", true);
        myBooks.put("Rat: A Biology", false);
        myBooks.put("TimeIn", true);
        myBooks.put("3D Food Printing", false);

        Library myLibrary = new Library();
        myLibrary.getFinishedBooks(myBooks);





    }








}
