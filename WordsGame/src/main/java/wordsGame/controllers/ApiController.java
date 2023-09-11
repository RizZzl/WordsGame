package wordsGame.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wordsGame.model.WordsAndHitsRepository;
import wordsGame.services.WordsGame;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@RequestMapping("/api")
public class ApiController {
    @Autowired
    private WordsAndHitsRepository repository;

    @Autowired
    private WordsGame wordsGame;

    public ApiController() {
        wordsGame = new WordsGame(repository);
    }

    public void setFirstHint(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstHint = wordsGame.setFirstHint();
        request.setAttribute("firstHint", firstHint);
        request.getRequestDispatcher("src/main/resources/templates/game.html").forward(request, response);
    }

    @GetMapping("/getFirstHint")
    public String getFirstHint() {
        return "game.html";
    }
}
