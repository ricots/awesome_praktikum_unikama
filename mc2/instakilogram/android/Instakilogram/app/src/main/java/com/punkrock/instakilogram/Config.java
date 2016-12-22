package com.punkrock.instakilogram;

public class Config {

    public static final String URL_ADD="http://diopenta.pe.hu/instakilogram/regis/adduser.php";
    public static final String URL_LOGIN="http://diopenta.pe.hu/instakilogram/regis/login.php";
    public static final String URL_ADD_STATUS="http://diopenta.pe.hu/instakilogram/status/addstatus.php";
    public static final String URL_GET_ALL = "http://diopenta.pe.hu/instakilogram/status/getallstatus.php";
    public static final String URL_GET_STATUS = "http://diopenta.pe.hu/instakilogram/status/getstatus.php?id_status=";
    public static final String URL_UPDATE_STATUS = "http://diopenta.pe.hu/instakilogram/status/updatestatus.php?id_status=";
    public static final String URL_DELETE_STATUS = "http://diopenta.pe.hu/instakilogram/status/deletestatus.php?id_status=";

    //Keys that will be used to send the request to php scripts
    public static final String KEY_USER_ID = "id";
    public static final String KEY_USER_NAMA = "username";
    public static final String KEY_USER_STATUS = "ikistatus";
    public static final String KEY_USER_PASSWORD = "password";
    public static final String KEY_USER_ADDRESS = "address";
    public static final String KEY_USER_EMAIL = "email";

    //JSON Tags
    public static final String TAG_JSON_ARRAY="result";
    public static final String TAG_ID = "id_status";
    public static final String TAG_STATUS = "ikistatus";
    public static final String TAG_PASSWORD = "password";
    public static final String TAG_ADDRESS = "address";
    public static final String TAG_EMAIL = "email";


    //employee id to pass with intent
    public static final String USER_ID = "user_id";

    public static final String LOGIN_SUCCESS = "success";

    //Keys for Sharedpreferences
    //This would be the name of our shared preferences
    public static final String SHARED_PREF_NAME = "myloginapp";

    //This would be used to store the email of current logged in user
    public static final String USER_SHARED_PREF = "username";

    //We will use this to store the boolean in sharedpreference to track user is loggedin or not
    public static final String LOGGEDIN_SHARED_PREF = "loggedin";
}
