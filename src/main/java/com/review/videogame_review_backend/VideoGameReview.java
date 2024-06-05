package com.review.videogame_review_backend;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class VideoGameReview {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String game_name;
    private String released;
    private String platforms;
    private String genres;
    private String created_by;
    private String reviews;

    public VideoGameReview() {

    }

    public VideoGameReview(String reviews, String created_by, String genres, String platforms, String released, String game_name, long id) {
        this.reviews = reviews;
        this.created_by = created_by;
        this.genres = genres;
        this.platforms = platforms;
        this.released = released;
        this.game_name = game_name;
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGame_name() {
        return game_name;
    }

    public void setGame_name(String game_name) {
        this.game_name = game_name;
    }

    public String getReleased() {
        return released;
    }

    public void setReleased(String released) {
        this.released = released;
    }

    public String getPlatforms() {
        return platforms;
    }

    public void setPlatforms(String platforms) {
        this.platforms = platforms;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }

    public String getReviews() {
        return reviews;
    }

    public void setReviews(String reviews) {
        this.reviews = reviews;
    }

}
