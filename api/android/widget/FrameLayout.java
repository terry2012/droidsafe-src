package android.widget;

// Droidsafe Imports
import droidsafe.annotations.*;
import java.util.ArrayList;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;





public class FrameLayout extends ViewGroup {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:59.829 -0400", hash_original_field = "1FCB44928A1025EC3CED7E7B3EF3CA14", hash_generated_field = "CB728A1909AFA591F1BDDDA61ED16AE9")

    @ViewDebug.ExportedProperty(category = "measurement") boolean mMeasureAllChildren = false;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:59.830 -0400", hash_original_field = "608C3DF594AB00F368FD836319FA63D9", hash_generated_field = "A72F2658D002524E6BC635CECCB7A486")

    @ViewDebug.ExportedProperty(category = "drawing") private Drawable mForeground;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:59.830 -0400", hash_original_field = "163DEF20C09AF3EFBF33581A095EFFFA", hash_generated_field = "953C36407EBD0C47819218A9CD301BFA")

    @ViewDebug.ExportedProperty(category = "padding") private int mForegroundPaddingLeft = 0;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:59.830 -0400", hash_original_field = "3E38F16ED2754CE9270D75FF554FFB91", hash_generated_field = "79EB2E4D0FF51658B0F50685CFDA1E31")

    @ViewDebug.ExportedProperty(category = "padding") private int mForegroundPaddingTop = 0;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:59.830 -0400", hash_original_field = "43D1A02A009450CA17A6DAAF2EC3A367", hash_generated_field = "41B6F60E8078397FAD791043A7BFAB92")

    @ViewDebug.ExportedProperty(category = "padding") private int mForegroundPaddingRight = 0;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:59.830 -0400", hash_original_field = "E2116DEE1EF56E95B28758C32371276E", hash_generated_field = "309B58BFECE3A3BF4BE0489CD3C93C7D")

    @ViewDebug.ExportedProperty(category = "padding") private int mForegroundPaddingBottom = 0;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:59.830 -0400", hash_original_field = "19D950E97D0D17ED8E5107FA45A5A3B0", hash_generated_field = "3B16C2D681BFC370000C0D459ADC9C55")

    private final Rect mSelfBounds = new Rect();
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:59.830 -0400", hash_original_field = "5DC2AE490540E20EED1B653091500A0D", hash_generated_field = "4286A209A554CAE5005A36CB62FE41EF")

    private final Rect mOverlayBounds = new Rect();
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:59.830 -0400", hash_original_field = "6FF555F85E4962DD94530BDC37E356B9", hash_generated_field = "59774B948EFD2881A9D01560DFF26466")

    @ViewDebug.ExportedProperty(category = "drawing") private int mForegroundGravity = Gravity.FILL;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:59.830 -0400", hash_original_field = "504607E01FB347D4A6F34C13ADE75485", hash_generated_field = "5A930F164A8718372DFF326C35C33BAD")

    @ViewDebug.ExportedProperty(category = "drawing") protected boolean mForegroundInPadding = true;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:59.830 -0400", hash_original_field = "2CFBC409048E72602D4793E5B8DE7094", hash_generated_field = "706D65F3F8C11FED0C0076CC57F566C1")

    boolean mForegroundBoundsChanged = false;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:59.830 -0400", hash_original_field = "B41FFA5B615CB946BED9B60A62509618", hash_generated_field = "FB43AE3265D5C9BEBAAE4EDDB542A554")

