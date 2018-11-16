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

public class MenuTreatment extends Fragment {

    View myView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.treatment_menu, container, false);
        Button next = myView.findViewById(R.id.bleeding);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.content_frame, new BleedingTreatment());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }

        });
        next = myView.findViewById(R.id.burns);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.content_frame, new BurnsTreatment());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }

        });

        next = myView.findViewById(R.id.cpr);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.content_frame, new CprTreatment());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }

        });
        next = myView.findViewById(R.id.fracture);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.content_frame, new FractureTreatment());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }

        });
        next = myView.findViewById(R.id.bite);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.content_frame, new InsectbiteTreatment());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }

        });
        next = myView.findViewById(R.id.scrapes);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.content_frame, new ScrapesTreatment());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }

        });
        next = myView.findViewById(R.id.sprain);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.content_frame, new SprainTreatment());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }

        });
        return myView;
    }
}