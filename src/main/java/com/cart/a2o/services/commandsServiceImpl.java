package com.cart.a2o.services;

import com.cart.a2o.entities.commands;
import com.cart.a2o.repositories.commandsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class commandsServiceImpl implements commandsService{
    private commandsRepository commandsRepository;
    @Override
    public commands savecommands (commands commands) {

        return commandsRepository.save(commands);
    }

    @Override
    public commands updatecommands(commands commands) {
        return commandsRepository.save(commands);

    }

    @Override
    public void deletecommandsbyId(Long id) {
        commandsRepository.deleteById(id);

    }

    @Override
    public void deleteAllcommands() {
        commandsRepository.deleteAll();


    }

    @Override
    public commands getcommandsbyId(Long id) {
        return commandsRepository.findById(id).get();
    }

    @Override
    public List<commands> getAllcommandss() {
        return commandsRepository.findAll();

    }

    @Override
    public Object getAllCommands() {
        return null;
    }
}
