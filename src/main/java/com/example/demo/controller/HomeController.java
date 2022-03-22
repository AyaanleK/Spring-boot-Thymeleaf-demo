package com.example.demo.controller;

import com.example.demo.repository.ProductRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

  ProductRepository productRepository;

  public HomeController(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  @GetMapping("/index")
  public String index(Model model){
    model.addAttribute("products", productRepository.getAll());
    return "index";
  }


}
