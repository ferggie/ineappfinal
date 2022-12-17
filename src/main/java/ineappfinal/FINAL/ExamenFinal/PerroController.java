package ineappfinal.FINAL.ExamenFinal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
public class PerroController {
    @Autowired
    private RestTemplate restTemplate;
    private static String url = "https://dog.ceo/api/breeds/list/all";


    @GetMapping
    @RequestMapping("api/v1/perros/razas")
    public List<Object> getAll(){
        Object response = restTemplate.getForObject(url, Object.class);
        return Arrays.asList(response);
    }

}
