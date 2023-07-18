package com.github.prutheus.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class WorkerServiceTest {
    @Autowired
    private WorkerService workerService;

    @Test
    public void shouldCreateWorker() {
        var worker = workerService.createWorker(Boolean.TRUE);
        assertThat(worker.getId()).isNotEmpty();
        worker = workerService.createWorker(Boolean.TRUE);
        assertThat(worker.getId()).isNotEmpty();
        worker = workerService.createWorker(Boolean.TRUE);
        assertThat(worker.getId()).isNotEmpty();
        worker = workerService.createWorker(Boolean.TRUE);
        assertThat(worker.getId()).isNotEmpty();
        worker = workerService.createWorker(Boolean.TRUE);
        assertThat(worker.getId()).isNotEmpty();
        worker = workerService.createWorker(Boolean.TRUE);
        assertThat(worker.getId()).isNotEmpty();
        worker = workerService.createWorker(Boolean.TRUE);
        assertThat(worker.getId()).isNotEmpty();
        worker = workerService.createWorker(Boolean.TRUE);
        assertThat(worker.getId()).isNotEmpty();
        worker = workerService.createWorker(Boolean.TRUE);
        assertThat(worker.getId()).isNotEmpty();
        worker = workerService.createWorker(Boolean.TRUE);
        assertThat(worker.getId()).isNotEmpty();
        worker = workerService.createWorker(Boolean.TRUE);
        assertThat(worker.getId()).isNotEmpty();
        worker = workerService.createWorker(Boolean.TRUE);
        assertThat(worker.getId()).isNotEmpty();
        worker = workerService.createWorker(Boolean.FALSE);
        assertThat(worker.getId()).isNotEmpty();
    }

    @Test
    public void shouldGetAllWorkers() {
        assertThat(workerService.getWorkers()).hasSize(13);
    }

    @Test
    public void shouldGetValidWorkers() {
        assertThat(workerService.getValidWorkers()).hasSize(12);
    }
}
