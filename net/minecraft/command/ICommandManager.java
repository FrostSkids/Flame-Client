// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.command;

import net.minecraft.util.BlockPos;
import java.util.Map;
import java.util.List;

public interface ICommandManager
{
    int executeCommand(final ICommandSender p0, final String p1);
    
    List<ICommand> getPossibleCommands(final ICommandSender p0);
    
    Map<String, ICommand> getCommands();
    
    List<String> getTabCompletionOptions(final ICommandSender p0, final String p1, final BlockPos p2);
}
