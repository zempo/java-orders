package com.solomon.javaorders.services;

import com.solomon.javaorders.models.Agent;
import com.solomon.javaorders.repositories.AgentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service(value = "agentServices")
public class AgentServiceImpl implements AgentServices
{
    @Autowired
    private AgentsRepository agentsrepos;

    @Transactional
    @Override
    public Agent save(Agent agent){
        return agentsrepos.save(agent);
    }
}