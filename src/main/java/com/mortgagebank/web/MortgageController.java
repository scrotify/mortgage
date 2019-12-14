package com.mortgagebank.web;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The type Customer controller.
 */
@RestController
@RequestMapping("/customers")
@CrossOrigin(allowedHeaders = "*", origins = "*")
public class MortgageController {


}
