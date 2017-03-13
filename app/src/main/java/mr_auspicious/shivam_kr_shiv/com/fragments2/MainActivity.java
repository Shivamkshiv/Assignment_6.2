package mr_auspicious.shivam_kr_shiv.com.fragments2;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements ItemFragment.ListSelected {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void onItemSelected(int position) {

        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT){ //when the screen orientation is in portrait mode
            Intent intent = new Intent(MainActivity.this,DetailsActivity.class);
            intent.putExtra("position",position);
            startActivity(intent);
        }else if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){ //when the screen orientation is in landscape mode

            FragmentManager manager = getSupportFragmentManager();
            BlankFragment fragment = (BlankFragment) manager.findFragmentById(R.id.details);
            if(fragment != null){
                fragment.setDetails(position);
            }


        }
        
    }
}
