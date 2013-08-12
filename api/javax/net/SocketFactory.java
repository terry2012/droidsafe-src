package javax.net;

// Droidsafe Imports
import droidsafe.annotations.*;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;






public abstract class SocketFactory {
    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:17.527 -0400", hash_original_method = "558E5CF77A92B4D322EAE73AA7FC9ED5", hash_generated_method = "49A83C6EA0E2C7D8DB87841B35CCED46")
    protected  SocketFactory() {
        // ---------- Original Method ----------
    }

    
    @DSModeled(DSC.SAFE)
    public static synchronized SocketFactory getDefault() {
        if (defaultFactory == null) {
            defaultFactory = new DefaultSocketFactory();
        }
        return defaultFactory;
    }

    
        @DSModeled(DSC.SPEC)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:17.528 -0400", hash_original_method = "237BDA73790E5091959E59275734231E", hash_generated_method = "6C6A5E417DF1DD0807322CC013D5032A")
    public Socket createSocket() throws IOException {
        SocketException var017B431FE5380BEF3661A8EE7F89DBAD_972879560 = new SocketException("Unconnected sockets not implemented");
        var017B431FE5380BEF3661A8EE7F89DBAD_972879560.addTaint(taint);
        throw var017B431FE5380BEF3661A8EE7F89DBAD_972879560;
        // ---------- Original Method ----------
        //throw new SocketException("Unconnected sockets not implemented");
    }

    
    @DSModeled(DSC.SAFE)
    public abstract Socket createSocket(String host, int port) throws IOException,
            UnknownHostException;

    
    @DSModeled(DSC.SAFE)
    public abstract Socket createSocket(String host, int port, InetAddress localHost, int localPort)
            throws IOException, UnknownHostException;

    
    @DSModeled(DSC.SAFE)
    public abstract Socket createSocket(InetAddress host, int port) throws IOException;

    
    @DSModeled(DSC.SAFE)
    public abstract Socket createSocket(InetAddress address, int port, InetAddress localAddress,
            int localPort) throws IOException;

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:17.529 -0400", hash_original_field = "AD51BE9B54CCA5A60660866B8F47D2A3", hash_generated_field = "56F0D4B4CAC1522C61207F4CDB9A2E1E")

    private static SocketFactory defaultFactory;
}

