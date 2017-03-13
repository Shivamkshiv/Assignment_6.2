package mr_auspicious.shivam_kr_shiv.com.fragments2;

import android.app.ListFragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;





public class ItemFragment extends ListFragment {



    private ListSelected mListener;

    public interface ListSelected { // creating the interface

        public void onItemSelected(int position); //abstract method
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof ListSelected) {
            mListener = (ListSelected) context; //instantiating the interface
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnListFragmentInteractionListener");
        }
    }



    @Override
    public void onActivityCreated( Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,Items.lists)); // Setting up the list adapter..
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_item_list, container, false);
        return v;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        mListener.onItemSelected(position); //list item position
    }
}
