package Task14;

import Task12.Book;

import java.util.ArrayList;
import java.util.Collections;

public class ClassComparable {
        public static void classComparable() {

            ArrayList<Book> books = new ArrayList<Book>();

            books.add(new Book("Краткая история человечества", "Юваль Ной Харари", 100, 1, 1));
            books.add(new Book("Бог как иллюзия", "Ричард Докинз", 25, 1, 2));
            books.add(new Book("451 градус по Фаренгейту", "Рэй Дуглас Брэдбери", 250, 1, 3));
            books.add(new Book("Капитанская дочка", "Александр Сергеевич Пушкин", 50, 1, 4));
            books.add(new Book("Белый Клык", "Джек Лондон", 200, 1, 5));

            for (int i = 0; i < books.size(); i++) {
                System.out.println(books.get(i).toString());
            }
            System.out.println();

            Collections.sort(books);
            for (int i = 0; i < books.size(); i++) {
                System.out.println(books.get(i).toString());
            }
            System.out.println();
        }
}
