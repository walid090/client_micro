package com.example.client.Service;




import com.example.client.Entities.Question;
import com.example.client.Entities.Response;

import java.util.List;

public interface IQuestInterface {
    public Question GetQuestion(int id);
    public Question AddQuestion(Question question);
    public void DeleteQuestion(int id);
    public Question UpdateQuestion(Question question);
    public List<Question> GetAllQuestions();
    public Response GetResponse(int id);
    public List<Response> GetAllResponses();
    public Response AddResponse(Response response);
    public void DeleteResponse(int id);
    public Response UpdateResponse(Response response);

}
