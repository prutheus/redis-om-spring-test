package com.github.prutheus.services;

import com.github.prutheus.models.Worker;
import com.github.prutheus.repositories.WorkerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class WorkerService {

    private final WorkerRepository workerRepository;

    public Worker createWorker(Boolean valid) {
        return workerRepository.save(
                Worker.builder().valid(valid).build()
        );
    }

    public List<Worker> getWorkers() {
        return workerRepository.findAll();
    }

    public List<Worker> getValidWorkers() {
        return workerRepository.findAllByValidIs(Boolean.TRUE);
    }
}
