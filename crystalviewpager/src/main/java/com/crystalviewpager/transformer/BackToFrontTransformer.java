package com.crystalviewpager.transformer;

import android.view.View;

import com.crystalviewpager.base.BaseTransformer;
import com.crystalviewpager.widgets.CrystalViewPager;

/**
 * Created by owais.ali on 7/31/2016.
 */
public class BackToFrontTransformer extends BaseTransformer {

    private static final float MIN_SCALE = 0.7f;

    public BackToFrontTransformer(CrystalViewPager crystalViewPager) {
        super(crystalViewPager);
    }

    @Override
    protected void onTransform(View view, float position, int pageWidth, int pageHeight) {
        if (position >= 0) {

            float scaleFactor = Math.max(MIN_SCALE, 1 - position);

            float vertMargin = pageHeight * (1 - scaleFactor) / 2;
            float horzMargin = pageWidth * (1 - scaleFactor) / 2;

            view.setTranslationX(-horzMargin + vertMargin);

            view.setScaleX(scaleFactor);
            view.setScaleY(scaleFactor);
        }
    }
}
