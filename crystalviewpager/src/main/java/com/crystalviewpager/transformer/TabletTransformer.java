package com.crystalviewpager.transformer;

import android.view.View;

import com.crystalviewpager.base.BaseTransformer;
import com.crystalviewpager.widgets.CrystalViewPager;

/**
 * Created by owais.ali on 7/31/2016.
 */
public class TabletTransformer extends BaseTransformer {

    private static final int ROTATION = -90;

    public TabletTransformer(CrystalViewPager crystalViewPager) {
        super(crystalViewPager);
    }

    @Override
    protected void onTransform(View view, float position, int pageWidth, int pageHeight) {
        view.setPivotX((position < 0) ? 0 : pageWidth);
        view.setPivotY(pageHeight / 2);
        view.setRotationY(ROTATION * position);
        view.setTranslationX(pageWidth * -position);
    }
}
