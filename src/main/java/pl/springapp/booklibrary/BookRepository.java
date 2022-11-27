package pl.springapp.booklibrary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class BookRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Book> getAll(){
        List<Book> query = jdbcTemplate.query("SELECT id, name, rating FROM book",
                BeanPropertyRowMapper.newInstance(Book.class));
    return query;
    }

    public Book getById(int id) {
        return jdbcTemplate.queryForObject("SELECT id, name, rating FROM book WHERE " + "id = ?", BeanPropertyRowMapper.newInstance(Book.class), id );
    }

}
