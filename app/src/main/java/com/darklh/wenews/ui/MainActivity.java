package com.darklh.wenews.ui;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import com.darklh.wenews.R;
import com.darklh.wenews.R2;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.darklh.wenews.R.id.drawer_layout;

public class MainActivity extends BaseActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    @BindView(R2.id.drawer_layout)
    DrawerLayout drawer;
    @BindView(R2.id.nav_view)
    NavigationView navigationView;
    @BindView(R2.id.toolbar)
    Toolbar toolbar;
    @BindView(R2.id.fab)
    FloatingActionButton fab;

    BaseFragment mCurrentFragment;
    WechatFragment mNewsFragment;
    GirlsFragment mPicFragment;
    JokeFragment mJokeFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        toolbar.setTitle("糗事百科");
        setSupportActionBar(toolbar);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.getMenu().findItem(R.id.nav_joke).setChecked(true);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "FuckYou", Snackbar.LENGTH_LONG)
                        .setAction("Fuck", null).show();
            }
        });

        mNewsFragment = WechatFragment.newInstance();
        mPicFragment = GirlsFragment.newInstance();
        mJokeFragment = JokeFragment.newInstance();
        mCurrentFragment = new BaseFragment();
        switchFragment(mJokeFragment);
    }

    private void switchFragment(BaseFragment fragment) {
        if (mCurrentFragment == null || fragment == null) {
            return;
        }
        if (mCurrentFragment != fragment) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            if (!fragment.isAdded()) {
                transaction.hide(mCurrentFragment).add(R.id.content_main, fragment, fragment.getClass().getSimpleName())
                        .show(fragment).commit();
            } else {
                transaction.hide(mCurrentFragment).show(fragment).commit();
            }
            mCurrentFragment = fragment;
        }
    }


    @Override
    public void onBackPressed() {
        drawer = (DrawerLayout) findViewById(drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.nav_joke:
                toolbar.setTitle("糗事百科");
                switchFragment(mJokeFragment);
                break;
            case R.id.nav_wechat:
                toolbar.setTitle("微信精选");
                switchFragment(mNewsFragment);
                break;
            case R.id.nav_img:
                toolbar.setTitle("美女图片");
                switchFragment(mPicFragment);
                break;
        }
        item.setChecked(true);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
