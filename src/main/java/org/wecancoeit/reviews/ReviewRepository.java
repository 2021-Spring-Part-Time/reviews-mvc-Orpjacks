package org.wecancoeit.reviews;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


@Repository
public class ReviewRepository {
    Map<Long, Review> reviewList = new HashMap<>();

    public ReviewRepository() {
        Review review1 = new Review(1L, "Outerbanks ", "https://www.outerbanks.org/", "NC Beach", "Corrituck beach to see wild horses, Duck donat ", "Very quite beach surrounded with beautiful houses especially in Corrolla area, although I personally don't like the fact that the beach was full of crabs.", "/images/outerbanks.png");
        Review review2 = new Review(2L, "Ocean City ", "https://www.ococean.com/", "MD Beach", "Boardwalk, beach, OCM seafood restaurant, Macky's Bayside Bar & Grill", " Ocean city, MD probably the most beach we visited in the last few years, and probably the closest beach from Ohio. We enjoyed riding bikes or strolling along the board walk or shopping at the tax free outlet mall not too far from it. The last time we visited it was very crowded more than usual which we were not fan of ", "/images/Oceancity.jpg");
        Review review3 = new Review(3L, "Destin ", "https://destinflorida.com/", "FL Beach", "Along the white beach, boardwalk", "Destin is located on Florida’s Emerald Coast, which gets its name from its beautiful, clear green water. Beaches here have extremely fine. This beach is one of my favorites. The least we like was the boardwalk was very small and not too many attractions for children", "/images/Destin.jpg");
        Review review4 = new Review(4L, "Myrtle ", "https://www.visitmyrtlebeach.com/", "SC Beach", "Boardwalk, few seafood restaurant that I forgot the name  ", "We like the fact that we can find affordable nice hotels at Myrtle which are cheaper compare to  any other beach hotels.  We prefer to stay at the North area which less crowded and cleaner. We avoid lower area which more crowded with younger people. ", "/images/Myrtle.jpg");
        reviewList.put(review1.getId(), review1);
        reviewList.put(review2.getId(), review2);
        reviewList.put(review3.getId(), review3);
        reviewList.put(review4.getId(), review4);
    }

    public ReviewRepository(Review reviewToAdd) {
        reviewList.put(reviewToAdd.getId(), reviewToAdd);
    }

    public Review findOne(long id) {
        return reviewList.get(id);
    }

    public Collection<Review> getAllReview() {
        return reviewList.values();
    }


}