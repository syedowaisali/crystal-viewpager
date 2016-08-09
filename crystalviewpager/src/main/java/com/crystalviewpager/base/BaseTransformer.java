package com.crystalviewpager.base;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;

import com.crystalviewpager.widgets.CrystalViewPager;

/**
 * Created by owais.ali on 7/31/2016.
 */
public abstract class BaseTransformer implements ViewPager.PageTransformer {

    private final CrystalViewPager crystalViewPager;

    public BaseTransformer(CrystalViewPager crystalViewPager){
        this.crystalViewPager = crystalViewPager;
    }

    @Override
    public void transformPage(View view, float position) {
        if (position < -1) {
            /*view.setAlpha(1);
            view.setTranslationX(0);
            view.setScaleX(1);*/

        }
        else if (position <= 1) {
            onPreTransform(view, position, view.getWidth(), view.getHeight());
            onTransform(view, position, view.getWidth(), view.getHeight());
            onPostTransform(view, position, view.getWidth(), view.getHeight());
        } else {
            /*view.setAlpha(1);
            view.setTranslationX(0);
            view.setScaleX(1);*/
        }
    }

    public void draw(final Canvas canvas, final Paint paint){

    }

    protected CrystalViewPager getCrystalViewPager(){
        return this.crystalViewPager;
    }

    protected void onPreTransform(View view, float position, int pageWidth, int pageHeight){}

    protected void onPostTransform(View view, float position, int pageWidth, int pageHeight){}

    protected final void log(Object obj){
        Log.d("CRS=>", String.valueOf(obj));
    }

    protected abstract void onTransform(View view, float position, int pageWidth, int pageHeight);
}
