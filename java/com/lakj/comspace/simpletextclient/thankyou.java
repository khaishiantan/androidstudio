package com.lakj.comspace.simpletextclient;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.TextView;

public class thankyou extends Activity {




    @Override
    public void onBackPressed() {
    // do nothing.
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thankyou);

    }

    //to count the food if the user got buy
    public void main_menu(View view)
    {
        finalize_order.next_ord_flag=1;
        finalize_order.old_ord_string=finalize_order.order_string+finalize_order.old_ord_string;
        finalize_order.old_all_total=finalize_order.all_total;

        //for the non-veg category
        N_Veg.chicken_burger=0;
        N_Veg.chicken_bbq_pizza=0;
        N_Veg.chicken_teri=0;
        N_Veg.fried_fish_rice=0;
        N_Veg.wagyu=0;
        N_Veg.chicken_noodles=0;
        N_Veg.chicken_fried_rice=0;
        N_Veg.fried_chicken=0;
        N_Veg.chicken_biryani=0;
        N_Veg.mutton_biryani=0;
        N_Veg.n_veg_total=0;

        //for the starter category
        Starters.veg_crispy=0;
        Starters.chicken_crispy=0;
        Starters.lamb=0;
        Starters.chicken_chilly=0;
        Starters.sausage=0;
        Starters.veg_soup=0;
        Starters.chicken_soup=0;
        Starters.tomato_soup=0;
        Starters.cheese_chicken=0;
        Starters.soup=0;
        Starters.starters_total=0;

        //for the veg category
        Veg.roti=0;
        Veg.butter_roti=0;
        Veg.tofu=0;
        Veg.roll=0;
        Veg.curry=0;
        Veg.veg_noodles=0;
        Veg.veg_fried_rice=0;
        Veg.veg_burger=0;
        Veg.veg_biryani=0;
        Veg.herbal=0;
        Veg.total_veg=0;

        //for the dessert category
        Dessert.chocolate_ice_cream=0;
        Dessert.vanilla_ice_cream=0;
        Dessert.strawberry_ice_cream=0;
        Dessert.waffle=0;
        Dessert.brownie_fudge=0;
        Dessert.macaron=0;
        Dessert.tiramisu=0;
        Dessert.black_forest=0;
        Dessert.chocolate_lava=0;
        Dessert.dutch_almond=0;
        Dessert.dessert_total=0;

        Intent menu= new Intent(this,Order_Type.class);
        startActivity(menu);

    }



}
