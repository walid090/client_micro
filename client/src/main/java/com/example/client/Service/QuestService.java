package com.example.client.Service;



import com.example.client.Entities.Question;
import com.example.client.Entities.Response;
import com.example.client.Repository.QuestionRepository;
import com.example.client.Repository.ResponseRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class QuestService implements IQuestInterface {
     @Autowired
     QuestionRepository questionRepository;
     ResponseRepository responseRepository;

    @Override
    public Question GetQuestion(int id) {
        return questionRepository.findById(id).get();
    }

    @Override
    public Question AddQuestion(Question question) {
        questionRepository.save(question);
        return question;
    }

    @Override
    public void DeleteQuestion(int id) {
         questionRepository.deleteById(id);
    }

    @Override
    public Question UpdateQuestion(Question question) {
        return questionRepository.save(question);
    }



    @Override
    public List<Question> GetAllQuestions() {
        List<Question> questions = new ArrayList<>();
        questionRepository.findAll().forEach(questions::add);  // Manually adding to the List
        return questions;
    }

    @Override
    public Response GetResponse(int id) {
        return responseRepository.findById(id).get();
    }

    @Override
    public List<Response> GetAllResponses() {
        List<Response> response = new ArrayList<>();
        responseRepository.findAll().forEach(response::add);  // Manually adding to the List
        return response;
    }

    @Override
    public Response AddResponse(Response response) {
        return responseRepository.save(response);
    }

    @Override
    public void DeleteResponse(int id) {
         responseRepository.deleteById(id);
    }

    @Override
    public Response UpdateResponse(Response response) {
        return responseRepository.save(response);
    }
}
