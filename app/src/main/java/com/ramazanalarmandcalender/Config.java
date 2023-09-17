package com.ramazanalarmandcalender;

/**
 * Created by Cclub on 04/05/2018.
 */

public class Config {
    //Address of our scripts of the CRUD

    public static final String URL_GET_ALL_TUTOR ="http://www.kami.pk/ramazan/getallthings.php";

    //Keys for email and password as defined in our $_POST['key'] in login.php
    public static final String KEY_MAIL = "user_id";
    public static final String KEY_PASSWORD = "user_pass";

    //If server response is equal to this that means login is successful
    public static final String LOGIN_SUCCESS = "success";

    //Keys for Sharedpreferences
    //This would be the name of our shared preferences
    public static final String SHARED_PREF_NAME = "myloginapp";

    //This would be used to store the email of current logged in user
    public static final String EMAIL_SHARED_PREF = "user_id";

    //We will use this to store the boolean in sharedpreference to track user is loggedin or not
    public static final String LOGGEDIN_SHARED_PREF = "loggedin";

    // GetAllTutor
    public static final String TAG_JSON_ARRAY="result";
    public static final String TAG_TUTOR_NAME = "sno";
    public static final String TAG_TUTOR_EDUCATION = "date";
    public static final String TAG_TUTOR_EXPERIENCE = "sehartime";
    public static final String TAG_TUTOR = "iftartime";

}
