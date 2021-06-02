package org.wecancoeit.reviews;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Review {
    @Id
   // @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String url;
    private String reviewCategory;
    private String favoriteSpot;
    private String descriptions;
    private String urlimg;

    public Review(Long id, String title, String url, String reviewCategory, String favoriteSpot, String descriptions, String urlimg) {
        this.id = id;
        this.title = title;
        this.url = url;
        this.reviewCategory = reviewCategory;
        this.favoriteSpot = favoriteSpot;
        this.descriptions = descriptions;
        this.urlimg = urlimg;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public String getReviewCategory() {
        return reviewCategory;
    }

    public String getFavoriteSpot() {
        return favoriteSpot;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public String getUrlimg() {
        return urlimg;
    }
}
