package com.crystalviewpager.transformer;

import android.view.View;

import com.crystalviewpager.base.BaseTransformer;
import com.crystalviewpager.widgets.CrystalViewPager;

/**
 * Created by owais.ali on 7/31/2016.
 */
public class CubeOutTransformer extends BaseTransformer {

    public CubeOutTransformer(CrystalViewPager crystalViewPager) {
        super(crystalViewPager);
    }

    @Override
    protected void onTransform(View view, float position, int pageWidth, int pageHeight) {
        view.setPivotX(position < 0f ? pageWidth : 0f);
        view.setPivotY(view.getHeight() / 2);
        view.setRotationY(45f * position);
    }
}
