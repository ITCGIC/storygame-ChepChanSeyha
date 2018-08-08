package gictitc.storygame.storygame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button bRomance, bActions, bHorror;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bRomance = findViewById(R.id.romance);
        bRomance.setOnClickListener(this);

        bActions = findViewById(R.id.actions);
        bActions.setOnClickListener(this);

        bHorror = findViewById(R.id.horror);
        bHorror.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if(view == bRomance){
            Intent intent = new Intent(this,Romance.class);
            startActivity(intent);
            finish();

        }

    }
}
