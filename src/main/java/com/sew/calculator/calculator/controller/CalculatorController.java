package com.sew.calculator.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

  @GetMapping("/sum/{a}/{b}")
  public int sum(@PathVariable int a, @PathVariable int b) {
    return a + b;
  }

}
