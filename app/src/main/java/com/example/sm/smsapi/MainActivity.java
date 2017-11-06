package com.example.sm.smsapi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.katepratik.msg91api.MSG91;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    //179035AO455ZE0Wevp59df6f28
     //   MSG91 msg91 = new MSG91("179035AO455ZE0Wevp59df6f28");
        MSG91 msg91Debug = new MSG91("179035AO455ZE0Wevp59df6f28", true);


        String validate = msg91Debug.validate();
        Log.d("state","validate "+validate );
        // Promotional SMS Route is 1
        String balancePromotional = msg91Debug.getBalance("1");
        Log.d("state","balancePromotional "+balancePromotional );
        // Transactional SMS Route is 4
        String balanceTransactional = msg91Debug.getBalance("4");
        Log.d("state","balanceTransactional "+balanceTransactional );
      //  String change = msg91.changePassword("old_password", "new_password");

        msg91Debug.composeMessage("ABCDEF", "This Sample message body that will be sent with sender id : ABCDEF to single mobile number");
//        msg91Debug.to("6977368455");
//        msg91Debug.setCountryCode("30");

        msg91Debug.to("447541969442");
    //    msg91Debug.setCountryCode("44");
        String sendStatus = msg91Debug.send();
        Log.d("state","sendStatus "+sendStatus );
    }
}
