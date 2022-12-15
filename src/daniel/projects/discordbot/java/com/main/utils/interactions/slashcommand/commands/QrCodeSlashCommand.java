package daniel.projects.discordbot.java.com.main.utils.interactions.slashcommand.commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.awt.*;

public class QrCodeSlashCommand extends ListenerAdapter {

    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent command) {

        if (command.getName().equals("qrcode")) {

            var SeachContent = command.getOption("pesquisa").getAsString();
            var url = "https://api.qrserver.com/v1/create-qr-code/?size=150x150&data=" + SeachContent;

            EmbedBuilder embed = new EmbedBuilder();
            embed.setTitle("Seu qrcode");
            embed.setImage(url);
            embed.setColor(Color.YELLOW);

            command.replyEmbeds(embed.build()).queue();

        }
    }
}
