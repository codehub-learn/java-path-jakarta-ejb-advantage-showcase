package gr.codelearn.ejbexample.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "movie")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String duration;
    private Integer rating;
}
