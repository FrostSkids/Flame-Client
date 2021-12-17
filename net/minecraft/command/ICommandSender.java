// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.command;

import net.minecraft.util.BlockPos;
import net.minecraft.entity.Entity;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public interface ICommandSender
{
    World getEntityWorld();
    
    Vec3 getPositionVector();
    
    void addChatMessage(final IChatComponent p0);
    
    boolean sendCommandFeedback();
    
    String getName();
    
    IChatComponent getDisplayName();
    
    void setCommandStat(final CommandResultStats.Type p0, final int p1);
    
    boolean canCommandSenderUseCommand(final int p0, final String p1);
    
    Entity getCommandSenderEntity();
    
    BlockPos getPosition();
}
