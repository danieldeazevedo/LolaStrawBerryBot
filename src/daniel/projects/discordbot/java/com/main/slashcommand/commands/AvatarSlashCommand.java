package daniel.projects.discordbot.java.com.main.slashcommand.commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class AvatarSlashCommand extends ListenerAdapter {

    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent command) {


        if (command.getName().equals("avatar")) {



                var user_avatar = command.getUser();
                var user_option_avatar = command.getOption("user").getAsUser();

                if (user_option_avatar == null) {

                    EmbedBuilder embed = new EmbedBuilder();
                    embed.setTitle("Avatar de: " + user_avatar.getName());
                    embed.setImage(String.valueOf(user_avatar.getAvatarUrl()));

                    command.replyEmbeds(embed.build()).queue();
                }


                EmbedBuilder embed = new EmbedBuilder();

                embed.setTitle("Avatar de: " + user_option_avatar.getName());
                embed.setImage(String.valueOf(user_option_avatar.getAvatarUrl()));
                command.replyEmbeds(embed.build()).queue();

        }

    }
}

