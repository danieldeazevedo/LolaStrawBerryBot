package daniel.projects.discordbot.java.com.main.commands;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class DataCommand extends ListenerAdapter {

    @Override
    public void onMessageReceived(MessageReceivedEvent command) {

        String[] args = command.getMessage().getContentRaw().split(" ");
        long dataDeHoje = System.currentTimeMillis() / 1000;



        if(args[0].equalsIgnoreCase("$" + "data")){


           command.getMessage().reply("a data de hoje é <t:" +dataDeHoje+ ":F>").queue();
        }



    }
}
