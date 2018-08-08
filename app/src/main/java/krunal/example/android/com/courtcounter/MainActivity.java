package krunal.example.android.com.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * This activity keeps track of the basketball score for 2 teams.
 */
public class MainActivity extends AppCompatActivity {
    
    /**
     * Keep Track of the score for Team A.
     */
    int scoureCountTeamA = 0;

    /**
     * Keep track of the score for Team B.
     */
    int scoureCountTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    public void addThreeForTeamA(View view){
        scoureCountTeamA = scoureCountTeamA +3;
        displayScoureforTeamA(scoureCountTeamA);
    }
    /**
     * Increase the score for Team A by 2 points.
     */
    public void addTwoForTeamA(View view){
        scoureCountTeamA = scoureCountTeamA +2;
        displayScoureforTeamA(scoureCountTeamA);
    }
    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamA(View view){
        scoureCountTeamA = scoureCountTeamA +1;
        displayScoureforTeamA(scoureCountTeamA);
    }
    /**
     * Increase the score for Team A by 3 points.
     */
    public void addThreeForTeamB(View view){
        scoureCountTeamB = scoureCountTeamB +3;
        displaySocureforTeamB(scoureCountTeamB);
    }
    /**
     * Increase the score for Team A by 2 points.
     */
    public void addTwoForTeamB(View view){
        scoureCountTeamB = scoureCountTeamB +2;
        displaySocureforTeamB(scoureCountTeamB);
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamB(View view){
        scoureCountTeamB = scoureCountTeamB +1;
        displaySocureforTeamB(scoureCountTeamB);
    }
    /**
     * Resets the score for both teams back to 0.
     */
    public void Reset(View view){
        scoureCountTeamA = 0;
        scoureCountTeamB = 0;
        displayScoureforTeamA(scoureCountTeamA);
        displaySocureforTeamB(scoureCountTeamB);
    }
    /**
     * Displays the given score for Team A.
     */
    private void displayScoureforTeamA(int scoure){
        TextView textView = findViewById(R.id.teamA);
        textView.setText(String.valueOf(scoure));
    }
    /**
     * Displays the given score for Team B.
     */
    private void displaySocureforTeamB(int scoure){
        TextView textView = findViewById(R.id.teamB);
        textView.setText(String.valueOf(scoure));
    }
}
