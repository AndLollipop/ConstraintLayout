package lypop.com.lypopconstraintlayout;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class CircularPositionActivity extends AppCompatActivity {
    private ConstraintLayout constraintLayout;
    private ImageView button02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_circular_position);

        constraintLayout = findViewById(R.id.constraintLayout);
        button02 = findViewById(R.id.button02);
        findViewById(R.id.button01).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValueAnimator va = ValueAnimator.ofInt(0, 360);
                va.setDuration(1000);
                va.setRepeatCount(ValueAnimator.INFINITE);
                va.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(ValueAnimator animation) {
                        try {
                            Thread.sleep(30);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        int value = (int) animation.getAnimatedValue();
                        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) button02.getLayoutParams();
                        layoutParams.circleAngle = value;
                        button02.setLayoutParams(layoutParams);
                    }
                });
                va.start();
            }
        });


    }
}
