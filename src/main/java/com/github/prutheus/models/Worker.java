package com.github.prutheus.models;

import com.redis.om.spring.annotations.Indexed;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@Data
@Builder
@RedisHash(value = "model:worker")
public class Worker {
    @Id
    private String id;
    @Indexed
    private Boolean valid;
}
