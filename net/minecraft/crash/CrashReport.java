// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.crash;

import java.util.Iterator;
import net.minecraft.world.gen.layer.IntCache;
import java.lang.management.RuntimeMXBean;
import java.lang.management.ManagementFactory;
import java.util.concurrent.Callable;
import org.apache.commons.io.IOUtils;
import java.io.Writer;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Date;
import java.text.SimpleDateFormat;
import org.apache.commons.lang3.ArrayUtils;
import java.util.Arrays;
import net.minecraft.util.ReportedException;
import org.apache.logging.log4j.LogManager;
import com.google.common.collect.Lists;
import java.io.FileWriter;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.io.File;
import java.util.List;
import org.apache.logging.log4j.Logger;

public class CrashReport
{
    private final /* synthetic */ CrashReportCategory theReportCategory;
    private static final /* synthetic */ int[] lIlIIlIIIIIlll;
    private static final /* synthetic */ Logger logger;
    private final /* synthetic */ List<CrashReportCategory> crashReportSections;
    private /* synthetic */ boolean field_85059_f;
    private final /* synthetic */ String description;
    private /* synthetic */ StackTraceElement[] stacktrace;
    private /* synthetic */ File crashReportFile;
    private final /* synthetic */ Throwable cause;
    private static final /* synthetic */ String[] lIlIIIllllllIl;
    
