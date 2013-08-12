package android.text;

// Droidsafe Imports
import droidsafe.annotations.*;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.MetricAffectingSpan;
import android.text.style.ReplacementSpan;
import android.util.Log;

import com.android.internal.util.ArrayUtils;






class MeasuredText {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:37.018 -0400", hash_original_field = "39624508B9E3028D8A5DDA741D3E3DDE", hash_generated_field = "A59BBC07E5E46996D793B2F37E80BD24")

    CharSequence mText;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:37.018 -0400", hash_original_field = "356F326DD07BF3C178D92993F42C8258", hash_generated_field = "56525EE47BD7FA6F8CF4F7593CA30653")

    int mTextStart;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:37.018 -0400", hash_original_field = "3776CDE0A92BD5E30198555CE9E92337", hash_generated_field = "F268DBF02C69AE56F5D7B811DF02DD71")

    float[] mWidths;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:37.018 -0400", hash_original_field = "7C3722E3CD3CCC07C587A93513F1BB79", hash_generated_field = "221D78AA948575C2C408290E651B0D1C")

    char[] mChars;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:37.018 -0400", hash_original_field = "83F99C72ABCF954424B37B0FFAB0F5BC", hash_generated_field = "653966A07B2E0880FE25B3845B58F732")

    byte[] mLevels;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:37.018 -0400", hash_original_field = "90B0D92F580EFEB979A78726B5A06046", hash_generated_field = "1D096AE80A1F47FBC923E53A1E78A2C9")

    int mDir;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:37.018 -0400", hash_original_field = "EB002D02793BF9AC45C93C8B0E0D177A", hash_generated_field = "E7219AC9CF15F6988B4E84BAD92B2CE6")

    boolean mEasy;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:37.018 -0400", hash_original_field = "B74CDC798B150A72FBFBFAE7161611A0", hash_generated_field = "4B68EEB0ED264408F73553B8964D2663")

    int mLen;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:37.018 -0400", hash_original_field = "A8470CE6E0050B0E832FDE52720C7250", hash_generated_field = "649CC94BF1D5A5FECFE4D2F006B35728")

    private int mPos;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:37.018 -0400", hash_original_field = "B3CE09DC80997D762CCFEE11916EE7B6", hash_generated_field = "BD23BE48855C3EDD93B6A5A7CA353122")

    private TextPaint mWorkPaint;
    
