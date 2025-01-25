package com.CardioSurgeryIllustrator.CardioSurgeryIllustrator.domain.quiz.entity;

import com.CardioSurgeryIllustrator.CardioSurgeryIllustrator.domain.question.entity.QuestionEntity;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Entity(name = "Quiz")
@Table(name = "quiz")
@Data
public class QuizEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column(unique = true)
    private String title;
    @Column(nullable = false)
    private String description;
    @OneToMany(mappedBy = "quizEntity", cascade = CascadeType.REMOVE)
    @JsonManagedReference
    private List<QuestionEntity> questionEntityList;
}
