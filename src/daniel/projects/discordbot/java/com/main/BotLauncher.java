package daniel.projects.discordbot.java.com.main;


import daniel.projects.discordbot.java.com.main.utils.EventManager.*;
import daniel.projects.discordbot.java.com.main.utils.ImageManager.*;
import daniel.projects.discordbot.java.com.main.utils.commands.*;
import daniel.projects.discordbot.java.com.main.utils.commands.manager.CommandManager;
import daniel.projects.discordbot.java.com.main.infobot.Informations;
import daniel.projects.discordbot.java.com.main.utils.interactions.ContextMenu.ContextMenuInteraction;
import daniel.projects.discordbot.java.com.main.utils.interactions.ModalInteraction.ModalInteractionEvent;
import daniel.projects.discordbot.java.com.main.utils.interactions.SelectionMenuInteraction.SelectMenuInteractionEvent;
import daniel.projects.discordbot.java.com.main.utils.interactions.slashcommand.commands.*;
import daniel.projects.discordbot.java.com.main.utils.interactions.slashcommand.manage.SlashCommandManager;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.commands.Command;
import net.dv8tion.jda.api.interactions.commands.OptionType;
import net.dv8tion.jda.api.interactions.commands.build.Commands;
import net.dv8tion.jda.api.requests.GatewayIntent;

import javax.security.auth.login.LoginException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.EnumSet;
import java.util.Timer;
import java.util.TimerTask;

