package veronica.tungol.com.firstaidproject;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MainContent extends Fragment {

    View myView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.start_menu, container, false);


        Button next = myView.findViewById(R.id.treatment);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.content_frame, new MenuTreatment());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }

        });
        next = myView.findViewById(R.id.emergency);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.content_frame, new Emergency());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }

        });

        next = myView.findViewById(R.id.kit);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.content_frame, new FirstAidKit());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }

        });
        return myView;
    }




}