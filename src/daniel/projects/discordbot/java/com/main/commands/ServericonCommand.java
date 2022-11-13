package daniel.projects.discordbot.java.com.main.commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.awt.*;

public class ServericonCommand extends ListenerAdapter {

    @Override
    public void onMessageReceived(MessageReceivedEvent command) {

        var command_action = command.getMessage();

        String [] args = command.getMessage().getContentRaw().split(" ");

        if(args[0].equalsIgnoreCase("$" + "servericon")){

            EmbedBuilder embed = new EmbedBuilder();
            embed.setTitle("Imagem do servidor: " + command.getGuild().getName());
            embed.setThumbnail(command.getGuild().getIconUrl());
            embed.setColor(Color.YELLOW);

            command_action.replyEmbeds(embed.build()).queue();

        }




    }
}
