package com.stackroute.simplebackend.models;


import lombok.*;

import javax.persistence.*;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Setter
@Getter
@Entity
public class Books {


    @Id
    @Column
    private Long id;


    @Column
    private String name;

    @Column
    private String author;

    @Column
    private String color;



}
