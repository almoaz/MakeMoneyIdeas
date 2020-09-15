package com.example.makemoneyideas;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.material.navigation.NavigationView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    DrawerLayout MainLayout;
    NavigationView navigationView;
    Toolbar mToolBer;
    ImageView ShareBtn;
    private RewardedAd rewardedAd;
    private InterstitialAd mInterstitialAd;
    ActionBarDrawerToggle actionBarDrawerToggle;
    RelativeLayout relativeLayout1,relativeLayout2,relativeLayout3,relativeLayout4,relativeLayout5,relativeLayout6,relativeLayout7,relativeLayout8,relativeLayout9,relativeLayout10,relativeLayout11,relativeLayout12,relativeLayout13,relativeLayout14,relativeLayout15,relativeLayout16,relativeLayout17,relativeLayout18,relativeLayout19;
    LinearLayout linearLayout1,linearLayout2,linearLayout3,linearLayout4,linearLayout5,linearLayout6,linearLayout7,linearLayout8,linearLayout9,linearLayout10,linearLayout11,linearLayout12,linearLayout13,linearLayout14,linearLayout15,linearLayout16,linearLayout17,linearLayout18,linearLayout19,linearLayout20,linearLayout21,linearLayout22,linearLayout23;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolBer = findViewById(R.id.main_page_toolbar);




        //--- Apps share --//
        ShareBtn = findViewById(R.id.application_share_btn);
        ShareBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT,"https://play.google.com/store/apps/details?id=com.example.makemoneyideas");
                startActivity(Intent.createChooser(intent,"Share Application Link"));
            }
        });

        //////------


        rewardedAd = new RewardedAd(this,
                "ca-app-pub-3940256099942544/5224354917");

        RewardedAdLoadCallback adLoadCallback = new RewardedAdLoadCallback() {
            @Override
            public void onRewardedAdLoaded() {

                //Toast.makeText(MainActivity.this,"Add load",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onRewardedAdFailedToLoad(int errorCode) {
                //Toast.makeText(MainActivity.this,"Add load failed",Toast.LENGTH_SHORT).show();
            }
        };
        rewardedAd.loadAd(new AdRequest.Builder().build(), adLoadCallback);



        prepaperAD();


        /////////////////------ Navigation start

        MainLayout = findViewById(R.id.main_layout);
        navigationView = findViewById(R.id.main_view);
        actionBarDrawerToggle = new ActionBarDrawerToggle(MainActivity.this,MainLayout,mToolBer,R.string.navigation_open,R.string.navigation_close);
        MainLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();


        View navView = navigationView.inflateHeaderView(R.layout.navigation_header);

        linearLayout1 = navView.findViewById(R.id.linear_layout1);
        linearLayout2 = navView.findViewById(R.id.linear_layout2);
        linearLayout3 = navView.findViewById(R.id.linear_layout3);
        linearLayout4 = navView.findViewById(R.id.linear_layout4);
        linearLayout5 = navView.findViewById(R.id.linear_layout5);
        linearLayout6 = navView.findViewById(R.id.linear_layout6);
        linearLayout7 = navView.findViewById(R.id.linear_layout7);
        linearLayout8 = navView.findViewById(R.id.linear_layout8);
        linearLayout9 = navView.findViewById(R.id.linear_layout9);
        linearLayout10 = navView.findViewById(R.id.linear_layout10);
        linearLayout11 = navView.findViewById(R.id.linear_layout11);
        linearLayout12 = navView.findViewById(R.id.linear_layout12);
        linearLayout13 = navView.findViewById(R.id.linear_layout13);
        linearLayout14 = navView.findViewById(R.id.linear_layout14);
        linearLayout15 = navView.findViewById(R.id.linear_layout15);
        linearLayout16 = navView.findViewById(R.id.linear_layout16);
        linearLayout17 = navView.findViewById(R.id.linear_layout17);
        linearLayout18 = navView.findViewById(R.id.linear_layout18);
        linearLayout19 = navView.findViewById(R.id.linear_layout19);
        linearLayout20 = navView.findViewById(R.id.linear_layout20);
        linearLayout21 = navView.findViewById(R.id.linear_layout21);
        linearLayout22 = navView.findViewById(R.id.linear_layout22);
        linearLayout23 = navView.findViewById(R.id.linear_layout23);

        LinearLayoutClickListener();

        //////////////////////------Navigation end



        relativeLayout1 = findViewById(R.id.relativeLayout1);
        relativeLayout2 = findViewById(R.id.relativeLayout2);
        relativeLayout3 = findViewById(R.id.relativeLayout3);
        relativeLayout4 = findViewById(R.id.relativeLayout4);
        relativeLayout5 = findViewById(R.id.relativeLayout5);
        relativeLayout6 = findViewById(R.id.relativeLayout6);
        relativeLayout7 = findViewById(R.id.relativeLayout7);
        relativeLayout8 = findViewById(R.id.relativeLayout8);
        relativeLayout9 = findViewById(R.id.relativeLayout9);
        relativeLayout10 = findViewById(R.id.relativeLayout10);
        relativeLayout11 = findViewById(R.id.relativeLayout11);
        relativeLayout12 = findViewById(R.id.relativeLayout12);
        relativeLayout13 = findViewById(R.id.relativeLayout13);
        relativeLayout14 = findViewById(R.id.relativeLayout14);
        relativeLayout15 = findViewById(R.id.relativeLayout15);
        relativeLayout16 = findViewById(R.id.relativeLayout16);
        relativeLayout17 = findViewById(R.id.relativeLayout17);
        relativeLayout18 = findViewById(R.id.relativeLayout18);
        relativeLayout19 = findViewById(R.id.relativeLayout19);




        RelativeLayoutClickListener();

    }




    private void RelativeLayoutClickListener()
    {
        relativeLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (rewardedAd.isLoaded()) {
                final Activity activityContext = MainActivity.this;
                RewardedAdCallback adCallback = new RewardedAdCallback() {
                    @Override
                    public void onRewardedAdOpened() {


                    }

                    @Override
                    public void onRewardedAdClosed() {

                        Item1();
                    }

                    @Override
                    public void onUserEarnedReward(@NonNull RewardItem reward) {
                        // User earned reward.
                    }

                    @Override
                    public void onRewardedAdFailedToShow(int errorCode) {
                        Item1();
                    }
                };
                rewardedAd.show(activityContext, adCallback);
            } else {
                Log.d("TAG", "The rewarded ad wasn't loaded yet.");
                Item1();
            }
            }
        });

        relativeLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (rewardedAd.isLoaded()) {
                    final Activity activityContext = MainActivity.this;
                    RewardedAdCallback adCallback = new RewardedAdCallback() {
                        @Override
                        public void onRewardedAdOpened() {


                        }

                        @Override
                        public void onRewardedAdClosed() {

                            Item2();
                        }

                        @Override
                        public void onUserEarnedReward(@NonNull RewardItem reward) {
                            // User earned reward.
                        }

                        @Override
                        public void onRewardedAdFailedToShow(int errorCode) {
                            Item2();
                        }
                    };
                    rewardedAd.show(activityContext, adCallback);
                } else {
                    Log.d("TAG", "The rewarded ad wasn't loaded yet.");
                    Item2();
                }
            }
        });

        relativeLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (rewardedAd.isLoaded()) {
                    final Activity activityContext = MainActivity.this;
                    RewardedAdCallback adCallback = new RewardedAdCallback() {
                        @Override
                        public void onRewardedAdOpened() {


                        }

                        @Override
                        public void onRewardedAdClosed() {

                            Item3();
                        }

                        @Override
                        public void onUserEarnedReward(@NonNull RewardItem reward) {
                            // User earned reward.
                        }

                        @Override
                        public void onRewardedAdFailedToShow(int errorCode) {
                            Item3();
                        }
                    };
                    rewardedAd.show(activityContext, adCallback);
                } else {
                    Log.d("TAG", "The rewarded ad wasn't loaded yet.");
                    Item3();
                }
            }
        });

        relativeLayout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (rewardedAd.isLoaded()) {
                    final Activity activityContext = MainActivity.this;
                    RewardedAdCallback adCallback = new RewardedAdCallback() {
                        @Override
                        public void onRewardedAdOpened() {


                        }

                        @Override
                        public void onRewardedAdClosed() {

                            Item4();
                        }

                        @Override
                        public void onUserEarnedReward(@NonNull RewardItem reward) {
                            // User earned reward.
                        }

                        @Override
                        public void onRewardedAdFailedToShow(int errorCode) {
                            Item4();
                        }
                    };
                    rewardedAd.show(activityContext, adCallback);
                } else {
                    Log.d("TAG", "The rewarded ad wasn't loaded yet.");
                    Item4();
                }
            }
        });

        relativeLayout5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (rewardedAd.isLoaded()) {
                    final Activity activityContext = MainActivity.this;
                    RewardedAdCallback adCallback = new RewardedAdCallback() {
                        @Override
                        public void onRewardedAdOpened() {


                        }

                        @Override
                        public void onRewardedAdClosed() {

                            Item5();
                        }

                        @Override
                        public void onUserEarnedReward(@NonNull RewardItem reward) {
                            // User earned reward.
                        }

                        @Override
                        public void onRewardedAdFailedToShow(int errorCode) {
                            Item5();
                        }
                    };
                    rewardedAd.show(activityContext, adCallback);
                } else {
                    Log.d("TAG", "The rewarded ad wasn't loaded yet.");
                    Item5();
                }
            }
        });

        relativeLayout6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (rewardedAd.isLoaded()) {
                    final Activity activityContext = MainActivity.this;
                    RewardedAdCallback adCallback = new RewardedAdCallback() {
                        @Override
                        public void onRewardedAdOpened() {


                        }

                        @Override
                        public void onRewardedAdClosed() {

                            Item6();
                        }

                        @Override
                        public void onUserEarnedReward(@NonNull RewardItem reward) {
                            // User earned reward.
                        }

                        @Override
                        public void onRewardedAdFailedToShow(int errorCode) {
                            Item6();
                        }
                    };
                    rewardedAd.show(activityContext, adCallback);
                } else {
                    Log.d("TAG", "The rewarded ad wasn't loaded yet.");
                    Item6();
                }
            }
        });

        relativeLayout7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (rewardedAd.isLoaded()) {
                    final Activity activityContext = MainActivity.this;
                    RewardedAdCallback adCallback = new RewardedAdCallback() {
                        @Override
                        public void onRewardedAdOpened() {


                        }

                        @Override
                        public void onRewardedAdClosed() {

                            Item7();
                        }

                        @Override
                        public void onUserEarnedReward(@NonNull RewardItem reward) {
                            // User earned reward.
                        }

                        @Override
                        public void onRewardedAdFailedToShow(int errorCode) {
                            Item7();
                        }
                    };
                    rewardedAd.show(activityContext, adCallback);
                } else {
                    Log.d("TAG", "The rewarded ad wasn't loaded yet.");
                    Item7();
                }
            }
        });

        relativeLayout8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (rewardedAd.isLoaded()) {
                    final Activity activityContext = MainActivity.this;
                    RewardedAdCallback adCallback = new RewardedAdCallback() {
                        @Override
                        public void onRewardedAdOpened() {


                        }

                        @Override
                        public void onRewardedAdClosed() {

                            Item8();
                        }

                        @Override
                        public void onUserEarnedReward(@NonNull RewardItem reward) {
                            // User earned reward.
                        }

                        @Override
                        public void onRewardedAdFailedToShow(int errorCode) {
                            Item8();
                        }
                    };
                    rewardedAd.show(activityContext, adCallback);
                } else {
                    Log.d("TAG", "The rewarded ad wasn't loaded yet.");
                    Item8();
                }
            }
        });

        relativeLayout9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (rewardedAd.isLoaded()) {
                    final Activity activityContext = MainActivity.this;
                    RewardedAdCallback adCallback = new RewardedAdCallback() {
                        @Override
                        public void onRewardedAdOpened() {


                        }

                        @Override
                        public void onRewardedAdClosed() {

                            Item9();
                        }

                        @Override
                        public void onUserEarnedReward(@NonNull RewardItem reward) {
                            // User earned reward.
                        }

                        @Override
                        public void onRewardedAdFailedToShow(int errorCode) {
                            Item9();
                        }
                    };
                    rewardedAd.show(activityContext, adCallback);
                } else {
                    Log.d("TAG", "The rewarded ad wasn't loaded yet.");
                    Item9();
                }
            }
        });

        relativeLayout10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (rewardedAd.isLoaded()) {
                    final Activity activityContext = MainActivity.this;
                    RewardedAdCallback adCallback = new RewardedAdCallback() {
                        @Override
                        public void onRewardedAdOpened() {


                        }

                        @Override
                        public void onRewardedAdClosed() {

                            Item10();
                        }

                        @Override
                        public void onUserEarnedReward(@NonNull RewardItem reward) {
                            // User earned reward.
                        }

                        @Override
                        public void onRewardedAdFailedToShow(int errorCode) {
                            Item10();
                        }
                    };
                    rewardedAd.show(activityContext, adCallback);
                } else {
                    Log.d("TAG", "The rewarded ad wasn't loaded yet.");
                    Item10();
                }
            }
        });

        relativeLayout11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (rewardedAd.isLoaded()) {
                    final Activity activityContext = MainActivity.this;
                    RewardedAdCallback adCallback = new RewardedAdCallback() {
                        @Override
                        public void onRewardedAdOpened() {


                        }

                        @Override
                        public void onRewardedAdClosed() {

                            Item11();
                        }

                        @Override
                        public void onUserEarnedReward(@NonNull RewardItem reward) {
                            // User earned reward.
                        }

                        @Override
                        public void onRewardedAdFailedToShow(int errorCode) {
                            Item11();
                        }
                    };
                    rewardedAd.show(activityContext, adCallback);
                } else {
                    Log.d("TAG", "The rewarded ad wasn't loaded yet.");
                    Item11();
                }
            }
        });

        relativeLayout12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (rewardedAd.isLoaded()) {
                    final Activity activityContext = MainActivity.this;
                    RewardedAdCallback adCallback = new RewardedAdCallback() {
                        @Override
                        public void onRewardedAdOpened() {


                        }

                        @Override
                        public void onRewardedAdClosed() {

                            Item12();
                        }

                        @Override
                        public void onUserEarnedReward(@NonNull RewardItem reward) {
                            // User earned reward.
                        }

                        @Override
                        public void onRewardedAdFailedToShow(int errorCode) {
                            Item12();
                        }
                    };
                    rewardedAd.show(activityContext, adCallback);
                } else {
                    Log.d("TAG", "The rewarded ad wasn't loaded yet.");
                    Item12();
                }
            }
        });

        relativeLayout13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (rewardedAd.isLoaded()) {
                    final Activity activityContext = MainActivity.this;
                    RewardedAdCallback adCallback = new RewardedAdCallback() {
                        @Override
                        public void onRewardedAdOpened() {


                        }

                        @Override
                        public void onRewardedAdClosed() {

                            Item13();
                        }

                        @Override
                        public void onUserEarnedReward(@NonNull RewardItem reward) {
                            // User earned reward.
                        }

                        @Override
                        public void onRewardedAdFailedToShow(int errorCode) {
                            Item13();
                        }
                    };
                    rewardedAd.show(activityContext, adCallback);
                } else {
                    Log.d("TAG", "The rewarded ad wasn't loaded yet.");
                    Item13();
                }
            }
        });

        relativeLayout14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (rewardedAd.isLoaded()) {
                    final Activity activityContext = MainActivity.this;
                    RewardedAdCallback adCallback = new RewardedAdCallback() {
                        @Override
                        public void onRewardedAdOpened() {


                        }

                        @Override
                        public void onRewardedAdClosed() {

                            Item14();
                        }

                        @Override
                        public void onUserEarnedReward(@NonNull RewardItem reward) {
                            // User earned reward.
                        }

                        @Override
                        public void onRewardedAdFailedToShow(int errorCode) {
                            Item14();
                        }
                    };
                    rewardedAd.show(activityContext, adCallback);
                } else {
                    Log.d("TAG", "The rewarded ad wasn't loaded yet.");
                    Item14();
                }
            }
        });

        relativeLayout15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (rewardedAd.isLoaded()) {
                    final Activity activityContext = MainActivity.this;
                    RewardedAdCallback adCallback = new RewardedAdCallback() {
                        @Override
                        public void onRewardedAdOpened() {


                        }

                        @Override
                        public void onRewardedAdClosed() {

                            Item15();
                        }

                        @Override
                        public void onUserEarnedReward(@NonNull RewardItem reward) {
                            // User earned reward.
                        }

                        @Override
                        public void onRewardedAdFailedToShow(int errorCode) {
                            Item15();
                        }
                    };
                    rewardedAd.show(activityContext, adCallback);
                } else {
                    Log.d("TAG", "The rewarded ad wasn't loaded yet.");
                    Item15();
                }
            }
        });

        relativeLayout16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (rewardedAd.isLoaded()) {
                    final Activity activityContext = MainActivity.this;
                    RewardedAdCallback adCallback = new RewardedAdCallback() {
                        @Override
                        public void onRewardedAdOpened() {


                        }

                        @Override
                        public void onRewardedAdClosed() {

                            Item16();
                        }

                        @Override
                        public void onUserEarnedReward(@NonNull RewardItem reward) {
                            // User earned reward.
                        }

                        @Override
                        public void onRewardedAdFailedToShow(int errorCode) {
                            Item16();
                        }
                    };
                    rewardedAd.show(activityContext, adCallback);
                } else {
                    Log.d("TAG", "The rewarded ad wasn't loaded yet.");
                    Item16();
                }
            }
        });

        relativeLayout17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (rewardedAd.isLoaded()) {
                    final Activity activityContext = MainActivity.this;
                    RewardedAdCallback adCallback = new RewardedAdCallback() {
                        @Override
                        public void onRewardedAdOpened() {


                        }

                        @Override
                        public void onRewardedAdClosed() {

                            Item17();
                        }

                        @Override
                        public void onUserEarnedReward(@NonNull RewardItem reward) {
                            // User earned reward.
                        }

                        @Override
                        public void onRewardedAdFailedToShow(int errorCode) {
                            Item17();
                        }
                    };
                    rewardedAd.show(activityContext, adCallback);
                } else {
                    Log.d("TAG", "The rewarded ad wasn't loaded yet.");
                    Item17();
                }
            }
        });

        relativeLayout18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (rewardedAd.isLoaded()) {
                    final Activity activityContext = MainActivity.this;
                    RewardedAdCallback adCallback = new RewardedAdCallback() {
                        @Override
                        public void onRewardedAdOpened() {


                        }

                        @Override
                        public void onRewardedAdClosed() {

                            Item18();
                        }

                        @Override
                        public void onUserEarnedReward(@NonNull RewardItem reward) {
                            // User earned reward.
                        }

                        @Override
                        public void onRewardedAdFailedToShow(int errorCode) {
                            Item18();
                        }
                    };
                    rewardedAd.show(activityContext, adCallback);
                } else {
                    Log.d("TAG", "The rewarded ad wasn't loaded yet.");
                    Item18();
                }
            }
        });

        relativeLayout19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (rewardedAd.isLoaded()) {
                    final Activity activityContext = MainActivity.this;
                    RewardedAdCallback adCallback = new RewardedAdCallback() {
                        @Override
                        public void onRewardedAdOpened() {


                        }

                        @Override
                        public void onRewardedAdClosed() {

                            Item19();
                        }

                        @Override
                        public void onUserEarnedReward(@NonNull RewardItem reward) {
                            // User earned reward.
                        }

                        @Override
                        public void onRewardedAdFailedToShow(int errorCode) {
                            Item19();
                        }
                    };
                    rewardedAd.show(activityContext, adCallback);
                } else {
                    Log.d("TAG", "The rewarded ad wasn't loaded yet.");
                    Item19();
                }
            }
        });

    }


    private void LinearLayoutClickListener()
    {
        linearLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (rewardedAd.isLoaded()) {
                    final Activity activityContext = MainActivity.this;
                    RewardedAdCallback adCallback = new RewardedAdCallback() {
                        @Override
                        public void onRewardedAdOpened() {


                        }

                        @Override
                        public void onRewardedAdClosed() {

                            Item1();
                        }

                        @Override
                        public void onUserEarnedReward(@NonNull RewardItem reward) {
                            // User earned reward.
                        }

                        @Override
                        public void onRewardedAdFailedToShow(int errorCode) {
                            Item1();
                        }
                    };
                    rewardedAd.show(activityContext, adCallback);
                } else {
                    Log.d("TAG", "The rewarded ad wasn't loaded yet.");
                    Item1();
                }
            }
        });

        linearLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (rewardedAd.isLoaded()) {
                    final Activity activityContext = MainActivity.this;
                    RewardedAdCallback adCallback = new RewardedAdCallback() {
                        @Override
                        public void onRewardedAdOpened() {


                        }

                        @Override
                        public void onRewardedAdClosed() {

                            Item2();
                        }

                        @Override
                        public void onUserEarnedReward(@NonNull RewardItem reward) {
                            // User earned reward.
                        }

                        @Override
                        public void onRewardedAdFailedToShow(int errorCode) {
                            Item2();
                        }
                    };
                    rewardedAd.show(activityContext, adCallback);
                } else {
                    Log.d("TAG", "The rewarded ad wasn't loaded yet.");
                    Item2();
                }
            }
        });

        linearLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (rewardedAd.isLoaded()) {
                    final Activity activityContext = MainActivity.this;
                    RewardedAdCallback adCallback = new RewardedAdCallback() {
                        @Override
                        public void onRewardedAdOpened() {


                        }

                        @Override
                        public void onRewardedAdClosed() {

                            Item3();
                        }

                        @Override
                        public void onUserEarnedReward(@NonNull RewardItem reward) {
                            // User earned reward.
                        }

                        @Override
                        public void onRewardedAdFailedToShow(int errorCode) {
                            Item3();
                        }
                    };
                    rewardedAd.show(activityContext, adCallback);
                } else {
                    Log.d("TAG", "The rewarded ad wasn't loaded yet.");
                    Item3();
                }
            }
        });

        linearLayout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (rewardedAd.isLoaded()) {
                    final Activity activityContext = MainActivity.this;
                    RewardedAdCallback adCallback = new RewardedAdCallback() {
                        @Override
                        public void onRewardedAdOpened() {


                        }

                        @Override
                        public void onRewardedAdClosed() {

                            Item4();
                        }

                        @Override
                        public void onUserEarnedReward(@NonNull RewardItem reward) {
                            // User earned reward.
                        }

                        @Override
                        public void onRewardedAdFailedToShow(int errorCode) {
                            Item4();
                        }
                    };
                    rewardedAd.show(activityContext, adCallback);
                } else {
                    Log.d("TAG", "The rewarded ad wasn't loaded yet.");
                    Item4();
                }
            }
        });

        linearLayout5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (rewardedAd.isLoaded()) {
                    final Activity activityContext = MainActivity.this;
                    RewardedAdCallback adCallback = new RewardedAdCallback() {
                        @Override
                        public void onRewardedAdOpened() {


                        }

                        @Override
                        public void onRewardedAdClosed() {

                            Item5();
                        }

                        @Override
                        public void onUserEarnedReward(@NonNull RewardItem reward) {
                            // User earned reward.
                        }

                        @Override
                        public void onRewardedAdFailedToShow(int errorCode) {
                            Item5();
                        }
                    };
                    rewardedAd.show(activityContext, adCallback);
                } else {
                    Log.d("TAG", "The rewarded ad wasn't loaded yet.");
                    Item5();
                }
            }
        });

        linearLayout6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (rewardedAd.isLoaded()) {
                    final Activity activityContext = MainActivity.this;
                    RewardedAdCallback adCallback = new RewardedAdCallback() {
                        @Override
                        public void onRewardedAdOpened() {


                        }

                        @Override
                        public void onRewardedAdClosed() {

                            Item6();
                        }

                        @Override
                        public void onUserEarnedReward(@NonNull RewardItem reward) {
                            // User earned reward.
                        }

                        @Override
                        public void onRewardedAdFailedToShow(int errorCode) {
                            Item6();
                        }
                    };
                    rewardedAd.show(activityContext, adCallback);
                } else {
                    Log.d("TAG", "The rewarded ad wasn't loaded yet.");
                    Item6();
                }
            }
        });

        linearLayout7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (rewardedAd.isLoaded()) {
                    final Activity activityContext = MainActivity.this;
                    RewardedAdCallback adCallback = new RewardedAdCallback() {
                        @Override
                        public void onRewardedAdOpened() {


                        }

                        @Override
                        public void onRewardedAdClosed() {

                            Item7();
                        }

                        @Override
                        public void onUserEarnedReward(@NonNull RewardItem reward) {
                            // User earned reward.
                        }

                        @Override
                        public void onRewardedAdFailedToShow(int errorCode) {
                            Item7();
                        }
                    };
                    rewardedAd.show(activityContext, adCallback);
                } else {
                    Log.d("TAG", "The rewarded ad wasn't loaded yet.");
                    Item7();
                }
            }
        });

        linearLayout8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (rewardedAd.isLoaded()) {
                    final Activity activityContext = MainActivity.this;
                    RewardedAdCallback adCallback = new RewardedAdCallback() {
                        @Override
                        public void onRewardedAdOpened() {


                        }

                        @Override
                        public void onRewardedAdClosed() {

                            Item8();
                        }

                        @Override
                        public void onUserEarnedReward(@NonNull RewardItem reward) {
                            // User earned reward.
                        }

                        @Override
                        public void onRewardedAdFailedToShow(int errorCode) {
                            Item8();
                        }
                    };
                    rewardedAd.show(activityContext, adCallback);
                } else {
                    Log.d("TAG", "The rewarded ad wasn't loaded yet.");
                    Item8();
                }
            }
        });

        linearLayout9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (rewardedAd.isLoaded()) {
                    final Activity activityContext = MainActivity.this;
                    RewardedAdCallback adCallback = new RewardedAdCallback() {
                        @Override
                        public void onRewardedAdOpened() {


                        }

                        @Override
                        public void onRewardedAdClosed() {

                            Item9();
                        }

                        @Override
                        public void onUserEarnedReward(@NonNull RewardItem reward) {
                            // User earned reward.
                        }

                        @Override
                        public void onRewardedAdFailedToShow(int errorCode) {
                            Item9();
                        }
                    };
                    rewardedAd.show(activityContext, adCallback);
                } else {
                    Log.d("TAG", "The rewarded ad wasn't loaded yet.");
                    Item9();
                }
            }
        });

        linearLayout10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (rewardedAd.isLoaded()) {
                    final Activity activityContext = MainActivity.this;
                    RewardedAdCallback adCallback = new RewardedAdCallback() {
                        @Override
                        public void onRewardedAdOpened() {


                        }

                        @Override
                        public void onRewardedAdClosed() {

                            Item10();
                        }

                        @Override
                        public void onUserEarnedReward(@NonNull RewardItem reward) {
                            // User earned reward.
                        }

                        @Override
                        public void onRewardedAdFailedToShow(int errorCode) {
                            Item10();
                        }
                    };
                    rewardedAd.show(activityContext, adCallback);
                } else {
                    Log.d("TAG", "The rewarded ad wasn't loaded yet.");
                    Item10();
                }
            }
        });

        linearLayout11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (rewardedAd.isLoaded()) {
                    final Activity activityContext = MainActivity.this;
                    RewardedAdCallback adCallback = new RewardedAdCallback() {
                        @Override
                        public void onRewardedAdOpened() {


                        }

                        @Override
                        public void onRewardedAdClosed() {

                            Item11();
                        }

                        @Override
                        public void onUserEarnedReward(@NonNull RewardItem reward) {
                            // User earned reward.
                        }

                        @Override
                        public void onRewardedAdFailedToShow(int errorCode) {
                            Item11();
                        }
                    };
                    rewardedAd.show(activityContext, adCallback);
                } else {
                    Log.d("TAG", "The rewarded ad wasn't loaded yet.");
                    Item11();
                }
            }
        });

        linearLayout12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (rewardedAd.isLoaded()) {
                    final Activity activityContext = MainActivity.this;
                    RewardedAdCallback adCallback = new RewardedAdCallback() {
                        @Override
                        public void onRewardedAdOpened() {


                        }

                        @Override
                        public void onRewardedAdClosed() {

                            Item12();
                        }

                        @Override
                        public void onUserEarnedReward(@NonNull RewardItem reward) {
                            // User earned reward.
                        }

                        @Override
                        public void onRewardedAdFailedToShow(int errorCode) {
                            Item12();
                        }
                    };
                    rewardedAd.show(activityContext, adCallback);
                } else {
                    Log.d("TAG", "The rewarded ad wasn't loaded yet.");
                    Item12();
                }
            }
        });

        linearLayout13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (rewardedAd.isLoaded()) {
                    final Activity activityContext = MainActivity.this;
                    RewardedAdCallback adCallback = new RewardedAdCallback() {
                        @Override
                        public void onRewardedAdOpened() {


                        }

                        @Override
                        public void onRewardedAdClosed() {

                            Item13();
                        }

                        @Override
                        public void onUserEarnedReward(@NonNull RewardItem reward) {
                            // User earned reward.
                        }

                        @Override
                        public void onRewardedAdFailedToShow(int errorCode) {
                            Item13();
                        }
                    };
                    rewardedAd.show(activityContext, adCallback);
                } else {
                    Log.d("TAG", "The rewarded ad wasn't loaded yet.");
                    Item13();
                }
            }
        });

        linearLayout14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (rewardedAd.isLoaded()) {
                    final Activity activityContext = MainActivity.this;
                    RewardedAdCallback adCallback = new RewardedAdCallback() {
                        @Override
                        public void onRewardedAdOpened() {


                        }

                        @Override
                        public void onRewardedAdClosed() {

                            Item14();
                        }

                        @Override
                        public void onUserEarnedReward(@NonNull RewardItem reward) {
                            // User earned reward.
                        }

                        @Override
                        public void onRewardedAdFailedToShow(int errorCode) {
                            Item14();
                        }
                    };
                    rewardedAd.show(activityContext, adCallback);
                } else {
                    Log.d("TAG", "The rewarded ad wasn't loaded yet.");
                    Item14();
                }
            }
        });

        linearLayout15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (rewardedAd.isLoaded()) {
                    final Activity activityContext = MainActivity.this;
                    RewardedAdCallback adCallback = new RewardedAdCallback() {
                        @Override
                        public void onRewardedAdOpened() {


                        }

                        @Override
                        public void onRewardedAdClosed() {

                            Item15();
                        }

                        @Override
                        public void onUserEarnedReward(@NonNull RewardItem reward) {
                            // User earned reward.
                        }

                        @Override
                        public void onRewardedAdFailedToShow(int errorCode) {
                            Item15();
                        }
                    };
                    rewardedAd.show(activityContext, adCallback);
                } else {
                    Log.d("TAG", "The rewarded ad wasn't loaded yet.");
                    Item15();
                }
            }
        });

        linearLayout16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (rewardedAd.isLoaded()) {
                    final Activity activityContext = MainActivity.this;
                    RewardedAdCallback adCallback = new RewardedAdCallback() {
                        @Override
                        public void onRewardedAdOpened() {


                        }

                        @Override
                        public void onRewardedAdClosed() {

                            Item16();
                        }

                        @Override
                        public void onUserEarnedReward(@NonNull RewardItem reward) {
                            // User earned reward.
                        }

                        @Override
                        public void onRewardedAdFailedToShow(int errorCode) {
                            Item16();
                        }
                    };
                    rewardedAd.show(activityContext, adCallback);
                } else {
                    Log.d("TAG", "The rewarded ad wasn't loaded yet.");
                    Item16();
                }
            }
        });
        linearLayout17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (rewardedAd.isLoaded()) {
                    final Activity activityContext = MainActivity.this;
                    RewardedAdCallback adCallback = new RewardedAdCallback() {
                        @Override
                        public void onRewardedAdOpened() {


                        }

                        @Override
                        public void onRewardedAdClosed() {

                            Item17();
                        }

                        @Override
                        public void onUserEarnedReward(@NonNull RewardItem reward) {
                            // User earned reward.
                        }

                        @Override
                        public void onRewardedAdFailedToShow(int errorCode) {
                            Item17();
                        }
                    };
                    rewardedAd.show(activityContext, adCallback);
                } else {
                    Log.d("TAG", "The rewarded ad wasn't loaded yet.");
                    Item17();
                }
            }
        });

        linearLayout18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (rewardedAd.isLoaded()) {
                    final Activity activityContext = MainActivity.this;
                    RewardedAdCallback adCallback = new RewardedAdCallback() {
                        @Override
                        public void onRewardedAdOpened() {


                        }

                        @Override
                        public void onRewardedAdClosed() {

                            Item18();
                        }

                        @Override
                        public void onUserEarnedReward(@NonNull RewardItem reward) {
                            // User earned reward.
                        }

                        @Override
                        public void onRewardedAdFailedToShow(int errorCode) {
                            Item18();
                        }
                    };
                    rewardedAd.show(activityContext, adCallback);
                } else {
                    Log.d("TAG", "The rewarded ad wasn't loaded yet.");
                    Item18();
                }
            }
        });

        linearLayout19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (rewardedAd.isLoaded()) {
                    final Activity activityContext = MainActivity.this;
                    RewardedAdCallback adCallback = new RewardedAdCallback() {
                        @Override
                        public void onRewardedAdOpened() {


                        }

                        @Override
                        public void onRewardedAdClosed() {

                            Item19();
                        }

                        @Override
                        public void onUserEarnedReward(@NonNull RewardItem reward) {
                            // User earned reward.
                        }

                        @Override
                        public void onRewardedAdFailedToShow(int errorCode) {
                            Item19();
                        }
                    };
                    rewardedAd.show(activityContext, adCallback);
                } else {
                    Log.d("TAG", "The rewarded ad wasn't loaded yet.");
                    Item19();
                }
            }
        });

        linearLayout20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                ConnectivityManager manager = (ConnectivityManager) getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo activeNetwork = Objects.requireNonNull(manager).getActiveNetworkInfo();

                final String uri = "https://play.google.com/store/apps/details?id=com.example.makemoneyideas";

                if (null!=activeNetwork)
                {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(uri));
                    startActivity(intent);
                }else
                {

                    final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setTitle("No internet");
                    builder.setMessage("Please check your internet connection, mobile data or wifi");
                    builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {

                            dialog.dismiss();

                        }
                    });

                    Dialog dialog = builder.create();
                    dialog.show();
                    dialog.setCanceledOnTouchOutside(false);
                    Objects.requireNonNull(dialog.getWindow()).setBackgroundDrawableResource(android.R.color.background_light);
                }
            }
        });

        linearLayout21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("name",getString(R.string.item21));
                intent.putExtra("item","item21");
                startActivity(intent);
            }
        });

        linearLayout22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("name",getString(R.string.item22));
                intent.putExtra("item","item22");
                startActivity(intent);
            }
        });

        linearLayout23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("name",getString(R.string.item23));
                intent.putExtra("item","item23");
                startActivity(intent);
            }
        });



    }

    public void prepaperAD()
    {
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
    }

    @Override
    public void onBackPressed() {
        if (mInterstitialAd.isLoaded())
        {
            mInterstitialAd.show();

            mInterstitialAd.setAdListener(new AdListener()
            {
                @Override
                public void onAdClosed() {
                    super.onAdClosed();
                    finish();
                }
            });
        }
        else
        {
            super.onBackPressed();
        }

    }


    private void Item1()
    {
        Intent intent = new Intent(MainActivity.this,InformationActivity.class);
        intent.putExtra("item","item1");
        intent.putExtra("name",getString(R.string.item1));
        startActivity(intent);
    }

    private void Item2()
    {
        Intent intent = new Intent(MainActivity.this,InformationActivity.class);
        intent.putExtra("item","item2");
        intent.putExtra("name",getString(R.string.item2));
        startActivity(intent);
    }

    private void Item3()
    {
        Intent intent = new Intent(MainActivity.this,InformationActivity.class);
        intent.putExtra("item","item3");
        intent.putExtra("name",getString(R.string.item3));
        startActivity(intent);
    }

    private void Item4()
    {
        Intent intent = new Intent(MainActivity.this,InformationActivity.class);
        intent.putExtra("item","item4");
        intent.putExtra("name",getString(R.string.item4));
        startActivity(intent);
    }

    private void Item5()
    {
        Intent intent = new Intent(MainActivity.this,InformationActivity.class);
        intent.putExtra("item","item5");
        intent.putExtra("name",getString(R.string.item5));
        startActivity(intent);
    }

    private void Item6()
    {
        Intent intent = new Intent(MainActivity.this,InformationActivity.class);
        intent.putExtra("item","item6");
        intent.putExtra("name",getString(R.string.item6));
        startActivity(intent);
    }

    private void Item7()
    {
        Intent intent = new Intent(MainActivity.this,InformationActivity.class);
        intent.putExtra("item","item7");
        intent.putExtra("name",getString(R.string.item7));
        startActivity(intent);
    }

    private void Item8()
    {
        Intent intent = new Intent(MainActivity.this,InformationActivity.class);
        intent.putExtra("item","item8");
        intent.putExtra("name",getString(R.string.item8));
        startActivity(intent);
    }

    private void Item9()
    {
        Intent intent = new Intent(MainActivity.this,InformationActivity.class);
        intent.putExtra("item","item9");
        intent.putExtra("name",getString(R.string.item9));
        startActivity(intent);
    }

    private void Item10()
    {
        Intent intent = new Intent(MainActivity.this,InformationActivity.class);
        intent.putExtra("item","item10");
        intent.putExtra("name",getString(R.string.item10));
        startActivity(intent);
    }

    private void Item11()
    {
        Intent intent = new Intent(MainActivity.this,InformationActivity.class);
        intent.putExtra("item","item11");
        intent.putExtra("name",getString(R.string.item11));
        startActivity(intent);
    }

    private void Item12()
    {
        Intent intent = new Intent(MainActivity.this,InformationActivity.class);
        intent.putExtra("item","item12");
        intent.putExtra("name",getString(R.string.item12));
        startActivity(intent);
    }

    private void Item13()
    {
        Intent intent = new Intent(MainActivity.this,InformationActivity.class);
        intent.putExtra("item","item13");
        intent.putExtra("name",getString(R.string.item13));
        startActivity(intent);
    }

    private void Item14()
    {
        Intent intent = new Intent(MainActivity.this,InformationActivity.class);
        intent.putExtra("item","item14");
        intent.putExtra("name",getString(R.string.item14));
        startActivity(intent);
    }

    private void Item15()
    {
        Intent intent = new Intent(MainActivity.this,InformationActivity.class);
        intent.putExtra("item","item15");
        intent.putExtra("name",getString(R.string.item15));
        startActivity(intent);
    }

    private void Item16()
    {
        Intent intent = new Intent(MainActivity.this,InformationActivity.class);
        intent.putExtra("item","item16");
        intent.putExtra("name",getString(R.string.item16));
        startActivity(intent);
    }

    private void Item17()
    {
        Intent intent = new Intent(MainActivity.this,InformationActivity.class);
        intent.putExtra("item","item17");
        intent.putExtra("name",getString(R.string.item17));
        startActivity(intent);
    }

    private void Item18()
    {
        Intent intent = new Intent(MainActivity.this,InformationActivity.class);
        intent.putExtra("item","item18");
        intent.putExtra("name",getString(R.string.item18));
        startActivity(intent);
    }

    private void Item19()
    {
        Intent intent = new Intent(MainActivity.this,InformationActivity.class);
        intent.putExtra("item","item19");
        intent.putExtra("name",getString(R.string.item19));
        startActivity(intent);
    }



}
