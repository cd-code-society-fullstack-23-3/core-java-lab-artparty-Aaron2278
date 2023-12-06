package com.codedifferently.artparty;
import org.junit.Test;
import static org.junit.Assert.*;

public class GuestTest {

    @Test
    public void testGuestConstructor01() {
        //Given
        Long id;
        String firstName;
        String lastName;
        String email;
        String phone;
        String reasonForVisit;
        //When
        Guest guest = new Guest(id, firstName, lastName, email, phone, reasonForVisit);
        //Then
        assertEquals(id, guest.getId());
        assertEquals(firstName, guest.getFirstName());
        assertEquals(lastName, guest.getLastName());
        assertEquals(email, guest.getEmail());
        assertEquals(phone, guest.getPhone());
        assertEquals(reasonForVisit, guest.getReasonForVisit());
    }
}

  /*  @Test
    void testBookConstructor(){
        //Given
        String title = "The Art of War";
        String author = "Sun Tzu";
        String numberOfPages = "256";
        String genre = "Non-Fiction";

        //When

        Book book = new Book(title, author, numberOfPages,genre);
        //Then
        assertEquals(title, book.getTitle());
        assertEquals(author,book.getAuthor());
        assertEquals(numberOfPages,book.getNumberOfPages());
        assertEquals(genre,book.getGenre());
    }
   */