package Task15;

import Task12.Book;

import java.util.Comparator;

public class Comparators {
    public static Comparator<Book> firstComparator() {
        return new TitleComparator();
    }

    public static Comparator<Book> secondComparator() {
        return new TitleComparator().thenComparing(new AuthorComparator());
    }

    public static Comparator<Book> thirdComparators() {
        return new AuthorComparator().thenComparing(new TitleComparator());
    }

    public static Comparator<Book> fourthComparators() {
        return new TitleComparator().thenComparing(new AuthorComparator()).thenComparing(new PriceComparator());
    }
}
