package com.example.springbootfullstackangular.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Bike {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id", nullable = false)
  private Long id;

  private String name;
  private String email;
  private String phone;
  private String model;
  private String serialNumber;
  private BigDecimal purchaseDate;
  private boolean contact;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }
}