    @DSModeled(DSC.BAN)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:37.018 -0400", hash_original_method = "D598B3CBC464CFD963CF00BDB269B2BE", hash_generated_method = "42783F836CB64369EF4A69ACD2229E3E")
    private  MeasuredText() {
        mWorkPaint = new TextPaint();
        // ---------- Original Method ----------
        //mWorkPaint = new TextPaint();
    }

    
    @DSModeled(DSC.BAN)
    static MeasuredText obtain() {
        MeasuredText mt;
        synchronized (sLock) {
            for (int i = sCached.length; --i >= 0;) {
                if (sCached[i] != null) {
                    mt = sCached[i];
                    sCached[i] = null;
                    return mt;
                }
            }
        }
        mt = new MeasuredText();
        if (localLOGV) {
            Log.v("MEAS", "new: " + mt);
        }
        return mt;
    }

    
    @DSModeled(DSC.BAN)
    static MeasuredText recycle(MeasuredText mt) {
        mt.mText = null;
        if (mt.mLen < 1000) {
            synchronized(sLock) {
                for (int i = 0; i < sCached.length; ++i) {
                    if (sCached[i] == null) {
                        sCached[i] = mt;
                        mt.mText = null;
                        break;
                    }
                }
            }
        }
        return null;
    }

    
    @DSModeled(DSC.BAN)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:37.022 -0400", hash_original_method = "AA7EC2CF46DA02829550CC76130A18E2", hash_generated_method = "52BF36F531C768F435B2AA8CF9C4773F")
     void setPara(CharSequence text, int start, int end, TextDirectionHeuristic textDir) {
        addTaint(textDir.getTaint());
        addTaint(end);
        mText = text;
        mTextStart = start;
        int len = end - start;
        mLen = len;
        mPos = 0;
        if(mWidths == null || mWidths.length < len)        
        {
            mWidths = new float[ArrayUtils.idealFloatArraySize(len)];
        } //End block
        if(mChars == null || mChars.length < len)        
        {
            mChars = new char[ArrayUtils.idealCharArraySize(len)];
        } //End block
        TextUtils.getChars(text, start, end, mChars, 0);
        if(text instanceof Spanned)        
        {
            Spanned spanned = (Spanned) text;
            ReplacementSpan[] spans = spanned.getSpans(start, end,
                    ReplacementSpan.class);
for(int i = 0;i < spans.length;i++)
            {
                int startInPara = spanned.getSpanStart(spans[i]) - start;
                int endInPara = spanned.getSpanEnd(spans[i]) - start;
for(int j = startInPara;j < endInPara;j++)
                {
                    mChars[j] = '\uFFFC';
                } //End block
            } //End block
        } //End block
        if((textDir == TextDirectionHeuristics.LTR ||
                textDir == TextDirectionHeuristics.FIRSTSTRONG_LTR ||
                textDir == TextDirectionHeuristics.ANYRTL_LTR) &&
                TextUtils.doesNotNeedBidi(mChars, 0, len))        
        {
            mDir = Layout.DIR_LEFT_TO_RIGHT;
            mEasy = true;
        } //End block
        else
        {
            if(mLevels == null || mLevels.length < len)            
            {
                mLevels = new byte[ArrayUtils.idealByteArraySize(len)];
            } //End block
            int bidiRequest;
            if(textDir == TextDirectionHeuristics.LTR)            
            {
                bidiRequest = Layout.DIR_REQUEST_LTR;
            } //End block
            else
            if(textDir == TextDirectionHeuristics.RTL)            
            {
                bidiRequest = Layout.DIR_REQUEST_RTL;
            } //End block
            else
            if(textDir == TextDirectionHeuristics.FIRSTSTRONG_LTR)            
            {
                bidiRequest = Layout.DIR_REQUEST_DEFAULT_LTR;
            } //End block
            else
            if(textDir == TextDirectionHeuristics.FIRSTSTRONG_RTL)            
            {
                bidiRequest = Layout.DIR_REQUEST_DEFAULT_RTL;
            } //End block
            else
            {
                boolean isRtl = textDir.isRtl(mChars, 0, len);
                bidiRequest = isRtl ? Layout.DIR_REQUEST_RTL : Layout.DIR_REQUEST_LTR;
            } //End block
            mDir = AndroidBidi.bidi(bidiRequest, mChars, mLevels, len, false);
            mEasy = false;
        } //End block
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:37.024 -0400", hash_original_method = "DC7A3D7065A333C10C0F305EED7320B6", hash_generated_method = "C3B83D8FFFF1E7C42064B284981EEDA6")
     float addStyleRun(TextPaint paint, int len, Paint.FontMetricsInt fm) {
        addTaint(fm.getTaint());
        addTaint(paint.getTaint());
        if(fm != null)        
        {
            paint.getFontMetricsInt(fm);
        } //End block
        int p = mPos;
        mPos = p + len;
        if(mEasy)        
        {
            int flags = mDir == Layout.DIR_LEFT_TO_RIGHT
                ? Canvas.DIRECTION_LTR : Canvas.DIRECTION_RTL;
            float var90FC068EE216B039F3FF8B2A9C039344_1784920675 = (paint.getTextRunAdvances(mChars, p, len, p, len, flags, mWidths, p));
                        float var546ADE640B6EDFBC8A086EF31347E768_951193088 = getTaintFloat();
            return var546ADE640B6EDFBC8A086EF31347E768_951193088;
        } //End block
        float totalAdvance = 0;
        int level = mLevels[p];
for(int q = p, i = p + 1, e = p + len;;++i)
        {
            if(i == e || mLevels[i] != level)            
            {
                int flags = (level & 0x1) == 0 ? Canvas.DIRECTION_LTR : Canvas.DIRECTION_RTL;
                totalAdvance +=
                        paint.getTextRunAdvances(mChars, q, i - q, q, i - q, flags, mWidths, q);
                if(i == e)                
                {
                    break;
                } //End block
                q = i;
                level = mLevels[i];
            } //End block
        } //End block
        float var99D044E1E151D602F35AA00A79C5FE29_1988955253 = (totalAdvance);
                float var546ADE640B6EDFBC8A086EF31347E768_1814906231 = getTaintFloat();
        return var546ADE640B6EDFBC8A086EF31347E768_1814906231;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:37.028 -0400", hash_original_method = "18B04B5B33F859850D856F2E2DC299C7", hash_generated_method = "F2DC21615DA03B6114EC278AF3FDB786")
     float addStyleRun(TextPaint paint, MetricAffectingSpan[] spans, int len,
            Paint.FontMetricsInt fm) {
        addTaint(fm.getTaint());
        addTaint(spans[0].getTaint());
        addTaint(paint.getTaint());
        TextPaint workPaint = mWorkPaint;
        workPaint.set(paint);
        workPaint.baselineShift = 0;
        ReplacementSpan replacement = null;
for(int i = 0;i < spans.length;i++)
        {
            MetricAffectingSpan span = spans[i];
            if(span instanceof ReplacementSpan)            
            {
                replacement = (ReplacementSpan)span;
            } //End block
            else
            {
                span.updateMeasureState(workPaint);
            } //End block
        } //End block
        float wid;
        if(replacement == null)        
        {
            wid = addStyleRun(workPaint, len, fm);
        } //End block
        else
        {
            wid = replacement.getSize(workPaint, mText, mTextStart + mPos,
                    mTextStart + mPos + len, fm);
            float[] w = mWidths;
            w[mPos] = wid;
for(int i = mPos + 1, e = mPos + len;i < e;i++)
            w[i] = 0;
            mPos += len;
        } //End block
        if(fm != null)        
        {
            if(workPaint.baselineShift < 0)            
            {
                fm.ascent += workPaint.baselineShift;
                fm.top += workPaint.baselineShift;
            } //End block
            else
            {
                fm.descent += workPaint.baselineShift;
                fm.bottom += workPaint.baselineShift;
            } //End block
        } //End block
        float varDB98B762FFD7DD3877EEA94A2FC88EAD_1950070648 = (wid);
                float var546ADE640B6EDFBC8A086EF31347E768_689292489 = getTaintFloat();
        return var546ADE640B6EDFBC8A086EF31347E768_689292489;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
        @DSModeled(DSC.BAN)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:37.029 -0400", hash_original_method = "F30A282CEAB73A5948442153B9251096", hash_generated_method = "EB92270DCDD6170C708F0A1162E5A337")
     int breakText(int start, int limit, boolean forwards, float width) {
        addTaint(width);
        addTaint(forwards);
        addTaint(limit);
        addTaint(start);
        float[] w = mWidths;
        if(forwards)        
        {
for(int i = start;i < limit;++i)
            {
                if((width -= w[i]) < 0)                
                {
                    int var43AED58E1B0480E781AAD215D2C26C62_1749625522 = (i - start);
                                        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_699831795 = getTaintInt();
                    return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_699831795;
                } //End block
            } //End block
        } //End block
        else
        {
for(int i = limit;--i >= start;)
            {
                if((width -= w[i]) < 0)                
                {
                    int var8B57CACCFE41BB0F37C3B52D30506AA2_268472518 = (limit - i -1);
                                        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_681671308 = getTaintInt();
                    return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_681671308;
                } //End block
            } //End block
        } //End block
        int var48382D55091BF470717A51B5D8CFC1AC_1854201958 = (limit - start);
                int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_247382283 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_247382283;
        // ---------- Original Method ----------
        //float[] w = mWidths;
        //if (forwards) {
            //for (int i = start; i < limit; ++i) {
                //if ((width -= w[i]) < 0) {
                    //return i - start;
                //}
            //}
        //} else {
            //for (int i = limit; --i >= start;) {
                //if ((width -= w[i]) < 0) {
                    //return limit - i -1;
                //}
            //}
        //}
        //return limit - start;
    }

    
        @DSModeled(DSC.BAN)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:37.029 -0400", hash_original_method = "053843F92349BBB89263F41FED96E473", hash_generated_method = "587459D18EF608CF1E5DB3216EABF9EA")
     float measure(int start, int limit) {
        addTaint(limit);
        addTaint(start);
        float width = 0;
        float[] w = mWidths;
for(int i = start;i < limit;++i)
        {
            width += w[i];
        } //End block
        float varEAAE26A6FB20ED3EF54FB23BFA0B1FCC_1061593566 = (width);
                float var546ADE640B6EDFBC8A086EF31347E768_22728576 = getTaintFloat();
        return var546ADE640B6EDFBC8A086EF31347E768_22728576;
        // ---------- Original Method ----------
        //float width = 0;
        //float[] w = mWidths;
        //for (int i = start; i < limit; ++i) {
            //width += w[i];
        //}
        //return width;
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:37.029 -0400", hash_original_field = "6225589B7095A2A8B4D13D7070C07695", hash_generated_field = "761D2619615A389BF902F171CC86D6A4")

    private static final boolean localLOGV = false;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:37.029 -0400", hash_original_field = "FD588D0BA09E2DE573D6AB2267D28AEB", hash_generated_field = "6FA9B47DB08FC419C50F72FDCF40883C")

    private static final Object[] sLock = new Object[0];
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:37.029 -0400", hash_original_field = "9CC83DBD7EC6E0EE354732DB8357A7DA", hash_generated_field = "E84B170D94FAA90534173168110EF774")

    private static MeasuredText[] sCached = new MeasuredText[3];
}

