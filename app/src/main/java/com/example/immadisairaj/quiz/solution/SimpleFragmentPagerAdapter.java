package com.example.immadisairaj.quiz.solution;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.immadisairaj.quiz.R;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public SimpleFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int i) {
        if (i == 0) {
            return new AnswersFragment();
        } else {
            return new QuestionsFragment();
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch(position) {
            case 0:
                return mContext.getString(R.string.answers);
            case 1:
                return mContext.getString(R.string.q_reference);
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}
