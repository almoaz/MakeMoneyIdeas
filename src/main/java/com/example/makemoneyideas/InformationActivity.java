package com.example.makemoneyideas;;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import java.util.Objects;

public class InformationActivity extends AppCompatActivity {

    Toolbar mToolbar;
    String ItemName, ItemNo;
    TextView itemName, TollBarName, Description1, Description2, Webview;
    ImageView backIcon;
    TextView itemDescription;
    LinearLayout linearLayout;
    RelativeLayout relativeLayout;
    AdView mAdView;
    private InterstitialAd mInterstitialAd;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        ItemName = Objects.requireNonNull(Objects.requireNonNull(getIntent().getExtras()).get("name")).toString();
        ItemNo = Objects.requireNonNull(getIntent().getExtras().get("item")).toString();

        mToolbar = findViewById(R.id.item_tool_bar);
        setSupportActionBar(mToolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle("");
        backIcon = findViewById(R.id.back_icon);

        backIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        TollBarName = findViewById(R.id.item_tool_bar_name);
        itemName = findViewById(R.id.item_name);
        itemDescription = findViewById(R.id.item_description);
        Description1 = findViewById(R.id.item_description1);
        Description2 = findViewById(R.id.item_description2);
        linearLayout = findViewById(R.id.hide_layout1);
        relativeLayout = findViewById(R.id.hide_layout2);
        Webview = findViewById(R.id.web_view);


        TollBarName.setText(ItemName);

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        //-- Method for Interstitial Ads --//
       prepaperAD();

        switch (ItemNo) {
            case "item1":
                relativeLayout.setVisibility(View.GONE);
                itemName.setText(ItemName);
                itemDescription.setText("Starting a blog and making money from it is child's play on the one hand, and a tough business on the other. It is child's play for those who enjoy living out on a blog and prefer to earn money with what they love.\n In blog business, almost every topic and niche can be monetized. Passive income and active money also come together here. On the one hand, with Evergreen topics that are well found on Google, a considerable passive additional income can be built up. On the other hand, brands and producers will come to you who want to work with you. They pay for their product for a report or give you free samples if only for writing about them.\n" +
                        "\n" +
                        "You can also earn passive income as an affiliate by linking to Amazon all the products you write about on your website.\n" +
                        "\n" +
                        "Part of creating value is building trust. Don't link things that aren't high quality, otherwise people won't trust your recommendations. The other part of attracting an audience is quality. It’s less important how often you post than how valuable your posts are. If you only have time for one post per month, this post should be written on the same date and in high quality every month.\n" +
                        "\n" +
                        "How To Make Money As An Affiliate: Affiliate marketing works well when discussing products on your blog. For an aquarium blog, we would link to everything that you have to buy, should or have tested for an aquarium. When readers click the link and buy that item (or other items they also buy), you will receive a percentage of the purchase price. The Amazon Affiliate Program is the best-known affiliate marketing program, but there are also others like eBay, Digistore, ClickBank or Rakuten.\n" +
                        "\n" +
                        "Google Adsense pays to publish ads on your blog. There are two ways to make money with Adsense. Impressions that earn you money for every 1,000 page views and clicks that earn you money when a visitor to your website clicks on an ad displayed.\n" +
                        "\n" +
                        "You can also sell information to your readers. For example, if you are writing for a travel site, you could write a number of city guides and ask people to download them.\n" +
                        "\n" +
                        "You can create courses and arrange access to them for a fee. Many bloggers sell courses on how to make money from blogging.\n");
                break;
            case "item2":
                relativeLayout.setVisibility(View.GONE);
                itemName.setText(ItemName);
                itemDescription.setText("An online shop can, if it is set up correctly, generate a passive income. Since almost everything from ordering goods to shipping can be automated, you can make passive money with the right setup and only have to invest a few hours of work.\n" +
                        "\n" +
                        "On the one hand, your own online shop is a simple thing, on the other hand it can be a challenge. On the one hand it depends on what you want to sell, on the other hand where. You have the option to choose from several existing platforms such as eBay, Etsy or Amazon or you can design your own shop without being dependent on the large platforms with Shopify\n");
                break;
            case "item3":
                relativeLayout.setVisibility(View.GONE);
                TollBarName.setText(ItemName);
                itemName.setText(ItemName);
                itemDescription.setText("Passive income thanks to YouTube\n" +
                        "We are in the golden years of YouTube, the growth is crazy and there is still enough space for everyone to make money here. There are not nearly as many videos as written articles on the Internet.\n" +
                        "Since there is less competition, it is easier to find your audience. Of course this is no accident. The reason is that it is more difficult to make a good video than to write an article for a blog, which in turn means less competition.\n" +
                        "However, once the videos have been created and the foundations for YouTube advertising revenue have been laid, nothing stands in the way of earning a passive income.\n");
                break;
            case "item4":
                relativeLayout.setVisibility(View.GONE);
                itemName.setText(ItemName);
                itemDescription.setText("If you know a place particularly well or know how to fix something or do something particularly well, if you do it the way you do, then you can write a guide for it. You can sell your guide as an e-book, offer it as a download on your website for a fee, or contact bloggers with similar content and ask whether they want to offer it as a paid download on their website (of course with commission).");
                break;
            case "item5":
                linearLayout.setVisibility(View.GONE);
                relativeLayout.setVisibility(View.VISIBLE);
                itemName.setText(ItemName);
                Description1.setText("If you like to take photos and also have the necessary equipment, this earning opportunity is made for you. Even professional photographers have discovered this option for themselves and are actively using it.\n");
                Description2.setText("The photos taken are placed on the Internet in a stock exchange for stock photos. Those interested can buy the photos there. You don't have to be a professional to succeed with this business model.\n" +
                        "If you do not have a camera but have a high-quality smartphone, you also have the necessary requirements.\n" +
                        "Some stock exchanges to choose from:\n" +
                        "* \tShutterstock\n" +
                        "* \tPhotosearch\n" +
                        "* \tAlamy\n" +
                        "* \tAdobe Stock\n" +
                        "* \tiStock\n" +
                        "On some exchanges, in addition to photos, videos or graphics can also be sold. The prospects of earning increase with the number of photos or videos published.\n");

                Webview.setText("https://www.instagram.com/p/B18lR0QIwMy/");

                final String uri = "https://www.instagram.com/p/B18lR0QIwMy/";
                Webview.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ConnectivityManager manager = (ConnectivityManager) getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                        NetworkInfo activeNetwork = Objects.requireNonNull(manager).getActiveNetworkInfo();

                        if (null != activeNetwork) {
                            Intent intent = new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(uri));
                            startActivity(intent);
                        } else {

                            final AlertDialog.Builder builder = new AlertDialog.Builder(InformationActivity.this);
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
                break;
            case "item6":
                relativeLayout.setVisibility(View.GONE);
                itemName.setText(ItemName);
                itemDescription.setText("If there is already a lot of start-up capital, it is worth investing the money profitably. Investments are one of the classic options for generating residual income. While overnight or fixed-term deposit accounts hardly permit any noteworthy interest formation, there are profitable alternatives, which, however, involve a greater risk.\n" +
                        "\n" +
                        "The risk can be minimized by choosing funds that include various securities. In the case of securities investments, passive income can be achieved through increases in value and dividend payments.\n" +
                        "\n" +
                        "However, losses in value are to be expected. Anyone who decides on this income opportunity should deal intensively with the topic in advance and be able to manage the securities account themselves via an online broker.\n" +
                        "\n" +
                        "Money can also be increased by lending to individuals. The contacts can be established via special online portals. There, investors lend loans at favorable interest rates. Since a credit default risk cannot be excluded, it makes sense to invest several small amounts.\n");
                break;
            case "item7":
                relativeLayout.setVisibility(View.GONE);
                itemName.setText(ItemName);
                itemDescription.setText("Affiliate marketing refers to niche sites. If products or services are linked in an article, the site operator receives a commission for this.\n" +
                        "\n" +
                        "Suitable partners can on networks such as:\n" +
                        "\n" +
                        "* \tTradeTracker\n" +
                        "* \tClickbank\n" +
                        "* \tWarriorplus\n" +
                        "* \tBelboon\n" +
                        "* \tSuperClix or\n" +
                        "* \tDigistore24\n" +
                        "* \tbeing found.\n" +
                        "\n" +
                        "For this source of income, you first need a website with a high click rate. Own blogs are well suited. Maybe you have a special hobby or you know a lot about one thing.\n" +
                        "\n" +
                        "Content should be produced regularly. This is to be written in a search engine-optimized manner. Keywords should appear in the article, which are frequently asked for.\n" +
                        "\n" +
                        "In order to make money with affiliate marketing, you should have knowledge of online marketing.\n");
                break;
            case "item8":
                relativeLayout.setVisibility(View.GONE);
                itemName.setText(ItemName);
                itemDescription.setText("Dropshipping offers the opportunity to become an online retailer without the need for a warehouse and not even seeing the goods. The products are delivered to customers through a wholesaler.\n" +
                        "No goods need to be purchased and stored. Therefore dropshipping can be implemented with little effort and investment.\n" +
                        "Dropshipping includes the following steps:\n" +
                        "* \tcreate a concept\n" +
                        "* \tFind wholesalers\n" +
                        "* \tTo conduct negotiations\n" +
                        "* \tTest products\n" +
                        "* \tBuild an online shop\n" +
                        "* \tMaintenance of the online shop\n" +
                        "* \tcustomer advisory\n" +
                        "* \tadvertising\n" +
                        "Portals such as Shopify can be used to promote the development of passive income. The way Amazon FBA works is similar. As a seller on the portal, you can offer products that are stored and shipped by Amazon. Amazon charges a fee for this, which pays for itself quickly with sufficient customers.\n");
                break;
            case "item9":
                relativeLayout.setVisibility(View.GONE);
                itemName.setText(ItemName);
                itemDescription.setText("You can make passive money by renting out real estate or by things that you borrow for a fee.\n" +
                        "Rent a room: When it comes to renting out a property, everyone always thinks of an entire house or apartment. You can also offer individual rooms on sites like Airbnb. Either to long-term tenants or people who only move in with you for a few nights.\n" +
                        "Rent your house with Airbnb: If you live in a popular location, in a big city or in a beautiful village, there is a chance that someone would like to stay in your house for a few days and will pay you for it! Airbnb connects people with rentable living space with those who are looking for accommodation.\n" +
                        "Rent out like a world champion: do you live near a popular stadium, race track or other places where major sporting events take place? Then you should definitely think about renting a little space if you can. \n" +
                        "If you do not have any space that you can rent but maybe a small patch of green, then you can possibly rent this space to campers who come with their own motorhome. \n");
                break;
            case "item10":
                relativeLayout.setVisibility(View.GONE);
                itemName.setText(ItemName);
                itemDescription.setText("If you wrote an eBook, why not create the content in a different format and then sell it? It's easy to do. Okay, the production of an audio book is a little more complex, but you can literally outsource the entire project to recording experts and speakers who can create it for you. Doing this way will avoid buying or renting the special equipment you need to record and format your audio files.\n");
                break;
            case "item11":
                relativeLayout.setVisibility(View.GONE);
                TollBarName.setText(ItemName);
                itemName.setText(ItemName);
                itemDescription.setText("Create a Facebook page on a narrow topic and fill it with content. Once you've built a community, you can, for example, post affiliate links that lead to products or services that your followers use.\n");
                break;
            case "item12":
                relativeLayout.setVisibility(View.GONE);
                itemName.setText(ItemName);
                itemDescription.setText("Rent billboards for residual income. \n" +
                        "Advertising makes you money. Why not place advertising on your car or house and charge a monthly fee for it? If you have a plot of land on a busy street, you can even place an advertising board here that brings in money * every month .\n" +
                        "Another alternative is to sell advertising space on your own website. There are various ways to do this.\n");
                break;
            case "item13":
                relativeLayout.setVisibility(View.GONE);
                itemName.setText(ItemName);
                itemDescription.setText("Got money for shopping? Yes, that's possible. So-called cashback * campaigns make this possible.\n" +
                        "\n" +
                        "You buy a product and send the receipt with a few details about the manufacturer and get your money back. But you don't only get money for shopping. There are providers who only pay money for the visitor to a local branch.\n");
                break;
            case "item14":
                relativeLayout.setVisibility(View.GONE);
                itemName.setText(ItemName);
                itemDescription.setText("Android Apps Develop with the Android SDK\n" +
                        "With the certain know-how, one or the other successful app can also be developed. Once online, this app is then available worldwide and can therefore generate monthly passive income. Quasi a passive income from advertising revenue and app sales.\n" +
                        "How to start the first steps in the field of app programming * I show in the article Android Apps Programming .\n" +
                        "Incidentally, the developer of Flappy Bird earned about $ 50,000 a day with his game. These are exceptions, of course, but you can also generate a decent amount with many small apps and games.\n");
                break;
            case "item15":
                relativeLayout.setVisibility(View.GONE);
                itemName.setText(ItemName);
                itemDescription.setText("No matter whether Bitcoin, Ethereum or Litecoin. Everyone is talking about cryptocurrencies * and a modern, trendy investment opportunity. The courses can rise or fall daily in the multi-digit range. As a speculative investment with quick results, cryptocurrencies * are definitely worth considering.\n" +
                        "Alternative investments in Bitcoin, Etherum and Co.\n" +
                        "The big boom in December, when Bitcoin broke the EUR 15,000 mark, is currently over. Nevertheless, nobody knows whether the next hype about a cryptocurrency will break out tomorrow and the value will go up again steeply. Cryptocurrencies are bought and sold via different online marketplaces at different fees.\n" +
                        "Cryptocurrencies are a purely speculative object, with huge leaps upwards but also downwards are possible.\n");
                break;
            case "item16":
                relativeLayout.setVisibility(View.GONE);
                itemName.setText(ItemName);
                itemDescription.setText("Example: Network Marketing\n" +
                        "Network marketingNetwork marketing, or network marketing, is a form of direct sales. Products are sold directly to the consumer. The sales representative also tries to find other sales people who sell the products themselves. In this way, he builds up a network of sales partners, from whose sales he also benefits. Network marketing is also known under the term multi-level marketing (MLM). It is a form of structural sales based on referral marketing.\n");
                break;
            case "item17":
                relativeLayout.setVisibility(View.GONE);
                itemName.setText(ItemName);
                itemDescription.setText("If you already own real estate, it can be very lucrative to equip the roofs with solar systems. You get money for the electricity generated. If the investment is paid off, you have a long-term passive income.\n");
                break;
            case "item18":
                relativeLayout.setVisibility(View.GONE);
                itemName.setText(ItemName);
                itemDescription.setText("Niche sites are websites on which various information is provided for a specific topic. If enough relevant questions for those interested in topics are answered with this knowledge, it is realistic to get many visitors to this page via Google. Since these are clearly interested in a specific topic or product, such sites are ideal for advertising and can thus generate a lucrative passive cash flow.\n");
                break;
            case "item19":
                relativeLayout.setVisibility(View.GONE);
                itemName.setText(ItemName);
                itemDescription.setText("The market for review sites in very lucrative areas is already completely overflowing, nobody needs the thousandth dating site comparison site or the like.\n" +
                        "What is interesting, however, are review videos on Youtube. You can describe your experiences for millions of products (e.g. from Amazon). If it sounds interesting to Dih, you should definitely get a good YouTube course, because without optimizing your videos for a good YouTube placement, this strategy will not work. You can combine the YouTube channel with a blog and generate passive income from Google & Youtube with the help of partner programs.");
                break;
        }

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
}
