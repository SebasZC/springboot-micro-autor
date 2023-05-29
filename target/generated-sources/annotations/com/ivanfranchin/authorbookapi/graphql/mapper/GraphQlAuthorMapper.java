package com.ivanfranchin.authorbookapi.graphql.mapper;

import com.ivanfranchin.authorbookapi.graphql.input.AuthorInput;
import com.ivanfranchin.authorbookapi.model.Author;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-29T16:29:11-0500",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 20.0.1 (Oracle Corporation)"
)
@Component
public class GraphQlAuthorMapper implements AuthorMapper {

    @Override
    public Author toAuthor(AuthorInput authorInput) {
        if ( authorInput == null ) {
            return null;
        }

        Author author = new Author();

        author.setName( authorInput.name() );

        return author;
    }

    @Override
    public void updateAuthorFromRequest(AuthorInput authorInput, Author author) {
        if ( authorInput == null ) {
            return;
        }

        if ( authorInput.name() != null ) {
            author.setName( authorInput.name() );
        }
    }
}
