package com.stackroute.simplebackend.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Books {

    private String name;
    private String author;
    private String color;


}
