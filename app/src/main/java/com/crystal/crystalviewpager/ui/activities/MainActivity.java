package com.crystal.crystalviewpager.ui.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.crystal.base.BaseActivity;
import com.crystal.crystalviewpager.R;
import com.crystal.crystalviewpager.adapters.ListOptionsAdapter;
import com.crystal.crystalviewpager.adapters.PagerAdapter;
import com.crystal.crystalviewpager.models.TransitionModel;
import com.crystal.crystalviewpager.ui.fragments.Page;
import com.crystalviewpager.widgets.CrystalViewPager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity {

    private CrystalViewPager viewPager;
    private PagerAdapter pagerAdapter;

    @Override
    public int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void init(Bundle savedInstanceState) {
        super.init(savedInstanceState);

        setupViewPager();
        setUpOptions();

    }

    private void setupViewPager(){
        final List<Page> pages = new ArrayList<>(11);
        pages.add(Page.getInstance(R.drawable.a0));
        pages.add(Page.getInstance(R.drawable.a1));
        pages.add(Page.getInstance(R.drawable.a2));
        pages.add(Page.getInstance(R.drawable.a3));
        pages.add(Page.getInstance(R.drawable.a4));
        pages.add(Page.getInstance(R.drawable.a5));
        pages.add(Page.getInstance(R.drawable.a6));
        pages.add(Page.getInstance(R.drawable.a7));
        pages.add(Page.getInstance(R.drawable.a8));
        pages.add(Page.getInstance(R.drawable.a9));
        pages.add(Page.getInstance(R.drawable.a10));

        pagerAdapter = new PagerAdapter(getSupportFragmentManager(), pages);
        viewPager = getView(R.id.viewPager);
        viewPager.setAdapter(pagerAdapter);
    }

    private void setUpOptions(){
        final List<TransitionModel> transitions = new ArrayList<>();
        transitions.add(new TransitionModel().setTransitionId(CrystalViewPager.Transition.DEFAULT).setTransitionName("Default"));
        transitions.add(new TransitionModel().setTransitionId(CrystalViewPager.Transition.ACCORDION).setTransitionName("Accordion"));
        transitions.add(new TransitionModel().setTransitionId(CrystalViewPager.Transition.BACK_TO_FRONT).setTransitionName("Back To Front"));
        transitions.add(new TransitionModel().setTransitionId(CrystalViewPager.Transition.FRONT_TO_BACK).setTransitionName("Front To Back"));
        transitions.add(new TransitionModel().setTransitionId(CrystalViewPager.Transition.CUBE_DOWN).setTransitionName("Cube Down"));
        transitions.add(new TransitionModel().setTransitionId(CrystalViewPager.Transition.CUBE_OUT).setTransitionName("Cube Out"));
        transitions.add(new TransitionModel().setTransitionId(CrystalViewPager.Transition.DEPTH_PAGE).setTransitionName("Depth Page"));
        transitions.add(new TransitionModel().setTransitionId(CrystalViewPager.Transition.FLIP_HORIZONTAL).setTransitionName("Flip Horizontal"));
        transitions.add(new TransitionModel().setTransitionId(CrystalViewPager.Transition.FLIP_VERTICAL).setTransitionName("Flip Vertical"));
        transitions.add(new TransitionModel().setTransitionId(CrystalViewPager.Transition.PARALLAX_PAGE).setTransitionName("Parallax Page"));
        transitions.add(new TransitionModel().setTransitionId(CrystalViewPager.Transition.ROTATE_DOWN).setTransitionName("Rotate Down"));
        transitions.add(new TransitionModel().setTransitionId(CrystalViewPager.Transition.ROTATE_UP).setTransitionName("Rotate Up"));
        transitions.add(new TransitionModel().setTransitionId(CrystalViewPager.Transition.STACK).setTransitionName("Stack"));
        transitions.add(new TransitionModel().setTransitionId(CrystalViewPager.Transition.TABLET).setTransitionName("Tablet"));
        transitions.add(new TransitionModel().setTransitionId(CrystalViewPager.Transition.ZOOM_IN).setTransitionName("Zoom In"));
        transitions.add(new TransitionModel().setTransitionId(CrystalViewPager.Transition.ZOOM_OUT).setTransitionName("Zoom Out"));
        transitions.add(new TransitionModel().setTransitionId(CrystalViewPager.Transition.ZOOM_OUT_SIDE).setTransitionName("Zoom Out Side"));

        final ListOptionsAdapter adapter = new ListOptionsAdapter(this, transitions, R.layout.item);
        final ListView listView = getView(R.id.lvTransition);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                final int currentPage = viewPager.getCurrentItem();
                viewPager.setAdapter(null);
                viewPager.setAdapter(pagerAdapter);
                viewPager.setCurrentItem(currentPage);
                viewPager.setTransition(transitions.get(position).getTransitionId());
                pagerAdapter.notifyDataSetChanged();
            }
        });
    }
}
