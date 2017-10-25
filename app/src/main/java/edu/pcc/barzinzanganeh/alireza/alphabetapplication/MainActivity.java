package edu.pcc.barzinzanganeh.alireza.alphabetapplication;

import android.app.FragmentManager;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.GridView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    GridView gridView;
    String[] letters = new String[] {
            "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O",
            "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    @BindView(R.id.moodButton) TextView mMoodButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mMoodButton.setOnClickListener(this);

        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/love_story_rough.ttf");
        gridView = (GridView) findViewById(R.id.baseGridView);
        gridView.setAdapter(new AlphabetAdapter(this, letters,typeface));


    }

    @Override
    public void onClick(View view) {
        FragmentManager fm = getFragmentManager();
        ReadyFragment moodDialogFragment = new ReadyFragment();
        moodDialogFragment.show(fm, "Sample Fragment");
    }
}
