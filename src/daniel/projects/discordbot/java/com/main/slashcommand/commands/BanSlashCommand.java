package daniel.projects.discordbot.java.com.main.slashcommand.commands;

import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.concurrent.TimeUnit;

public class BanSlashCommand extends ListenerAdapter {

    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent command) {

        if(command.getName().equals("ban")){

            if(!command.getMember().hasPermission(Permission.BAN_MEMBERS)){

                command.reply("<:sad_cat5:1038811211191554068>|Você não tem permisão `MANAGE_CHANNEL` para exexutar esse comando").queue();

            }


            var user_ban = command.getOption("user").getAsUser();
            var ban_reason = command.getOption("reason").getAsString();
            int del_Days = command.getOption("tempo").getAsInt();

            command.getGuild().ban(user_ban, del_Days, TimeUnit.DAYS)
                    .reason(ban_reason).complete();
            command.reply("<a:blobban:1040000939182006392>| O usuário: `" + user_ban.getName()+"` foi banido com sucesso por: " + command.getUser().getAsMention()).queue();


        }

    }
}