    private static String lllIIlIIIllllII(final String lllllllllllllIIIlllIlIllIIlIllll, final String lllllllllllllIIIlllIlIllIIlIlllI) {
        try {
            final SecretKeySpec lllllllllllllIIIlllIlIllIIllIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlllIlIllIIlIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIlllIlIllIIllIIll = Cipher.getInstance("Blowfish");
            lllllllllllllIIIlllIlIllIIllIIll.init(CrashReport.lIlIIlIIIIIlll[2], lllllllllllllIIIlllIlIllIIllIlII);
            return new String(lllllllllllllIIIlllIlIllIIllIIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlllIlIllIIlIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlllIlIllIIllIIlI) {
            lllllllllllllIIIlllIlIllIIllIIlI.printStackTrace();
            return null;
        }
    }
    
    private static void lllIIlIIlIIlIlI() {
        (lIlIIIllllllIl = new String[CrashReport.lIlIIlIIIIIlll[65]])[CrashReport.lIlIIlIIIIIlll[0]] = lllIIlIIIlllIIl("E+CzO0uajeh49mZHtf5Ltg==", "iIEhJ");
        CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[1]] = lllIIlIIIlllIll("OS4tFhEGJiUHUiIiMQAbGyk=", "tGCsr");
        CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[2]] = lllIIlIIIlllIIl("tDOZ6bpVyQV86dA3ZKYAA80ULu36+Csh", "iZzAr");
        CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[3]] = lllIIlIIIlllIIl("s4u9MuDH+aivfpaR2fMYSA==", "BGbOy");
        CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[4]] = lllIIlIIIlllIIl("q+N5D6adl11X+tI+GX7thw==", "ajGlk");
        CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[5]] = lllIIlIIIllllII("oYGq0+S0zLA=", "qxvin");
        CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[6]] = lllIIlIIIllllII("q/teO3Y7tUlPOr5wkA4peg==", "pXgfz");
        CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[7]] = lllIIlIIIlllIll("ChQFIiwgEhQ=", "CzqaM");
        CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[8]] = lllIIlIIIlllIll("RF5xPTQIF3FYfGM=", "isQuQ");
        CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[9]] = lllIIlIIIlllIIl("HjVHX0pDPt2SaWO6xXuGyA==", "ChlQR");
        CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[10]] = lllIIlIIIlllIIl("v3R/xyZmKYM=", "kCbIa");
        CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[11]] = lllIIlIIIlllIll("AjF5", "cEYiT");
        CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[12]] = lllIIlIIIlllIll("Ww==", "QcLpS");
        CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[13]] = lllIIlIIIlllIll("ZQ==", "oBAbg");
        CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[14]] = lllIIlIIIllllII("JrCNZ/c+rnQ=", "MHtMn");
        CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[15]] = lllIIlIIIllllII("AfyCAn7ghSrzsAW5Ov0cCcez3sQJfrFPu3cs0B2WTolbpIXRNWkh+A==", "PklZJ");
        CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[16]] = lllIIlIIIlllIll("bWNI", "BLhyh");
        CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[17]] = lllIIlIIIllllII("qzHhIAI61OQ=", "rdAmX");
        CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[18]] = lllIIlIIIlllIIl("eEVW+mY9+74=", "MEkig");
        CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[19]] = lllIIlIIIlllIll("XQ==", "WirQb");
        CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[20]] = lllIIlIIIlllIll("PiI0KxMTNzMhDhR9Zw==", "zGGHa");
        CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[21]] = lllIIlIIIlllIIl("JT3dDzB0hpU=", "BKVjQ");
        CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[22]] = lllIIlIIIlllIIl("v2rBDmdxnqMlwXbdziQ16+qkVLIDTUtP6d7WZpFui7kD02hiZ7aM2WH5eaoLwvvxMvPBP+Iicxg6sKKgoOh8Dd3stNeRjUktvPhhY6OpHlxWfZGbLVXarSvl6WaIIpkI", "fSxvu");
        CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[23]] = lllIIlIIIlllIIl("9RKOSFpqZB8=", "FNdye");
        CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[25]] = lllIIlIIIllllII("F8/doA5ztso=", "VOjHy");
        CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[26]] = lllIIlIIIlllIll("MTsTIjBSOgk6dAE1ECt0ESYHPTxSJgM+OwAgRjo7Ug==", "rTfNT");
        CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[27]] = lllIIlIIIlllIll("Bi4AFBUhPQJVCCYvAg1BISVHFhMpOA9VEy07CAcVaCMGGwUkLhVVSQ==", "HKgua");
        CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[28]] = lllIIlIIIlllIll("dQ==", "ZCMtY");
        CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[29]] = lllIIlIIIlllIll("Rg==", "oQbEk");
        CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[31]] = lllIIlIIIlllIll("EyUkSwAhOWseAGQ4O0sHLChrPz0Qcg==", "DMKks");
        CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[32]] = lllIIlIIIlllIIl("r0Y4WClyXK6TS6KHnenIk3Occ38OqUUTRp/Ivb3fDjn2NSrjZQeu+HU0G3oMd8AKBjkRHcI+ul8gESt8nm/u4UJOaye4vH2o", "hVXTT");
        CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[33]] = lllIIlIIIllllII("kjLhRvd7Qftl4iCokSJYvyItHN3vmVdW", "DQuGz");
        CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[34]] = lllIIlIIIlllIIl("ss+Ct1HhWYU=", "cQklb");
        CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[35]] = lllIIlIIIlllIll("GgotSiAkBnQTKzhCMAVkOQo1Hns=", "MbTjD");
        CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[30]] = lllIIlIIIllllII("paTs7ZNZjE0Uc1rxovOjMWmwYD0Xz2yK", "TXNuJ");
        CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[36]] = lllIIlIIIlllIIl("3HB7uO85tfY=", "uoipL");
        CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[37]] = lllIIlIIIllllII("8ZV8Rd/8WHNWzwkxZkbhUbcZ814PqVM7", "QLoiM");
        CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[38]] = lllIIlIIIlllIIl("5swvlY6jrMcKhajkjn3v845DTOTUzkCfg1j0L3myE6s=", "InVBd");
        CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[39]] = lllIIlIIIlllIIl("+lHjsPz+QvbDavblpUz9A5jaxJ7rhVoXovqS2qzVeMw6GWcyowpcd1/m5RgmtRsD", "MFXbv");
        CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[40]] = lllIIlIIIlllIll("PSc7NhZVZjYkBgo/fGtB", "yFREo");
        CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[41]] = lllIIlIIIlllIll("IAdlXEwmTy4fAxhPMhkNG08MUQgGC2UGHgABIlA=", "ooEql");
        CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[42]] = lllIIlIIIlllIIl("vS81Ur8nfKjWJxLQow4NP3LD78a7L6vSeVAWDweQyKI=", "YwROG");
        CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[43]] = lllIIlIIIlllIll("GW4jDRU9K2ElHT4gJBMWPyAkTw==", "PNAat");
        CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[44]] = lllIIlIIIlllIll("MQEYegMAARg2FEgaHyNQBxsfegMBHRk/AkgJDDcVRE4gMx4LCx87FhxP", "hnmZp");
        CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[45]] = lllIIlIIIllllII("T56hXoXrvkwMf9D3wcfjLXTAPGTdZ6SE3p0G392+NiEgjODrFM9sBiC9NnQmF+yN37Dz0pksmts=", "SeaZx");
        CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[46]] = lllIIlIIIllllII("hEMuD1y9SIfZOe2r+HcT9NBRHPpeWTrNSOiQFQ3esyo=", "MEqhg");
        CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[47]] = lllIIlIIIlllIll("ImYwADYfZj4aK0wyeh4rBDF6Ai0KMnoCIAUyegI3BCg9VX9D", "kFZuE");
        CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[48]] = lllIIlIIIlllIIl("tzoJzkXM4jkgWAsVmO8HOb6jzmbgqY1Y", "eVxRJ");
        CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[49]] = lllIIlIIIlllIIl("elo5mz2ZlCgzCMKBQdEf4TEEPz5qVphM/voADgqQlxkGn7RjUuLtJagfy/XEtaq1j4+QE3pYxl8=", "OUBiR");
        CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[50]] = lllIIlIIIlllIll("C0Y0Eh5iJS8bBSwVdgAFNwoyGU02Rj4WHCdGIh8DMUYmBQUgCjMaRA==", "BfVwj");
        CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[51]] = lllIIlIIIlllIll("OAw1PwBLWW8=", "kcGMy");
        CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[52]] = lllIIlIIIlllIIl("iPX6H+4X2nvP3vXF4qJsp86VBZFG1gh2v5GshIh/uJL0MnKDzTjq0A==", "vxwZr");
        CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[53]] = lllIIlIIIlllIIl("PsmbpJz7djB2yjQNfydxxONgnXq9JduabNlxcZAyGuE=", "qDrYx");
        CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[54]] = lllIIlIIIlllIIl("xGddzzScP1jiv5D7N0eeCtu5uTkNkYqaKgLpNNe6zlc5UB8hPOKZn1LiELg8fBsK", "wMgMb");
        CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[55]] = lllIIlIIIlllIIl("chV541BNolVexxfrTYmIpQ==", "ZuxvC");
        CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[56]] = lllIIlIIIlllIIl("8A7PmIiVs02XOP5544dYYDHXGbXNnUDe74FvQRZfeq0=", "MANgG");
        CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[57]] = lllIIlIIIllllII("DkQ0oIqtaFwTOhNS2f8TIft7oCE50CfP", "EUeeL");
        CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[58]] = lllIIlIIIllllII("fIAUWSXmh+fKOMGgvgV2KQ==", "GsYgb");
        CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[59]] = lllIIlIIIlllIIl("pTGe4Kup0tNpWHL0rytbJpMqC/nt+aCr", "RnMlG");
        CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[60]] = lllIIlIIIllllII("bQwGpFbrZ03mcoq3lLFFnQ==", "jZNwI");
        CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[61]] = lllIIlIIIlllIll("BCYbEHo5PVICeiQhGQY0cCgdEXphbhQRPzVuGhY9fm4gBj41Kx9DOyRuCwwvIm4cBjsiKwEXeh0hGAI0Nz0GAmBwFQwdEgUJDB0H", "PNrcZ");
        CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[62]] = lllIIlIIIlllIll("OxkOOCpPEBkvbwkeHjhvAxgMIjscUA==", "oqkJO");
        CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[63]] = lllIIlIIIllllII("Lh1xJ/vrPDmIF51/LqLRHCQxnyHCrnT8xfRH4pvoRSY=", "GDgNa");
        CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[64]] = lllIIlIIIlllIll("FBsDHChjERgFPCYcA0gkLRMBCTgvExUENGNIXw==", "CrwhQ");
    }
    
    private static String lllIIlIIIlllIll(String lllllllllllllIIIlllIlIllIlIlIIll, final String lllllllllllllIIIlllIlIllIlIlIIlI) {
        lllllllllllllIIIlllIlIllIlIlIIll = new String(Base64.getDecoder().decode(lllllllllllllIIIlllIlIllIlIlIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIlllIlIllIlIlIIIl = new StringBuilder();
        final char[] lllllllllllllIIIlllIlIllIlIlIIII = lllllllllllllIIIlllIlIllIlIlIIlI.toCharArray();
        int lllllllllllllIIIlllIlIllIlIIllll = CrashReport.lIlIIlIIIIIlll[0];
        final int lllllllllllllIIIlllIlIllIlIIlIIl = (Object)lllllllllllllIIIlllIlIllIlIlIIll.toCharArray();
        final short lllllllllllllIIIlllIlIllIlIIlIII = (short)lllllllllllllIIIlllIlIllIlIIlIIl.length;
        short lllllllllllllIIIlllIlIllIlIIIlll = (short)CrashReport.lIlIIlIIIIIlll[0];
        while (lllIIlIIlIlllll(lllllllllllllIIIlllIlIllIlIIIlll, lllllllllllllIIIlllIlIllIlIIlIII)) {
            final char lllllllllllllIIIlllIlIllIlIlIlII = lllllllllllllIIIlllIlIllIlIIlIIl[lllllllllllllIIIlllIlIllIlIIIlll];
            lllllllllllllIIIlllIlIllIlIlIIIl.append((char)(lllllllllllllIIIlllIlIllIlIlIlII ^ lllllllllllllIIIlllIlIllIlIlIIII[lllllllllllllIIIlllIlIllIlIIllll % lllllllllllllIIIlllIlIllIlIlIIII.length]));
            "".length();
            ++lllllllllllllIIIlllIlIllIlIIllll;
            ++lllllllllllllIIIlllIlIllIlIIIlll;
            "".length();
            if ("   ".length() < "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIlllIlIllIlIlIIIl);
    }
    
    private static String getWittyComment() {
        final String[] array = new String[CrashReport.lIlIIlIIIIIlll[30]];
        array[CrashReport.lIlIIlIIIIIlll[0]] = CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[31]];
        array[CrashReport.lIlIIlIIIIIlll[1]] = CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[32]];
        array[CrashReport.lIlIIlIIIIIlll[2]] = CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[33]];
        array[CrashReport.lIlIIlIIIIIlll[3]] = CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[34]];
        array[CrashReport.lIlIIlIIIIIlll[4]] = CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[35]];
        array[CrashReport.lIlIIlIIIIIlll[5]] = CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[30]];
        array[CrashReport.lIlIIlIIIIIlll[6]] = CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[36]];
        array[CrashReport.lIlIIlIIIIIlll[7]] = CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[37]];
        array[CrashReport.lIlIIlIIIIIlll[8]] = CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[38]];
        array[CrashReport.lIlIIlIIIIIlll[9]] = CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[39]];
        array[CrashReport.lIlIIlIIIIIlll[10]] = CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[40]];
        array[CrashReport.lIlIIlIIIIIlll[11]] = CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[41]];
        array[CrashReport.lIlIIlIIIIIlll[12]] = CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[42]];
        array[CrashReport.lIlIIlIIIIIlll[13]] = CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[43]];
        array[CrashReport.lIlIIlIIIIIlll[14]] = CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[44]];
        array[CrashReport.lIlIIlIIIIIlll[15]] = CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[45]];
        array[CrashReport.lIlIIlIIIIIlll[16]] = CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[46]];
        array[CrashReport.lIlIIlIIIIIlll[17]] = CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[47]];
        array[CrashReport.lIlIIlIIIIIlll[18]] = CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[48]];
        array[CrashReport.lIlIIlIIIIIlll[19]] = CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[49]];
        array[CrashReport.lIlIIlIIIIIlll[20]] = CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[50]];
        array[CrashReport.lIlIIlIIIIIlll[21]] = CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[51]];
        array[CrashReport.lIlIIlIIIIIlll[22]] = CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[52]];
        array[CrashReport.lIlIIlIIIIIlll[23]] = CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[53]];
        array[CrashReport.lIlIIlIIIIIlll[25]] = CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[54]];
        array[CrashReport.lIlIIlIIIIIlll[26]] = CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[55]];
        array[CrashReport.lIlIIlIIIIIlll[27]] = CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[56]];
        array[CrashReport.lIlIIlIIIIIlll[28]] = CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[57]];
        array[CrashReport.lIlIIlIIIIIlll[29]] = CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[58]];
        array[CrashReport.lIlIIlIIIIIlll[31]] = CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[59]];
        array[CrashReport.lIlIIlIIIIIlll[32]] = CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[60]];
        array[CrashReport.lIlIIlIIIIIlll[33]] = CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[61]];
        array[CrashReport.lIlIIlIIIIIlll[34]] = CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[62]];
        array[CrashReport.lIlIIlIIIIIlll[35]] = CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[63]];
        final String[] lllllllllllllIIIlllIlIllIllIlIll = array;
        try {
            return lllllllllllllIIIlllIlIllIllIlIll[(int)(System.nanoTime() % lllllllllllllIIIlllIlIllIllIlIll.length)];
        }
        catch (Throwable lllllllllllllIIIlllIlIllIllIlIlI) {
            return CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[64]];
        }
    }
    
    private static boolean lllIIlIIlIlllll(final int lllllllllllllIIIlllIlIllIIlIIlIl, final int lllllllllllllIIIlllIlIllIIlIIlII) {
        return lllllllllllllIIIlllIlIllIIlIIlIl < lllllllllllllIIIlllIlIllIIlIIlII;
    }
    
    public boolean saveToFile(final File lllllllllllllIIIlllIlIlllIIlIllI) {
        if (lllIIlIIlIlIllI(this.crashReportFile)) {
            return CrashReport.lIlIIlIIIIIlll[0] != 0;
        }
        if (lllIIlIIlIlIllI(lllllllllllllIIIlllIlIlllIIlIllI.getParentFile())) {
            lllllllllllllIIIlllIlIlllIIlIllI.getParentFile().mkdirs();
            "".length();
        }
        try {
            final FileWriter lllllllllllllIIIlllIlIlllIIllIIl = new FileWriter(lllllllllllllIIIlllIlIlllIIlIllI);
            lllllllllllllIIIlllIlIlllIIllIIl.write(this.getCompleteReport());
            lllllllllllllIIIlllIlIlllIIllIIl.close();
            this.crashReportFile = lllllllllllllIIIlllIlIlllIIlIllI;
            return CrashReport.lIlIIlIIIIIlll[1] != 0;
        }
        catch (Throwable lllllllllllllIIIlllIlIlllIIllIII) {
            CrashReport.logger.error(String.valueOf(new StringBuilder(CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[26]]).append(lllllllllllllIIIlllIlIlllIIlIllI)), lllllllllllllIIIlllIlIlllIIllIII);
            return CrashReport.lIlIIlIIIIIlll[0] != 0;
        }
    }
    
    public CrashReport(final String lllllllllllllIIIlllIlIllllIlIllI, final Throwable lllllllllllllIIIlllIlIllllIlIlIl) {
        this.theReportCategory = new CrashReportCategory(this, CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[0]]);
        this.crashReportSections = (List<CrashReportCategory>)Lists.newArrayList();
        this.field_85059_f = (CrashReport.lIlIIlIIIIIlll[1] != 0);
        this.stacktrace = new StackTraceElement[CrashReport.lIlIIlIIIIIlll[0]];
        this.description = lllllllllllllIIIlllIlIllllIlIllI;
        this.cause = lllllllllllllIIIlllIlIllllIlIlIl;
        this.populateEnvironment();
    }
    
    public CrashReportCategory makeCategory(final String lllllllllllllIIIlllIlIlllIIIllII) {
        return this.makeCategoryDepth(lllllllllllllIIIlllIlIlllIIIllII, CrashReport.lIlIIlIIIIIlll[1]);
    }
    
    private static boolean lllIIlIIlIllIIl(final int lllllllllllllIIIlllIlIllIIlIlIIl, final int lllllllllllllIIIlllIlIllIIlIlIII) {
        return lllllllllllllIIIlllIlIllIIlIlIIl >= lllllllllllllIIIlllIlIllIIlIlIII;
    }
    
    private static boolean lllIIlIIlIlllII(final int lllllllllllllIIIlllIlIllIIIllllI) {
        return lllllllllllllIIIlllIlIllIIIllllI != 0;
    }
    
    private static boolean lllIIlIIlIlIlll(final int lllllllllllllIIIlllIlIllIIIlIllI) {
        return lllllllllllllIIIlllIlIllIIIlIllI <= 0;
    }
    
    private static boolean lllIIlIIlIlIllI(final Object lllllllllllllIIIlllIlIllIIlIIIlI) {
        return lllllllllllllIIIlllIlIllIIlIIIlI != null;
    }
    
    private static boolean lllIIlIIlIllIll(final Object lllllllllllllIIIlllIlIllIIlIIIII) {
        return lllllllllllllIIIlllIlIllIIlIIIII == null;
    }
    
    static {
        lllIIlIIlIlIIll();
        lllIIlIIlIIlIlI();
        logger = LogManager.getLogger();
    }
    
    private static boolean lllIIlIIlIlllIl(final int lllllllllllllIIIlllIlIllIIIllIII) {
        return lllllllllllllIIIlllIlIllIIIllIII < 0;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public static CrashReport makeCrashReport(final Throwable lllllllllllllIIIlllIlIllIllIIIII, final String lllllllllllllIIIlllIlIllIllIIIll) {
        CrashReport lllllllllllllIIIlllIlIllIllIIIIl = null;
        if (lllIIlIIlIlllII((lllllllllllllIIIlllIlIllIllIIIII instanceof ReportedException) ? 1 : 0)) {
            final CrashReport lllllllllllllIIIlllIlIllIllIIIlI = ((ReportedException)lllllllllllllIIIlllIlIllIllIIIII).getCrashReport();
            "".length();
            if ("  ".length() != "  ".length()) {
                return null;
            }
        }
        else {
            lllllllllllllIIIlllIlIllIllIIIIl = new CrashReport(lllllllllllllIIIlllIlIllIllIIIll, lllllllllllllIIIlllIlIllIllIIIII);
        }
        return lllllllllllllIIIlllIlIllIllIIIIl;
    }
    
    private static String lllIIlIIIlllIIl(final String lllllllllllllIIIlllIlIllIIllllII, final String lllllllllllllIIIlllIlIllIIlllIll) {
        try {
            final SecretKeySpec lllllllllllllIIIlllIlIllIlIIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlllIlIllIIlllIll.getBytes(StandardCharsets.UTF_8)), CrashReport.lIlIIlIIIIIlll[8]), "DES");
            final Cipher lllllllllllllIIIlllIlIllIlIIIIII = Cipher.getInstance("DES");
            lllllllllllllIIIlllIlIllIlIIIIII.init(CrashReport.lIlIIlIIIIIlll[2], lllllllllllllIIIlllIlIllIlIIIIIl);
            return new String(lllllllllllllIIIlllIlIllIlIIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlllIlIllIIllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlllIlIllIIllllll) {
            lllllllllllllIIIlllIlIllIIllllll.printStackTrace();
            return null;
        }
    }
    
    public File getFile() {
        return this.crashReportFile;
    }
    
    public void getSectionsInStringBuilder(final StringBuilder lllllllllllllIIIlllIlIllllIIIIII) {
        if ((!lllIIlIIlIlIllI(this.stacktrace) || lllIIlIIlIlIlll(this.stacktrace.length)) && lllIIlIIlIllIII(this.crashReportSections.size())) {
            this.stacktrace = (StackTraceElement[])ArrayUtils.subarray((Object[])this.crashReportSections.get(CrashReport.lIlIIlIIIIIlll[0]).getStackTrace(), CrashReport.lIlIIlIIIIIlll[0], CrashReport.lIlIIlIIIIIlll[1]);
        }
        if (lllIIlIIlIlIllI(this.stacktrace) && lllIIlIIlIllIII(this.stacktrace.length)) {
            lllllllllllllIIIlllIlIllllIIIIII.append(CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[8]]);
            "".length();
            lllllllllllllIIIlllIlIllllIIIIII.append(CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[9]]);
            "".length();
            final Exception lllllllllllllIIIlllIlIlllIllllII;
            final short lllllllllllllIIIlllIlIlllIllllIl = (short)((StackTraceElement[])(Object)(lllllllllllllIIIlllIlIlllIllllII = (Exception)(Object)this.stacktrace)).length;
            byte lllllllllllllIIIlllIlIlllIlllllI = (byte)CrashReport.lIlIIlIIIIIlll[0];
            "".length();
            if (null != null) {
                return;
            }
            while (!lllIIlIIlIllIIl(lllllllllllllIIIlllIlIlllIlllllI, lllllllllllllIIIlllIlIlllIllllIl)) {
                final StackTraceElement lllllllllllllIIIlllIlIllllIIIIll = lllllllllllllIIIlllIlIlllIllllII[lllllllllllllIIIlllIlIlllIlllllI];
                lllllllllllllIIIlllIlIllllIIIIII.append(CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[10]]).append(CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[11]]).append(lllllllllllllIIIlllIlIllllIIIIll.toString());
                "".length();
                lllllllllllllIIIlllIlIllllIIIIII.append(CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[12]]);
                "".length();
                ++lllllllllllllIIIlllIlIlllIlllllI;
            }
            lllllllllllllIIIlllIlIllllIIIIII.append(CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[13]]);
            "".length();
        }
        byte lllllllllllllIIIlllIlIlllIlllllI = (byte)this.crashReportSections.iterator();
        "".length();
        if ("   ".length() <= ((0xD ^ 0x33 ^ (0x8B ^ 0x94)) & (0xD5 ^ 0xA3 ^ (0xA ^ 0x5D) ^ -" ".length()))) {
            return;
        }
        while (!lllIIlIIlIllIlI(((Iterator)lllllllllllllIIIlllIlIlllIlllllI).hasNext() ? 1 : 0)) {
            final CrashReportCategory lllllllllllllIIIlllIlIllllIIIIlI = ((Iterator<CrashReportCategory>)lllllllllllllIIIlllIlIlllIlllllI).next();
            lllllllllllllIIIlllIlIllllIIIIlI.appendToStringBuilder(lllllllllllllIIIlllIlIllllIIIIII);
            lllllllllllllIIIlllIlIllllIIIIII.append(CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[14]]);
            "".length();
        }
        this.theReportCategory.appendToStringBuilder(lllllllllllllIIIlllIlIllllIIIIII);
    }
    
    public CrashReportCategory getCategory() {
        return this.theReportCategory;
    }
    
    private static boolean lllIIlIIlIllllI(final int lllllllllllllIIIlllIlIllIIIllIlI) {
        return lllllllllllllIIIlllIlIllIIIllIlI >= 0;
    }
    
    private static boolean lllIIlIIlIllIII(final int lllllllllllllIIIlllIlIllIIIlIlII) {
        return lllllllllllllIIIlllIlIllIIIlIlII > 0;
    }
    
    public CrashReportCategory makeCategoryDepth(final String lllllllllllllIIIlllIlIllIlllIllI, final int lllllllllllllIIIlllIlIllIlllllll) {
        final CrashReportCategory lllllllllllllIIIlllIlIllIllllllI = new CrashReportCategory(this, lllllllllllllIIIlllIlIllIlllIllI);
        if (lllIIlIIlIlllII(this.field_85059_f ? 1 : 0)) {
            final int lllllllllllllIIIlllIlIllIlllllIl = lllllllllllllIIIlllIlIllIllllllI.getPrunedStackTrace(lllllllllllllIIIlllIlIllIlllllll);
            final StackTraceElement[] lllllllllllllIIIlllIlIllIlllllII = this.cause.getStackTrace();
            StackTraceElement lllllllllllllIIIlllIlIllIllllIll = null;
            StackTraceElement lllllllllllllIIIlllIlIllIllllIlI = null;
            final int lllllllllllllIIIlllIlIllIllllIIl = lllllllllllllIIIlllIlIllIlllllII.length - lllllllllllllIIIlllIlIllIlllllIl;
            if (lllIIlIIlIlllIl(lllllllllllllIIIlllIlIllIllllIIl)) {
                System.out.println(String.valueOf(new StringBuilder(CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[27]]).append(lllllllllllllIIIlllIlIllIlllllII.length).append(CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[28]]).append(lllllllllllllIIIlllIlIllIlllllIl).append(CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[29]])));
            }
            if (lllIIlIIlIlIllI(lllllllllllllIIIlllIlIllIlllllII) && lllIIlIIlIllllI(lllllllllllllIIIlllIlIllIllllIIl) && lllIIlIIlIlllll(lllllllllllllIIIlllIlIllIllllIIl, lllllllllllllIIIlllIlIllIlllllII.length)) {
                lllllllllllllIIIlllIlIllIllllIll = lllllllllllllIIIlllIlIllIlllllII[lllllllllllllIIIlllIlIllIllllIIl];
                if (lllIIlIIlIlllll(lllllllllllllIIIlllIlIllIlllllII.length + CrashReport.lIlIIlIIIIIlll[1] - lllllllllllllIIIlllIlIllIlllllIl, lllllllllllllIIIlllIlIllIlllllII.length)) {
                    lllllllllllllIIIlllIlIllIllllIlI = lllllllllllllIIIlllIlIllIlllllII[lllllllllllllIIIlllIlIllIlllllII.length + CrashReport.lIlIIlIIIIIlll[1] - lllllllllllllIIIlllIlIllIlllllIl];
                }
            }
            this.field_85059_f = lllllllllllllIIIlllIlIllIllllllI.firstTwoElementsOfStackTraceMatch(lllllllllllllIIIlllIlIllIllllIll, lllllllllllllIIIlllIlIllIllllIlI);
            if (lllIIlIIlIllIII(lllllllllllllIIIlllIlIllIlllllIl) && lllIIlIIlIllIlI(this.crashReportSections.isEmpty() ? 1 : 0)) {
                final CrashReportCategory lllllllllllllIIIlllIlIllIllllIII = this.crashReportSections.get(this.crashReportSections.size() - CrashReport.lIlIIlIIIIIlll[1]);
                lllllllllllllIIIlllIlIllIllllIII.trimStackTraceEntriesFromBottom(lllllllllllllIIIlllIlIllIlllllIl);
                "".length();
                if (-" ".length() == " ".length()) {
                    return null;
                }
            }
            else if (lllIIlIIlIlIllI(lllllllllllllIIIlllIlIllIlllllII) && lllIIlIIlIllIIl(lllllllllllllIIIlllIlIllIlllllII.length, lllllllllllllIIIlllIlIllIlllllIl) && lllIIlIIlIllllI(lllllllllllllIIIlllIlIllIllllIIl) && lllIIlIIlIlllll(lllllllllllllIIIlllIlIllIllllIIl, lllllllllllllIIIlllIlIllIlllllII.length)) {
                this.stacktrace = new StackTraceElement[lllllllllllllIIIlllIlIllIllllIIl];
                System.arraycopy(lllllllllllllIIIlllIlIllIlllllII, CrashReport.lIlIIlIIIIIlll[0], this.stacktrace, CrashReport.lIlIIlIIIIIlll[0], this.stacktrace.length);
                "".length();
                if (-"   ".length() > 0) {
                    return null;
                }
            }
            else {
                this.field_85059_f = (CrashReport.lIlIIlIIIIIlll[0] != 0);
            }
        }
        this.crashReportSections.add(lllllllllllllIIIlllIlIllIllllllI);
        "".length();
        return lllllllllllllIIIlllIlIllIllllllI;
    }
    
    private static boolean lllIIlIIlIllIlI(final int lllllllllllllIIIlllIlIllIIIlllII) {
        return lllllllllllllIIIlllIlIllIIIlllII == 0;
    }
    
    private static void lllIIlIIlIlIIll() {
        (lIlIIlIIIIIlll = new int[66])[0] = ((0x36 ^ 0x1D) & ~(0x19 ^ 0x32));
        CrashReport.lIlIIlIIIIIlll[1] = " ".length();
        CrashReport.lIlIIlIIIIIlll[2] = "  ".length();
        CrashReport.lIlIIlIIIIIlll[3] = "   ".length();
        CrashReport.lIlIIlIIIIIlll[4] = (0x5E ^ 0x5A);
        CrashReport.lIlIIlIIIIIlll[5] = (0x9A ^ 0x9C ^ "   ".length());
        CrashReport.lIlIIlIIIIIlll[6] = (0xC3 ^ 0xC5);
        CrashReport.lIlIIlIIIIIlll[7] = (0xCF ^ 0xC2 ^ (0x78 ^ 0x72));
        CrashReport.lIlIIlIIIIIlll[8] = (0xE ^ 0x64 ^ (0x4F ^ 0x2D));
        CrashReport.lIlIIlIIIIIlll[9] = (65 + 96 - 34 + 45 ^ 6 + 56 - 38 + 141);
        CrashReport.lIlIIlIIIIIlll[10] = (0xB9 ^ 0xB3);
        CrashReport.lIlIIlIIIIIlll[11] = (0x7 ^ 0xC);
        CrashReport.lIlIIlIIIIIlll[12] = (170 + 117 - 227 + 121 ^ 92 + 41 - 52 + 104);
        CrashReport.lIlIIlIIIIIlll[13] = (0x75 ^ 0x78);
        CrashReport.lIlIIlIIIIIlll[14] = (0x6B ^ 0x65);
        CrashReport.lIlIIlIIIIIlll[15] = (0x7B ^ 0x16 ^ (0xDE ^ 0xBC));
        CrashReport.lIlIIlIIIIIlll[16] = (116 + 101 - 180 + 130 ^ 43 + 67 + 21 + 52);
        CrashReport.lIlIIlIIIIIlll[17] = (0xBC ^ 0xAD);
        CrashReport.lIlIIlIIIIIlll[18] = (0xAD ^ 0x82 ^ (0x5 ^ 0x38));
        CrashReport.lIlIIlIIIIIlll[19] = (0xA4 ^ 0xB7);
        CrashReport.lIlIIlIIIIIlll[20] = (0x48 ^ 0x5C);
        CrashReport.lIlIIlIIIIIlll[21] = (56 + 51 - 32 + 103 ^ 137 + 13 - 53 + 70);
        CrashReport.lIlIIlIIIIIlll[22] = (0x27 ^ 0x31);
        CrashReport.lIlIIlIIIIIlll[23] = (0x52 ^ 0x45);
        CrashReport.lIlIIlIIIIIlll[24] = (0xDD ^ 0x8A);
        CrashReport.lIlIIlIIIIIlll[25] = (123 + 25 - 111 + 142 ^ 64 + 126 - 99 + 80);
        CrashReport.lIlIIlIIIIIlll[26] = (0x96 ^ 0x8F);
        CrashReport.lIlIIlIIIIIlll[27] = (0x92 ^ 0x84 ^ (0x7D ^ 0x71));
        CrashReport.lIlIIlIIIIIlll[28] = (67 + 110 - 74 + 35 ^ 111 + 144 - 251 + 141);
        CrashReport.lIlIIlIIIIIlll[29] = (0x35 ^ 0x64 ^ (0xDB ^ 0x96));
        CrashReport.lIlIIlIIIIIlll[30] = (138 + 116 - 239 + 151 ^ 20 + 88 + 2 + 22);
        CrashReport.lIlIIlIIIIIlll[31] = (1 + 66 + 23 + 39 ^ 120 + 140 - 242 + 138);
        CrashReport.lIlIIlIIIIIlll[32] = (0x4B ^ 0x55);
        CrashReport.lIlIIlIIIIIlll[33] = (0x2C ^ 0x77 ^ (0x38 ^ 0x7C));
        CrashReport.lIlIIlIIIIIlll[34] = (0x95 ^ 0xC1 ^ (0xC2 ^ 0xB6));
        CrashReport.lIlIIlIIIIIlll[35] = (0xB ^ 0x2A);
        CrashReport.lIlIIlIIIIIlll[36] = (87 + 44 - 118 + 152 ^ 37 + 37 + 49 + 11);
        CrashReport.lIlIIlIIIIIlll[37] = (0x6E ^ 0x4A);
        CrashReport.lIlIIlIIIIIlll[38] = (0x95 ^ 0xB0);
        CrashReport.lIlIIlIIIIIlll[39] = (0xC4 ^ 0xAC ^ (0xD3 ^ 0x9D));
        CrashReport.lIlIIlIIIIIlll[40] = (0x5B ^ 0x17 ^ (0x7B ^ 0x10));
        CrashReport.lIlIIlIIIIIlll[41] = (0x77 ^ 0x5F);
        CrashReport.lIlIIlIIIIIlll[42] = (178 + 83 - 148 + 66 ^ 96 + 42 - 127 + 143);
        CrashReport.lIlIIlIIIIIlll[43] = (0x4C ^ 0x66);
        CrashReport.lIlIIlIIIIIlll[44] = (0x59 ^ 0x3B ^ (0xF3 ^ 0xBA));
        CrashReport.lIlIIlIIIIIlll[45] = (0x7 ^ 0x2B);
        CrashReport.lIlIIlIIIIIlll[46] = (0x83 ^ 0xB8 ^ (0x3C ^ 0x2A));
        CrashReport.lIlIIlIIIIIlll[47] = (0x7C ^ 0x52);
        CrashReport.lIlIIlIIIIIlll[48] = (53 + 37 - 65 + 113 ^ 13 + 8 + 65 + 79);
        CrashReport.lIlIIlIIIIIlll[49] = (((0x79 ^ 0x63) & ~(0x5A ^ 0x40)) ^ (0x4B ^ 0x7B));
        CrashReport.lIlIIlIIIIIlll[50] = (0x15 ^ 0x3B ^ (0x23 ^ 0x3C));
        CrashReport.lIlIIlIIIIIlll[51] = (0xF7 ^ 0xC5);
        CrashReport.lIlIIlIIIIIlll[52] = ("   ".length() ^ (0x4 ^ 0x34));
        CrashReport.lIlIIlIIIIIlll[53] = (0x63 ^ 0x57);
        CrashReport.lIlIIlIIIIIlll[54] = (0x5E ^ 0x6B);
        CrashReport.lIlIIlIIIIIlll[55] = (0xA ^ 0x3C);
        CrashReport.lIlIIlIIIIIlll[56] = (59 + 73 + 38 + 16 ^ 73 + 84 - 124 + 108);
        CrashReport.lIlIIlIIIIIlll[57] = (0x58 ^ 0x60);
        CrashReport.lIlIIlIIIIIlll[58] = (0xB4 ^ 0x8D);
        CrashReport.lIlIIlIIIIIlll[59] = (0x46 ^ 0x64 ^ (0x47 ^ 0x5F));
        CrashReport.lIlIIlIIIIIlll[60] = (66 + 54 - 38 + 50 ^ 159 + 89 - 185 + 128);
        CrashReport.lIlIIlIIIIIlll[61] = (0x31 ^ 0x70 ^ (0xBF ^ 0xC2));
        CrashReport.lIlIIlIIIIIlll[62] = (98 + 112 - 160 + 129 ^ 106 + 60 - 120 + 96);
        CrashReport.lIlIIlIIIIIlll[63] = (0x1D ^ 0x23);
        CrashReport.lIlIIlIIIIIlll[64] = (0x9E ^ 0xBB ^ (0x36 ^ 0x2C));
        CrashReport.lIlIIlIIIIIlll[65] = (0x8 ^ 0x6B ^ (0x4B ^ 0x68));
    }
    
    public String getCompleteReport() {
        final StringBuilder lllllllllllllIIIlllIlIlllIlIIllI = new StringBuilder();
        lllllllllllllIIIlllIlIlllIlIIllI.append(CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[15]]);
        "".length();
        lllllllllllllIIIlllIlIlllIlIIllI.append(CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[16]]);
        "".length();
        lllllllllllllIIIlllIlIlllIlIIllI.append(getWittyComment());
        "".length();
        lllllllllllllIIIlllIlIlllIlIIllI.append(CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[17]]);
        "".length();
        lllllllllllllIIIlllIlIlllIlIIllI.append(CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[18]]);
        "".length();
        lllllllllllllIIIlllIlIlllIlIIllI.append(new SimpleDateFormat().format(new Date()));
        "".length();
        lllllllllllllIIIlllIlIlllIlIIllI.append(CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[19]]);
        "".length();
        lllllllllllllIIIlllIlIlllIlIIllI.append(CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[20]]);
        "".length();
        lllllllllllllIIIlllIlIlllIlIIllI.append(this.description);
        "".length();
        lllllllllllllIIIlllIlIlllIlIIllI.append(CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[21]]);
        "".length();
        lllllllllllllIIIlllIlIlllIlIIllI.append(this.getCauseStackTraceOrString());
        "".length();
        lllllllllllllIIIlllIlIlllIlIIllI.append(CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[22]]);
        "".length();
        int lllllllllllllIIIlllIlIlllIlIIlIl = CrashReport.lIlIIlIIIIIlll[0];
        "".length();
        if (-" ".length() >= "   ".length()) {
            return null;
        }
        while (!lllIIlIIlIllIIl(lllllllllllllIIIlllIlIlllIlIIlIl, CrashReport.lIlIIlIIIIIlll[24])) {
            lllllllllllllIIIlllIlIlllIlIIllI.append(CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[23]]);
            "".length();
            ++lllllllllllllIIIlllIlIlllIlIIlIl;
        }
        lllllllllllllIIIlllIlIlllIlIIllI.append(CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[25]]);
        "".length();
        this.getSectionsInStringBuilder(lllllllllllllIIIlllIlIlllIlIIllI);
        return String.valueOf(lllllllllllllIIIlllIlIlllIlIIllI);
    }
    
    public String getCauseStackTraceOrString() {
        StringWriter lllllllllllllIIIlllIlIlllIllIlII = null;
        PrintWriter lllllllllllllIIIlllIlIlllIllIIll = null;
        Throwable lllllllllllllIIIlllIlIlllIllIIlI = this.cause;
        if (lllIIlIIlIllIll(lllllllllllllIIIlllIlIlllIllIIlI.getMessage())) {
            if (lllIIlIIlIlllII((lllllllllllllIIIlllIlIlllIllIIlI instanceof NullPointerException) ? 1 : 0)) {
                lllllllllllllIIIlllIlIlllIllIIlI = new NullPointerException(this.description);
                "".length();
                if (null != null) {
                    return null;
                }
            }
            else if (lllIIlIIlIlllII((lllllllllllllIIIlllIlIlllIllIIlI instanceof StackOverflowError) ? 1 : 0)) {
                lllllllllllllIIIlllIlIlllIllIIlI = new StackOverflowError(this.description);
                "".length();
                if (-(0x4D ^ 0x48) >= 0) {
                    return null;
                }
            }
            else if (lllIIlIIlIlllII((lllllllllllllIIIlllIlIlllIllIIlI instanceof OutOfMemoryError) ? 1 : 0)) {
                lllllllllllllIIIlllIlIlllIllIIlI = new OutOfMemoryError(this.description);
            }
            lllllllllllllIIIlllIlIlllIllIIlI.setStackTrace(this.cause.getStackTrace());
        }
        String lllllllllllllIIIlllIlIlllIllIIIl = lllllllllllllIIIlllIlIlllIllIIlI.toString();
        try {
            lllllllllllllIIIlllIlIlllIllIlII = new StringWriter();
            lllllllllllllIIIlllIlIlllIllIIll = new PrintWriter(lllllllllllllIIIlllIlIlllIllIlII);
            lllllllllllllIIIlllIlIlllIllIIlI.printStackTrace(lllllllllllllIIIlllIlIlllIllIIll);
            lllllllllllllIIIlllIlIlllIllIIIl = lllllllllllllIIIlllIlIlllIllIlII.toString();
            "".length();
            if (((108 + 37 - 115 + 97 ^ (0x7F ^ 0x54)) & (0x89 ^ 0x97 ^ (0x50 ^ 0x1A) ^ -" ".length())) != ((0x78 ^ 0x50 ^ (0x74 ^ 0x72)) & (0xFD ^ 0xC3 ^ (0xBF ^ 0xAF) ^ -" ".length()))) {
                return null;
            }
        }
        finally {
            IOUtils.closeQuietly((Writer)lllllllllllllIIIlllIlIlllIllIlII);
            IOUtils.closeQuietly((Writer)lllllllllllllIIIlllIlIlllIllIIll);
        }
        IOUtils.closeQuietly((Writer)lllllllllllllIIIlllIlIlllIllIlII);
        IOUtils.closeQuietly((Writer)lllllllllllllIIIlllIlIlllIllIIll);
        return lllllllllllllIIIlllIlIlllIllIIIl;
    }
    
    private void populateEnvironment() {
        this.theReportCategory.addCrashSectionCallable(CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[1]], new Callable<String>() {
            private static final /* synthetic */ String[] llIllIIlllllII;
            private static final /* synthetic */ int[] llIllIIlllllIl;
            
            private static void lIIlIlllIlIlIIII() {
                (llIllIIlllllIl = new int[2])[0] = ((0x54 ^ 0x6D) & ~(0xD ^ 0x34));
                CrashReport$1.llIllIIlllllIl[1] = " ".length();
            }
            
            static {
                lIIlIlllIlIlIIII();
                lIIlIlllIlIIllll();
            }
            
            @Override
            public String call() {
                return CrashReport$1.llIllIIlllllII[CrashReport$1.llIllIIlllllIl[0]];
            }
            
            private static boolean lIIlIlllIlIlIIIl(final int llllllllllllIllIIlllIlIlllIllIll, final int llllllllllllIllIIlllIlIlllIllIlI) {
                return llllllllllllIllIIlllIlIlllIllIll < llllllllllllIllIIlllIlIlllIllIlI;
            }
            
            private static String lIIlIlllIlIIlllI(String llllllllllllIllIIlllIlIllllIIllI, final String llllllllllllIllIIlllIlIllllIlIlI) {
                llllllllllllIllIIlllIlIllllIIllI = new String(Base64.getDecoder().decode(llllllllllllIllIIlllIlIllllIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                final StringBuilder llllllllllllIllIIlllIlIllllIlIIl = new StringBuilder();
                final char[] llllllllllllIllIIlllIlIllllIlIII = llllllllllllIllIIlllIlIllllIlIlI.toCharArray();
                int llllllllllllIllIIlllIlIllllIIlll = CrashReport$1.llIllIIlllllIl[0];
                final boolean llllllllllllIllIIlllIlIllllIIIIl = (Object)llllllllllllIllIIlllIlIllllIIllI.toCharArray();
                final byte llllllllllllIllIIlllIlIllllIIIII = (byte)llllllllllllIllIIlllIlIllllIIIIl.length;
                long llllllllllllIllIIlllIlIlllIlllll = CrashReport$1.llIllIIlllllIl[0];
                while (lIIlIlllIlIlIIIl((int)llllllllllllIllIIlllIlIlllIlllll, llllllllllllIllIIlllIlIllllIIIII)) {
                    final char llllllllllllIllIIlllIlIllllIllII = llllllllllllIllIIlllIlIllllIIIIl[llllllllllllIllIIlllIlIlllIlllll];
                    llllllllllllIllIIlllIlIllllIlIIl.append((char)(llllllllllllIllIIlllIlIllllIllII ^ llllllllllllIllIIlllIlIllllIlIII[llllllllllllIllIIlllIlIllllIIlll % llllllllllllIllIIlllIlIllllIlIII.length]));
                    "".length();
                    ++llllllllllllIllIIlllIlIllllIIlll;
                    ++llllllllllllIllIIlllIlIlllIlllll;
                    "".length();
                    if ("   ".length() == 0) {
                        return null;
                    }
                }
                return String.valueOf(llllllllllllIllIIlllIlIllllIlIIl);
            }
            
            private static void lIIlIlllIlIIllll() {
                (llIllIIlllllII = new String[CrashReport$1.llIllIIlllllIl[1]])[CrashReport$1.llIllIIlllllIl[0]] = lIIlIlllIlIIlllI("V1Zrekk=", "fxSTq");
            }
        });
        this.theReportCategory.addCrashSectionCallable(CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[2]], new Callable<String>() {
            private static final /* synthetic */ int[] lIlIIlllIllIII;
            private static final /* synthetic */ String[] lIlIIlllIlIlll;
            
            private static void lllIlIIlIlIllll() {
                (lIlIIlllIlIlll = new String[CrashReport$2.lIlIIlllIllIII[5]])[CrashReport$2.lIlIIlllIllIII[0]] = lllIlIIlIlIllII("rB/HJkt+Dgw=", "kjTvZ");
                CrashReport$2.lIlIIlllIlIlll[CrashReport$2.lIlIIlllIllIII[1]] = lllIlIIlIlIllII("6uxhVBkzy8k=", "JYDTg");
                CrashReport$2.lIlIIlllIlIlll[CrashReport$2.lIlIIlllIllIII[2]] = lllIlIIlIlIllIl("CDxvFTcEJw==", "gOAtE");
                CrashReport$2.lIlIIlllIlIlll[CrashReport$2.lIlIIlllIllIII[3]] = lllIlIIlIlIllII("KK/fcP3IUsh8Hxd4jIVaXA==", "oWfXq");
                CrashReport$2.lIlIIlllIlIlll[CrashReport$2.lIlIIlllIllIII[4]] = lllIlIIlIlIlllI("gWB2l72e0b1pinSq2pfNsg==", "cLdBE");
            }
            
            private static String lllIlIIlIlIllII(final String lllllllllllllIIIlIlllllIlIIlIIll, final String lllllllllllllIIIlIlllllIlIIlIIlI) {
                try {
                    final SecretKeySpec lllllllllllllIIIlIlllllIlIIlIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIlllllIlIIlIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                    final Cipher lllllllllllllIIIlIlllllIlIIlIlIl = Cipher.getInstance("Blowfish");
                    lllllllllllllIIIlIlllllIlIIlIlIl.init(CrashReport$2.lIlIIlllIllIII[2], lllllllllllllIIIlIlllllIlIIlIllI);
                    return new String(lllllllllllllIIIlIlllllIlIIlIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIlllllIlIIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception lllllllllllllIIIlIlllllIlIIlIlII) {
                    lllllllllllllIIIlIlllllIlIIlIlII.printStackTrace();
                    return null;
                }
            }
            
            private static void lllIlIIlIllIIIl() {
                (lIlIIlllIllIII = new int[7])[0] = ((0x34 ^ 0x68 ^ (0x43 ^ 0x21)) & (164 + 5 - 104 + 184 ^ 185 + 94 - 118 + 38 ^ -" ".length()));
                CrashReport$2.lIlIIlllIllIII[1] = " ".length();
                CrashReport$2.lIlIIlllIllIII[2] = "  ".length();
                CrashReport$2.lIlIIlllIllIII[3] = "   ".length();
                CrashReport$2.lIlIIlllIllIII[4] = (0x85 ^ 0x81);
                CrashReport$2.lIlIIlllIllIII[5] = (0xD9 ^ 0xC3 ^ (0x7A ^ 0x65));
                CrashReport$2.lIlIIlllIllIII[6] = (0xEF ^ 0x81 ^ (0xEA ^ 0x8C));
            }
            
            private static String lllIlIIlIlIlllI(final String lllllllllllllIIIlIlllllIlIlIIIII, final String lllllllllllllIIIlIlllllIlIIlllIl) {
                try {
                    final SecretKeySpec lllllllllllllIIIlIlllllIlIlIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIlllllIlIIlllIl.getBytes(StandardCharsets.UTF_8)), CrashReport$2.lIlIIlllIllIII[6]), "DES");
                    final Cipher lllllllllllllIIIlIlllllIlIlIIIlI = Cipher.getInstance("DES");
                    lllllllllllllIIIlIlllllIlIlIIIlI.init(CrashReport$2.lIlIIlllIllIII[2], lllllllllllllIIIlIlllllIlIlIIIll);
                    return new String(lllllllllllllIIIlIlllllIlIlIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIlllllIlIlIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception lllllllllllllIIIlIlllllIlIlIIIIl) {
                    lllllllllllllIIIlIlllllIlIlIIIIl.printStackTrace();
                    return null;
                }
            }
            
            private static String lllIlIIlIlIllIl(String lllllllllllllIIIlIlllllIIllllllI, final String lllllllllllllIIIlIlllllIlIIIIIlI) {
                lllllllllllllIIIlIlllllIIllllllI = new String(Base64.getDecoder().decode(lllllllllllllIIIlIlllllIIllllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                final StringBuilder lllllllllllllIIIlIlllllIlIIIIIIl = new StringBuilder();
                final char[] lllllllllllllIIIlIlllllIlIIIIIII = lllllllllllllIIIlIlllllIlIIIIIlI.toCharArray();
                int lllllllllllllIIIlIlllllIIlllllll = CrashReport$2.lIlIIlllIllIII[0];
                final String lllllllllllllIIIlIlllllIIllllIIl = (Object)lllllllllllllIIIlIlllllIIllllllI.toCharArray();
                final short lllllllllllllIIIlIlllllIIllllIII = (short)lllllllllllllIIIlIlllllIIllllIIl.length;
                float lllllllllllllIIIlIlllllIIlllIlll = CrashReport$2.lIlIIlllIllIII[0];
                while (lllIlIIlIllIIlI((int)lllllllllllllIIIlIlllllIIlllIlll, lllllllllllllIIIlIlllllIIllllIII)) {
                    final char lllllllllllllIIIlIlllllIlIIIIlII = lllllllllllllIIIlIlllllIIllllIIl[lllllllllllllIIIlIlllllIIlllIlll];
                    lllllllllllllIIIlIlllllIlIIIIIIl.append((char)(lllllllllllllIIIlIlllllIlIIIIlII ^ lllllllllllllIIIlIlllllIlIIIIIII[lllllllllllllIIIlIlllllIIlllllll % lllllllllllllIIIlIlllllIlIIIIIII.length]));
                    "".length();
                    ++lllllllllllllIIIlIlllllIIlllllll;
                    ++lllllllllllllIIIlIlllllIIlllIlll;
                    "".length();
                    if ("  ".length() == ((0x13 ^ 0x45) & ~(0x5 ^ 0x53))) {
                        return null;
                    }
                }
                return String.valueOf(lllllllllllllIIIlIlllllIlIIIIIIl);
            }
            
            @Override
            public String call() {
                return String.valueOf(new StringBuilder(String.valueOf(System.getProperty(CrashReport$2.lIlIIlllIlIlll[CrashReport$2.lIlIIlllIllIII[0]]))).append(CrashReport$2.lIlIIlllIlIlll[CrashReport$2.lIlIIlllIllIII[1]]).append(System.getProperty(CrashReport$2.lIlIIlllIlIlll[CrashReport$2.lIlIIlllIllIII[2]])).append(CrashReport$2.lIlIIlllIlIlll[CrashReport$2.lIlIIlllIllIII[3]]).append(System.getProperty(CrashReport$2.lIlIIlllIlIlll[CrashReport$2.lIlIIlllIllIII[4]])));
            }
            
            private static boolean lllIlIIlIllIIlI(final int lllllllllllllIIIlIlllllIIlllIIll, final int lllllllllllllIIIlIlllllIIlllIIlI) {
                return lllllllllllllIIIlIlllllIIlllIIll < lllllllllllllIIIlIlllllIIlllIIlI;
            }
            
            static {
                lllIlIIlIllIIIl();
                lllIlIIlIlIllll();
            }
        });
        this.theReportCategory.addCrashSectionCallable(CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[3]], new Callable<String>() {
            private static final /* synthetic */ String[] lllIIllIlIlIIl;
            private static final /* synthetic */ int[] lllIIllIlIlIlI;
            
            static {
                lIlIIIIIIllIlIll();
                lIlIIIIIIllIlIlI();
            }
            
            @Override
            public String call() {
                return String.valueOf(new StringBuilder(String.valueOf(System.getProperty(CrashReport$3.lllIIllIlIlIIl[CrashReport$3.lllIIllIlIlIlI[0]]))).append(CrashReport$3.lllIIllIlIlIIl[CrashReport$3.lllIIllIlIlIlI[1]]).append(System.getProperty(CrashReport$3.lllIIllIlIlIIl[CrashReport$3.lllIIllIlIlIlI[2]])));
            }
            
            private static String lIlIIIIIIllIlIIl(String llllllllllllIlIlllIlllllIIlllIII, final String llllllllllllIlIlllIlllllIIllllII) {
                llllllllllllIlIlllIlllllIIlllIII = new String(Base64.getDecoder().decode(llllllllllllIlIlllIlllllIIlllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                final StringBuilder llllllllllllIlIlllIlllllIIlllIll = new StringBuilder();
                final char[] llllllllllllIlIlllIlllllIIlllIlI = llllllllllllIlIlllIlllllIIllllII.toCharArray();
                int llllllllllllIlIlllIlllllIIlllIIl = CrashReport$3.lllIIllIlIlIlI[0];
                final int llllllllllllIlIlllIlllllIIllIIll = (Object)llllllllllllIlIlllIlllllIIlllIII.toCharArray();
                final String llllllllllllIlIlllIlllllIIllIIlI = (String)llllllllllllIlIlllIlllllIIllIIll.length;
                byte llllllllllllIlIlllIlllllIIllIIIl = (byte)CrashReport$3.lllIIllIlIlIlI[0];
                while (lIlIIIIIIllIllII(llllllllllllIlIlllIlllllIIllIIIl, (int)llllllllllllIlIlllIlllllIIllIIlI)) {
                    final char llllllllllllIlIlllIlllllIIlllllI = llllllllllllIlIlllIlllllIIllIIll[llllllllllllIlIlllIlllllIIllIIIl];
                    llllllllllllIlIlllIlllllIIlllIll.append((char)(llllllllllllIlIlllIlllllIIlllllI ^ llllllllllllIlIlllIlllllIIlllIlI[llllllllllllIlIlllIlllllIIlllIIl % llllllllllllIlIlllIlllllIIlllIlI.length]));
                    "".length();
                    ++llllllllllllIlIlllIlllllIIlllIIl;
                    ++llllllllllllIlIlllIlllllIIllIIIl;
                    "".length();
                    if (null != null) {
                        return null;
                    }
                }
                return String.valueOf(llllllllllllIlIlllIlllllIIlllIll);
            }
            
            private static boolean lIlIIIIIIllIllII(final int llllllllllllIlIlllIlllllIIlIllIl, final int llllllllllllIlIlllIlllllIIlIllII) {
                return llllllllllllIlIlllIlllllIIlIllIl < llllllllllllIlIlllIlllllIIlIllII;
            }
            
            private static void lIlIIIIIIllIlIlI() {
                (lllIIllIlIlIIl = new String[CrashReport$3.lllIIllIlIlIlI[3]])[CrashReport$3.lllIIllIlIlIlI[0]] = lIlIIIIIIllIlIII("inmgw6oWCs98FG7vMjuCUA==", "wONeV");
                CrashReport$3.lllIIllIlIlIIl[CrashReport$3.lllIIllIlIlIlI[1]] = lIlIIIIIIllIlIII("cY8O4S6qoCM=", "gTSLB");
                CrashReport$3.lllIIllIlIlIIl[CrashReport$3.lllIIllIlIlIlI[2]] = lIlIIIIIIllIlIIl("DggOOU0SDBY8DBY=", "dixXc");
            }
            
            private static void lIlIIIIIIllIlIll() {
                (lllIIllIlIlIlI = new int[5])[0] = ((0xA9 ^ 0xAD ^ (0x71 ^ 0x78)) & (0x6A ^ 0x2A ^ (0x88 ^ 0xC5) ^ -" ".length()));
                CrashReport$3.lllIIllIlIlIlI[1] = " ".length();
                CrashReport$3.lllIIllIlIlIlI[2] = "  ".length();
                CrashReport$3.lllIIllIlIlIlI[3] = "   ".length();
                CrashReport$3.lllIIllIlIlIlI[4] = (0x27 ^ 0x2F);
            }
            
            private static String lIlIIIIIIllIlIII(final String llllllllllllIlIlllIlllllIlIIllIl, final String llllllllllllIlIlllIlllllIlIIlIlI) {
                try {
                    final SecretKeySpec llllllllllllIlIlllIlllllIlIlIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllIlllllIlIIlIlI.getBytes(StandardCharsets.UTF_8)), CrashReport$3.lllIIllIlIlIlI[4]), "DES");
                    final Cipher llllllllllllIlIlllIlllllIlIIllll = Cipher.getInstance("DES");
                    llllllllllllIlIlllIlllllIlIIllll.init(CrashReport$3.lllIIllIlIlIlI[2], llllllllllllIlIlllIlllllIlIlIIII);
                    return new String(llllllllllllIlIlllIlllllIlIIllll.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllIlllllIlIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception llllllllllllIlIlllIlllllIlIIlllI) {
                    llllllllllllIlIlllIlllllIlIIlllI.printStackTrace();
                    return null;
                }
            }
        });
        this.theReportCategory.addCrashSectionCallable(CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[4]], new Callable<String>() {
            private static final /* synthetic */ String[] lIIllIlllIlIll;
            private static final /* synthetic */ int[] lIIllIlllIllII;
            
            @Override
            public String call() {
                return String.valueOf(new StringBuilder(String.valueOf(System.getProperty(CrashReport$4.lIIllIlllIlIll[CrashReport$4.lIIllIlllIllII[0]]))).append(CrashReport$4.lIIllIlllIlIll[CrashReport$4.lIIllIlllIllII[1]]).append(System.getProperty(CrashReport$4.lIIllIlllIlIll[CrashReport$4.lIIllIlllIllII[2]])).append(CrashReport$4.lIIllIlllIlIll[CrashReport$4.lIIllIlllIllII[3]]).append(System.getProperty(CrashReport$4.lIIllIlllIlIll[CrashReport$4.lIIllIlllIllII[4]])));
            }
            
            private static boolean llIllIlIIIIllIl(final int lllllllllllllIIlIlIIlIllIIlllIIl, final int lllllllllllllIIlIlIIlIllIIlllIII) {
                return lllllllllllllIIlIlIIlIllIIlllIIl < lllllllllllllIIlIlIIlIllIIlllIII;
            }
            
            private static String llIllIlIIIIlIII(final String lllllllllllllIIlIlIIlIllIlIlIlll, final String lllllllllllllIIlIlIIlIllIlIllIII) {
                try {
                    final SecretKeySpec lllllllllllllIIlIlIIlIllIlIlllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIlIIlIllIlIllIII.getBytes(StandardCharsets.UTF_8)), CrashReport$4.lIIllIlllIllII[6]), "DES");
                    final Cipher lllllllllllllIIlIlIIlIllIlIllIll = Cipher.getInstance("DES");
                    lllllllllllllIIlIlIIlIllIlIllIll.init(CrashReport$4.lIIllIlllIllII[2], lllllllllllllIIlIlIIlIllIlIlllII);
                    return new String(lllllllllllllIIlIlIIlIllIlIllIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIlIIlIllIlIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception lllllllllllllIIlIlIIlIllIlIllIlI) {
                    lllllllllllllIIlIlIIlIllIlIllIlI.printStackTrace();
                    return null;
                }
            }
            
            private static void llIllIlIIIIlIlI() {
                (lIIllIlllIlIll = new String[CrashReport$4.lIIllIlllIllII[5]])[CrashReport$4.lIIllIlllIllII[0]] = llIllIlIIIIIllI("LCAeFH0wLEYbMisk", "FAhuS");
                CrashReport$4.lIIllIlllIlIll[CrashReport$4.lIIllIlllIllII[1]] = llIllIlIIIIIlll("OodvaMUKKeI=", "xzIUQ");
                CrashReport$4.lIIllIlllIlIll[CrashReport$4.lIIllIlllIllII[2]] = llIllIlIIIIlIII("46ViYT676FOuRNfcFmfUfg==", "mbOBd");
                CrashReport$4.lIIllIlllIlIll[CrashReport$4.lIIllIlllIllII[3]] = llIllIlIIIIlIII("ErseXFc5x38=", "kjAKj");
                CrashReport$4.lIIllIlllIlIll[CrashReport$4.lIIllIlllIllII[4]] = llIllIlIIIIIllI("JwofKUo7Bkc+ASMPBjo=", "MkiHd");
            }
            
            private static String llIllIlIIIIIllI(String lllllllllllllIIlIlIIlIllIlIIIlII, final String lllllllllllllIIlIlIIlIllIlIIIIll) {
                lllllllllllllIIlIlIIlIllIlIIIlII = (double)new String(Base64.getDecoder().decode(((String)lllllllllllllIIlIlIIlIllIlIIIlII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                final StringBuilder lllllllllllllIIlIlIIlIllIlIIIlll = new StringBuilder();
                final char[] lllllllllllllIIlIlIIlIllIlIIIllI = lllllllllllllIIlIlIIlIllIlIIIIll.toCharArray();
                int lllllllllllllIIlIlIIlIllIlIIIlIl = CrashReport$4.lIIllIlllIllII[0];
                final Exception lllllllllllllIIlIlIIlIllIIllllll = (Object)((String)lllllllllllllIIlIlIIlIllIlIIIlII).toCharArray();
                final char lllllllllllllIIlIlIIlIllIIlllllI = (char)lllllllllllllIIlIlIIlIllIIllllll.length;
                boolean lllllllllllllIIlIlIIlIllIIllllIl = CrashReport$4.lIIllIlllIllII[0] != 0;
                while (llIllIlIIIIllIl(lllllllllllllIIlIlIIlIllIIllllIl ? 1 : 0, lllllllllllllIIlIlIIlIllIIlllllI)) {
                    final char lllllllllllllIIlIlIIlIllIlIIlIlI = lllllllllllllIIlIlIIlIllIIllllll[lllllllllllllIIlIlIIlIllIIllllIl];
                    lllllllllllllIIlIlIIlIllIlIIIlll.append((char)(lllllllllllllIIlIlIIlIllIlIIlIlI ^ lllllllllllllIIlIlIIlIllIlIIIllI[lllllllllllllIIlIlIIlIllIlIIIlIl % lllllllllllllIIlIlIIlIllIlIIIllI.length]));
                    "".length();
                    ++lllllllllllllIIlIlIIlIllIlIIIlIl;
                    ++lllllllllllllIIlIlIIlIllIIllllIl;
                    "".length();
                    if ("  ".length() < "  ".length()) {
                        return null;
                    }
                }
                return String.valueOf(lllllllllllllIIlIlIIlIllIlIIIlll);
            }
            
            private static void llIllIlIIIIllII() {
                (lIIllIlllIllII = new int[7])[0] = ((0x53 ^ 0x4 ^ (0x6C ^ 0x29)) & (0x3 ^ 0x65 ^ (0x67 ^ 0x13) ^ -" ".length()));
                CrashReport$4.lIIllIlllIllII[1] = " ".length();
                CrashReport$4.lIIllIlllIllII[2] = "  ".length();
                CrashReport$4.lIIllIlllIllII[3] = "   ".length();
                CrashReport$4.lIIllIlllIllII[4] = (0x10 ^ 0x44 ^ (0x8 ^ 0x58));
                CrashReport$4.lIIllIlllIllII[5] = (0xD5 ^ 0x94 ^ (0xEB ^ 0xAF));
                CrashReport$4.lIIllIlllIllII[6] = (0x57 ^ 0x7A ^ (0x66 ^ 0x43));
            }
            
            static {
                llIllIlIIIIllII();
                llIllIlIIIIlIlI();
            }
            
            private static String llIllIlIIIIIlll(final String lllllllllllllIIlIlIIlIllIllIIlII, final String lllllllllllllIIlIlIIlIllIllIIlIl) {
                try {
                    final SecretKeySpec lllllllllllllIIlIlIIlIllIllIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIlIIlIllIllIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                    final Cipher lllllllllllllIIlIlIIlIllIllIlIII = Cipher.getInstance("Blowfish");
                    lllllllllllllIIlIlIIlIllIllIlIII.init(CrashReport$4.lIIllIlllIllII[2], lllllllllllllIIlIlIIlIllIllIlIIl);
                    return new String(lllllllllllllIIlIlIIlIllIllIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIlIIlIllIllIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception lllllllllllllIIlIlIIlIllIllIIlll) {
                    lllllllllllllIIlIlIIlIllIllIIlll.printStackTrace();
                    return null;
                }
            }
        });
        this.theReportCategory.addCrashSectionCallable(CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[5]], new Callable<String>() {
            private static final /* synthetic */ int[] lIIIIIIlIlllII;
            private static final /* synthetic */ String[] lIIIIIIIIIIIlI;
            
            private static void lIllIIlIlIIIIII() {
                (lIIIIIIIIIIIlI = new String[CrashReport$5.lIIIIIIlIlllII[6]])[CrashReport$5.lIIIIIIlIlllII[0]] = lIllIIlIIlllIll("gQKoKpm0Q4vbErCzv52WCQ==", "pyDns");
                CrashReport$5.lIIIIIIIIIIIlI[CrashReport$5.lIIIIIIlIlllII[1]] = lIllIIlIIlllIll("/mYvTD1x2Zw=", "aQjcg");
                CrashReport$5.lIIIIIIIIIIIlI[CrashReport$5.lIIIIIIlIlllII[2]] = lIllIIlIIllllIl("+YggTKkchNXc3DybV6LQPQ==", "UjULm");
                CrashReport$5.lIIIIIIIIIIIlI[CrashReport$5.lIIIIIIlIlllII[3]] = lIllIIlIIlllIll("x7gwiQLw2y5bL5M2WphcHQ==", "uPcgn");
                CrashReport$5.lIIIIIIIIIIIlI[CrashReport$5.lIIIIIIlIlllII[4]] = lIllIIlIIllllll("dy8MEQ8kbV0=", "WMuej");
                CrashReport$5.lIIIIIIIIIIIlI[CrashReport$5.lIIIIIIlIlllII[5]] = lIllIIlIIllllll("VBUnYg==", "tXeKB");
            }
            
            private static String lIllIIlIIllllIl(final String lllllllllllllIlIlIIIIlIlllIlIIIl, final String lllllllllllllIlIlIIIIlIlllIlIIII) {
                try {
                    final SecretKeySpec lllllllllllllIlIlIIIIlIlllIlIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIIIIlIlllIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                    final Cipher lllllllllllllIlIlIIIIlIlllIlIIll = Cipher.getInstance("Blowfish");
                    lllllllllllllIlIlIIIIlIlllIlIIll.init(CrashReport$5.lIIIIIIlIlllII[2], lllllllllllllIlIlIIIIlIlllIlIlII);
                    return new String(lllllllllllllIlIlIIIIlIlllIlIIll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIIIIlIlllIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception lllllllllllllIlIlIIIIlIlllIlIIlI) {
                    lllllllllllllIlIlIIIIlIlllIlIIlI.printStackTrace();
                    return null;
                }
            }
            
            static {
                lIllIlIIIlIIIll();
                lIllIIlIlIIIIII();
            }
            
            private static void lIllIlIIIlIIIll() {
                (lIIIIIIlIlllII = new int[8])[0] = ((0x5C ^ 0x4B) & ~(0xA0 ^ 0xB7));
                CrashReport$5.lIIIIIIlIlllII[1] = " ".length();
                CrashReport$5.lIIIIIIlIlllII[2] = "  ".length();
                CrashReport$5.lIIIIIIlIlllII[3] = "   ".length();
                CrashReport$5.lIIIIIIlIlllII[4] = (0x65 ^ 0x25 ^ (0x4E ^ 0xA));
                CrashReport$5.lIIIIIIlIlllII[5] = (0x1B ^ 0x1E);
                CrashReport$5.lIIIIIIlIlllII[6] = (0x10 ^ 0x6E ^ (0x1E ^ 0x66));
                CrashReport$5.lIIIIIIlIlllII[7] = (0x4F ^ 0x3E ^ (0x24 ^ 0x5D));
            }
            
            private static String lIllIIlIIlllIll(final String lllllllllllllIlIlIIIIlIlllIllllI, final String lllllllllllllIlIlIIIIlIlllIllIll) {
                try {
                    final SecretKeySpec lllllllllllllIlIlIIIIlIllllIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIIIIlIlllIllIll.getBytes(StandardCharsets.UTF_8)), CrashReport$5.lIIIIIIlIlllII[7]), "DES");
                    final Cipher lllllllllllllIlIlIIIIlIllllIIIII = Cipher.getInstance("DES");
                    lllllllllllllIlIlIIIIlIllllIIIII.init(CrashReport$5.lIIIIIIlIlllII[2], lllllllllllllIlIlIIIIlIllllIIIIl);
                    return new String(lllllllllllllIlIlIIIIlIllllIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIIIIlIlllIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception lllllllllllllIlIlIIIIlIlllIlllll) {
                    lllllllllllllIlIlIIIIlIlllIlllll.printStackTrace();
                    return null;
                }
            }
            
            private static String lIllIIlIIllllll(String lllllllllllllIlIlIIIIlIllllIlllI, final String lllllllllllllIlIlIIIIlIllllIllIl) {
                lllllllllllllIlIlIIIIlIllllIlllI = (Exception)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIlIIIIlIllllIlllI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                final StringBuilder lllllllllllllIlIlIIIIlIlllllIIIl = new StringBuilder();
                final char[] lllllllllllllIlIlIIIIlIlllllIIII = lllllllllllllIlIlIIIIlIllllIllIl.toCharArray();
                int lllllllllllllIlIlIIIIlIllllIllll = CrashReport$5.lIIIIIIlIlllII[0];
                final boolean lllllllllllllIlIlIIIIlIllllIlIIl = (Object)((String)lllllllllllllIlIlIIIIlIllllIlllI).toCharArray();
                final double lllllllllllllIlIlIIIIlIllllIlIII = lllllllllllllIlIlIIIIlIllllIlIIl.length;
                char lllllllllllllIlIlIIIIlIllllIIlll = (char)CrashReport$5.lIIIIIIlIlllII[0];
                while (lIllIlIIIlIIlII(lllllllllllllIlIlIIIIlIllllIIlll, (int)lllllllllllllIlIlIIIIlIllllIlIII)) {
                    final char lllllllllllllIlIlIIIIlIlllllIlII = lllllllllllllIlIlIIIIlIllllIlIIl[lllllllllllllIlIlIIIIlIllllIIlll];
                    lllllllllllllIlIlIIIIlIlllllIIIl.append((char)(lllllllllllllIlIlIIIIlIlllllIlII ^ lllllllllllllIlIlIIIIlIlllllIIII[lllllllllllllIlIlIIIIlIllllIllll % lllllllllllllIlIlIIIIlIlllllIIII.length]));
                    "".length();
                    ++lllllllllllllIlIlIIIIlIllllIllll;
                    ++lllllllllllllIlIlIIIIlIllllIIlll;
                    "".length();
                    if (" ".length() <= 0) {
                        return null;
                    }
                }
                return String.valueOf(lllllllllllllIlIlIIIIlIlllllIIIl);
            }
            
            @Override
            public String call() {
                final Runtime lllllllllllllIlIlIIIIllIIIIIllIl = Runtime.getRuntime();
                final long lllllllllllllIlIlIIIIllIIIIIllII = lllllllllllllIlIlIIIIllIIIIIllIl.maxMemory();
                final long lllllllllllllIlIlIIIIllIIIIIlIll = lllllllllllllIlIlIIIIllIIIIIllIl.totalMemory();
                final long lllllllllllllIlIlIIIIllIIIIIlIlI = lllllllllllllIlIlIIIIllIIIIIllIl.freeMemory();
                final long lllllllllllllIlIlIIIIllIIIIIlIIl = lllllllllllllIlIlIIIIllIIIIIllII / 1024L / 1024L;
                final long lllllllllllllIlIlIIIIllIIIIIlIII = lllllllllllllIlIlIIIIllIIIIIlIll / 1024L / 1024L;
                final long lllllllllllllIlIlIIIIllIIIIIIlll = lllllllllllllIlIlIIIIllIIIIIlIlI / 1024L / 1024L;
                return String.valueOf(new StringBuilder(String.valueOf(lllllllllllllIlIlIIIIllIIIIIlIlI)).append(CrashReport$5.lIIIIIIIIIIIlI[CrashReport$5.lIIIIIIlIlllII[0]]).append(lllllllllllllIlIlIIIIllIIIIIIlll).append(CrashReport$5.lIIIIIIIIIIIlI[CrashReport$5.lIIIIIIlIlllII[1]]).append(lllllllllllllIlIlIIIIllIIIIIlIll).append(CrashReport$5.lIIIIIIIIIIIlI[CrashReport$5.lIIIIIIlIlllII[2]]).append(lllllllllllllIlIlIIIIllIIIIIlIII).append(CrashReport$5.lIIIIIIIIIIIlI[CrashReport$5.lIIIIIIlIlllII[3]]).append(lllllllllllllIlIlIIIIllIIIIIllII).append(CrashReport$5.lIIIIIIIIIIIlI[CrashReport$5.lIIIIIIlIlllII[4]]).append(lllllllllllllIlIlIIIIllIIIIIlIIl).append(CrashReport$5.lIIIIIIIIIIIlI[CrashReport$5.lIIIIIIlIlllII[5]]));
            }
            
            private static boolean lIllIlIIIlIIlII(final int lllllllllllllIlIlIIIIlIlllIIlIIl, final int lllllllllllllIlIlIIIIlIlllIIlIII) {
                return lllllllllllllIlIlIIIIlIlllIIlIIl < lllllllllllllIlIlIIIIlIlllIIlIII;
            }
        });
        this.theReportCategory.addCrashSectionCallable(CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[6]], new Callable<String>() {
            private static final /* synthetic */ int[] lIlIllIIIIlIII;
            private static final /* synthetic */ String[] lIlIllIIIIIlll;
            
            private static String llllIIIIIIlIlIl(String lllllllllllllIIIIlllIlllIIIIIllI, final String lllllllllllllIIIIlllIlllIIIIIlIl) {
                lllllllllllllIIIIlllIlllIIIIIllI = new String(Base64.getDecoder().decode(lllllllllllllIIIIlllIlllIIIIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                final StringBuilder lllllllllllllIIIIlllIlllIIIIlIIl = new StringBuilder();
                final char[] lllllllllllllIIIIlllIlllIIIIlIII = lllllllllllllIIIIlllIlllIIIIIlIl.toCharArray();
                int lllllllllllllIIIIlllIlllIIIIIlll = CrashReport$6.lIlIllIIIIlIII[0];
                final String lllllllllllllIIIIlllIlllIIIIIIIl = (Object)lllllllllllllIIIIlllIlllIIIIIllI.toCharArray();
                final boolean lllllllllllllIIIIlllIlllIIIIIIII = lllllllllllllIIIIlllIlllIIIIIIIl.length != 0;
                float lllllllllllllIIIIlllIllIllllllll = CrashReport$6.lIlIllIIIIlIII[0];
                while (llllIIIIIIllIll((int)lllllllllllllIIIIlllIllIllllllll, lllllllllllllIIIIlllIlllIIIIIIII ? 1 : 0)) {
                    final char lllllllllllllIIIIlllIlllIIIIllII = lllllllllllllIIIIlllIlllIIIIIIIl[lllllllllllllIIIIlllIllIllllllll];
                    lllllllllllllIIIIlllIlllIIIIlIIl.append((char)(lllllllllllllIIIIlllIlllIIIIllII ^ lllllllllllllIIIIlllIlllIIIIlIII[lllllllllllllIIIIlllIlllIIIIIlll % lllllllllllllIIIIlllIlllIIIIlIII.length]));
                    "".length();
                    ++lllllllllllllIIIIlllIlllIIIIIlll;
                    ++lllllllllllllIIIIlllIllIllllllll;
                    "".length();
                    if (null != null) {
                        return null;
                    }
                }
                return String.valueOf(lllllllllllllIIIIlllIlllIIIIlIIl);
            }
            
            @Override
            public String call() {
                final RuntimeMXBean lllllllllllllIIIIlllIlllIIlIllll = ManagementFactory.getRuntimeMXBean();
                final List<String> lllllllllllllIIIIlllIlllIIlIlllI = lllllllllllllIIIIlllIlllIIlIllll.getInputArguments();
                int lllllllllllllIIIIlllIlllIIlIllIl = CrashReport$6.lIlIllIIIIlIII[0];
                final StringBuilder lllllllllllllIIIIlllIlllIIlIllII = new StringBuilder();
                final short lllllllllllllIIIIlllIlllIIlIIlIl = (short)lllllllllllllIIIIlllIlllIIlIlllI.iterator();
                "".length();
                if (-" ".length() == " ".length()) {
                    return null;
                }
                while (!llllIIIIIIllIlI(((Iterator)lllllllllllllIIIIlllIlllIIlIIlIl).hasNext() ? 1 : 0)) {
                    final String lllllllllllllIIIIlllIlllIIlIlIll = ((Iterator<String>)lllllllllllllIIIIlllIlllIIlIIlIl).next();
                    if (llllIIIIIIllIII(lllllllllllllIIIIlllIlllIIlIlIll.startsWith(CrashReport$6.lIlIllIIIIIlll[CrashReport$6.lIlIllIIIIlIII[0]]) ? 1 : 0)) {
                        if (llllIIIIIIllIIl(lllllllllllllIIIIlllIlllIIlIllIl++)) {
                            lllllllllllllIIIIlllIlllIIlIllII.append(CrashReport$6.lIlIllIIIIIlll[CrashReport$6.lIlIllIIIIlIII[1]]);
                            "".length();
                        }
                        lllllllllllllIIIIlllIlllIIlIllII.append(lllllllllllllIIIIlllIlllIIlIlIll);
                        "".length();
                    }
                }
                final String format = CrashReport$6.lIlIllIIIIIlll[CrashReport$6.lIlIllIIIIlIII[2]];
                final Object[] args = new Object[CrashReport$6.lIlIllIIIIlIII[2]];
                args[CrashReport$6.lIlIllIIIIlIII[0]] = lllllllllllllIIIIlllIlllIIlIllIl;
                args[CrashReport$6.lIlIllIIIIlIII[1]] = String.valueOf(lllllllllllllIIIIlllIlllIIlIllII);
                return String.format(format, args);
            }
            
            private static boolean llllIIIIIIllIlI(final int lllllllllllllIIIIlllIllIlllIlIIl) {
                return lllllllllllllIIIIlllIllIlllIlIIl == 0;
            }
            
            private static String llllIIIIIIlIlII(final String lllllllllllllIIIIlllIlllIIIllIIl, final String lllllllllllllIIIIlllIlllIIIllIII) {
                try {
                    final SecretKeySpec lllllllllllllIIIIlllIlllIIIllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIlllIlllIIIllIII.getBytes(StandardCharsets.UTF_8)), CrashReport$6.lIlIllIIIIlIII[4]), "DES");
                    final Cipher lllllllllllllIIIIlllIlllIIIlllIl = Cipher.getInstance("DES");
                    lllllllllllllIIIIlllIlllIIIlllIl.init(CrashReport$6.lIlIllIIIIlIII[2], lllllllllllllIIIIlllIlllIIIllllI);
                    return new String(lllllllllllllIIIIlllIlllIIIlllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIlllIlllIIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception lllllllllllllIIIIlllIlllIIIlllII) {
                    lllllllllllllIIIIlllIlllIIIlllII.printStackTrace();
                    return null;
                }
            }
            
            private static void llllIIIIIIlIllI() {
                (lIlIllIIIIIlll = new String[CrashReport$6.lIlIllIIIIlIII[3]])[CrashReport$6.lIlIllIIIIlIII[0]] = llllIIIIIIlIIll("dpZz1+aTyR4=", "Kakiu");
                CrashReport$6.lIlIllIIIIIlll[CrashReport$6.lIlIllIIIIlIII[1]] = llllIIIIIIlIlII("kvVW/CsUfIY=", "aIbjD");
                CrashReport$6.lIlIllIIIIIlll[CrashReport$6.lIlIllIIIIlIII[2]] = llllIIIIIIlIlIl("dwBEAzomBQhMdXcX", "RddwU");
            }
            
            static {
                llllIIIIIIlIlll();
                llllIIIIIIlIllI();
            }
            
            private static String llllIIIIIIlIIll(final String lllllllllllllIIIIlllIllIllllIllI, final String lllllllllllllIIIIlllIllIllllIlIl) {
                try {
                    final SecretKeySpec lllllllllllllIIIIlllIllIlllllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIlllIllIllllIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                    final Cipher lllllllllllllIIIIlllIllIlllllIII = Cipher.getInstance("Blowfish");
                    lllllllllllllIIIIlllIllIlllllIII.init(CrashReport$6.lIlIllIIIIlIII[2], lllllllllllllIIIIlllIllIlllllIIl);
                    return new String(lllllllllllllIIIIlllIllIlllllIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIlllIllIllllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception lllllllllllllIIIIlllIllIllllIlll) {
                    lllllllllllllIIIIlllIllIllllIlll.printStackTrace();
                    return null;
                }
            }
            
            private static boolean llllIIIIIIllIll(final int lllllllllllllIIIIlllIllIlllIlllI, final int lllllllllllllIIIIlllIllIlllIllIl) {
                return lllllllllllllIIIIlllIllIlllIlllI < lllllllllllllIIIIlllIllIlllIllIl;
            }
            
            private static boolean llllIIIIIIllIIl(final int lllllllllllllIIIIlllIllIlllIIlll) {
                return lllllllllllllIIIIlllIllIlllIIlll > 0;
            }
            
            private static boolean llllIIIIIIllIII(final int lllllllllllllIIIIlllIllIlllIlIll) {
                return lllllllllllllIIIIlllIllIlllIlIll != 0;
            }
            
            private static void llllIIIIIIlIlll() {
                (lIlIllIIIIlIII = new int[5])[0] = ((0xF6 ^ 0x95) & ~(0x10 ^ 0x73));
                CrashReport$6.lIlIllIIIIlIII[1] = " ".length();
                CrashReport$6.lIlIllIIIIlIII[2] = "  ".length();
                CrashReport$6.lIlIllIIIIlIII[3] = "   ".length();
                CrashReport$6.lIlIllIIIIlIII[4] = (0x68 ^ 0x60);
            }
        });
        this.theReportCategory.addCrashSectionCallable(CrashReport.lIlIIIllllllIl[CrashReport.lIlIIlIIIIIlll[7]], new Callable<String>() {
            @Override
            public String call() throws Exception {
                return IntCache.getCacheSizes();
            }
        });
    }
    
    public Throwable getCrashCause() {
        return this.cause;
    }
}
