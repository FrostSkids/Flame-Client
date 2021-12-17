// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.main;

import net.minecraft.util.Session;
import java.net.Proxy;
import com.mojang.authlib.properties.PropertyMap;
import java.io.File;

public class GameConfiguration
{
    public final /* synthetic */ FolderInformation folderInfo;
    public final /* synthetic */ DisplayInformation displayInfo;
    public final /* synthetic */ UserInformation userInfo;
    public final /* synthetic */ ServerInformation serverInfo;
    public final /* synthetic */ GameInformation gameInfo;
    
    public GameConfiguration(final UserInformation llllllllllllIllIllIIlIIIIIlIIlIl, final DisplayInformation llllllllllllIllIllIIlIIIIIIllllI, final FolderInformation llllllllllllIllIllIIlIIIIIIlllIl, final GameInformation llllllllllllIllIllIIlIIIIIlIIIlI, final ServerInformation llllllllllllIllIllIIlIIIIIlIIIIl) {
        this.userInfo = llllllllllllIllIllIIlIIIIIlIIlIl;
        this.displayInfo = llllllllllllIllIllIIlIIIIIIllllI;
        this.folderInfo = llllllllllllIllIllIIlIIIIIIlllIl;
        this.gameInfo = llllllllllllIllIllIIlIIIIIlIIIlI;
        this.serverInfo = llllllllllllIllIllIIlIIIIIlIIIIl;
    }
    
    public static class DisplayInformation
    {
        public final /* synthetic */ boolean fullscreen;
        public final /* synthetic */ boolean checkGlErrors;
        public final /* synthetic */ int width;
        public final /* synthetic */ int height;
        
        public DisplayInformation(final int llllllllllllIllllIIlllIlllIllIlI, final int llllllllllllIllllIIlllIlllIllllI, final boolean llllllllllllIllllIIlllIlllIlllIl, final boolean llllllllllllIllllIIlllIlllIlIlll) {
            this.width = llllllllllllIllllIIlllIlllIllIlI;
            this.height = llllllllllllIllllIIlllIlllIllllI;
            this.fullscreen = llllllllllllIllllIIlllIlllIlllIl;
            this.checkGlErrors = llllllllllllIllllIIlllIlllIlIlll;
        }
    }
    
    public static class ServerInformation
    {
        public final /* synthetic */ String serverName;
        public final /* synthetic */ int serverPort;
        
        public ServerInformation(final String llllllllllllIlllIIlIIlIlIIlllIlI, final int llllllllllllIlllIIlIIlIlIIlllIIl) {
            this.serverName = llllllllllllIlllIIlIIlIlIIlllIlI;
            this.serverPort = llllllllllllIlllIIlIIlIlIIlllIIl;
        }
    }
    
    public static class GameInformation
    {
        public final /* synthetic */ boolean isDemo;
        public final /* synthetic */ String version;
        
        public GameInformation(final boolean llllllllllllIlllIIIIIIllllIIllll, final String llllllllllllIlllIIIIIIllllIIlllI) {
            this.isDemo = llllllllllllIlllIIIIIIllllIIllll;
            this.version = llllllllllllIlllIIIIIIllllIIlllI;
        }
    }
    
    public static class FolderInformation
    {
        public final /* synthetic */ String assetIndex;
        public final /* synthetic */ File mcDataDir;
        public final /* synthetic */ File assetsDir;
        public final /* synthetic */ File resourcePacksDir;
        
        public FolderInformation(final File llllllllllllIllllIIIIlIlIIlllIII, final File llllllllllllIllllIIIIlIlIIllllII, final File llllllllllllIllllIIIIlIlIIlllIll, final String llllllllllllIllllIIIIlIlIIlllIlI) {
            this.mcDataDir = llllllllllllIllllIIIIlIlIIlllIII;
            this.resourcePacksDir = llllllllllllIllllIIIIlIlIIllllII;
            this.assetsDir = llllllllllllIllllIIIIlIlIIlllIll;
            this.assetIndex = llllllllllllIllllIIIIlIlIIlllIlI;
        }
    }
    
    public static class UserInformation
    {
        public final /* synthetic */ PropertyMap field_181172_c;
        public final /* synthetic */ Proxy proxy;
        public final /* synthetic */ PropertyMap userProperties;
        public final /* synthetic */ Session session;
        
        public UserInformation(final Session llllllllllllIllIIIIIlIlllllllIII, final PropertyMap llllllllllllIllIIIIIlIllllllIlll, final PropertyMap llllllllllllIllIIIIIlIllllllIllI, final Proxy llllllllllllIllIIIIIlIllllllIlIl) {
            this.session = llllllllllllIllIIIIIlIlllllllIII;
            this.userProperties = llllllllllllIllIIIIIlIllllllIlll;
            this.field_181172_c = llllllllllllIllIIIIIlIllllllIllI;
            this.proxy = llllllllllllIllIIIIIlIllllllIlIl;
        }
    }
}
