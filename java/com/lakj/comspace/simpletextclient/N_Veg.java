package com.lakj.comspace.simpletextclient;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class N_Veg extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_n__veg);
        total_cal();
        orders_list_init();
    }
    //variable
    static int chicken_burger;
    static int chicken_bbq_pizza;
    static int chicken_teri;
    static int fried_fish_rice;
    static int chicken_biryani;
    static int mutton_biryani;
    static int fried_chicken;
    static int chicken_noodles;
    static int chicken_fried_rice;
    static int wagyu;
    static int n_veg_total;

    //when the item add quantity
    public void chicken_bbq_pizza_inc(View view){
        chicken_bbq_pizza=inc(chicken_bbq_pizza);
        TextView tv = (TextView) findViewById(R.id.chicken_BBQ_pizza_order);
        tv.setText("" + chicken_bbq_pizza);
        total_cal();
    }

    //when the item reduce quantity
    public void chicken_bbq_pizza_dec(View view) {
        if (chicken_bbq_pizza >= 0) {
        chicken_bbq_pizza= dec(chicken_bbq_pizza);
        TextView tv = (TextView) findViewById(R.id.chicken_BBQ_pizza_order);
            if(chicken_bbq_pizza>0) tv.setText("" + chicken_bbq_pizza);
            else tv.setText("__");
            total_cal();

    }
    }
    //when the item add quantity
    public void chicken_burger_inc(View view){
        chicken_burger=inc(chicken_burger);
        TextView tv = (TextView) findViewById(R.id.chickburger_order);
        tv.setText("" + chicken_burger);
        total_cal();
    }
    //when the item reduce quantity
    public void chicken_burger_dec(View view) {
        if (chicken_burger >= 0) {
            chicken_burger = dec(chicken_burger);
            TextView tv = (TextView) findViewById(R.id.chickburger_order);
            if(chicken_burger>0) tv.setText("" + chicken_burger);
            else tv.setText("__");
            total_cal();
        }
    }

    //when the item add quantity
    public void chicken_teri_inc(View view){
        chicken_teri=inc(chicken_teri);
        TextView tv = (TextView) findViewById(R.id.chicken_teri_order);
        tv.setText("" + chicken_teri);
        total_cal();
    }
    //when the item reduce quantity
    public void chicken_teri_dec(View view) {
        if (chicken_teri>= 0) {
            chicken_teri = dec(chicken_teri);
            TextView tv = (TextView) findViewById(R.id.chicken_teri_order);
            if(chicken_teri>0) tv.setText("" + chicken_teri);
            else tv.setText("__");
            total_cal();
        }
    }
    //when the item add quantity
    public void fried_fish_rice_inc(View view){
        fried_fish_rice=inc(fried_fish_rice);
        TextView tv = (TextView) findViewById(R.id.fried_fish_rice_order);
        tv.setText("" + fried_fish_rice);
        total_cal();
    }
    //when the item reduce quantity
    public void fried_fish_rice_dec(View view) {
        if (fried_fish_rice>= 0) {
            fried_fish_rice= dec(fried_fish_rice);
            TextView tv = (TextView) findViewById(R.id.fried_fish_rice_order);
            if(fried_fish_rice>0) tv.setText("" + fried_fish_rice);
            else tv.setText("__");
            total_cal();
        }
    }
    //when the item add quantity
    public void chicken_biryani_inc(View view){
        chicken_biryani=inc(chicken_biryani);
        TextView tv = (TextView) findViewById(R.id.chicken_biryani_order);
        tv.setText("" + chicken_biryani);
        total_cal();
    }
    //when the item reduce quantity
    public void chicken_biryani_dec(View view) {
        if (chicken_biryani>= 0) {
            chicken_biryani= dec(chicken_biryani);
            TextView tv = (TextView) findViewById(R.id.chicken_biryani_order);
            if(chicken_biryani>0) tv.setText("" + chicken_biryani);
            else tv.setText("__");
            total_cal();
        }
    }


    //when the item add quantity
    public void mutton_biryani_inc(View view){
        mutton_biryani=inc(mutton_biryani);
        TextView tv = (TextView) findViewById(R.id.mutton_biryani_order);
        tv.setText("" + mutton_biryani);
        total_cal();
    }
    //when the item reduce quantity
    public void mutton_biryani_dec(View view) {
        if (mutton_biryani>= 0) {
            mutton_biryani= dec(mutton_biryani);
            TextView tv = (TextView) findViewById(R.id.mutton_biryani_order);
            if(mutton_biryani>0) tv.setText("" + mutton_biryani);
            else tv.setText("__");
            total_cal();
        }
    }
    //when the item add quantity
    public void fried_chicken_inc(View view){
        fried_chicken=inc(fried_chicken);
        TextView tv = (TextView) findViewById(R.id.fried_chicken_order);
        tv.setText("" + fried_chicken);
        total_cal();
    }
    //when the item reduce quantity
    public void fried_chicken_dec(View view) {
        if (fried_chicken>= 0) {
            fried_chicken= dec(fried_chicken);
            TextView tv = (TextView) findViewById(R.id.fried_chicken_order);
            if(fried_chicken>0) tv.setText("" + fried_chicken);
            else tv.setText("__");
            total_cal();
        }
    }


    //when the item add quantity
    public void chicken_noodles_inc(View view){
        chicken_noodles=inc(chicken_noodles);
        TextView tv = (TextView) findViewById(R.id.chicken_noodles_order);
        tv.setText("" + chicken_noodles);
        total_cal();
    }
    //when the item reduce quantity
    public void chicken_noodles_dec(View view) {
        if (chicken_noodles>= 0) {
            chicken_noodles= dec(chicken_noodles);
            TextView tv = (TextView) findViewById(R.id.chicken_noodles_order);
            if(chicken_noodles>0) tv.setText("" + chicken_noodles);
            else tv.setText("__");
            total_cal();
        }
    }


    //when the item add quantity
    public void wagyu_inc(View view){
        wagyu=inc(wagyu);
        TextView tv = (TextView) findViewById(R.id.wagyu_order);
        tv.setText("" + wagyu);
        total_cal();
    }
    //when the item reduce quantity
    public void wagyu_dec(View view) {
        if (wagyu>= 0) {
            wagyu= dec(wagyu);
            TextView tv = (TextView) findViewById(R.id.wagyu_order);
            if(wagyu>0) tv.setText("" + wagyu);
            else tv.setText("__");
            total_cal();
        }
    }
    //when the item add quantity
    public void chicken_fried_rice_inc(View view){
        chicken_fried_rice=inc(chicken_fried_rice);
        TextView tv = (TextView) findViewById(R.id.chicken_fried_rice_order);
        tv.setText("" + chicken_fried_rice);
        total_cal();
    }
    //when the item reduce quantity
    public void chicken_fried_rice_dec(View view) {
        if (chicken_fried_rice>= 0) {
            chicken_fried_rice= dec(chicken_fried_rice);
            TextView tv = (TextView) findViewById(R.id.chicken_fried_rice_order);
            if(chicken_fried_rice>0) tv.setText("" + chicken_fried_rice);
            else tv.setText("__");
            total_cal();
        }
    }


    //calculate the total price
    public void total_cal() {
        n_veg_total = chicken_burger * (30) + chicken_bbq_pizza * (50) + chicken_teri * (35) + fried_fish_rice * (25)
                + fried_chicken * (40) + chicken_noodles * (20) + chicken_fried_rice * (25) + wagyu * (60)
                + chicken_biryani * (55) + mutton_biryani * (80);
        finalize_order.all_total = Starters.starters_total + Veg.total_veg + N_Veg.n_veg_total + Dessert.dessert_total;
        if (finalize_order.all_total > 0) {
            TextView tv = (TextView) findViewById(R.id.n_veg_tot_id);
            tv.setText("" + "RM" + (finalize_order.all_total));
        }

        else{
            TextView tv = (TextView) findViewById(R.id.n_veg_tot_id);
            tv.setText("");

        }
    }





    public void main_menu(View view){
        Intent goto_main_menu= new Intent(this, Order_Type.class);
        startActivity(goto_main_menu);
        overridePendingTransition(R.anim.fadin, R.anim.fadout);
    }
    //check if the quantity decrease
    public int dec(int x) {
    if (x > 0) {
        x--;
        return x;
    }
    else return 0;
}

