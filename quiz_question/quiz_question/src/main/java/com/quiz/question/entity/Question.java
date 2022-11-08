package com.quiz.question.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long quid;
    @Column(length = 5000)
    private String content;
    private String image;

    private String option1;
    private String option2;
    private String option3;
    private String option4;
    @ManyToOne(fetch = FetchType.EAGER)
    private Quiz quiz;
}
