package com.example.springbootfullstackangular.controllers;

import com.example.springbootfullstackangular.models.Bike;
import com.example.springbootfullstackangular.repository.BikeRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/bikes")
public class BikesController {
  private final BikeRepository repository;

  public BikesController(
      BikeRepository repository) {
    this.repository = repository;
  }

  @GetMapping
  public List<Bike> list(){
    return repository.findAll();
  }
  @PostMapping
  @ResponseStatus(HttpStatus.OK)
  public void create(@RequestBody Bike bike){
    repository.save(bike);
  }

  @GetMapping("/{id}")
  public Bike getBike(@PathVariable long id){
    return repository.getById(id);
  }


}
