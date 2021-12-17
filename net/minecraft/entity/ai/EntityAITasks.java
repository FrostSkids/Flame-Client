// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.ai;

import com.google.common.collect.Lists;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.apache.logging.log4j.LogManager;
import java.util.Iterator;
import java.util.List;
import org.apache.logging.log4j.Logger;
import net.minecraft.profiler.Profiler;

public class EntityAITasks
{
    private /* synthetic */ int tickCount;
    private final /* synthetic */ Profiler theProfiler;
    private static final /* synthetic */ int[] llIIIllllIllll;
    private /* synthetic */ int tickRate;
    private static final /* synthetic */ String[] llIIIllllIllIl;
    private /* synthetic */ List<EntityAITaskEntry> taskEntries;
    private /* synthetic */ List<EntityAITaskEntry> executingTaskEntries;
    
    private static boolean lIIIlIllIIllllll(final Object llllllllllllIlllIIllllIIllllIlll, final Object llllllllllllIlllIIllllIIllllIllI) {
        return llllllllllllIlllIIllllIIllllIlll != llllllllllllIlllIIllllIIllllIllI;
    }
    
    public void onUpdateTasks() {
        this.theProfiler.startSection(EntityAITasks.llIIIllllIllIl[EntityAITasks.llIIIllllIllll[1]]);
        final int tickCount = this.tickCount;
        this.tickCount = tickCount + EntityAITasks.llIIIllllIllll[2];
        if (lIIIlIllIIlllllI(tickCount % this.tickRate)) {
            final Iterator llllllllllllIlllIIllllIlIIlIllIl = this.taskEntries.iterator();
            while (!lIIIlIllIIlllllI(llllllllllllIlllIIllllIlIIlIllIl.hasNext() ? 1 : 0)) {
                final EntityAITaskEntry llllllllllllIlllIIllllIlIIlIllII = llllllllllllIlllIIllllIlIIlIllIl.next();
                final boolean llllllllllllIlllIIllllIlIIlIlIll = this.executingTaskEntries.contains(llllllllllllIlllIIllllIlIIlIllII);
                if (lIIIlIllIIlllllI(llllllllllllIlllIIllllIlIIlIlIll ? 1 : 0)) {
                    "".length();
                    if ((52 + 16 - 36 + 115 ^ 122 + 107 - 198 + 120) <= "   ".length()) {
                        return;
                    }
                }
                else {
                    if (lIIIlIllIIllllIl(this.canUse(llllllllllllIlllIIllllIlIIlIllII) ? 1 : 0) && !lIIIlIllIIlllllI(this.canContinue(llllllllllllIlllIIllllIlIIlIllII) ? 1 : 0)) {
                        continue;
                    }
                    llllllllllllIlllIIllllIlIIlIllII.action.resetTask();
                    this.executingTaskEntries.remove(llllllllllllIlllIIllllIlIIlIllII);
                    "".length();
                }
                if (lIIIlIllIIllllIl(this.canUse(llllllllllllIlllIIllllIlIIlIllII) ? 1 : 0) && lIIIlIllIIllllIl(llllllllllllIlllIIllllIlIIlIllII.action.shouldExecute() ? 1 : 0)) {
                    llllllllllllIlllIIllllIlIIlIllII.action.startExecuting();
                    this.executingTaskEntries.add(llllllllllllIlllIIllllIlIIlIllII);
                    "".length();
                    "".length();
                    if ((139 + 115 - 246 + 154 ^ 90 + 54 - 139 + 162) == 0x0) {
                        return;
                    }
                    continue;
                }
            }
            "".length();
            if (-"   ".length() >= 0) {
                return;
            }
        }
        else {
            final Iterator<EntityAITaskEntry> llllllllllllIlllIIllllIlIIlIlIlI = this.executingTaskEntries.iterator();
            "".length();
            if (-(0x12 ^ 0x16) > 0) {
                return;
            }
            while (!lIIIlIllIIlllllI(llllllllllllIlllIIllllIlIIlIlIlI.hasNext() ? 1 : 0)) {
                final EntityAITaskEntry llllllllllllIlllIIllllIlIIlIlIIl = llllllllllllIlllIIllllIlIIlIlIlI.next();
                if (lIIIlIllIIlllllI(this.canContinue(llllllllllllIlllIIllllIlIIlIlIIl) ? 1 : 0)) {
                    llllllllllllIlllIIllllIlIIlIlIIl.action.resetTask();
                    llllllllllllIlllIIllllIlIIlIlIlI.remove();
                }
            }
        }
        this.theProfiler.endSection();
        this.theProfiler.startSection(EntityAITasks.llIIIllllIllIl[EntityAITasks.llIIIllllIllll[2]]);
        final Iterator<EntityAITaskEntry> iterator = this.executingTaskEntries.iterator();
        "".length();
        if (((0xF3 ^ 0xB8 ^ "   ".length()) & (98 + 105 - 148 + 140 ^ 48 + 11 + 27 + 53 ^ -" ".length())) != 0x0) {
            return;
        }
        while (!lIIIlIllIIlllllI(iterator.hasNext() ? 1 : 0)) {
            final EntityAITaskEntry llllllllllllIlllIIllllIlIIlIlIII = iterator.next();
            llllllllllllIlllIIllllIlIIlIlIII.action.updateTask();
        }
        this.theProfiler.endSection();
    }
    
