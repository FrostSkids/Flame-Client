// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.rxtx;

import java.util.concurrent.TimeUnit;
import io.netty.channel.ChannelPromise;
import io.netty.channel.AbstractChannel;
import io.netty.channel.ChannelConfig;
import io.netty.channel.Channel;
import gnu.io.CommPort;
import gnu.io.CommPortIdentifier;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.channel.ChannelOption;
import java.net.SocketAddress;
import gnu.io.SerialPort;
import io.netty.channel.oio.OioByteStreamChannel;

public class RxtxChannel extends OioByteStreamChannel
{
    private /* synthetic */ SerialPort serialPort;
    private final /* synthetic */ RxtxChannelConfig config;
    private /* synthetic */ RxtxDeviceAddress deviceAddress;
    private /* synthetic */ boolean open;
    private static final /* synthetic */ RxtxDeviceAddress LOCAL_ADDRESS;
    private static final /* synthetic */ int[] lIlIIIIllIIIlI;
    private static final /* synthetic */ String[] lIlIIIIllIIIII;
    
    @Override
    public RxtxChannelConfig config() {
        return this.config;
    }
    
    @Override
    public RxtxDeviceAddress localAddress() {
        return (RxtxDeviceAddress)super.localAddress();
    }
    
    static {
        lllIIIIlllIIlIl();
        lllIIIIlllIIIIl();
        LOCAL_ADDRESS = new RxtxDeviceAddress(RxtxChannel.lIlIIIIllIIIII[RxtxChannel.lIlIIIIllIIIlI[2]]);
    }
    
    @Override
    protected RxtxDeviceAddress remoteAddress0() {
        return this.deviceAddress;
    }
    
    private static boolean lllIIIIlllIIllI(final Object lllllllllllllIIlIIIIIlIlIIIlIIll) {
        return lllllllllllllIIlIIIIIlIlIIIlIIll != null;
    }
    
    @Override
    protected void doBind(final SocketAddress lllllllllllllIIlIIIIIlIlIIlllIIl) throws Exception {
        throw new UnsupportedOperationException();
    }
    
    protected void doInit() throws Exception {
        this.serialPort.setSerialPortParams((int)this.config().getOption(RxtxChannelOption.BAUD_RATE), this.config().getOption(RxtxChannelOption.DATA_BITS).value(), this.config().getOption(RxtxChannelOption.STOP_BITS).value(), this.config().getOption(RxtxChannelOption.PARITY_BIT).value());
        this.serialPort.setDTR((boolean)this.config().getOption(RxtxChannelOption.DTR));
        this.serialPort.setRTS((boolean)this.config().getOption(RxtxChannelOption.RTS));
        this.activate(this.serialPort.getInputStream(), this.serialPort.getOutputStream());
    }
    
