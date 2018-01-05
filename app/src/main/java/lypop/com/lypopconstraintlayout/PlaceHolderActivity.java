package lypop.com.lypopconstraintlayout;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.Placeholder;
import android.support.v7.app.AppCompatActivity;
import android.transition.TransitionManager;
import android.view.View;

public class PlaceHolderActivity extends AppCompatActivity {
    private Placeholder placeholder_action;
    private ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_placeholder);

        placeholder_action = findViewById(R.id.placeholder_action);
        constraintLayout = findViewById(R.id.constraintLayout);
        findViewById(R.id.kongjian).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TransitionManager.beginDelayedTransition(constraintLayout);
                placeholder_action.setContentId(v.getId());
            }
        });

        findViewById(R.id.qq).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TransitionManager.beginDelayedTransition(constraintLayout);
                placeholder_action.setContentId(v.getId());
            }
        });

        findViewById(R.id.tw).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TransitionManager.beginDelayedTransition(constraintLayout);
                placeholder_action.setContentId(v.getId());
            }
        });

        findViewById(R.id.wechat).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TransitionManager.beginDelayedTransition(constraintLayout);
                placeholder_action.setContentId(v.getId());
            }
        });
    }
}
