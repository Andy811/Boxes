package post.com.boxes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        String type = getIntent().getStringExtra("type");
        TextView tpresult = findViewById(R.id.type);
        tpresult.setText(type);

        String size = getIntent().getStringExtra("size");
        TextView siresult = findViewById(R.id.size);
        siresult.setText(size);

        String price = getIntent().getStringExtra("price");
        TextView prresult = findViewById(R.id.price);
        prresult.setText(price);


    }
}
