package daniel.projects.discordbot.java.com.main.utils.interactions.slashcommand.commands;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class SayCommand extends ListenerAdapter {

    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent command) {

        if(command.getName().equals("say")){

            var command_context = command.getOption("content").getAsString();
            var command_user = command.getUser().getAsMention();

            command.reply(command_context + "\n Mensagem enviada por: " + command_user).queue();
        }

    }
}
