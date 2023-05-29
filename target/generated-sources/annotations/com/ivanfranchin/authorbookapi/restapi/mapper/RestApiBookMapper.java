package com.ivanfranchin.authorbookapi.restapi.mapper;

import com.ivanfranchin.authorbookapi.model.Book;
import com.ivanfranchin.authorbookapi.restapi.dto.BookResponse;
import com.ivanfranchin.authorbookapi.restapi.dto.CreateBookRequest;
import com.ivanfranchin.authorbookapi.restapi.dto.UpdateBookRequest;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-29T16:29:10-0500",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 20.0.1 (Oracle Corporation)"
)
@Component
public class RestApiBookMapper implements BookMapper {

    @Override
    public BookResponse toBookResponse(Book book) {
        if ( book == null ) {
            return null;
        }

        Long id = null;
        String isbn = null;
        String title = null;
        Integer year = null;

        id = book.getId();
        isbn = book.getIsbn();
        title = book.getTitle();
        year = book.getYear();

        BookResponse bookResponse = new BookResponse( id, isbn, title, year );

        return bookResponse;
    }

    @Override
    public Book toBook(CreateBookRequest createBookRequest) {
        if ( createBookRequest == null ) {
            return null;
        }

        Book book = new Book();

        book.setIsbn( createBookRequest.getIsbn() );
        book.setTitle( createBookRequest.getTitle() );
        book.setYear( createBookRequest.getYear() );

        return book;
    }

    @Override
    public void updateBookFromRequest(UpdateBookRequest updateBookRequest, Book book) {
        if ( updateBookRequest == null ) {
            return;
        }

        if ( updateBookRequest.getIsbn() != null ) {
            book.setIsbn( updateBookRequest.getIsbn() );
        }
        if ( updateBookRequest.getTitle() != null ) {
            book.setTitle( updateBookRequest.getTitle() );
        }
        if ( updateBookRequest.getYear() != null ) {
            book.setYear( updateBookRequest.getYear() );
        }
    }
}
