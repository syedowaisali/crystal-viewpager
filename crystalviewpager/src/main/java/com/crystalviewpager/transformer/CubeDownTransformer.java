package com.crystalviewpager.transformer;

import android.view.View;

import com.crystalviewpager.base.BaseTransformer;
import com.crystalviewpager.widgets.CrystalViewPager;

/**
 * Created by owais.ali on 7/31/2016.
 */
public class CubeDownTransformer extends BaseTransformer {

    public CubeDownTransformer(CrystalViewPager crystalViewPager) {
        super(crystalViewPager);
    }

    @Override
    protected void onTransform(View view, float position, int pageWidth, int pageHeight) {
        view.setPivotX(pageWidth / 2);
        view.setTranslationX(pageWidth * -position);

        if(position <= 0){
            view.setPivotY(0);
            view.setRotationX(90f * position);
            view.setTranslationY(pageHeight * Math.abs(position));
        }
        else{
            view.setPivotY(pageHeight);
            view.setRotationX(90 * Math.abs(position));
            view.setTranslationY(-pageHeight * position);
        }

    }
}
