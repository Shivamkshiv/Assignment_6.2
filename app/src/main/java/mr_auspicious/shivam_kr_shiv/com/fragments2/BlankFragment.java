package mr_auspicious.shivam_kr_shiv.com.fragments2;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {

    int mIndex;


    public BlankFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(getArguments() != null){

            mIndex = getArguments().getInt(Items.POSITION,0);

        }
    }

    TextView textView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_blank, container, false);
        textView= (TextView) view.findViewById(R.id.txt);

        setDetails(mIndex);
        return view;
    }

    public void setDetails(int index){
        textView.setText(Items.details[index]);
    }



}
