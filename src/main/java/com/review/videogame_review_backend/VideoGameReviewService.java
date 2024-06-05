package com.review.videogame_review_backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoGameReviewService {
    @Autowired
    VideoGameReviewRepository videoGameReviewRepository;

    //THIS ADDS A VIDEO GAME
    public void addVideoGame(VideoGameReview videoGameReview) {
        videoGameReviewRepository.save(videoGameReview);
    }

    //THIS GRABS ALL THE DATA
    public List<VideoGameReview> getAllVideoGames() {
        return videoGameReviewRepository.getAllVideoGames();
    }

    //THIS GRABS A RANDOM GAME
    public VideoGameReview getRandomGreeting() {
        return videoGameReviewRepository.getRandomVideoGame();
    }


}
