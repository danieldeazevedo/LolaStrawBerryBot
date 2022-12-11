package daniel.projects.discordbot.java.com.main.utils.EventManager;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class BomDiaEvent extends ListenerAdapter {

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split("  ");

        if(args[0].equalsIgnoreCase("Bom dia")){

            event.getMessage().reply("Bom dia! "+ event.getAuthor().getAsMention()).queue();

        }
    }
}
