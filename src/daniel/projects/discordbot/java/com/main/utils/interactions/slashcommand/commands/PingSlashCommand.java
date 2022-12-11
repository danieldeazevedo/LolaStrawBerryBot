package daniel.projects.discordbot.java.com.main.utils.interactions.slashcommand.commands;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import static daniel.projects.discordbot.java.com.main.BotLauncher.jda;

public class PingSlashCommand extends ListenerAdapter {


    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent command) {

        if(command.getName().equals("ping")){

        command.reply("\uD83C\uDFD3 Pong! Meu ping é de: " + jda.getGatewayPing() + "ms").queue();

    }
}
}
