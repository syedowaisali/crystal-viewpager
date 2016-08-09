package com.crystalviewpager.transformer;

import android.view.View;

import com.crystalviewpager.base.BaseTransformer;
import com.crystalviewpager.widgets.CrystalViewPager;

/**
 * Created by owais.ali on 7/31/2016.
 */
public class ParallaxPageTransformer extends BaseTransformer {

    private static final float FACTOR = 1.4f;

    public ParallaxPageTransformer(CrystalViewPager crystalViewPager) {
        super(crystalViewPager);
    }

    @Override
    protected void onTransform(View view, float position, int pageWidth, int pageHeight) {
        if(position >= 0){
            view.setTranslationX(-pageWidth / FACTOR * position);
        }
    }
}
