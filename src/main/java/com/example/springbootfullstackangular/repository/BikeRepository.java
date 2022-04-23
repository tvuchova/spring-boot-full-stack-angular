package com.example.springbootfullstackangular.repository;

import com.example.springbootfullstackangular.models.Bike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BikeRepository extends JpaRepository<Bike,Long>{

}