    private static boolean lIIIlIllIIllllIl(final int llllllllllllIlllIIllllIIllllIIII) {
        return llllllllllllIlllIIllllIIllllIIII != 0;
    }
    
    static {
        lIIIlIllIIlllIlI();
        lIIIlIllIIlllIII();
        logger = LogManager.getLogger();
    }
    
    private boolean canContinue(final EntityAITaskEntry llllllllllllIlllIIllllIlIIIllllI) {
        final boolean llllllllllllIlllIIllllIlIIIlllll = llllllllllllIlllIIllllIlIIIllllI.action.continueExecuting();
        return llllllllllllIlllIIllllIlIIIlllll;
    }
    
    private boolean canUse(final EntityAITaskEntry llllllllllllIlllIIllllIlIIIlIlII) {
        final boolean llllllllllllIlllIIllllIlIIIlIIlI = (boolean)this.taskEntries.iterator();
        "".length();
        if (-(0x5B ^ 0x29 ^ (0x65 ^ 0x13)) >= 0) {
            return ((0x15 ^ 0x7B ^ (0x2E ^ 0x59)) & (0x4C ^ 0xB ^ (0x5C ^ 0x2) ^ -" ".length())) != 0x0;
        }
        while (!lIIIlIllIIlllllI(((Iterator)llllllllllllIlllIIllllIlIIIlIIlI).hasNext() ? 1 : 0)) {
            final EntityAITaskEntry llllllllllllIlllIIllllIlIIIlIllI = ((Iterator<EntityAITaskEntry>)llllllllllllIlllIIllllIlIIIlIIlI).next();
            if (lIIIlIllIIllllll(llllllllllllIlllIIllllIlIIIlIllI, llllllllllllIlllIIllllIlIIIlIlII)) {
                if (lIIIlIllIlIIIIII(llllllllllllIlllIIllllIlIIIlIlII.priority, llllllllllllIlllIIllllIlIIIlIllI.priority)) {
                    if (lIIIlIllIIlllllI(this.areTasksCompatible(llllllllllllIlllIIllllIlIIIlIlII, llllllllllllIlllIIllllIlIIIlIllI) ? 1 : 0) && lIIIlIllIIllllIl(this.executingTaskEntries.contains(llllllllllllIlllIIllllIlIIIlIllI) ? 1 : 0)) {
                        return EntityAITasks.llIIIllllIllll[1] != 0;
                    }
                    continue;
                }
                else {
                    if (lIIIlIllIIlllllI(llllllllllllIlllIIllllIlIIIlIllI.action.isInterruptible() ? 1 : 0) && lIIIlIllIIllllIl(this.executingTaskEntries.contains(llllllllllllIlllIIllllIlIIIlIllI) ? 1 : 0)) {
                        return EntityAITasks.llIIIllllIllll[1] != 0;
                    }
                    continue;
                }
            }
        }
        return EntityAITasks.llIIIllllIllll[2] != 0;
    }
    
    private boolean areTasksCompatible(final EntityAITaskEntry llllllllllllIlllIIllllIlIIIIlllI, final EntityAITaskEntry llllllllllllIlllIIllllIlIIIIlIll) {
        if (lIIIlIllIIlllllI(llllllllllllIlllIIllllIlIIIIlllI.action.getMutexBits() & llllllllllllIlllIIllllIlIIIIlIll.action.getMutexBits())) {
            return EntityAITasks.llIIIllllIllll[2] != 0;
        }
        return EntityAITasks.llIIIllllIllll[1] != 0;
    }
    
    private static void lIIIlIllIIlllIlI() {
        (llIIIllllIllll = new int[4])[0] = "   ".length();
        EntityAITasks.llIIIllllIllll[1] = ((0x32 ^ 0x8) & ~(0x89 ^ 0xB3));
        EntityAITasks.llIIIllllIllll[2] = " ".length();
        EntityAITasks.llIIIllllIllll[3] = "  ".length();
    }
    
