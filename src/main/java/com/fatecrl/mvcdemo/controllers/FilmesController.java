package com.fatecrl.mvcdemo.controllers;
import java.util.List;
import com.fatecrl.mvcdemo.models.Filme;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilmesController {

    private List<Filme> filmes = List.of(
            new Filme("Miranha 2","Homem aranha puxando saco do Stark","16/02/2016"),
            new Filme("Pelé","Precisa mesmo de descrição?? É o Rei","14/04/1820"),
            new Filme("Anonymous","Como surgiu a maior comunidade hacker do mundo","23/12/2018"),
            new Filme("Papaleguas: A Aventura continua","Agora é o papaleguas que caça o coiote","13/11/1997")
    );

    @GetMapping("/Filmes")
    private List<Filme> getfilmes(){
        return filmes;
    }

}
