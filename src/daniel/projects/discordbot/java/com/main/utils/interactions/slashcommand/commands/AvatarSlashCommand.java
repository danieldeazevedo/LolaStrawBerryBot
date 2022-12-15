package daniel.projects.discordbot.java.com.main.utils.interactions.slashcommand.commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.awt.*;

public class AvatarSlashCommand extends ListenerAdapter {

    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent command) {


        if (command.getName().equals("avatar")) {

            try {


           var userOptionAvatar = command.getOption("user").getAsUser();
//command.getOption("user").getAsUser().getAvatarUrl()

                EmbedBuilder embed = new EmbedBuilder();

                embed.setTitle("Avatar de: " + command.getOption("user").getAsUser().getName());
                embed.setImage(userOptionAvatar.getAvatarUrl());
                embed.setColor(Color.CYAN);
                command.replyEmbeds(embed.build()).queue();

            }catch (NullPointerException error){

                var user_avatar = Member.AVATAR_URL;
                var user = command.getUser().getName();
                EmbedBuilder embed = new EmbedBuilder();
                embed.setTitle("Avatar de: " + user);
                embed.setImage(user_avatar);
                embed.setColor(Color.CYAN);

                command.replyEmbeds(embed.build()).queue();
            }

        }
    }
        }



