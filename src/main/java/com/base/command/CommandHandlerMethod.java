package com.base.command;



@FunctionalInterface
public interface CommandHandlerMethod<T extends  BaseCommand> {

    void handle(T command);
}
