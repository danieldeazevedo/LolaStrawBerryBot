package daniel.projects.discordbot.java.com.main.utils.commands;

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
                    "- Diga a ele que não posso vê-lo agora."
            + "– Chefe, quero um aumento. Saiba o senhor que tem três empresas atrás de mim.\n" +
                    "– Quais?\n" +
                    "– A de água, a de luz e a de telefone."+ "Sabe o que o melão estava fazendo de mãos dadas com o mamão perto de Copacabana?\n" +
                    "Levando o mamão papaya." +  " Quanto é o cafezinho?\n" +
                    "– 2 reais.\n" +
                    "– E o açúcar?\n" +
                    "– O açúcar a gente não cobra.\n" +
                    "– Então pode me ver 2 quilos, por favor."+"Fiquei confuso depois da aula de inglês.\n" +
                    "Se “car” significa carro e “men” significa “homens”, então minha tia Carmen é um Transformer?" + "– Me vê dois ingressos, por favor.\n" +
                    "– É para Romeu e Julieta?\n" +
                    "– Não, é para mim e para minha namorada mesmo."+"Um pai disse ao filho:\n" +
                    "– Se você tirar nota baixa na prova de amanhã, me esqueça!\n" +
                    "No dia seguinte, quando ele voltou da escola, o pai perguntou:\n" +
                    "– E aí, como foi na prova?\n" +
                    "O filho respondeu:\n" +
                    "– Quem é você?"+"O condenado à morte esperava a hora da execução, quando chegou o padre:\n" +
                    "– Meu filho, vim trazer a palavra de Deus para você.\n" +
                    "– Perda de tempo, seu padre. Daqui a pouco vou falar com Ele, pessoalmente. Algum recado?"+"Um caipira chega à casa de um amigo que estava vendo TV e pergunta:\n" +
                    "– E aí, firme?\n" +
                    "O outro responde:\n" +
                    "– Não, futebor!"+"A professora:\n" +
                    "– Quem se acha burro fique em pé.\n" +
                    "Joãozinho se levanta:\n" +
                    "– Você se acha burro, Joãozinho?\n" +
                    "– Não, mas fiquei com dó de ver a senhora em pé sozinha."+"Alô, eu gostaria de falar com o João, por favor.\n" +
                    "– É o próprio.\n" +
                    "– Oi, Próprio, tudo bom? Você pode chamar o João pra mim?"+"Assim que o bebê nasceu, começou a falar:\n" +
                    "– Vou morrer em quatro dias. Minha mãe vai morrer em seis dias. E meu pai, em 30 dias.\n" +
                    "Dito e feito: quatro dias depois, o bebê faleceu. Seis dias depois, foi a vez de sua mãe. O pai, desesperado, vendeu tudo o que tinha e gastou todo o dinheiro o mais rápido que pôde. Porém, 30 dias depois quem morreu foi o vizinho.\n" +
                    "Moral da história: jamais tome decisões precipitadas!"+"Um homem perguntou ao cobrador:\n" +
                    "– Quanto custa o ônibus?\n" +
                    "– Quatro reais.\n" +
                    "– Então manda todo mundo descer que eu compro."};


            String selecionada = piadas[new Random().nextInt(piadas.length)];

            command.getMessage().reply(selecionada).queue();


        }


    }
}
