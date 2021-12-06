/*
 * MIT License
 *
 * Copyright (c) 2021 minemobs
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package net.thesimpleteam.simplebotplugin.commands;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.thesimpleteam.simplebotplugin.BasePlugin;

import javax.annotation.Nonnull;

public class CommandEvent {
    private final JDA jda;
    private final String authorName;
    private final String[] args;
    private final String authorId;
    private final String channelId;
    private final String guildId;
    private final BasePlugin plugin;

    public CommandEvent(String[] args, String authorName, String authorId, String channelId, String guildId, JDA jda, BasePlugin plugin) {
        this.args = args;
        this.authorName = authorName;
        this.authorId = authorId;
        this.channelId = channelId;
        this.guildId = guildId;
        this.jda = jda;
        this.plugin = plugin;
    }

    public CommandEvent(String[] args, GuildMessageReceivedEvent event, BasePlugin plugin) {
        this.args = args;
        this.authorName = event.getAuthor().getName();
        this.authorId = event.getAuthor().getId();
        this.channelId = event.getChannel().getId();
        this.guildId = event.getGuild().getId();
        this.jda = event.getJDA();
        this.plugin = plugin;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String[] getArgs() {
        return args;
    }

    public String getAuthorId() {
        return authorId;
    }

    public String getChannelId() {
        return channelId;
    }

    public String getGuildId() {
        return guildId;
    }

    public BasePlugin getPlugin() {
        return plugin;
    }

    public void reply(@Nonnull String message) {
        jda.getTextChannelById(channelId).sendMessage(message).queue();
    }
}
