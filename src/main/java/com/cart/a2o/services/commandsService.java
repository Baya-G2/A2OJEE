package com.cart.a2o.services;

import com.cart.a2o.entities.category;
import com.cart.a2o.entities.commands;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public interface commandsService {
    commands savecommands(commands commands);

    commands updatecommands(commands commands);

    void deletecommandsbyId(Long id);

    void deleteAllcommands();

    commands getcommandsbyId(Long id);

    List<commands> getAllcommandss();

    Object getAllCommands();
}
