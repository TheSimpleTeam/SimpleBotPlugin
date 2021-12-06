package net.thesimpleteam.simplebotplugin.app.listener;

import net.thesimpleteam.simplebotplugin.annotation.EventHandler;
import net.thesimpleteam.simplebotplugin.event.MessageReceiveEvent;
import net.thesimpleteam.simplebotplugin.listener.Listener;

public class ExampleListener implements Listener {

    @EventHandler
    public void onMessageReceived(MessageReceiveEvent event) {
        if(event.getMessage().startsWith("!!")) {
            String commandName = event.getMessage().substring(2);
            switch (commandName) {
                case "ping" -> event.reply("Pong from " + event.getPlugin().getName() + " !");
                case "plugin" -> event.reply("Plugin name: " + event.getPlugin().getName());
                sun.misc.Unsafe
                default -> event.reply("Unknown command " + commandName);
            }
        }
    }

}