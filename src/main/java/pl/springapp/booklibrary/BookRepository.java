package pl.springapp.booklibrary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Book> getAll(){
        return jdbcTemplate.query("SELECT id, name, rating FROM book",
                BeanPropertyRowMapper.newInstance(Book.class));
    }


}
