package com.example.a1024;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView scoresView;
    private DataBaseManager databaseManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scoresView = (TextView) findViewById( R.id.scoresView );
        databaseManager = new DataBaseManager( this );

//        databaseManager.insertScore( "Alexandre", 800 );
//        databaseManager.insertScore( "Christelle", 530 );
//        databaseManager.insertScore( "Dominique", 50 );
//        databaseManager.insertScore( "Aurélie", 100 );
//        databaseManager.insertScore( "Guillaume", 980 );
        databaseManager.insertScore( "fsdfds", 0 );
        databaseManager.deleteScore(6);

        List<ScoreData> scores = databaseManager.readTop10();
        for ( ScoreData score : scores ) {
            scoresView.append( score.toString() + "\n\n" );
        }

        databaseManager.close();

    }
}