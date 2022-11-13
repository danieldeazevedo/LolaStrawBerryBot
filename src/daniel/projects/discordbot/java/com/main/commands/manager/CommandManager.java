package daniel.projects.discordbot.java.com.main.commands.manager;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

//sendo feito
public class CommandManager extends ListenerAdapter {


    @Override
    public void onMessageReceived(MessageReceivedEvent event) {

        String[] args = event.getMessage().getContentRaw().split(" ");


        var command_context = event.getMessage().getContentRaw().split(" ");
        var command = event.getMessage();




    }
}
