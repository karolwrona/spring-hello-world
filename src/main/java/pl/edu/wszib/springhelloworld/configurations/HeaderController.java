package pl.edu.wszib.springhelloworld.configurations;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/testHeader")
public class HeaderController {
    @GetMapping("/testHeader")
    public ResponseEntity test(@RequestHeader String testHeader){
        return ResponseEntity.ok(testHeader.toUpperCase());
    }
}
