package lypop.com.lypopconstraintlayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_dimensions_constraints);

//        final Button button01 = findViewById(R.id.button01);
//        findViewById(R.id.button02).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                button01.setVisibility(View.GONE);
//            }
//        });

    }

    boolean flag;

    public void change(View view) {
        TextView office = findViewById(R.id.office);
        TextView home = findViewById(R.id.home);

        if (flag) {
            office.setText("office");
            home.setText("home");
            flag = false;
        } else {
            office.setText("##########office");
            home.setText("home");
            flag = true;
        }
    }
}
