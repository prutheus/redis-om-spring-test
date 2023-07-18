package com.github.prutheus.repositories;

import com.github.prutheus.models.Worker;
import com.redis.om.spring.repository.RedisEnhancedRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WorkerRepository extends RedisEnhancedRepository<Worker, String> {

    List<Worker> findAllByValidIs(Boolean valid);
}
