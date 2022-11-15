package daniel.projects.discordbot.java.com.main.commands;

import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class ClearCommand extends ListenerAdapter {

    @Override
    public void onMessageReceived(MessageReceivedEvent command) {

        String[] args = command.getMessage().getContentRaw().split(" ");

        if (args[0].equalsIgnoreCase("$" + "clear")) {

            if (!command.getMember().hasPermission(Permission.MANAGE_CHANNEL)) {

                command.getMessage().reply("<:sad_cat5:1038811211191554068>|Você não tem permisão `MANAGE_CHANNEL` para exexutar esse comando").queue();
            }

            int num = Integer.parseInt(args[1]);


            if (num <= 100 && num > 1) {


                num = num >= 100 ? 99 : num;


            } else if (num == 1) {

                command.getMessage().reply("Você só pode deletar entre 2 a 99 mensagens").queue();
                return;
            } else {

                command.getMessage().reply("você não pode apagar mais de 100 mensagens de uma só vez!").queue();
                return;
            }
            command.getGuildChannel().deleteMessages(command.getChannel().getHistory().retrievePast(num + 1).complete()).queue();
            command.getMessage().reply("<a:verified:1038811481564794900>| " + num + " Mensagens deletadas com sucesso por: " + command.getMember().getAsMention()).queue();

        }
    }
}
