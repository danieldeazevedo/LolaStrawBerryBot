package daniel.projects.discordbot.java.com.main.slashcommand.commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.exceptions.HierarchyException;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.components.buttons.Button;

public class HelpSlashCommand extends ListenerAdapter {

    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent command) throws HierarchyException {

        if (command.getName().equals("help")) {
            EmbedBuilder embed = new EmbedBuilder();
            embed.setTitle("Central de ajuda da Lola");
            embed.setDescription("Precisa de suporte? Entre no meu servidor de suporte: https://discord.gg/gHVaDtuEBY");
            embed.addField("Veja meu comandos clicando nos butões abaixo!", "Caso tenha algum bug ou erro denuncie no meu servidor de suporte https://discord.gg/gHVaDtuEBY", true);

            command.replyEmbeds(embed.build()).addActionRow(
                    Button.primary("HelpInformationCmd", "Informações"),
                    Button.primary("HelpAdmCmd", "Moderação"),
                    Button.primary("HelpFunCmd", "Diverções"),
                    Button.primary("AdvcInfo", "Mais...")
            ).queue();


        }
    }
}
