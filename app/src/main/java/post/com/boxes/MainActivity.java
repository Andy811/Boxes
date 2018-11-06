package post.com.boxes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.Collection;

public class MainActivity extends AppCompatActivity {
    EditText edLength;
    EditText edHeight;
    EditText edWidth;
  //  Box3: 23 / 14 / 13 (長/寬/高) cm
float l3 = 23f;
float w3 = 14f;
float h3 = 13f;
   // Box5: 39.5 / 27.5 / 23 (長/寬/高) cm
   float l5 = 39.5f;
    float w5 = 27.5f;
    float h5 = 23f;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
findViews();

    }
public void findViews(){
        edLength =   findViewById(R.id.ed_length);
edHeight = findViewById(R.id.ed_height);
edWidth = findViewById(R.id.ed_width);

    }
    public void check(View view){
      Intent intent = new Intent(this,ResultActivity.class);
        String h = edHeight.getText().toString();
        String w = edWidth.getText().toString();
        String l = edLength.getText().toString();
        float hf = Float.parseFloat(h);
        float wf = Float.parseFloat(w);
        float lf = Float.parseFloat(l);
        if(hf<=h3 && lf<=l3 && wf<=w3){
            startActivity(intent.putExtra("type","Box3"));
            startActivity(intent.putExtra("size","Dimention: 23/14/13/cm"));
            startActivity(intent.putExtra("price",65));
        } else if(h3<=hf && hf<=h5 && l3<=lf && lf<=l5 && w3<=wf && wf<=w5){
            startActivity(intent.putExtra("type","Box3"));
            startActivity(intent.putExtra("size","Dimention: 39.5/27.5/23/cm"));
            startActivity(intent.putExtra("price",90));
        }
    }
}
