package daniel.projects.discordbot.java.com.main.utils.interactions.slashcommand.commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.awt.*;

public class ServericonSlashCommand extends ListenerAdapter {

    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent command) {


  if(command.getName().equals("servericon")){

      EmbedBuilder embed = new EmbedBuilder();
      embed.setTitle("Imagem do servidor: " + command.getGuild().getName());
      embed.setThumbnail(command.getGuild().getIconUrl());
      embed.setColor(Color.YELLOW);

      command.replyEmbeds(embed.build()).queue();

  }

    }
}
