package com.quiz.question.service;

import com.quiz.question.entity.Question;
import com.quiz.question.entity.Quiz;

import java.util.Set;

public interface QuestionService {

    public Question addQuestion(Question question);

    Question updateQuestion(Question question);

    public Set<Question> getQuestions();

    public Question getQuestion(Long questionId);

    public void deleteQuestion(Long questionId);

    public Set<Question> getQuestionOfQuiz(Quiz quiz);
}
