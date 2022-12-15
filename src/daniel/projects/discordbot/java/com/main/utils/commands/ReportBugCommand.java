package daniel.projects.discordbot.java.com.main.utils.commands;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.components.buttons.Button;

public class ReportBugCommand extends ListenerAdapter {


    @Override
    public void onMessageReceived(MessageReceivedEvent command) {
        String[] args = command.getMessage().getContentRaw().split(" ");

        if(args[0].equalsIgnoreCase("$"+"reportarbug")){

            command.getMessage().reply("Clique no botão abaixo e reporte o bug").addActionRow(
                    Button.danger("bugButton", "reportar bug")

            ).queue();

        }


    }
}
