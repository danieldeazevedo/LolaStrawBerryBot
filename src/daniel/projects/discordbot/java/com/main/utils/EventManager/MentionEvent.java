package daniel.projects.discordbot.java.com.main.utils.EventManager;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.components.buttons.Button;

public class MentionEvent extends ListenerAdapter {

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {

        String[] args = event.getMessage().getContentRaw().split("  ");

        if(args[0].equalsIgnoreCase("<@1038486811862909101>")){


            event.getMessage().reply("Olá eu sou a lola, meu prefixo é /(slashcommands), para ver meus comandos digite /help, ou clique no botão abaixo para ver a ajuda")
                    .addActionRow(
                            Button.primary("HelpCommand", "ajuda")
                    ).queue();
        }


    }
}
