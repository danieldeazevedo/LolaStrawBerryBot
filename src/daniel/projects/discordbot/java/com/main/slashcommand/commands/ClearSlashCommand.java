package daniel.projects.discordbot.java.com.main.slashcommand.commands;

import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class ClearSlashCommand extends ListenerAdapter {

    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent command) {

        if(command.getName().equals("clear")){
            if(!command.getMember().hasPermission(Permission.MANAGE_CHANNEL)){

                command.reply("<:sad_cat5:1038811211191554068>|Você não tem permisão `MANAGE_CHANNEL` para exexutar esse comando").queue();
            }

            int num = command.getOption("quantidade").getAsInt();

            if(num <= 100 && num > 1){
                num = num >= 100 ? 99 : num;

            } else if (num == 1) {

                command.reply("Você só pode deletar de 2 a 100 mensagens!").queue();
                return;

            } else  {

                command.reply("Você não pode deletar mais de 100 mensagens de uma só vez!").queue();
                return;

            }

            command.getGuildChannel().deleteMessages(command.getChannel().getHistory().retrievePast(num + 1).complete()).queue();
            command.reply("<a:verified:1038811481564794900>| "+ num + " mensagens deletadas com sucesso por: " + command.getUser().getAsMention()).queue();

        }



    }
}
