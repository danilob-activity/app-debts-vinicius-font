package com.example.danilo.appdebts.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.Editable;

/**
 * Created by aluno on 26/06/19.
 */

public class DataBaseHelper extends SQLiteOpenHelper {

    private static final String DB_NAME = "debts.db";
    private static final int DB_VERSION = 1;

    public DataBaseHelper(Context context){
        super(context, DB_NAME, null, DB_VERSION);
    }


    public DataBaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(ScriptDLL.createTableCategory());
        sqLiteDatabase.execSQL(ScriptDLL.createTableDebts());
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
