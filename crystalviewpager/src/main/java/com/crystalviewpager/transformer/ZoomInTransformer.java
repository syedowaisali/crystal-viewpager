package com.crystalviewpager.transformer;

import android.view.View;

import com.crystalviewpager.base.BaseTransformer;
import com.crystalviewpager.widgets.CrystalViewPager;

/**
 * Created by owais.ali on 7/31/2016.
 */
public class ZoomInTransformer extends BaseTransformer {

    public ZoomInTransformer(CrystalViewPager crystalViewPager) {
        super(crystalViewPager);
    }

    @Override
    protected void onTransform(View view, float position, int pageWidth, int pageHeight) {
        view.setPivotX(pageWidth / 2);
        view.setPivotY(pageHeight / 2);
        view.setScaleX(1 - Math.abs(position));
        view.setScaleY(1 - Math.abs(position));
        view.setTranslationX(pageWidth * -position);
    }
}
