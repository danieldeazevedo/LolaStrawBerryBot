package daniel.projects.discordbot.java.com.main.utils.interactions.slashcommand.commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.emoji.Emoji;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.exceptions.HierarchyException;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.components.ItemComponent;
import net.dv8tion.jda.api.interactions.components.buttons.Button;
import net.dv8tion.jda.api.interactions.components.selections.SelectMenu;
import net.dv8tion.jda.api.interactions.components.selections.SelectOption;

import java.awt.*;
import java.util.Collection;

public class HelpSlashCommand extends ListenerAdapter {

    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent command) throws HierarchyException {

        if (command.getName().equals("help")) {
            EmbedBuilder embed = new EmbedBuilder();
            embed.setTitle("Central de ajuda da Lola");
            embed.setDescription("Precisa de suporte? Entre no meu servidor de suporte: https://discord.gg/gHVaDtuEBY");
            embed.addField("Veja meu comandos clicando nos butões abaixo!", "Caso tenha algum bug ou erro denuncie no meu servidor de suporte https://discord.gg/gHVaDtuEBY", true);
            embed.setColor(Color.MAGENTA);
            command.replyEmbeds(embed.build())
                    .addActionRow(
                            SelectMenu.create("Comandos")
                                    .addOption("Informação", "info", "Comandos de informação") // SelectOption with only the label, value, and description
                                    .addOptions(SelectOption.of("Moderação", "mod") // another way to create a SelectOption
                                            .withDescription("Comandos de moderção") // this time with a description
                                            .withEmoji(Emoji.fromUnicode("\uD83C\uDF54")) // and an emoji
                                    )
                                    .addOptions(SelectOption.of("Diversões", "fun")
                                            .withDescription("Comandos de diversão"))// while also being the default option
                                    .build())
                    .queue();


        }
    }
}
