package PR_1;

import PR_1.Ball;
import PR_1.Book;

public class Tester {
    public static void main(String[] args) {
        Book b1 = new Book ("knight", 2001);
        Ball b2 = new Ball ("yellow",15);
        b1.goOut();
        b2.goOut2();
    }
}
