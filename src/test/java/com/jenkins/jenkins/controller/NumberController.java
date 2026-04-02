package com.jenkins.jenkins.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NumberController {

  @GetMapping("/number")
  @ResponseBody
  public String showNumber() {
    int number = 42;
    return "<html><body><h1>" + number + "</h1></body></html>";
  }
}
