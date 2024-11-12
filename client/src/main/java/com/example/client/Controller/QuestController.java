package com.example.client.Controller;



import com.example.client.Entities.Question;
import com.example.client.Entities.Response;
import com.example.client.Service.QuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quest/")
public class QuestController {
    @Autowired
    private QuestService questionService;

    @PostMapping("/addQuestion")
    public Question addQuestion(@RequestBody Question question) {
        return questionService.AddQuestion(question);
    }

    @GetMapping("/allQuestion")
    public List<Question> getAllQuestions() {
        return questionService.GetAllQuestions();
    }

    @GetMapping("/QuestionById/{id}")
    public Question getQuestion(@PathVariable("id") int id) {
        return questionService.GetQuestion(id);
    }

    @DeleteMapping("/deleteQuestion/{id}")
    public void deleteQuestion(@PathVariable("id") int id) {
        questionService.DeleteQuestion(id);
    }

    @PutMapping("/updateQuestion/{id}")
    public void updateQuestion( @RequestBody Question question) {
        questionService.UpdateQuestion(question);
    }

    @GetMapping("/getAllResponses/{id}")
    public List<Response> getAllResponses() {
        return questionService.GetAllResponses();
    }


    @GetMapping("/getResponseById/{id}")
    public Response getResponse(@PathVariable("id") int id) {
        return questionService.GetResponse(id);
    }


    @PostMapping("/addResponse")
    public Response addResponse(@RequestBody Response response) {
        return questionService.AddResponse(response);
    }


    @DeleteMapping("/deleteResponse/{id}")
    public void deleteResponse(@PathVariable("id") int id) {
        questionService.DeleteResponse(id);
    }

    @PutMapping("/updateResponse/{id}")
    public void updateResponse( @RequestBody Response response) {
        questionService.UpdateResponse(response);
    }
}
