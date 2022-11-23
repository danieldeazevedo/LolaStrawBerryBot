package daniel.projects.discordbot.java.com.main.slashcommand.manage;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.time.format.DateTimeFormatter;

//sendo feito

public class SlashCommandManager extends ListenerAdapter {
        @Override
        public void onSlashCommandInteraction(SlashCommandInteractionEvent command) {

                JDA api = command.getJDA();
                TextChannel channe = api.getTextChannelById("1044743212448890940");


                // Send a private message to the user
                channe.sendMessage("o comando: " + command.getName() + " foi usado por: " + command.getUser().getAsTag() + "id do usuário: " + command.getUser().getId()+ " as " + command.getTimeCreated().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))).queue();



        }
}
