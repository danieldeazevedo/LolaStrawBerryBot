package daniel.projects.discordbot.java.com.main.slashcommand.commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class AvatarSlashCommand extends ListenerAdapter {

    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent command) {



        if(command.getName().equals("avatar")){

            var user_avatar = command.getUser().getAvatar();

            EmbedBuilder embed = new EmbedBuilder();
            embed.setTitle("Avatar de: " + command.getUser().getAsMention());
            embed.setImage(String.valueOf(user_avatar));

            command.replyEmbeds(embed.build()).queue();
        }

    }
}
