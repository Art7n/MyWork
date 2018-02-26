package ex7.reader;

public class LibraryDemo {
    public static void main(String args[]) {
        Reader[] readers = new Reader[5];
        Book books[] = new Book[5];

        for (int i = 0; i < 5; i++) {
            readers[i] = new Reader();
        }
        for (int i = 0; i < 5; i++) {
            books[i] = new Book();
        }

        readers[1].setFirstName("Андрей");
        readers[1].setLastName("Жунько");
        readers[1].setFatherName("Петрович");
        readers[1].setTicketNumber(15443);
        readers[1].setFaculty("Компьютерных технологий");
        readers[1].setBirthDate("01.02.99");
        readers[1].setMobileNum("033 554 46 64");
        books[1].setBookName("Тысяча Орков");
        books[1].setAuthor("Роберт Сальваторе");
        books[2].setBookName("Гарри Поттери и теория рационального мышления");
        books[2].setAuthor("Элиезер Юдковски");
        books[3].setBookName("Имя ветра");
        books[3].setAuthor("Патрик Ротфус");
        readers[1].takeBook(5);
        readers[1].takeBook("Цветы для Элджернона", "1984", "Человек огня");
        readers[1].takeBook(books[1], books[2], books[3]);
        readers[1].returnBook(2);
        readers[1].returnBook("Цветы для Элджернона", "1984", "Человек огня");
        readers[1].returnBook(books[1], books[2], books[3]);
    }
}
