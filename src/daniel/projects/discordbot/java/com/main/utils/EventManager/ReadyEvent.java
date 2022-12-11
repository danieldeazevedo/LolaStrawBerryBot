package daniel.projects.discordbot.java.com.main.utils.EventManager;

import daniel.projects.discordbot.java.com.main.BotLauncher;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class ReadyEvent extends ListenerAdapter {


    @Override
    public void onReady(net.dv8tion.jda.api.events.session.ReadyEvent event) {
        System.out.println("Bot Logado com sucesso! Com ping de: " + BotLauncher.jda.getGatewayPing() + "ms");
        JDA api = event.getJDA();// Acquire a reference to the User instance through the id
        TextChannel channel = api.getTextChannelById("1038620694424076430");
        channel.sendMessage("Lola ligada com sucesso, ping: " + BotLauncher.jda.getGatewayPing() + "ms").queue();

    }
}
