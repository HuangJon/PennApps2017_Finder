package apackage.pennapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Swipe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swipe);
    }

    public void yes(View view) {
        Intent intent = new Intent(this, Restaurant.class);
        //TODO: something to store the preferences
        //TODO: store the address of the resturant to be passed to maps
        //TODO: store phone number of resturant to call
        startActivity(intent);
    }
}
