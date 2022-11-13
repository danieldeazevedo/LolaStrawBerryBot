package daniel.projects.discordbot.java.com.main.slashcommand.commands;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class DataSlashCommand extends ListenerAdapter {
    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent command) {

        if(command.getName().equals("data")){

            long dataDeHoje = System.currentTimeMillis() /1000;

            command.reply("A data de hoje é: <t:"+ dataDeHoje +":F>").queue();
        }

    }
}
