package org.bouncycastle.util.encoders;

// Droidsafe Imports
import droidsafe.annotations.*;
import java.io.IOException;
import java.io.OutputStream;






public class Base64Encoder implements Encoder {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:42.285 -0400", hash_original_field = "26679137600502689C8A177F50F164AC", hash_generated_field = "477367DCA11A991FB18CE4EB6F2C01EF")

    protected final byte[] encodingTable = {
            (byte)'A', (byte)'B', (byte)'C', (byte)'D', (byte)'E', (byte)'F', (byte)'G',
            (byte)'H', (byte)'I', (byte)'J', (byte)'K', (byte)'L', (byte)'M', (byte)'N',
            (byte)'O', (byte)'P', (byte)'Q', (byte)'R', (byte)'S', (byte)'T', (byte)'U',
            (byte)'V', (byte)'W', (byte)'X', (byte)'Y', (byte)'Z',
            (byte)'a', (byte)'b', (byte)'c', (byte)'d', (byte)'e', (byte)'f', (byte)'g',
            (byte)'h', (byte)'i', (byte)'j', (byte)'k', (byte)'l', (byte)'m', (byte)'n',
            (byte)'o', (byte)'p', (byte)'q', (byte)'r', (byte)'s', (byte)'t', (byte)'u',
            (byte)'v',
            (byte)'w', (byte)'x', (byte)'y', (byte)'z',
            (byte)'0', (byte)'1', (byte)'2', (byte)'3', (byte)'4', (byte)'5', (byte)'6',
            (byte)'7', (byte)'8', (byte)'9',
            (byte)'+', (byte)'/'
        };
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:42.285 -0400", hash_original_field = "6BFC228E0751465901E4098F8966DFFF", hash_generated_field = "6470484C1DBA83A435D7A06D16D20315")

    protected byte padding = (byte)'=';
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:42.285 -0400", hash_original_field = "22173E2A74F154E91BA0F39198C1B226", hash_generated_field = "C5A9E5FA83A75FCB14FF277263CBAED5")

