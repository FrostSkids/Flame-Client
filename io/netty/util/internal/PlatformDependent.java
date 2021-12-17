// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util.internal;

import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.regex.Matcher;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.lang.reflect.Field;
import java.util.Locale;
import java.util.Queue;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.ConcurrentHashMap;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8;
import java.util.concurrent.ConcurrentMap;
import io.netty.util.internal.logging.InternalLoggerFactory;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.util.internal.logging.InternalLogger;
import java.io.File;
import java.util.regex.Pattern;

public final class PlatformDependent
{
    private static final /* synthetic */ Pattern MAX_DIRECT_MEMORY_SIZE_ARG_PATTERN;
    private static final /* synthetic */ long MAX_DIRECT_MEMORY;
    private static final /* synthetic */ boolean CAN_ENABLE_TCP_NODELAY_BY_DEFAULT;
    private static final /* synthetic */ int BIT_MODE;
    private static final /* synthetic */ int ADDRESS_SIZE;
    private static final /* synthetic */ int JAVA_VERSION;
    private static final /* synthetic */ boolean CAN_USE_CHM_V8;
    private static final /* synthetic */ boolean DIRECT_BUFFER_PREFERRED;
    private static final /* synthetic */ File TMPDIR;
    private static final /* synthetic */ String[] lIllIIllIllIll;
    private static final /* synthetic */ boolean HAS_UNSAFE;
    private static final /* synthetic */ boolean IS_ROOT;
    private static final /* synthetic */ InternalLogger logger;
    private static final /* synthetic */ int[] lIllIIllllIIlI;
    private static final /* synthetic */ long ARRAY_BASE_OFFSET;
    private static final /* synthetic */ boolean IS_ANDROID;
    private static final /* synthetic */ boolean IS_WINDOWS;
    private static final /* synthetic */ boolean HAS_JAVASSIST;
    
    public static boolean isAndroid() {
        return PlatformDependent.IS_ANDROID;
    }
    
    private static boolean lllllIllIlIllll(final int lllllllllllllIIIIIIIlllIlIIlllIl) {
        return lllllllllllllIIIIIIIlllIlIIlllIl >= 0;
    }
    
