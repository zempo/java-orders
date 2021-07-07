package com.solomon.javaorders.repositories;

import com.solomon.javaorders.models.Agent;
import org.springframework.data.repository.CrudRepository;

public interface AgentsRepository extends CrudRepository<Agent, Long>
{
}