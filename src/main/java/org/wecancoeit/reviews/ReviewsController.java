package org.wecancoeit.reviews;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
public class ReviewsController {

    @Resource
    private ReviewRepository reviewRepo;

    @GetMapping("/welcome")
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "!") String name, Model model) {
        model.addAttribute("name", name);
        return "welcome";

    }

    @GetMapping("/reviews")
    public String getAllReviews(Model model) {
        model.addAttribute("reviews", reviewRepo.getAllReview());
        return "all-reviews-template";
    }

    @GetMapping("/reviews/{id}")
    public String review1(Model model, @PathVariable Long id) {
     model.addAttribute("review", reviewRepo.findOne(id));
        return "outerbanks-template";
    }



}

