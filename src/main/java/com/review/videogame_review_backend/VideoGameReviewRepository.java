package com.review.videogame_review_backend;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VideoGameReviewRepository extends JpaRepository<VideoGameReview, Long> {

    //THIS GRABS ALL THE DATA
    @Query(value="SELECT * FROM video_games.games", nativeQuery = true)
    List<VideoGameReview> getAllVideoGames();

    //THIS GRABS A RANDOM GAME
    @Query(value = "SELECT * FROM video_games.games ORDER BY RAND() LIMIT 1", nativeQuery = true)
    VideoGameReview getRandomVideoGame();

}
