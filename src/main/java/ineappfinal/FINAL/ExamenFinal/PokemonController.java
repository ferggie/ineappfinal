package ineappfinal.FINAL.ExamenFinal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
public class PokemonController {
    @Autowired
    private RestTemplate restTemplate;

    private static String url1 = "https://pokeapi.co/api/v2/pokemon/";


    @GetMapping
    @RequestMapping("api/v1/pokemon/get-all")
    public List<Object> getAll(){
        int numero= (int) (Math.random()*(20-1)+1);
        Object response = restTemplate.getForObject(url1+numero, Object.class);

        return Arrays.asList(response);
    }
}
