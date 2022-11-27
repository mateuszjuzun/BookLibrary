package pl.springapp.booklibrary;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {


    @GetMapping("/test")
public int test() {
    return 1;
}

@GetMapping("/books")


}