    private static String lIIIlIllIIllIlll(final String llllllllllllIlllIIllllIlIIIIIIll, final String llllllllllllIlllIIllllIlIIIIIIlI) {
        try {
            final SecretKeySpec llllllllllllIlllIIllllIlIIIIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIllllIlIIIIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIIllllIlIIIIIlIl = Cipher.getInstance("Blowfish");
            llllllllllllIlllIIllllIlIIIIIlIl.init(EntityAITasks.llIIIllllIllll[3], llllllllllllIlllIIllllIlIIIIIllI);
            return new String(llllllllllllIlllIIllllIlIIIIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIllllIlIIIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIllllIlIIIIIlII) {
            llllllllllllIlllIIllllIlIIIIIlII.printStackTrace();
            return null;
        }
    }
    
    public void addTask(final int llllllllllllIlllIIllllIlIlIIIIll, final EntityAIBase llllllllllllIlllIIllllIlIlIIIlIl) {
        this.taskEntries.add(new EntityAITaskEntry(llllllllllllIlllIIllllIlIlIIIIll, llllllllllllIlllIIllllIlIlIIIlIl));
        "".length();
    }
    
    private static boolean lIIIlIllIIllllII(final Object llllllllllllIlllIIllllIIllllIIll, final Object llllllllllllIlllIIllllIIllllIIlI) {
        return llllllllllllIlllIIllllIIllllIIll == llllllllllllIlllIIllllIIllllIIlI;
    }
    
    public EntityAITasks(final Profiler llllllllllllIlllIIllllIlIlIIlIll) {
        this.taskEntries = (List<EntityAITaskEntry>)Lists.newArrayList();
        this.executingTaskEntries = (List<EntityAITaskEntry>)Lists.newArrayList();
        this.tickRate = EntityAITasks.llIIIllllIllll[0];
        this.theProfiler = llllllllllllIlllIIllllIlIlIIlIll;
    }
    
    public void removeTask(final EntityAIBase llllllllllllIlllIIllllIlIIlllIll) {
        final Iterator<EntityAITaskEntry> llllllllllllIlllIIllllIlIIlllIlI = this.taskEntries.iterator();
        "".length();
        if ("  ".length() < 0) {
            return;
        }
        while (!lIIIlIllIIlllllI(llllllllllllIlllIIllllIlIIlllIlI.hasNext() ? 1 : 0)) {
            final EntityAITaskEntry llllllllllllIlllIIllllIlIIlllIIl = llllllllllllIlllIIllllIlIIlllIlI.next();
            final EntityAIBase llllllllllllIlllIIllllIlIIlllIII = llllllllllllIlllIIllllIlIIlllIIl.action;
            if (lIIIlIllIIllllII(llllllllllllIlllIIllllIlIIlllIII, llllllllllllIlllIIllllIlIIlllIll)) {
                if (lIIIlIllIIllllIl(this.executingTaskEntries.contains(llllllllllllIlllIIllllIlIIlllIIl) ? 1 : 0)) {
                    llllllllllllIlllIIllllIlIIlllIII.resetTask();
                    this.executingTaskEntries.remove(llllllllllllIlllIIllllIlIIlllIIl);
                    "".length();
                }
                llllllllllllIlllIIllllIlIIlllIlI.remove();
            }
        }
    }
    
    private static boolean lIIIlIllIIlllllI(final int llllllllllllIlllIIllllIIlllIlllI) {
        return llllllllllllIlllIIllllIIlllIlllI == 0;
    }
    
    private static boolean lIIIlIllIlIIIIII(final int llllllllllllIlllIIllllIIlllllIll, final int llllllllllllIlllIIllllIIlllllIlI) {
        return llllllllllllIlllIIllllIIlllllIll >= llllllllllllIlllIIllllIIlllllIlI;
    }
    
    private static void lIIIlIllIIlllIII() {
        (llIIIllllIllIl = new String[EntityAITasks.llIIIllllIllll[3]])[EntityAITasks.llIIIllllIllll[1]] = lIIIlIllIIllIlll("UMknKVpbpdHhX6o83jYoyw==", "XNUuy");
        EntityAITasks.llIIIllllIllIl[EntityAITasks.llIIIllllIllll[2]] = lIIIlIllIIllIlll("BOW3ReyZUFhQmDrw0SdaaA==", "BVKwq");
    }
    
    class EntityAITaskEntry
    {
        public /* synthetic */ EntityAIBase action;
        public /* synthetic */ int priority;
        
        public EntityAITaskEntry(final int lllllllllllllIIllIIllIlIlllIIIII, final EntityAIBase lllllllllllllIIllIIllIlIllIllIll) {
            this.priority = lllllllllllllIIllIIllIlIlllIIIII;
            this.action = lllllllllllllIIllIIllIlIllIllIll;
        }
    }
}
