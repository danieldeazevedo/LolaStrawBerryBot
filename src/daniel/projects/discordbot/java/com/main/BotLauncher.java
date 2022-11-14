package daniel.projects.discordbot.java.com.main;

import daniel.projects.discordbot.java.com.main.EventManager.*;
import daniel.projects.discordbot.java.com.main.ImageManager.LaranjoImageBuilderEdit;
import daniel.projects.discordbot.java.com.main.ImageManager.StonksImageBuildEdit;
import daniel.projects.discordbot.java.com.main.ImageManager.TextImageBuilderEdit;
import daniel.projects.discordbot.java.com.main.commands.*;
import daniel.projects.discordbot.java.com.main.infobot.Informations;
import daniel.projects.discordbot.java.com.main.slashcommand.commands.*;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.commands.OptionType;
import net.dv8tion.jda.api.requests.GatewayIntent;

import javax.security.auth.login.LoginException;
import java.util.EnumSet;
import java.util.Timer;
import java.util.TimerTask;

public class BotLauncher extends ListenerAdapter {
    public static JDA jda;
 public static void main(String[] args) throws LoginException{

   Informations bot = new Informations();

  jda = JDABuilder.create(bot.token,
          EnumSet.allOf(GatewayIntent.class)).build();

  //status
        String[] messages={"Olá eu sou a Lola a bot mais fofa do discord :3","Estou disponível para uso já versão : 6.9.0 alpha",
                 };
        final int[] currentIndex = {0};
//Run this once
        new Timer().schedule(new TimerTask(){
            public void run(){
                jda.getPresence().setPresence(OnlineStatus.ONLINE, Activity.watching(messages[currentIndex[0]]));
                currentIndex[0] =(currentIndex[0] +1)%messages.length;
            }},0,30_000);

        //listeners
        //main
        jda.addEventListener(new BotLauncher());
        //events
        jda.addEventListener(new ReadyEvent());
        jda.addEventListener(new ButtonClickEvent());
        jda.addEventListener(new BomDiaEvent());
        jda.addEventListener(new MentionEvent());
        jda.addEventListener(new GuildJoinEvent());
        jda.addEventListener(new GuildLeaveEvent());

        //Commands
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

        //SetSlashCommands
        jda.upsertCommand("ping", "veja o ping do bot!").queue();
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
        jda.upsertCommand("avatar", "veja o seu avatar").queue();
        jda.upsertCommand("userinfo", "veja suas informações").queue();
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
                .addOption(OptionType.INTEGER, "tempo", "coloque o tempo em dias do banimento").queue();
        jda.upsertCommand("clear", "limpe as mensagens desse canal")
                .addOption(OptionType.INTEGER, "quantidade", "quantidade de mensagens que serão excluidas min.2 max.99").queue();

    }

}
