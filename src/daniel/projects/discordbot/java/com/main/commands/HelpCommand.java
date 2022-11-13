package daniel.projects.discordbot.java.com.main.commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.components.buttons.Button;

public class HelpCommand extends ListenerAdapter {


    @Override
    public void onMessageReceived(MessageReceivedEvent command) {
        String[] args = command.getMessage().getContentRaw().split(" ");

        if(args[0].equalsIgnoreCase("$"+"help")){

            EmbedBuilder embed = new EmbedBuilder();
            embed.setTitle("Central de ajuda da Lola");
            embed.setDescription("Precisa de suporte? Entre no meu servidor de suporte: https://discord.gg/gHVaDtuEBY");
            embed.addField("Veja meu comandos clicando nos butões abaixo!", "Caso tenha algum bug ou erro denuncie no meu servidor de suporte https://discord.gg/gHVaDtuEBY", true);

            command.getMessage().replyEmbeds(embed.build()).addActionRow(
                    Button.primary("HelpInformationCmd", "Informações")
            ).addActionRow( Button.primary("HelpFunCmd", "Diverções")).queue();


        }


    }
}
