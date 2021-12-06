package net.thesimpleteam.simplebotplugin.app.clicommands;

import net.thesimpleteam.simplebotplugin.commands.CLICommand;
import net.thesimpleteam.simplebotplugin.commands.CLICommandEvent;
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
    public void execute(CLICommandEvent event) {
        System.out.println("Hello World!");
    }
}
