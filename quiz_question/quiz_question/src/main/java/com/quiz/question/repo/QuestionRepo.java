package com.quiz.question.repo;

import com.quiz.question.entity.Question;
import com.quiz.question.entity.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface QuestionRepo extends JpaRepository<Question,Long> {
    Set<Question> findByQuiz(Quiz quiz);
}
