package mr_auspicious.shivam_kr_shiv.com.fragments2;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        int index = getIntent().getIntExtra(Items.POSITION,0); //Getting the int position from MainActivity class...

        BlankFragment blankFragment = new BlankFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(Items.POSITION,index);
        blankFragment.setArguments(bundle); // Setting the arguments to the fragment details...

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.layout_details,blankFragment);
        transaction.commit();


    }
}
