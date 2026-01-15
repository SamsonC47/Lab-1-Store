import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoreTester {
    @Test
    public void addBookTest(){
        Store store = new Store();
        Book bookOne = new Book("Java Crash Course", "Desk",150,"Java",2000,
                "2025-12-12","Eason","1234","First","Java Crash Course");
        store.addBook(bookOne);
        assertTrue(true);
    }

    @Test
    public void addBookAndAddPhoneTest(){
        Store store = new Store();
        Book bookTwo = new Book("Python Crash Course","Chair",120,"Python",1500,
                "2025-12-14","Eason","6789","Second","Python Crash Course");
        Phone phoneOne = new Phone("iPhone 16","bag",5000,"Smartphone",256,
                "iPhone 16","Apple","iOS26","5G",6);

        store.addBook(bookTwo);
        store.addPhone(phoneOne);
        assertTrue(true);
    }

    @Test
    public void updateLocationAndGetPhonesTest(){
        Store store = new Store();

        Phone phoneOne = new Phone("iPhone 16","bag",5000,"Smartphone",256,
                "iPhone 16","Apple","iOS26","5G",6);
        Phone phoneTwo = new Phone("iPhone 17 Pro","shelf",10000,"Smartphone",512,
                "iPhone 17","Appke","iOS26","5G",9);

        store.addPhone(phoneOne);
        store.addPhone(phoneTwo);
        store.updateLocation("Room 512");

        ArrayList<Phone> allPhones = store.getPhones();
        for (Phone phone : allPhones){
            assertEquals("Room 512", phone.getLocation());
        }
    }

    @Test
    public void getItemsTest(){
        Store store = new Store();
        Book bookOne = new Book("Java Crash Course", "Desk",150,"Java",2000,
                "2025-12-12","Eason","1234","First","Java Crash Course");
        Book bookTwo = new Book("Python Crash Course","Chair",120,"Python",1500,
                "2025-12-14","Eason","6789","Second","Python Crash Course");
        Phone phoneOne = new Phone("iPhone 16","bag",5000,"Smartphone",256,
                "iPhone 16","Apple","iOS26","5G",6);

        store.addBook(bookOne);
        store.addBook(bookTwo);
        store.addPhone(phoneOne);

        ArrayList<CISItem> books = store.getItems("book");
        assertEquals(2,books.size());

        ArrayList<CISItem> phones = store.getItems("phone");
        assertEquals(1,phones.size());
    }

    @Test
    public void updateItemsTest(){
        Store store = new Store();
        Book bookOne = new Book("Java Crash Course", "desk",150,"Java",2000,
                "2025-12-12","Eason","1234","First","Java Crash Course");
        Magazine magazineOne = new Magazine("Econ Quarterly","library",20,"Economics",
                2000,"2025-12-31","Eason","Issue 6","2026-01-01");
        Phone phoneOne = new Phone("iPhone 16","bag",5000,"Smartphone",256,
                "iPhone 16","Apple","iOS26","5G",6);

        store.addPhone(phoneOne);
        store.addMagazine(magazineOne);
        store.addBook(bookOne);

        store.updateItems("phone","location","chair");
        store.updateItems("magazine","name","Python learning");

        ArrayList<Phone> allPhones = store.getPhones();
        for(Phone phone: allPhones){
            assertEquals("chair",phone.getLocation());
        }

        ArrayList<Magazine> allMagazines = store.getAllMagazines();
        for(Magazine magazine: allMagazines){
            assertEquals("Python learning", magazine.getName());
        }

        ArrayList<Book> allBooks = store.getAllBooks();
        for(Book book: allBooks){
            assertEquals("desk", book.getLocation());
        }
    }


}
