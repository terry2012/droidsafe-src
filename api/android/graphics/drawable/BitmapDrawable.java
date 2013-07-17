package android.graphics.drawable;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PixelFormat;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Gravity;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import java.io.IOException;

public class BitmapDrawable extends Drawable {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:11.407 -0400", hash_original_field = "8CF9D6A2BA83DEFBA443E79D87D8B1A2", hash_generated_field = "3A76FEC83F92CDCF2EE402CB0D000CA7")

    private BitmapState mBitmapState;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:11.407 -0400", hash_original_field = "C4C105852193F50EEB9E84F09C746611", hash_generated_field = "4EFA3179E01F3A6C04DAAC2298E5BFE4")

    private Bitmap mBitmap;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:11.407 -0400", hash_original_field = "E3FD93BDA80C01F50A45E71FBA2F2318", hash_generated_field = "13CD7AE350A8EF6D449472E24FC8398F")

    private int mTargetDensity;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:11.407 -0400", hash_original_field = "1320DB4AC9152B6EEDA856562A1C352D", hash_generated_field = "1E3D8C2BEBFECFBF47423C145BB19A3C")

    private final Rect mDstRect = new Rect();
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:11.407 -0400", hash_original_field = "79CEB2570500CABABA0DD2F3ED958E15", hash_generated_field = "5A87E51B39C79BA29E312E77B8B43A92")

    private boolean mApplyGravity;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:11.408 -0400", hash_original_field = "9FB80C30383848C8D006680B5F3BDAF9", hash_generated_field = "5CA5A1EF3CAA45117BCACBC34EF05952")

    private boolean mMutated;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:11.408 -0400", hash_original_field = "DE6A0ABB3CA1313B4F7BDFF407B4A18B", hash_generated_field = "568275F41A7E61D900F9F414E799383D")

    private int mBitmapWidth;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:11.408 -0400", hash_original_field = "EE573FC7FF36074270F8BF43556DFB4C", hash_generated_field = "2EAFFA48F02C3807ED7A1FED6D773758")

