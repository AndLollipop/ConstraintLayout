package lypop.com.lypopconstraintlayout;

import android.os.Bundle;
import android.support.constraint.Group;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class GroupActivity extends AppCompatActivity {
    private Group group;
    private boolean flag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_group);

        group = findViewById(R.id.group);

        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag){
                    group.setVisibility(View.GONE);
                    flag = false;
                }else{
                    group.setVisibility(View.VISIBLE);
                    flag = true;
                }
            }
        });
    }
}
