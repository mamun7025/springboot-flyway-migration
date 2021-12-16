package com.mrgroup.springflyway.entity;

import lombok.Data;
import javax.persistence.*;


@Data
@Entity
@Table(name = "PRODUCT")
public class Product {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    Long id;

    String code;
    String name;
    String description;

    String upc;
    String sku;

}
