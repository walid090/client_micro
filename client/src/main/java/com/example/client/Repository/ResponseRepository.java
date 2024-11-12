package com.example.client.Repository;

import com.example.client.Entities.Response;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResponseRepository extends CrudRepository<Response, Integer> {
}
