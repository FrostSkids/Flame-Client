// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.command;

import java.util.List;
import net.minecraft.util.BlockPos;

public interface ICommand extends Comparable<ICommand>
{
    List<String> addTabCompletionOptions(final ICommandSender p0, final String[] p1, final BlockPos p2);
    
    String getCommandUsage(final ICommandSender p0);
    
    boolean canCommandSenderUseCommand(final ICommandSender p0);
    
    List<String> getCommandAliases();
    
    String getCommandName();
    
    void processCommand(final ICommandSender p0, final String[] p1) throws CommandException;
    
    boolean isUsernameIndex(final String[] p0, final int p1);
}
