package com.example.g00nie.capstonecottonimages;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;


/**
 * A simple {@link Fragment} subclass.
 */
public class OrderFragment  extends Fragment {
//    private Boolean isFabOpen = false;
//    private FloatingActionButton fabApprove,fabDoNotApprove,fab;
//    private Animation fab_open,fab_close,rotate_forward,rotate_backward;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        FloatingActionButton fab = (FloatingActionButton) OrderFragment.findViewById(R.id.fab);
//        FloatingActionButton fabApprove = (FloatingActionButton) getView().findViewById(R.id.fabApprove);
//        FloatingActionButton fabDoNotApprove = (FloatingActionButton) getView().findViewById(R.id.fabDoNotApprove);
//
//        fab_open = AnimationUtils.loadAnimation(OrderFragment.this,R.anim.fab_open);
//        fab_open = AnimationUtils.loadAnimation(OrderFragment.this,R.anim.fab_close);
//
//
//        fabApprove.setOnClickListener(this);


    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_order, null);

//        FloatingActionButton fab = (FloatingActionButton) view.findViewById(R.id.fab);
//        FloatingActionButton fabApprove = (FloatingActionButton) view.findViewById(R.id.fabApprove);
//        FloatingActionButton fabDoNotApprove = (FloatingActionButton) view.findViewById(R.id.fabDoNotApprove);
//
//        fab_open = AnimationUtils.loadAnimation(OrderFragment.this,R.anim.fab_open);
//        fab_open = AnimationUtils.loadAnimation(OrderFragment.this,R.anim.fab_close);
//
//
//        fabApprove.setOnClickListener(this);
//
//
//

    }

//    @Override
//    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
//        super.onViewCreated(view, savedInstanceState);
//
////
////        FloatingActionButton fab = (FloatingActionButton) view.findViewById(R.id.fab);
////        FloatingActionButton fabApprove = (FloatingActionButton) view.findViewById(R.id.fabApprove);
////        FloatingActionButton fabDoNotApprove = (FloatingActionButton) view.findViewById(R.id.fabDoNotApprove);
////
////        fab_open = AnimationUtils.loadAnimation(OrderFragment.this,R.anim.fab_open);
////        fab_open = AnimationUtils.loadAnimation(OrderFragment.this,R.anim.fab_close);
////
////
////        fabApprove.setOnClickListener(OrderFragment.this);
//
//
//  }
//
//    public void onClick(View v) {
//        int id = v.getId();
//        switch (id){
//            case R.id.fab:
//
//                animateFAB();
//                break;
//            case R.id.fabApprove:
//
//                Log.d("user has Approved", "fabApprove");
//                break;
//            case R.id.fabDoNotApprove:
//
//                Log.d("user did not approve", "fabDoNotApprove");
//                break;
//        }
//    }
//
//    public void animateFAB(){
//
//        if(isFabOpen){
//
//            fabApprove.startAnimation(fab_close);
//            fabDoNotApprove.startAnimation(fab_close);
//            fabApprove.setClickable(false);
//            fabDoNotApprove.setClickable(false);
//            isFabOpen = false;
//            Log.d("Raj", "close");
//
//        } else {
//
//            fabApprove.startAnimation(fab_open);
//            fabDoNotApprove.startAnimation(fab_open);
//            fabApprove.setClickable(true);
//            fabDoNotApprove.setClickable(true);
//            isFabOpen = true;
//            Log.d("Raj","open");
//
//        }
//    }
}

