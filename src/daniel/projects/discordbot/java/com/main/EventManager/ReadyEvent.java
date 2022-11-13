package daniel.projects.discordbot.java.com.main.EventManager;

import daniel.projects.discordbot.java.com.main.BotLauncher;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class ReadyEvent extends ListenerAdapter {


    @Override
    public void onReady(net.dv8tion.jda.api.events.session.ReadyEvent event) {
        System.out.println("Bot Logado com sucesso! Com ping de: " + BotLauncher.jda.getGatewayPing() + "ms");


    }
}
