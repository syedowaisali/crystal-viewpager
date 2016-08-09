package com.crystal.crystalviewpager.adapters;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import com.crystal.base.BaseAdapter;
import com.crystal.crystalviewpager.R;
import com.crystal.crystalviewpager.models.TransitionModel;

import java.util.List;

/**
 * Created by owais.ali on 8/2/2016.
 */
public class ListOptionsAdapter extends BaseAdapter<TransitionModel> {

    public ListOptionsAdapter(Context context, List<TransitionModel> data, int resourceId) {
        super(context, data, resourceId);
    }

    @Override
    protected View getView(View view, int position) {
        final TransitionModel transition = get(position);
        ((TextView) view.findViewById(R.id.name)).setText(transition.getTransitionName());
        return view;
    }
}
