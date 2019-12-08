package com.lakj.comspace.simpletextclient;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
public class finalize_order extends Activity {
    finalize_order a=this;
    public static  Socket client;
    public static PrintWriter printwriter;
    public static BufferedReader bb;
    public static String messsage;
    public static String m1;
    static int old_all_total;
    static int all_total;

    String personal_preferances;
    Object oo;
    String fin_order_string="";
    public String S;
    static int next_ord_flag;
    static String order_string;
    static String old_ord_string="";

    @Override
    public void onBackPressed() {
        // do nothing.
    }
    //check the previous order item
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finalize_order);
        show_Order();
        tot_v();
        oo=this;
    }

    //show order to the user
    public void show_Order() {
        if (Dessert.chocolate_ice_cream > 0) {
            fin_order_string = fin_order_string + "chocolate ice cream-" + String.valueOf(Dessert.chocolate_ice_cream) + ",";
        }
        if (Dessert.vanilla_ice_cream > 0) {
            fin_order_string = fin_order_string + "vannila ice cream-" + String.valueOf(Dessert.vanilla_ice_cream) + ",";
        }

        if (Dessert.strawberry_ice_cream > 0) {
            fin_order_string = fin_order_string + "strawberry ice cream-" + String.valueOf(Dessert.strawberry_ice_cream) + ",";
        }
        if (Dessert.waffle > 0) {
            fin_order_string = fin_order_string + "waffle-" + String.valueOf(Dessert.waffle) + ",";
        }
        if (Dessert.brownie_fudge > 0) {
            fin_order_string = fin_order_string + "brownie fudge-" + String.valueOf(Dessert.brownie_fudge) + ",";
        }
        if (Dessert.macaron > 0) {
            fin_order_string = fin_order_string + "macaron-" + String.valueOf(Dessert.macaron) + ",";
        }
        if (Dessert.tiramisu > 0) {
            fin_order_string = fin_order_string + "tiramisu-" + String.valueOf(Dessert.tiramisu) + ",";
        }

        if (Dessert.black_forest > 0) {
            fin_order_string = fin_order_string + "black forest-" + String.valueOf(Dessert.black_forest) + ",";
        }
        if (Dessert.chocolate_lava > 0) {
            fin_order_string = fin_order_string + "chocolate lava-" + String.valueOf(Dessert.chocolate_lava) + ",";
        }

        if (Dessert.dutch_almond > 0) {
            fin_order_string = fin_order_string + "dutch almond-" + String.valueOf(Dessert.dutch_almond) + ",";
        }
        if (N_Veg.chicken_burger > 0) {
            fin_order_string = fin_order_string + "chicken burger-" + String.valueOf(N_Veg.chicken_burger) + ",";
        }
        if (N_Veg.chicken_bbq_pizza > 0) {
            fin_order_string = fin_order_string + "chicken bbq pizza-" + String.valueOf(N_Veg.chicken_bbq_pizza) + ",";
        }
        if (N_Veg.chicken_teri > 0) {
            fin_order_string = fin_order_string + "chicken teri-" + String.valueOf(N_Veg.chicken_teri) + ",";
        }
        if (N_Veg.fried_fish_rice > 0) {
            fin_order_string = fin_order_string + "fried fish rice-" + String.valueOf(N_Veg.fried_fish_rice) + ",";
        }
        if (N_Veg.fried_chicken > 0) {
            fin_order_string = fin_order_string + "fried chicken-" + String.valueOf(N_Veg.fried_chicken) + ",";
        }
        if (N_Veg.chicken_noodles > 0) {
            fin_order_string = fin_order_string + "chicken noodles-" + String.valueOf(N_Veg.chicken_noodles) + ",";
        }
        if (N_Veg.chicken_fried_rice > 0) {
            fin_order_string = fin_order_string + "chicken fried rice-" + String.valueOf(N_Veg.chicken_fried_rice) + ",";
        }

        if (N_Veg.wagyu > 0) {
            fin_order_string = fin_order_string + "wagyu-" + String.valueOf(N_Veg.wagyu) + ",";
        }

        if (N_Veg.chicken_biryani> 0) {
            fin_order_string = fin_order_string + "chicken biryani-" + String.valueOf(N_Veg.chicken_biryani) + ",";
        }
        if (N_Veg.mutton_biryani> 0) {
            fin_order_string = fin_order_string + "mutton biryani-" + String.valueOf(N_Veg.mutton_biryani) + ",";
        }

        if (Veg.roti > 0) {
            fin_order_string = fin_order_string + "roti-" + String.valueOf(Veg.roti) + ",";
        }
        if (Veg.butter_roti > 0) {
            fin_order_string = fin_order_string + "butter roti-" + String.valueOf(Veg.butter_roti) + ",";
        }
        if (Veg.tofu > 0) {
            fin_order_string = fin_order_string + "tofu-" + String.valueOf(Veg.tofu) + ",";
        }


        if (Veg.roll > 0) {
            fin_order_string = fin_order_string + "Spring Roll-" + String.valueOf(Veg.roll) + ",";
        }
        if (Veg.curry> 0) {
            fin_order_string = fin_order_string + "curry-" + String.valueOf(Veg.curry) + ",";
        }
        if (Veg.veg_noodles> 0) {
            fin_order_string = fin_order_string + "veg noodles-" + String.valueOf(Veg.veg_noodles) + ",";
        }

        if (Veg.veg_fried_rice> 0) {
            fin_order_string = fin_order_string + "veg fried rice-" + String.valueOf(Veg.veg_fried_rice) + ",";
        }
        if (Veg.veg_burger> 0) {
            fin_order_string = fin_order_string + "veg burger-" + String.valueOf(Veg.veg_burger) + ",";
        }
        if (Veg.veg_biryani> 0) {
            fin_order_string = fin_order_string + "veg briyani-" + String.valueOf(Veg.veg_biryani) + ",";
        }

        if (Veg.herbal> 0) {
            fin_order_string = fin_order_string + "herbal-" + String.valueOf(Veg.herbal) + ",";
        }
        if (Starters.veg_crispy > 0) {
            fin_order_string = fin_order_string + "veg crispy-" + String.valueOf(Starters.veg_crispy) + ",";
        }
        if (Starters.chicken_crispy > 0) {
            fin_order_string = fin_order_string + "chicken crispy-" + String.valueOf(Starters.chicken_crispy) + ",";
        }
        if (Starters.lamb > 0) {
            fin_order_string = fin_order_string + "lamb-" + String.valueOf(Starters.lamb) + ",";
        }
        if (Starters.sausage > 0) {
            fin_order_string = fin_order_string + "sausage-" + String.valueOf(Starters.sausage) + ",";
        }
        if (Starters.veg_soup > 0) {
            fin_order_string = fin_order_string + "veg soup-" + String.valueOf(Starters.veg_soup) + ",";
        }
        if (Starters.chicken_soup > 0) {
            fin_order_string = fin_order_string + "chicken soup-" + String.valueOf(Starters.chicken_soup) + ",";
        }
        if (Starters.tomato_soup > 0) {
            fin_order_string = fin_order_string + "tomato soup-" + String.valueOf(Starters.tomato_soup) + ",";
        }
        if (Starters.cheese_chicken > 0) {
            fin_order_string = fin_order_string + "cheese chicken-" + String.valueOf(Starters.cheese_chicken) + ",";
        }
        if (Starters.soup > 0) {
            fin_order_string = fin_order_string + "soup-" + String.valueOf(Starters.soup) + ",";
        }
        if (Starters.chicken_chilly > 0) {
            fin_order_string = fin_order_string + "chicken chilly-" + String.valueOf(Starters.chicken_chilly) + ",";
        }
        String temp_order_view=fin_order_string+old_ord_string;
        TextView tv = (TextView) findViewById(R.id.order_final);
        tv.setText("" + temp_order_view);
    }

    
    public void main_menu(View view) {
        Intent goto_main_menu = new Intent(this, Order_Type.class);
        startActivity(goto_main_menu);
        overridePendingTransition(R.anim.fadin, R.anim.fadout);
    }

    //let the user to know the total price
    public void tot_v(){
        all_total=all_total+old_all_total;
        TextView tv = (TextView) findViewById(R.id.tot_p);
        tv.setText("total price:" + "RM" +(finalize_order.all_total));
    }



    public class SendMessage extends AsyncTask<Void, Void, Void> {
        BufferedReader bb;
        Socket client;
        PrintWriter printwriter;


        @Override
        protected Void doInBackground(Void... params) {
            try {
                client = new Socket("10.3.241.212", 4444); // connect to the server
                printwriter = new PrintWriter(client.getOutputStream(), true);
                bb=new BufferedReader(new InputStreamReader(client.getInputStream()));
                printwriter.println(finalize_order.messsage);
                printwriter.flush();
                m1=bb.readLine();
                bb.close();
                client.close(); // closing the connection
            } catch (UnknownHostException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
    }
    //ask user to enter thier personal perferences and check whether the user wants to place thier order or not.
    public void send_ord(View v){
        order_string=fin_order_string;

    EditText Ed= (EditText) findViewById(R.id.personalp);

    personal_preferances=Ed.getText().toString();

    final Object o = this;
    AlertDialog.Builder builder = new AlertDialog.Builder(this);
    builder.setMessage("Are you sure you want to confirm this order?")
            .setCancelable(false)
            .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int id) {
                      messsage = "Order:" + SlimpleTextClientActivity.tablex + "|" + fin_order_string + "|" + Integer.toString(all_total)+"|"+personal_preferances;
                        ; // get the text message on the text field
                        SendMessage sendMessageTask = new SendMessage();
                        sendMessageTask.execute();
                        Intent nextact = new Intent((finalize_order) o, thankyou.class);
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
}