// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.server.management;

import org.apache.logging.log4j.LogManager;
import com.mojang.authlib.Agent;
import java.util.Iterator;
import com.google.common.collect.Iterators;
import com.google.common.base.Predicate;
import net.minecraft.entity.player.EntityPlayer;
import java.util.UUID;
import java.util.Collection;
import com.mojang.authlib.GameProfile;
import java.util.List;
import com.mojang.authlib.ProfileLookupCallback;
import com.google.common.collect.Lists;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.StringUtils;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.apache.logging.log4j.Logger;
import java.io.File;

public class PreYggdrasilConverter
{
    private static final /* synthetic */ int[] llIIIIlllIllll;
    private static final /* synthetic */ Logger LOGGER;
    private static final /* synthetic */ String[] llIIIIllIIIllI;
    
    private static boolean lIIIlIIIIlllIlll(final int llllllllllllIlllIllIIllIlIlllIII) {
        return llllllllllllIlllIllIIllIlIlllIII > 0;
    }
    
    private static String lIIIlIIIIIlIIlII(final String llllllllllllIlllIllIIllIllIlIIIl, final String llllllllllllIlllIllIIllIllIlIIII) {
        try {
            final SecretKeySpec llllllllllllIlllIllIIllIllIlIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIllIIllIllIlIIII.getBytes(StandardCharsets.UTF_8)), PreYggdrasilConverter.llIIIIlllIllll[7]), "DES");
            final Cipher llllllllllllIlllIllIIllIllIlIIll = Cipher.getInstance("DES");
            llllllllllllIlllIllIIllIllIlIIll.init(PreYggdrasilConverter.llIIIIlllIllll[2], llllllllllllIlllIllIIllIllIlIlII);
            return new String(llllllllllllIlllIllIIllIllIlIIll.doFinal(Base64.getDecoder().decode(llllllllllllIlllIllIIllIllIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIllIIllIllIlIIlI) {
            llllllllllllIlllIllIIllIllIlIIlI.printStackTrace();
            return null;
        }
    }
    
    private static void lIIIlIIIIlllIIIl() {
        (llIIIIlllIllll = new int[8])[0] = ((174 + 142 - 134 + 61 ^ 89 + 154 - 147 + 66) & (173 + 42 - 180 + 185 ^ 43 + 131 - 155 + 122 ^ -" ".length()));
        PreYggdrasilConverter.llIIIIlllIllll[1] = " ".length();
        PreYggdrasilConverter.llIIIIlllIllll[2] = "  ".length();
        PreYggdrasilConverter.llIIIIlllIllll[3] = "   ".length();
        PreYggdrasilConverter.llIIIIlllIllll[4] = (0x2B ^ 0x59 ^ (0xA3 ^ 0xC1));
        PreYggdrasilConverter.llIIIIlllIllll[5] = (0x8A ^ 0x8E);
        PreYggdrasilConverter.llIIIIlllIllll[6] = (0x6A ^ 0x65 ^ (0x1D ^ 0x17));
        PreYggdrasilConverter.llIIIIlllIllll[7] = (0xC1 ^ 0x88 ^ (0xF6 ^ 0xB7));
    }
    
    private static boolean lIIIlIIIIlllIlIl(final int llllllllllllIlllIllIIllIllIIIIIl, final int llllllllllllIlllIllIIllIllIIIIII) {
        return llllllllllllIlllIllIIllIllIIIIIl <= llllllllllllIlllIllIIllIllIIIIII;
    }
    
    private static String lIIIlIIIIIlIIIlI(final String llllllllllllIlllIllIIllIllIllllI, final String llllllllllllIlllIllIIllIllIllIll) {
        try {
            final SecretKeySpec llllllllllllIlllIllIIllIlllIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIllIIllIllIllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIllIIllIlllIIIII = Cipher.getInstance("Blowfish");
            llllllllllllIlllIllIIllIlllIIIII.init(PreYggdrasilConverter.llIIIIlllIllll[2], llllllllllllIlllIllIIllIlllIIIIl);
            return new String(llllllllllllIlllIllIIllIlllIIIII.doFinal(Base64.getDecoder().decode(llllllllllllIlllIllIIllIllIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIllIIllIllIlllll) {
            llllllllllllIlllIllIIllIllIlllll.printStackTrace();
            return null;
        }
    }
    
    private static void lIIIlIIIIIlIIlIl() {
        (llIIIIllIIIllI = new String[PreYggdrasilConverter.llIIIIlllIllll[6]])[PreYggdrasilConverter.llIIIIlllIllll[0]] = lIIIlIIIIIlIIIIl("IzIjKi4lfiQ0OG8nNTA=", "ASMDK");
        PreYggdrasilConverter.llIIIIllIIIllI[PreYggdrasilConverter.llIIIIlllIllll[1]] = lIIIlIIIIIlIIIlI("UR+rpOyfimJHAjwee4NWkXPThe5La/vW", "DAdas");
        PreYggdrasilConverter.llIIIIllIIIllI[PreYggdrasilConverter.llIIIIlllIllll[2]] = lIIIlIIIIIlIIIlI("MTN+AXdYKp8=", "HbbVn");
        PreYggdrasilConverter.llIIIIllIIIllI[PreYggdrasilConverter.llIIIIlllIllll[3]] = lIIIlIIIIIlIIlII("faH0n7WQ4JTD+3b/Rws29A==", "xMcGR");
        PreYggdrasilConverter.llIIIIllIIIllI[PreYggdrasilConverter.llIIIIlllIllll[5]] = lIIIlIIIIIlIIlII("AdumW7iInGU=", "RrMXp");
    }
    
    public static String getStringUUIDFromName(final String llllllllllllIlllIllIIlllIIIIIlll) {
        if (!lIIIlIIIIlllIlII(StringUtils.isNullOrEmpty(llllllllllllIlllIllIIlllIIIIIlll) ? 1 : 0) || !lIIIlIIIIlllIlIl(llllllllllllIlllIllIIlllIIIIIlll.length(), PreYggdrasilConverter.llIIIIlllIllll[4])) {
            return llllllllllllIlllIllIIlllIIIIIlll;
        }
        final MinecraftServer llllllllllllIlllIllIIlllIIIIIllI = MinecraftServer.getServer();
        final GameProfile llllllllllllIlllIllIIlllIIIIIlIl = llllllllllllIlllIllIIlllIIIIIllI.getPlayerProfileCache().getGameProfileForUsername(llllllllllllIlllIllIIlllIIIIIlll);
        if (lIIIlIIIIlllIllI(llllllllllllIlllIllIIlllIIIIIlIl) && lIIIlIIIIlllIllI(llllllllllllIlllIllIIlllIIIIIlIl.getId())) {
            return llllllllllllIlllIllIIlllIIIIIlIl.getId().toString();
        }
        if (lIIIlIIIIlllIlII(llllllllllllIlllIllIIlllIIIIIllI.isSinglePlayer() ? 1 : 0) && lIIIlIIIIlllIIlI(llllllllllllIlllIllIIlllIIIIIllI.isServerInOnlineMode() ? 1 : 0)) {
            final List<GameProfile> llllllllllllIlllIllIIlllIIIIIlII = (List<GameProfile>)Lists.newArrayList();
            final ProfileLookupCallback llllllllllllIlllIllIIlllIIIIIIll = (ProfileLookupCallback)new ProfileLookupCallback() {
                private static final /* synthetic */ int[] lIIIlIIIIlIllI;
                private static final /* synthetic */ String[] lIIIlIIIIlIlIl;
                
                public void onProfileLookupFailed(final GameProfile lllllllllllllIlIIIllIIlllIIIIIlI, final Exception lllllllllllllIlIIIllIIllIlllllll) {
                    PreYggdrasilConverter.LOGGER.warn(String.valueOf(new StringBuilder(PreYggdrasilConverter$2.lIIIlIIIIlIlIl[PreYggdrasilConverter$2.lIIIlIIIIlIllI[0]]).append(lllllllllllllIlIIIllIIlllIIIIIlI.getName())), (Throwable)lllllllllllllIlIIIllIIllIlllllll);
                }
                
                private static void lIlllllIIIlIlII() {
                    (lIIIlIIIIlIllI = new int[4])[0] = ((0x5 ^ 0x1D ^ (0x61 ^ 0x51)) & (0x24 ^ 0x21 ^ (0xAC ^ 0x81) ^ -" ".length()));
                    PreYggdrasilConverter$2.lIIIlIIIIlIllI[1] = " ".length();
                    PreYggdrasilConverter$2.lIIIlIIIIlIllI[2] = (18 + 97 - 13 + 102 ^ 78 + 123 - 175 + 170);
                    PreYggdrasilConverter$2.lIIIlIIIIlIllI[3] = "  ".length();
                }
                
                private static void lIlllllIIIlIIIl() {
                    (lIIIlIIIIlIlIl = new String[PreYggdrasilConverter$2.lIIIlIIIIlIllI[1]])[PreYggdrasilConverter$2.lIIIlIIIIlIllI[0]] = lIlllllIIIlIIII("pyR22FhW51B846UcSJiqHXCIzay0A6DUO6woOrsaJ/7OeppuuIp9giRW1/IvJ6/G", "xzqEA");
                }
                
                public void onProfileLookupSucceeded(final GameProfile lllllllllllllIlIIIllIIlllIIIIllI) {
                    llllllllllllIlllIllIIlllIIIIIllI.getPlayerProfileCache().addEntry(lllllllllllllIlIIIllIIlllIIIIllI);
                    llllllllllllIlllIllIIlllIIIIIlII.add(lllllllllllllIlIIIllIIlllIIIIllI);
                    "".length();
                }
                
                static {
                    lIlllllIIIlIlII();
                    lIlllllIIIlIIIl();
                }
                
                private static String lIlllllIIIlIIII(final String lllllllllllllIlIIIllIIllIlllIlIl, final String lllllllllllllIlIIIllIIllIlllIlII) {
                    try {
                        final SecretKeySpec lllllllllllllIlIIIllIIllIllllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIllIIllIlllIlII.getBytes(StandardCharsets.UTF_8)), PreYggdrasilConverter$2.lIIIlIIIIlIllI[2]), "DES");
                        final Cipher lllllllllllllIlIIIllIIllIllllIIl = Cipher.getInstance("DES");
                        lllllllllllllIlIIIllIIllIllllIIl.init(PreYggdrasilConverter$2.lIIIlIIIIlIllI[3], lllllllllllllIlIIIllIIllIllllIlI);
                        return new String(lllllllllllllIlIIIllIIllIllllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIllIIllIlllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                    }
                    catch (Exception lllllllllllllIlIIIllIIllIllllIII) {
                        lllllllllllllIlIIIllIIllIllllIII.printStackTrace();
                        return null;
                    }
                }
            };
            final MinecraftServer llllllllllllIlllIllIIlllIIIlllIl = llllllllllllIlllIllIIlllIIIIIllI;
            final String[] array = new String[PreYggdrasilConverter.llIIIIlllIllll[1]];
            array[PreYggdrasilConverter.llIIIIlllIllll[0]] = llllllllllllIlllIllIIlllIIIIIlll;
            lookupNames(llllllllllllIlllIllIIlllIIIlllIl, Lists.newArrayList((Object[])array), llllllllllllIlllIllIIlllIIIIIIll);
            String string;
            if (lIIIlIIIIlllIlll(llllllllllllIlllIllIIlllIIIIIlII.size()) && lIIIlIIIIlllIllI(llllllllllllIlllIllIIlllIIIIIlII.get(PreYggdrasilConverter.llIIIIlllIllll[0]).getId())) {
                string = llllllllllllIlllIllIIlllIIIIIlII.get(PreYggdrasilConverter.llIIIIlllIllll[0]).getId().toString();
                "".length();
                if ("   ".length() <= 0) {
                    return null;
                }
            }
            else {
                string = PreYggdrasilConverter.llIIIIllIIIllI[PreYggdrasilConverter.llIIIIlllIllll[5]];
            }
            return string;
        }
        return EntityPlayer.getUUID(new GameProfile((UUID)null, llllllllllllIlllIllIIlllIIIIIlll)).toString();
    }
    
    private static boolean lIIIlIIIIlllIllI(final Object llllllllllllIlllIllIIllIlIlllllI) {
        return llllllllllllIlllIllIIllIlIlllllI != null;
    }
    
    private static void lookupNames(final MinecraftServer llllllllllllIlllIllIIlllIIIlllIl, final Collection<String> llllllllllllIlllIllIIlllIIIlllII, final ProfileLookupCallback llllllllllllIlllIllIIlllIIIllIll) {
        final String[] llllllllllllIlllIllIIlllIIIllIlI = (String[])Iterators.toArray((Iterator)Iterators.filter((Iterator)llllllllllllIlllIllIIlllIIIlllII.iterator(), (Predicate)new Predicate<String>() {
            private static final /* synthetic */ int[] llIIllIlllllIl;
            
            private static boolean lIIIllllIIlllllI(final int llllllllllllIllIllllllIIIlllIllI) {
                return llllllllllllIllIllllllIIIlllIllI != 0;
            }
            
            private static void lIIIllllIIllllIl() {
                (llIIllIlllllIl = new int[2])[0] = ((0x15 ^ 0x7B ^ (0x48 ^ 0x6F)) & (142 + 136 - 155 + 69 ^ 89 + 116 - 145 + 77 ^ -" ".length()));
                PreYggdrasilConverter$1.llIIllIlllllIl[1] = " ".length();
            }
            
            static {
                lIIIllllIIllllIl();
            }
            
            public boolean apply(final String llllllllllllIllIllllllIIIlllllIl) {
                int n;
                if (lIIIllllIIlllllI(StringUtils.isNullOrEmpty(llllllllllllIllIllllllIIIlllllIl) ? 1 : 0)) {
                    n = PreYggdrasilConverter$1.llIIllIlllllIl[0];
                    "".length();
                    if (null != null) {
                        return ((0x9F ^ 0xAB) & ~(0x1E ^ 0x2A)) != 0x0;
                    }
                }
                else {
                    n = PreYggdrasilConverter$1.llIIllIlllllIl[1];
                }
                return n != 0;
            }
        }), (Class)String.class);
        if (lIIIlIIIIlllIIlI(llllllllllllIlllIllIIlllIIIlllIl.isServerInOnlineMode() ? 1 : 0)) {
            llllllllllllIlllIllIIlllIIIlllIl.getGameProfileRepository().findProfilesByNames(llllllllllllIlllIllIIlllIIIllIlI, Agent.MINECRAFT, llllllllllllIlllIllIIlllIIIllIll);
            "".length();
            if (-(0x17 ^ 0x13) > 0) {
                return;
            }
        }
        else {
            final int llllllllllllIlllIllIIlllIIIIllll;
            final boolean llllllllllllIlllIllIIlllIIIlIIII = ((String[])(Object)(llllllllllllIlllIllIIlllIIIIllll = (int)(Object)llllllllllllIlllIllIIlllIIIllIlI)).length != 0;
            int llllllllllllIlllIllIIlllIIIlIIIl = PreYggdrasilConverter.llIIIIlllIllll[0];
            "".length();
            if ((0xC0 ^ 0xC5 ^ " ".length()) <= "   ".length()) {
                return;
            }
            while (!lIIIlIIIIlllIIll(llllllllllllIlllIllIIlllIIIlIIIl, llllllllllllIlllIllIIlllIIIlIIII ? 1 : 0)) {
                final String llllllllllllIlllIllIIlllIIIllIIl = llllllllllllIlllIllIIlllIIIIllll[llllllllllllIlllIllIIlllIIIlIIIl];
                final UUID llllllllllllIlllIllIIlllIIIllIII = EntityPlayer.getUUID(new GameProfile((UUID)null, llllllllllllIlllIllIIlllIIIllIIl));
                final GameProfile llllllllllllIlllIllIIlllIIIlIlll = new GameProfile(llllllllllllIlllIllIIlllIIIllIII, llllllllllllIlllIllIIlllIIIllIIl);
                llllllllllllIlllIllIIlllIIIllIll.onProfileLookupSucceeded(llllllllllllIlllIllIIlllIIIlIlll);
                ++llllllllllllIlllIllIIlllIIIlIIIl;
            }
        }
    }
    
    private static boolean lIIIlIIIIlllIIlI(final int llllllllllllIlllIllIIllIlIllllII) {
        return llllllllllllIlllIllIIllIlIllllII != 0;
    }
    
    private static boolean lIIIlIIIIllllIII(final int llllllllllllIlllIllIIllIllIIIlIl, final int llllllllllllIlllIllIIllIllIIIlII) {
        return llllllllllllIlllIllIIllIllIIIlIl < llllllllllllIlllIllIIllIllIIIlII;
    }
    
    static {
        lIIIlIIIIlllIIIl();
        lIIIlIIIIIlIIlIl();
        LOGGER = LogManager.getLogger();
        OLD_IPBAN_FILE = new File(PreYggdrasilConverter.llIIIIllIIIllI[PreYggdrasilConverter.llIIIIlllIllll[0]]);
        OLD_PLAYERBAN_FILE = new File(PreYggdrasilConverter.llIIIIllIIIllI[PreYggdrasilConverter.llIIIIlllIllll[1]]);
        OLD_OPS_FILE = new File(PreYggdrasilConverter.llIIIIllIIIllI[PreYggdrasilConverter.llIIIIlllIllll[2]]);
        OLD_WHITELIST_FILE = new File(PreYggdrasilConverter.llIIIIllIIIllI[PreYggdrasilConverter.llIIIIlllIllll[3]]);
    }
    
    private static boolean lIIIlIIIIlllIlII(final int llllllllllllIlllIllIIllIlIlllIlI) {
        return llllllllllllIlllIllIIllIlIlllIlI == 0;
    }
    
    private static boolean lIIIlIIIIlllIIll(final int llllllllllllIlllIllIIllIllIIlIIl, final int llllllllllllIlllIllIIllIllIIlIII) {
        return llllllllllllIlllIllIIllIllIIlIIl >= llllllllllllIlllIllIIllIllIIlIII;
    }
    
    private static String lIIIlIIIIIlIIIIl(String llllllllllllIlllIllIIllIlllIlllI, final String llllllllllllIlllIllIIllIlllIllIl) {
        llllllllllllIlllIllIIllIlllIlllI = new String(Base64.getDecoder().decode(llllllllllllIlllIllIIllIlllIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIllIIllIllllIIIl = new StringBuilder();
        final char[] llllllllllllIlllIllIIllIllllIIII = llllllllllllIlllIllIIllIlllIllIl.toCharArray();
        int llllllllllllIlllIllIIllIlllIllll = PreYggdrasilConverter.llIIIIlllIllll[0];
        final Exception llllllllllllIlllIllIIllIlllIlIIl = (Object)llllllllllllIlllIllIIllIlllIlllI.toCharArray();
        final double llllllllllllIlllIllIIllIlllIlIII = llllllllllllIlllIllIIllIlllIlIIl.length;
        double llllllllllllIlllIllIIllIlllIIlll = PreYggdrasilConverter.llIIIIlllIllll[0];
        while (lIIIlIIIIllllIII((int)llllllllllllIlllIllIIllIlllIIlll, (int)llllllllllllIlllIllIIllIlllIlIII)) {
            final char llllllllllllIlllIllIIllIllllIlII = llllllllllllIlllIllIIllIlllIlIIl[llllllllllllIlllIllIIllIlllIIlll];
            llllllllllllIlllIllIIllIllllIIIl.append((char)(llllllllllllIlllIllIIllIllllIlII ^ llllllllllllIlllIllIIllIllllIIII[llllllllllllIlllIllIIllIlllIllll % llllllllllllIlllIllIIllIllllIIII.length]));
            "".length();
            ++llllllllllllIlllIllIIllIlllIllll;
            ++llllllllllllIlllIllIIllIlllIIlll;
            "".length();
            if ("   ".length() < " ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIllIIllIllllIIIl);
    }
}
