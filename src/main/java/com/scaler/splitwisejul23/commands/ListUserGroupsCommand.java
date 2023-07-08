package com.scaler.splitwisejul23.commands;

import com.scaler.splitwisejul23.controllers.UserController;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class ListUserGroupsCommand implements Command {

    private final UserController userController;

    public ListUserGroupsCommand(UserController userController) {
        this.userController = userController;
    }


    @Override
    public boolean matches(String input) {
        List<String> inpWords = Arrays.stream(input.split(" ")).toList();

        if (inpWords.size() == 2 && inpWords.get(1).equalsIgnoreCase(CommandKeywords.GROUPS)) {
            return true;
        }
        return false;
    }

    @Override
    public void execute(String input) {
        List<String> inpWords = Arrays.stream(input.split(" ")).toList();

        Long userId = Long.valueOf(inpWords.get(0));

        userController.listGroups(userId);
    }
}