    private static String lllIIIIllIlllll(final String lllllllllllllIIlIIIIIlIlIIIllIII, final String lllllllllllllIIlIIIIIlIlIIIlIlll) {
        try {
            final SecretKeySpec lllllllllllllIIlIIIIIlIlIIIlllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIIIIlIlIIIlIlll.getBytes(StandardCharsets.UTF_8)), RxtxChannel.lIlIIIIllIIIlI[3]), "DES");
            final Cipher lllllllllllllIIlIIIIIlIlIIIlllII = Cipher.getInstance("DES");
            lllllllllllllIIlIIIIIlIlIIIlllII.init(RxtxChannel.lIlIIIIllIIIlI[4], lllllllllllllIIlIIIIIlIlIIIlllIl);
            return new String(lllllllllllllIIlIIIIIlIlIIIlllII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIIIIlIlIIIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIIIIIlIlIIIllIll) {
            lllllllllllllIIlIIIIIlIlIIIllIll.printStackTrace();
            return null;
        }
    }
    
    @Override
    protected void doConnect(final SocketAddress lllllllllllllIIlIIIIIlIlIlIlIIIl, final SocketAddress lllllllllllllIIlIIIIIlIlIlIlIIII) throws Exception {
        final RxtxDeviceAddress lllllllllllllIIlIIIIIlIlIlIIllll = (RxtxDeviceAddress)lllllllllllllIIlIIIIIlIlIlIlIIIl;
        final CommPortIdentifier lllllllllllllIIlIIIIIlIlIlIIlllI = CommPortIdentifier.getPortIdentifier(lllllllllllllIIlIIIIIlIlIlIIllll.value());
        final CommPort lllllllllllllIIlIIIIIlIlIlIIllIl = lllllllllllllIIlIIIIIlIlIlIIlllI.open(this.getClass().getName(), RxtxChannel.lIlIIIIllIIIlI[1]);
        lllllllllllllIIlIIIIIlIlIlIIllIl.enableReceiveTimeout((int)this.config().getOption(RxtxChannelOption.READ_TIMEOUT));
        this.deviceAddress = lllllllllllllIIlIIIIIlIlIlIIllll;
        this.serialPort = (SerialPort)lllllllllllllIIlIIIIIlIlIlIIllIl;
    }
    
    @Override
    public boolean isOpen() {
        return this.open;
    }
    
    @Override
    protected RxtxDeviceAddress localAddress0() {
        return RxtxChannel.LOCAL_ADDRESS;
    }
    
    private static void lllIIIIlllIIlIl() {
        (lIlIIIIllIIIlI = new int[5])[0] = " ".length();
        RxtxChannel.lIlIIIIllIIIlI[1] = (-(0x53 ^ 0x47) & (0xFFFFD3FB & 0x2FFF));
        RxtxChannel.lIlIIIIllIIIlI[2] = ((164 + 54 - 135 + 108 ^ 30 + 11 + 57 + 58) & (52 + 48 - 42 + 170 ^ 7 + 3 + 162 + 27 ^ -" ".length()));
        RxtxChannel.lIlIIIIllIIIlI[3] = (0xED ^ 0xAB ^ (0x34 ^ 0x7A));
        RxtxChannel.lIlIIIIllIIIlI[4] = "  ".length();
    }
    
    public RxtxChannel() {
        super(null);
        this.open = (RxtxChannel.lIlIIIIllIIIlI[0] != 0);
        this.config = new DefaultRxtxChannelConfig(this);
    }
    
    @Override
    protected void doClose() throws Exception {
        this.open = (RxtxChannel.lIlIIIIllIIIlI[2] != 0);
        try {
            super.doClose();
            if (lllIIIIlllIIllI(this.serialPort)) {
                this.serialPort.removeEventListener();
                this.serialPort.close();
                this.serialPort = null;
                "".length();
                if (((0xB6 ^ 0xAC ^ (0x9F ^ 0xA3)) & (0x5C ^ 0x21 ^ (0xEA ^ 0xB1) ^ -" ".length())) == -" ".length()) {
                    return;
                }
            }
        }
        finally {
            if (lllIIIIlllIIllI(this.serialPort)) {
                this.serialPort.removeEventListener();
                this.serialPort.close();
                this.serialPort = null;
            }
        }
    }
    
    private static void lllIIIIlllIIIIl() {
        (lIlIIIIllIIIII = new String[RxtxChannel.lIlIIIIllIIIlI[0]])[RxtxChannel.lIlIIIIllIIIlI[2]] = lllIIIIllIlllll("phD2rsh/VmhfV70yC2Pkvw==", "mYBed");
    }
    
    @Override
    protected void doDisconnect() throws Exception {
        this.doClose();
    }
    
    @Override
    public RxtxDeviceAddress remoteAddress() {
        return (RxtxDeviceAddress)super.remoteAddress();
    }
    
    @Override
    protected AbstractUnsafe newUnsafe() {
        return new RxtxUnsafe();
    }
    
    private final class RxtxUnsafe extends AbstractUnsafe
    {
        private static boolean lllIllllIllIlII(final int lllllllllllllIIIIlllllIlIIIIIIll) {
            return lllllllllllllIIIIlllllIlIIIIIIll != 0;
        }
        
        private static boolean lllIllllIllIlIl(final int lllllllllllllIIIIlllllIlIIIIIIIl) {
            return lllllllllllllIIIIlllllIlIIIIIIIl == 0;
        }
        
        private static boolean lllIllllIllIllI(final int lllllllllllllIIIIlllllIIllllllll) {
            return lllllllllllllIIIIlllllIIllllllll > 0;
        }
        
        @Override
        public void connect(final SocketAddress lllllllllllllIIIIlllllIlIIlIIIlI, final SocketAddress lllllllllllllIIIIlllllIlIIlIIlIl, final ChannelPromise lllllllllllllIIIIlllllIlIIlIIIII) {
            if (!lllIllllIllIlII(lllllllllllllIIIIlllllIlIIlIIIII.setUncancellable() ? 1 : 0) || lllIllllIllIlIl(this.ensureOpen(lllllllllllllIIIIlllllIlIIlIIIII) ? 1 : 0)) {
                return;
            }
            try {
                final boolean lllllllllllllIIIIlllllIlIIlIlIlI = RxtxChannel.this.isActive();
                RxtxChannel.this.doConnect(lllllllllllllIIIIlllllIlIIlIIIlI, lllllllllllllIIIIlllllIlIIlIIlIl);
                final int lllllllllllllIIIIlllllIlIIlIlIIl = RxtxChannel.this.config().getOption(RxtxChannelOption.WAIT_TIME);
                if (lllIllllIllIllI(lllllllllllllIIIIlllllIlIIlIlIIl)) {
                    RxtxChannel.this.eventLoop().schedule((Runnable)new Runnable() {
                        @Override
                        public void run() {
                            try {
                                RxtxChannel.this.doInit();
                                AbstractUnsafe.this.safeSetSuccess(lllllllllllllIIIIlllllIlIIlIIIII);
                                if (llIlIlIIlIllIll(lllllllllllllIIIIlllllIlIIlIlIlI ? 1 : 0) && llIlIlIIlIlllII(RxtxChannel.this.isActive() ? 1 : 0)) {
                                    RxtxChannel.this.pipeline().fireChannelActive();
                                    "".length();
                                }
                                "".length();
                                if (-" ".length() >= 0) {
                                    return;
                                }
                            }
                            catch (Throwable lllllllllllllIIlIlllllIlllIIIIlI) {
                                AbstractUnsafe.this.safeSetFailure(lllllllllllllIIIIlllllIlIIlIIIII, lllllllllllllIIlIlllllIlllIIIIlI);
                                AbstractUnsafe.this.closeIfClosed();
                            }
                        }
                        
                        private static boolean llIlIlIIlIllIll(final int lllllllllllllIIlIlllllIllIlllIll) {
                            return lllllllllllllIIlIlllllIllIlllIll == 0;
                        }
                        
                        private static boolean llIlIlIIlIlllII(final int lllllllllllllIIlIlllllIllIllllIl) {
                            return lllllllllllllIIlIlllllIllIllllIl != 0;
                        }
                    }, (long)lllllllllllllIIIIlllllIlIIlIlIIl, TimeUnit.MILLISECONDS);
                    "".length();
                    "".length();
                    if (((0x35 ^ 0x1D) & ~(0x75 ^ 0x5D)) > "   ".length()) {
                        return;
                    }
                }
                else {
                    RxtxChannel.this.doInit();
                    this.safeSetSuccess(lllllllllllllIIIIlllllIlIIlIIIII);
                    if (lllIllllIllIlIl(lllllllllllllIIIIlllllIlIIlIlIlI ? 1 : 0) && lllIllllIllIlII(RxtxChannel.this.isActive() ? 1 : 0)) {
                        RxtxChannel.this.pipeline().fireChannelActive();
                        "".length();
                    }
                }
                "".length();
                if ("   ".length() != "   ".length()) {
                    return;
                }
            }
            catch (Throwable lllllllllllllIIIIlllllIlIIlIlIII) {
                this.safeSetFailure(lllllllllllllIIIIlllllIlIIlIIIII, lllllllllllllIIIIlllllIlIIlIlIII);
                this.closeIfClosed();
            }
        }
    }
}