    protected final byte[] decodingTable = new byte[128];
    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:42.285 -0400", hash_original_method = "680D3875922DD4E67C0EE2E950D928BD", hash_generated_method = "AABF19D4D0BC5EA370D8438ED4D196CF")
    public  Base64Encoder() {
        initialiseDecodingTable();
        // ---------- Original Method ----------
        //initialiseDecodingTable();
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:42.285 -0400", hash_original_method = "21DA0B3C66110012AEC4B0EF8A985DB1", hash_generated_method = "0AC011AA0E77EEFDD36DBDA6E3F424E5")
    protected void initialiseDecodingTable() {
for(int i = 0;i < encodingTable.length;i++)
        {
            decodingTable[encodingTable[i]] = (byte)i;
        } //End block
        // ---------- Original Method ----------
        //for (int i = 0; i < encodingTable.length; i++)
        //{
            //decodingTable[encodingTable[i]] = (byte)i;
        //}
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:42.287 -0400", hash_original_method = "9CA1F48AAB7841E0E0CBD16E0BA7D360", hash_generated_method = "51BDB6C475D34FEB03E40A5A0D85396A")
    public int encode(
        byte[]                data,
        int                    off,
        int                    length,
        OutputStream    out) throws IOException {
        addTaint(out.getTaint());
        addTaint(length);
        addTaint(off);
        addTaint(data[0]);
        int modulus = length % 3;
        int dataLength = (length - modulus);
        int a1;
        int a2;
        int a3;
for(int i = off;i < off + dataLength;i += 3)
        {
            a1 = data[i] & 0xff;
            a2 = data[i + 1] & 0xff;
            a3 = data[i + 2] & 0xff;
            out.write(encodingTable[(a1 >>> 2) & 0x3f]);
            out.write(encodingTable[((a1 << 4) | (a2 >>> 4)) & 0x3f]);
            out.write(encodingTable[((a2 << 2) | (a3 >>> 6)) & 0x3f]);
            out.write(encodingTable[a3 & 0x3f]);
        } //End block
        int b1;
        int b2;
        int b3;
        int d1;
        int d2;
switch(modulus){
        case 0:
        break;
        case 1:
        d1 = data[off + dataLength] & 0xff;
        b1 = (d1 >>> 2) & 0x3f;
        b2 = (d1 << 4) & 0x3f;
        out.write(encodingTable[b1]);
        out.write(encodingTable[b2]);
        out.write(padding);
        out.write(padding);
        break;
        case 2:
        d1 = data[off + dataLength] & 0xff;
        d2 = data[off + dataLength + 1] & 0xff;
        b1 = (d1 >>> 2) & 0x3f;
        b2 = ((d1 << 4) | (d2 >>> 4)) & 0x3f;
        b3 = (d2 << 2) & 0x3f;
        out.write(encodingTable[b1]);
        out.write(encodingTable[b2]);
        out.write(encodingTable[b3]);
        out.write(padding);
        break;
}        int var4DA29C35F37089457FCA797F0BEA148D_1067431217 = ((dataLength / 3) * 4 + ((modulus == 0) ? 0 : 4));
                int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1077451575 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1077451575;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
        @DSModeled(DSC.BAN)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:42.288 -0400", hash_original_method = "1B2A7D609CA1F47FC87AA118398B5C86", hash_generated_method = "E892F4AC16155E798D32FE2FE0958F14")
    private boolean ignore(
        char    c) {
        addTaint(c);
        boolean var0813D1039B08197476EB8CFDC63ADF39_25752719 = ((c == '\n' || c =='\r' || c == '\t' || c == ' '));
                boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1786080723 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1786080723;
        // ---------- Original Method ----------
        //return (c == '\n' || c =='\r' || c == '\t' || c == ' ');
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:42.291 -0400", hash_original_method = "211C1414D28F35039504B68D95AB9ED9", hash_generated_method = "B4DC106BB9967A4D274C97608644B113")
    public int decode(
        byte[]          data,
        int             off,
        int             length,
        OutputStream    out) throws IOException {
        addTaint(out.getTaint());
        addTaint(length);
        addTaint(off);
        addTaint(data[0]);
        byte b1;
        byte b2;
        byte b3;
        byte b4;
        int outLen = 0;
        int end = off + length;
        while
(end > off)        
        {
            if(!ignore((char)data[end - 1]))            
            {
                break;
            } //End block
            end--;
        } //End block
        int i = off;
        int finish = end - 4;
        i = nextI(data, i, finish);
        while
(i < finish)        
        {
            b1 = decodingTable[data[i++]];
            i = nextI(data, i, finish);
            b2 = decodingTable[data[i++]];
            i = nextI(data, i, finish);
            b3 = decodingTable[data[i++]];
            i = nextI(data, i, finish);
            b4 = decodingTable[data[i++]];
            out.write((b1 << 2) | (b2 >> 4));
            out.write((b2 << 4) | (b3 >> 2));
            out.write((b3 << 6) | b4);
            outLen += 3;
            i = nextI(data, i, finish);
        } //End block
        outLen += decodeLastBlock(out, (char)data[end - 4], (char)data[end - 3], (char)data[end - 2], (char)data[end - 1]);
        int var504BA8911EA515F30CAFCF90C1129E92_2137720436 = (outLen);
                int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_775441045 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_775441045;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSModeled(DSC.BAN)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:42.291 -0400", hash_original_method = "1225BA5A886EEC007862013ADD842450", hash_generated_method = "A1787F1CEBC703C244CCB67761E928AE")
    private int nextI(byte[] data, int i, int finish) {
        addTaint(finish);
        addTaint(i);
        addTaint(data[0]);
        while
((i < finish) && ignore((char)data[i]))        
        {
            i++;
        } //End block
        int var865C0C0B4AB0E063E5CAA3387C1A8741_2088655177 = (i);
                int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_234760137 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_234760137;
        // ---------- Original Method ----------
        //while ((i < finish) && ignore((char)data[i]))
        //{
            //i++;
        //}
        //return i;
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:42.293 -0400", hash_original_method = "304E01512ABEE5D32E29AD105C8F9759", hash_generated_method = "7162470B5BBAC047DAD0E4ABD69057E2")
    public int decode(
        String          data,
        OutputStream    out) throws IOException {
        addTaint(out.getTaint());
        addTaint(data.getTaint());
        byte b1;
        byte b2;
        byte b3;
        byte b4;
        int length = 0;
        int end = data.length();
        while
(end > 0)        
        {
            if(!ignore(data.charAt(end - 1)))            
            {
                break;
            } //End block
            end--;
        } //End block
        int i = 0;
        int finish = end - 4;
        i = nextI(data, i, finish);
        while
(i < finish)        
        {
            b1 = decodingTable[data.charAt(i++)];
            i = nextI(data, i, finish);
            b2 = decodingTable[data.charAt(i++)];
            i = nextI(data, i, finish);
            b3 = decodingTable[data.charAt(i++)];
            i = nextI(data, i, finish);
            b4 = decodingTable[data.charAt(i++)];
            out.write((b1 << 2) | (b2 >> 4));
            out.write((b2 << 4) | (b3 >> 2));
            out.write((b3 << 6) | b4);
            length += 3;
            i = nextI(data, i, finish);
        } //End block
        length += decodeLastBlock(out, data.charAt(end - 4), data.charAt(end - 3), data.charAt(end - 2), data.charAt(end - 1));
        int var2FA47F7C65FEC19CC163B195725E3844_1550756256 = (length);
                int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_576160064 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_576160064;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSModeled(DSC.BAN)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:42.295 -0400", hash_original_method = "9E52D5CA91DB497317BE2B1E69827671", hash_generated_method = "1B4D8C574A35758920D159D0A2D80974")
    private int decodeLastBlock(OutputStream out, char c1, char c2, char c3, char c4) throws IOException {
        addTaint(c4);
        addTaint(c3);
        addTaint(c2);
        addTaint(c1);
        addTaint(out.getTaint());
        byte b1;
        byte b2;
        byte b3;
        byte b4;
        if(c3 == padding)        
        {
            b1 = decodingTable[c1];
            b2 = decodingTable[c2];
            out.write((b1 << 2) | (b2 >> 4));
            int varC4CA4238A0B923820DCC509A6F75849B_651986237 = (1);
                        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1564581169 = getTaintInt();
            return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1564581169;
        } //End block
        else
        if(c4 == padding)        
        {
            b1 = decodingTable[c1];
            b2 = decodingTable[c2];
            b3 = decodingTable[c3];
            out.write((b1 << 2) | (b2 >> 4));
            out.write((b2 << 4) | (b3 >> 2));
            int varC81E728D9D4C2F636F067F89CC14862C_602472290 = (2);
                        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1218481192 = getTaintInt();
            return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1218481192;
        } //End block
        else
        {
            b1 = decodingTable[c1];
            b2 = decodingTable[c2];
            b3 = decodingTable[c3];
            b4 = decodingTable[c4];
            out.write((b1 << 2) | (b2 >> 4));
            out.write((b2 << 4) | (b3 >> 2));
            out.write((b3 << 6) | b4);
            int varECCBC87E4B5CE2FE28308FD9F2A7BAF3_599743532 = (3);
                        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_228216480 = getTaintInt();
            return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_228216480;
        } //End block
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSModeled(DSC.BAN)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:42.295 -0400", hash_original_method = "4A002F2B2C5A42BB007C07A5E9BC2D50", hash_generated_method = "DC06BE4C832B9D28A3C0F6E8E1180A09")
    private int nextI(String data, int i, int finish) {
        addTaint(finish);
        addTaint(i);
        addTaint(data.getTaint());
        while
((i < finish) && ignore(data.charAt(i)))        
        {
            i++;
        } //End block
        int var865C0C0B4AB0E063E5CAA3387C1A8741_1896640747 = (i);
                int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1112686567 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1112686567;
        // ---------- Original Method ----------
        //while ((i < finish) && ignore(data.charAt(i)))
        //{
            //i++;
        //}
        //return i;
    }

    
}

