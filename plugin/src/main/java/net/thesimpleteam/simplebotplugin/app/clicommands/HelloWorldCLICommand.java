package net.thesimpleteam.simplebotplugin.app.clicommands;

import net.thesimpleteam.simplebotplugin.commands.CLICommand;
import net.thesimpleteam.simplebotplugin.commands.CommandEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class HelloWorldCLICommand implements CLICommand {

    @Override
    public @NotNull String name() {
        return "helloworld";
    }

    @Override
    public @Nullable String help() {
        return null;
    }

    @Override
    public void execute(CommandEvent event) {
        System.out.println("Hello World!");
    }
}
