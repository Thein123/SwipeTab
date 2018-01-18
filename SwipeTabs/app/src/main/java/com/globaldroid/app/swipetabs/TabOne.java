package com.globaldroid.app.swipetabs;


        import android.support.v4.app.Fragment;
        import android.os.Bundle;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;


/**
 * Created by User on 1/14/2018.
 */
public class TabOne extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.activity_tab_1, container, false);

    }
}
