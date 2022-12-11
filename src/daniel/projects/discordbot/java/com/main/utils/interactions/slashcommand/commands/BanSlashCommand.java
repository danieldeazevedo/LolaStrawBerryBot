package daniel.projects.discordbot.java.com.main.utils.interactions.slashcommand.commands;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.exceptions.HierarchyException;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.concurrent.TimeUnit;

public class BanSlashCommand extends ListenerAdapter {

    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent command) {

        if (command.getName().equals("ban")) {
            try{

            var user_ban = command.getOption("user").getAsUser();
            var ban_reason = command.getOption("reason").getAsString();
            int del_Days = command.getOption("tempo").getAsInt();

            if (!command.getMember().hasPermission(Permission.BAN_MEMBERS)) {

                command.reply("<:sad_cat5:1038811211191554068>|Você não tem permisão `BAN_MEMBERS` para exexutar esse comando").queue();

            } else {
                var bot = command.getGuild().getSelfMember();

                if (user_ban.equals(command.getUser())) {
                    command.reply("Você não pode ser auto-punir ^-^").queue();

                } else {

                    if (!bot.hasPermission(Permission.BAN_MEMBERS)) {

                        command.reply("<:sad_cat5:1038811211191554068>|Não tenho permissão para banir usuários").queue();
                    } else {


                        if (user_ban.equals(command.getGuild().getOwner())) {


                            command.reply("<:sad_cat5:1038811211191554068>|Voce não pode banir o dono do servidor").queue();
                        } else {
                            command.getGuild().ban(user_ban, del_Days, TimeUnit.DAYS)
                                    .reason(ban_reason).complete();
                            command.reply("<a:blobban:1040000939182006392>| O usuário: `" + user_ban.getName() + "` foi banido com sucesso por: " + command.getUser().getAsMention()).queue();
                        }
                        if(user_ban.equals(bot)){
                            command.reply("Não irei me banir").queue();
                        }


                            JDA api = command.getJDA();
                            User user = ((JDA) api).getUserById(command.getOption("user").getAsUser().getId()); // Acquire a reference to the User instance through the id
                            user.openPrivateChannel().queue((channel) ->
                            {
                                channel.sendMessage("<:sad_cat5:1038811211191554068>|Você foi banido pelo motivo: `" + ban_reason + "` pelo usuário: " + command.getUser().getAsTag()).queue();

                            });

                        }

                    }
                }
            }catch (HierarchyException permission){

                command.reply("Essa meu pessoa tem mais poder que eu para fazer isso").queue();
            }catch (IllegalArgumentException days){

                command.reply("você não pode banir a pessoa por mais de 7 dias").queue();
            }
        }
    }
}
