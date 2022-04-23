package com.example.springbootfullstackangular.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import javax.persistence.Access;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Bike {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "name")
  @JsonProperty("name")
  private String name;

  @JsonProperty("email")
  @Column(name = "email")
  private String email;

  @JsonProperty("phone")
  @Column(name = "phone")
  private String phone;

  @Column(name = "model")
  @JsonProperty("model")
  private String model;

  @JsonProperty("serialNumber")
  private String serialNumber;

  @JsonProperty("purchaseDate")
  private BigDecimal purchaseDate;

  @JsonProperty("contact")
  private boolean contact;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }
}
