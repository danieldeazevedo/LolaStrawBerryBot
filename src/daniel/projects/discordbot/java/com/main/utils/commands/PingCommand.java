package daniel.projects.discordbot.java.com.main.utils.commands;

import daniel.projects.discordbot.java.com.main.BotLauncher;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class PingCommand extends ListenerAdapter {

    @Override
    public void onMessageReceived(MessageReceivedEvent command) {

        String[] args = command.getMessage().getContentRaw().split(" ");

        if(args[0].equalsIgnoreCase("$" + "ping")){

            command.getMessage().reply("\uD83C\uDFD3 Pong! Meu ping é: " + BotLauncher.jda.getGatewayPing() + "ms").queue();

        }

    }
}
