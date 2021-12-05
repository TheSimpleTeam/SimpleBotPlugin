package net.thesimpleteam.simplebotplugin.app.listener;

import net.thesimpleteam.simplebotplugin.annotation.EventHandler;
import net.thesimpleteam.simplebotplugin.event.MessageReceiveEvent;
import net.thesimpleteam.simplebotplugin.listener.Listener;

public class ExampleListener implements Listener {

    @EventHandler
    public void onMessageReceived(MessageReceiveEvent event) {
        event.reply("Hello World from " + event.getPlugin().getName() + " !");
    }

}
