package org.wecancoeit.reviews;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ReviewRepositoryTest {

    Review review1 =new Review(1L, "Outer Banks", "https://www.outerbanks.org/", "NC Beach", "About Outer Banks", "The Outer Banks of North Carolina is a 100-mile stretch of barrier islands dotted with pristine beaches, quaint towns and historic sites", "static/images/outerbanks.png");
    Review review2 =new Review(2L, "Ocean City", "https://www.ococean.com/", "MD Beach", "About Ocean City", "Easy-going Ocean City is all about summertime family fun doing the activities Americans have enjoyed for generations: eating salt-water taffy, flying kites over sand dunes, playing putt-putt golf. Amusement parks deliver on merry-go-rounds and Skee-Ball action", "/images/Oceancity.jpg");
    Review review3 =new Review(3L, "Destin", "https://destinflorida.com/", "FL Beach", "About Destin", "Destin is located on Florida’s Emerald Coast, which gets its name from its beautiful, clear green water. Beaches here have extremely fine, soft sand, so if you’re a beach-walker or your kids enjoy building sand castles, this could be a great destination for you","/images/Destin.jpg");
    Review review4 =new Review(4L, "Myrtle", "https://www.visitmyrtlebeach.com/", "SC Beach", "About Myrtle ", "As a popular spring-break destination, golfing hub, and beloved family vacation spot—Myrtle Beach is the \"happy place\" for a range of travelers. Take in a foot-stomping show at the Carolina Opry, soak up the sunbeams on the Grand Strand's many beaches, or mingle with the fishermen of Springmaid Pier","/images/Destin.jpg");

    @Test
    public void shouldFindReviewOne(){
        //Review review1 =new Review(1L, "Outer Banks", "https://www.outerbanks.org/", "NC Beach", "About Outer Banks", "The Outer Banks of North Carolina is a 100-mile stretch of barrier islands dotted with pristine beaches, quaint towns and historic sites", "/images/destin.jpg");
        ReviewRepository underTest = new ReviewRepository(review1);
        Review foundReview = underTest.findOne(1L);
        assertEquals(review1, foundReview);
    }
}
