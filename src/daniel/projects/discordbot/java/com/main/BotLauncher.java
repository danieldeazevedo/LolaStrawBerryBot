package daniel.projects.discordbot.java.com.main;

import daniel.projects.discordbot.java.com.main.utils.EventManager.*;
import daniel.projects.discordbot.java.com.main.utils.ImageManager.LaranjoImageBuilderEdit;
import daniel.projects.discordbot.java.com.main.utils.ImageManager.MonicaImageBuildEdit;
import daniel.projects.discordbot.java.com.main.utils.ImageManager.StonksImageBuildEdit;
import daniel.projects.discordbot.java.com.main.utils.ImageManager.TextImageBuilderEdit;
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
        String[] messages={"Olá eu sou a Lola a bot mais fofa do discord :3","Estou disponível para uso já versão : " + bot.version,
                 };
        final int[] currentIndex = {0};
//Run this once
        new Timer().schedule(new TimerTask(){
            public void run(){
                jda.getPresence().setPresence(OnlineStatus.ONLINE, Activity.watching(messages[currentIndex[0]]));
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
        jda.upsertCommand("ping", "veja o ping da lola").queue();
        jda.upsertCommand("textimage", "Escreva algo sobre uma imagem")
                .addOption(OptionType.STRING, "texto", "Escreva o texto aqui", true).queue();
        jda.upsertCommand("data", "Veja a hora exata").queue();
        jda.upsertCommand("say", "o bot vai falar por você")
                .addOption(OptionType.STRING, "content", "Escreva o texto aqui", true).queue();
        jda.upsertCommand("laranjo", "a imagem de um laranjo")
                .addOption(OptionType.STRING, "content", "texto do laranjo", true).queue();
        jda.upsertCommand("stonks", "opa stonks!")
                .addOption(OptionType.STRING, "texto", "coloque o texto aqui", true).queue();
        jda.upsertCommand("kiss", "beije algum usuário")
                .addOption(OptionType.USER, "user", "coloque o usuário aqui", true).queue();
        jda.upsertCommand("hug", "abraçe alguém")
                .addOption(OptionType.USER, "user", "coloque o usuário aqui", true).queue();
        jda.upsertCommand("avatar", "veja o seu avatar")
                .addOption(OptionType.USER, "user", "coloca o user aqui").queue();
        jda.upsertCommand("userinfo", "veja suas informações")
                .addOption(OptionType.USER, "user", "coloca o user" ).queue();
        jda.upsertCommand("meme", "OwO veja memes aleátorios").queue();
        jda.upsertCommand("serverinfo", "veja a informação da sua guild").queue();
        jda.upsertCommand("socar", "brigue com alguem por algum motvo aleatorio")
                .addOption(OptionType.USER, "user","coloque o user aqui", true).queue();
        jda.upsertCommand("botinfo", "veja as informações da lola").queue();
        jda.upsertCommand("channelinfo", "veja a informações desse canal")
                .addOption(OptionType.CHANNEL, "canal", "coloque um canal aqui!", true).queue();
        jda.upsertCommand("ban", "Bana alguem do seu servidor")
                .addOption(OptionType.USER, "user", "coloque o user aqui", true)
                .addOption(OptionType.STRING, "reason", "coloque o motivo do banimento aqui", true)
                .addOption(OptionType.INTEGER, "tempo", "coloque o tempo em dias do banimento", true).queue();
        jda.upsertCommand("clear", "limpe as mensagens desse canal")
                .addOption(OptionType.INTEGER, "quantidade", "quantidade de mensagens que serão excluidas min.2 max.99", true).queue();
        jda.upsertCommand("kick", "expulse alguem do seu servidor")
                .addOption(OptionType.USER, "user", "coloque o user aqui", true)
                .addOption(OptionType.STRING, "reason", "coloque o motivo", true).queue();
        jda.upsertCommand("warn", "chame a ateção de alguem")
                .addOption(OptionType.USER, "user", "coloque o usuário", true)
                .addOption(OptionType.STRING, "reason", "coloque a razão do warn aqui", true).queue();
        jda.upsertCommand("help", "comando de ajuda").queue();
        jda.upsertCommand("mememonica", "coloque algo no pc da monica")
                .addOption(OptionType.STRING, "texto", "coloque o texto aqui", true).queue();
        jda.upsertCommand("piada", "deixa o bot falar piadas muito emgraçadas").queue();
        jda.upsertCommand("servericon", "veja o icone da sua guild!").queue();
        jda.upsertCommand("8ball", "pergunte algo a lola e ela responderá")
                .addOption(OptionType.STRING, "pergunta", " coloque a pergunta aqui", true).queue();
        jda.upsertCommand("pesquisar", "Pesquise algo na internet!")
                .addOption(OptionType.STRING, "pesquisa", "coloque o que você quer pesquisar aqui!", true).queue();
        jda.upsertCommand("qrcode", "transforme sua pesquisa em um qrcode")
                .addOption(OptionType.STRING, "pesquisa", "coloque o que voce quer pesquisar aqui!").queue();
        jda.upsertCommand("coinflip", "Veja se vai cair cara ou cora").queue();
        //Modal-Commands
     jda.updateCommands().addCommands(
             Commands.context(Command.Type.USER, "Avatar"),
             Commands.context(Command.Type.USER, "Informações"),
             Commands.context(Command.Type.USER, "Kiss"),
             Commands.context(Command.Type.USER, "hug"),
             Commands.context(Command.Type.USER, "socar")
     ).queue();

 }

}
