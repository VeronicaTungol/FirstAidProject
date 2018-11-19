package veronica.tungol.com.firstaidproject;


import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.view.MenuItem;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FragmentManager fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.content_frame, new MainContent()).commit();

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }




    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        FragmentManager fragmentManager = getFragmentManager();

        if (id == R.id.nav_content_main) {
            fragmentManager.beginTransaction().replace(R.id.content_frame, new MainContent()).commit();
        } else if (id == R.id.nav_kit) {
            fragmentManager.beginTransaction().replace(R.id.content_frame, new FirstAidKit()).commit();
        } else if (id == R.id.nav_emergency) {
            fragmentManager.beginTransaction().replace(R.id.content_frame, new Emergency()).commit();
        } else if (id == R.id.nav_treatment) {
            fragmentManager.beginTransaction().replace(R.id.content_frame, new MenuTreatment()).commit();
        }  else if (id == R.id.nav_scrapes) {
            fragmentManager.beginTransaction().replace(R.id.content_frame, new ScrapesTreatment()).commit();
        } else if (id == R.id.nav_burns) {
            fragmentManager.beginTransaction().replace(R.id.content_frame, new BurnsTreatment()).commit();
        } else if (id == R.id.nav_CPR) {
            fragmentManager.beginTransaction().replace(R.id.content_frame, new CprTreatment()).commit();
        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}
