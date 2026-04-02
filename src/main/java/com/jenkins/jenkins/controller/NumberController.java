package com.jenkins.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumberController {

  @GetMapping("/number")
  @ResponseBody
  public String showNumber() {
    int number = 43;
    return "<html><body><h1>" + number + "</h1></body></html>";
  }
}
