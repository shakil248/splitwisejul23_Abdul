package com.scaler.splitwisejul23.commands;

public interface Command {

    boolean matches(String input);

    void execute(String input);
}
