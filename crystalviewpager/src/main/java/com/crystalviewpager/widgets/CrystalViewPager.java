package com.crystalviewpager.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;

import com.crystalviewpager.R;
import com.crystalviewpager.base.BaseTransformer;
import com.crystalviewpager.transformer.AccordionTransformer;
import com.crystalviewpager.transformer.BackToFrontTransformer;
import com.crystalviewpager.transformer.CubeDownTransformer;
import com.crystalviewpager.transformer.CubeOutTransformer;
import com.crystalviewpager.transformer.DepthPageTransformer;
import com.crystalviewpager.transformer.FlipHorizontalTransformer;
import com.crystalviewpager.transformer.FlipVerticalTransformer;
import com.crystalviewpager.transformer.FrontToBackTransformer;
import com.crystalviewpager.transformer.ParallaxPageTransformer;
import com.crystalviewpager.transformer.RotateDownTransformer;
import com.crystalviewpager.transformer.RotateUpTransformer;
import com.crystalviewpager.transformer.StackTransformer;
import com.crystalviewpager.transformer.TabletTransformer;
import com.crystalviewpager.transformer.ZoomInTransformer;
import com.crystalviewpager.transformer.ZoomOutSideTransformer;
import com.crystalviewpager.transformer.ZoomOutTransformer;

/**
 * Created by owais.ali on 7/28/2016.
 */
public class CrystalViewPager extends ViewPager {

    private static final int DEFAULT = 0;

    private BaseTransformer transformer;
    private int transition;

    public static final class Transition{
        public static final int DEFAULT = 0;
        public static final int FRONT_TO_BACK = 1;
        public static final int BACK_TO_FRONT = 2;
        public static final int CUBE_DOWN = 3;
        public static final int CUBE_OUT = 4;
        public static final int DEPTH_PAGE = 5;
        public static final int FLIP_HORIZONTAL = 6;
        public static final int FLIP_VERTICAL = 7;
        public static final int PARALLAX_PAGE = 8;
        public static final int ROTATE_DOWN = 9;
        public static final int ROTATE_UP = 10;
        public static final int STACK = 11;
        public static final int TABLET = 12;
        public static final int ZOOM_IN = 13;
        public static final int ZOOM_OUT = 14;
        public static final int ZOOM_OUT_SIDE = 15;
        public static final int ACCORDION = 16;
    }

    public CrystalViewPager(Context context) {
        this(context, null);
    }

    public CrystalViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);

        final TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.CrystalViewPager);
        try{
            transition  = getTransition(typedArray);
        }
        finally {
            typedArray.recycle();
        }

        init();
    }

    private void init(){
        updateTransformer();
    }

    public void setTransition(int transition){
        this.transition = transition;
        updateTransformer();
    }

    protected void updateTransformer(){
        switch (transition){
            case Transition.ACCORDION: transformer = new AccordionTransformer(this); break;
            case Transition.BACK_TO_FRONT: transformer = new BackToFrontTransformer(this); break;
            case Transition.CUBE_DOWN: transformer = new CubeDownTransformer(this); break;
            case Transition.CUBE_OUT: transformer = new CubeOutTransformer(this); break;
            case Transition.DEPTH_PAGE: transformer = new DepthPageTransformer(this); break;
            case Transition.FLIP_HORIZONTAL: transformer = new FlipHorizontalTransformer(this); break;
            case Transition.FLIP_VERTICAL: transformer = new FlipVerticalTransformer(this); break;
            case Transition.FRONT_TO_BACK: transformer = new FrontToBackTransformer(this); break;
            case Transition.PARALLAX_PAGE: transformer = new ParallaxPageTransformer(this); break;
            case Transition.ROTATE_DOWN: transformer = new RotateDownTransformer(this); break;
            case Transition.ROTATE_UP: transformer = new RotateUpTransformer(this); break;
            case Transition.STACK: transformer = new StackTransformer(this); break;
            case Transition.TABLET: transformer = new TabletTransformer(this); break;
            case Transition.ZOOM_IN: transformer = new ZoomInTransformer(this); break;
            case Transition.ZOOM_OUT_SIDE: transformer = new ZoomOutSideTransformer(this); break;
            case Transition.ZOOM_OUT: transformer = new ZoomOutTransformer(this); break;
            default: transformer = null; break;
        }

        if(getAdapter() != null){
            getAdapter().notifyDataSetChanged();
        }

        setPageTransformer(true, transformer);
    }

    protected int getTransition(final TypedArray typedArray){
        return typedArray.getInt(R.styleable.CrystalViewPager_ctl_vp_transition, DEFAULT);
    }
}