public class BotLauncher extends ListenerAdapter {
    public static JDA jda;
 public static void main(String[] args) throws LoginException, SQLException, IOException {

   Informations bot = new Informations();

  jda = JDABuilder.create(bot.token,
          EnumSet.allOf(GatewayIntent.class)).build();

  //status
        String[] messages={"Olá eu sou a Lola a bot mais fofa do discord :3","Estou disponível para uso já versão : " + bot.version, "Estou em: " + jda.getGuilds().size(),
                 };
        final int[] currentIndex = {0};
//Run this once
        new Timer().schedule(new TimerTask(){
            public void run(){
                jda.getPresence().setPresence(OnlineStatus.ONLINE, Activity.playing(messages[currentIndex[0]]));
                currentIndex[0] =(currentIndex[0] +1)%messages.length;
            }},0,30_000);

        //listeners
       jda.addEventListener(new CommandManager());
       jda.addEventListener(new SlashCommandManager());
       jda.addEventListener();
        //main
        jda.addEventListener(new BotLauncher());
//SlashCommandsListeners
     jda.addEventListener(new PingSlashCommand());
     jda.addEventListener(new TextImageSlashCommand());
     jda.addEventListener(new TextImageBuilderEdit());
     jda.addEventListener(new DataSlashCommand());
     jda.addEventListener(new SayCommand());
     jda.addEventListener(new LaranjoSlashCommand());
     jda.addEventListener(new LaranjoImageBuilderEdit());
     jda.addEventListener(new HugSlashCommand());
     jda.addEventListener(new StonksSlashCommand());
     jda.addEventListener(new KissSlashCommand());
     jda.addEventListener(new StonksImageBuildEdit());
     jda.addEventListener(new UserinfoSlashCommand());
     jda.addEventListener(new SeverinfoSlashCommand());
     jda.addEventListener(new MemeSlashCommand());
     jda.addEventListener(new SocarSlashCommand());
     jda.addEventListener(new BotInfoSlashCommand());
     jda.addEventListener(new ChannelInfoSlashCommand());
     jda.addEventListener(new BanSlashCommand());
     jda.addEventListener(new ClearSlashCommand());
     jda.addEventListener(new AvatarSlashCommand());
     jda.addEventListener(new WarnSlashCommand());
     jda.addEventListener(new HelpSlashCommand());
     jda.addEventListener(new KickSlashCommand());
     jda.addEventListener(new MemeMonicaSlashCommand());
     jda.addEventListener(new MonicaImageBuildEdit());
     jda.addEventListener(new PiadaSlashCommand());
     jda.addEventListener(new BallSlashCommand());
     jda.addEventListener(new PesquisarSlashCommand());
     jda.addEventListener(new QrCodeSlashCommand());
     jda.addEventListener(new CoinflipSlashCommand());
     jda.addEventListener(new MopazSlashCommand());
     jda.addEventListener(new MopazImageBuildEdit());
     jda.addEventListener(new BrainMemeSlashCommand());
     jda.addEventListener(new FirstWordSlashCommand());
     jda.addEventListener(new BrainImageBuildEdit());
     jda.addEventListener(new FirstWordImageBuildEdit());
//prefix commandsListeners
     jda.addEventListener(new PingCommand());
     jda.addEventListener(new AvatarCommand());
     jda.addEventListener(new DataCommand());
     jda.addEventListener(new BotinfoCommand());
     jda.addEventListener(new HelpCommand());
     jda.addEventListener(new UserinfoCommand());
     jda.addEventListener(new ServerinfoCommand());
     jda.addEventListener(new PiadaCommand());
     jda.addEventListener(new ServericonCommand());
     jda.addEventListener(new MemeCommand());
     jda.addEventListener(new ClearCommand());
     jda.addEventListener(new DevInfoCommand());
     jda.addEventListener(new DadosCommand());
     jda.addEventListener(new ShutDownCommand());
     jda.addEventListener(new ReportBugCommand());
     //events
     jda.addEventListener(new ReadyEvent());
     jda.addEventListener(new ButtonClickEvent());
     jda.addEventListener(new BomDiaEvent());
     jda.addEventListener(new MentionEvent());
     jda.addEventListener(new GuildJoinEvent());
     jda.addEventListener(new GuildLeaveEvent());
     jda.addEventListener(new ModalInteractionEvent());
     jda.addEventListener(new SelectMenuInteractionEvent());
     jda.addEventListener(new ContextMenuInteraction());

        //SetSlashCommands
     jda.upsertCommand("brain-meme", "Liste as coisas mais inteligentes")
             .addOption(OptionType.STRING, "brain1", "primeiro", true)
             .addOption(OptionType.STRING, "brain2", "segundo" , true)
             .addOption(OptionType.STRING, "brain3","terceiro", true)
             .addOption(OptionType.STRING, "brain4", "quarto", true)
             .addOption(OptionType.STRING, "brain5", "quinto", true)
             .addOption(OptionType.STRING, "brain6", "sexto", true).queue();

     jda.upsertCommand("primeiras-palavras", "as primeiras palavras de um bebe")
             .addOption(OptionType.STRING , "palavras", "coloque as palavras aqui", true).queue();


        //commands
     jda.updateCommands().addCommands(
             Commands.slash("ping", "veja o ping da lola"),
             Commands.slash("textimage", "Escreva algo sobre uma imagem")
                     .addOption(OptionType.STRING, "texto", "coloque o texto aqui!")
             .addOption(OptionType.STRING, "content", "Escreva o texto aqui"),
    Commands.slash("laranjo", "a imagem de um laranjo")
            .addOption(OptionType.STRING, "content", "texto do laranjo", true),
    Commands.slash("stonks", "opa stonks!")
            .addOption(OptionType.STRING, "texto", "coloque o texto aqui", true) ,
    Commands.slash("kiss", "beije algum usuário")
            .addOption(OptionType.USER, "user", "coloque o usuário aqui", true),
    Commands.slash("hug", "abraçe alguém")
            .addOption(OptionType.USER, "user", "coloque o usuário aqui", true),
    Commands.slash("avatar", "veja o seu avatar")
            .addOption(OptionType.USER, "user", "coloca o user aqui"),
    Commands.slash("userinfo", "veja suas informações")
            .addOption(OptionType.USER, "user", "coloca o user" ),
    Commands.slash("meme", "OwO veja memes aleátorios"),
    Commands.slash("serverinfo", "veja a informação da sua guild"),
    Commands.slash("socar", "brigue com alguem por algum motvo aleatorio")
            .addOption(OptionType.USER, "user","coloque o user aqui", true),
    Commands.slash("botinfo", "veja as informações da lola"),
    Commands.slash("channelinfo", "veja a informações desse canal")
            .addOption(OptionType.CHANNEL, "canal", "coloque um canal aqui!", true),
    Commands.slash("ban", "Bana alguem do seu servidor")
            .addOption(OptionType.USER, "user", "coloque o user aqui", true)
            .addOption(OptionType.STRING, "reason", "coloque o motivo do banimento aqui", true)
            .addOption(OptionType.INTEGER, "tempo", "coloque o tempo em dias do banimento", true),
    Commands.slash("clear", "limpe as mensagens desse canal")
            .addOption(OptionType.INTEGER, "quantidade", "quantidade de mensagens que serão excluidas min.2 max.99", true),
    Commands.slash("kick", "expulse alguem do seu servidor")
            .addOption(OptionType.USER, "user", "coloque o user aqui", true)
            .addOption(OptionType.STRING, "reason", "coloque o motivo", true),
    Commands.slash("warn", "chame a ateção de alguem")
            .addOption(OptionType.USER, "user", "coloque o usuário", true)
            .addOption(OptionType.STRING, "reason", "coloque a razão do warn aqui", true),
    Commands.slash("help", "comando de ajuda"),
    Commands.slash("mememonica", "coloque algo no pc da monica")
            .addOption(OptionType.STRING, "texto", "coloque o texto aqui", true),
    Commands.slash("piada", "deixa o bot falar piadas muito emgraçadas"),
    Commands.slash("servericon", "veja o icone da sua guild!"),
    Commands.slash("8ball", "pergunte algo a lola e ela responderá")
            .addOption(OptionType.STRING, "pergunta", " coloque a pergunta aqui", true),
    Commands.slash("pesquisar", "Pesquise algo na internet!")
            .addOption(OptionType.STRING, "pesquisa", "coloque o que você quer pesquisar aqui!", true),
    Commands.slash("qrcode", "transforme sua pesquisa em um qrcode")
            .addOption(OptionType.STRING, "pesquisa", "coloque o que voce quer pesquisar aqui!"),
   Commands.slash("coinflip", "Veja se vai cair cara ou cora"),
  Commands.slash("mopaz", "mostre que você está em paz"),
             Commands.slash("data", "veja a data atual"),
             Commands.slash("say", "o bot irá falar por você"),
                   Commands.slash("brain-meme", "Liste as coisas mais inteligentes")
             .addOption(OptionType.STRING, "brain1", "primeiro", true)
             .addOption(OptionType.STRING, "brain2", "segundo", true)
             .addOption(OptionType.STRING, "brain3","terceiro", true)
             .addOption(OptionType.STRING, "brain4", "quarto", true)
             .addOption(OptionType.STRING, "brain5", "quinto",true)
             .addOption(OptionType.STRING, "brain6", "sexto", true),

             Commands.slash("primeiras-palavras", "as primeiras palavras de um bebe")
                     .addOption(OptionType.STRING , "palavras", "coloque as palavras aqui", true),


             Commands.context(Command.Type.USER, "Avatar"),
             Commands.context(Command.Type.USER, "Informações"),
             Commands.context(Command.Type.USER, "Kiss"),
             Commands.context(Command.Type.USER, "hug"),
             Commands.context(Command.Type.USER, "socar")
     ).queue();

 }

}
