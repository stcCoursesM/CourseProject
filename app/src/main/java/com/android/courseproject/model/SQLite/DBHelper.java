package com.android.courseproject.model.SQLite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by User
 */

public class DBHelper extends SQLiteOpenHelper {

    private static DBHelper dbHelper;
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "WHStats.db";

    private DBHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public static synchronized DBHelper getInstance(Context context){
        if (dbHelper != null)
            dbHelper = new DBHelper(context);
        return dbHelper;
    }



    public DBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE reg_users (id_user INTEGER PRIMARY KEY AUTOINCREMENT, login TEXT, " +
                "password TEXT, role INTEGER)");
        db.execSQL("INSERT INTO reg_users (login, password, role) VALUES ('admin','admin',1);");
        db.execSQL("INSERT INTO reg_users (login, password, role) VALUES ('user','user',0);");
        db.execSQL("CREATE TABLE location_stats (id_loc_stat INTEGER PRIMARY KEY AUTOINCREMENT, id_user INTEGER," +
                "date TEXT, lat REAL, long REAL, FOREIGN KEY(id_user) REFERENCES reg_users(id_user));");
        db.execSQL("CREATE TABLE wh_stats (id_user INTEGER NOT NULL, date TEXT NOT NULL, wh_number REAL," +
                " PRIMARY KEY(id_user, date), FOREIGN KEY(id_user) REFERENCES reg_users(id_user) )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

    }
}
