package com.review.videogame_review_backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173/")
public class VideoGameReviewController {

    @Autowired
    private VideoGameReviewService videoGameReviewService;

    @PostMapping("/addvideogames")
    public ResponseEntity<VideoGameReview> addVideoGame(@RequestBody VideoGameReview videoGame) {
        videoGameReviewService.addVideoGame(videoGame);
        return ResponseEntity.status(HttpStatus.CREATED).body(videoGame);
    }

    //THIS GRABS ALL THE DATA
    @GetMapping("/videogames")
    public ResponseEntity<List<VideoGameReview>> getVideoGames() {
        return ResponseEntity.status(HttpStatus.OK).body(videoGameReviewService.getAllVideoGames());
    }

    //THIS GRABS A RANDOM GAME
    @GetMapping("/videogames/random")
    public ResponseEntity<VideoGameReview> getRandomGreeting() {
        return ResponseEntity.status(HttpStatus.OK).body(videoGameReviewService.getRandomGreeting());
    }

}