    private static void lllllIllIlIIIIl() {
        (lIllIIllIllIll = new String[PlatformDependent.lIllIIllllIIlI[87]])[PlatformDependent.lIllIIllllIIlI[0]] = lllllIlIlllIIll("m+KiX8N0+fLNDe+8iyjflrt7bV8d+vGm", "zLAzF");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[1]] = lllllIlIllllllI("Ew4pFRAsECVbVgIMLBMZKgY=", "CbHav");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[2]] = lllllIlIlllllll("ZgKne5f8K2w=", "rhhxE");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[3]] = lllllIlIlllIIll("rEi7lHv2c/c=", "lVBTj");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[4]] = lllllIlIlllllll("xnypqJM86lE=", "Pyqak");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[5]] = lllllIlIllllllI("IQIlBREeHClLVyYHKhUYBh0=", "qnDqw");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[6]] = lllllIlIllllllI("ez0gH2c2IT1CITA=", "THSmH");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[7]] = lllllIlIlllIIll("afdd5FnQv7I=", "iIJbg");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[8]] = lllllIlIllllllI("Ij0=", "KYjSi");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[9]] = lllllIlIlllllll("zmgiSOO2PVdgkhJlAi6a8gSe1srvSFD1", "rgysA");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[10]] = lllllIlIllllllI("MERxYn0SN391dDM3fnV0M0ZnfA==", "nlNXM");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[11]] = lllllIlIlllllll("uhf25oHkDdU=", "VLfvX");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[12]] = lllllIlIllllllI("MQABTFAfNA==", "dIEvp");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[13]] = lllllIlIlllIIll("SLwLGZqYfD0=", "mhTls");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[14]] = lllllIlIlllIIll("3yWPj2oBIOcenO7peQs4D0ebbM4wdkzSbcsXvWLBSifjdVR3AsPsmrojy70X58fCLKfCXPx+bcTTK1vPncemINMatk/JyVXVDw0mlmyz7yLiiU1la5HB0zXDFC6vpVxX", "dqAzL");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[15]] = lllllIlIlllIIll("XSSXVQiMd+2kNPkM0mHf1GeD/QKrulDR0bf2hbGS9NM=", "xjuqm");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[17]] = lllllIlIlllllll("MmLRpa4JjFf4YXRXsf71/lVtHj5w61ge8fKEd2+IHf3rc8ONRUKwDw==", "VuwlH");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[18]] = lllllIlIllllllI("", "iFIWe");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[19]] = lllllIlIlllllll("zdOaYzKIaRE8pfjUyb5XlqgYJaZrQtSrNrj2Os+ktecXnN3FM9IiPal66BfQ/35n1EXMoi2Vy5g=", "eCgrI");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[20]] = lllllIlIlllIIll("BsBGRAg1yBPLFO6DpMOXTQ==", "jBuNz");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[21]] = lllllIlIllllllI("CyUFNl0UMBo7XQIrHTQGEzYWOQdPCBo5GAQgJyUSDzcVMgEwMRYiFg==", "aDsWs");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[22]] = lllllIlIllllllI("BywPAGY7KAsSLyIjQ0E9MA==", "MMyaF");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[23]] = lllllIlIlllIIll("iRgwTiRyTbwT3Weg5mRomMqPjcWpuPBh", "HLKcT");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[24]] = lllllIlIllllllI("ZwE+LGwkICM3O2QrOBYsOSQxJnhqPio=", "JEWCB");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[25]] = lllllIlIlllIIll("gQQY3kI+9+s/oUqjUF8hnEGyd/fBrsFm2awmYM/6ZCRjAg1RbSC66Q==", "ZEQCu");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[26]] = lllllIlIllllllI("HRYqXj0HECdeBQAQJRY1VEMxHjEYAi0cMQwPIVB4BwxqHjUaFz1ePgE2KgMxCAZt", "ncDpP");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[27]] = lllllIlIlllIIll("SSBJNH2oUgKfZubgFcnM4LcOE68A+t5R", "RzaGJ");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[28]] = lllllIlIlllIIll("WneRkFdY7fI6M3JrF6o5b0NQ8ipO9rM8", "YWsrp");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[29]] = lllllIlIllllllI("OBMNeQY1DhkkQjkEHiMVeRUYLjk5EgsxCQ==", "WajWl");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[30]] = lllllIlIllllllI("Iy8lXg45KSheNj4pKhYGano+HgImOyIcAjI2LlBLOTVlHgYkLjJeFyIjHh4QMTwuXwwiPWUaAT8pOF4NNS4/CU0kKDIlDSM7LRVK", "PZKpc");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[31]] = lllllIlIlllIIll("KeXT0Hlre4Kdhr+NGD0rs7Iv5aPujPZB", "kjVra");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[32]] = lllllIlIllllllI("Bi4CIx4GOg8v", "gXcJr");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[33]] = lllllIlIlllllll("/VpGrw9qGOxRfdqrieUkjw==", "eUxOR");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[34]] = lllllIlIlllllll("mU1g3xBADXLWK4TcANF5HA==", "qFgSe");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[35]] = lllllIlIlllIIll("hrtffWfbYCCoNVQ4D3F/LA==", "GzYWs");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[36]] = lllllIlIlllIIll("UzVNbSydW0lfcsmPbp8SFl65ezLH5QFZEWFN4qNMcL0N9VJMXuzFTQ==", "ecYnQ");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[37]] = lllllIlIlllllll("sg9WVxSoUyki3tCAnKwUpTyL14ds3HSur9iHTdw81bedd7JQ5HwgoQ==", "KzsUy");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[38]] = lllllIlIllllllI("PQcfCwM0FgI0Exc6KTwXNA==", "ZbkYv");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[39]] = lllllIlIllllllI("AgIGHhwVEgYWAAISHzIcERQ=", "egrWr");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[40]] = lllllIlIlllIIll("07xTycxHVH+hWvBNqqJefsEAJo1aAs2EBe+dsM1Vr/UeOOXaaLAcCA==", "jmZwl");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[41]] = lllllIlIlllllll("TCESpR3zbuNxJZ/4Qy1VbHSIZ0PKyQ7SQxzbN1+dF3o=", "HcMWW");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[42]] = lllllIlIlllllll("SgkxA1ynWRhGmVKcVFlnNkrJQni+CXJP", "EhQSu");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[43]] = lllllIlIlllIIll("QXPNAkidTF9xYc97qVU20Uc/uLTGoyNCstSBE5zuXOk=", "dobeK");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[44]] = lllllIlIlllllll("A7Pi2mSa1Ulyy8k3DcnWbg/jGYLzomZVzOA8p9l9g+2TrOoQMhUaRmfjesG742C2", "eksoC");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[45]] = lllllIlIllllllI("GiceFzIjLxsCe3AnHhcoPCcKGiQ=", "PFhvA");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[46]] = lllllIlIlllIIll("mnyOVh8rHovmGBGlBiiZioDeqLMj6M33", "AzHzJ");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[47]] = lllllIlIlllIIll("RSoIOC4uxTytIur2FS55BLpLDagUh3PQFWqMKcrzC47tfhvnYA3gDgY72mkZVJ7Ygc9rGq5j0TZr1oxskPW3iYcG1FNOCbicWi9ziMQEvHHN2VN2l4/pVBFK9SrkuCTYjfJ2DqMdzKODhsp/rvchQ2HWYy+V0+g6zpOy0X0pL43MPKOGepGpr1f/s2/IqpsewNYj2LCH+vCptIhx3RWmpXTIesEwasvUQ9gt5nQJGAc=", "maKEw");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[48]] = lllllIlIlllIIll("KC69Z9htprKqWnfkoJ7fOQ==", "knTbq");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[49]] = lllllIlIlllllll("uAph4mzAV/LDdJsiFOw7SDsqXye8PBRj", "zBPJw");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[50]] = lllllIlIlllllll("Yp7/KuGlp007thT+5dpjpg==", "fySZJ");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[51]] = lllllIlIlllllll("7AVx24ZIBIy+cp0w5O+FGGtg3FKa/MceLF9oma/iK5FoXg5ETZoQwA==", "cpwWH");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[52]] = lllllIlIllllllI("BgsCIw==", "RNOsa");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[53]] = lllllIlIllllllI("QysaJHYACgc/IUAbHjs8Bx1JayMTT1tuDCsiI25x", "nosKX");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[54]] = lllllIlIlllIIll("83rWJTds0++nKSqt1uR/5Q==", "wiulz");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[55]] = lllllIlIlllIIll("M7UTC5m5oamEthGEnZTmdTEZDgaeE3Wt", "ugaSH");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[56]] = lllllIlIllllllI("TyYYFmkMBwUNPkwWHAkjCxBLWTwfQllcEjEnIykVLSQ4NQJHPjAJNyYDBRgbLg0SGCs+NhQUN0s=", "bbqyG");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[57]] = lllllIlIlllIIll("xL5gKjOzmg2lLi/L/NFFgB1Rypjzvs1g", "WFVfo");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[58]] = lllllIlIlllllll("1PegmDlWPkbsGq9CZvoPTEaoYLdZjaX+6pY5Dv/0vX9dcULC8mduvg93Y0BZcRE5agMI9EIfBZ3dx8nQA1mdxA==", "ivNLn");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[59]] = lllllIlIlllIIll("f5a3AOSyFQU=", "lXRIF");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[60]] = lllllIlIlllllll("LN+ijY9/i1tlQTsKZ7LQFUCApKJCPP5abiqxSQYKo1c=", "pCVCg");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[61]] = lllllIlIlllllll("Fse0Nf+7nOhen4fEBEoF8w==", "vsVPU");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[62]] = lllllIlIlllllll("uCQ8kvEglBg=", "tLVvz");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[63]] = lllllIlIllllllI("FDckPiA2djk9ZTUzOXIxOjNtJiA/JiIgJCAvbTYsIDMuJiogL3ZyIzM6ITsrNXYvMyY5djk9f3ItMA==", "RVMRE");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[64]] = lllllIlIlllIIll("PBzcK2fMDcqFhbdZdW0tEiIEJQUTQ+N0", "NmEYg");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[65]] = lllllIlIllllllI("TiwTG38NDQ4AKE0KEwAcDAwfTnEYFQ==", "chztQ");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[66]] = lllllIlIlllllll("5KyPSc2LV76F7i43N7OAkdcG2jLC6NOQ", "HTycP");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[67]] = lllllIlIllllllI("QyAbJXgAAQY+L0AGGz4bAQAXcHYVGVJiJRsKXCskDQxcLjcaBVwnOQoBHmM=", "ndrJV");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[68]] = lllllIlIlllllll("GY+qVFejiU+WdsrznA3cTT97y1Npetga", "srbzX");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[69]] = lllllIlIlllllll("XeoqtQNoWYBbNqC9xJFSKyvSFjkvE51Bq3bWn4RXX0xIutBTsiXxirDAs8shkbSG", "WgcQa");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[70]] = lllllIlIlllllll("9owKzcq+sps=", "GkznB");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[71]] = lllllIlIlllIIll("ehLbWlfyhsA=", "pkAtN");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[72]] = lllllIlIllllllI("LiMJQ00=", "ONmuy");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[73]] = lllllIlIlllllll("gG50k5uBUHw=", "DjsNb");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[74]] = lllllIlIlllllll("Z6yJ8tE+W+A=", "Mdrul");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[75]] = lllllIlIllllllI("Akx/Zw==", "kxGQw");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[76]] = lllllIlIlllllll("Bfj9bIw+5U8=", "aBWcW");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[77]] = lllllIlIllllllI("Knpecw==", "CLfEq");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[78]] = lllllIlIllllllI("Zy0MB00kDBEcGmQLDBwuJQ0AUkMxFEVADDlHBBoAIlNFEx5j", "Jiehc");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[79]] = lllllIlIlllIIll("kAWqofkauVhBVVPcRZoQog==", "DbbIN");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[80]] = lllllIlIlllllll("Bxnn0revGsc=", "VCKac");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[81]] = lllllIlIllllllI("Tyx8TkM6LH1OQzpcZE5FBR45", "gwMcz");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[83]] = lllllIlIllllllI("ODdyayw8fhUnDCAtKiMXEAk9KxsWPQsvDgEYK2xJODdybi9UaWEbX00YK2xcPy8TKzkDAwV5XTg3cmI=", "dDXFt");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[84]] = lllllIlIllllllI("KgVYDAQ3Hg9MDyw6BAcHJhgyCxMmCQI=", "Cjvba");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[85]] = lllllIlIllllllI("XwMBPm8cIhwlOFwpBwEzFyENIwUbNQ0yNUhnEyw=", "rGhQA");
        PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[86]] = lllllIlIlllllll("YoW/67DAR8HYemL+DlaGlj9zyQDLZ0Fwng1/jQeFVe1rzrdSEAgJZnKI8SUgt6lJmy2xZtcTXTM0ki+2Z/L/oCE4V8zaXPheDzgfdvatnGs4yQ3gmu662OG1fr5vR03kTTzBoCWzloNfhK3JXX000xVKXAsft+SYzOL3iPJtyvACCX/xmiiAx6SolONbkzAR/VcfJZsBE6/hHWl0lpnuTNk6utjNw9qAotmGH9j5vwuUraY+CJ/HlY0vZfHkBwP0j2/r/2YgQ7I=", "EsmAR");
    }
    
    private static String lllllIlIlllIIll(final String lllllllllllllIIIIIIIlllIlIlIlllI, final String lllllllllllllIIIIIIIlllIlIlIllll) {
        try {
            final SecretKeySpec lllllllllllllIIIIIIIlllIlIllIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIIIlllIlIlIllll.getBytes(StandardCharsets.UTF_8)), PlatformDependent.lIllIIllllIIlI[8]), "DES");
            final Cipher lllllllllllllIIIIIIIlllIlIllIIlI = Cipher.getInstance("DES");
            lllllllllllllIIIIIIIlllIlIllIIlI.init(PlatformDependent.lIllIIllllIIlI[2], lllllllllllllIIIIIIIlllIlIllIIll);
            return new String(lllllllllllllIIIIIIIlllIlIllIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIIIlllIlIlIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIIIlllIlIllIIIl) {
            lllllllllllllIIIIIIIlllIlIllIIIl.printStackTrace();
            return null;
        }
    }
    
    public static void putLong(final long lllllllllllllIIIIIIIllllllllllIl, final long lllllllllllllIIIIIIIlllllllllIlI) {
        PlatformDependent0.putLong(lllllllllllllIIIIIIIllllllllllIl, lllllllllllllIIIIIIIlllllllllIlI);
    }
    
    public static Object getObject(final Object lllllllllllllIIIIIIlIIIIIIllIlll, final long lllllllllllllIIIIIIlIIIIIIllIllI) {
        return PlatformDependent0.getObject(lllllllllllllIIIIIIlIIIIIIllIlll, lllllllllllllIIIIIIlIIIIIIllIllI);
    }
    
    private static int lllllIllIlIlllI(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    static {
        lllllIllIlIIlIl();
        lllllIllIlIIIIl();
        logger = InternalLoggerFactory.getInstance(PlatformDependent.class);
        MAX_DIRECT_MEMORY_SIZE_ARG_PATTERN = Pattern.compile(PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[83]]);
        IS_ANDROID = isAndroid0();
        IS_WINDOWS = isWindows0();
        IS_ROOT = isRoot0();
        JAVA_VERSION = javaVersion0();
        int can_ENABLE_TCP_NODELAY_BY_DEFAULT;
        if (lllllIllIlIIlll(isAndroid() ? 1 : 0)) {
            can_ENABLE_TCP_NODELAY_BY_DEFAULT = PlatformDependent.lIllIIllllIIlI[1];
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            can_ENABLE_TCP_NODELAY_BY_DEFAULT = PlatformDependent.lIllIIllllIIlI[0];
        }
        CAN_ENABLE_TCP_NODELAY_BY_DEFAULT = (can_ENABLE_TCP_NODELAY_BY_DEFAULT != 0);
        HAS_UNSAFE = hasUnsafe0();
        int can_USE_CHM_V8;
        if (lllllIllIlIIllI(PlatformDependent.HAS_UNSAFE ? 1 : 0) && lllllIllIlIlIII(PlatformDependent.JAVA_VERSION, PlatformDependent.lIllIIllllIIlI[8])) {
            can_USE_CHM_V8 = PlatformDependent.lIllIIllllIIlI[1];
            "".length();
            if (-" ".length() >= 0) {
                return;
            }
        }
        else {
            can_USE_CHM_V8 = PlatformDependent.lIllIIllllIIlI[0];
        }
        CAN_USE_CHM_V8 = (can_USE_CHM_V8 != 0);
        int direct_BUFFER_PREFERRED;
        if (lllllIllIlIIllI(PlatformDependent.HAS_UNSAFE ? 1 : 0) && lllllIllIlIIlll(SystemPropertyUtil.getBoolean(PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[84]], (boolean)(PlatformDependent.lIllIIllllIIlI[0] != 0)) ? 1 : 0)) {
            direct_BUFFER_PREFERRED = PlatformDependent.lIllIIllllIIlI[1];
            "".length();
            if ("   ".length() > "   ".length()) {
                return;
            }
        }
        else {
            direct_BUFFER_PREFERRED = PlatformDependent.lIllIIllllIIlI[0];
        }
        DIRECT_BUFFER_PREFERRED = (direct_BUFFER_PREFERRED != 0);
        MAX_DIRECT_MEMORY = maxDirectMemory0();
        ARRAY_BASE_OFFSET = arrayBaseOffset0();
        HAS_JAVASSIST = hasJavassist0();
        TMPDIR = tmpdir0();
        BIT_MODE = bitMode0();
        ADDRESS_SIZE = addressSize0();
        if (lllllIllIlIIllI(PlatformDependent.logger.isDebugEnabled() ? 1 : 0)) {
            final InternalLogger logger2 = PlatformDependent.logger;
            final String s = PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[85]];
            int b;
            if (lllllIllIlIIlll(PlatformDependent.DIRECT_BUFFER_PREFERRED ? 1 : 0)) {
                b = PlatformDependent.lIllIIllllIIlI[1];
                "".length();
                if (((0x49 ^ 0x70) & ~(0x7A ^ 0x43)) < 0) {
                    return;
                }
            }
            else {
                b = PlatformDependent.lIllIIllllIIlI[0];
            }
            logger2.debug(s, (Object)(boolean)(b != 0));
        }
        if (lllllIllIlIIlll(hasUnsafe() ? 1 : 0) && lllllIllIlIIlll(isAndroid() ? 1 : 0)) {
            PlatformDependent.logger.info(PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[86]]);
        }
    }
    
    public static <K, V> ConcurrentMap<K, V> newConcurrentHashMap(final int lllllllllllllIIIIIIlIIIIIlIlIlIl) {
        if (lllllIllIlIIllI(PlatformDependent.CAN_USE_CHM_V8 ? 1 : 0)) {
            return new ConcurrentHashMapV8<K, V>(lllllllllllllIIIIIIlIIIIIlIlIlIl);
        }
        return new ConcurrentHashMap<K, V>(lllllllllllllIIIIIIlIIIIIlIlIlIl);
    }
    
    public static <K, V> ConcurrentMap<K, V> newConcurrentHashMap() {
        if (lllllIllIlIIllI(PlatformDependent.CAN_USE_CHM_V8 ? 1 : 0)) {
            return new ConcurrentHashMapV8<K, V>();
        }
        return new ConcurrentHashMap<K, V>();
    }
    
    private static boolean lllllIllIlIIllI(final int lllllllllllllIIIIIIIlllIlIlIIIIl) {
        return lllllllllllllIIIIIIIlllIlIlIIIIl != 0;
    }
    
    public static <T> AtomicLongFieldUpdater<T> newAtomicLongFieldUpdater(final Class<?> lllllllllllllIIIIIIIllllllIIIIII, final String lllllllllllllIIIIIIIllllllIIIIIl) {
        if (lllllIllIlIIllI(hasUnsafe() ? 1 : 0)) {
            try {
                return PlatformDependent0.newAtomicLongFieldUpdater(lllllllllllllIIIIIIIllllllIIIIII, lllllllllllllIIIIIIIllllllIIIIIl);
            }
            catch (Throwable t) {}
        }
        return null;
    }
    
    public static void putInt(final long lllllllllllllIIIIIIlIIIIIIIIIIll, final int lllllllllllllIIIIIIlIIIIIIIIIIII) {
        PlatformDependent0.putInt(lllllllllllllIIIIIIlIIIIIIIIIIll, lllllllllllllIIIIIIlIIIIIIIIIIII);
    }
    
    public static <U, W> AtomicReferenceFieldUpdater<U, W> newAtomicReferenceFieldUpdater(final Class<U> lllllllllllllIIIIIIIllllllIlIlII, final String lllllllllllllIIIIIIIllllllIlIIll) {
        if (lllllIllIlIIllI(hasUnsafe() ? 1 : 0)) {
            try {
                return PlatformDependent0.newAtomicReferenceFieldUpdater(lllllllllllllIIIIIIIllllllIlIlII, lllllllllllllIIIIIIIllllllIlIIll);
            }
            catch (Throwable t) {}
        }
        return null;
    }
    
    private static boolean lllllIllIlIlIII(final int lllllllllllllIIIIIIIlllIlIlIlIII, final int lllllllllllllIIIIIIIlllIlIlIIlll) {
        return lllllllllllllIIIIIIIlllIlIlIlIII < lllllllllllllIIIIIIIlllIlIlIIlll;
    }
    
    private PlatformDependent() {
    }
    
    public static void freeDirectBuffer(final ByteBuffer lllllllllllllIIIIIIlIIIIIlIIIIII) {
        if (lllllIllIlIIllI(hasUnsafe() ? 1 : 0) && lllllIllIlIIlll(isAndroid() ? 1 : 0)) {
            PlatformDependent0.freeDirectBuffer(lllllllllllllIIIIIIlIIIIIlIIIIII);
        }
    }
    
    private static int addressSize0() {
        if (lllllIllIlIIlll(hasUnsafe() ? 1 : 0)) {
            return PlatformDependent.lIllIIllllIIlI[82];
        }
        return PlatformDependent0.addressSize();
    }
    
    private static boolean hasJavassist0() {
        if (lllllIllIlIIllI(isAndroid() ? 1 : 0)) {
            return PlatformDependent.lIllIIllllIIlI[0] != 0;
        }
        final boolean lllllllllllllIIIIIIIllllIIlIlIll = SystemPropertyUtil.getBoolean(PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[42]], (boolean)(PlatformDependent.lIllIIllllIIlI[0] != 0));
        PlatformDependent.logger.debug(PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[43]], (Object)lllllllllllllIIIIIIIllllIIlIlIll);
        if (lllllIllIlIIllI(lllllllllllllIIIIIIIllllIIlIlIll ? 1 : 0)) {
            PlatformDependent.logger.debug(PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[44]]);
            return PlatformDependent.lIllIIllllIIlI[0] != 0;
        }
        try {
            JavassistTypeParameterMatcherGenerator.generate(Object.class, getClassLoader(PlatformDependent.class));
            "".length();
            PlatformDependent.logger.debug(PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[45]]);
            return PlatformDependent.lIllIIllllIIlI[1] != 0;
        }
        catch (Throwable lllllllllllllIIIIIIIllllIIlIllII) {
            PlatformDependent.logger.debug(PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[46]]);
            PlatformDependent.logger.debug(PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[47]]);
            return PlatformDependent.lIllIIllllIIlI[0] != 0;
        }
    }
    
    public static boolean hasUnsafe() {
        return PlatformDependent.HAS_UNSAFE;
    }
    
    private static <E extends Throwable> void throwException0(final Throwable lllllllllllllIIIIIIlIIIIIlIllIII) throws E, Throwable {
        throw lllllllllllllIIIIIIlIIIIIlIllIII;
    }
    
    public static <T> Queue<T> newMpscQueue() {
        return new MpscLinkedQueue<T>();
    }
    
    public static byte getByte(final long lllllllllllllIIIIIIlIIIIIIlIIlII) {
        return PlatformDependent0.getByte(lllllllllllllIIIIIIlIIIIIIlIIlII);
    }
    
    public static int bitMode() {
        return PlatformDependent.BIT_MODE;
    }
    
    public static boolean canEnableTcpNoDelayByDefault() {
        return PlatformDependent.CAN_ENABLE_TCP_NODELAY_BY_DEFAULT;
    }
    
    public static long directBufferAddress(final ByteBuffer lllllllllllllIIIIIIlIIIIIIllllIl) {
        return PlatformDependent0.directBufferAddress(lllllllllllllIIIIIIlIIIIIIllllIl);
    }
    
    public static void copyMemory(final byte[] lllllllllllllIIIIIIIlllllllIllII, final int lllllllllllllIIIIIIIlllllllIIlll, final long lllllllllllllIIIIIIIlllllllIlIlI, final long lllllllllllllIIIIIIIlllllllIIlIl) {
        PlatformDependent0.copyMemory(lllllllllllllIIIIIIIlllllllIllII, PlatformDependent.ARRAY_BASE_OFFSET + lllllllllllllIIIIIIIlllllllIIlll, null, lllllllllllllIIIIIIIlllllllIlIlI, lllllllllllllIIIIIIIlllllllIIlIl);
    }
    
    public static boolean hasJavassist() {
        return PlatformDependent.HAS_JAVASSIST;
    }
    
    public static long maxDirectMemory() {
        return PlatformDependent.MAX_DIRECT_MEMORY;
    }
    
    private static boolean isRoot0() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: invokestatic    io/netty/util/internal/PlatformDependent.lllllIllIlIIllI:(I)Z
        //     6: ifeq            15
        //     9: getstatic       io/netty/util/internal/PlatformDependent.lIllIIllllIIlI:[I
        //    12: iconst_0       
        //    13: iaload         
        //    14: ireturn        
        //    15: getstatic       io/netty/util/internal/PlatformDependent.lIllIIllllIIlI:[I
        //    18: iconst_4       
        //    19: iaload         
        //    20: anewarray       Ljava/lang/String;
        //    23: dup            
        //    24: getstatic       io/netty/util/internal/PlatformDependent.lIllIIllllIIlI:[I
        //    27: iconst_0       
        //    28: iaload         
        //    29: getstatic       io/netty/util/internal/PlatformDependent.lIllIIllIllIll:[Ljava/lang/String;
        //    32: getstatic       io/netty/util/internal/PlatformDependent.lIllIIllllIIlI:[I
        //    35: bipush          6
        //    37: iaload         
        //    38: aaload         
        //    39: aastore        
        //    40: dup            
        //    41: getstatic       io/netty/util/internal/PlatformDependent.lIllIIllllIIlI:[I
        //    44: iconst_1       
        //    45: iaload         
        //    46: getstatic       io/netty/util/internal/PlatformDependent.lIllIIllIllIll:[Ljava/lang/String;
        //    49: getstatic       io/netty/util/internal/PlatformDependent.lIllIIllllIIlI:[I
        //    52: bipush          7
        //    54: iaload         
        //    55: aaload         
        //    56: aastore        
        //    57: dup            
        //    58: getstatic       io/netty/util/internal/PlatformDependent.lIllIIllllIIlI:[I
        //    61: iconst_2       
        //    62: iaload         
        //    63: getstatic       io/netty/util/internal/PlatformDependent.lIllIIllIllIll:[Ljava/lang/String;
        //    66: getstatic       io/netty/util/internal/PlatformDependent.lIllIIllllIIlI:[I
        //    69: bipush          8
        //    71: iaload         
        //    72: aaload         
        //    73: aastore        
        //    74: dup            
        //    75: getstatic       io/netty/util/internal/PlatformDependent.lIllIIllllIIlI:[I
        //    78: iconst_3       
        //    79: iaload         
        //    80: getstatic       io/netty/util/internal/PlatformDependent.lIllIIllIllIll:[Ljava/lang/String;
        //    83: getstatic       io/netty/util/internal/PlatformDependent.lIllIIllllIIlI:[I
        //    86: bipush          9
        //    88: iaload         
        //    89: aaload         
        //    90: aastore        
        //    91: astore_0        /* lllllllllllllIIIIIIIlllllIIIlIII */
        //    92: getstatic       io/netty/util/internal/PlatformDependent.lIllIIllIllIll:[Ljava/lang/String;
        //    95: getstatic       io/netty/util/internal/PlatformDependent.lIllIIllllIIlI:[I
        //    98: bipush          10
        //   100: iaload         
        //   101: aaload         
        //   102: invokestatic    java/util/regex/Pattern.compile:(Ljava/lang/String;)Ljava/util/regex/Pattern;
        //   105: astore_1        /* lllllllllllllIIIIIIIlllllIIIlIlI */
        //   106: aload_0         /* lllllllllllllIIIIIIIlllllIIIlIll */
        //   107: astore_2        /* lllllllllllllIIIIIIIlllllIIlIllI */
        //   108: aload_2         /* lllllllllllllIIIIIIIlllllIIlIllI */
        //   109: arraylength    
        //   110: istore_3        /* lllllllllllllIIIIIIIlllllIIlIlIl */
        //   111: getstatic       io/netty/util/internal/PlatformDependent.lIllIIllllIIlI:[I
        //   114: iconst_0       
        //   115: iaload         
        //   116: istore          lllllllllllllIIIIIIIlllllIIlIlII
        //   118: iload           lllllllllllllIIIIIIIlllllIIlIlII
        //   120: iload_3         /* lllllllllllllIIIIIIIlllllIIlIlIl */
        //   121: invokestatic    io/netty/util/internal/PlatformDependent.lllllIllIlIlIII:(II)Z
        //   124: ifeq            921
        //   127: aload_2         /* lllllllllllllIIIIIIIlllllIIlIllI */
        //   128: iload           lllllllllllllIIIIIIIlllllIIlIlII
        //   130: aaload         
        //   131: astore          lllllllllllllIIIIIIIlllllIIlIlll
        //   133: aconst_null    
        //   134: astore          lllllllllllllIIIIIIIlllllIIllIlI
        //   136: aconst_null    
        //   137: astore          lllllllllllllIIIIIIIlllllIIllIIl
        //   139: aconst_null    
        //   140: astore          lllllllllllllIIIIIIIlllllIIllIII
        //   142: invokestatic    java/lang/Runtime.getRuntime:()Ljava/lang/Runtime;
        //   145: getstatic       io/netty/util/internal/PlatformDependent.lIllIIllllIIlI:[I
        //   148: iconst_2       
        //   149: iaload         
        //   150: anewarray       Ljava/lang/String;
        //   153: dup            
        //   154: getstatic       io/netty/util/internal/PlatformDependent.lIllIIllllIIlI:[I
        //   157: iconst_0       
        //   158: iaload         
        //   159: aload           lllllllllllllIIIIIIIlllllIIlIlll
        //   161: aastore        
        //   162: dup            
        //   163: getstatic       io/netty/util/internal/PlatformDependent.lIllIIllllIIlI:[I
        //   166: iconst_1       
        //   167: iaload         
        //   168: getstatic       io/netty/util/internal/PlatformDependent.lIllIIllIllIll:[Ljava/lang/String;
        //   171: getstatic       io/netty/util/internal/PlatformDependent.lIllIIllllIIlI:[I
        //   174: bipush          11
        //   176: iaload         
        //   177: aaload         
        //   178: aastore        
        //   179: invokevirtual   java/lang/Runtime.exec:([Ljava/lang/String;)Ljava/lang/Process;
        //   182: astore          lllllllllllllIIIIIIIlllllIIllIlI
        //   184: new             Ljava/io/BufferedReader;
        //   187: dup            
        //   188: new             Ljava/io/InputStreamReader;
        //   191: dup            
        //   192: aload           lllllllllllllIIIIIIIlllllIIllIlI
        //   194: invokevirtual   java/lang/Process.getInputStream:()Ljava/io/InputStream;
        //   197: getstatic       io/netty/util/CharsetUtil.US_ASCII:Ljava/nio/charset/Charset;
        //   200: invokespecial   java/io/InputStreamReader.<init>:(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
        //   203: invokespecial   java/io/BufferedReader.<init>:(Ljava/io/Reader;)V
        //   206: astore          lllllllllllllIIIIIIIlllllIIllIIl
        //   208: aload           lllllllllllllIIIIIIIlllllIIllIIl
        //   210: invokevirtual   java/io/BufferedReader.readLine:()Ljava/lang/String;
        //   213: astore          lllllllllllllIIIIIIIlllllIIllIII
        //   215: aload           lllllllllllllIIIIIIIlllllIIllIIl
        //   217: invokevirtual   java/io/BufferedReader.close:()V
        //   220: aload           lllllllllllllIIIIIIIlllllIIllIlI
        //   222: invokevirtual   java/lang/Process.waitFor:()I
        //   225: istore          lllllllllllllIIIIIIIlllllIlIIIll
        //   227: iload           lllllllllllllIIIIIIIlllllIlIIIll
        //   229: invokestatic    io/netty/util/internal/PlatformDependent.lllllIllIlIIllI:(I)Z
        //   232: ifeq            238
        //   235: aconst_null    
        //   236: astore          lllllllllllllIIIIIIIlllllIIllIII
        //   238: ldc             ""
        //   240: invokevirtual   java/lang/String.length:()I
        //   243: pop            
        //   244: ldc_w           " "
        //   247: invokevirtual   java/lang/String.length:()I
        //   250: ifge            336
        //   253: bipush          29
        //   255: bipush          104
        //   257: ixor           
        //   258: sipush          240
        //   261: sipush          193
        //   264: ixor           
        //   265: ixor           
        //   266: bipush          99
        //   268: sipush          213
        //   271: iadd           
        //   272: bipush          92
        //   274: isub           
        //   275: bipush          10
        //   277: iadd           
        //   278: bipush          14
        //   280: sipush          139
        //   283: iadd           
        //   284: bipush          123
        //   286: isub           
        //   287: sipush          132
        //   290: iadd           
        //   291: ixor           
        //   292: ldc_w           " "
        //   295: invokevirtual   java/lang/String.length:()I
        //   298: ineg           
        //   299: ixor           
        //   300: iand           
        //   301: ireturn        
        //   302: astore          lllllllllllllIIIIIIIlllllIlIIIlI
        //   304: ldc             ""
        //   306: invokevirtual   java/lang/String.length:()I
        //   309: pop            
        //   310: ldc_w           "   "
        //   313: invokevirtual   java/lang/String.length:()I
        //   316: ineg           
        //   317: iflt            220
        //   320: sipush          213
        //   323: sipush          197
        //   326: ixor           
        //   327: bipush          11
        //   329: bipush          27
        //   331: ixor           
        //   332: iconst_m1      
        //   333: ixor           
        //   334: iand           
        //   335: ireturn        
        //   336: aload           lllllllllllllIIIIIIIlllllIIllIIl
        //   338: invokestatic    io/netty/util/internal/PlatformDependent.lllllIllIlIlIIl:(Ljava/lang/Object;)Z
        //   341: ifeq            380
        //   344: aload           lllllllllllllIIIIIIIlllllIIllIIl
        //   346: invokevirtual   java/io/BufferedReader.close:()V
        //   349: ldc             ""
        //   351: invokevirtual   java/lang/String.length:()I
        //   354: pop            
        //   355: ldc_w           " "
        //   358: invokevirtual   java/lang/String.length:()I
        //   361: ifgt            380
        //   364: bipush          30
        //   366: bipush          35
        //   368: ixor           
        //   369: bipush          78
        //   371: bipush          115
        //   373: ixor           
        //   374: iconst_m1      
        //   375: ixor           
        //   376: iand           
        //   377: ireturn        
        //   378: astore          lllllllllllllIIIIIIIlllllIlIIIIl
        //   380: aload           lllllllllllllIIIIIIIlllllIIllIlI
        //   382: invokestatic    io/netty/util/internal/PlatformDependent.lllllIllIlIlIIl:(Ljava/lang/Object;)Z
        //   385: ifeq            781
        //   388: aload           lllllllllllllIIIIIIIlllllIIllIlI
        //   390: invokevirtual   java/lang/Process.destroy:()V
        //   393: ldc             ""
        //   395: invokevirtual   java/lang/String.length:()I
        //   398: pop            
        //   399: ldc_w           "  "
        //   402: invokevirtual   java/lang/String.length:()I
        //   405: ifgt            781
        //   408: bipush          97
        //   410: bipush          102
        //   412: ixor           
        //   413: iconst_1       
        //   414: bipush          12
        //   416: ixor           
        //   417: ixor           
        //   418: bipush          83
        //   420: bipush          22
        //   422: iadd           
        //   423: bipush          85
        //   425: isub           
        //   426: sipush          169
        //   429: iadd           
        //   430: bipush          124
        //   432: iconst_3       
        //   433: iadd           
        //   434: bipush          -44
        //   436: isub           
        //   437: bipush          12
        //   439: iadd           
        //   440: ixor           
        //   441: ldc_w           " "
        //   444: invokevirtual   java/lang/String.length:()I
        //   447: ineg           
        //   448: ixor           
        //   449: iand           
        //   450: ireturn        
        //   451: astore          lllllllllllllIIIIIIIlllllIlIIIII
        //   453: ldc             ""
        //   455: invokevirtual   java/lang/String.length:()I
        //   458: pop            
        //   459: ldc_w           " "
        //   462: invokevirtual   java/lang/String.length:()I
        //   465: ifne            781
        //   468: sipush          172
        //   471: sipush          141
        //   474: ixor           
        //   475: sipush          145
        //   478: sipush          176
        //   481: ixor           
        //   482: iconst_m1      
        //   483: ixor           
        //   484: iand           
        //   485: ireturn        
        //   486: astore          lllllllllllllIIIIIIIlllllIIlllll
        //   488: aconst_null    
        //   489: astore          lllllllllllllIIIIIIIlllllIIllIII
        //   491: aload           lllllllllllllIIIIIIIlllllIIllIIl
        //   493: invokestatic    io/netty/util/internal/PlatformDependent.lllllIllIlIlIIl:(Ljava/lang/Object;)Z
        //   496: ifeq            544
        //   499: aload           lllllllllllllIIIIIIIlllllIIllIIl
        //   501: invokevirtual   java/io/BufferedReader.close:()V
        //   504: ldc             ""
        //   506: invokevirtual   java/lang/String.length:()I
        //   509: pop            
        //   510: sipush          162
        //   513: sipush          166
        //   516: ixor           
        //   517: ldc_w           "  "
        //   520: invokevirtual   java/lang/String.length:()I
        //   523: if_icmpne       544
        //   526: bipush          38
        //   528: bipush          62
        //   530: ixor           
        //   531: sipush          176
        //   534: sipush          168
        //   537: ixor           
        //   538: iconst_m1      
        //   539: ixor           
        //   540: iand           
        //   541: ireturn        
        //   542: astore          lllllllllllllIIIIIIIlllllIIllllI
        //   544: aload           lllllllllllllIIIIIIIlllllIIllIlI
        //   546: invokestatic    io/netty/util/internal/PlatformDependent.lllllIllIlIlIIl:(Ljava/lang/Object;)Z
        //   549: ifeq            781
        //   552: aload           lllllllllllllIIIIIIIlllllIIllIlI
        //   554: invokevirtual   java/lang/Process.destroy:()V
        //   557: ldc             ""
        //   559: invokevirtual   java/lang/String.length:()I
        //   562: pop            
        //   563: aconst_null    
        //   564: ifnull          781
        //   567: bipush          31
        //   569: bipush          55
        //   571: ixor           
        //   572: sipush          175
        //   575: sipush          170
        //   578: ixor           
        //   579: ixor           
        //   580: bipush          105
        //   582: bipush          15
        //   584: ixor           
        //   585: bipush          108
        //   587: bipush          39
        //   589: ixor           
        //   590: ixor           
        //   591: ldc_w           " "
        //   594: invokevirtual   java/lang/String.length:()I
        //   597: ineg           
        //   598: ixor           
        //   599: iand           
        //   600: ireturn        
        //   601: astore          lllllllllllllIIIIIIIlllllIIlllIl
        //   603: ldc             ""
        //   605: invokevirtual   java/lang/String.length:()I
        //   608: pop            
        //   609: bipush          27
        //   611: bipush          80
        //   613: ixor           
        //   614: bipush          112
        //   616: bipush          59
        //   618: ixor           
        //   619: iconst_m1      
        //   620: ixor           
        //   621: iand           
        //   622: ifge            781
        //   625: bipush          46
        //   627: bipush          52
        //   629: ixor           
        //   630: bipush          40
        //   632: bipush          50
        //   634: ixor           
        //   635: iconst_m1      
        //   636: ixor           
        //   637: iand           
        //   638: ireturn        
        //   639: astore          lllllllllllllIIIIIIIllllIllllllI
        //   641: aload           lllllllllllllIIIIIIIlllllIIllIIl
        //   643: invokestatic    io/netty/util/internal/PlatformDependent.lllllIllIlIlIIl:(Ljava/lang/Object;)Z
        //   646: ifeq            709
        //   649: aload           lllllllllllllIIIIIIIlllllIIllIIl
        //   651: invokevirtual   java/io/BufferedReader.close:()V
        //   654: ldc             ""
        //   656: invokevirtual   java/lang/String.length:()I
        //   659: pop            
        //   660: ldc_w           "   "
        //   663: invokevirtual   java/lang/String.length:()I
        //   666: ifge            709
        //   669: sipush          161
        //   672: sipush          184
        //   675: ixor           
        //   676: sipush          226
        //   679: sipush          166
        //   682: ixor           
        //   683: ixor           
        //   684: bipush          85
        //   686: bipush          40
        //   688: ixor           
        //   689: sipush          230
        //   692: sipush          198
        //   695: ixor           
        //   696: ixor           
        //   697: ldc_w           " "
        //   700: invokevirtual   java/lang/String.length:()I
        //   703: ineg           
        //   704: ixor           
        //   705: iand           
        //   706: ireturn        
        //   707: astore          lllllllllllllIIIIIIIlllllIIlllII
        //   709: aload           lllllllllllllIIIIIIIlllllIIllIlI
        //   711: invokestatic    io/netty/util/internal/PlatformDependent.lllllIllIlIlIIl:(Ljava/lang/Object;)Z
        //   714: ifeq            778
        //   717: aload           lllllllllllllIIIIIIIlllllIIllIlI
        //   719: invokevirtual   java/lang/Process.destroy:()V
        //   722: ldc             ""
        //   724: invokevirtual   java/lang/String.length:()I
        //   727: pop            
        //   728: ldc_w           " "
        //   731: invokevirtual   java/lang/String.length:()I
        //   734: ineg           
        //   735: ifle            778
        //   738: sipush          242
        //   741: sipush          136
        //   744: ixor           
        //   745: bipush          77
        //   747: bipush          51
        //   749: ixor           
        //   750: ixor           
        //   751: sipush          230
        //   754: sipush          175
        //   757: ixor           
        //   758: sipush          232
        //   761: sipush          165
        //   764: ixor           
        //   765: ixor           
        //   766: ldc_w           " "
        //   769: invokevirtual   java/lang/String.length:()I
        //   772: ineg           
        //   773: ixor           
        //   774: iand           
        //   775: ireturn        
        //   776: astore          lllllllllllllIIIIIIIlllllIIllIll
        //   778: aload           lllllllllllllIIIIIIIllllIllllllI
        //   780: athrow         
        //   781: aload           lllllllllllllIIIIIIIlllllIIllIII
        //   783: invokestatic    io/netty/util/internal/PlatformDependent.lllllIllIlIlIIl:(Ljava/lang/Object;)Z
        //   786: ifeq            840
        //   789: aload_1         /* lllllllllllllIIIIIIIlllllIIIlIlI */
        //   790: aload           lllllllllllllIIIIIIIlllllIIllIII
        //   792: invokevirtual   java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
        //   795: invokevirtual   java/util/regex/Matcher.matches:()Z
        //   798: invokestatic    io/netty/util/internal/PlatformDependent.lllllIllIlIIllI:(I)Z
        //   801: ifeq            840
        //   804: getstatic       io/netty/util/internal/PlatformDependent.logger:Lio/netty/util/internal/logging/InternalLogger;
        //   807: getstatic       io/netty/util/internal/PlatformDependent.lIllIIllIllIll:[Ljava/lang/String;
        //   810: getstatic       io/netty/util/internal/PlatformDependent.lIllIIllllIIlI:[I
        //   813: bipush          12
        //   815: iaload         
        //   816: aaload         
        //   817: aload           lllllllllllllIIIIIIIlllllIIllIII
        //   819: invokeinterface io/netty/util/internal/logging/InternalLogger.debug:(Ljava/lang/String;Ljava/lang/Object;)V
        //   824: getstatic       io/netty/util/internal/PlatformDependent.lIllIIllIllIll:[Ljava/lang/String;
        //   827: getstatic       io/netty/util/internal/PlatformDependent.lIllIIllllIIlI:[I
        //   830: bipush          13
        //   832: iaload         
        //   833: aaload         
        //   834: aload           lllllllllllllIIIIIIIlllllIIllIII
        //   836: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   839: ireturn        
        //   840: iinc            lllllllllllllIIIIIIIlllllIIlIlII, 1
        //   843: ldc             ""
        //   845: invokevirtual   java/lang/String.length:()I
        //   848: pop            
        //   849: iconst_1       
        //   850: sipush          158
        //   853: iadd           
        //   854: bipush          73
        //   856: isub           
        //   857: bipush          98
        //   859: iadd           
        //   860: sipush          159
        //   863: bipush          63
        //   865: iadd           
        //   866: bipush          86
        //   868: isub           
        //   869: bipush          52
        //   871: iadd           
        //   872: ixor           
        //   873: ifge            118
        //   876: bipush          15
        //   878: bipush          109
        //   880: iadd           
        //   881: bipush          62
        //   883: isub           
        //   884: bipush          73
        //   886: iadd           
        //   887: bipush          23
        //   889: sipush          130
        //   892: iadd           
        //   893: bipush          53
        //   895: isub           
        //   896: bipush          89
        //   898: iadd           
        //   899: ixor           
        //   900: bipush          68
        //   902: bipush          36
        //   904: ixor           
        //   905: bipush          10
        //   907: bipush          80
        //   909: ixor           
        //   910: ixor           
        //   911: ldc_w           " "
        //   914: invokevirtual   java/lang/String.length:()I
        //   917: ineg           
        //   918: ixor           
        //   919: iand           
        //   920: ireturn        
        //   921: getstatic       io/netty/util/internal/PlatformDependent.logger:Lio/netty/util/internal/logging/InternalLogger;
        //   924: getstatic       io/netty/util/internal/PlatformDependent.lIllIIllIllIll:[Ljava/lang/String;
        //   927: getstatic       io/netty/util/internal/PlatformDependent.lIllIIllllIIlI:[I
        //   930: bipush          14
        //   932: iaload         
        //   933: aaload         
        //   934: invokeinterface io/netty/util/internal/logging/InternalLogger.debug:(Ljava/lang/String;)V
        //   939: getstatic       io/netty/util/internal/PlatformDependent.lIllIIllIllIll:[Ljava/lang/String;
        //   942: getstatic       io/netty/util/internal/PlatformDependent.lIllIIllllIIlI:[I
        //   945: bipush          15
        //   947: iaload         
        //   948: aaload         
        //   949: invokestatic    java/util/regex/Pattern.compile:(Ljava/lang/String;)Ljava/util/regex/Pattern;
        //   952: astore_2        /* lllllllllllllIIIIIIIlllllIIIlIIl */
        //   953: getstatic       io/netty/util/internal/PlatformDependent.lIllIIllllIIlI:[I
        //   956: bipush          16
        //   958: iaload         
        //   959: istore_3        /* lllllllllllllIIIIIIIlllllIIIllII */
        //   960: iload_3         /* lllllllllllllIIIIIIIlllllIIIllII */
        //   961: invokestatic    io/netty/util/internal/PlatformDependent.lllllIllIlIlIlI:(I)Z
        //   964: ifeq            1483
        //   967: aconst_null    
        //   968: astore          lllllllllllllIIIIIIIlllllIIIllIl
        //   970: new             Ljava/net/ServerSocket;
        //   973: dup            
        //   974: invokespecial   java/net/ServerSocket.<init>:()V
        //   977: astore          lllllllllllllIIIIIIIlllllIIIllIl
        //   979: aload           lllllllllllllIIIIIIIlllllIIIllIl
        //   981: getstatic       io/netty/util/internal/PlatformDependent.lIllIIllllIIlI:[I
        //   984: iconst_1       
        //   985: iaload         
        //   986: invokevirtual   java/net/ServerSocket.setReuseAddress:(Z)V
        //   989: aload           lllllllllllllIIIIIIIlllllIIIllIl
        //   991: new             Ljava/net/InetSocketAddress;
        //   994: dup            
        //   995: iload_3         /* lllllllllllllIIIIIIIlllllIIIllII */
        //   996: invokespecial   java/net/InetSocketAddress.<init>:(I)V
        //   999: invokevirtual   java/net/ServerSocket.bind:(Ljava/net/SocketAddress;)V
        //  1002: getstatic       io/netty/util/internal/PlatformDependent.logger:Lio/netty/util/internal/logging/InternalLogger;
        //  1005: invokeinterface io/netty/util/internal/logging/InternalLogger.isDebugEnabled:()Z
        //  1010: invokestatic    io/netty/util/internal/PlatformDependent.lllllIllIlIIllI:(I)Z
        //  1013: ifeq            1038
        //  1016: getstatic       io/netty/util/internal/PlatformDependent.logger:Lio/netty/util/internal/logging/InternalLogger;
        //  1019: getstatic       io/netty/util/internal/PlatformDependent.lIllIIllIllIll:[Ljava/lang/String;
        //  1022: getstatic       io/netty/util/internal/PlatformDependent.lIllIIllllIIlI:[I
        //  1025: bipush          17
        //  1027: iaload         
        //  1028: aaload         
        //  1029: iload_3         /* lllllllllllllIIIIIIIlllllIIIllII */
        //  1030: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1033: invokeinterface io/netty/util/internal/logging/InternalLogger.debug:(Ljava/lang/String;Ljava/lang/Object;)V
        //  1038: getstatic       io/netty/util/internal/PlatformDependent.lIllIIllllIIlI:[I
        //  1041: iconst_1       
        //  1042: iaload         
        //  1043: istore          lllllllllllllIIIIIIIlllllIIIIIll
        //  1045: aload           lllllllllllllIIIIIIIlllllIIIllIl
        //  1047: invokestatic    io/netty/util/internal/PlatformDependent.lllllIllIlIlIIl:(Ljava/lang/Object;)Z
        //  1050: ifeq            1086
        //  1053: aload           lllllllllllllIIIIIIIlllllIIIllIl
        //  1055: invokevirtual   java/net/ServerSocket.close:()V
        //  1058: ldc             ""
        //  1060: invokevirtual   java/lang/String.length:()I
        //  1063: pop            
        //  1064: aconst_null    
        //  1065: ifnull          1086
        //  1068: ldc_w           "  "
        //  1071: invokevirtual   java/lang/String.length:()I
        //  1074: ldc_w           "  "
        //  1077: invokevirtual   java/lang/String.length:()I
        //  1080: iconst_m1      
        //  1081: ixor           
        //  1082: iand           
        //  1083: ireturn        
        //  1084: astore          lllllllllllllIIIIIIIlllllIIlIIll
        //  1086: iload           lllllllllllllIIIIIIIlllllIIIIIll
        //  1088: ireturn        
        //  1089: astore          lllllllllllllIIIIIIIlllllIIlIIII
        //  1091: aload           lllllllllllllIIIIIIIlllllIIlIIII
        //  1093: invokevirtual   java/lang/Exception.getMessage:()Ljava/lang/String;
        //  1096: astore          lllllllllllllIIIIIIIlllllIIlIIIl
        //  1098: aload           lllllllllllllIIIIIIIlllllIIlIIIl
        //  1100: invokestatic    io/netty/util/internal/PlatformDependent.lllllIllIlIllII:(Ljava/lang/Object;)Z
        //  1103: ifeq            1118
        //  1106: getstatic       io/netty/util/internal/PlatformDependent.lIllIIllIllIll:[Ljava/lang/String;
        //  1109: getstatic       io/netty/util/internal/PlatformDependent.lIllIIllllIIlI:[I
        //  1112: bipush          18
        //  1114: iaload         
        //  1115: aaload         
        //  1116: astore          lllllllllllllIIIIIIIlllllIIlIIIl
        //  1118: aload           lllllllllllllIIIIIIIlllllIIlIIIl
        //  1120: invokevirtual   java/lang/String.toLowerCase:()Ljava/lang/String;
        //  1123: astore          lllllllllllllIIIIIIIlllllIIlIIIl
        //  1125: aload_2         /* lllllllllllllIIIIIIIlllllIIIlIIl */
        //  1126: aload           lllllllllllllIIIIIIIlllllIIlIIIl
        //  1128: invokevirtual   java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
        //  1131: invokevirtual   java/util/regex/Matcher.matches:()Z
        //  1134: invokestatic    io/netty/util/internal/PlatformDependent.lllllIllIlIIllI:(I)Z
        //  1137: ifeq            1231
        //  1140: aload           lllllllllllllIIIIIIIlllllIIIllIl
        //  1142: invokestatic    io/netty/util/internal/PlatformDependent.lllllIllIlIlIIl:(Ljava/lang/Object;)Z
        //  1145: ifeq            1483
        //  1148: aload           lllllllllllllIIIIIIIlllllIIIllIl
        //  1150: invokevirtual   java/net/ServerSocket.close:()V
        //  1153: ldc             ""
        //  1155: invokevirtual   java/lang/String.length:()I
        //  1158: pop            
        //  1159: bipush          52
        //  1161: bipush          24
        //  1163: ixor           
        //  1164: bipush          27
        //  1166: bipush          55
        //  1168: ixor           
        //  1169: iconst_m1      
        //  1170: ixor           
        //  1171: iand           
        //  1172: ifeq            1483
        //  1175: sipush          139
        //  1178: sipush          145
        //  1181: ixor           
        //  1182: bipush          20
        //  1184: bipush          14
        //  1186: ixor           
        //  1187: iconst_m1      
        //  1188: ixor           
        //  1189: iand           
        //  1190: ireturn        
        //  1191: astore          lllllllllllllIIIIIIIlllllIIlIIlI
        //  1193: ldc             ""
        //  1195: invokevirtual   java/lang/String.length:()I
        //  1198: pop            
        //  1199: bipush          24
        //  1201: bipush          28
        //  1203: ixor           
        //  1204: ldc_w           " "
        //  1207: invokevirtual   java/lang/String.length:()I
        //  1210: if_icmpgt       1483
        //  1213: sipush          189
        //  1216: sipush          179
        //  1219: ixor           
        //  1220: sipush          183
        //  1223: sipush          185
        //  1226: ixor           
        //  1227: iconst_m1      
        //  1228: ixor           
        //  1229: iand           
        //  1230: ireturn        
        //  1231: aload           lllllllllllllIIIIIIIlllllIIIllIl
        //  1233: invokestatic    io/netty/util/internal/PlatformDependent.lllllIllIlIlIIl:(Ljava/lang/Object;)Z
        //  1236: ifeq            1457
        //  1239: aload           lllllllllllllIIIIIIIlllllIIIllIl
        //  1241: invokevirtual   java/net/ServerSocket.close:()V
        //  1244: ldc             ""
        //  1246: invokevirtual   java/lang/String.length:()I
        //  1249: pop            
        //  1250: ldc_w           " "
        //  1253: invokevirtual   java/lang/String.length:()I
        //  1256: ineg           
        //  1257: bipush          11
        //  1259: bipush          39
        //  1261: ixor           
        //  1262: bipush          19
        //  1264: bipush          63
        //  1266: ixor           
        //  1267: iconst_m1      
        //  1268: ixor           
        //  1269: iand           
        //  1270: if_icmpne       1457
        //  1273: iconst_4       
        //  1274: bipush          15
        //  1276: ixor           
        //  1277: bipush          27
        //  1279: bipush          16
        //  1281: ixor           
        //  1282: iconst_m1      
        //  1283: ixor           
        //  1284: iand           
        //  1285: ireturn        
        //  1286: astore          lllllllllllllIIIIIIIlllllIIIllll
        //  1288: ldc             ""
        //  1290: invokevirtual   java/lang/String.length:()I
        //  1293: pop            
        //  1294: bipush          118
        //  1296: bipush          97
        //  1298: ixor           
        //  1299: bipush          101
        //  1301: bipush          119
        //  1303: ixor           
        //  1304: ixor           
        //  1305: ifgt            1457
        //  1308: bipush          101
        //  1310: sipush          132
        //  1313: iadd           
        //  1314: bipush          117
        //  1316: isub           
        //  1317: bipush          34
        //  1319: iadd           
        //  1320: bipush          80
        //  1322: bipush          7
        //  1324: iadd           
        //  1325: bipush          -73
        //  1327: isub           
        //  1328: iconst_3       
        //  1329: iadd           
        //  1330: ixor           
        //  1331: bipush          62
        //  1333: bipush          70
        //  1335: ixor           
        //  1336: bipush          22
        //  1338: bipush          91
        //  1340: ixor           
        //  1341: ixor           
        //  1342: ldc_w           " "
        //  1345: invokevirtual   java/lang/String.length:()I
        //  1348: ineg           
        //  1349: ixor           
        //  1350: iand           
        //  1351: ireturn        
        //  1352: astore          lllllllllllllIIIIIIIllllIlllllII
        //  1354: aload           lllllllllllllIIIIIIIlllllIIIllIl
        //  1356: invokestatic    io/netty/util/internal/PlatformDependent.lllllIllIlIlIIl:(Ljava/lang/Object;)Z
        //  1359: ifeq            1454
        //  1362: aload           lllllllllllllIIIIIIIlllllIIIllIl
        //  1364: invokevirtual   java/net/ServerSocket.close:()V
        //  1367: ldc             ""
        //  1369: invokevirtual   java/lang/String.length:()I
        //  1372: pop            
        //  1373: ldc_w           " "
        //  1376: invokevirtual   java/lang/String.length:()I
        //  1379: ldc_w           " "
        //  1382: invokevirtual   java/lang/String.length:()I
        //  1385: if_icmpeq       1454
        //  1388: bipush          106
        //  1390: bipush          100
        //  1392: iadd           
        //  1393: sipush          156
        //  1396: isub           
        //  1397: bipush          95
        //  1399: iadd           
        //  1400: sipush          172
        //  1403: bipush          116
        //  1405: iadd           
        //  1406: sipush          251
        //  1409: isub           
        //  1410: sipush          158
        //  1413: iadd           
        //  1414: ixor           
        //  1415: sipush          143
        //  1418: bipush          77
        //  1420: iadd           
        //  1421: bipush          6
        //  1423: isub           
        //  1424: bipush          37
        //  1426: iadd           
        //  1427: bipush          54
        //  1429: sipush          154
        //  1432: iadd           
        //  1433: sipush          188
        //  1436: isub           
        //  1437: sipush          149
        //  1440: iadd           
        //  1441: ixor           
        //  1442: ldc_w           " "
        //  1445: invokevirtual   java/lang/String.length:()I
        //  1448: ineg           
        //  1449: ixor           
        //  1450: iand           
        //  1451: ireturn        
        //  1452: astore          lllllllllllllIIIIIIIlllllIIIlllI
        //  1454: aload           lllllllllllllIIIIIIIllllIlllllII
        //  1456: athrow         
        //  1457: iinc            lllllllllllllIIIIIIIlllllIIIllII, -1
        //  1460: ldc             ""
        //  1462: invokevirtual   java/lang/String.length:()I
        //  1465: pop            
        //  1466: aconst_null    
        //  1467: ifnull          960
        //  1470: bipush          30
        //  1472: iconst_2       
        //  1473: ixor           
        //  1474: bipush          44
        //  1476: bipush          48
        //  1478: ixor           
        //  1479: iconst_m1      
        //  1480: ixor           
        //  1481: iand           
        //  1482: ireturn        
        //  1483: getstatic       io/netty/util/internal/PlatformDependent.logger:Lio/netty/util/internal/logging/InternalLogger;
        //  1486: getstatic       io/netty/util/internal/PlatformDependent.lIllIIllIllIll:[Ljava/lang/String;
        //  1489: getstatic       io/netty/util/internal/PlatformDependent.lIllIIllllIIlI:[I
        //  1492: bipush          19
        //  1494: iaload         
        //  1495: aaload         
        //  1496: invokeinterface io/netty/util/internal/logging/InternalLogger.debug:(Ljava/lang/String;)V
        //  1501: getstatic       io/netty/util/internal/PlatformDependent.lIllIIllllIIlI:[I
        //  1504: iconst_0       
        //  1505: iaload         
        //  1506: ireturn        
        //    StackMapTable: 00 23 0F FF 00 66 00 05 07 03 8B 07 02 01 07 03 8B 01 01 00 00 FF 00 65 00 09 07 03 8B 07 02 01 07 03 8B 01 01 07 00 2C 07 03 0E 07 03 0A 07 00 2C 00 00 FC 00 11 01 FF 00 3F 00 09 07 03 8B 07 02 01 07 03 8B 01 01 07 00 2C 07 03 0E 07 03 0A 07 00 2C 00 01 07 02 F9 FC 00 21 01 69 07 02 FB FA 00 01 F7 00 46 07 01 8E 62 07 01 8E FF 00 37 00 0A 07 03 8B 07 02 01 07 03 8B 01 01 07 00 2C 07 03 0E 07 03 0A 05 07 01 8E 00 01 07 02 FB 01 78 07 01 8E FF 00 25 00 09 07 03 8B 07 02 01 07 03 8B 01 01 07 00 2C 07 03 0E 07 03 0A 07 00 2C 00 01 07 02 8C FF 00 43 00 0B 07 03 8B 07 02 01 07 03 8B 01 01 07 00 2C 07 03 0E 07 03 0A 07 00 2C 00 07 02 8C 00 01 07 02 FB 01 F7 00 42 07 01 8E 01 F9 00 02 3A FF 00 50 00 05 07 03 8B 07 02 01 07 03 8B 01 01 00 00 FF 00 26 00 04 07 03 8B 07 02 01 07 02 01 01 00 00 FC 00 4D 07 03 41 FF 00 2D 00 06 07 03 8B 07 02 01 07 02 01 01 07 03 41 01 00 01 07 01 8E 01 FF 00 02 00 05 07 03 8B 07 02 01 07 02 01 01 07 03 41 00 01 07 01 8E FD 00 1C 07 01 8E 07 00 2C F7 00 48 07 01 8E 27 76 07 01 8E FF 00 41 00 05 07 03 8B 07 02 01 07 02 01 01 07 03 41 00 01 07 02 8C FF 00 63 00 0D 07 03 8B 07 02 01 07 02 01 01 07 03 41 00 00 00 00 00 00 00 07 02 8C 00 01 07 01 8E 01 FF 00 02 00 07 07 03 8B 07 02 01 07 02 01 01 07 03 41 07 01 8E 07 00 2C 00 00 F8 00 19
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  220    238    302    336    Ljava/lang/InterruptedException;
        //  344    349    378    380    Ljava/io/IOException;
        //  388    393    451    486    Ljava/lang/Exception;
        //  142    336    486    639    Ljava/lang/Exception;
        //  499    504    542    544    Ljava/io/IOException;
        //  552    557    601    639    Ljava/lang/Exception;
        //  142    336    639    781    Any
        //  486    491    639    781    Any
        //  649    654    707    709    Ljava/io/IOException;
        //  717    722    776    778    Ljava/lang/Exception;
        //  639    641    639    781    Any
        //  1053   1058   1084   1086   Ljava/lang/Exception;
        //  970    1045   1089   1483   Ljava/lang/Exception;
        //  1148   1153   1191   1231   Ljava/lang/Exception;
        //  1239   1244   1286   1352   Ljava/lang/Exception;
        //  970    1045   1352   1457   Any
        //  1089   1140   1352   1457   Any
        //  1362   1367   1452   1454   Ljava/lang/Exception;
        //  1352   1354   1352   1457   Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 778 out of bounds for length 778
        //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        //     at java.base/java.util.Objects.checkIndex(Objects.java:372)
        //     at java.base/java.util.ArrayList.get(ArrayList.java:458)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3321)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3569)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:126)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static Object getObjectVolatile(final Object lllllllllllllIIIIIIlIIIIIIllIIIl, final long lllllllllllllIIIIIIlIIIIIIllIIlI) {
        return PlatformDependent0.getObjectVolatile(lllllllllllllIIIIIIlIIIIIIllIIIl, lllllllllllllIIIIIIlIIIIIIllIIlI);
    }
    
    private static boolean isWindows0() {
        final boolean lllllllllllllIIIIIIIlllllIllIIll = SystemPropertyUtil.get(PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[2]], PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[3]]).toLowerCase(Locale.US).contains(PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[4]]);
        if (lllllIllIlIIllI(lllllllllllllIIIIIIIlllllIllIIll ? 1 : 0)) {
            PlatformDependent.logger.debug(PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[5]]);
        }
        return lllllllllllllIIIIIIIlllllIllIIll;
    }
    
    private static boolean hasUnsafe0() {
        final boolean lllllllllllllIIIIIIIllllIllIlIIl = SystemPropertyUtil.getBoolean(PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[23]], (boolean)(PlatformDependent.lIllIIllllIIlI[0] != 0));
        PlatformDependent.logger.debug(PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[24]], (Object)lllllllllllllIIIIIIIllllIllIlIIl);
        if (lllllIllIlIIllI(isAndroid() ? 1 : 0)) {
            PlatformDependent.logger.debug(PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[25]]);
            return PlatformDependent.lIllIIllllIIlI[0] != 0;
        }
        if (lllllIllIlIIllI(lllllllllllllIIIIIIIllllIllIlIIl ? 1 : 0)) {
            PlatformDependent.logger.debug(PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[26]]);
            return PlatformDependent.lIllIIllllIIlI[0] != 0;
        }
        boolean lllllllllllllIIIIIIIllllIllIlIII = false;
        if (lllllIllIlIIllI(SystemPropertyUtil.contains(PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[27]]) ? 1 : 0)) {
            final boolean lllllllllllllIIIIIIIllllIllIllIl = SystemPropertyUtil.getBoolean(PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[28]], (boolean)(PlatformDependent.lIllIIllllIIlI[1] != 0));
            "".length();
            if ("   ".length() != "   ".length()) {
                return ((0x5F ^ 0x44) & ~(0x89 ^ 0x92)) != 0x0;
            }
        }
        else {
            lllllllllllllIIIIIIIllllIllIlIII = SystemPropertyUtil.getBoolean(PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[29]], (boolean)(PlatformDependent.lIllIIllllIIlI[1] != 0));
        }
        if (lllllIllIlIIlll(lllllllllllllIIIIIIIllllIllIlIII ? 1 : 0)) {
            PlatformDependent.logger.debug(PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[30]]);
            return PlatformDependent.lIllIIllllIIlI[0] != 0;
        }
        try {
            final boolean lllllllllllllIIIIIIIllllIllIllII = PlatformDependent0.hasUnsafe();
            final InternalLogger logger = PlatformDependent.logger;
            final String s = PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[31]];
            String s2;
            if (lllllIllIlIIllI(lllllllllllllIIIIIIIllllIllIllII ? 1 : 0)) {
                s2 = PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[32]];
                "".length();
                if (("  ".length() & ("  ".length() ^ -" ".length())) != 0x0) {
                    return ((0x57 ^ 0x25 ^ (0xB9 ^ 0xAB)) & (0x51 ^ 0x6A ^ (0xD4 ^ 0x8F) ^ -" ".length())) != 0x0;
                }
            }
            else {
                s2 = PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[33]];
            }
            logger.debug(s, s2);
            return lllllllllllllIIIIIIIllllIllIllII;
        }
        catch (Throwable lllllllllllllIIIIIIIllllIllIlIlI) {
            return PlatformDependent.lIllIIllllIIlI[0] != 0;
        }
    }
    
    private static boolean lllllIllIllIIII(final int lllllllllllllIIIIIIIlllIlIIllIll) {
        return lllllllllllllIIIIIIIlllIlIIllIll <= 0;
    }
    
    public static boolean directBufferPreferred() {
        return PlatformDependent.DIRECT_BUFFER_PREFERRED;
    }
    
    public static short getShort(final long lllllllllllllIIIIIIlIIIIIIlIIIIl) {
        return PlatformDependent0.getShort(lllllllllllllIIIIIIlIIIIIIlIIIIl);
    }
    
    private static String lllllIlIllllllI(String lllllllllllllIIIIIIIlllIllIIIIII, final String lllllllllllllIIIIIIIlllIllIIIlII) {
        lllllllllllllIIIIIIIlllIllIIIIII = (boolean)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIIIIIlllIllIIIIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIIIIlllIllIIIIll = new StringBuilder();
        final char[] lllllllllllllIIIIIIIlllIllIIIIlI = lllllllllllllIIIIIIIlllIllIIIlII.toCharArray();
        int lllllllllllllIIIIIIIlllIllIIIIIl = PlatformDependent.lIllIIllllIIlI[0];
        final String lllllllllllllIIIIIIIlllIlIlllIll = (Object)((String)lllllllllllllIIIIIIIlllIllIIIIII).toCharArray();
        final boolean lllllllllllllIIIIIIIlllIlIlllIlI = lllllllllllllIIIIIIIlllIlIlllIll.length != 0;
        byte lllllllllllllIIIIIIIlllIlIlllIIl = (byte)PlatformDependent.lIllIIllllIIlI[0];
        while (lllllIllIlIlIII(lllllllllllllIIIIIIIlllIlIlllIIl, lllllllllllllIIIIIIIlllIlIlllIlI ? 1 : 0)) {
            final char lllllllllllllIIIIIIIlllIllIIIllI = lllllllllllllIIIIIIIlllIlIlllIll[lllllllllllllIIIIIIIlllIlIlllIIl];
            lllllllllllllIIIIIIIlllIllIIIIll.append((char)(lllllllllllllIIIIIIIlllIllIIIllI ^ lllllllllllllIIIIIIIlllIllIIIIlI[lllllllllllllIIIIIIIlllIllIIIIIl % lllllllllllllIIIIIIIlllIllIIIIlI.length]));
            "".length();
            ++lllllllllllllIIIIIIIlllIllIIIIIl;
            ++lllllllllllllIIIIIIIlllIlIlllIIl;
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIIIIlllIllIIIIll);
    }
    
    private static long arrayBaseOffset0() {
        if (lllllIllIlIIlll(hasUnsafe() ? 1 : 0)) {
            return -1L;
        }
        return PlatformDependent0.arrayBaseOffset();
    }
    
    private static File toDirectory(final String lllllllllllllIIIIIIIllllIIIIIlIl) {
        if (lllllIllIlIllII(lllllllllllllIIIIIIIllllIIIIIlIl)) {
            return null;
        }
        final File lllllllllllllIIIIIIIllllIIIIIlII = new File(lllllllllllllIIIIIIIllllIIIIIlIl);
        lllllllllllllIIIIIIIllllIIIIIlII.mkdirs();
        "".length();
        if (lllllIllIlIIlll(lllllllllllllIIIIIIIllllIIIIIlII.isDirectory() ? 1 : 0)) {
            return null;
        }
        try {
            return lllllllllllllIIIIIIIllllIIIIIlII.getAbsoluteFile();
        }
        catch (Exception lllllllllllllIIIIIIIllllIIIIIllI) {
            return lllllllllllllIIIIIIIllllIIIIIlII;
        }
    }
    
    public static long objectFieldOffset(final Field lllllllllllllIIIIIIlIIIIIIlIIlll) {
        return PlatformDependent0.objectFieldOffset(lllllllllllllIIIIIIlIIIIIIlIIlll);
    }
    
    private static String lllllIlIlllllll(final String lllllllllllllIIIIIIIlllIllIlIIll, final String lllllllllllllIIIIIIIlllIllIlIlII) {
        try {
            final SecretKeySpec lllllllllllllIIIIIIIlllIllIllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIIIlllIllIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIIIIlllIllIlIlll = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIIIIlllIllIlIlll.init(PlatformDependent.lIllIIllllIIlI[2], lllllllllllllIIIIIIIlllIllIllIII);
            return new String(lllllllllllllIIIIIIIlllIllIlIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIIIlllIllIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIIIlllIllIlIllI) {
            lllllllllllllIIIIIIIlllIllIlIllI.printStackTrace();
            return null;
        }
    }
    
    public static int addressSize() {
        return PlatformDependent.ADDRESS_SIZE;
    }
    
    public static long getLong(final long lllllllllllllIIIIIIlIIIIIIIllIll) {
        return PlatformDependent0.getLong(lllllllllllllIIIIIIlIIIIIIIllIll);
    }
    
    private static boolean lllllIllIlIlIlI(final int lllllllllllllIIIIIIIlllIlIIllIIl) {
        return lllllllllllllIIIIIIIlllIlIIllIIl > 0;
    }
    
    public static boolean isRoot() {
        return PlatformDependent.IS_ROOT;
    }
    
    public static void putOrderedObject(final Object lllllllllllllIIIIIIlIIIIIIIlIlII, final long lllllllllllllIIIIIIlIIIIIIIlIllI, final Object lllllllllllllIIIIIIlIIIIIIIlIlIl) {
        PlatformDependent0.putOrderedObject(lllllllllllllIIIIIIlIIIIIIIlIlII, lllllllllllllIIIIIIlIIIIIIIlIllI, lllllllllllllIIIIIIlIIIIIIIlIlIl);
    }
    
    private static boolean lllllIllIlIlIIl(final Object lllllllllllllIIIIIIIlllIlIlIIlIl) {
        return lllllllllllllIIIIIIIlllIlIlIIlIl != null;
    }
    
    public static int getInt(final Object lllllllllllllIIIIIIlIIIIIIlIlIll, final long lllllllllllllIIIIIIlIIIIIIlIlIlI) {
        return PlatformDependent0.getInt(lllllllllllllIIIIIIlIIIIIIlIlIll, lllllllllllllIIIIIIlIIIIIIlIlIlI);
    }
    
    public static void copyMemory(final long lllllllllllllIIIIIIIllllllIlllII, final byte[] lllllllllllllIIIIIIIllllllIlllll, final int lllllllllllllIIIIIIIllllllIllIlI, final long lllllllllllllIIIIIIIllllllIlllIl) {
        PlatformDependent0.copyMemory(null, lllllllllllllIIIIIIIllllllIlllII, lllllllllllllIIIIIIIllllllIlllll, PlatformDependent.ARRAY_BASE_OFFSET + lllllllllllllIIIIIIIllllllIllIlI, lllllllllllllIIIIIIIllllllIlllIl);
    }
    
    private static File tmpdir0() {
        try {
            File lllllllllllllIIIIIIIllllIIIlIllI = toDirectory(SystemPropertyUtil.get(PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[48]]));
            if (lllllIllIlIlIIl(lllllllllllllIIIIIIIllllIIIlIllI)) {
                PlatformDependent.logger.debug(PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[49]], lllllllllllllIIIIIIIllllIIIlIllI);
                return lllllllllllllIIIIIIIllllIIIlIllI;
            }
            lllllllllllllIIIIIIIllllIIIlIllI = toDirectory(SystemPropertyUtil.get(PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[50]]));
            if (lllllIllIlIlIIl(lllllllllllllIIIIIIIllllIIIlIllI)) {
                PlatformDependent.logger.debug(PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[51]], lllllllllllllIIIIIIIllllIIIlIllI);
                return lllllllllllllIIIIIIIllllIIIlIllI;
            }
            if (lllllIllIlIIllI(isWindows() ? 1 : 0)) {
                lllllllllllllIIIIIIIllllIIIlIllI = toDirectory(System.getenv(PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[52]]));
                if (lllllIllIlIlIIl(lllllllllllllIIIIIIIllllIIIlIllI)) {
                    PlatformDependent.logger.debug(PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[53]], lllllllllllllIIIIIIIllllIIIlIllI);
                    return lllllllllllllIIIIIIIllllIIIlIllI;
                }
                final String lllllllllllllIIIIIIIllllIIIllIIl = System.getenv(PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[54]]);
                if (lllllIllIlIlIIl(lllllllllllllIIIIIIIllllIIIllIIl)) {
                    lllllllllllllIIIIIIIllllIIIlIllI = toDirectory(String.valueOf(new StringBuilder().append(lllllllllllllIIIIIIIllllIIIllIIl).append(PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[55]])));
                    if (lllllIllIlIlIIl(lllllllllllllIIIIIIIllllIIIlIllI)) {
                        PlatformDependent.logger.debug(PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[56]], lllllllllllllIIIIIIIllllIIIlIllI);
                        return lllllllllllllIIIIIIIllllIIIlIllI;
                    }
                    lllllllllllllIIIIIIIllllIIIlIllI = toDirectory(String.valueOf(new StringBuilder().append(lllllllllllllIIIIIIIllllIIIllIIl).append(PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[57]])));
                    if (lllllIllIlIlIIl(lllllllllllllIIIIIIIllllIIIlIllI)) {
                        PlatformDependent.logger.debug(PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[58]], lllllllllllllIIIIIIIllllIIIlIllI);
                        return lllllllllllllIIIIIIIllllIIIlIllI;
                    }
                }
                "".length();
                if (-(58 + 70 - 32 + 93 ^ 179 + 93 - 126 + 38) >= 0) {
                    return null;
                }
            }
            else {
                lllllllllllllIIIIIIIllllIIIlIllI = toDirectory(System.getenv(PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[59]]));
                if (lllllIllIlIlIIl(lllllllllllllIIIIIIIllllIIIlIllI)) {
                    PlatformDependent.logger.debug(PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[60]], lllllllllllllIIIIIIIllllIIIlIllI);
                    return lllllllllllllIIIIIIIllllIIIlIllI;
                }
            }
            "".length();
            if ((0x9D ^ 0xC4 ^ (0x62 ^ 0x3E)) == 0x0) {
                return null;
            }
        }
        catch (Exception ex) {}
        File lllllllllllllIIIIIIIllllIIIlIlIl = null;
        if (lllllIllIlIIllI(isWindows() ? 1 : 0)) {
            final File lllllllllllllIIIIIIIllllIIIlIllI = new File(PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[61]]);
            "".length();
            if (((18 + 60 + 121 + 53 ^ 142 + 67 - 136 + 111) & (0x5F ^ 0x76 ^ (0x75 ^ 0x18) ^ -" ".length())) != ((0x4C ^ 0x7F ^ (0x45 ^ 0x73)) & (0x78 ^ 0x47 ^ (0x4F ^ 0x75) ^ -" ".length()))) {
                return null;
            }
        }
        else {
            lllllllllllllIIIIIIIllllIIIlIlIl = new File(PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[62]]);
        }
        PlatformDependent.logger.warn(PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[63]], lllllllllllllIIIIIIIllllIIIlIlIl);
        return lllllllllllllIIIIIIIllllIIIlIlIl;
    }
    
    public static File tmpdir() {
        return PlatformDependent.TMPDIR;
    }
    
    public static <T> AtomicIntegerFieldUpdater<T> newAtomicIntegerFieldUpdater(final Class<?> lllllllllllllIIIIIIIllllllIIlIIl, final String lllllllllllllIIIIIIIllllllIIlIlI) {
        if (lllllIllIlIIllI(hasUnsafe() ? 1 : 0)) {
            try {
                return PlatformDependent0.newAtomicIntegerFieldUpdater(lllllllllllllIIIIIIIllllllIIlIIl, lllllllllllllIIIIIIIllllllIIlIlI);
            }
            catch (Throwable t) {}
        }
        return null;
    }
    
    private static void lllllIllIlIIlIl() {
        (lIllIIllllIIlI = new int[88])[0] = ((11 + 71 + 50 + 94 ^ 125 + 86 - 170 + 142) & (0xB5 ^ 0xAC ^ (0x24 ^ 0x68) ^ -" ".length()));
        PlatformDependent.lIllIIllllIIlI[1] = " ".length();
        PlatformDependent.lIllIIllllIIlI[2] = "  ".length();
        PlatformDependent.lIllIIllllIIlI[3] = "   ".length();
        PlatformDependent.lIllIIllllIIlI[4] = (115 + 104 - 52 + 3 ^ 114 + 24 + 8 + 28);
        PlatformDependent.lIllIIllllIIlI[5] = (109 + 91 - 57 + 8 ^ 119 + 134 - 204 + 97);
        PlatformDependent.lIllIIllllIIlI[6] = (0x5C ^ 0x5A);
        PlatformDependent.lIllIIllllIIlI[7] = (141 + 132 - 194 + 105 ^ 0 + 174 - 95 + 112);
        PlatformDependent.lIllIIllllIIlI[8] = (0xB2 ^ 0xBA);
        PlatformDependent.lIllIIllllIIlI[9] = (0x1B ^ 0x12);
        PlatformDependent.lIllIIllllIIlI[10] = (0xB ^ 0x1D ^ (0x7A ^ 0x66));
        PlatformDependent.lIllIIllllIIlI[11] = (0x9B ^ 0x96 ^ (0x8C ^ 0x8A));
        PlatformDependent.lIllIIllllIIlI[12] = (0x29 ^ 0x25);
        PlatformDependent.lIllIIllllIIlI[13] = (0x27 ^ 0x2A);
        PlatformDependent.lIllIIllllIIlI[14] = (0x9B ^ 0x95);
        PlatformDependent.lIllIIllllIIlI[15] = (0xED ^ 0xC4 ^ (0x51 ^ 0x77));
        PlatformDependent.lIllIIllllIIlI[16] = (-(0xFFFFBF4D & 0x78B3) & (-1 & 0x3BFF));
        PlatformDependent.lIllIIllllIIlI[17] = (0x1C ^ 0x14 ^ (0x72 ^ 0x6A));
        PlatformDependent.lIllIIllllIIlI[18] = (0xB5 ^ 0xA4);
        PlatformDependent.lIllIIllllIIlI[19] = (0x1A ^ 0x8);
        PlatformDependent.lIllIIllllIIlI[20] = (0x1D ^ 0x71 ^ 66 + 17 + 19 + 25);
        PlatformDependent.lIllIIllllIIlI[21] = (0x7A ^ 0x5C ^ (0x30 ^ 0x2));
        PlatformDependent.lIllIIllllIIlI[22] = (0x3 ^ 0x16);
        PlatformDependent.lIllIIllllIIlI[23] = (24 + 117 - 124 + 112 ^ 43 + 63 - 85 + 130);
        PlatformDependent.lIllIIllllIIlI[24] = (0x1D ^ 0xA);
        PlatformDependent.lIllIIllllIIlI[25] = (83 + 27 - 68 + 104 ^ 26 + 127 - 77 + 62);
        PlatformDependent.lIllIIllllIIlI[26] = (0x4E ^ 0x5D ^ (0x1F ^ 0x15));
        PlatformDependent.lIllIIllllIIlI[27] = (0x65 ^ 0x7F);
        PlatformDependent.lIllIIllllIIlI[28] = (0xB6 ^ 0xAD);
        PlatformDependent.lIllIIllllIIlI[29] = (0x6A ^ 0x76);
        PlatformDependent.lIllIIllllIIlI[30] = (0x65 ^ 0x1 ^ (0x46 ^ 0x3F));
        PlatformDependent.lIllIIllllIIlI[31] = (0xA0 ^ 0xBE);
        PlatformDependent.lIllIIllllIIlI[32] = (85 + 113 - 165 + 112 ^ 17 + 129 - 79 + 75);
        PlatformDependent.lIllIIllllIIlI[33] = (0x77 ^ 0x57);
        PlatformDependent.lIllIIllllIIlI[34] = (0x6A ^ 0x4B);
        PlatformDependent.lIllIIllllIIlI[35] = (41 + 137 - 129 + 89 ^ 44 + 98 - 135 + 161);
        PlatformDependent.lIllIIllllIIlI[36] = (0x21 ^ 0x16 ^ (0x80 ^ 0x94));
        PlatformDependent.lIllIIllllIIlI[37] = (0x7B ^ 0x5F);
        PlatformDependent.lIllIIllllIIlI[38] = (0x7D ^ 0x3 ^ (0x61 ^ 0x3A));
        PlatformDependent.lIllIIllllIIlI[39] = (0x35 ^ 0x13);
        PlatformDependent.lIllIIllllIIlI[40] = (0x5F ^ 0x0 ^ (0x2A ^ 0x52));
        PlatformDependent.lIllIIllllIIlI[41] = (0xA8 ^ 0xB9 ^ (0xB2 ^ 0x8B));
        PlatformDependent.lIllIIllllIIlI[42] = (0x3 ^ 0x2A);
        PlatformDependent.lIllIIllllIIlI[43] = (0xE8 ^ 0xC2);
        PlatformDependent.lIllIIllllIIlI[44] = (0x1D ^ 0x6E ^ (0x6 ^ 0x5E));
        PlatformDependent.lIllIIllllIIlI[45] = (0xAE ^ 0x82);
        PlatformDependent.lIllIIllllIIlI[46] = (5 + 4 + 35 + 105 ^ 95 + 69 - 21 + 41);
        PlatformDependent.lIllIIllllIIlI[47] = (124 + 78 - 115 + 52 ^ 56 + 163 - 113 + 59);
        PlatformDependent.lIllIIllllIIlI[48] = (0x46 ^ 0x69);
        PlatformDependent.lIllIIllllIIlI[49] = (0x43 ^ 0x3E ^ (0xE9 ^ 0xA4));
        PlatformDependent.lIllIIllllIIlI[50] = (0x93 ^ 0xAA ^ (0x92 ^ 0x9A));
        PlatformDependent.lIllIIllllIIlI[51] = (0x99 ^ 0xAB);
        PlatformDependent.lIllIIllllIIlI[52] = (0x79 ^ 0x53 ^ (0x69 ^ 0x70));
        PlatformDependent.lIllIIllllIIlI[53] = (95 + 27 - 47 + 54 ^ 93 + 20 - 95 + 163);
        PlatformDependent.lIllIIllllIIlI[54] = (0x54 ^ 0x61);
        PlatformDependent.lIllIIllllIIlI[55] = (0x1A ^ 0x2C);
        PlatformDependent.lIllIIllllIIlI[56] = (0x22 ^ 0x15);
        PlatformDependent.lIllIIllllIIlI[57] = (0x80 ^ 0xB8);
        PlatformDependent.lIllIIllllIIlI[58] = (0x40 ^ 0x79);
        PlatformDependent.lIllIIllllIIlI[59] = (59 + 62 - 65 + 123 ^ 84 + 107 - 121 + 67);
        PlatformDependent.lIllIIllllIIlI[60] = (0x99 ^ 0xA2);
        PlatformDependent.lIllIIllllIIlI[61] = (0x36 ^ 0x31 ^ (0x9 ^ 0x32));
        PlatformDependent.lIllIIllllIIlI[62] = (" ".length() ^ (0xC ^ 0x30));
        PlatformDependent.lIllIIllllIIlI[63] = (0x75 ^ 0x63 ^ (0x1A ^ 0x32));
        PlatformDependent.lIllIIllllIIlI[64] = (0x75 ^ 0x4A);
        PlatformDependent.lIllIIllllIIlI[65] = (0xED ^ 0xAD);
        PlatformDependent.lIllIIllllIIlI[66] = (0xFB ^ 0xBA);
        PlatformDependent.lIllIIllllIIlI[67] = (0x38 ^ 0x4F ^ (0x89 ^ 0xBC));
        PlatformDependent.lIllIIllllIIlI[68] = (0x8B ^ 0x82 ^ (0xC9 ^ 0x83));
        PlatformDependent.lIllIIllllIIlI[69] = (36 + 126 - 66 + 133 ^ 151 + 132 - 190 + 68);
        PlatformDependent.lIllIIllllIIlI[70] = (19 + 33 + 51 + 137 ^ 123 + 116 - 238 + 180);
        PlatformDependent.lIllIIllllIIlI[71] = (0x18 ^ 0x5E);
        PlatformDependent.lIllIIllllIIlI[72] = (130 + 18 - 109 + 211 ^ 101 + 77 - 135 + 146);
        PlatformDependent.lIllIIllllIIlI[73] = (74 + 202 - 197 + 126 ^ 20 + 69 - 8 + 52);
        PlatformDependent.lIllIIllllIIlI[74] = (0xB1 ^ 0xC2 ^ (0x64 ^ 0x5E));
        PlatformDependent.lIllIIllllIIlI[75] = (0x2 ^ 0x48);
        PlatformDependent.lIllIIllllIIlI[76] = (92 + 132 - 105 + 24 ^ 74 + 28 - 48 + 142);
        PlatformDependent.lIllIIllllIIlI[77] = (0xC9 ^ 0x85);
        PlatformDependent.lIllIIllllIIlI[78] = (0x2F ^ 0x62);
        PlatformDependent.lIllIIllllIIlI[79] = (0xF1 ^ 0xBF);
        PlatformDependent.lIllIIllllIIlI[80] = (7 + 115 - 38 + 111 ^ 1 + 36 + 6 + 97);
        PlatformDependent.lIllIIllllIIlI[81] = (0xD0 ^ 0x80);
        PlatformDependent.lIllIIllllIIlI[82] = -" ".length();
        PlatformDependent.lIllIIllllIIlI[83] = (0x3C ^ 0x6D);
        PlatformDependent.lIllIIllllIIlI[84] = (0x15 ^ 0x47);
        PlatformDependent.lIllIIllllIIlI[85] = (0x3C ^ 0x35 ^ (0xF2 ^ 0xA8));
        PlatformDependent.lIllIIllllIIlI[86] = (0xFA ^ 0xAE);
        PlatformDependent.lIllIIllllIIlI[87] = (0x2B ^ 0x7E);
    }
    
    private static long maxDirectMemory0() {
        long lllllllllllllIIIIIIIllllIIllllII = 0L;
        try {
            final Class<?> lllllllllllllIIIIIIIllllIlIIlIIl = Class.forName(PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[34]], (boolean)(PlatformDependent.lIllIIllllIIlI[1] != 0), getSystemClassLoader());
            final Method lllllllllllllIIIIIIIllllIlIIlIII = lllllllllllllIIIIIIIllllIlIIlIIl.getDeclaredMethod(PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[35]], (Class<?>[])new Class[PlatformDependent.lIllIIllllIIlI[0]]);
            lllllllllllllIIIIIIIllllIIllllII = ((Number)lllllllllllllIIIIIIIllllIlIIlIII.invoke(null, new Object[PlatformDependent.lIllIIllllIIlI[0]])).longValue();
            "".length();
            if (((25 + 51 - 69 + 168 ^ 0 + 16 + 4 + 112) & (155 + 171 - 235 + 86 ^ 57 + 55 - 0 + 42 ^ -" ".length())) != 0x0) {
                return 0L;
            }
        }
        catch (Throwable t) {}
        if (lllllIllIlIlIlI(lllllIllIlIlllI(lllllllllllllIIIIIIIllllIIllllII, 0L))) {
            return lllllllllllllIIIIIIIllllIIllllII;
        }
        try {
            final Class<?> lllllllllllllIIIIIIIllllIlIIIIll = Class.forName(PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[36]], (boolean)(PlatformDependent.lIllIIllllIIlI[1] != 0), getSystemClassLoader());
            final Class<?> lllllllllllllIIIIIIIllllIlIIIIIl = Class.forName(PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[37]], (boolean)(PlatformDependent.lIllIIllllIIlI[1] != 0), getSystemClassLoader());
            final Object lllllllllllllIIIIIIIllllIIllllll = lllllllllllllIIIIIIIllllIlIIIIll.getDeclaredMethod(PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[38]], (Class<?>[])new Class[PlatformDependent.lIllIIllllIIlI[0]]).invoke(null, new Object[PlatformDependent.lIllIIllllIIlI[0]]);
            final List<String> lllllllllllllIIIIIIIllllIIlllllI = (List<String>)lllllllllllllIIIIIIIllllIlIIIIIl.getDeclaredMethod(PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[39]], (Class<?>[])new Class[PlatformDependent.lIllIIllllIIlI[0]]).invoke(lllllllllllllIIIIIIIllllIIllllll, new Object[PlatformDependent.lIllIIllllIIlI[0]]);
            int lllllllllllllIIIIIIIllllIlIIIlIl = lllllllllllllIIIIIIIllllIIlllllI.size() - PlatformDependent.lIllIIllllIIlI[1];
            while (lllllIllIlIllll(lllllllllllllIIIIIIIllllIlIIIlIl)) {
                final Matcher lllllllllllllIIIIIIIllllIlIIIllI = PlatformDependent.MAX_DIRECT_MEMORY_SIZE_ARG_PATTERN.matcher(lllllllllllllIIIIIIIllllIIlllllI.get(lllllllllllllIIIIIIIllllIlIIIlIl));
                if (lllllIllIlIIlll(lllllllllllllIIIIIIIllllIlIIIllI.matches() ? 1 : 0)) {
                    "".length();
                    if (" ".length() > "  ".length()) {
                        return 0L;
                    }
                    --lllllllllllllIIIIIIIllllIlIIIlIl;
                    "".length();
                    if ((0xB ^ 0xF) <= (" ".length() & ~" ".length())) {
                        return 0L;
                    }
                    continue;
                }
                else {
                    lllllllllllllIIIIIIIllllIIllllII = Long.parseLong(lllllllllllllIIIIIIIllllIlIIIllI.group(PlatformDependent.lIllIIllllIIlI[1]));
                    switch (lllllllllllllIIIIIIIllllIlIIIllI.group(PlatformDependent.lIllIIllllIIlI[2]).charAt(PlatformDependent.lIllIIllllIIlI[0])) {
                        case 'K':
                        case 'k': {
                            lllllllllllllIIIIIIIllllIIllllII *= 1024L;
                            "".length();
                            if (" ".length() <= 0) {
                                return 0L;
                            }
                            break;
                        }
                        case 'M':
                        case 'm': {
                            lllllllllllllIIIIIIIllllIIllllII *= 1048576L;
                            "".length();
                            if (((0x30 ^ 0x60) & ~(0x40 ^ 0x10)) >= "   ".length()) {
                                return 0L;
                            }
                            break;
                        }
                        case 'G':
                        case 'g': {
                            lllllllllllllIIIIIIIllllIIllllII *= 1073741824L;
                            break;
                        }
                    }
                    "".length();
                    if (((0x7C ^ 0x70 ^ (0x3B ^ 0x21)) & (0x40 ^ 0x37 ^ (0x3B ^ 0x5A) ^ -" ".length())) >= "   ".length()) {
                        return 0L;
                    }
                    break;
                }
            }
            "".length();
            if (" ".length() <= 0) {
                return 0L;
            }
        }
        catch (Throwable t2) {}
        if (lllllIllIllIIII(lllllIllIlIlllI(lllllllllllllIIIIIIIllllIIllllII, 0L))) {
            lllllllllllllIIIIIIIllllIIllllII = Runtime.getRuntime().maxMemory();
            PlatformDependent.logger.debug(PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[40]], (Object)lllllllllllllIIIIIIIllllIIllllII);
            "".length();
            if ("   ".length() > "   ".length()) {
                return 0L;
            }
        }
        else {
            PlatformDependent.logger.debug(PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[41]], (Object)lllllllllllllIIIIIIIllllIIllllII);
        }
        return lllllllllllllIIIIIIIllllIIllllII;
    }
    
    private static int javaVersion0() {
        int lllllllllllllIIIIIIIllllIlllIlIl = 0;
        if (lllllIllIlIIllI(isAndroid() ? 1 : 0)) {
            final int lllllllllllllIIIIIIIllllIllllIII = PlatformDependent.lIllIIllllIIlI[6];
            "".length();
            if ((0xEE ^ 0x99 ^ (0x28 ^ 0x5A)) == 0x0) {
                return (0x2A ^ 0x71 ^ (0x3 ^ 0x67)) & (0xA0 ^ 0xBD ^ (0xB0 ^ 0x92) ^ -" ".length());
            }
        }
        else {
            try {
                Class.forName(PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[20]], (boolean)(PlatformDependent.lIllIIllllIIlI[0] != 0), getClassLoader(Object.class));
                "".length();
                lllllllllllllIIIIIIIllllIlllIlIl = PlatformDependent.lIllIIllllIIlI[8];
                "".length();
                if ("   ".length() < 0) {
                    return (45 + 138 - 66 + 50 ^ 36 + 113 - 23 + 54) & (0x74 ^ 0x4C ^ (0xBD ^ 0x96) ^ -" ".length());
                }
            }
            catch (Exception lllllllllllllIIIIIIIllllIlllIlll) {
                try {
                    Class.forName(PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[21]], (boolean)(PlatformDependent.lIllIIllllIIlI[0] != 0), getClassLoader(BlockingQueue.class));
                    "".length();
                    lllllllllllllIIIIIIIllllIlllIlIl = PlatformDependent.lIllIIllllIIlI[7];
                    "".length();
                    if ("  ".length() > "   ".length()) {
                        return (63 + 181 - 53 + 11 ^ 85 + 94 - 109 + 89) & (99 + 89 - 99 + 57 ^ 132 + 173 - 220 + 114 ^ -" ".length());
                    }
                }
                catch (Exception lllllllllllllIIIIIIIllllIlllIllI) {
                    lllllllllllllIIIIIIIllllIlllIlIl = PlatformDependent.lIllIIllllIIlI[6];
                }
            }
        }
        if (lllllIllIlIIllI(PlatformDependent.logger.isDebugEnabled() ? 1 : 0)) {
            PlatformDependent.logger.debug(PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[22]], (Object)lllllllllllllIIIIIIIllllIlllIlIl);
        }
        return lllllllllllllIIIIIIIllllIlllIlIl;
    }
    
    public static boolean isWindows() {
        return PlatformDependent.IS_WINDOWS;
    }
    
    public static void putByte(final long lllllllllllllIIIIIIlIIIIIIIIllIl, final byte lllllllllllllIIIIIIlIIIIIIIIllII) {
        PlatformDependent0.putByte(lllllllllllllIIIIIIlIIIIIIIIllIl, lllllllllllllIIIIIIlIIIIIIIIllII);
    }
    
    public static <K, V> ConcurrentMap<K, V> newConcurrentHashMap(final Map<? extends K, ? extends V> lllllllllllllIIIIIIlIIIIIlIIIIlI) {
        if (lllllIllIlIIllI(PlatformDependent.CAN_USE_CHM_V8 ? 1 : 0)) {
            return new ConcurrentHashMapV8<K, V>(lllllllllllllIIIIIIlIIIIIlIIIIlI);
        }
        return new ConcurrentHashMap<K, V>(lllllllllllllIIIIIIlIIIIIlIIIIlI);
    }
    
    public static void copyMemory(final long lllllllllllllIIIIIIIllllllllIIll, final long lllllllllllllIIIIIIIllllllllIlIl, final long lllllllllllllIIIIIIIllllllllIlII) {
        PlatformDependent0.copyMemory(lllllllllllllIIIIIIIllllllllIIll, lllllllllllllIIIIIIIllllllllIlIl, lllllllllllllIIIIIIIllllllllIlII);
    }
    
    private static boolean lllllIllIlIllII(final Object lllllllllllllIIIIIIIlllIlIlIIIll) {
        return lllllllllllllIIIIIIIlllIlIlIIIll == null;
    }
    
    public static ClassLoader getClassLoader(final Class<?> lllllllllllllIIIIIIIlllllIlllIll) {
        return PlatformDependent0.getClassLoader(lllllllllllllIIIIIIIlllllIlllIll);
    }
    
    public static void putShort(final long lllllllllllllIIIIIIlIIIIIIIIlIIl, final short lllllllllllllIIIIIIlIIIIIIIIlIII) {
        PlatformDependent0.putShort(lllllllllllllIIIIIIlIIIIIIIIlIIl, lllllllllllllIIIIIIlIIIIIIIIlIII);
    }
    
    public static ClassLoader getContextClassLoader() {
        return PlatformDependent0.getContextClassLoader();
    }
    
    public static int getInt(final long lllllllllllllIIIIIIlIIIIIIIllllI) {
        return PlatformDependent0.getInt(lllllllllllllIIIIIIlIIIIIIIllllI);
    }
    
    public static <K, V> ConcurrentMap<K, V> newConcurrentHashMap(final int lllllllllllllIIIIIIlIIIIIlIlIIIl, final float lllllllllllllIIIIIIlIIIIIlIIlllI) {
        if (lllllIllIlIIllI(PlatformDependent.CAN_USE_CHM_V8 ? 1 : 0)) {
            return new ConcurrentHashMapV8<K, V>(lllllllllllllIIIIIIlIIIIIlIlIIIl, lllllllllllllIIIIIIlIIIIIlIIlllI);
        }
        return new ConcurrentHashMap<K, V>(lllllllllllllIIIIIIlIIIIIlIlIIIl, lllllllllllllIIIIIIlIIIIIlIIlllI);
    }
    
    public static void throwException(final Throwable lllllllllllllIIIIIIlIIIIIlIllIlI) {
        if (lllllIllIlIIllI(hasUnsafe() ? 1 : 0)) {
            PlatformDependent0.throwException(lllllllllllllIIIIIIlIIIIIlIllIlI);
            "".length();
            if (-" ".length() < -" ".length()) {
                return;
            }
        }
        else {
            throwException0(lllllllllllllIIIIIIlIIIIIlIllIlI);
        }
    }
    
    public static <K, V> ConcurrentMap<K, V> newConcurrentHashMap(final int lllllllllllllIIIIIIlIIIIIlIIlIlI, final float lllllllllllllIIIIIIlIIIIIlIIlIIl, final int lllllllllllllIIIIIIlIIIIIlIIlIII) {
        if (lllllIllIlIIllI(PlatformDependent.CAN_USE_CHM_V8 ? 1 : 0)) {
            return new ConcurrentHashMapV8<K, V>(lllllllllllllIIIIIIlIIIIIlIIlIlI, lllllllllllllIIIIIIlIIIIIlIIlIIl, lllllllllllllIIIIIIlIIIIIlIIlIII);
        }
        return new ConcurrentHashMap<K, V>(lllllllllllllIIIIIIlIIIIIlIIlIlI, lllllllllllllIIIIIIlIIIIIlIIlIIl, lllllllllllllIIIIIIlIIIIIlIIlIII);
    }
    
    public static ClassLoader getSystemClassLoader() {
        return PlatformDependent0.getSystemClassLoader();
    }
    
    private static boolean lllllIllIlIIlll(final int lllllllllllllIIIIIIIlllIlIIlllll) {
        return lllllllllllllIIIIIIIlllIlIIlllll == 0;
    }
    
    private static boolean isAndroid0() {
        boolean lllllllllllllIIIIIIIlllllIllIlll;
        try {
            Class.forName(PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[0]], (boolean)(PlatformDependent.lIllIIllllIIlI[0] != 0), getSystemClassLoader());
            "".length();
            lllllllllllllIIIIIIIlllllIllIlll = (PlatformDependent.lIllIIllllIIlI[1] != 0);
            "".length();
            if (" ".length() < ((204 + 175 - 295 + 130 ^ 127 + 12 - 121 + 118) & (227 + 136 - 331 + 217 ^ 95 + 166 - 196 + 102 ^ -" ".length()))) {
                return ((56 + 1 + 76 + 18 ^ 95 + 117 - 172 + 123) & (0x24 ^ 0xD ^ (0x52 ^ 0x4F) ^ -" ".length())) != 0x0;
            }
        }
        catch (Exception lllllllllllllIIIIIIIlllllIlllIII) {
            lllllllllllllIIIIIIIlllllIllIlll = (PlatformDependent.lIllIIllllIIlI[0] != 0);
        }
        if (lllllIllIlIIllI(lllllllllllllIIIIIIIlllllIllIlll ? 1 : 0)) {
            PlatformDependent.logger.debug(PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[1]]);
        }
        return lllllllllllllIIIIIIIlllllIllIlll;
    }
    
    public static void freeMemory(final long lllllllllllllIIIIIIlIIIIIlIlllIl) {
        PlatformDependent0.freeMemory(lllllllllllllIIIIIIlIIIIIlIlllIl);
    }
    
    public static int javaVersion() {
        return PlatformDependent.JAVA_VERSION;
    }
    
    private static int bitMode0() {
        int lllllllllllllIIIIIIIlllIlllIllII = SystemPropertyUtil.getInt(PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[64]], PlatformDependent.lIllIIllllIIlI[0]);
        if (lllllIllIlIlIlI(lllllllllllllIIIIIIIlllIlllIllII)) {
            PlatformDependent.logger.debug(PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[65]], (Object)lllllllllllllIIIIIIIlllIlllIllII);
            return lllllllllllllIIIIIIIlllIlllIllII;
        }
        lllllllllllllIIIIIIIlllIlllIllII = SystemPropertyUtil.getInt(PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[66]], PlatformDependent.lIllIIllllIIlI[0]);
        if (lllllIllIlIlIlI(lllllllllllllIIIIIIIlllIlllIllII)) {
            PlatformDependent.logger.debug(PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[67]], (Object)lllllllllllllIIIIIIIlllIlllIllII);
            return lllllllllllllIIIIIIIlllIlllIllII;
        }
        lllllllllllllIIIIIIIlllIlllIllII = SystemPropertyUtil.getInt(PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[68]], PlatformDependent.lIllIIllllIIlI[0]);
        if (lllllIllIlIlIlI(lllllllllllllIIIIIIIlllIlllIllII)) {
            PlatformDependent.logger.debug(PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[69]], (Object)lllllllllllllIIIIIIIlllIlllIllII);
            return lllllllllllllIIIIIIIlllIlllIllII;
        }
        final String lllllllllllllIIIIIIIlllIlllIlIlI = SystemPropertyUtil.get(PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[70]], PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[71]]).toLowerCase(Locale.US).trim();
        if (!lllllIllIlIIlll(PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[72]].equals(lllllllllllllIIIIIIIlllIlllIlIlI) ? 1 : 0) || lllllIllIlIIllI(PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[73]].equals(lllllllllllllIIIIIIIlllIlllIlIlI) ? 1 : 0)) {
            lllllllllllllIIIIIIIlllIlllIllII = PlatformDependent.lIllIIllllIIlI[65];
            "".length();
            if (((0x70 ^ 0x2D) & ~(0x4F ^ 0x12)) != 0x0) {
                return (0x46 ^ 0x62) & ~(0x6F ^ 0x4B);
            }
        }
        else if (!lllllIllIlIIlll(PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[74]].equals(lllllllllllllIIIIIIIlllIlllIlIlI) ? 1 : 0) || !lllllIllIlIIlll(PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[75]].equals(lllllllllllllIIIIIIIlllIlllIlIlI) ? 1 : 0) || !lllllIllIlIIlll(PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[76]].equals(lllllllllllllIIIIIIIlllIlllIlIlI) ? 1 : 0) || lllllIllIlIIllI(PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[77]].equals(lllllllllllllIIIIIIIlllIlllIlIlI) ? 1 : 0)) {
            lllllllllllllIIIIIIIlllIlllIllII = PlatformDependent.lIllIIllllIIlI[33];
        }
        if (lllllIllIlIlIlI(lllllllllllllIIIIIIIlllIlllIllII)) {
            PlatformDependent.logger.debug(PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[78]], (Object)lllllllllllllIIIIIIIlllIlllIllII, lllllllllllllIIIIIIIlllIlllIlIlI);
        }
        final String lllllllllllllIIIIIIIlllIlllIlIIl = SystemPropertyUtil.get(PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[79]], PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[80]]).toLowerCase(Locale.US);
        final Pattern lllllllllllllIIIIIIIlllIlllIlIII = Pattern.compile(PlatformDependent.lIllIIllIllIll[PlatformDependent.lIllIIllllIIlI[81]]);
        final Matcher lllllllllllllIIIIIIIlllIlllIIllI = lllllllllllllIIIIIIIlllIlllIlIII.matcher(lllllllllllllIIIIIIIlllIlllIlIIl);
        if (lllllIllIlIIllI(lllllllllllllIIIIIIIlllIlllIIllI.find() ? 1 : 0)) {
            return Integer.parseInt(lllllllllllllIIIIIIIlllIlllIIllI.group(PlatformDependent.lIllIIllllIIlI[1]));
        }
        return PlatformDependent.lIllIIllllIIlI[65];
    }
    
    public static long allocateMemory(final long lllllllllllllIIIIIIlIIIIIllIIIIl) {
        return PlatformDependent0.allocateMemory(lllllllllllllIIIIIIlIIIIIllIIIIl);
    }
}
