package Publishing;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

import Entity.Event;

public class ActivityCard {
    
    public static CardView createCard(Context context, Event event){
        //card layout
        androidx.cardview.widget.CardView new_card = new androidx.cardview.widget.CardView(context) ;
        new_card.setCardElevation(dpToPx(2,context));
        new_card.setRadius(dpToPx(5,context));
        //new_card.setId(i) ;
        //need to set background color
        new_card.setCardBackgroundColor(Color.WHITE);
        //new_card.setCardBackgroundColor(12);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,dpToPx(173,context)) ;
        params.setMargins( dpToPx(30,context),dpToPx(15,context),dpToPx(30,context), dpToPx(0,context));
        new_card.setLayoutParams(params);

        //title text
        TextView activityName = new TextView(context) ;
        activityName.setTextColor(Color.BLUE);
        activityName.setText(event.getTitle()  );
        //need to set text color, font

        //Typeface face = Typeface.createFromAsset(getAssets(), "fonts/epimodem.ttf") ;
        LinearLayout.LayoutParams activityNameParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT) ;
        activityNameParams.setMargins(dpToPx(20,context),dpToPx(20,context),0,0);
        activityName.setLayoutParams(activityNameParams);
        activityName.setTypeface(Typeface.SANS_SERIF);
        new_card.addView(activityName) ;

        //switch
        // fix location
        Switch newSwitch = new Switch(context) ;
        LinearLayout.LayoutParams switchParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT) ;
        switchParams.setMargins(dpToPx(290,context), dpToPx(20,context), dpToPx(0,context), dpToPx(0,context));
        newSwitch.setLayoutParams(switchParams);
        new_card.addView(newSwitch);

        //description
        TextView description = new TextView(context) ;
        description.setText("Time : " + event.getTime() + "\nLocation : "+ event.getLocation() + "\nOrganizer : Detective conan\ncategory : " +event.getCategory());
        LinearLayout.LayoutParams descParams = new LinearLayout.LayoutParams(dpToPx(170,context), dpToPx(70,context)) ;
        descParams.setMargins(dpToPx(154,context), dpToPx(68,context), 0,0);
        description.setLayoutParams(descParams);
        new_card.addView(description) ;


        //Button
        Button button = new Button(context) ;
        button.setOnClickListener(null);
        button.setText("chat");
        LinearLayout.LayoutParams btnParams = new LinearLayout.LayoutParams(dpToPx(63,context), dpToPx(38,context)) ;
        btnParams.setMargins(dpToPx(220,context), dpToPx(13,context), 0 , 0 );
        button.setLayoutParams(btnParams);
        new_card.addView(button);




     return new_card ;
        
    }

    private static int dpToPx(int dp, Context mcontext) {
        float density = mcontext.getResources()
                .getDisplayMetrics()
                .density;
        return Math.round((float) dp * density);}
    }


