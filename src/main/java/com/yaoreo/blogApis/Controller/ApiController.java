package com.yaoreo.blogApis.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
	@GetMapping("/recipe")
    public String getRecipe() {
        return "{ \"title\": \"Chocolate Chip Cookies\", \"ingredients\": [\"flour\", \"sugar\", \"chocolate chips\", \"butter\", \"eggs\"], \"instructions\": \"Mix ingredients, bake at 350°F for 12 minutes.\" }";
    }
}
