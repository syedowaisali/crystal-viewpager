package com.crystal.crystalviewpager.ui.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.ImageView;

import com.crystal.base.BaseFragment;
import com.crystal.crystalviewpager.R;

/**
 * Created by owais.ali on 7/28/2016.
 */
public class Page extends BaseFragment {

    private static Page page;

    @Override
    public int getLayout() {
        return R.layout.page;
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Bundle bundle = getArguments();
        ((ImageView) rootView.findViewById(R.id.photo)).setImageDrawable(ContextCompat.getDrawable(getContext(), bundle.getInt("photo_id")));
    }

    public static Page getInstance(final int photoId){
        if(page != null){
            return page;
        }

        final Bundle bundle = new Bundle();
        bundle.putInt("photo_id", photoId);

        final Page page = new Page();
        page.setArguments(bundle);

        return page;
    }
}
