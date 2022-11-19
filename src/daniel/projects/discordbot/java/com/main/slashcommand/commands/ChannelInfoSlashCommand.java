package daniel.projects.discordbot.java.com.main.slashcommand.commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.awt.*;
import java.time.format.DateTimeFormatter;

public class ChannelInfoSlashCommand extends ListenerAdapter {

    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent command) {

        if(command.getName().equals("channelinfo")){

            var command_option_channel = command.getOption("canal").getAsChannel();


            EmbedBuilder embed = new EmbedBuilder();
            embed.setTitle("Informações do canal: "+ command_option_channel.getName());
            embed.addField("Menção do canal: ", command_option_channel.getAsMention(), false);
            embed.addField("ID do canal: ", command_option_channel.getId(), false);
           embed.addField("Criado em: ", String.valueOf(command_option_channel.getTimeCreated().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))), false);
           embed.setColor(Color.cyan);
            command.replyEmbeds(embed.build()).queue();


        }


    }
}
