package daniel.projects.discordbot.java.com.main.utils.interactions.slashcommand.manage;

import daniel.projects.discordbot.java.com.main.utils.ImageManager.LaranjoImageBuilderEdit;
import daniel.projects.discordbot.java.com.main.utils.ImageManager.MonicaImageBuildEdit;
import daniel.projects.discordbot.java.com.main.utils.ImageManager.StonksImageBuildEdit;
import daniel.projects.discordbot.java.com.main.utils.ImageManager.TextImageBuilderEdit;
import daniel.projects.discordbot.java.com.main.utils.commands.PiadaCommand;
import daniel.projects.discordbot.java.com.main.utils.interactions.slashcommand.commands.*;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import static daniel.projects.discordbot.java.com.main.BotLauncher.jda;

public class SlashCommandListeners extends ListenerAdapter {

    public void SlashCommandListeners(){


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
        jda.addEventListener(new PiadaCommand());

    }
}
