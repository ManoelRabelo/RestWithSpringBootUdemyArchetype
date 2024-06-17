#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.reposirories;

import org.springframework.data.jpa.repository.JpaRepository;

import ${package}.model.Book;

public interface BookRepository extends JpaRepository<Book, Long>{}
