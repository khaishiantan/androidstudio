package com.lakj.comspace.simpletextclient;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Veg extends Activity {

    static int roti;
    static int butter_roti;
    static int tofu;
    static int roll;
    static int curry;
    static int veg_noodles;
    static int veg_fried_rice;
    static int veg_burger;
    static int veg_biryani;
    static int herbal;
    static int total_veg;
    static String order_veg;

    @Override
    public void onBackPressed() {
        // do nothing.
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veg);
        total_cal();
        orders_list_init();
    }

    //when the item add quantity

    public void roti_inc(View view){
        roti=inc(roti);
        TextView tv = (TextView) findViewById(R.id.roti_order);
        tv.setText("" + roti);
        total_cal();
    }
    public void roti_dec(View view) {
        if (roti>= 0) {
            roti= dec(roti);
            TextView tv = (TextView) findViewById(R.id.roti_order);
            if(roti>0) tv.setText("" + roti);
            else tv.setText("__");
            total_cal();
        }
    }

    //when the item add quantity
    public void butter_roti_inc(View view){
        butter_roti=inc(butter_roti);
        TextView tv = (TextView) findViewById(R.id.butter_roti_order);
        tv.setText("" + butter_roti);
        total_cal();
    }
    //when the item reduce quantity
    public void butter_roti_dec(View view) {
        if (butter_roti>= 0) {
            butter_roti= dec(butter_roti);
            TextView tv = (TextView) findViewById(R.id.butter_roti_order);
            if(butter_roti>0) tv.setText("" + butter_roti);
            else tv.setText("__");

            total_cal();
        }
    }

    //when the item add quantity
    public void tofu_inc(View view){
        tofu=inc(tofu);
        TextView tv = (TextView) findViewById(R.id.tofu_order);
        tv.setText("" + tofu);
        total_cal();
    }
    //when the item reduce quantity
    public void tofu_dec(View view) {
        if (tofu>= 0) {
            tofu= dec(tofu);
            TextView tv = (TextView) findViewById(R.id.tofu_order);
            if(tofu>0) tv.setText("" + tofu);
            else tv.setText("__");

            total_cal();
        }
    }
    //when the item add quantity
    public void roll_inc(View view){
        roll=inc(roll);
        TextView tv = (TextView) findViewById(R.id.roll_order);
        tv.setText("" + roll);
        total_cal();
    }
    //when the item reduce quantity
    public void roll_dec(View view) {
        if (roll>= 0) {
            roll= dec(roll);
            TextView tv = (TextView) findViewById(R.id.roll_order);
            if(roll>0) tv.setText("" + roll);
            else tv.setText("__");

            total_cal();
        }
    }
    //when the item add quantity
    public void curry_inc(View view){
        curry=inc(curry);
        TextView tv = (TextView) findViewById(R.id.curry_order);
        tv.setText("" + curry);

        total_cal();
    }
    //when the item reduce quantity
    public void curry_dec(View view) {
        if (curry>= 0) {
            curry= dec(curry);
            TextView tv = (TextView) findViewById(R.id.curry_order);
            if(curry>0) tv.setText("" + curry);
            else tv.setText("__");

            total_cal();
        }
    }
    //when the item add quantity

    public void veg_noodles_inc(View view){
        veg_noodles=inc(veg_noodles);
        TextView tv = (TextView) findViewById(R.id.veg_noodles_order);
        tv.setText("" + veg_noodles);

        total_cal();
    }
    //when the item reduce quantity
    public void veg_noodles_dec(View view) {
        if (veg_noodles>= 0) {
            veg_noodles= dec(veg_noodles);
            TextView tv = (TextView) findViewById(R.id.veg_noodles_order);
            if(veg_noodles>0) tv.setText("" + veg_noodles);
            else tv.setText("__");

            total_cal();
        }
    }

    //when the item add quantity

    public void veg_fried_rice_inc(View view){
        veg_fried_rice=inc(veg_fried_rice);
        TextView tv = (TextView) findViewById(R.id.veg_fried_rice_order);
        tv.setText("" + veg_fried_rice);
        total_cal();
    }
    //when the item reduce quantity
    public void veg_fried_rice_dec(View view) {
        if (veg_fried_rice>= 0) {
            veg_fried_rice= dec(veg_fried_rice);
            TextView tv = (TextView) findViewById(R.id.veg_fried_rice_order);
            if(veg_fried_rice>0) tv.setText("" + veg_fried_rice);
            else tv.setText("__");

            total_cal();
        }
    }

    //when the item add quantity
    public void veg_burger_inc(View view){
        veg_burger=inc(veg_burger);
        TextView tv = (TextView) findViewById(R.id.veg_burger_order);
        tv.setText("" + veg_burger);

        total_cal();
    }
    //when the item reduce quantity
    public void veg_burger_dec(View view) {
        if (veg_burger>= 0) {
            veg_burger= dec(veg_burger);
            TextView tv = (TextView) findViewById(R.id.veg_burger_order);
            if(veg_burger>0) tv.setText("" + veg_burger);
            else tv.setText("__");

            total_cal();
        }
    }

    //when the item add quantity
    public void veg_biryani_inc(View view){
        veg_biryani=inc(veg_biryani);
        TextView tv = (TextView) findViewById(R.id.veg_biryani_order);
        tv.setText("" + veg_biryani);

        total_cal();
    }
    //when the item reduce quantity
    public void veg_biryani_dec(View view) {
        if (veg_biryani>= 0) {
            veg_biryani= dec(veg_biryani);
            TextView tv = (TextView) findViewById(R.id.veg_biryani_order);
            if(veg_biryani>0) tv.setText("" + veg_biryani);
            else tv.setText("__");

            total_cal();
            }
    }


    //when the item add quantity
    public void herbal_inc(View view){
        herbal=inc(herbal);
        TextView tv = (TextView) findViewById(R.id.herbal_order);
        tv.setText("" + herbal);

        total_cal();
    }
    //when the item reduce quantity
    public void herbal_dec(View view) {
        if (herbal>= 0) {
            herbal= dec(herbal);
            TextView tv = (TextView) findViewById(R.id.herbal_order);
            if(herbal>0) tv.setText("" + herbal);
            else tv.setText("__");

            total_cal();
        }
    }



    //calculate the finalize price for the user
    public void total_cal(){
        total_veg=roti*(20)+butter_roti*(25)+tofu*(20)+roll*(25)+curry*(20)+veg_noodles*(10)+veg_fried_rice*(12)+veg_burger*(8)+veg_biryani*(15)+herbal*(15);
        finalize_order.all_total=Starters.starters_total+Veg.total_veg+N_Veg.n_veg_total+Dessert.dessert_total;

        if (finalize_order.all_total > 0) {
        TextView tv = (TextView) findViewById(R.id.veg_total_id);
        tv.setText(""+"RM"+ (finalize_order.all_total));
    }
    else{
            TextView tv = (TextView) findViewById(R.id.veg_total_id);
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
            if(roti>0) {
                TextView tv = (TextView) findViewById(R.id.roti_order);
                tv.setText("" + roti);
            }
            if(butter_roti>0) {
                TextView tv = (TextView) findViewById(R.id.butter_roti_order);
                tv.setText("" + butter_roti);
            }

            if(tofu>0) {
                TextView tv = (TextView) findViewById(R.id.tofu_order);
                tv.setText("" + tofu);
            }
            if(roll>0) {
                TextView tv = (TextView) findViewById(R.id.roll_order);
                tv.setText("" + roll);
            }
            if(curry>0) {
                TextView tv = (TextView) findViewById(R.id.curry_order);
                tv.setText("" + curry);
            }
            if(veg_noodles>0) {
                TextView tv = (TextView) findViewById(R.id.veg_noodles_order);
                tv.setText("" + veg_noodles);
            }
            if(veg_fried_rice>0) {
                TextView tv = (TextView) findViewById(R.id.veg_fried_rice_order);
                tv.setText("" + veg_fried_rice);
            }
            if(veg_burger>0) {
                TextView tv = (TextView) findViewById(R.id.veg_burger_order);
                tv.setText("" + veg_burger);
            }

            if(veg_biryani>0) {
                TextView tv = (TextView) findViewById(R.id.veg_biryani_order);
                tv.setText("" + veg_biryani);
            }
            if(herbal>0) {
                TextView tv = (TextView) findViewById(R.id.herbal_order);
                tv.setText("" + herbal);
            }
        }
    //check purchase page to main menu page
    public void fin_ord(View view)
    {
        final Object o= this;
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

                                Intent nextact = new Intent((Veg) o, thankyou.class);
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