    private final ArrayList<View> mMatchParentChildren = new ArrayList<View>(1);
    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:59.830 -0400", hash_original_method = "C65968E2416D9A27DB8533C5F0C75B69", hash_generated_method = "DC88EE0252523A908E923E25C3B661EA")
    public  FrameLayout(Context context) {
        super(context);
        addTaint(context.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:59.831 -0400", hash_original_method = "874EEAD1D73BF9A0D133CBC5B921EDD8", hash_generated_method = "1B8CF2F14996F3785CD71026B8BEF3CD")
    public  FrameLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
        addTaint(attrs.getTaint());
        addTaint(context.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:59.832 -0400", hash_original_method = "CEC811F1E2979D1B9B78B672C02AD5D3", hash_generated_method = "2073ECAE65B5AABABA68C7A77F00F14C")
    public  FrameLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        addTaint(defStyle);
        addTaint(attrs.getTaint());
        addTaint(context.getTaint());
        TypedArray a = context.obtainStyledAttributes(attrs, com.android.internal.R.styleable.FrameLayout,
                    defStyle, 0);
        mForegroundGravity = a.getInt(
                com.android.internal.R.styleable.FrameLayout_foregroundGravity, mForegroundGravity);
        final Drawable d = a.getDrawable(com.android.internal.R.styleable.FrameLayout_foreground);
        if(d != null)        
        {
            setForeground(d);
        } //End block
        if(a.getBoolean(com.android.internal.R.styleable.FrameLayout_measureAllChildren, false))        
        {
            setMeasureAllChildren(true);
        } //End block
        mForegroundInPadding = a.getBoolean(
                com.android.internal.R.styleable.FrameLayout_foregroundInsidePadding, true);
        a.recycle();
        // ---------- Original Method ----------
        //TypedArray a = context.obtainStyledAttributes(attrs, com.android.internal.R.styleable.FrameLayout,
                    //defStyle, 0);
        //mForegroundGravity = a.getInt(
                //com.android.internal.R.styleable.FrameLayout_foregroundGravity, mForegroundGravity);
        //final Drawable d = a.getDrawable(com.android.internal.R.styleable.FrameLayout_foreground);
        //if (d != null) {
            //setForeground(d);
        //}
        //if (a.getBoolean(com.android.internal.R.styleable.FrameLayout_measureAllChildren, false)) {
            //setMeasureAllChildren(true);
        //}
        //mForegroundInPadding = a.getBoolean(
                //com.android.internal.R.styleable.FrameLayout_foregroundInsidePadding, true);
        //a.recycle();
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:59.833 -0400", hash_original_method = "8BC875BA00D5710711DB00A919CACCE0", hash_generated_method = "8570DEBC6BBC9B7E7388BA51A7FC4903")
    @android.view.RemotableViewMethod
    public void setForegroundGravity(int foregroundGravity) {
        if(mForegroundGravity != foregroundGravity)        
        {
            if((foregroundGravity & Gravity.RELATIVE_HORIZONTAL_GRAVITY_MASK) == 0)            
            {
                foregroundGravity |= Gravity.START;
            } //End block
            if((foregroundGravity & Gravity.VERTICAL_GRAVITY_MASK) == 0)            
            {
                foregroundGravity |= Gravity.TOP;
            } //End block
            mForegroundGravity = foregroundGravity;
            if(mForegroundGravity == Gravity.FILL && mForeground != null)            
            {
                Rect padding = new Rect();
                if(mForeground.getPadding(padding))                
                {
                    mForegroundPaddingLeft = padding.left;
                    mForegroundPaddingTop = padding.top;
                    mForegroundPaddingRight = padding.right;
                    mForegroundPaddingBottom = padding.bottom;
                } //End block
            } //End block
            else
            {
                mForegroundPaddingLeft = 0;
                mForegroundPaddingTop = 0;
                mForegroundPaddingRight = 0;
                mForegroundPaddingBottom = 0;
            } //End block
            requestLayout();
        } //End block
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:59.834 -0400", hash_original_method = "10BAAC6631BEDC803E3228221401304B", hash_generated_method = "2C251FA22528551C92936626D009E1DA")
    @Override
    protected boolean verifyDrawable(Drawable who) {
        addTaint(who.getTaint());
        boolean var951A779500AA67DD129C75FC4AA4D220_1402957175 = (super.verifyDrawable(who) || (who == mForeground));
                boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_479378144 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_479378144;
        // ---------- Original Method ----------
        //return super.verifyDrawable(who) || (who == mForeground);
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:59.834 -0400", hash_original_method = "583607554001D9F198CD54104E44B797", hash_generated_method = "8EDA60F19DAB82C3CE1D2E398B6D10D1")
    @Override
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        if(mForeground != null)        
        mForeground.jumpToCurrentState();
        // ---------- Original Method ----------
        //super.jumpDrawablesToCurrentState();
        //if (mForeground != null) mForeground.jumpToCurrentState();
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:59.835 -0400", hash_original_method = "D0BDA221075CF616F9E9A9FBE3F4B88A", hash_generated_method = "F17BE360A84203CFE2C1DE58AB49BFF6")
    @Override
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if(mForeground != null && mForeground.isStateful())        
        {
            mForeground.setState(getDrawableState());
        } //End block
        // ---------- Original Method ----------
        //super.drawableStateChanged();
        //if (mForeground != null && mForeground.isStateful()) {
            //mForeground.setState(getDrawableState());
        //}
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:59.835 -0400", hash_original_method = "988BCAE6A6E42EFDC25DEBC315DD1190", hash_generated_method = "97E3F4CA83CD5B84507232BA1EA5094A")
    @Override
    protected LayoutParams generateDefaultLayoutParams() {
LayoutParams var8649ACA5E03771F827BFE666D5C03EC1_1492557628 =         new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
        var8649ACA5E03771F827BFE666D5C03EC1_1492557628.addTaint(taint);
        return var8649ACA5E03771F827BFE666D5C03EC1_1492557628;
        // ---------- Original Method ----------
        //return new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:59.837 -0400", hash_original_method = "9754375AE3C405E0761F3FE1F1DE65D9", hash_generated_method = "6E5CA446AE5BE7AA3EA58B74AEC05145")
    public void setForeground(Drawable drawable) {
        if(mForeground != drawable)        
        {
            if(mForeground != null)            
            {
                mForeground.setCallback(null);
                unscheduleDrawable(mForeground);
            } //End block
            mForeground = drawable;
            mForegroundPaddingLeft = 0;
            mForegroundPaddingTop = 0;
            mForegroundPaddingRight = 0;
            mForegroundPaddingBottom = 0;
            if(drawable != null)            
            {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if(drawable.isStateful())                
                {
                    drawable.setState(getDrawableState());
                } //End block
                if(mForegroundGravity == Gravity.FILL)                
                {
                    Rect padding = new Rect();
                    if(drawable.getPadding(padding))                    
                    {
                        mForegroundPaddingLeft = padding.left;
                        mForegroundPaddingTop = padding.top;
                        mForegroundPaddingRight = padding.right;
                        mForegroundPaddingBottom = padding.bottom;
                    } //End block
                } //End block
            } //End block
            else
            {
                setWillNotDraw(true);
            } //End block
            requestLayout();
            invalidate();
        } //End block
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:59.837 -0400", hash_original_method = "8DDBBCB9F2E6942D000521EEF66C0D86", hash_generated_method = "E792068091113E2CF5AC3224EF464337")
    public Drawable getForeground() {
Drawable varE68730EA53E360629A53778795B047BD_1484468386 =         mForeground;
        varE68730EA53E360629A53778795B047BD_1484468386.addTaint(taint);
        return varE68730EA53E360629A53778795B047BD_1484468386;
        // ---------- Original Method ----------
        //return mForeground;
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:59.837 -0400", hash_original_method = "FF3A696BD56D74C1EF72BB71EC65ECEC", hash_generated_method = "3B848B6BB6DD5E62561117B22FD4A0F8")
    private int getPaddingLeftWithForeground() {
        int varDC0A3D7C1505A27B9E48C17AE34A1E81_606293913 = (mForegroundInPadding ? Math.max(mPaddingLeft, mForegroundPaddingLeft) :
            mPaddingLeft + mForegroundPaddingLeft);
                int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1448997829 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1448997829;
        // ---------- Original Method ----------
        //return mForegroundInPadding ? Math.max(mPaddingLeft, mForegroundPaddingLeft) :
            //mPaddingLeft + mForegroundPaddingLeft;
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:59.838 -0400", hash_original_method = "6F38D617A9DA11062600EF5C115E1518", hash_generated_method = "808275ECBCB643C1B21ED366DBBC1D18")
    private int getPaddingRightWithForeground() {
        int varB342987A4C294CA75C6949247823E4A8_764282444 = (mForegroundInPadding ? Math.max(mPaddingRight, mForegroundPaddingRight) :
            mPaddingRight + mForegroundPaddingRight);
                int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1088455481 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1088455481;
        // ---------- Original Method ----------
        //return mForegroundInPadding ? Math.max(mPaddingRight, mForegroundPaddingRight) :
            //mPaddingRight + mForegroundPaddingRight;
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:59.838 -0400", hash_original_method = "9A91E9D92D71EE5460C3A06ABC1FBD77", hash_generated_method = "0FD11F86F7A399038B15DDC02232FD95")
    private int getPaddingTopWithForeground() {
        int var746CA6AFF045068DF48405B11493A0EC_203595868 = (mForegroundInPadding ? Math.max(mPaddingTop, mForegroundPaddingTop) :
            mPaddingTop + mForegroundPaddingTop);
                int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_409830790 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_409830790;
        // ---------- Original Method ----------
        //return mForegroundInPadding ? Math.max(mPaddingTop, mForegroundPaddingTop) :
            //mPaddingTop + mForegroundPaddingTop;
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:59.838 -0400", hash_original_method = "6BA199CF08BDB4F9A10CECB43AC6A7C1", hash_generated_method = "5CE587B6DBFB59BB0A07C5328A588D04")
    private int getPaddingBottomWithForeground() {
        int varCAAEF7FF42994C83C26DE06A27165354_1404405162 = (mForegroundInPadding ? Math.max(mPaddingBottom, mForegroundPaddingBottom) :
            mPaddingBottom + mForegroundPaddingBottom);
                int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_2007208666 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_2007208666;
        // ---------- Original Method ----------
        //return mForegroundInPadding ? Math.max(mPaddingBottom, mForegroundPaddingBottom) :
            //mPaddingBottom + mForegroundPaddingBottom;
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:59.840 -0400", hash_original_method = "5535255FB97D5EBC35FC058E1C30F774", hash_generated_method = "A86B6B14E1E8108AF8E5DAC749487390")
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        addTaint(heightMeasureSpec);
        addTaint(widthMeasureSpec);
        int count = getChildCount();
        final boolean measureMatchParentChildren = MeasureSpec.getMode(widthMeasureSpec) != MeasureSpec.EXACTLY ||
                MeasureSpec.getMode(heightMeasureSpec) != MeasureSpec.EXACTLY;
        mMatchParentChildren.clear();
        int maxHeight = 0;
        int maxWidth = 0;
        int childState = 0;
for(int i = 0;i < count;i++)
        {
            final View child = getChildAt(i);
            if(mMeasureAllChildren || child.getVisibility() != GONE)            
            {
                measureChildWithMargins(child, widthMeasureSpec, 0, heightMeasureSpec, 0);
                final LayoutParams lp = (LayoutParams) child.getLayoutParams();
                maxWidth = Math.max(maxWidth,
                        child.getMeasuredWidth() + lp.leftMargin + lp.rightMargin);
                maxHeight = Math.max(maxHeight,
                        child.getMeasuredHeight() + lp.topMargin + lp.bottomMargin);
                childState = combineMeasuredStates(childState, child.getMeasuredState());
                if(measureMatchParentChildren)                
                {
                    if(lp.width == LayoutParams.MATCH_PARENT ||
                            lp.height == LayoutParams.MATCH_PARENT)                    
                    {
                        mMatchParentChildren.add(child);
                    } //End block
                } //End block
            } //End block
        } //End block
        maxWidth += getPaddingLeftWithForeground() + getPaddingRightWithForeground();
        maxHeight += getPaddingTopWithForeground() + getPaddingBottomWithForeground();
        maxHeight = Math.max(maxHeight, getSuggestedMinimumHeight());
        maxWidth = Math.max(maxWidth, getSuggestedMinimumWidth());
        final Drawable drawable = getForeground();
        if(drawable != null)        
        {
            maxHeight = Math.max(maxHeight, drawable.getMinimumHeight());
            maxWidth = Math.max(maxWidth, drawable.getMinimumWidth());
        } //End block
        setMeasuredDimension(resolveSizeAndState(maxWidth, widthMeasureSpec, childState),
                resolveSizeAndState(maxHeight, heightMeasureSpec,
                        childState << MEASURED_HEIGHT_STATE_SHIFT));
        count = mMatchParentChildren.size();
        if(count > 1)        
        {
for(int i = 0;i < count;i++)
            {
                final View child = mMatchParentChildren.get(i);
                final MarginLayoutParams lp = (MarginLayoutParams) child.getLayoutParams();
                int childWidthMeasureSpec;
                int childHeightMeasureSpec;
                if(lp.width == LayoutParams.MATCH_PARENT)                
                {
                    childWidthMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredWidth() -
                            getPaddingLeftWithForeground() - getPaddingRightWithForeground() -
                            lp.leftMargin - lp.rightMargin,
                            MeasureSpec.EXACTLY);
                } //End block
                else
                {
                    childWidthMeasureSpec = getChildMeasureSpec(widthMeasureSpec,
                            getPaddingLeftWithForeground() + getPaddingRightWithForeground() +
                            lp.leftMargin + lp.rightMargin,
                            lp.width);
                } //End block
                if(lp.height == LayoutParams.MATCH_PARENT)                
                {
                    childHeightMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredHeight() -
                            getPaddingTopWithForeground() - getPaddingBottomWithForeground() -
                            lp.topMargin - lp.bottomMargin,
                            MeasureSpec.EXACTLY);
                } //End block
                else
                {
                    childHeightMeasureSpec = getChildMeasureSpec(heightMeasureSpec,
                            getPaddingTopWithForeground() + getPaddingBottomWithForeground() +
                            lp.topMargin + lp.bottomMargin,
                            lp.height);
                } //End block
                child.measure(childWidthMeasureSpec, childHeightMeasureSpec);
            } //End block
        } //End block
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:59.843 -0400", hash_original_method = "E7FA69BF1895927226A22DFF32FA5B4F", hash_generated_method = "241241E8EDCC6472190CE814AECC67A7")
    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        addTaint(bottom);
        addTaint(right);
        addTaint(top);
        addTaint(left);
        addTaint(changed);
        final int count = getChildCount();
        final int parentLeft = getPaddingLeftWithForeground();
        final int parentRight = right - left - getPaddingRightWithForeground();
        final int parentTop = getPaddingTopWithForeground();
        final int parentBottom = bottom - top - getPaddingBottomWithForeground();
        mForegroundBoundsChanged = true;
for(int i = 0;i < count;i++)
        {
            final View child = getChildAt(i);
            if(child.getVisibility() != GONE)            
            {
                final LayoutParams lp = (LayoutParams) child.getLayoutParams();
                final int width = child.getMeasuredWidth();
                final int height = child.getMeasuredHeight();
                int childLeft;
                int childTop;
                int gravity = lp.gravity;
                if(gravity == -1)                
                {
                    gravity = DEFAULT_CHILD_GRAVITY;
                } //End block
                final int layoutDirection = getResolvedLayoutDirection();
                final int absoluteGravity = Gravity.getAbsoluteGravity(gravity, layoutDirection);
                final int verticalGravity = gravity & Gravity.VERTICAL_GRAVITY_MASK;
switch(absoluteGravity & Gravity.HORIZONTAL_GRAVITY_MASK){
                case Gravity.LEFT:
                childLeft = parentLeft + lp.leftMargin;
                break;
                case Gravity.CENTER_HORIZONTAL:
                childLeft = parentLeft + (parentRight - parentLeft - width) / 2 +
                        lp.leftMargin - lp.rightMargin;
                break;
                case Gravity.RIGHT:
                childLeft = parentRight - width - lp.rightMargin;
                break;
                default:
                childLeft = parentLeft + lp.leftMargin;
}switch(verticalGravity){
                case Gravity.TOP:
                childTop = parentTop + lp.topMargin;
                break;
                case Gravity.CENTER_VERTICAL:
                childTop = parentTop + (parentBottom - parentTop - height) / 2 +
                        lp.topMargin - lp.bottomMargin;
                break;
                case Gravity.BOTTOM:
                childTop = parentBottom - height - lp.bottomMargin;
                break;
                default:
                childTop = parentTop + lp.topMargin;
}                child.layout(childLeft, childTop, childLeft + width, childTop + height);
            } //End block
        } //End block
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:59.844 -0400", hash_original_method = "4AC6B20E904606B8A51AEBBB15006C72", hash_generated_method = "7767E99AE4CB590B0320CE4B1FF51910")
    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        addTaint(oldh);
        addTaint(oldw);
        addTaint(h);
        addTaint(w);
        super.onSizeChanged(w, h, oldw, oldh);
        mForegroundBoundsChanged = true;
        // ---------- Original Method ----------
        //super.onSizeChanged(w, h, oldw, oldh);
        //mForegroundBoundsChanged = true;
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:59.844 -0400", hash_original_method = "6D753914B55367AEDC866ACE8B2692D8", hash_generated_method = "089BB0A9028C503B0FF837CEEE2C9D1E")
    @Override
    public void draw(Canvas canvas) {
        addTaint(canvas.getTaint());
        super.draw(canvas);
        if(mForeground != null)        
        {
            final Drawable foreground = mForeground;
            if(mForegroundBoundsChanged)            
            {
                mForegroundBoundsChanged = false;
                final Rect selfBounds = mSelfBounds;
                final Rect overlayBounds = mOverlayBounds;
                final int w = mRight-mLeft;
                final int h = mBottom-mTop;
                if(mForegroundInPadding)                
                {
                    selfBounds.set(0, 0, w, h);
                } //End block
                else
                {
                    selfBounds.set(mPaddingLeft, mPaddingTop, w - mPaddingRight, h - mPaddingBottom);
                } //End block
                final int layoutDirection = getResolvedLayoutDirection();
                Gravity.apply(mForegroundGravity, foreground.getIntrinsicWidth(),
                        foreground.getIntrinsicHeight(), selfBounds, overlayBounds,
                        layoutDirection);
                foreground.setBounds(overlayBounds);
            } //End block
            foreground.draw(canvas);
        } //End block
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:59.844 -0400", hash_original_method = "89E57DF442BD7C3C4F7FCB93934115A6", hash_generated_method = "6289E6400ECA81B5B3E7DCE62E84FBFC")
    @Override
    public boolean gatherTransparentRegion(Region region) {
        addTaint(region.getTaint());
        boolean opaque = super.gatherTransparentRegion(region);
        if(region != null && mForeground != null)        
        {
            applyDrawableToTransparentRegion(mForeground, region);
        } //End block
        boolean var94619F8A70068B2591C2EED622525B0E_1063195770 = (opaque);
                boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1897455335 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1897455335;
        // ---------- Original Method ----------
        //boolean opaque = super.gatherTransparentRegion(region);
        //if (region != null && mForeground != null) {
            //applyDrawableToTransparentRegion(mForeground, region);
        //}
        //return opaque;
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:59.844 -0400", hash_original_method = "F157652BCC07DCD3C1A1E63F95BA7504", hash_generated_method = "35F4313BD098BAEC40FB26B8C2BFA441")
    @android.view.RemotableViewMethod
    public void setMeasureAllChildren(boolean measureAll) {
        mMeasureAllChildren = measureAll;
        // ---------- Original Method ----------
        //mMeasureAllChildren = measureAll;
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:59.844 -0400", hash_original_method = "E2FDB5CCBB08727222AD77E37CF74AF8", hash_generated_method = "608B0ECF0407DB19612FB648EC97AFBE")
    @Deprecated
    public boolean getConsiderGoneChildrenWhenMeasuring() {
        boolean var5D2755653F906AF2663AB1F6F8D9A244_1444441392 = (getMeasureAllChildren());
                boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_36801071 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_36801071;
        // ---------- Original Method ----------
        //return getMeasureAllChildren();
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:59.845 -0400", hash_original_method = "52ECFF8459DAA24A15017A3D3C6FE0BF", hash_generated_method = "D21B45810D2C87BB2D969423DAA4DCDD")
    public boolean getMeasureAllChildren() {
        boolean varBDF5B8EA1A766C674F3C6D79DF6608FD_493572289 = (mMeasureAllChildren);
                boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1646228111 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1646228111;
        // ---------- Original Method ----------
        //return mMeasureAllChildren;
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:59.845 -0400", hash_original_method = "A40DD32EC45E4EF4D9BB874732A909D0", hash_generated_method = "B98451733A5F4875B5D2476BF6FB8A8E")
    @Override
    public LayoutParams generateLayoutParams(AttributeSet attrs) {
        addTaint(attrs.getTaint());
LayoutParams varDE90F821DBD0395E0EC46F138F4E3BF6_474568709 =         new FrameLayout.LayoutParams(getContext(), attrs);
        varDE90F821DBD0395E0EC46F138F4E3BF6_474568709.addTaint(taint);
        return varDE90F821DBD0395E0EC46F138F4E3BF6_474568709;
        // ---------- Original Method ----------
        //return new FrameLayout.LayoutParams(getContext(), attrs);
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:59.845 -0400", hash_original_method = "9DA99B4E01A506E72BA59AF598A3C38D", hash_generated_method = "EFC55E6C39DDA4397D8AC7A9285318F5")
    @Override
    public boolean shouldDelayChildPressedState() {
        boolean var68934A3E9455FA72420237EB05902327_42992083 = (false);
                boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1910003464 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1910003464;
        // ---------- Original Method ----------
        //return false;
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:59.845 -0400", hash_original_method = "E5E3FCBA546B7CFE2F525BEFE910A396", hash_generated_method = "9915C9C018563FEC01C459CE483F0928")
    @Override
    protected boolean checkLayoutParams(ViewGroup.LayoutParams p) {
        addTaint(p.getTaint());
        boolean var440AF75A2CDC0C5127161CA01BB77E89_1161306075 = (p instanceof LayoutParams);
                boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1787182662 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1787182662;
        // ---------- Original Method ----------
        //return p instanceof LayoutParams;
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:59.845 -0400", hash_original_method = "B595E0482905B38051CD63239BB5F8BA", hash_generated_method = "F7F3CC123A7800AE7DFC7CE1D1A93E54")
    @Override
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p) {
        addTaint(p.getTaint());
ViewGroup.LayoutParams varB945D213E5036F8DDF9B40811234DF64_1082167668 =         new LayoutParams(p);
        varB945D213E5036F8DDF9B40811234DF64_1082167668.addTaint(taint);
        return varB945D213E5036F8DDF9B40811234DF64_1082167668;
        // ---------- Original Method ----------
        //return new LayoutParams(p);
    }

    
    public static class LayoutParams extends MarginLayoutParams {
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:59.845 -0400", hash_original_field = "CF0F2AF9EE62920A17A205053A2F0423", hash_generated_field = "5DA573F10ADDA42A543DD86752A07C7B")

        public int gravity = -1;
        
        @DSModeled(DSC.SAFE)
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:59.845 -0400", hash_original_method = "8477494D7C126F8EB5E8F09916E06813", hash_generated_method = "00DAAA2A1ED19683FA259B2A96ADDD5F")
        public  LayoutParams(Context c, AttributeSet attrs) {
            super(c, attrs);
            addTaint(attrs.getTaint());
            addTaint(c.getTaint());
            TypedArray a = c.obtainStyledAttributes(attrs, com.android.internal.R.styleable.FrameLayout_Layout);
            gravity = a.getInt(com.android.internal.R.styleable.FrameLayout_Layout_layout_gravity, -1);
            a.recycle();
            // ---------- Original Method ----------
            //TypedArray a = c.obtainStyledAttributes(attrs, com.android.internal.R.styleable.FrameLayout_Layout);
            //gravity = a.getInt(com.android.internal.R.styleable.FrameLayout_Layout_layout_gravity, -1);
            //a.recycle();
        }

        
        @DSModeled(DSC.SAFE)
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:59.845 -0400", hash_original_method = "B179862558DB9232A546423CE2E9C45B", hash_generated_method = "EBA00E8564DFBD29E7FBA11533DD8069")
        public  LayoutParams(int width, int height) {
            super(width, height);
            addTaint(height);
            addTaint(width);
            // ---------- Original Method ----------
        }

        
        @DSModeled(DSC.SAFE)
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:59.845 -0400", hash_original_method = "DAE5F643078D3DA273ACC6BEF5E44EF2", hash_generated_method = "27498D82F6D69AD0E938F26B275A02B5")
        public  LayoutParams(int width, int height, int gravity) {
            super(width, height);
            addTaint(height);
            addTaint(width);
            this.gravity = gravity;
            // ---------- Original Method ----------
            //this.gravity = gravity;
        }

        
        @DSModeled(DSC.SAFE)
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:59.845 -0400", hash_original_method = "E78B3F1574E2791FC4B55C9E6B90274C", hash_generated_method = "37A5DBEF9177864A03971A9D81D7D3EE")
        public  LayoutParams(ViewGroup.LayoutParams source) {
            super(source);
            addTaint(source.getTaint());
            // ---------- Original Method ----------
        }

        
        @DSModeled(DSC.SAFE)
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:59.846 -0400", hash_original_method = "600A366FF17B7D40DFA738E77A628E8F", hash_generated_method = "B2D13AC5BD03A134B95617DAFA8D7AF6")
        public  LayoutParams(ViewGroup.MarginLayoutParams source) {
            super(source);
            addTaint(source.getTaint());
            // ---------- Original Method ----------
        }

        
    }


    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:59.846 -0400", hash_original_field = "7B8936C6ACB113C10746D2FF6B47F698", hash_generated_field = "CA0D915EE28CB56486F6429E0B657866")

    private static final int DEFAULT_CHILD_GRAVITY = Gravity.TOP | Gravity.LEFT;
}