//check if the quantity increase
public int inc(int x)
{
   x++;
    return (x);
}

    public void orders_list_init(){

        if(chicken_burger>0) {
            TextView tv = (TextView) findViewById(R.id.chickburger_order);
            tv.setText("" + chicken_burger);
        }

        if(chicken_bbq_pizza>0) {
            TextView tv = (TextView) findViewById(R.id.chicken_BBQ_pizza_order);
            tv.setText("" + chicken_bbq_pizza);
        }
        if(chicken_teri>0) {
            TextView tv = (TextView) findViewById(R.id.chickburger_order);
            tv.setText("" + chicken_teri);
        }
        if(fried_fish_rice>0) {
            TextView tv = (TextView) findViewById(R.id.fried_fish_rice_order);
            tv.setText("" + fried_fish_rice);
        }


        if(fried_chicken>0) {
            TextView tv = (TextView) findViewById(R.id.fried_chicken_order);
            tv.setText("" + fried_chicken);
        }
        if(chicken_noodles>0) {
            TextView tv = (TextView) findViewById(R.id.chicken_noodles_order);
            tv.setText("" + chicken_noodles);
        }

        if(chicken_fried_rice>0) {
            TextView tv = (TextView) findViewById(R.id.chicken_fried_rice_order);
            tv.setText("" + chicken_fried_rice);
        }
        if(wagyu>0) {
            TextView tv = (TextView) findViewById(R.id.wagyu_order);
            tv.setText("" + wagyu);
        }


        if(chicken_biryani>0) {
            TextView tv = (TextView) findViewById(R.id.chicken_biryani_order);
            tv.setText("" + chicken_biryani);
        }

        if(mutton_biryani>0) {
            TextView tv = (TextView) findViewById(R.id.mutton_biryani_order);
            tv.setText("" + mutton_biryani);
        }
    }

    //check finalize order
    public void fin_ord(View view)
    {
        final Object o=this;
        if(finalize_order.all_total>0) {
            Intent fin = new Intent(this, finalize_order.class);
            startActivity(fin);
            overridePendingTransition(R.anim.fadin, R.anim.fadout);
        }
        else{
            if(finalize_order.next_ord_flag==1)
            {

                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage("Are you sure you don't want to place another order?")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {

                                Intent nextact = new Intent((N_Veg) o, thankyou.class);
                                startActivity(nextact);
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();

            }

            else{
                Toast.makeText(getApplicationContext(),
                        "Please select your order", Toast.LENGTH_SHORT).show();
            }
        }
    }
}