    private int mBitmapHeight;
    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:11.408 -0400", hash_original_method = "B0AF2A53C18BC0AEA00F89D5110E52E7", hash_generated_method = "29FF9CA7DE78EFC57224158AE5341D65")
    @Deprecated
    public  BitmapDrawable() {
        mBitmapState = new BitmapState((Bitmap) null);
        // ---------- Original Method ----------
        //mBitmapState = new BitmapState((Bitmap) null);
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:11.409 -0400", hash_original_method = "ECC74DE3478988E64B883DFDAEC329B4", hash_generated_method = "B8F53F068664D88F4A14ADE77C0B6BB1")
    @SuppressWarnings({"UnusedParameters"})
    public  BitmapDrawable(Resources res) {
        addTaint(res.getTaint());
        mBitmapState = new BitmapState((Bitmap) null);
        mBitmapState.mTargetDensity = mTargetDensity;
        // ---------- Original Method ----------
        //mBitmapState = new BitmapState((Bitmap) null);
        //mBitmapState.mTargetDensity = mTargetDensity;
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:11.409 -0400", hash_original_method = "EDF3772DB206CC7034C0B4AE87D72F1A", hash_generated_method = "C08812B7C36B875EA3AC6289F8C1030A")
    @Deprecated
    public  BitmapDrawable(Bitmap bitmap) {
        this(new BitmapState(bitmap), null);
        addTaint(bitmap.getTaint());
        // ---------- Original Method ----------
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:11.410 -0400", hash_original_method = "0FA3F000A20BF5722D4983CAD4B48A6A", hash_generated_method = "2910F98D7FC104D8099BFC6FCA77279D")
    public  BitmapDrawable(Resources res, Bitmap bitmap) {
        this(new BitmapState(bitmap), res);
        addTaint(bitmap.getTaint());
        addTaint(res.getTaint());
        mBitmapState.mTargetDensity = mTargetDensity;
        // ---------- Original Method ----------
        //mBitmapState.mTargetDensity = mTargetDensity;
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:11.410 -0400", hash_original_method = "88A1392443C2003D9FA4C6DECF6A14A3", hash_generated_method = "11E1EB6556FB31A283EA23E9AB149719")
    @Deprecated
    public  BitmapDrawable(String filepath) {
        this(new BitmapState(BitmapFactory.decodeFile(filepath)), null);
        addTaint(filepath.getTaint());
        if(mBitmap == null)        
        {
            android.util.Log.w("BitmapDrawable", "BitmapDrawable cannot decode " + filepath);
        } //End block
        // ---------- Original Method ----------
        //if (mBitmap == null) {
            //android.util.Log.w("BitmapDrawable", "BitmapDrawable cannot decode " + filepath);
        //}
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:11.411 -0400", hash_original_method = "2E50FC990DF5F99ED2B436DB68D65D30", hash_generated_method = "52559ACAAB9903121470AE818205C61E")
    @SuppressWarnings({"UnusedParameters"})
    public  BitmapDrawable(Resources res, String filepath) {
        this(new BitmapState(BitmapFactory.decodeFile(filepath)), null);
        addTaint(filepath.getTaint());
        addTaint(res.getTaint());
        mBitmapState.mTargetDensity = mTargetDensity;
        if(mBitmap == null)        
        {
            android.util.Log.w("BitmapDrawable", "BitmapDrawable cannot decode " + filepath);
        } //End block
        // ---------- Original Method ----------
        //mBitmapState.mTargetDensity = mTargetDensity;
        //if (mBitmap == null) {
            //android.util.Log.w("BitmapDrawable", "BitmapDrawable cannot decode " + filepath);
        //}
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:11.411 -0400", hash_original_method = "5474E95C495E2BDEA7848B2F1051B5AB", hash_generated_method = "3CC7842E019BDB532FFCC8F01C34C375")
    @Deprecated
    public  BitmapDrawable(java.io.InputStream is) {
        this(new BitmapState(BitmapFactory.decodeStream(is)), null);
        addTaint(is.getTaint());
        if(mBitmap == null)        
        {
            android.util.Log.w("BitmapDrawable", "BitmapDrawable cannot decode " + is);
        } //End block
        // ---------- Original Method ----------
        //if (mBitmap == null) {
            //android.util.Log.w("BitmapDrawable", "BitmapDrawable cannot decode " + is);
        //}
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:11.412 -0400", hash_original_method = "A95CEE47ED6D08FEFE672AAA66725922", hash_generated_method = "BAA8606004AB589254F25A1225F006AD")
    @SuppressWarnings({"UnusedParameters"})
    public  BitmapDrawable(Resources res, java.io.InputStream is) {
        this(new BitmapState(BitmapFactory.decodeStream(is)), null);
        addTaint(is.getTaint());
        addTaint(res.getTaint());
        mBitmapState.mTargetDensity = mTargetDensity;
        if(mBitmap == null)        
        {
            android.util.Log.w("BitmapDrawable", "BitmapDrawable cannot decode " + is);
        } //End block
        // ---------- Original Method ----------
        //mBitmapState.mTargetDensity = mTargetDensity;
        //if (mBitmap == null) {
            //android.util.Log.w("BitmapDrawable", "BitmapDrawable cannot decode " + is);
        //}
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:11.412 -0400", hash_original_method = "FB19047A342C9589C667FFAF2B0ECEA1", hash_generated_method = "64DA8E1E2360AAEBBD8776CA3ECF0205")
    private  BitmapDrawable(BitmapState state, Resources res) {
        mBitmapState = state;
        if(res != null)        
        {
            mTargetDensity = res.getDisplayMetrics().densityDpi;
        } //End block
        else
        {
            mTargetDensity = state.mTargetDensity;
        } //End block
        setBitmap(state != null ? state.mBitmap : null);
        // ---------- Original Method ----------
        //mBitmapState = state;
        //if (res != null) {
            //mTargetDensity = res.getDisplayMetrics().densityDpi;
        //} else {
            //mTargetDensity = state.mTargetDensity;
        //}
        //setBitmap(state != null ? state.mBitmap : null);
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:11.413 -0400", hash_original_method = "29B9C66D2E3FF8CE986D27E62D842E86", hash_generated_method = "292DF2D0C378C6F8B557D8059A796642")
    public final Paint getPaint() {
Paint varE3E65144F7E831421DA6CC787BBC597C_1946825478 =         mBitmapState.mPaint;
        varE3E65144F7E831421DA6CC787BBC597C_1946825478.addTaint(taint);
        return varE3E65144F7E831421DA6CC787BBC597C_1946825478;
        // ---------- Original Method ----------
        //return mBitmapState.mPaint;
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:11.414 -0400", hash_original_method = "CDEEA354B6732B0C95C918F7ECA77F64", hash_generated_method = "CD4B0F877D6237972AF6E3A0979F6E07")
    public final Bitmap getBitmap() {
Bitmap var3AE2FA0FD35BCE2BB296A9C2B523C9FC_1774956550 =         mBitmap;
        var3AE2FA0FD35BCE2BB296A9C2B523C9FC_1774956550.addTaint(taint);
        return var3AE2FA0FD35BCE2BB296A9C2B523C9FC_1774956550;
        // ---------- Original Method ----------
        //return mBitmap;
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:11.414 -0400", hash_original_method = "BD13D47BACD5F22B3F18803E2B331415", hash_generated_method = "5BD547052F6BE282E7B4F0BFF461A99A")
    private void computeBitmapSize() {
        mBitmapWidth = mBitmap.getScaledWidth(mTargetDensity);
        mBitmapHeight = mBitmap.getScaledHeight(mTargetDensity);
        // ---------- Original Method ----------
        //mBitmapWidth = mBitmap.getScaledWidth(mTargetDensity);
        //mBitmapHeight = mBitmap.getScaledHeight(mTargetDensity);
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:11.415 -0400", hash_original_method = "5A8B316E5E7A06983942607FAB994128", hash_generated_method = "FAC645F6B1147F59BBC47A9751C86933")
    private void setBitmap(Bitmap bitmap) {
        if(bitmap != mBitmap)        
        {
            mBitmap = bitmap;
            if(bitmap != null)            
            {
                computeBitmapSize();
            } //End block
            else
            {
                mBitmapWidth = mBitmapHeight = -1;
            } //End block
            invalidateSelf();
        } //End block
        // ---------- Original Method ----------
        //if (bitmap != mBitmap) {
            //mBitmap = bitmap;
            //if (bitmap != null) {
                //computeBitmapSize();
            //} else {
                //mBitmapWidth = mBitmapHeight = -1;
            //}
            //invalidateSelf();
        //}
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:11.415 -0400", hash_original_method = "82585E992AABF5984A06ED90552A1C77", hash_generated_method = "08ADEC9348B823ADA440A2B50003FC7E")
    public void setTargetDensity(Canvas canvas) {
        addTaint(canvas.getTaint());
        setTargetDensity(canvas.getDensity());
        // ---------- Original Method ----------
        //setTargetDensity(canvas.getDensity());
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:11.416 -0400", hash_original_method = "4AE49AE83EF2F62C9A584A758B5178F3", hash_generated_method = "A780DDFCC4CBE80D7EFC83D56CFDF67F")
    public void setTargetDensity(DisplayMetrics metrics) {
        addTaint(metrics.getTaint());
        setTargetDensity(metrics.densityDpi);
        // ---------- Original Method ----------
        //setTargetDensity(metrics.densityDpi);
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:11.416 -0400", hash_original_method = "A17595DAE1AE36756FF8FF6EEBB23DC0", hash_generated_method = "BAA55B2CE1AB01E63F69C3EACC446F44")
    public void setTargetDensity(int density) {
        if(mTargetDensity != density)        
        {
            mTargetDensity = density == 0 ? DisplayMetrics.DENSITY_DEFAULT : density;
            if(mBitmap != null)            
            {
                computeBitmapSize();
            } //End block
            invalidateSelf();
        } //End block
        // ---------- Original Method ----------
        //if (mTargetDensity != density) {
            //mTargetDensity = density == 0 ? DisplayMetrics.DENSITY_DEFAULT : density;
            //if (mBitmap != null) {
                //computeBitmapSize();
            //}
            //invalidateSelf();
        //}
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:11.417 -0400", hash_original_method = "35E95FC787F9F24A49C5DE1ED0297F4C", hash_generated_method = "B132566C7E351AA46B0C3EF9C426AA06")
    public int getGravity() {
        int varAC1B497EA644683625E1592BCC420E70_474398949 = (mBitmapState.mGravity);
                int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1839859036 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1839859036;
        // ---------- Original Method ----------
        //return mBitmapState.mGravity;
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:11.417 -0400", hash_original_method = "4FFB5FF85BF6BE29F34E4951AEB6D83F", hash_generated_method = "4990407CF9ED1404EE61CF8CAFF9F273")
    public void setGravity(int gravity) {
        if(mBitmapState.mGravity != gravity)        
        {
            mBitmapState.mGravity = gravity;
            mApplyGravity = true;
            invalidateSelf();
        } //End block
        // ---------- Original Method ----------
        //if (mBitmapState.mGravity != gravity) {
            //mBitmapState.mGravity = gravity;
            //mApplyGravity = true;
            //invalidateSelf();
        //}
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:11.418 -0400", hash_original_method = "A6A7F02FCC6854A1D6F789226FBA84D5", hash_generated_method = "FDB48E3CB0AEF7BEC72E3587CE056080")
    public void setAntiAlias(boolean aa) {
        addTaint(aa);
        mBitmapState.mPaint.setAntiAlias(aa);
        invalidateSelf();
        // ---------- Original Method ----------
        //mBitmapState.mPaint.setAntiAlias(aa);
        //invalidateSelf();
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:11.418 -0400", hash_original_method = "79F41E9E1F5486CC4586236A9EB22FE0", hash_generated_method = "EA50CFAF9A3655479F733C2E485F5B20")
    @Override
    public void setFilterBitmap(boolean filter) {
        addTaint(filter);
        mBitmapState.mPaint.setFilterBitmap(filter);
        invalidateSelf();
        // ---------- Original Method ----------
        //mBitmapState.mPaint.setFilterBitmap(filter);
        //invalidateSelf();
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:11.418 -0400", hash_original_method = "FC203784F21362ACF19CD453633052FE", hash_generated_method = "1FEF8C5682A4E65A1BA40DA090FD2DD6")
    @Override
    public void setDither(boolean dither) {
        addTaint(dither);
        mBitmapState.mPaint.setDither(dither);
        invalidateSelf();
        // ---------- Original Method ----------
        //mBitmapState.mPaint.setDither(dither);
        //invalidateSelf();
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:11.419 -0400", hash_original_method = "8C03C626370DF89EB681D1D91A4CB25A", hash_generated_method = "69E80FF47FF8308DC0982E0ECAFD6132")
    public Shader.TileMode getTileModeX() {
Shader.TileMode var8A0DDC40CE3A669DB6E8ED93A5D53143_481073091 =         mBitmapState.mTileModeX;
        var8A0DDC40CE3A669DB6E8ED93A5D53143_481073091.addTaint(taint);
        return var8A0DDC40CE3A669DB6E8ED93A5D53143_481073091;
        // ---------- Original Method ----------
        //return mBitmapState.mTileModeX;
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:11.419 -0400", hash_original_method = "C4F6E36EB6EDDD2C280548D4CD537229", hash_generated_method = "629A3CF0CB6A1DA58C958ED0162AE209")
    public Shader.TileMode getTileModeY() {
Shader.TileMode var20C17428E24ACD541E1A3941B269BCFC_317710734 =         mBitmapState.mTileModeY;
        var20C17428E24ACD541E1A3941B269BCFC_317710734.addTaint(taint);
        return var20C17428E24ACD541E1A3941B269BCFC_317710734;
        // ---------- Original Method ----------
        //return mBitmapState.mTileModeY;
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:11.419 -0400", hash_original_method = "856CFED7038AD7D83A692D422DD3B90C", hash_generated_method = "D7EB833378A78EEB251B687D6A418614")
    public void setTileModeX(Shader.TileMode mode) {
        addTaint(mode.getTaint());
        setTileModeXY(mode, mBitmapState.mTileModeY);
        // ---------- Original Method ----------
        //setTileModeXY(mode, mBitmapState.mTileModeY);
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:11.419 -0400", hash_original_method = "445DE87A20C6F0A91872714D31B4C1C9", hash_generated_method = "00F602B4F9F100DDF3497B32C03E846E")
    public final void setTileModeY(Shader.TileMode mode) {
        addTaint(mode.getTaint());
        setTileModeXY(mBitmapState.mTileModeX, mode);
        // ---------- Original Method ----------
        //setTileModeXY(mBitmapState.mTileModeX, mode);
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:11.419 -0400", hash_original_method = "ADEC19A1E439C619635E588D2B7F4415", hash_generated_method = "FEC60FA57D9721BBB1E91CD6B2A83F5F")
    public void setTileModeXY(Shader.TileMode xmode, Shader.TileMode ymode) {
        addTaint(ymode.getTaint());
        addTaint(xmode.getTaint());
        final BitmapState state = mBitmapState;
        if(state.mTileModeX != xmode || state.mTileModeY != ymode)        
        {
            state.mTileModeX = xmode;
            state.mTileModeY = ymode;
            state.mRebuildShader = true;
            invalidateSelf();
        } //End block
        // ---------- Original Method ----------
        //final BitmapState state = mBitmapState;
        //if (state.mTileModeX != xmode || state.mTileModeY != ymode) {
            //state.mTileModeX = xmode;
            //state.mTileModeY = ymode;
            //state.mRebuildShader = true;
            //invalidateSelf();
        //}
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:11.420 -0400", hash_original_method = "10D38B42FB036E8B57E4A209AB7F4ADC", hash_generated_method = "E673BD235199B2D91E28A03511AEA44E")
    @Override
    public int getChangingConfigurations() {
        int var3FEDC0452C3DBDEBD33B7D15B3692B25_568313913 = (super.getChangingConfigurations() | mBitmapState.mChangingConfigurations);
                int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1081056752 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1081056752;
        // ---------- Original Method ----------
        //return super.getChangingConfigurations() | mBitmapState.mChangingConfigurations;
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:11.420 -0400", hash_original_method = "43A5F38374D847F9AEDDDDB09459070C", hash_generated_method = "4C719EE6B6EF151AB2ABE8E40AB0AC81")
    @Override
    protected void onBoundsChange(Rect bounds) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        addTaint(bounds.getTaint());
        super.onBoundsChange(bounds);
        mApplyGravity = true;
        // ---------- Original Method ----------
        //super.onBoundsChange(bounds);
        //mApplyGravity = true;
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:11.420 -0400", hash_original_method = "6FA1B7BCBB056D9C6C12415C137DE76D", hash_generated_method = "8ABD2040214BD4F752B8F3FAF33F477D")
    @Override
    public void draw(Canvas canvas) {
        addTaint(canvas.getTaint());
        Bitmap bitmap = mBitmap;
        if(bitmap != null)        
        {
            final BitmapState state = mBitmapState;
            if(state.mRebuildShader)            
            {
                Shader.TileMode tmx = state.mTileModeX;
                Shader.TileMode tmy = state.mTileModeY;
                if(tmx == null && tmy == null)                
                {
                    state.mPaint.setShader(null);
                } //End block
                else
                {
                    state.mPaint.setShader(new BitmapShader(bitmap,
                            tmx == null ? Shader.TileMode.CLAMP : tmx,
                            tmy == null ? Shader.TileMode.CLAMP : tmy));
                } //End block
                state.mRebuildShader = false;
                copyBounds(mDstRect);
            } //End block
            Shader shader = state.mPaint.getShader();
            if(shader == null)            
            {
                if(mApplyGravity)                
                {
                    final int layoutDirection = getResolvedLayoutDirectionSelf();
                    Gravity.apply(state.mGravity, mBitmapWidth, mBitmapHeight,
                            getBounds(), mDstRect, layoutDirection);
                    mApplyGravity = false;
                } //End block
                canvas.drawBitmap(bitmap, null, mDstRect, state.mPaint);
            } //End block
            else
            {
                if(mApplyGravity)                
                {
                    copyBounds(mDstRect);
                    mApplyGravity = false;
                } //End block
                canvas.drawRect(mDstRect, state.mPaint);
            } //End block
        } //End block
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:11.421 -0400", hash_original_method = "49CE66D09454E056E2AD494EF2DD30A3", hash_generated_method = "91CAF86F01D69BF321FD7132A16F8D2A")
    @Override
    public void setAlpha(int alpha) {
        addTaint(alpha);
        int oldAlpha = mBitmapState.mPaint.getAlpha();
        if(alpha != oldAlpha)        
        {
            mBitmapState.mPaint.setAlpha(alpha);
            invalidateSelf();
        } //End block
        // ---------- Original Method ----------
        //int oldAlpha = mBitmapState.mPaint.getAlpha();
        //if (alpha != oldAlpha) {
            //mBitmapState.mPaint.setAlpha(alpha);
            //invalidateSelf();
        //}
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:11.421 -0400", hash_original_method = "F79C881D02962F781494A97AA0D9D98A", hash_generated_method = "1B97F5953B8EC21C266369A4AD2517A7")
    @Override
    public void setColorFilter(ColorFilter cf) {
        addTaint(cf.getTaint());
        mBitmapState.mPaint.setColorFilter(cf);
        invalidateSelf();
        // ---------- Original Method ----------
        //mBitmapState.mPaint.setColorFilter(cf);
        //invalidateSelf();
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:11.422 -0400", hash_original_method = "12F43AAD192527EE14BD9EA92E6F05B8", hash_generated_method = "1304A2CAED24DFD0627820AC6F5FBBE4")
    @Override
    public Drawable mutate() {
        if(!mMutated && super.mutate() == this)        
        {
            mBitmapState = new BitmapState(mBitmapState);
            mMutated = true;
        } //End block
Drawable var72A74007B2BE62B849F475C7BDA4658B_668237553 =         this;
        var72A74007B2BE62B849F475C7BDA4658B_668237553.addTaint(taint);
        return var72A74007B2BE62B849F475C7BDA4658B_668237553;
        // ---------- Original Method ----------
        //if (!mMutated && super.mutate() == this) {
            //mBitmapState = new BitmapState(mBitmapState);
            //mMutated = true;
        //}
        //return this;
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:11.424 -0400", hash_original_method = "C7B53A4BB10177C8F005B36E9252EFF2", hash_generated_method = "C795CAFBAE14A5D99476078AB7D8BCA1")
    @Override
    public void inflate(Resources r, XmlPullParser parser, AttributeSet attrs) throws XmlPullParserException, IOException {
        addTaint(attrs.getTaint());
        addTaint(parser.getTaint());
        addTaint(r.getTaint());
        super.inflate(r, parser, attrs);
        TypedArray a = r.obtainAttributes(attrs, com.android.internal.R.styleable.BitmapDrawable);
        final int id = a.getResourceId(com.android.internal.R.styleable.BitmapDrawable_src, 0);
        if(id == 0)        
        {
            XmlPullParserException var1601E3160C46A96655701F0CD188D346_1039293608 = new XmlPullParserException(parser.getPositionDescription() +
                    ": <bitmap> requires a valid src attribute");
            var1601E3160C46A96655701F0CD188D346_1039293608.addTaint(taint);
            throw var1601E3160C46A96655701F0CD188D346_1039293608;
        } //End block
        final Bitmap bitmap = BitmapFactory.decodeResource(r, id);
        if(bitmap == null)        
        {
            XmlPullParserException var1601E3160C46A96655701F0CD188D346_209249161 = new XmlPullParserException(parser.getPositionDescription() +
                    ": <bitmap> requires a valid src attribute");
            var1601E3160C46A96655701F0CD188D346_209249161.addTaint(taint);
            throw var1601E3160C46A96655701F0CD188D346_209249161;
        } //End block
        mBitmapState.mBitmap = bitmap;
        setBitmap(bitmap);
        setTargetDensity(r.getDisplayMetrics());
        final Paint paint = mBitmapState.mPaint;
        paint.setAntiAlias(a.getBoolean(com.android.internal.R.styleable.BitmapDrawable_antialias,
                paint.isAntiAlias()));
        paint.setFilterBitmap(a.getBoolean(com.android.internal.R.styleable.BitmapDrawable_filter,
                paint.isFilterBitmap()));
        paint.setDither(a.getBoolean(com.android.internal.R.styleable.BitmapDrawable_dither,
                paint.isDither()));
        setGravity(a.getInt(com.android.internal.R.styleable.BitmapDrawable_gravity, Gravity.FILL));
        int tileMode = a.getInt(com.android.internal.R.styleable.BitmapDrawable_tileMode, -1);
        if(tileMode != -1)        
        {
switch(tileMode){
            case 0:
            setTileModeXY(Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
            break;
            case 1:
            setTileModeXY(Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
            break;
            case 2:
            setTileModeXY(Shader.TileMode.MIRROR, Shader.TileMode.MIRROR);
            break;
}
        } //End block
        a.recycle();
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:11.425 -0400", hash_original_method = "6DB114FB8E950C38C4587167EE2392DA", hash_generated_method = "0BA2312F620441A4D76A8F945A454F1D")
    @Override
    public int getIntrinsicWidth() {
        int varDE6A0ABB3CA1313B4F7BDFF407B4A18B_1085527325 = (mBitmapWidth);
                int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_2108923179 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_2108923179;
        // ---------- Original Method ----------
        //return mBitmapWidth;
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:11.425 -0400", hash_original_method = "391FEC77F059693D96A6B7B3AE926494", hash_generated_method = "9C0B0400C96F2DD0704BFEEA7CF46D17")
    @Override
    public int getIntrinsicHeight() {
        int varEE573FC7FF36074270F8BF43556DFB4C_421209068 = (mBitmapHeight);
                int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_343867226 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_343867226;
        // ---------- Original Method ----------
        //return mBitmapHeight;
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:11.426 -0400", hash_original_method = "9571905A182C10BB0B86009E34DE8EF4", hash_generated_method = "76280646D6B040004D75466D86580B71")
    @Override
    public int getOpacity() {
        if(mBitmapState.mGravity != Gravity.FILL)        
        {
            int var26C79996E92FCFBDC98A49C80BC91AD0_57428726 = (PixelFormat.TRANSLUCENT);
                        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_167071976 = getTaintInt();
            return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_167071976;
        } //End block
        Bitmap bm = mBitmap;
        int varE8E91935D3E850230416366BB42F953B_1148084026 = ((bm == null || bm.hasAlpha() || mBitmapState.mPaint.getAlpha() < 255) ?
                PixelFormat.TRANSLUCENT : PixelFormat.OPAQUE);
                int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_2085714318 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_2085714318;
        // ---------- Original Method ----------
        //if (mBitmapState.mGravity != Gravity.FILL) {
            //return PixelFormat.TRANSLUCENT;
        //}
        //Bitmap bm = mBitmap;
        //return (bm == null || bm.hasAlpha() || mBitmapState.mPaint.getAlpha() < 255) ?
                //PixelFormat.TRANSLUCENT : PixelFormat.OPAQUE;
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:11.426 -0400", hash_original_method = "B22D07CBAAEE149FB3D11CBEDB83599B", hash_generated_method = "9B603E8EA7C53A45CB739DFC21EFE0E2")
    @Override
    public final ConstantState getConstantState() {
        mBitmapState.mChangingConfigurations = getChangingConfigurations();
ConstantState var3E67C407BBCC4D42D5C5CECC6362B9A7_2068124289 =         mBitmapState;
        var3E67C407BBCC4D42D5C5CECC6362B9A7_2068124289.addTaint(taint);
        return var3E67C407BBCC4D42D5C5CECC6362B9A7_2068124289;
        // ---------- Original Method ----------
        //mBitmapState.mChangingConfigurations = getChangingConfigurations();
        //return mBitmapState;
    }

    
    final static class BitmapState extends ConstantState {
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:11.427 -0400", hash_original_field = "C4C105852193F50EEB9E84F09C746611", hash_generated_field = "46C0A7FFF0FFB93D952536F8E8BA5C29")

        Bitmap mBitmap;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:11.427 -0400", hash_original_field = "276E0645C4E2084773D0EB8C5576428C", hash_generated_field = "9BFAF00848476277D36D9BA586984BA7")

        int mChangingConfigurations;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:11.427 -0400", hash_original_field = "DDCDC839DADEAD04333ED644B12D7DB9", hash_generated_field = "02974118B7DB2EBC67C99A80C329EC2D")

        int mGravity = Gravity.FILL;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:11.427 -0400", hash_original_field = "BD957D3BC7CA3492655F65B4E470959F", hash_generated_field = "F847D1003F51642BF2CF19539CE8548D")

        Paint mPaint = new Paint(DEFAULT_PAINT_FLAGS);
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:11.427 -0400", hash_original_field = "AE4E5625D3BC87E574124C0D35AA33F0", hash_generated_field = "6E9BEEFA8B8AEF79DD5E5F09806F1C57")

        Shader.TileMode mTileModeX = null;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:11.427 -0400", hash_original_field = "175572BE9589677CFF38C357404E53D9", hash_generated_field = "4B2749A46C2F0D56B391EF4A168B3C38")

        Shader.TileMode mTileModeY = null;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:11.427 -0400", hash_original_field = "C98BC9AD629AD94FF2237799C3746D10", hash_generated_field = "80AC771C22191FC983474A6CF039F227")

        int mTargetDensity = DisplayMetrics.DENSITY_DEFAULT;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:11.427 -0400", hash_original_field = "C95B286C20384507638FDBDA61303A46", hash_generated_field = "6C534FAF0245C3B32617A5CE28BF5D41")

        boolean mRebuildShader;
        
                @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:11.428 -0400", hash_original_method = "80003A9E2431B1DF8C6F7DBC005B3BC9", hash_generated_method = "A9BB708F42AA8B8426AFD5B8BA3AC518")
          BitmapState(Bitmap bitmap) {
            mBitmap = bitmap;
            // ---------- Original Method ----------
            //mBitmap = bitmap;
        }

        
                @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:11.429 -0400", hash_original_method = "C0031760E3673EAB51AB6808BBA62477", hash_generated_method = "2C0F2E0534D8B72198A0A519439014E3")
          BitmapState(BitmapState bitmapState) {
            this(bitmapState.mBitmap);
            mChangingConfigurations = bitmapState.mChangingConfigurations;
            mGravity = bitmapState.mGravity;
            mTileModeX = bitmapState.mTileModeX;
            mTileModeY = bitmapState.mTileModeY;
            mTargetDensity = bitmapState.mTargetDensity;
            mPaint = new Paint(bitmapState.mPaint);
            mRebuildShader = bitmapState.mRebuildShader;
            // ---------- Original Method ----------
            //mChangingConfigurations = bitmapState.mChangingConfigurations;
            //mGravity = bitmapState.mGravity;
            //mTileModeX = bitmapState.mTileModeX;
            //mTileModeY = bitmapState.mTileModeY;
            //mTargetDensity = bitmapState.mTargetDensity;
            //mPaint = new Paint(bitmapState.mPaint);
            //mRebuildShader = bitmapState.mRebuildShader;
        }

        
                @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:11.429 -0400", hash_original_method = "7A0D3C52124D4E31E0F3E052BCC0F262", hash_generated_method = "7FA8038ACCA1B3CB63D81BD6F0AF5D0D")
        @Override
        public Drawable newDrawable() {
Drawable var5E1084F28333265ABFA76FF86F056B51_1412473647 =             new BitmapDrawable(this, null);
            var5E1084F28333265ABFA76FF86F056B51_1412473647.addTaint(taint);
            return var5E1084F28333265ABFA76FF86F056B51_1412473647;
            // ---------- Original Method ----------
            //return new BitmapDrawable(this, null);
        }

        
                @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:11.430 -0400", hash_original_method = "E262501023FDB9346524FFA189B84EDB", hash_generated_method = "3A710C541D1071E434EB465E733CCD2C")
        @Override
        public Drawable newDrawable(Resources res) {
            addTaint(res.getTaint());
Drawable var63524157975F655BCEF229267EA3374D_1018829126 =             new BitmapDrawable(this, res);
            var63524157975F655BCEF229267EA3374D_1018829126.addTaint(taint);
            return var63524157975F655BCEF229267EA3374D_1018829126;
            // ---------- Original Method ----------
            //return new BitmapDrawable(this, res);
        }

        
                @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:11.430 -0400", hash_original_method = "9E7D7C67EAC365FF19BD4971762612A5", hash_generated_method = "4F6FDC4248C2056CA92F6F1A8FC17B96")
        @Override
        public int getChangingConfigurations() {
            int var276E0645C4E2084773D0EB8C5576428C_2108577620 = (mChangingConfigurations);
                        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1581931824 = getTaintInt();
            return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1581931824;
            // ---------- Original Method ----------
            //return mChangingConfigurations;
        }

        
    }


    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:11.431 -0400", hash_original_field = "363F36F250F2419DDB43875B36ED4309", hash_generated_field = "88A3BEB3155DA79AE994754DCF9B8910")

    private static final int DEFAULT_PAINT_FLAGS = Paint.FILTER_BITMAP_FLAG | Paint.DITHER_FLAG;
}

