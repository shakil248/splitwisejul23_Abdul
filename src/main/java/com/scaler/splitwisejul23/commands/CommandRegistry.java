package com.scaler.splitwisejul23.commands;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CommandRegistry {
    private List<Command> commands;

    @Autowired
    public CommandRegistry(RegisterUserCommand registerUserCommand, UpdateUserCommand updateUserCommand, RegisterGroupCommand registerGroupCommand, AddMemberCommand addMemberCommand, ListUserGroupsCommand listUserGroupsCommand, CreateExpenseCommand createExpenseCommand) {
        commands = new ArrayList<>();
        commands.add(registerUserCommand);
        commands.add(updateUserCommand);
        commands.add(registerGroupCommand);
        commands.add(addMemberCommand);
        commands.add(listUserGroupsCommand);
        commands.add(createExpenseCommand);
    }

    public void execute(String input) {
        for (Command command: commands) {
            if (command.matches(input)) {
                command.execute(input);
                break;
            }
        }
    }
}
