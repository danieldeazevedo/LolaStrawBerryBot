package daniel.projects.discordbot.java.com.main.utils.commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.awt.*;

public class AvatarCommand extends ListenerAdapter {

    @Override
    public void onMessageReceived(MessageReceivedEvent command) {


        String[] args = command.getMessage().getContentRaw().split(" ");

        if(args[0].equalsIgnoreCase("$" + "avatar")){

            EmbedBuilder embed = new EmbedBuilder();
            embed.setTitle("Comando de avatar");
            embed.setDescription("avatar de : " + command.getAuthor().getAsMention());
            embed.setImage(command.getAuthor().getAvatarUrl());
            embed.setColor(Color.RED);

            command.getMessage().replyEmbeds(embed.build()).queue();


        }
    }
}
