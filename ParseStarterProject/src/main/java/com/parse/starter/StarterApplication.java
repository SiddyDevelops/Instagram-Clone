/*
 * Copyright (c) 2015-present, Parse, LLC.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */
package com.parse.starter;

import android.app.Application;
//import android.service.autofill.SaveCallback;
import android.util.Log;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseUser;
import com.parse.SaveCallback;

//Pass default: MuG0Mrdip22a

public class StarterApplication extends Application {

  @Override
  public void onCreate() {
    super.onCreate();

    // Enable Local Datastore.
    Parse.enableLocalDatastore(this);

    // Add your initialization code here
    Parse.initialize(new Parse.Configuration.Builder(getApplicationContext())
            .applicationId("myappID")
            .clientKey("MuG0Mrdip22a")
            .server("http://18.219.64.175/parse/")
            .build()
    );

    /*
    ParseObject object = new ParseObject("Test");
    object.put("muNumber","123");
    object.put("myString","siddy");

    object.saveInBackground(new SaveCallback() {
      @Override
      public void done(ParseException e) {
        if(e == null)
        {
          Log.i("Build","scucess");
        }else{
          e.printStackTrace();
        }
      }
    });

    */
    ParseUser.enableAutomaticUser();

    ParseACL defaultACL = new ParseACL();
    defaultACL.setPublicReadAccess(true);
    defaultACL.setPublicWriteAccess(true);
    ParseACL.setDefaultACL(defaultACL, true);

  }
}
