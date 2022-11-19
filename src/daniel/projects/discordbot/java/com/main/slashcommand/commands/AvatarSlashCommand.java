package daniel.projects.discordbot.java.com.main.slashcommand.commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class AvatarSlashCommand extends ListenerAdapter {

    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent command) {


        if (command.getName().equals("avatar")) {

            try {




                EmbedBuilder embed = new EmbedBuilder();

                embed.setTitle("Avatar de: " + command.getOption("user").getAsUser().getName());
                embed.setImage(String.valueOf(command.getOption("user").getAsUser().getAvatarUrl()));
                command.replyEmbeds(embed.build()).queue();

            }catch (NullPointerException error){
                var user_avatar = command.getUser();

                EmbedBuilder embed = new EmbedBuilder();
                embed.setTitle("Avatar de: " + user_avatar.getName());
                embed.setImage(String.valueOf(user_avatar.getAvatarUrl()));

                command.replyEmbeds(embed.build()).queue();
            }

        }
    }
        }



