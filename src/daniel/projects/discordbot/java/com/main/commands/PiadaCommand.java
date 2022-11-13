package daniel.projects.discordbot.java.com.main.commands;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.Random;

public class PiadaCommand extends ListenerAdapter {

    @Override
    public void onMessageReceived(MessageReceivedEvent command) {

        String[] args = command.getMessage().getContentRaw().split("  ");

        if (args[0].equalsIgnoreCase("$" + "piada")) {

            String[] piadas = {"O que o pato disse para a pata?\n" +
                    "R.: Vem Quá!", "Porque o menino estava falando ao telefone deitado?\n" +
                    "R.: Para não cair a ligação.", "A enfermeira diz ao médico:\n" +
                    "- Tem um homem invisível na sala de espera.\n" +
                    "O médico responde:\n" +
                    "- Diga a ele que não posso vê-lo agora."};

            String selecionada = piadas[new Random().nextInt(piadas.length)];

            command.getMessage().reply(selecionada).queue();


        }


    }
}
