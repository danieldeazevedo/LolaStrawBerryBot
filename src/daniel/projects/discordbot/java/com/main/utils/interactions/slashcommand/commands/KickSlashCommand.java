package daniel.projects.discordbot.java.com.main.utils.interactions.slashcommand.commands;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.exceptions.HierarchyException;
import net.dv8tion.jda.api.hooks.ListenerAdapter;


public class KickSlashCommand extends ListenerAdapter {

    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent command) {

        if (command.getName().equals("kick")) {
            try {
                var user_kick = command.getOption("user").getAsUser();
                var kick_reason = command.getOption("reason").getAsString();
                var bot = command.getGuild().getSelfMember();

                if (user_kick.equals(command.getUser())) {
                    command.reply("Você não pode se auto-punir ^-^").queue();

                } else {
                    if (!bot.hasPermission(Permission.KICK_MEMBERS)) {

                        command.reply("Não tenho permissão para banir usuários").queue();
                    } else {

                        if (!command.getMember().hasPermission(Permission.KICK_MEMBERS)) {

                            command.reply("<:tuqui:1038820935387598988>|Você não tem permisão `KICK_MEMBERS` para executar este comando").queue();
                        } else {

                            if (user_kick.equals(command.getGuild().getOwner().getUser())) {
                                command.reply("<:sad_cat5:1038811211191554068>|Você não pode banir o dono").queue();

                            } else {

                                command.getGuild().kick(user_kick, kick_reason).complete();
                                command.reply("O usuário: `" + user_kick.getName() + "` foi expulso por: " + command.getUser().getAsMention()).queue();

                                JDA api = command.getJDA();
                                User user = ((JDA) api).getUserById(user_kick.getId()); // Acquire a reference to the User instance through the id
                                user.openPrivateChannel().queue((channel) ->
                                {
                                    channel.sendMessage("<:sad_cat5:1038811211191554068>|Você foi expulso pelo motivo: `" + kick_reason + "` pelo usuário: " + command.getUser().getAsTag()).queue();

                                });
                            }
                        }

                    }
                }
            } catch (HierarchyException error){

                command.reply("Essa meu pessoa tem mais poder que eu para fazer isso").queue();
            }
        }
    }
}
