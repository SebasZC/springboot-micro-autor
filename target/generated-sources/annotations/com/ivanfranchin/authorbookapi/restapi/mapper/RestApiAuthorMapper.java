package com.ivanfranchin.authorbookapi.restapi.mapper;

import com.ivanfranchin.authorbookapi.model.Author;
import com.ivanfranchin.authorbookapi.restapi.dto.AuthorResponse;
import com.ivanfranchin.authorbookapi.restapi.dto.CreateAuthorRequest;
import com.ivanfranchin.authorbookapi.restapi.dto.UpdateAuthorRequest;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-29T16:29:10-0500",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 20.0.1 (Oracle Corporation)"
)
@Component
public class RestApiAuthorMapper implements AuthorMapper {

    @Override
    public AuthorResponse toAuthorResponse(Author author) {
        if ( author == null ) {
            return null;
        }

        Long id = null;
        String name = null;

        id = author.getId();
        name = author.getName();

        AuthorResponse authorResponse = new AuthorResponse( id, name );

        return authorResponse;
    }

    @Override
    public Author toAuthor(CreateAuthorRequest createAuthorRequest) {
        if ( createAuthorRequest == null ) {
            return null;
        }

        Author author = new Author();

        author.setName( createAuthorRequest.getName() );

        return author;
    }

    @Override
    public void updateAuthorFromRequest(UpdateAuthorRequest updateAuthorRequest, Author author) {
        if ( updateAuthorRequest == null ) {
            return;
        }

        if ( updateAuthorRequest.getName() != null ) {
            author.setName( updateAuthorRequest.getName() );
        }
    }
}
