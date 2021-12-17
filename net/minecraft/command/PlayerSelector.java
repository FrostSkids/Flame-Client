// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.command;

import java.util.Iterator;
import net.minecraft.scoreboard.Team;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.world.WorldServer;
import java.util.Arrays;
import com.google.common.collect.ComparisonChain;
import java.util.Comparator;
import net.minecraft.entity.player.EntityPlayer;
import com.google.common.collect.Sets;
import java.util.regex.Matcher;
import java.util.Collections;
import net.minecraft.world.WorldSettings;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.entity.EntityList;
import java.util.Collection;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.EntitySelectors;
import com.google.common.base.Predicates;
import com.google.common.collect.Lists;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.entity.Entity;
import com.google.common.base.Predicate;
import java.util.List;
import net.minecraft.util.MathHelper;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

public class PlayerSelector
{
    private static final /* synthetic */ Pattern intListPattern;
    private static final /* synthetic */ Pattern tokenPattern;
    private static final /* synthetic */ int[] lIlIIllllIIIll;
    private static final /* synthetic */ Set<String> WORLD_BINDING_ARGS;
    private static final /* synthetic */ String[] lIlIIllIllllll;
    private static final /* synthetic */ Pattern keyValueListPattern;
    
    public static Map<String, Integer> func_96560_a(final Map<String, String> lllllllllllllIIIlIlllIlIIIlIIIII) {
        final Map<String, Integer> lllllllllllllIIIlIlllIlIIIlIIIlI = (Map<String, Integer>)Maps.newHashMap();
        final int lllllllllllllIIIlIlllIlIIIIlllIl = (int)lllllllllllllIIIlIlllIlIIIlIIIII.keySet().iterator();
        "".length();
        if (-" ".length() > " ".length()) {
            return null;
        }
        while (!lllIlIIlllIIIIl(((Iterator)lllllllllllllIIIlIlllIlIIIIlllIl).hasNext() ? 1 : 0)) {
            final String lllllllllllllIIIlIlllIlIIIlIIIIl = ((Iterator<String>)lllllllllllllIIIlIlllIlIIIIlllIl).next();
            if (lllIlIIlllIIIII(lllllllllllllIIIlIlllIlIIIlIIIIl.startsWith(PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[69]]) ? 1 : 0) && lllIlIIlllIIlII(lllllllllllllIIIlIlllIlIIIlIIIIl.length(), PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[70]].length())) {
                lllllllllllllIIIlIlllIlIIIlIIIlI.put(lllllllllllllIIIlIlllIlIIIlIIIIl.substring(PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[71]].length()), MathHelper.parseIntWithDefault(lllllllllllllIIIlIlllIlIIIlIIIII.get(lllllllllllllIIIlIlllIlIIIlIIIIl), PlayerSelector.lIlIIllllIIIll[1]));
                "".length();
            }
        }
        return lllllllllllllIIIlIlllIlIIIlIIIlI;
    }
    
    private static <T extends Entity> List<T> filterResults(final Map<String, String> lllllllllllllIIIlIlllIlIlIllIIIl, final Class<? extends T> lllllllllllllIIIlIlllIlIlIllIIII, final List<Predicate<Entity>> lllllllllllllIIIlIlllIlIlIlIllll, final String lllllllllllllIIIlIlllIlIlIlIlllI, final World lllllllllllllIIIlIlllIlIlIIlIlll, final BlockPos lllllllllllllIIIlIlllIlIlIlIllII) {
        final List<T> lllllllllllllIIIlIlllIlIlIlIlIll = (List<T>)Lists.newArrayList();
        String lllllllllllllIIIlIlllIlIlIlIlIlI = func_179651_b(lllllllllllllIIIlIlllIlIlIllIIIl, PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[39]]);
        String substring;
        if (lllIlIIlllIIIlI(lllllllllllllIIIlIlllIlIlIlIlIlI) && lllIlIIlllIIIII(lllllllllllllIIIlIlllIlIlIlIlIlI.startsWith(PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[40]]) ? 1 : 0)) {
            substring = lllllllllllllIIIlIlllIlIlIlIlIlI.substring(PlayerSelector.lIlIIllllIIIll[1]);
            "".length();
            if (" ".length() < 0) {
                return null;
            }
        }
        else {
            substring = lllllllllllllIIIlIlllIlIlIlIlIlI;
        }
        lllllllllllllIIIlIlllIlIlIlIlIlI = substring;
        int n;
        if (lllIlIIlllIIIII(lllllllllllllIIIlIlllIlIlIlIlllI.equals(PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[41]]) ? 1 : 0)) {
            n = PlayerSelector.lIlIIllllIIIll[0];
            "".length();
            if (((0x47 ^ 0x19) & ~(0x78 ^ 0x26)) != 0x0) {
                return null;
            }
        }
        else {
            n = PlayerSelector.lIlIIllllIIIll[1];
        }
        final boolean lllllllllllllIIIlIlllIlIlIlIlIIl = n != 0;
        int n2;
        if (lllIlIIlllIIIII(lllllllllllllIIIlIlllIlIlIlIlllI.equals(PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[42]]) ? 1 : 0) && lllIlIIlllIIIlI(lllllllllllllIIIlIlllIlIlIlIlIlI)) {
            n2 = PlayerSelector.lIlIIllllIIIll[1];
            "".length();
            if ((0x5C ^ 0x58) <= 0) {
                return null;
            }
        }
        else {
            n2 = PlayerSelector.lIlIIllllIIIll[0];
        }
        final boolean lllllllllllllIIIlIlllIlIlIlIlIII = n2 != 0;
        final int lllllllllllllIIIlIlllIlIlIlIIlll = parseIntWithDefault(lllllllllllllIIIlIlllIlIlIllIIIl, PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[43]], PlayerSelector.lIlIIllllIIIll[0]);
        final int lllllllllllllIIIlIlllIlIlIlIIllI = parseIntWithDefault(lllllllllllllIIIlIlllIlIlIllIIIl, PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[44]], PlayerSelector.lIlIIllllIIIll[0]);
        final int lllllllllllllIIIlIlllIlIlIlIIlIl = parseIntWithDefault(lllllllllllllIIIlIlllIlIlIllIIIl, PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[45]], PlayerSelector.lIlIIllllIIIll[0]);
        final int lllllllllllllIIIlIlllIlIlIlIIlII = parseIntWithDefault(lllllllllllllIIIlIlllIlIlIllIIIl, PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[46]], PlayerSelector.lIlIIllllIIIll[21]);
        final Predicate<Entity> lllllllllllllIIIlIlllIlIlIlIIIll = (Predicate<Entity>)Predicates.and((Iterable)lllllllllllllIIIlIlllIlIlIlIllll);
        final Predicate<Entity> lllllllllllllIIIlIlllIlIlIlIIIlI = (Predicate<Entity>)Predicates.and((Predicate)EntitySelectors.selectAnything, (Predicate)lllllllllllllIIIlIlllIlIlIlIIIll);
        if (lllIlIIlllIIIlI(lllllllllllllIIIlIlllIlIlIlIllII)) {
            final int lllllllllllllIIIlIlllIlIlIlIIIIl = lllllllllllllIIIlIlllIlIlIIlIlll.playerEntities.size();
            final int lllllllllllllIIIlIlllIlIlIlIIIII = lllllllllllllIIIlIlllIlIlIIlIlll.loadedEntityList.size();
            int n3;
            if (lllIlIIlllIlIIl(lllllllllllllIIIlIlllIlIlIlIIIIl, lllllllllllllIIIlIlllIlIlIlIIIII / PlayerSelector.lIlIIllllIIIll[16])) {
                n3 = PlayerSelector.lIlIIllllIIIll[1];
                "".length();
                if (-"  ".length() >= 0) {
                    return null;
                }
            }
            else {
                n3 = PlayerSelector.lIlIIllllIIIll[0];
            }
            final boolean lllllllllllllIIIlIlllIlIlIIlllll = n3 != 0;
            if (lllIlIIlllIIIIl(lllllllllllllIIIlIlllIlIlIllIIIl.containsKey(PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[47]]) ? 1 : 0) && lllIlIIlllIIIIl(lllllllllllllIIIlIlllIlIlIllIIIl.containsKey(PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[48]]) ? 1 : 0) && lllIlIIlllIIIIl(lllllllllllllIIIlIlllIlIlIllIIIl.containsKey(PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[49]]) ? 1 : 0)) {
                if (lllIlIIlllIlIII(lllllllllllllIIIlIlllIlIlIlIIlII)) {
                    final AxisAlignedBB lllllllllllllIIIlIlllIlIlIIllllI = new AxisAlignedBB(lllllllllllllIIIlIlllIlIlIlIllII.getX() - lllllllllllllIIIlIlllIlIlIlIIlII, lllllllllllllIIIlIlllIlIlIlIllII.getY() - lllllllllllllIIIlIlllIlIlIlIIlII, lllllllllllllIIIlIlllIlIlIlIllII.getZ() - lllllllllllllIIIlIlllIlIlIlIIlII, lllllllllllllIIIlIlllIlIlIlIllII.getX() + lllllllllllllIIIlIlllIlIlIlIIlII + PlayerSelector.lIlIIllllIIIll[1], lllllllllllllIIIlIlllIlIlIlIllII.getY() + lllllllllllllIIIlIlllIlIlIlIIlII + PlayerSelector.lIlIIllllIIIll[1], lllllllllllllIIIlIlllIlIlIlIllII.getZ() + lllllllllllllIIIlIlllIlIlIlIIlII + PlayerSelector.lIlIIllllIIIll[1]);
                    if (lllIlIIlllIIIII(lllllllllllllIIIlIlllIlIlIlIlIIl ? 1 : 0) && lllIlIIlllIIIII(lllllllllllllIIIlIlllIlIlIIlllll ? 1 : 0) && lllIlIIlllIIIIl(lllllllllllllIIIlIlllIlIlIlIlIII ? 1 : 0)) {
                        lllllllllllllIIIlIlllIlIlIlIlIll.addAll((Collection<? extends T>)lllllllllllllIIIlIlllIlIlIIlIlll.getPlayers((Class<? extends Entity>)lllllllllllllIIIlIlllIlIlIllIIII, (com.google.common.base.Predicate<? super Entity>)lllllllllllllIIIlIlllIlIlIlIIIlI));
                        "".length();
                        "".length();
                        if (-"  ".length() > 0) {
                            return null;
                        }
                    }
                    else {
                        lllllllllllllIIIlIlllIlIlIlIlIll.addAll((Collection<? extends T>)lllllllllllllIIIlIlllIlIlIIlIlll.getEntitiesWithinAABB((Class<? extends Entity>)lllllllllllllIIIlIlllIlIlIllIIII, lllllllllllllIIIlIlllIlIlIIllllI, (com.google.common.base.Predicate<? super Entity>)lllllllllllllIIIlIlllIlIlIlIIIlI));
                        "".length();
                        "".length();
                        if (" ".length() <= 0) {
                            return null;
                        }
                    }
                }
                else if (lllIlIIlllIIIII(lllllllllllllIIIlIlllIlIlIlIlllI.equals(PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[50]]) ? 1 : 0)) {
                    lllllllllllllIIIlIlllIlIlIlIlIll.addAll((Collection<? extends T>)lllllllllllllIIIlIlllIlIlIIlIlll.getPlayers((Class<? extends Entity>)lllllllllllllIIIlIlllIlIlIllIIII, (com.google.common.base.Predicate<? super Entity>)lllllllllllllIIIlIlllIlIlIlIIIll));
                    "".length();
                    "".length();
                    if (" ".length() > (0x1F ^ 0x22 ^ (0x9 ^ 0x30))) {
                        return null;
                    }
                }
                else if (lllIlIIlllIIIIl(lllllllllllllIIIlIlllIlIlIlIlllI.equals(PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[51]]) ? 1 : 0) && (!lllIlIIlllIIIII(lllllllllllllIIIlIlllIlIlIlIlllI.equals(PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[52]]) ? 1 : 0) || lllIlIIlllIIIII(lllllllllllllIIIlIlllIlIlIlIlIII ? 1 : 0))) {
                    lllllllllllllIIIlIlllIlIlIlIlIll.addAll((Collection<? extends T>)lllllllllllllIIIlIlllIlIlIIlIlll.getEntities((Class<? extends Entity>)lllllllllllllIIIlIlllIlIlIllIIII, (com.google.common.base.Predicate<? super Entity>)lllllllllllllIIIlIlllIlIlIlIIIlI));
                    "".length();
                    "".length();
                    if ("   ".length() < "   ".length()) {
                        return null;
                    }
                }
                else {
                    lllllllllllllIIIlIlllIlIlIlIlIll.addAll((Collection<? extends T>)lllllllllllllIIIlIlllIlIlIIlIlll.getPlayers((Class<? extends Entity>)lllllllllllllIIIlIlllIlIlIllIIII, (com.google.common.base.Predicate<? super Entity>)lllllllllllllIIIlIlllIlIlIlIIIlI));
                    "".length();
                    "".length();
                    if ("  ".length() == -" ".length()) {
                        return null;
                    }
                }
            }
            else {
                final AxisAlignedBB lllllllllllllIIIlIlllIlIlIIlllIl = func_179661_a(lllllllllllllIIIlIlllIlIlIlIllII, lllllllllllllIIIlIlllIlIlIlIIlll, lllllllllllllIIIlIlllIlIlIlIIllI, lllllllllllllIIIlIlllIlIlIlIIlIl);
                if (lllIlIIlllIIIII(lllllllllllllIIIlIlllIlIlIlIlIIl ? 1 : 0) && lllIlIIlllIIIII(lllllllllllllIIIlIlllIlIlIIlllll ? 1 : 0) && lllIlIIlllIIIIl(lllllllllllllIIIlIlllIlIlIlIlIII ? 1 : 0)) {
                    final Predicate<Entity> lllllllllllllIIIlIlllIlIlIIlllII = (Predicate<Entity>)new Predicate<Entity>() {
                        private static final /* synthetic */ int[] lIllIlllIIIlll;
                        
                        private static boolean lIIIIIIIIIIlIIll(final int llllllllllllIllllllIlIIlIlIlIlII) {
                            return llllllllllllIllllllIlIIlIlIlIlII < 0;
                        }
                        
                        private static boolean lIIIIIIIIIIlIIlI(final int llllllllllllIllllllIlIIlIlIllIII) {
                            return llllllllllllIllllllIlIIlIlIllIII >= 0;
                        }
                        
                        private static int lIIIIIIIIIIlIIIl(final double n, final double n2) {
                            return dcmpg(n, n2);
                        }
                        
                        public boolean apply(final Entity llllllllllllIllllllIlIIlIllIIlIl) {
                            int n;
                            if (lIIIIIIIIIIlIIlI(lIIIIIIIIIIlIIII(llllllllllllIllllllIlIIlIllIIlIl.posX, lllllllllllllIIIlIlllIlIlIIlllIl.minX)) && lIIIIIIIIIIlIIlI(lIIIIIIIIIIlIIII(llllllllllllIllllllIlIIlIllIIlIl.posY, lllllllllllllIIIlIlllIlIlIIlllIl.minY)) && lIIIIIIIIIIlIIlI(lIIIIIIIIIIlIIII(llllllllllllIllllllIlIIlIllIIlIl.posZ, lllllllllllllIIIlIlllIlIlIIlllIl.minZ))) {
                                if (lIIIIIIIIIIlIIll(lIIIIIIIIIIlIIIl(llllllllllllIllllllIlIIlIllIIlIl.posX, lllllllllllllIIIlIlllIlIlIIlllIl.maxX)) && lIIIIIIIIIIlIIll(lIIIIIIIIIIlIIIl(llllllllllllIllllllIlIIlIllIIlIl.posY, lllllllllllllIIIlIlllIlIlIIlllIl.maxY)) && lIIIIIIIIIIlIIll(lIIIIIIIIIIlIIIl(llllllllllllIllllllIlIIlIllIIlIl.posZ, lllllllllllllIIIlIlllIlIlIIlllIl.maxZ))) {
                                    n = PlayerSelector$11.lIllIlllIIIlll[0];
                                    "".length();
                                    if ("  ".length() < 0) {
                                        return ((0x6 ^ 0x11 ^ (0xDB ^ 0xAC)) & (0x2D ^ 0x77 ^ (0xF ^ 0x35) ^ -" ".length())) != 0x0;
                                    }
                                }
                                else {
                                    n = PlayerSelector$11.lIllIlllIIIlll[1];
                                    "".length();
                                    if (null != null) {
                                        return ((0x77 ^ 0x3D) & ~(0x4A ^ 0x0)) != 0x0;
                                    }
                                }
                            }
                            else {
                                n = PlayerSelector$11.lIllIlllIIIlll[1];
                            }
                            return n != 0;
                        }
                        
                        private static int lIIIIIIIIIIlIIII(final double n, final double n2) {
                            return dcmpl(n, n2);
                        }
                        
                        private static void lIIIIIIIIIIIllll() {
                            (lIllIlllIIIlll = new int[2])[0] = " ".length();
                            PlayerSelector$11.lIllIlllIIIlll[1] = ((81 + 112 - 186 + 121 ^ 22 + 92 - 14 + 39) & (0xCC ^ 0x93 ^ (0x78 ^ 0x2C) ^ -" ".length()));
                        }
                        
                        static {
                            lIIIIIIIIIIIllll();
                        }
                    };
                    lllllllllllllIIIlIlllIlIlIlIlIll.addAll((Collection<? extends T>)lllllllllllllIIIlIlllIlIlIIlIlll.getPlayers((Class<? extends Entity>)lllllllllllllIIIlIlllIlIlIllIIII, (com.google.common.base.Predicate<? super Entity>)Predicates.and((Predicate)lllllllllllllIIIlIlllIlIlIlIIIlI, (Predicate)lllllllllllllIIIlIlllIlIlIIlllII)));
                    "".length();
                    "".length();
                    if (((0xB8 ^ 0x9F) & ~(0x57 ^ 0x70)) != 0x0) {
                        return null;
                    }
                }
                else {
                    lllllllllllllIIIlIlllIlIlIlIlIll.addAll((Collection<? extends T>)lllllllllllllIIIlIlllIlIlIIlIlll.getEntitiesWithinAABB((Class<? extends Entity>)lllllllllllllIIIlIlllIlIlIllIIII, lllllllllllllIIIlIlllIlIlIIlllIl, (com.google.common.base.Predicate<? super Entity>)lllllllllllllIIIlIlllIlIlIlIIIlI));
                    "".length();
                    "".length();
                    if (" ".length() >= (0x68 ^ 0x3 ^ (0xD8 ^ 0xB7))) {
                        return null;
                    }
                }
            }
        }
        else if (lllIlIIlllIIIII(lllllllllllllIIIlIlllIlIlIlIlllI.equals(PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[53]]) ? 1 : 0)) {
            lllllllllllllIIIlIlllIlIlIlIlIll.addAll((Collection<? extends T>)lllllllllllllIIIlIlllIlIlIIlIlll.getPlayers((Class<? extends Entity>)lllllllllllllIIIlIlllIlIlIllIIII, (com.google.common.base.Predicate<? super Entity>)lllllllllllllIIIlIlllIlIlIlIIIll));
            "".length();
            "".length();
            if (((0x8C ^ 0xBD) & ~(0x6F ^ 0x5E)) != 0x0) {
                return null;
            }
        }
        else if (lllIlIIlllIIIIl(lllllllllllllIIIlIlllIlIlIlIlllI.equals(PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[54]]) ? 1 : 0) && (!lllIlIIlllIIIII(lllllllllllllIIIlIlllIlIlIlIlllI.equals(PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[55]]) ? 1 : 0) || lllIlIIlllIIIII(lllllllllllllIIIlIlllIlIlIlIlIII ? 1 : 0))) {
            lllllllllllllIIIlIlllIlIlIlIlIll.addAll((Collection<? extends T>)lllllllllllllIIIlIlllIlIlIIlIlll.getEntities((Class<? extends Entity>)lllllllllllllIIIlIlllIlIlIllIIII, (com.google.common.base.Predicate<? super Entity>)lllllllllllllIIIlIlllIlIlIlIIIlI));
            "".length();
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        else {
            lllllllllllllIIIlIlllIlIlIlIlIll.addAll((Collection<? extends T>)lllllllllllllIIIlIlllIlIlIIlIlll.getPlayers((Class<? extends Entity>)lllllllllllllIIIlIlllIlIlIllIIII, (com.google.common.base.Predicate<? super Entity>)lllllllllllllIIIlIlllIlIlIlIIIlI));
            "".length();
        }
        return lllllllllllllIIIlIlllIlIlIlIlIll;
    }
    
    private static <T extends Entity> boolean isEntityTypeValid(final ICommandSender lllllllllllllIIIlIlllIllIlIIIIIl, final Map<String, String> lllllllllllllIIIlIlllIllIlIIIIII) {
        String lllllllllllllIIIlIlllIllIlIIIIll = func_179651_b(lllllllllllllIIIlIlllIllIlIIIIII, PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[12]]);
        String substring;
        if (lllIlIIlllIIIlI(lllllllllllllIIIlIlllIllIlIIIIll) && lllIlIIlllIIIII(lllllllllllllIIIlIlllIllIlIIIIll.startsWith(PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[13]]) ? 1 : 0)) {
            substring = lllllllllllllIIIlIlllIllIlIIIIll.substring(PlayerSelector.lIlIIllllIIIll[1]);
            "".length();
            if ((0x27 ^ 0x23) <= 0) {
                return ((0x7 ^ 0x31) & ~(0x5A ^ 0x6C)) != 0x0;
            }
        }
        else {
            substring = lllllllllllllIIIlIlllIllIlIIIIll;
        }
        lllllllllllllIIIlIlllIllIlIIIIll = substring;
        if (lllIlIIlllIIIlI(lllllllllllllIIIlIlllIllIlIIIIll) && lllIlIIlllIIIIl(EntityList.isStringValidEntityName(lllllllllllllIIIlIlllIllIlIIIIll) ? 1 : 0)) {
            final String lllllllllllllIlIIlIlllIIlIIIIIlI = PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[14]];
            final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl = new Object[PlayerSelector.lIlIIllllIIIll[1]];
            lllllllllllllIlIIlIlllIIlIIIIIIl[PlayerSelector.lIlIIllllIIIll[0]] = lllllllllllllIIIlIlllIllIlIIIIll;
            final ChatComponentTranslation lllllllllllllIIIlIlllIllIlIIIIlI = new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI, lllllllllllllIlIIlIlllIIlIIIIIIl);
            lllllllllllllIIIlIlllIllIlIIIIlI.getChatStyle().setColor(EnumChatFormatting.RED);
            "".length();
            lllllllllllllIIIlIlllIllIlIIIIIl.addChatMessage(lllllllllllllIIIlIlllIllIlIIIIlI);
            return PlayerSelector.lIlIIllllIIIll[0] != 0;
        }
        return PlayerSelector.lIlIIllllIIIll[1] != 0;
    }
    
    private static List<Predicate<Entity>> func_179657_e(final Map<String, String> lllllllllllllIIIlIlllIlIlllllIll) {
        final List<Predicate<Entity>> lllllllllllllIIIlIlllIlIllllllIl = (List<Predicate<Entity>>)Lists.newArrayList();
        final Map<String, Integer> lllllllllllllIIIlIlllIlIllllllII = func_96560_a(lllllllllllllIIIlIlllIlIlllllIll);
        if (lllIlIIlllIIIlI(lllllllllllllIIIlIlllIlIllllllII) && lllIlIIlllIIllI(lllllllllllllIIIlIlllIlIllllllII.size())) {
            lllllllllllllIIIlIlllIlIllllllIl.add((Predicate<Entity>)new Predicate<Entity>() {
                private static final /* synthetic */ String[] lIllllIlIlIlII;
                private static final /* synthetic */ int[] lIllllIlIlIlIl;
                
                public boolean apply(final Entity llllllllllllIllllIlIIlIllIllIlII) {
                    final Scoreboard llllllllllllIllllIlIIlIllIllllIl = MinecraftServer.getServer().worldServerForDimension(PlayerSelector$6.lIllllIlIlIlIl[0]).getScoreboard();
                    final long llllllllllllIllllIlIIlIllIllIIIl = (long)lllllllllllllIIIlIlllIlIllllllII.entrySet().iterator();
                    "".length();
                    if (((0x5C ^ 0x1C) & ~(0x23 ^ 0x63)) != 0x0) {
                        return ((0x7A ^ 0x31) & ~(0xE4 ^ 0xAF)) != 0x0;
                    }
                    while (!lIIIIlIIlIIIlIlI(((Iterator)llllllllllllIllllIlIIlIllIllIIIl).hasNext() ? 1 : 0)) {
                        final Map.Entry<String, Integer> llllllllllllIllllIlIIlIllIllllII = ((Iterator<Map.Entry<String, Integer>>)llllllllllllIllllIlIIlIllIllIIIl).next();
                        String llllllllllllIllllIlIIlIllIlllIll = llllllllllllIllllIlIIlIllIllllII.getKey();
                        boolean llllllllllllIllllIlIIlIllIlllIlI = PlayerSelector$6.lIllllIlIlIlIl[0] != 0;
                        if (lIIIIlIIlIIIIlll(llllllllllllIllllIlIIlIllIlllIll.endsWith(PlayerSelector$6.lIllllIlIlIlII[PlayerSelector$6.lIllllIlIlIlIl[0]]) ? 1 : 0) && lIIIIlIIlIIIlIII(llllllllllllIllllIlIIlIllIlllIll.length(), PlayerSelector$6.lIllllIlIlIlIl[1])) {
                            llllllllllllIllllIlIIlIllIlllIlI = (PlayerSelector$6.lIllllIlIlIlIl[2] != 0);
                            llllllllllllIllllIlIIlIllIlllIll = llllllllllllIllllIlIIlIllIlllIll.substring(PlayerSelector$6.lIllllIlIlIlIl[0], llllllllllllIllllIlIIlIllIlllIll.length() - PlayerSelector$6.lIllllIlIlIlIl[1]);
                        }
                        final ScoreObjective llllllllllllIllllIlIIlIllIlllIIl = llllllllllllIllllIlIIlIllIllllIl.getObjective(llllllllllllIllllIlIIlIllIlllIll);
                        if (lIIIIlIIlIIIlIIl(llllllllllllIllllIlIIlIllIlllIIl)) {
                            return PlayerSelector$6.lIllllIlIlIlIl[0] != 0;
                        }
                        String s;
                        if (lIIIIlIIlIIIIlll((llllllllllllIllllIlIIlIllIllIlII instanceof EntityPlayerMP) ? 1 : 0)) {
                            s = llllllllllllIllllIlIIlIllIllIlII.getName();
                            "".length();
                            if (-(0x49 ^ 0x43 ^ (0x11 ^ 0x1F)) >= 0) {
                                return ((0x2E ^ 0x64 ^ (0x19 ^ 0x2)) & (216 + 90 - 86 + 2 ^ 41 + 111 - 84 + 75 ^ -" ".length())) != 0x0;
                            }
                        }
                        else {
                            s = llllllllllllIllllIlIIlIllIllIlII.getUniqueID().toString();
                        }
                        final String llllllllllllIllllIlIIlIllIlllIII = s;
                        if (lIIIIlIIlIIIlIlI(llllllllllllIllllIlIIlIllIllllIl.entityHasObjective(llllllllllllIllllIlIIlIllIlllIII, llllllllllllIllllIlIIlIllIlllIIl) ? 1 : 0)) {
                            return PlayerSelector$6.lIllllIlIlIlIl[0] != 0;
                        }
                        final Score llllllllllllIllllIlIIlIllIllIlll = llllllllllllIllllIlIIlIllIllllIl.getValueFromObjective(llllllllllllIllllIlIIlIllIlllIII, llllllllllllIllllIlIIlIllIlllIIl);
                        final int llllllllllllIllllIlIIlIllIllIllI = llllllllllllIllllIlIIlIllIllIlll.getScorePoints();
                        if (lIIIIlIIlIIIlIll(llllllllllllIllllIlIIlIllIllIllI, llllllllllllIllllIlIIlIllIllllII.getValue()) && lIIIIlIIlIIIIlll(llllllllllllIllllIlIIlIllIlllIlI ? 1 : 0)) {
                            return PlayerSelector$6.lIllllIlIlIlIl[0] != 0;
                        }
                        if (lIIIIlIIlIIIlIII(llllllllllllIllllIlIIlIllIllIllI, llllllllllllIllllIlIIlIllIllllII.getValue()) && lIIIIlIIlIIIlIlI(llllllllllllIllllIlIIlIllIlllIlI ? 1 : 0)) {
                            return PlayerSelector$6.lIllllIlIlIlIl[0] != 0;
                        }
                    }
                    return PlayerSelector$6.lIllllIlIlIlIl[2] != 0;
                }
                
                private static boolean lIIIIlIIlIIIlIll(final int llllllllllllIllllIlIIlIllIIlIlll, final int llllllllllllIllllIlIIlIllIIlIllI) {
                    return llllllllllllIllllIlIIlIllIIlIlll < llllllllllllIllllIlIIlIllIIlIllI;
                }
                
                static {
                    lIIIIlIIlIIIIllI();
                    lIIIIlIIlIIIIlIl();
                }
                
                private static boolean lIIIIlIIlIIIlIlI(final int llllllllllllIllllIlIIlIllIIIllII) {
                    return llllllllllllIllllIlIIlIllIIIllII == 0;
                }
                
                private static String lIIIIlIIlIIIIIlI(final String llllllllllllIllllIlIIlIllIIlllIl, final String llllllllllllIllllIlIIlIllIIlllII) {
                    try {
                        final SecretKeySpec llllllllllllIllllIlIIlIllIlIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIlIIlIllIIlllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                        final Cipher llllllllllllIllllIlIIlIllIlIIIIl = Cipher.getInstance("Blowfish");
                        llllllllllllIllllIlIIlIllIlIIIIl.init(PlayerSelector$6.lIllllIlIlIlIl[3], llllllllllllIllllIlIIlIllIlIIIlI);
                        return new String(llllllllllllIllllIlIIlIllIlIIIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllllIlIIlIllIIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                    }
                    catch (Exception llllllllllllIllllIlIIlIllIlIIIII) {
                        llllllllllllIllllIlIIlIllIlIIIII.printStackTrace();
                        return null;
                    }
                }
                
                private static boolean lIIIIlIIlIIIlIIl(final Object llllllllllllIllllIlIIlIllIIlIIII) {
                    return llllllllllllIllllIlIIlIllIIlIIII == null;
                }
                
                private static void lIIIIlIIlIIIIlIl() {
                    (lIllllIlIlIlII = new String[PlayerSelector$6.lIllllIlIlIlIl[2]])[PlayerSelector$6.lIllllIlIlIlIl[0]] = lIIIIlIIlIIIIIlI("kIk/+yQH/2Q=", "WhSQN");
                }
                
                private static boolean lIIIIlIIlIIIIlll(final int llllllllllllIllllIlIIlIllIIIlllI) {
                    return llllllllllllIllllIlIIlIllIIIlllI != 0;
                }
                
                private static boolean lIIIIlIIlIIIlIII(final int llllllllllllIllllIlIIlIllIIlIIll, final int llllllllllllIllllIlIIlIllIIlIIlI) {
                    return llllllllllllIllllIlIIlIllIIlIIll > llllllllllllIllllIlIIlIllIIlIIlI;
                }
                
                private static void lIIIIlIIlIIIIllI() {
                    (lIllllIlIlIlIl = new int[4])[0] = ((73 + 90 - 105 + 102 ^ 60 + 54 - 59 + 79) & (86 + 113 - 84 + 63 ^ 127 + 35 - 102 + 88 ^ -" ".length()));
                    PlayerSelector$6.lIllllIlIlIlIl[1] = (0x6C ^ 0x68);
                    PlayerSelector$6.lIllllIlIlIlIl[2] = " ".length();
                    PlayerSelector$6.lIllllIlIlIlIl[3] = "  ".length();
                }
            });
            "".length();
        }
        return lllllllllllllIIIlIlllIlIllllllIl;
    }
    
    private static AxisAlignedBB func_179661_a(final BlockPos lllllllllllllIIIlIlllIlIIlIlIlII, final int lllllllllllllIIIlIlllIlIIlIlIIll, final int lllllllllllllIIIlIlllIlIIlIlllll, final int lllllllllllllIIIlIlllIlIIlIllllI) {
        int n;
        if (lllIlIIlllIIlll(lllllllllllllIIIlIlllIlIIlIlIIll)) {
            n = PlayerSelector.lIlIIllllIIIll[1];
            "".length();
            if (((0xF ^ 0x3A) & ~(0x76 ^ 0x43)) > ((0x5F ^ 0x15) & ~(0x13 ^ 0x59))) {
                return null;
            }
        }
        else {
            n = PlayerSelector.lIlIIllllIIIll[0];
        }
        final boolean lllllllllllllIIIlIlllIlIIlIlllIl = n != 0;
        int n2;
        if (lllIlIIlllIIlll(lllllllllllllIIIlIlllIlIIlIlllll)) {
            n2 = PlayerSelector.lIlIIllllIIIll[1];
            "".length();
            if ("  ".length() == -" ".length()) {
                return null;
            }
        }
        else {
            n2 = PlayerSelector.lIlIIllllIIIll[0];
        }
        final boolean lllllllllllllIIIlIlllIlIIlIlllII = n2 != 0;
        int n3;
        if (lllIlIIlllIIlll(lllllllllllllIIIlIlllIlIIlIllllI)) {
            n3 = PlayerSelector.lIlIIllllIIIll[1];
            "".length();
            if ((103 + 31 + 15 + 26 ^ 149 + 85 - 72 + 8) == 0x0) {
                return null;
            }
        }
        else {
            n3 = PlayerSelector.lIlIIllllIIIll[0];
        }
        final boolean lllllllllllllIIIlIlllIlIIlIllIll = n3 != 0;
        final int x = lllllllllllllIIIlIlllIlIIlIlIlII.getX();
        int n4;
        if (lllIlIIlllIIIII(lllllllllllllIIIlIlllIlIIlIlllIl ? 1 : 0)) {
            n4 = lllllllllllllIIIlIlllIlIIlIlIIll;
            "".length();
            if ("   ".length() == 0) {
                return null;
            }
        }
        else {
            n4 = PlayerSelector.lIlIIllllIIIll[0];
        }
        final int lllllllllllllIIIlIlllIlIIlIllIlI = x + n4;
        final int y = lllllllllllllIIIlIlllIlIIlIlIlII.getY();
        int n5;
        if (lllIlIIlllIIIII(lllllllllllllIIIlIlllIlIIlIlllII ? 1 : 0)) {
            n5 = lllllllllllllIIIlIlllIlIIlIlllll;
            "".length();
            if ("   ".length() == "  ".length()) {
                return null;
            }
        }
        else {
            n5 = PlayerSelector.lIlIIllllIIIll[0];
        }
        final int lllllllllllllIIIlIlllIlIIlIllIIl = y + n5;
        final int z = lllllllllllllIIIlIlllIlIIlIlIlII.getZ();
        int n6;
        if (lllIlIIlllIIIII(lllllllllllllIIIlIlllIlIIlIllIll ? 1 : 0)) {
            n6 = lllllllllllllIIIlIlllIlIIlIllllI;
            "".length();
            if (((0xEA ^ 0x98 ^ (0x74 ^ 0x57)) & (0xE1 ^ 0x84 ^ (0x52 ^ 0x66) ^ -" ".length())) > 0) {
                return null;
            }
        }
        else {
            n6 = PlayerSelector.lIlIIllllIIIll[0];
        }
        final int lllllllllllllIIIlIlllIlIIlIllIII = z + n6;
        final int x2 = lllllllllllllIIIlIlllIlIIlIlIlII.getX();
        int n7;
        if (lllIlIIlllIIIII(lllllllllllllIIIlIlllIlIIlIlllIl ? 1 : 0)) {
            n7 = PlayerSelector.lIlIIllllIIIll[0];
            "".length();
            if ((0xA0 ^ 0xA4) <= 0) {
                return null;
            }
        }
        else {
            n7 = lllllllllllllIIIlIlllIlIIlIlIIll;
        }
        final int lllllllllllllIIIlIlllIlIIlIlIlll = x2 + n7 + PlayerSelector.lIlIIllllIIIll[1];
        final int y2 = lllllllllllllIIIlIlllIlIIlIlIlII.getY();
        int n8;
        if (lllIlIIlllIIIII(lllllllllllllIIIlIlllIlIIlIlllII ? 1 : 0)) {
            n8 = PlayerSelector.lIlIIllllIIIll[0];
            "".length();
            if ("   ".length() != "   ".length()) {
                return null;
            }
        }
        else {
            n8 = lllllllllllllIIIlIlllIlIIlIlllll;
        }
        final int lllllllllllllIIIlIlllIlIIlIlIllI = y2 + n8 + PlayerSelector.lIlIIllllIIIll[1];
        final int z2 = lllllllllllllIIIlIlllIlIIlIlIlII.getZ();
        int n9;
        if (lllIlIIlllIIIII(lllllllllllllIIIlIlllIlIIlIllIll ? 1 : 0)) {
            n9 = PlayerSelector.lIlIIllllIIIll[0];
            "".length();
            if (-"  ".length() > 0) {
                return null;
            }
        }
        else {
            n9 = lllllllllllllIIIlIlllIlIIlIllllI;
        }
        final int lllllllllllllIIIlIlllIlIIlIlIlIl = z2 + n9 + PlayerSelector.lIlIIllllIIIll[1];
        return new AxisAlignedBB(lllllllllllllIIIlIlllIlIIlIllIlI, lllllllllllllIIIlIlllIlIIlIllIIl, lllllllllllllIIIlIlllIlIIlIllIII, lllllllllllllIIIlIlllIlIIlIlIlll, lllllllllllllIIIlIlllIlIIlIlIllI, lllllllllllllIIIlIlllIlIIlIlIlIl);
    }
    
    private static List<Predicate<Entity>> func_179649_c(final Map<String, String> lllllllllllllIIIlIlllIllIIIlIllI) {
        final List<Predicate<Entity>> lllllllllllllIIIlIlllIllIIIlIlIl = (List<Predicate<Entity>>)Lists.newArrayList();
        final int lllllllllllllIIIlIlllIllIIIlIlII = parseIntWithDefault(lllllllllllllIIIlIlllIllIIIlIllI, PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[23]], WorldSettings.GameType.NOT_SET.getID());
        if (lllIlIIlllIIlIl(lllllllllllllIIIlIlllIllIIIlIlII, WorldSettings.GameType.NOT_SET.getID())) {
            lllllllllllllIIIlIlllIllIIIlIlIl.add((Predicate<Entity>)new Predicate<Entity>() {
                private static final /* synthetic */ int[] llIllllIllIllI;
                
                private static void lIIllIlIllIIllIl() {
                    (llIllllIllIllI = new int[2])[0] = ((0x66 ^ 0x23) & ~(0x2C ^ 0x69));
                    PlayerSelector$4.llIllllIllIllI[1] = " ".length();
                }
                
                private static boolean lIIllIlIllIIllll(final int llllllllllllIllIIIllIlIIlIllIlII, final int llllllllllllIllIIIllIlIIlIllIIll) {
                    return llllllllllllIllIIIllIlIIlIllIlII == llllllllllllIllIIIllIlIIlIllIIll;
                }
                
                public boolean apply(final Entity llllllllllllIllIIIllIlIIlIllllll) {
                    if (lIIllIlIllIIlllI((llllllllllllIllIIIllIlIIlIllllll instanceof EntityPlayerMP) ? 1 : 0)) {
                        return PlayerSelector$4.llIllllIllIllI[0] != 0;
                    }
                    final EntityPlayerMP llllllllllllIllIIIllIlIIlIlllllI = (EntityPlayerMP)llllllllllllIllIIIllIlIIlIllllll;
                    if (lIIllIlIllIIllll(llllllllllllIllIIIllIlIIlIlllllI.theItemInWorldManager.getGameType().getID(), lllllllllllllIIIlIlllIllIIIlIlII)) {
                        return PlayerSelector$4.llIllllIllIllI[1] != 0;
                    }
                    return PlayerSelector$4.llIllllIllIllI[0] != 0;
                }
                
                private static boolean lIIllIlIllIIlllI(final int llllllllllllIllIIIllIlIIlIllIIIl) {
                    return llllllllllllIllIIIllIlIIlIllIIIl == 0;
                }
                
                static {
                    lIIllIlIllIIllIl();
                }
            });
            "".length();
        }
        return lllllllllllllIIIlIlllIllIIIlIlIl;
    }
    
    private static boolean lllIlIIlllIIIlI(final Object lllllllllllllIIIlIlllIIllIllIIII) {
        return lllllllllllllIIIlIlllIIllIllIIII != null;
    }
    
    public static EntityPlayerMP matchOnePlayer(final ICommandSender lllllllllllllIIIlIlllIlllIIlIllI, final String lllllllllllllIIIlIlllIlllIIlIlIl) {
        return matchOneEntity(lllllllllllllIIIlIlllIlllIIlIllI, lllllllllllllIIIlIlllIlllIIlIlIl, (Class<? extends EntityPlayerMP>)EntityPlayerMP.class);
    }
    
    private static boolean lllIlIIlllIIlll(final int lllllllllllllIIIlIlllIIllIlIIllI) {
        return lllllllllllllIIIlIlllIIllIlIIllI < 0;
    }
    
    private static boolean lllIlIIlllIlIII(final int lllllllllllllIIIlIlllIIllIlIlIII) {
        return lllllllllllllIIIlIlllIIllIlIlIII >= 0;
    }
    
    public static <T extends Entity> List<T> matchEntities(final ICommandSender lllllllllllllIIIlIlllIllIlIllllI, final String lllllllllllllIIIlIlllIllIlIlllIl, final Class<? extends T> lllllllllllllIIIlIlllIllIllIIlll) {
        final Matcher lllllllllllllIIIlIlllIllIllIIllI = PlayerSelector.tokenPattern.matcher(lllllllllllllIIIlIlllIllIlIlllIl);
        if (!lllIlIIlllIIIII(lllllllllllllIIIlIlllIllIllIIllI.matches() ? 1 : 0) || !lllIlIIlllIIIII(lllllllllllllIIIlIlllIllIlIllllI.canCommandSenderUseCommand(PlayerSelector.lIlIIllllIIIll[1], PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[11]]) ? 1 : 0)) {
            return Collections.emptyList();
        }
        final Map<String, String> lllllllllllllIIIlIlllIllIllIIlIl = getArgumentMap(lllllllllllllIIIlIlllIllIllIIllI.group(PlayerSelector.lIlIIllllIIIll[2]));
        if (lllIlIIlllIIIIl(isEntityTypeValid(lllllllllllllIIIlIlllIllIlIllllI, lllllllllllllIIIlIlllIllIllIIlIl) ? 1 : 0)) {
            return Collections.emptyList();
        }
        final String lllllllllllllIIIlIlllIllIllIIlII = lllllllllllllIIIlIlllIllIllIIllI.group(PlayerSelector.lIlIIllllIIIll[1]);
        final BlockPos lllllllllllllIIIlIlllIllIllIIIll = func_179664_b(lllllllllllllIIIlIlllIllIllIIlIl, lllllllllllllIIIlIlllIllIlIllllI.getPosition());
        final List<World> lllllllllllllIIIlIlllIllIllIIIlI = getWorlds(lllllllllllllIIIlIlllIllIlIllllI, lllllllllllllIIIlIlllIllIllIIlIl);
        final List<T> lllllllllllllIIIlIlllIllIllIIIIl = (List<T>)Lists.newArrayList();
        final Exception lllllllllllllIIIlIlllIllIlIlIlII = (Exception)lllllllllllllIIIlIlllIllIllIIIlI.iterator();
        "".length();
        if (-(0x5F ^ 0x5A) >= 0) {
            return null;
        }
        while (!lllIlIIlllIIIIl(((Iterator)lllllllllllllIIIlIlllIllIlIlIlII).hasNext() ? 1 : 0)) {
            final World lllllllllllllIIIlIlllIllIllIIIII = ((Iterator<World>)lllllllllllllIIIlIlllIllIlIlIlII).next();
            if (lllIlIIlllIIIlI(lllllllllllllIIIlIlllIllIllIIIII)) {
                final List<Predicate<Entity>> lllllllllllllIIIlIlllIllIlIlllll = (List<Predicate<Entity>>)Lists.newArrayList();
                lllllllllllllIIIlIlllIllIlIlllll.addAll(func_179663_a(lllllllllllllIIIlIlllIllIllIIlIl, lllllllllllllIIIlIlllIllIllIIlII));
                "".length();
                lllllllllllllIIIlIlllIllIlIlllll.addAll(func_179648_b(lllllllllllllIIIlIlllIllIllIIlIl));
                "".length();
                lllllllllllllIIIlIlllIllIlIlllll.addAll(func_179649_c(lllllllllllllIIIlIlllIllIllIIlIl));
                "".length();
                lllllllllllllIIIlIlllIllIlIlllll.addAll(func_179659_d(lllllllllllllIIIlIlllIllIllIIlIl));
                "".length();
                lllllllllllllIIIlIlllIllIlIlllll.addAll(func_179657_e(lllllllllllllIIIlIlllIllIllIIlIl));
                "".length();
                lllllllllllllIIIlIlllIllIlIlllll.addAll(func_179647_f(lllllllllllllIIIlIlllIllIllIIlIl));
                "".length();
                lllllllllllllIIIlIlllIllIlIlllll.addAll(func_180698_a(lllllllllllllIIIlIlllIllIllIIlIl, lllllllllllllIIIlIlllIllIllIIIll));
                "".length();
                lllllllllllllIIIlIlllIllIlIlllll.addAll(func_179662_g(lllllllllllllIIIlIlllIllIllIIlIl));
                "".length();
                lllllllllllllIIIlIlllIllIllIIIIl.addAll((Collection<? extends T>)filterResults(lllllllllllllIIIlIlllIllIllIIlIl, (Class<? extends Entity>)lllllllllllllIIIlIlllIllIllIIlll, lllllllllllllIIIlIlllIllIlIlllll, lllllllllllllIIIlIlllIllIllIIlII, lllllllllllllIIIlIlllIllIllIIIII, lllllllllllllIIIlIlllIllIllIIIll));
                "".length();
            }
        }
        return func_179658_a(lllllllllllllIIIlIlllIllIllIIIIl, lllllllllllllIIIlIlllIllIllIIlIl, lllllllllllllIIIlIlllIllIlIllllI, lllllllllllllIIIlIlllIllIllIIlll, lllllllllllllIIIlIlllIllIllIIlII, lllllllllllllIIIlIlllIllIllIIIll);
    }
    
    public static <T extends Entity> T matchOneEntity(final ICommandSender lllllllllllllIIIlIlllIlllIIIlIlI, final String lllllllllllllIIIlIlllIlllIIIllIl, final Class<? extends T> lllllllllllllIIIlIlllIlllIIIllII) {
        final List<T> lllllllllllllIIIlIlllIlllIIIlIll = matchEntities(lllllllllllllIIIlIlllIlllIIIlIlI, lllllllllllllIIIlIlllIlllIIIllIl, lllllllllllllIIIlIlllIlllIIIllII);
        Entity entity;
        if (lllIlIIllIlllll(lllllllllllllIIIlIlllIlllIIIlIll.size(), PlayerSelector.lIlIIllllIIIll[1])) {
            entity = lllllllllllllIIIlIlllIlllIIIlIll.get(PlayerSelector.lIlIIllllIIIll[0]);
            "".length();
            if ("   ".length() != "   ".length()) {
                return null;
            }
        }
        else {
            entity = null;
        }
        return (T)entity;
    }
    
    private static void lllIlIIIlIlIllI() {
        (lIlIIllIllllll = new String[PlayerSelector.lIlIIllllIIIll[79]])[PlayerSelector.lIlIIllllIIIll[0]] = lllIlIIIlIlIIII("iOuXXRN2tIX88z2RezLf8p9moM4PzuRKxZrnEHhOv2w=", "gqrlM");
        PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[1]] = lllIlIIIlIlIIII("aJEn0gP65t3LCm18DxbgQKXWdqBGImFe", "zIZPp");
        PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[2]] = lllIlIIIlIlIIII("OusQZIhOhZXDp4Y8aECh0XZIVvVEkukDmo8KDC87y70=", "JqJzF");
        PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[4]] = lllIlIIIlIlIIIl("1pcsDGKcMvU=", "lXvKx");
        PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[5]] = lllIlIIIlIlIIIl("0AxxrcTtkvM=", "MLcyU");
        PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[6]] = lllIlIIIlIlIIII("5k5DjnBAqFg=", "dfEFA");
        PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[7]] = lllIlIIIlIlIIIl("K3wwrZwSJ6A=", "VHLao");
        PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[8]] = lllIlIIIlIlIIII("rSnaVkrUvsI=", "taaJW");
        PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[3]] = lllIlIIIlIlIIIl("Bzzwb3Yx1YM=", "EruBM");
        PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[9]] = lllIlIIIlIlIIlI("EQQ=", "civLo");
        PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[10]] = lllIlIIIlIlIIlI("Ig==", "PrpeB");
        PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[11]] = lllIlIIIlIlIIIl("S83h8i7IOMo=", "JkNiN");
        PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[12]] = lllIlIIIlIlIIIl("Fp2uoYF61+Q=", "yNaNJ");
        PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[13]] = lllIlIIIlIlIIlI("RQ==", "ddHAy");
        PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[14]] = lllIlIIIlIlIIII("8tqCZFcwS5H0RnBqoNWh3/aMobIYPU5tmlQiUvsvwy1S6yddYpeJFA==", "bkEWJ");
        PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[15]] = lllIlIIIlIlIIIl("xZPfwumCxEA=", "tITXx");
        PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[16]] = lllIlIIIlIlIIIl("kdrDs2QWS5s=", "HyGFd");
        PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[17]] = lllIlIIIlIlIIlI("Dw==", "jLkZE");
        PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[18]] = lllIlIIIlIlIIIl("VfE4zONLUXk=", "ZKiyM");
        PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[19]] = lllIlIIIlIlIIII("IVW17aqnHeU=", "HgsTC");
        PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[20]] = lllIlIIIlIlIIII("BwJxzVXSy7g=", "yWlsP");
        PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[22]] = lllIlIIIlIlIIII("aKq741NWkxU=", "aUoaa");
        PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[23]] = lllIlIIIlIlIIIl("JQC1f8juUnA=", "rYPXH");
        PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[24]] = lllIlIIIlIlIIlI("DQ8DJw==", "yjbJu");
        PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[25]] = lllIlIIIlIlIIIl("XeR+hu5wsRo=", "TtWbe");
        PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[26]] = lllIlIIIlIlIIlI("IA8AJw==", "NnmBb");
        PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[27]] = lllIlIIIlIlIIII("BgEzfyp78jY=", "gVNWt");
        PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[28]] = lllIlIIIlIlIIII("nNzU+daYFpg=", "KZmNo");
        PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[29]] = lllIlIIIlIlIIlI("Bg==", "tfzjm");
        PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[30]] = lllIlIIIlIlIIlI("Gwgn", "iqJEt");
        PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[31]] = lllIlIIIlIlIIlI("ARY=", "soimn");
        PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[32]] = lllIlIIIlIlIIII("oMlAO7KdyJE=", "chpVB");
        PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[33]] = lllIlIIIlIlIIlI("FRA=", "giuCJ");
        PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[35]] = lllIlIIIlIlIIIl("cRA2iG/jrBo=", "TsJJg");
        PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[36]] = lllIlIIIlIlIIII("D6SHlvp3DXo=", "TXJCD");
        PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[37]] = lllIlIIIlIlIIIl("A8Tqm4M3UF4=", "cGiTs");
        PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[38]] = lllIlIIIlIlIIII("wvlm1l3jYs0=", "rpMVx");
        PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[39]] = lllIlIIIlIlIIIl("8xlbLK7IFpM=", "ZftIn");
        PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[40]] = lllIlIIIlIlIIlI("eA==", "YohVc");
        PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[41]] = lllIlIIIlIlIIlI("LA==", "IYUSB");
        PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[42]] = lllIlIIIlIlIIII("8EreBcpotMc=", "VmGgT");
        PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[43]] = lllIlIIIlIlIIII("5lHk4/WNB4A=", "dSXBk");
        PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[44]] = lllIlIIIlIlIIIl("5ijQ7sJt/C4=", "TWAjo");
        PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[45]] = lllIlIIIlIlIIII("B5dhl7QObR8=", "iCTKC");
        PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[46]] = lllIlIIIlIlIIlI("MQ==", "ChYts");
        PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[47]] = lllIlIIIlIlIIlI("MAk=", "TqngJ");
        PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[48]] = lllIlIIIlIlIIIl("WhM5bbUIS5g=", "CfzBG");
        PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[49]] = lllIlIIIlIlIIlI("ERg=", "ubCpl");
        PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[50]] = lllIlIIIlIlIIII("me3EKry9s3M=", "lzozk");
        PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[51]] = lllIlIIIlIlIIII("Z9V6p3GCfkY=", "MNujk");
        PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[52]] = lllIlIIIlIlIIIl("LppCAsI1Fdc=", "MgUWX");
        PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[53]] = lllIlIIIlIlIIII("DgkNcMO2fhA=", "htlIC");
        PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[54]] = lllIlIIIlIlIIIl("AI1BNKGtKY0=", "hGdiN");
        PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[55]] = lllIlIIIlIlIIII("8NdEV4qq5WY=", "lnzrw");
        PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[56]] = lllIlIIIlIlIIII("3XJyTeTiG5s=", "kuUBk");
        PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[57]] = lllIlIIIlIlIIIl("aYHGvz+GfO4=", "HuTbq");
        PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[58]] = lllIlIIIlIlIIIl("WK31Y4nmirs=", "uLqdc");
        PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[59]] = lllIlIIIlIlIIIl("zGILxY+rA68=", "STvYT");
        PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[60]] = lllIlIIIlIlIIIl("abemm32K0Qs=", "GDKwm");
        PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[61]] = lllIlIIIlIlIIIl("Ndd4Wcv3NTM=", "nppia");
        PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[62]] = lllIlIIIlIlIIII("iUXJWjopG5g=", "lLaVf");
        PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[63]] = lllIlIIIlIlIIII("Ia8HFSdJfew=", "gCxOF");
        PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[66]] = lllIlIIIlIlIIIl("oksUkY8pMzA=", "xFJua");
        PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[67]] = lllIlIIIlIlIIIl("r7eeUc8AA/0=", "ipFkQ");
        PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[68]] = lllIlIIIlIlIIlI("Ow==", "ANtFv");
        PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[69]] = lllIlIIIlIlIIIl("NFA5EkX4En4=", "immgS");
        PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[70]] = lllIlIIIlIlIIII("iZdhDkKHt7U=", "Zmxks");
        PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[71]] = lllIlIIIlIlIIIl("657a4TZpLDw=", "yCxyX");
        PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[72]] = lllIlIIIlIlIIIl("5lwF7+lwlRw=", "JkosJ");
        PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[73]] = lllIlIIIlIlIIIl("xfppwQO6lcI=", "bGnUY");
        PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[74]] = lllIlIIIlIlIIII("GTN54eR8j2o=", "zLnyT");
        PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[75]] = lllIlIIIlIlIIII("HK+O6WA5hAw=", "soURa");
        PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[76]] = lllIlIIIlIlIIlI("Og==", "CZqFo");
        PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[77]] = lllIlIIIlIlIIlI("Pw==", "EoXqY");
        PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[78]] = lllIlIIIlIlIIII("mAJX2SFWGlo=", "GarBx");
    }
    
    public static boolean hasArguments(final String lllllllllllllIIIlIlllIlIIIIIllII) {
        return PlayerSelector.tokenPattern.matcher(lllllllllllllIIIlIlllIlIIIIIllII).matches();
    }
    
    static {
        lllIlIIllIllllI();
        lllIlIIIlIlIllI();
        tokenPattern = Pattern.compile(PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[0]]);
        intListPattern = Pattern.compile(PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[1]]);
        keyValueListPattern = Pattern.compile(PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[2]]);
        final String[] array = new String[PlayerSelector.lIlIIllllIIIll[3]];
        array[PlayerSelector.lIlIIllllIIIll[0]] = PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[4]];
        array[PlayerSelector.lIlIIllllIIIll[1]] = PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[5]];
        array[PlayerSelector.lIlIIllllIIIll[2]] = PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[6]];
        array[PlayerSelector.lIlIIllllIIIll[4]] = PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[7]];
        array[PlayerSelector.lIlIIllllIIIll[5]] = PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[8]];
        array[PlayerSelector.lIlIIllllIIIll[6]] = PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[3]];
        array[PlayerSelector.lIlIIllllIIIll[7]] = PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[9]];
        array[PlayerSelector.lIlIIllllIIIll[8]] = PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[10]];
        WORLD_BINDING_ARGS = Sets.newHashSet((Object[])array);
    }
    
    private static String func_179651_b(final Map<String, String> lllllllllllllIIIlIlllIlIIIlIlIll, final String lllllllllllllIIIlIlllIlIIIlIlIlI) {
        return lllllllllllllIIIlIlllIlIIIlIlIll.get(lllllllllllllIIIlIlllIlIIIlIlIlI);
    }
    
    private static List<Predicate<Entity>> func_179662_g(final Map<String, String> lllllllllllllIIIlIlllIlIllIIlIlI) {
        final List<Predicate<Entity>> lllllllllllllIIIlIlllIlIllIIllll = (List<Predicate<Entity>>)Lists.newArrayList();
        if (!lllIlIIlllIIIIl(lllllllllllllIIIlIlllIlIllIIlIlI.containsKey(PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[30]]) ? 1 : 0) || lllIlIIlllIIIII(lllllllllllllIIIlIlllIlIllIIlIlI.containsKey(PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[31]]) ? 1 : 0)) {
            final int lllllllllllllIIIlIlllIlIllIIlllI = func_179650_a(parseIntWithDefault(lllllllllllllIIIlIlllIlIllIIlIlI, PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[32]], PlayerSelector.lIlIIllllIIIll[0]));
            final int lllllllllllllIIIlIlllIlIllIIllIl = func_179650_a(parseIntWithDefault(lllllllllllllIIIlIlllIlIllIIlIlI, PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[33]], PlayerSelector.lIlIIllllIIIll[34]));
            lllllllllllllIIIlIlllIlIllIIllll.add((Predicate<Entity>)new Predicate<Entity>() {
                private static final /* synthetic */ int[] lIlIlIIlIlIlII;
                
                public boolean apply(final Entity lllllllllllllIIIlIlIIIlIIlllIllI) {
                    final int lllllllllllllIIIlIlIIIlIIlllIlIl = PlayerSelector.func_179650_a((int)Math.floor(lllllllllllllIIIlIlIIIlIIlllIllI.rotationYaw));
                    int n;
                    if (lllIllIIIllIllI(lllllllllllllIIIlIlllIlIllIIlllI, lllllllllllllIIIlIlllIlIllIIllIl)) {
                        if (lllIllIIIllIlll(lllllllllllllIIIlIlIIIlIIlllIlIl, lllllllllllllIIIlIlllIlIllIIlllI) && lllIllIIIllIllI(lllllllllllllIIIlIlIIIlIIlllIlIl, lllllllllllllIIIlIlllIlIllIIllIl)) {
                            n = PlayerSelector$9.lIlIlIIlIlIlII[0];
                            "".length();
                            if ((0xF6 ^ 0xA0 ^ (0x25 ^ 0x77)) <= "   ".length()) {
                                return ((132 + 50 - 129 + 95 ^ 24 + 77 - 96 + 181) & (3 + 11 + 162 + 7 ^ 147 + 152 - 255 + 109 ^ -" ".length())) != 0x0;
                            }
                        }
                        else {
                            n = PlayerSelector$9.lIlIlIIlIlIlII[1];
                            "".length();
                            if ((0xC1 ^ 0xC4) == 0x0) {
                                return ((0x1 ^ 0xE) & ~(0x6C ^ 0x63)) != 0x0;
                            }
                        }
                    }
                    else if (lllIllIIIlllIII(lllllllllllllIIIlIlIIIlIIlllIlIl, lllllllllllllIIIlIlllIlIllIIlllI) && lllIllIIIlllIIl(lllllllllllllIIIlIlIIIlIIlllIlIl, lllllllllllllIIIlIlllIlIllIIllIl)) {
                        n = PlayerSelector$9.lIlIlIIlIlIlII[1];
                        "".length();
                        if (((0x49 ^ 0x1A ^ (0xDE ^ 0x86)) & (0x39 ^ 0x5E ^ (0xD1 ^ 0xBD) ^ -" ".length())) != ((0x2A ^ 0x4C ^ (0xC7 ^ 0xBD)) & (0x17 ^ 0x22 ^ (0xBE ^ 0x97) ^ -" ".length()))) {
                            return ((0x7E ^ 0x4E ^ (0x60 ^ 0x7F)) & (0x62 ^ 0x2D ^ (0x69 ^ 0x9) ^ -" ".length())) != 0x0;
                        }
                    }
                    else {
                        n = PlayerSelector$9.lIlIlIIlIlIlII[0];
                    }
                    return n != 0;
                }
                
                private static boolean lllIllIIIllIllI(final int lllllllllllllIIIlIlIIIlIIlIlllll, final int lllllllllllllIIIlIlIIIlIIlIllllI) {
                    return lllllllllllllIIIlIlIIIlIIlIlllll > lllllllllllllIIIlIlIIIlIIlIllllI;
                }
                
                private static void lllIllIIIllIlIl() {
                    (lIlIlIIlIlIlII = new int[2])[0] = ((12 + 90 - 7 + 41 ^ 52 + 108 - 30 + 11) & (0xEC ^ 0xA3 ^ (0xA ^ 0x40) ^ -" ".length()));
                    PlayerSelector$9.lIlIlIIlIlIlII[1] = " ".length();
                }
                
                private static boolean lllIllIIIlllIIl(final int lllllllllllllIIIlIlIIIlIIllIIIll, final int lllllllllllllIIIlIlIIIlIIllIIIlI) {
                    return lllllllllllllIIIlIlIIIlIIllIIIll <= lllllllllllllIIIlIlIIIlIIllIIIlI;
                }
                
                static {
                    lllIllIIIllIlIl();
                }
                
                private static boolean lllIllIIIllIlll(final int lllllllllllllIIIlIlIIIlIIllIIlll, final int lllllllllllllIIIlIlIIIlIIllIIllI) {
                    return lllllllllllllIIIlIlIIIlIIllIIlll < lllllllllllllIIIlIlIIIlIIllIIllI;
                }
                
                private static boolean lllIllIIIlllIII(final int lllllllllllllIIIlIlIIIlIIllIlIll, final int lllllllllllllIIIlIlIIIlIIllIlIlI) {
                    return lllllllllllllIIIlIlIIIlIIllIlIll >= lllllllllllllIIIlIlIIIlIIllIlIlI;
                }
            });
            "".length();
        }
        if (!lllIlIIlllIIIIl(lllllllllllllIIIlIlllIlIllIIlIlI.containsKey(PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[35]]) ? 1 : 0) || lllIlIIlllIIIII(lllllllllllllIIIlIlllIlIllIIlIlI.containsKey(PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[36]]) ? 1 : 0)) {
            final int lllllllllllllIIIlIlllIlIllIIllII = func_179650_a(parseIntWithDefault(lllllllllllllIIIlIlllIlIllIIlIlI, PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[37]], PlayerSelector.lIlIIllllIIIll[0]));
            final int lllllllllllllIIIlIlllIlIllIIlIll = func_179650_a(parseIntWithDefault(lllllllllllllIIIlIlllIlIllIIlIlI, PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[38]], PlayerSelector.lIlIIllllIIIll[34]));
            lllllllllllllIIIlIlllIlIllIIllll.add((Predicate<Entity>)new Predicate<Entity>() {
                private static final /* synthetic */ int[] llIlIllIlIllII;
                
                private static boolean lIIlIlIlIlIlllII(final int llllllllllllIllIlIIlIlllIIIIIIlI, final int llllllllllllIllIlIIlIlllIIIIIIII) {
                    return llllllllllllIllIlIIlIlllIIIIIIlI >= llllllllllllIllIlIIlIlllIIIIIIII;
                }
                
                private static boolean lIIlIlIlIlIlllIl(final int llllllllllllIllIlIIlIllIllllIlII, final int llllllllllllIllIlIIlIllIllllIIlI) {
                    return llllllllllllIllIlIIlIllIllllIlII <= llllllllllllIllIlIIlIllIllllIIlI;
                }
                
                public boolean apply(final Entity llllllllllllIllIlIIlIlllIIIIllIl) {
                    final int llllllllllllIllIlIIlIlllIIIIllll = PlayerSelector.func_179650_a((int)Math.floor(llllllllllllIllIlIIlIlllIIIIllIl.rotationPitch));
                    int n;
                    if (lIIlIlIlIlIllIlI(lllllllllllllIIIlIlllIlIllIIllII, lllllllllllllIIIlIlllIlIllIIlIll)) {
                        if (lIIlIlIlIlIllIll(llllllllllllIllIlIIlIlllIIIIllll, lllllllllllllIIIlIlllIlIllIIllII) && lIIlIlIlIlIllIlI(llllllllllllIllIlIIlIlllIIIIllll, lllllllllllllIIIlIlllIlIllIIlIll)) {
                            n = PlayerSelector$10.llIlIllIlIllII[0];
                            "".length();
                            if (" ".length() < 0) {
                                return ((0x3F ^ 0x4) & ~(0x88 ^ 0xB3)) != 0x0;
                            }
                        }
                        else {
                            n = PlayerSelector$10.llIlIllIlIllII[1];
                            "".length();
                            if (null != null) {
                                return ((0x39 ^ 0x3) & ~(0x44 ^ 0x7E)) != 0x0;
                            }
                        }
                    }
                    else if (lIIlIlIlIlIlllII(llllllllllllIllIlIIlIlllIIIIllll, lllllllllllllIIIlIlllIlIllIIllII) && lIIlIlIlIlIlllIl(llllllllllllIllIlIIlIlllIIIIllll, lllllllllllllIIIlIlllIlIllIIlIll)) {
                        n = PlayerSelector$10.llIlIllIlIllII[1];
                        "".length();
                        if ("   ".length() != "   ".length()) {
                            return ((0xE4 ^ 0xBF ^ (0x29 ^ 0x5B)) & (21 + 123 - 88 + 88 ^ 108 + 42 - 40 + 75 ^ -" ".length())) != 0x0;
                        }
                    }
                    else {
                        n = PlayerSelector$10.llIlIllIlIllII[0];
                    }
                    return n != 0;
                }
                
                private static boolean lIIlIlIlIlIllIll(final int llllllllllllIllIlIIlIllIllllllII, final int llllllllllllIllIlIIlIllIlllllIll) {
                    return llllllllllllIllIlIIlIllIllllllII < llllllllllllIllIlIIlIllIlllllIll;
                }
                
                private static void lIIlIlIlIlIllIIl() {
                    (llIlIllIlIllII = new int[2])[0] = ((0xAF ^ 0xB4) & ~(0x9C ^ 0x87));
                    PlayerSelector$10.llIlIllIlIllII[1] = " ".length();
                }
                
                private static boolean lIIlIlIlIlIllIlI(final int llllllllllllIllIlIIlIllIlllIllll, final int llllllllllllIllIlIIlIllIlllIlllI) {
                    return llllllllllllIllIlIIlIllIlllIllll > llllllllllllIllIlIIlIllIlllIlllI;
                }
                
                static {
                    lIIlIlIlIlIllIIl();
                }
            });
            "".length();
        }
        return lllllllllllllIIIlIlllIlIllIIllll;
    }
    
    private static List<Predicate<Entity>> func_179647_f(final Map<String, String> lllllllllllllIIIlIlllIlIlllIlllI) {
        final List<Predicate<Entity>> lllllllllllllIIIlIlllIlIllllIIlI = (List<Predicate<Entity>>)Lists.newArrayList();
        String lllllllllllllIIIlIlllIlIllllIIIl = func_179651_b(lllllllllllllIIIlIlllIlIlllIlllI, PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[26]]);
        int n;
        if (lllIlIIlllIIIlI(lllllllllllllIIIlIlllIlIllllIIIl) && lllIlIIlllIIIII(lllllllllllllIIIlIlllIlIllllIIIl.startsWith(PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[27]]) ? 1 : 0)) {
            n = PlayerSelector.lIlIIllllIIIll[1];
            "".length();
            if (((127 + 58 - 13 + 47 ^ 14 + 21 + 78 + 42) & (23 + 41 + 92 + 89 ^ 105 + 90 - 76 + 62 ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        else {
            n = PlayerSelector.lIlIIllllIIIll[0];
        }
        final boolean lllllllllllllIIIlIlllIlIllllIIII = n != 0;
        if (lllIlIIlllIIIII(lllllllllllllIIIlIlllIlIllllIIII ? 1 : 0)) {
            lllllllllllllIIIlIlllIlIllllIIIl = lllllllllllllIIIlIlllIlIllllIIIl.substring(PlayerSelector.lIlIIllllIIIll[1]);
        }
        if (lllIlIIlllIIIlI(lllllllllllllIIIlIlllIlIllllIIIl)) {
            final String lllllllllllllIIIlIlllIlIlllIllll = lllllllllllllIIIlIlllIlIllllIIIl;
            lllllllllllllIIIlIlllIlIllllIIlI.add((Predicate<Entity>)new Predicate<Entity>() {
                public boolean apply(final Entity lllllllllllllIIlIllIllIlIIIlIIII) {
                    return lllllllllllllIIlIllIllIlIIIlIIII.getName().equals(lllllllllllllIIIlIlllIlIlllIllll) ^ lllllllllllllIIIlIlllIlIllllIIII;
                }
            });
            "".length();
        }
        return lllllllllllllIIIlIlllIlIllllIIlI;
    }
    
    private static boolean lllIlIIlllIIIII(final int lllllllllllllIIIlIlllIIllIlIllII) {
        return lllllllllllllIIIlIlllIIllIlIllII != 0;
    }
    
    public static IChatComponent matchEntitiesToChatComponent(final ICommandSender lllllllllllllIIIlIlllIlllIIIIIII, final String lllllllllllllIIIlIlllIllIllllIlI) {
        final List<Entity> lllllllllllllIIIlIlllIllIllllllI = matchEntities(lllllllllllllIIIlIlllIlllIIIIIII, lllllllllllllIIIlIlllIllIllllIlI, (Class<? extends Entity>)Entity.class);
        if (lllIlIIlllIIIII(lllllllllllllIIIlIlllIllIllllllI.isEmpty() ? 1 : 0)) {
            return null;
        }
        final List<IChatComponent> lllllllllllllIIIlIlllIllIlllllIl = (List<IChatComponent>)Lists.newArrayList();
        final long lllllllllllllIIIlIlllIllIlllIllI = (long)lllllllllllllIIIlIlllIllIllllllI.iterator();
        "".length();
        if ((0xC7 ^ 0xC3) <= ((0xB ^ 0x1F) & ~(0x86 ^ 0x92))) {
            return null;
        }
        while (!lllIlIIlllIIIIl(((Iterator)lllllllllllllIIIlIlllIllIlllIllI).hasNext() ? 1 : 0)) {
            final Entity lllllllllllllIIIlIlllIllIlllllII = ((Iterator<Entity>)lllllllllllllIIIlIlllIllIlllIllI).next();
            lllllllllllllIIIlIlllIllIlllllIl.add(lllllllllllllIIIlIlllIllIlllllII.getDisplayName());
            "".length();
        }
        return CommandBase.join(lllllllllllllIIIlIlllIllIlllllIl);
    }
    
    private static int parseIntWithDefault(final Map<String, String> lllllllllllllIIIlIlllIlIIIllIIll, final String lllllllllllllIIIlIlllIlIIIllIIlI, final int lllllllllllllIIIlIlllIlIIIlIlllI) {
        int intWithDefault;
        if (lllIlIIlllIIIII(lllllllllllllIIIlIlllIlIIIllIIll.containsKey(lllllllllllllIIIlIlllIlIIIllIIlI) ? 1 : 0)) {
            intWithDefault = MathHelper.parseIntWithDefault(lllllllllllllIIIlIlllIlIIIllIIll.get(lllllllllllllIIIlIlllIlIIIllIIlI), lllllllllllllIIIlIlllIlIIIlIlllI);
            "".length();
            if ("  ".length() <= -" ".length()) {
                return (0x2F ^ 0x10) & ~(0xFF ^ 0xC0);
            }
        }
        else {
            intWithDefault = lllllllllllllIIIlIlllIlIIIlIlllI;
        }
        return intWithDefault;
    }
    
    private static List<Predicate<Entity>> func_179663_a(final Map<String, String> lllllllllllllIIIlIlllIllIIlIllIl, final String lllllllllllllIIIlIlllIllIIllIlII) {
        final List<Predicate<Entity>> lllllllllllllIIIlIlllIllIIllIIll = (List<Predicate<Entity>>)Lists.newArrayList();
        String lllllllllllllIIIlIlllIllIIllIIlI = func_179651_b(lllllllllllllIIIlIlllIllIIlIllIl, PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[15]]);
        int n;
        if (lllIlIIlllIIIlI(lllllllllllllIIIlIlllIllIIllIIlI) && lllIlIIlllIIIII(lllllllllllllIIIlIlllIllIIllIIlI.startsWith(PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[16]]) ? 1 : 0)) {
            n = PlayerSelector.lIlIIllllIIIll[1];
            "".length();
            if (((0x33 ^ 0x72) & ~(0x5F ^ 0x1E)) == -" ".length()) {
                return null;
            }
        }
        else {
            n = PlayerSelector.lIlIIllllIIIll[0];
        }
        final boolean lllllllllllllIIIlIlllIllIIllIIIl = n != 0;
        if (lllIlIIlllIIIII(lllllllllllllIIIlIlllIllIIllIIIl ? 1 : 0)) {
            lllllllllllllIIIlIlllIllIIllIIlI = lllllllllllllIIIlIlllIllIIllIIlI.substring(PlayerSelector.lIlIIllllIIIll[1]);
        }
        int n2;
        if (lllIlIIlllIIIII(lllllllllllllIIIlIlllIllIIllIlII.equals(PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[17]]) ? 1 : 0)) {
            n2 = PlayerSelector.lIlIIllllIIIll[0];
            "".length();
            if ("   ".length() < "  ".length()) {
                return null;
            }
        }
        else {
            n2 = PlayerSelector.lIlIIllllIIIll[1];
        }
        final boolean lllllllllllllIIIlIlllIllIIllIIII = n2 != 0;
        int n3;
        if (lllIlIIlllIIIII(lllllllllllllIIIlIlllIllIIllIlII.equals(PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[18]]) ? 1 : 0) && lllIlIIlllIIIlI(lllllllllllllIIIlIlllIllIIllIIlI)) {
            n3 = PlayerSelector.lIlIIllllIIIll[1];
            "".length();
            if (((0x50 ^ 0x48) & ~(0xE ^ 0x16)) != 0x0) {
                return null;
            }
        }
        else {
            n3 = PlayerSelector.lIlIIllllIIIll[0];
        }
        final boolean lllllllllllllIIIlIlllIllIIlIllll = n3 != 0;
        if ((!lllIlIIlllIIIlI(lllllllllllllIIIlIlllIllIIllIIlI) || lllIlIIlllIIIIl(lllllllllllllIIIlIlllIllIIllIlII.equals(PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[19]]) ? 1 : 0)) && lllIlIIlllIIIIl(lllllllllllllIIIlIlllIllIIlIllll ? 1 : 0)) {
            if (lllIlIIlllIIIII(lllllllllllllIIIlIlllIllIIllIIII ? 1 : 0)) {
                lllllllllllllIIIlIlllIllIIllIIll.add((Predicate<Entity>)new Predicate<Entity>() {
                    public boolean apply(final Entity llllllllllllIllllIlIllIllIIlIlIl) {
                        return llllllllllllIllllIlIllIllIIlIlIl instanceof EntityPlayer;
                    }
                });
                "".length();
                "".length();
                if (-"  ".length() > 0) {
                    return null;
                }
            }
        }
        else {
            final String lllllllllllllIIIlIlllIllIIlIlllI = lllllllllllllIIIlIlllIllIIllIIlI;
            lllllllllllllIIIlIlllIllIIllIIll.add((Predicate<Entity>)new Predicate<Entity>() {
                public boolean apply(final Entity llllllllllllIllIIIlIIIlIIlllllII) {
                    return EntityList.isStringEntityName(llllllllllllIllIIIlIIIlIIlllllII, lllllllllllllIIIlIlllIllIIlIlllI) ^ lllllllllllllIIIlIlllIllIIllIIIl;
                }
            });
            "".length();
        }
        return lllllllllllllIIIlIlllIllIIllIIll;
    }
    
    private static boolean lllIlIIlllIIIIl(final int lllllllllllllIIIlIlllIIllIlIlIlI) {
        return lllllllllllllIIIlIlllIIllIlIlIlI == 0;
    }
    
    private static <T extends Entity> List<T> func_179658_a(List<T> lllllllllllllIIIlIlllIlIIlllIllI, final Map<String, String> lllllllllllllIIIlIlllIlIIlllIlIl, final ICommandSender lllllllllllllIIIlIlllIlIIlllIlII, final Class<? extends T> lllllllllllllIIIlIlllIlIIllllIll, final String lllllllllllllIIIlIlllIlIIlllIIlI, final BlockPos lllllllllllllIIIlIlllIlIIlllIIIl) {
        final String lllllllllllllIIIlIlllIlIIIllIIlI = PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[56]];
        int lllllllllllllIIIlIlllIlIIIlIlllI;
        if (lllIlIIlllIIIIl(lllllllllllllIIIlIlllIlIIlllIIlI.equals(PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[57]]) ? 1 : 0) && lllIlIIlllIIIIl(lllllllllllllIIIlIlllIlIIlllIIlI.equals(PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[58]]) ? 1 : 0)) {
            lllllllllllllIIIlIlllIlIIIlIlllI = PlayerSelector.lIlIIllllIIIll[1];
            "".length();
            if (-"   ".length() >= 0) {
                return null;
            }
        }
        else {
            lllllllllllllIIIlIlllIlIIIlIlllI = PlayerSelector.lIlIIllllIIIll[0];
        }
        final int lllllllllllllIIIlIlllIlIIllllIII = parseIntWithDefault(lllllllllllllIIIlIlllIlIIlllIlIl, lllllllllllllIIIlIlllIlIIIllIIlI, lllllllllllllIIIlIlllIlIIIlIlllI);
        if (lllIlIIlllIIIIl(lllllllllllllIIIlIlllIlIIlllIIlI.equals(PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[59]]) ? 1 : 0) && lllIlIIlllIIIIl(lllllllllllllIIIlIlllIlIIlllIIlI.equals(PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[60]]) ? 1 : 0) && lllIlIIlllIIIIl(lllllllllllllIIIlIlllIlIIlllIIlI.equals(PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[61]]) ? 1 : 0)) {
            if (lllIlIIlllIIIII(lllllllllllllIIIlIlllIlIIlllIIlI.equals(PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[62]]) ? 1 : 0)) {
                Collections.shuffle(lllllllllllllIIIlIlllIlIIlllIllI);
                "".length();
                if ("   ".length() == -" ".length()) {
                    return null;
                }
            }
        }
        else if (lllIlIIlllIIIlI(lllllllllllllIIIlIlllIlIIlllIIIl)) {
            Collections.sort(lllllllllllllIIIlIlllIlIIlllIllI, new Comparator<Entity>() {
                @Override
                public int compare(final Entity llllllllllllIllIIlIIlllIIIIIllIl, final Entity llllllllllllIllIIlIIlllIIIIIllII) {
                    return ComparisonChain.start().compare(llllllllllllIllIIlIIlllIIIIIllIl.getDistanceSq(lllllllllllllIIIlIlllIlIIlllIIIl), llllllllllllIllIIlIIlllIIIIIllII.getDistanceSq(lllllllllllllIIIlIlllIlIIlllIIIl)).result();
                }
            });
        }
        final Entity lllllllllllllIIIlIlllIlIIlllIlll = lllllllllllllIIIlIlllIlIIlllIlII.getCommandSenderEntity();
        if (lllIlIIlllIIIlI(lllllllllllllIIIlIlllIlIIlllIlll) && lllIlIIlllIIIII(lllllllllllllIIIlIlllIlIIllllIll.isAssignableFrom(lllllllllllllIIIlIlllIlIIlllIlll.getClass()) ? 1 : 0) && lllIlIIllIlllll(lllllllllllllIIIlIlllIlIIllllIII, PlayerSelector.lIlIIllllIIIll[1]) && lllIlIIlllIIIII(lllllllllllllIIIlIlllIlIIlllIllI.contains(lllllllllllllIIIlIlllIlIIlllIlll) ? 1 : 0) && lllIlIIlllIIIIl(PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[63]].equals(lllllllllllllIIIlIlllIlIIlllIIlI) ? 1 : 0)) {
            final Entity[] array = new Entity[PlayerSelector.lIlIIllllIIIll[1]];
            array[PlayerSelector.lIlIIllllIIIll[0]] = lllllllllllllIIIlIlllIlIIlllIlll;
            lllllllllllllIIIlIlllIlIIlllIllI = (List<T>)Lists.newArrayList((Object[])array);
        }
        if (lllIlIIlllIIIII(lllllllllllllIIIlIlllIlIIllllIII)) {
            if (lllIlIIlllIIlll(lllllllllllllIIIlIlllIlIIllllIII)) {
                Collections.reverse(lllllllllllllIIIlIlllIlIIlllIllI);
            }
            lllllllllllllIIIlIlllIlIIlllIllI = lllllllllllllIIIlIlllIlIIlllIllI.subList(PlayerSelector.lIlIIllllIIIll[0], Math.min(Math.abs(lllllllllllllIIIlIlllIlIIllllIII), lllllllllllllIIIlIlllIlIIlllIllI.size()));
        }
        return lllllllllllllIIIlIlllIlIIlllIllI;
    }
    
    private static List<Predicate<Entity>> func_179648_b(final Map<String, String> lllllllllllllIIIlIlllIllIIlIIIIl) {
        final List<Predicate<Entity>> lllllllllllllIIIlIlllIllIIlIIIII = (List<Predicate<Entity>>)Lists.newArrayList();
        final int lllllllllllllIIIlIlllIllIIIlllll = parseIntWithDefault(lllllllllllllIIIlIlllIllIIlIIIIl, PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[20]], PlayerSelector.lIlIIllllIIIll[21]);
        final int lllllllllllllIIIlIlllIllIIIllllI = parseIntWithDefault(lllllllllllllIIIlIlllIllIIlIIIIl, PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[22]], PlayerSelector.lIlIIllllIIIll[21]);
        if (!lllIlIIlllIIIll(lllllllllllllIIIlIlllIllIIIlllll, PlayerSelector.lIlIIllllIIIll[21]) || lllIlIIlllIIlII(lllllllllllllIIIlIlllIllIIIllllI, PlayerSelector.lIlIIllllIIIll[21])) {
            lllllllllllllIIIlIlllIllIIlIIIII.add((Predicate<Entity>)new Predicate<Entity>() {
                private static final /* synthetic */ int[] lIIIIllllIlIlI;
                
                public boolean apply(final Entity lllllllllllllIlIIIllIlIIIIlllllI) {
                    if (lIlllllIIIIIlll((lllllllllllllIlIIIllIlIIIIlllllI instanceof EntityPlayerMP) ? 1 : 0)) {
                        return PlayerSelector$3.lIIIIllllIlIlI[0] != 0;
                    }
                    final EntityPlayerMP lllllllllllllIlIIIllIlIIIlIIIIII = (EntityPlayerMP)lllllllllllllIlIIIllIlIIIIlllllI;
                    if ((!lIlllllIIIIlIII(lllllllllllllIIIlIlllIllIIIlllll, PlayerSelector$3.lIIIIllllIlIlI[1]) || lIlllllIIIIlIIl(lllllllllllllIlIIIllIlIIIlIIIIII.experienceLevel, lllllllllllllIIIlIlllIllIIIlllll)) && (!lIlllllIIIIlIII(lllllllllllllIIIlIlllIllIIIllllI, PlayerSelector$3.lIIIIllllIlIlI[1]) || lIlllllIIIIlIlI(lllllllllllllIlIIIllIlIIIlIIIIII.experienceLevel, lllllllllllllIIIlIlllIllIIIllllI))) {
                        return PlayerSelector$3.lIIIIllllIlIlI[2] != 0;
                    }
                    return PlayerSelector$3.lIIIIllllIlIlI[0] != 0;
                }
                
                static {
                    lIlllllIIIIIllI();
                }
                
                private static boolean lIlllllIIIIIlll(final int lllllllllllllIlIIIllIlIIIIlIlIll) {
                    return lllllllllllllIlIIIllIlIIIIlIlIll == 0;
                }
                
                private static boolean lIlllllIIIIlIII(final int lllllllllllllIlIIIllIlIIIIlIlllI, final int lllllllllllllIlIIIllIlIIIIlIllIl) {
                    return lllllllllllllIlIIIllIlIIIIlIlllI > lllllllllllllIlIIIllIlIIIIlIllIl;
                }
                
                private static boolean lIlllllIIIIlIlI(final int lllllllllllllIlIIIllIlIIIIllIIlI, final int lllllllllllllIlIIIllIlIIIIllIIIl) {
                    return lllllllllllllIlIIIllIlIIIIllIIlI <= lllllllllllllIlIIIllIlIIIIllIIIl;
                }
                
                private static void lIlllllIIIIIllI() {
                    (lIIIIllllIlIlI = new int[3])[0] = ((0xA3 ^ 0xB6) & ~(0x7F ^ 0x6A));
                    PlayerSelector$3.lIIIIllllIlIlI[1] = -" ".length();
                    PlayerSelector$3.lIIIIllllIlIlI[2] = " ".length();
                }
                
                private static boolean lIlllllIIIIlIIl(final int lllllllllllllIlIIIllIlIIIIllIllI, final int lllllllllllllIlIIIllIlIIIIllIlIl) {
                    return lllllllllllllIlIIIllIlIIIIllIllI >= lllllllllllllIlIIIllIlIIIIllIlIl;
                }
            });
            "".length();
        }
        return lllllllllllllIIIlIlllIllIIlIIIII;
    }
    
    private static boolean lllIlIIlllIIIll(final int lllllllllllllIIIlIlllIIllIllIlll, final int lllllllllllllIIIlIlllIIllIllIllI) {
        return lllllllllllllIIIlIlllIIllIllIlll <= lllllllllllllIIIlIlllIIllIllIllI;
    }
    
    private static boolean lllIlIIlllIIlIl(final int lllllllllllllIIIlIlllIIllIlIIIIl, final int lllllllllllllIIIlIlllIIllIlIIIII) {
        return lllllllllllllIIIlIlllIIllIlIIIIl != lllllllllllllIIIlIlllIIllIlIIIII;
    }
    
    private static String lllIlIIIlIlIIIl(final String lllllllllllllIIIlIlllIIlllllIIII, final String lllllllllllllIIIlIlllIIllllIllll) {
        try {
            final SecretKeySpec lllllllllllllIIIlIlllIIlllllIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIlllIIllllIllll.getBytes(StandardCharsets.UTF_8)), PlayerSelector.lIlIIllllIIIll[3]), "DES");
            final Cipher lllllllllllllIIIlIlllIIlllllIIlI = Cipher.getInstance("DES");
            lllllllllllllIIIlIlllIIlllllIIlI.init(PlayerSelector.lIlIIllllIIIll[2], lllllllllllllIIIlIlllIIlllllIIll);
            return new String(lllllllllllllIIIlIlllIIlllllIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIlllIIlllllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlIlllIIlllllIIIl) {
            lllllllllllllIIIlIlllIIlllllIIIl.printStackTrace();
            return null;
        }
    }
    
    private static Map<String, String> getArgumentMap(final String lllllllllllllIIIlIlllIlIIIIIIlII) {
        final Map<String, String> lllllllllllllIIIlIlllIlIIIIIIIll = (Map<String, String>)Maps.newHashMap();
        if (lllIlIIlllIlIll(lllllllllllllIIIlIlllIlIIIIIIlII)) {
            return lllllllllllllIIIlIlllIlIIIIIIIll;
        }
        int lllllllllllllIIIlIlllIlIIIIIIIlI = PlayerSelector.lIlIIllllIIIll[0];
        int lllllllllllllIIIlIlllIlIIIIIIIIl = PlayerSelector.lIlIIllllIIIll[21];
        final Matcher lllllllllllllIIIlIlllIlIIIIIIIII = PlayerSelector.intListPattern.matcher(lllllllllllllIIIlIlllIlIIIIIIlII);
        "".length();
        if (-" ".length() != -" ".length()) {
            return null;
        }
        while (!lllIlIIlllIIIIl(lllllllllllllIIIlIlllIlIIIIIIIII.find() ? 1 : 0)) {
            String lllllllllllllIIIlIlllIIlllllllll = null;
            switch (lllllllllllllIIIlIlllIlIIIIIIIlI++) {
                case 0: {
                    lllllllllllllIIIlIlllIIlllllllll = PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[75]];
                    "".length();
                    if (-"   ".length() >= 0) {
                        return null;
                    }
                    break;
                }
                case 1: {
                    lllllllllllllIIIlIlllIIlllllllll = PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[76]];
                    "".length();
                    if ((("   ".length() ^ (0x7 ^ 0x36)) & (66 + 91 - 146 + 138 ^ 119 + 142 - 114 + 20 ^ -" ".length())) > 0) {
                        return null;
                    }
                    break;
                }
                case 2: {
                    lllllllllllllIIIlIlllIIlllllllll = PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[77]];
                    "".length();
                    if (((0x17 ^ 0x3F) & ~(0xB5 ^ 0x9D)) != 0x0) {
                        return null;
                    }
                    break;
                }
                case 3: {
                    lllllllllllllIIIlIlllIIlllllllll = PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[78]];
                    break;
                }
            }
            if (lllIlIIlllIIIlI(lllllllllllllIIIlIlllIIlllllllll) && lllIlIIlllIIllI(lllllllllllllIIIlIlllIlIIIIIIIII.group(PlayerSelector.lIlIIllllIIIll[1]).length())) {
                lllllllllllllIIIlIlllIlIIIIIIIll.put(lllllllllllllIIIlIlllIIlllllllll, lllllllllllllIIIlIlllIlIIIIIIIII.group(PlayerSelector.lIlIIllllIIIll[1]));
                "".length();
            }
            lllllllllllllIIIlIlllIlIIIIIIIIl = lllllllllllllIIIlIlllIlIIIIIIIII.end();
        }
        if (lllIlIIlllIlIIl(lllllllllllllIIIlIlllIlIIIIIIIIl, lllllllllllllIIIlIlllIlIIIIIIlII.length())) {
            final Pattern keyValueListPattern = PlayerSelector.keyValueListPattern;
            String substring;
            if (lllIlIIllIlllll(lllllllllllllIIIlIlllIlIIIIIIIIl, PlayerSelector.lIlIIllllIIIll[21])) {
                substring = lllllllllllllIIIlIlllIlIIIIIIlII;
                "".length();
                if (-(0x2D ^ 0x78 ^ (0x20 ^ 0x70)) >= 0) {
                    return null;
                }
            }
            else {
                substring = lllllllllllllIIIlIlllIlIIIIIIlII.substring(lllllllllllllIIIlIlllIlIIIIIIIIl);
            }
            final Matcher lllllllllllllIIIlIlllIIllllllllI = keyValueListPattern.matcher(substring);
            "".length();
            if ((0x2C ^ 0x9 ^ (0x39 ^ 0x18)) <= " ".length()) {
                return null;
            }
            while (!lllIlIIlllIIIIl(lllllllllllllIIIlIlllIIllllllllI.find() ? 1 : 0)) {
                lllllllllllllIIIlIlllIlIIIIIIIll.put(lllllllllllllIIIlIlllIIllllllllI.group(PlayerSelector.lIlIIllllIIIll[1]), lllllllllllllIIIlIlllIIllllllllI.group(PlayerSelector.lIlIIllllIIIll[2]));
                "".length();
            }
        }
        return lllllllllllllIIIlIlllIlIIIIIIIll;
    }
    
    private static boolean lllIlIIlllIIllI(final int lllllllllllllIIIlIlllIIllIlIIlII) {
        return lllllllllllllIIIlIlllIIllIlIIlII > 0;
    }
    
    private static boolean func_179665_h(final Map<String, String> lllllllllllllIIIlIlllIlIIIlllIIl) {
        final byte lllllllllllllIIIlIlllIlIIIllIlll = (byte)PlayerSelector.WORLD_BINDING_ARGS.iterator();
        "".length();
        if (null != null) {
            return ((0xFE ^ 0xB8) & ~(0x9 ^ 0x4F)) != 0x0;
        }
        while (!lllIlIIlllIIIIl(((Iterator)lllllllllllllIIIlIlllIlIIIllIlll).hasNext() ? 1 : 0)) {
            final String lllllllllllllIIIlIlllIlIIIlllIlI = ((Iterator<String>)lllllllllllllIIIlIlllIlIIIllIlll).next();
            if (lllIlIIlllIIIII(lllllllllllllIIIlIlllIlIIIlllIIl.containsKey(lllllllllllllIIIlIlllIlIIIlllIlI) ? 1 : 0)) {
                return PlayerSelector.lIlIIllllIIIll[1] != 0;
            }
        }
        return PlayerSelector.lIlIIllllIIIll[0] != 0;
    }
    
    private static boolean lllIlIIlllIlIlI(final int lllllllllllllIIIlIlllIIllIllllll, final int lllllllllllllIIIlIlllIIllIlllllI) {
        return lllllllllllllIIIlIlllIIllIllllll >= lllllllllllllIIIlIlllIIllIlllllI;
    }
    
    private static BlockPos func_179664_b(final Map<String, String> lllllllllllllIIIlIlllIlIIlIIIIII, final BlockPos lllllllllllllIIIlIlllIlIIlIIIIIl) {
        return new BlockPos(parseIntWithDefault(lllllllllllllIIIlIlllIlIIlIIIIII, PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[66]], lllllllllllllIIIlIlllIlIIlIIIIIl.getX()), parseIntWithDefault(lllllllllllllIIIlIlllIlIIlIIIIII, PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[67]], lllllllllllllIIIlIlllIlIIlIIIIIl.getY()), parseIntWithDefault(lllllllllllllIIIlIlllIlIIlIIIIII, PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[68]], lllllllllllllIIIlIlllIlIIlIIIIIl.getZ()));
    }
    
    private static List<World> getWorlds(final ICommandSender lllllllllllllIIIlIlllIllIlIIllII, final Map<String, String> lllllllllllllIIIlIlllIllIlIIlllI) {
        final List<World> lllllllllllllIIIlIlllIllIlIIllIl = (List<World>)Lists.newArrayList();
        if (lllIlIIlllIIIII(func_179665_h(lllllllllllllIIIlIlllIllIlIIlllI) ? 1 : 0)) {
            lllllllllllllIIIlIlllIllIlIIllIl.add(lllllllllllllIIIlIlllIllIlIIllII.getEntityWorld());
            "".length();
            "".length();
            if (" ".length() <= -" ".length()) {
                return null;
            }
        }
        else {
            Collections.addAll(lllllllllllllIIIlIlllIllIlIIllIl, MinecraftServer.getServer().worldServers);
            "".length();
        }
        return lllllllllllllIIIlIlllIllIlIIllIl;
    }
    
    public static boolean matchesMultiplePlayers(final String lllllllllllllIIIlIlllIlIIIIlIlll) {
        final Matcher lllllllllllllIIIlIlllIlIIIIlIllI = PlayerSelector.tokenPattern.matcher(lllllllllllllIIIlIlllIlIIIIlIlll);
        if (lllIlIIlllIIIIl(lllllllllllllIIIlIlllIlIIIIlIllI.matches() ? 1 : 0)) {
            return PlayerSelector.lIlIIllllIIIll[0] != 0;
        }
        final Map<String, String> lllllllllllllIIIlIlllIlIIIIlIlIl = getArgumentMap(lllllllllllllIIIlIlllIlIIIIlIllI.group(PlayerSelector.lIlIIllllIIIll[2]));
        final String lllllllllllllIIIlIlllIlIIIIlIlII = lllllllllllllIIIlIlllIlIIIIlIllI.group(PlayerSelector.lIlIIllllIIIll[1]);
        int n;
        if (lllIlIIlllIIIIl(PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[72]].equals(lllllllllllllIIIlIlllIlIIIIlIlII) ? 1 : 0) && lllIlIIlllIIIIl(PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[73]].equals(lllllllllllllIIIlIlllIlIIIIlIlII) ? 1 : 0)) {
            n = PlayerSelector.lIlIIllllIIIll[1];
            "".length();
            if (((36 + 148 - 125 + 162 ^ 21 + 118 - 132 + 148) & (145 + 76 - 149 + 124 ^ 26 + 54 - 33 + 83 ^ -" ".length())) != 0x0) {
                return ((82 + 31 - 96 + 134 ^ 43 + 41 - 56 + 101) & (0xBF ^ 0x83 ^ (0x41 ^ 0x6B) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = PlayerSelector.lIlIIllllIIIll[0];
        }
        final int lllllllllllllIIIlIlllIlIIIIlIIll = n;
        if (lllIlIIlllIIlIl(parseIntWithDefault(lllllllllllllIIIlIlllIlIIIIlIlIl, PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[74]], lllllllllllllIIIlIlllIlIIIIlIIll), PlayerSelector.lIlIIllllIIIll[1])) {
            return PlayerSelector.lIlIIllllIIIll[1] != 0;
        }
        return PlayerSelector.lIlIIllllIIIll[0] != 0;
    }
    
    private static boolean lllIlIIlllIlIll(final Object lllllllllllllIIIlIlllIIllIlIlllI) {
        return lllllllllllllIIIlIlllIIllIlIlllI == null;
    }
    
    private static boolean lllIlIIlllIlIIl(final int lllllllllllllIIIlIlllIIllIlllIll, final int lllllllllllllIIIlIlllIIllIlllIlI) {
        return lllllllllllllIIIlIlllIIllIlllIll < lllllllllllllIIIlIlllIIllIlllIlI;
    }
    
    private static String lllIlIIIlIlIIII(final String lllllllllllllIIIlIlllIIlllIIlIIl, final String lllllllllllllIIIlIlllIIlllIIlIlI) {
        try {
            final SecretKeySpec lllllllllllllIIIlIlllIIlllIIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIlllIIlllIIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIlIlllIIlllIIllIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIIlIlllIIlllIIllIl.init(PlayerSelector.lIlIIllllIIIll[2], lllllllllllllIIIlIlllIIlllIIlllI);
            return new String(lllllllllllllIIIlIlllIIlllIIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIlllIIlllIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlIlllIIlllIIllII) {
            lllllllllllllIIIlIlllIIlllIIllII.printStackTrace();
            return null;
        }
    }
    
    private static List<Predicate<Entity>> func_179659_d(final Map<String, String> lllllllllllllIIIlIlllIllIIIIIllI) {
        final List<Predicate<Entity>> lllllllllllllIIIlIlllIllIIIIlIlI = (List<Predicate<Entity>>)Lists.newArrayList();
        String lllllllllllllIIIlIlllIllIIIIlIIl = func_179651_b(lllllllllllllIIIlIlllIllIIIIIllI, PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[24]]);
        int n;
        if (lllIlIIlllIIIlI(lllllllllllllIIIlIlllIllIIIIlIIl) && lllIlIIlllIIIII(lllllllllllllIIIlIlllIllIIIIlIIl.startsWith(PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[25]]) ? 1 : 0)) {
            n = PlayerSelector.lIlIIllllIIIll[1];
            "".length();
            if (((89 + 162 - 182 + 115 ^ 74 + 108 - 63 + 14) & (0xD9 ^ 0xAA ^ (0xD6 ^ 0x98) ^ -" ".length())) > " ".length()) {
                return null;
            }
        }
        else {
            n = PlayerSelector.lIlIIllllIIIll[0];
        }
        final boolean lllllllllllllIIIlIlllIllIIIIlIII = n != 0;
        if (lllIlIIlllIIIII(lllllllllllllIIIlIlllIllIIIIlIII ? 1 : 0)) {
            lllllllllllllIIIlIlllIllIIIIlIIl = lllllllllllllIIIlIlllIllIIIIlIIl.substring(PlayerSelector.lIlIIllllIIIll[1]);
        }
        if (lllIlIIlllIIIlI(lllllllllllllIIIlIlllIllIIIIlIIl)) {
            final String lllllllllllllIIIlIlllIllIIIIIlll = lllllllllllllIIIlIlllIllIIIIlIIl;
            lllllllllllllIIIlIlllIllIIIIlIlI.add((Predicate<Entity>)new Predicate<Entity>() {
                private static final /* synthetic */ String[] lIlIIlIIIIIlII;
                private static final /* synthetic */ int[] lIlIIlIIIIIlIl;
                
                private static boolean lllIIlIIlIIlIII(final Object lllllllllllllIIIlllIlIlllllIIIII) {
                    return lllllllllllllIIIlllIlIlllllIIIII == null;
                }
                
                private static String lllIIlIIlIIIlII(final String lllllllllllllIIIlllIlIlllllIIlIl, final String lllllllllllllIIIlllIlIlllllIIlII) {
                    try {
                        final SecretKeySpec lllllllllllllIIIlllIlIlllllIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlllIlIlllllIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                        final Cipher lllllllllllllIIIlllIlIlllllIlIIl = Cipher.getInstance("Blowfish");
                        lllllllllllllIIIlllIlIlllllIlIIl.init(PlayerSelector$5.lIlIIlIIIIIlIl[2], lllllllllllllIIIlllIlIlllllIlIlI);
                        return new String(lllllllllllllIIIlllIlIlllllIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlllIlIlllllIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                    }
                    catch (Exception lllllllllllllIIIlllIlIlllllIlIII) {
                        lllllllllllllIIIlllIlIlllllIlIII.printStackTrace();
                        return null;
                    }
                }
                
                public boolean apply(final Entity lllllllllllllIIIlllIlIlllllllIll) {
                    if (lllIIlIIlIIIlll((lllllllllllllIIIlllIlIlllllllIll instanceof EntityLivingBase) ? 1 : 0)) {
                        return PlayerSelector$5.lIlIIlIIIIIlIl[0] != 0;
                    }
                    final EntityLivingBase lllllllllllllIIIlllIlIlllllllIlI = (EntityLivingBase)lllllllllllllIIIlllIlIlllllllIll;
                    final Team lllllllllllllIIIlllIlIlllllllIIl = lllllllllllllIIIlllIlIlllllllIlI.getTeam();
                    String registeredName;
                    if (lllIIlIIlIIlIII(lllllllllllllIIIlllIlIlllllllIIl)) {
                        registeredName = PlayerSelector$5.lIlIIlIIIIIlII[PlayerSelector$5.lIlIIlIIIIIlIl[0]];
                        "".length();
                        if ("   ".length() == 0) {
                            return ((0xD1 ^ 0xC1 ^ (0x3A ^ 0x17)) & (0x8B ^ 0x92 ^ (0xA1 ^ 0x85) ^ -" ".length())) != 0x0;
                        }
                    }
                    else {
                        registeredName = lllllllllllllIIIlllIlIlllllllIIl.getRegisteredName();
                    }
                    final String lllllllllllllIIIlllIlIlllllllIII = registeredName;
                    return lllllllllllllIIIlllIlIlllllllIII.equals(lllllllllllllIIIlIlllIllIIIIIlll) ^ lllllllllllllIIIlIlllIllIIIIlIII;
                }
                
                static {
                    lllIIlIIlIIIllI();
                    lllIIlIIlIIIlIl();
                }
                
                private static void lllIIlIIlIIIlIl() {
                    (lIlIIlIIIIIlII = new String[PlayerSelector$5.lIlIIlIIIIIlIl[1]])[PlayerSelector$5.lIlIIlIIIIIlIl[0]] = lllIIlIIlIIIlII("vxuvm+ilPnE=", "ydTck");
                }
                
                private static void lllIIlIIlIIIllI() {
                    (lIlIIlIIIIIlIl = new int[3])[0] = ((0x95 ^ 0xBF) & ~(0x4C ^ 0x66));
                    PlayerSelector$5.lIlIIlIIIIIlIl[1] = " ".length();
                    PlayerSelector$5.lIlIIlIIIIIlIl[2] = "  ".length();
                }
                
                private static boolean lllIIlIIlIIIlll(final int lllllllllllllIIIlllIlIllllIllllI) {
                    return lllllllllllllIIIlllIlIllllIllllI == 0;
                }
            });
            "".length();
        }
        return lllllllllllllIIIlIlllIllIIIIlIlI;
    }
    
    private static void lllIlIIllIllllI() {
        (lIlIIllllIIIll = new int[80])[0] = ((0x38 ^ 0x17 ^ (0x4A ^ 0x6C)) & (17 + 73 + 29 + 86 ^ 61 + 133 - 18 + 20 ^ -" ".length()) & (((0x61 ^ 0x68 ^ (0xB ^ 0x4C)) & (0x1E ^ 0x33 ^ (0x5D ^ 0x3E) ^ -" ".length())) ^ -" ".length()));
        PlayerSelector.lIlIIllllIIIll[1] = " ".length();
        PlayerSelector.lIlIIllllIIIll[2] = "  ".length();
        PlayerSelector.lIlIIllllIIIll[3] = (11 + 135 - 27 + 46 ^ 16 + 168 - 36 + 25);
        PlayerSelector.lIlIIllllIIIll[4] = "   ".length();
        PlayerSelector.lIlIIllllIIIll[5] = (0x3C ^ 0x38);
        PlayerSelector.lIlIIllllIIIll[6] = (0x3 ^ 0x6);
        PlayerSelector.lIlIIllllIIIll[7] = (0xC0 ^ 0xC6);
        PlayerSelector.lIlIIllllIIIll[8] = (0x23 ^ 0x24);
        PlayerSelector.lIlIIllllIIIll[9] = (0x2C ^ 0x58 ^ (0x4F ^ 0x32));
        PlayerSelector.lIlIIllllIIIll[10] = (0x9A ^ 0xB6 ^ (0x83 ^ 0xA5));
        PlayerSelector.lIlIIllllIIIll[11] = (0x5E ^ 0x57 ^ "  ".length());
        PlayerSelector.lIlIIllllIIIll[12] = (0xD3 ^ 0xA5 ^ (0x3 ^ 0x79));
        PlayerSelector.lIlIIllllIIIll[13] = (0x6D ^ 0x60);
        PlayerSelector.lIlIIllllIIIll[14] = (0xCA ^ 0xBC ^ (0x14 ^ 0x6C));
        PlayerSelector.lIlIIllllIIIll[15] = (47 + 97 - 56 + 95 ^ 107 + 22 - 33 + 88);
        PlayerSelector.lIlIIllllIIIll[16] = (81 + 130 - 92 + 37 ^ 126 + 0 + 8 + 6);
        PlayerSelector.lIlIIllllIIIll[17] = (0x81 ^ 0x90);
        PlayerSelector.lIlIIllllIIIll[18] = (0xF3 ^ 0xB6 ^ (0x36 ^ 0x61));
        PlayerSelector.lIlIIllllIIIll[19] = (0x98 ^ 0x8B);
        PlayerSelector.lIlIIllllIIIll[20] = (0x9D ^ 0x89);
        PlayerSelector.lIlIIllllIIIll[21] = -" ".length();
        PlayerSelector.lIlIIllllIIIll[22] = (0x6D ^ 0x36 ^ (0x30 ^ 0x7E));
        PlayerSelector.lIlIIllllIIIll[23] = (0x39 ^ 0x2F);
        PlayerSelector.lIlIIllllIIIll[24] = (0x90 ^ 0x87);
        PlayerSelector.lIlIIllllIIIll[25] = (0x2D ^ 0x35);
        PlayerSelector.lIlIIllllIIIll[26] = (0x2 ^ 0x5F ^ (0x2F ^ 0x6B));
        PlayerSelector.lIlIIllllIIIll[27] = (0x62 ^ 0x78);
        PlayerSelector.lIlIIllllIIIll[28] = (0x95 ^ 0x8E);
        PlayerSelector.lIlIIllllIIIll[29] = (0x3E ^ 0x22);
        PlayerSelector.lIlIIllllIIIll[30] = (0x6C ^ 0x71);
        PlayerSelector.lIlIIllllIIIll[31] = (0xA7 ^ 0xB9);
        PlayerSelector.lIlIIllllIIIll[32] = (0xA3 ^ 0xA5 ^ (0x5 ^ 0x1C));
        PlayerSelector.lIlIIllllIIIll[33] = (0x39 ^ 0x19);
        PlayerSelector.lIlIIllllIIIll[34] = (0xFFFFA7F7 & 0x596F);
        PlayerSelector.lIlIIllllIIIll[35] = (0xBA ^ 0x9B);
        PlayerSelector.lIlIIllllIIIll[36] = (0x77 ^ 0x55);
        PlayerSelector.lIlIIllllIIIll[37] = (0x5 ^ 0x5A ^ (0x13 ^ 0x6F));
        PlayerSelector.lIlIIllllIIIll[38] = (0x5F ^ 0x7B);
        PlayerSelector.lIlIIllllIIIll[39] = (0x40 ^ 0x65);
        PlayerSelector.lIlIIllllIIIll[40] = (0xA0 ^ 0x86);
        PlayerSelector.lIlIIllllIIIll[41] = (157 + 149 - 145 + 6 ^ 59 + 53 - 59 + 75);
        PlayerSelector.lIlIIllllIIIll[42] = (97 + 137 - 99 + 54 ^ 28 + 17 - 9 + 113);
        PlayerSelector.lIlIIllllIIIll[43] = (0x55 ^ 0x69 ^ (0x45 ^ 0x50));
        PlayerSelector.lIlIIllllIIIll[44] = (0x5C ^ 0x76);
        PlayerSelector.lIlIIllllIIIll[45] = (0x4C ^ 0x67);
        PlayerSelector.lIlIIllllIIIll[46] = (0x36 ^ 0x1A);
        PlayerSelector.lIlIIllllIIIll[47] = (0xE ^ 0x2F ^ (0x60 ^ 0x6C));
        PlayerSelector.lIlIIllllIIIll[48] = (0x7E ^ 0x23 ^ (0x42 ^ 0x31));
        PlayerSelector.lIlIIllllIIIll[49] = (0x4B ^ 0x64);
        PlayerSelector.lIlIIllllIIIll[50] = (0x31 ^ 0x1);
        PlayerSelector.lIlIIllllIIIll[51] = (82 + 17 - 14 + 64 ^ 133 + 24 - 109 + 116);
        PlayerSelector.lIlIIllllIIIll[52] = (0x3 ^ 0x31);
        PlayerSelector.lIlIIllllIIIll[53] = (0x11 ^ 0x22);
        PlayerSelector.lIlIIllllIIIll[54] = (51 + 13 + 102 + 6 ^ 108 + 27 - 53 + 70);
        PlayerSelector.lIlIIllllIIIll[55] = (0xAD ^ 0xB6 ^ (0x99 ^ 0xB7));
        PlayerSelector.lIlIIllllIIIll[56] = (137 + 43 - 157 + 167 ^ 69 + 54 - 121 + 134);
        PlayerSelector.lIlIIllllIIIll[57] = (0x3D ^ 0xA);
        PlayerSelector.lIlIIllllIIIll[58] = (0x6A ^ 0x52);
        PlayerSelector.lIlIIllllIIIll[59] = (0x6E ^ 0x57);
        PlayerSelector.lIlIIllllIIIll[60] = (0xA5 ^ 0x9F);
        PlayerSelector.lIlIIllllIIIll[61] = (0x79 ^ 0x3 ^ (0xE7 ^ 0xA6));
        PlayerSelector.lIlIIllllIIIll[62] = (44 + 53 + 20 + 62 ^ 66 + 134 - 165 + 108);
        PlayerSelector.lIlIIllllIIIll[63] = (61 + 87 - 96 + 116 ^ 104 + 81 - 85 + 49);
        PlayerSelector.lIlIIllllIIIll[64] = (0xFFFFC56F & 0x3BF8);
        PlayerSelector.lIlIIllllIIIll[65] = 95 + 26 + 8 + 31;
        PlayerSelector.lIlIIllllIIIll[66] = (0x1F ^ 0x72 ^ (0x68 ^ 0x3B));
        PlayerSelector.lIlIIllllIIIll[67] = (0x14 ^ 0x5C ^ (0x2 ^ 0x75));
        PlayerSelector.lIlIIllllIIIll[68] = (0x4E ^ 0xE);
        PlayerSelector.lIlIIllllIIIll[69] = (0xB6 ^ 0xAD ^ (0x69 ^ 0x33));
        PlayerSelector.lIlIIllllIIIll[70] = (161 + 87 - 224 + 174 ^ 64 + 17 - 36 + 87);
        PlayerSelector.lIlIIllllIIIll[71] = (0x66 ^ 0x25);
        PlayerSelector.lIlIIllllIIIll[72] = (0xCF ^ 0x8B);
        PlayerSelector.lIlIIllllIIIll[73] = (0xD ^ 0x48);
        PlayerSelector.lIlIIllllIIIll[74] = (80 + 104 - 166 + 191 ^ 141 + 149 - 260 + 121);
        PlayerSelector.lIlIIllllIIIll[75] = (0x1 ^ 0x6D ^ (0x31 ^ 0x1A));
        PlayerSelector.lIlIIllllIIIll[76] = (0x74 ^ 0x3C);
        PlayerSelector.lIlIIllllIIIll[77] = (0x2D ^ 0x64);
        PlayerSelector.lIlIIllllIIIll[78] = (75 + 118 - 100 + 99 ^ 59 + 115 - 51 + 15);
        PlayerSelector.lIlIIllllIIIll[79] = (0xA9 ^ 0x87 ^ (0x72 ^ 0x17));
    }
    
    private static String lllIlIIIlIlIIlI(String lllllllllllllIIIlIlllIIlllIllIll, final String lllllllllllllIIIlIlllIIlllIllIlI) {
        lllllllllllllIIIlIlllIIlllIllIll = new String(Base64.getDecoder().decode(lllllllllllllIIIlIlllIIlllIllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIlIlllIIlllIllllI = new StringBuilder();
        final char[] lllllllllllllIIIlIlllIIlllIlllIl = lllllllllllllIIIlIlllIIlllIllIlI.toCharArray();
        int lllllllllllllIIIlIlllIIlllIlllII = PlayerSelector.lIlIIllllIIIll[0];
        final short lllllllllllllIIIlIlllIIlllIlIllI = (Object)lllllllllllllIIIlIlllIIlllIllIll.toCharArray();
        final long lllllllllllllIIIlIlllIIlllIlIlIl = lllllllllllllIIIlIlllIIlllIlIllI.length;
        boolean lllllllllllllIIIlIlllIIlllIlIlII = PlayerSelector.lIlIIllllIIIll[0] != 0;
        while (lllIlIIlllIlIIl(lllllllllllllIIIlIlllIIlllIlIlII ? 1 : 0, (int)lllllllllllllIIIlIlllIIlllIlIlIl)) {
            final char lllllllllllllIIIlIlllIIllllIIIIl = lllllllllllllIIIlIlllIIlllIlIllI[lllllllllllllIIIlIlllIIlllIlIlII];
            lllllllllllllIIIlIlllIIlllIllllI.append((char)(lllllllllllllIIIlIlllIIllllIIIIl ^ lllllllllllllIIIlIlllIIlllIlllIl[lllllllllllllIIIlIlllIIlllIlllII % lllllllllllllIIIlIlllIIlllIlllIl.length]));
            "".length();
            ++lllllllllllllIIIlIlllIIlllIlllII;
            ++lllllllllllllIIIlIlllIIlllIlIlII;
            "".length();
            if ("  ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIlIlllIIlllIllllI);
    }
    
    private static List<Predicate<Entity>> func_180698_a(final Map<String, String> lllllllllllllIIIlIlllIlIlllIIIlI, final BlockPos lllllllllllllIIIlIlllIlIllIllIlI) {
        final List<Predicate<Entity>> lllllllllllllIIIlIlllIlIlllIIIII = (List<Predicate<Entity>>)Lists.newArrayList();
        final int lllllllllllllIIIlIlllIlIllIlllll = parseIntWithDefault(lllllllllllllIIIlIlllIlIlllIIIlI, PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[28]], PlayerSelector.lIlIIllllIIIll[21]);
        final int lllllllllllllIIIlIlllIlIllIllllI = parseIntWithDefault(lllllllllllllIIIlIlllIlIlllIIIlI, PlayerSelector.lIlIIllIllllll[PlayerSelector.lIlIIllllIIIll[29]], PlayerSelector.lIlIIllllIIIll[21]);
        if (lllIlIIlllIIIlI(lllllllllllllIIIlIlllIlIllIllIlI) && (!lllIlIIlllIIlll(lllllllllllllIIIlIlllIlIllIlllll) || lllIlIIlllIlIII(lllllllllllllIIIlIlllIlIllIllllI))) {
            final int lllllllllllllIIIlIlllIlIllIlllIl = lllllllllllllIIIlIlllIlIllIlllll * lllllllllllllIIIlIlllIlIllIlllll;
            final int lllllllllllllIIIlIlllIlIllIlllII = lllllllllllllIIIlIlllIlIllIllllI * lllllllllllllIIIlIlllIlIllIllllI;
            lllllllllllllIIIlIlllIlIlllIIIII.add((Predicate<Entity>)new Predicate<Entity>() {
                private static final /* synthetic */ int[] lIIIIIlIIlIlII;
                
                private static void lIllIlIllIlllll() {
                    (lIIIIIlIIlIlII = new int[2])[0] = " ".length();
                    PlayerSelector$8.lIIIIIlIIlIlII[1] = ((0x60 ^ 0x2A) & ~(0xC1 ^ 0x8B));
                }
                
                static {
                    lIllIlIllIlllll();
                }
                
                private static boolean lIllIlIlllIIlII(final int lllllllllllllIlIIllllIllIlIllIII, final int lllllllllllllIlIIllllIllIlIlIlll) {
                    return lllllllllllllIlIIllllIllIlIllIII <= lllllllllllllIlIIllllIllIlIlIlll;
                }
                
                private static boolean lIllIlIlllIIIlI(final int lllllllllllllIlIIllllIllIlIlIlIl) {
                    return lllllllllllllIlIIllllIllIlIlIlIl >= 0;
                }
                
                public boolean apply(final Entity lllllllllllllIlIIllllIllIlllIIII) {
                    final int lllllllllllllIlIIllllIllIllIlllI = (int)lllllllllllllIlIIllllIllIlllIIII.getDistanceSqToCenter(lllllllllllllIIIlIlllIlIllIllIlI);
                    if ((!lIllIlIlllIIIlI(lllllllllllllIIIlIlllIlIllIlllll) || lIllIlIlllIIIll(lllllllllllllIlIIllllIllIllIlllI, lllllllllllllIIIlIlllIlIllIlllIl)) && (!lIllIlIlllIIIlI(lllllllllllllIIIlIlllIlIllIllllI) || lIllIlIlllIIlII(lllllllllllllIlIIllllIllIllIlllI, lllllllllllllIIIlIlllIlIllIlllII))) {
                        return PlayerSelector$8.lIIIIIlIIlIlII[0] != 0;
                    }
                    return PlayerSelector$8.lIIIIIlIIlIlII[1] != 0;
                }
                
                private static boolean lIllIlIlllIIIll(final int lllllllllllllIlIIllllIllIlIlllIl, final int lllllllllllllIlIIllllIllIlIllIll) {
                    return lllllllllllllIlIIllllIllIlIlllIl >= lllllllllllllIlIIllllIllIlIllIll;
                }
            });
            "".length();
        }
        return lllllllllllllIIIlIlllIlIlllIIIII;
    }
    
    public static int func_179650_a(int lllllllllllllIIIlIlllIlIIlIIIlIl) {
        lllllllllllllIIIlIlllIlIIlIIIlIl %= PlayerSelector.lIlIIllllIIIll[64];
        if (lllIlIIlllIlIlI(lllllllllllllIIIlIlllIlIIlIIIlIl, PlayerSelector.lIlIIllllIIIll[65])) {
            lllllllllllllIIIlIlllIlIIlIIIlIl -= 360;
        }
        if (lllIlIIlllIIlll(lllllllllllllIIIlIlllIlIIlIIIlIl)) {
            lllllllllllllIIIlIlllIlIIlIIIlIl += 360;
        }
        return lllllllllllllIIIlIlllIlIIlIIIlIl;
    }
    
    private static boolean lllIlIIlllIIlII(final int lllllllllllllIIIlIlllIIllIllIIll, final int lllllllllllllIIIlIlllIIllIllIIlI) {
        return lllllllllllllIIIlIlllIIllIllIIll > lllllllllllllIIIlIlllIIllIllIIlI;
    }
    
    private static boolean lllIlIIllIlllll(final int lllllllllllllIIIlIlllIIlllIIIIll, final int lllllllllllllIIIlIlllIIlllIIIIlI) {
        return lllllllllllllIIIlIlllIIlllIIIIll == lllllllllllllIIIlIlllIIlllIIIIlI;
    }
}
