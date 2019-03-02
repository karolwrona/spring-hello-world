package pl.edu.wszib.springhelloworld;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jas")
public class JasController {
    private static Logger logger = LoggerFactory.getLogger(JasController.class);
    @Autowired
    Ciastko1 ciastko1;

    @GetMapping
    public String zjedz() {
        if (ciastko1.isZjedzone()) {
            logger.warn("Ciastko zjedzone");
        } else {
            logger.warn("Mniam");
            ciastko1.zjedz();
        }
        return "";
    }
}
