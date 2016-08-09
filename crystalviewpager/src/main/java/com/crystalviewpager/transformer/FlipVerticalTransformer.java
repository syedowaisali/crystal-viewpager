package com.crystalviewpager.transformer;

import android.view.View;

import com.crystalviewpager.base.BaseTransformer;
import com.crystalviewpager.widgets.CrystalViewPager;

/**
 * Created by owais.ali on 7/31/2016.
 */
public class FlipVerticalTransformer extends BaseTransformer {

    public FlipVerticalTransformer(CrystalViewPager crystalViewPager) {
        super(crystalViewPager);
    }

    @Override
    protected void onTransform(View view, float position, int pageWidth, int pageHeight) {

        final float rotation = 180f * position;

        view.setAlpha(rotation > 90f || rotation < -90f ? 0 : 1);
        view.setPivotX(pageWidth / 2);
        view.setPivotY(pageHeight / 2);
        view.setTranslationX(pageWidth * -position);
        view.setRotationX(rotation);
    }
}
