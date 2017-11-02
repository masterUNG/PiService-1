package kct.piyawat.piservice.utility;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;

import kct.piyawat.piservice.R;

/**
 * Created by asus on 2/11/2560.
 */

public class MyAlert {

    //    Exception
    private Context context;

    public MyAlert(Context context) {
        this.context = context;
    }

    public void myDialog(String strTitle, String strMessage) {

//      You Inherited Object From Class  สร้างออบเจ็คที่สามารถสร้างป็อพอัพ
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setCancelable(false);
        builder.setIcon(R.drawable.ic_action_alert);
        builder.setTitle(strTitle);
        builder.setMessage(strMessage);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();

            }
        });
        builder.show();

    }

} // Main Class
