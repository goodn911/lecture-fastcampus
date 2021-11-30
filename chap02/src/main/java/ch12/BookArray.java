package ch12;

import java.util.ArrayList;

public class BookArray {
    public static void main(String[] args){

        ArrayList<Book> library = new ArrayList<>();

        library.add(new Book("태백산맥","조러애재"));
        library.add(new Book("태백산맥","조러애재"));
        library.add(new Book("태백산맥","조러애재"));
        library.add(new Book("태백산맥","조러애재"));
        library.add(new Book("태백산맥","조러애재"));

        for(int i = 0; i< library.size();i++){
            library.get(i).showInfo();

        }
    }
}
