package com.example.shehroz.tictactoe;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Main2Activity extends AppCompatActivity {
    TextView HSscores;

    Button btnBack,btnPlayAgain;

    static char button[]=new char[9];
    static int buttonI[]=new int[9];
    static  int player=0;
    MediaPlayer wosh,winningTone,wrongTone;
    static ImageButton button0;
    static ImageButton button1;
    static ImageButton button2;
    static ImageButton button3;
    static ImageButton button4;
    static ImageButton button5;
    static ImageButton button6;
    static ImageButton button7;
    static ImageButton button8;
    static ImageButton buttonReset;
    static ImageButton buttonTurn;
    static TextView Score1,Score2;

    static int i=0,draw=0,p1Score=0,p2Score=0;
    static void ScoreUpdate(){
        Score1.setText(Integer.toString(p1Score));
        Score2.setText(Integer.toString(p2Score));

    }
    void Turn(){

        if (player==0)
            buttonTurn.setBackgroundResource(R.drawable.x);
        else
            buttonTurn.setBackgroundResource(R.drawable.o);
    }
    void SetNull(){
        for(int i=0;i<9;i++)
            buttonI[i]=1;
        for(int i=0;i<9;i++)
            button[i]='\0';
    }
    void checkWin() {
        // For player 1  Win
        draw++;
        if (button[0]=='x' &&  button[1]=='x' && button[2]=='x') {
            if(i==0) {
                draw=0;
                p1Score++;
                winningTone.start();
                button0.setBackgroundResource(R.drawable.q);
                button1.setBackgroundResource(R.drawable.q);
                button2.setBackgroundResource(R.drawable.q);
                player=2;


                ShowHighScoreDBox("Player 1 Wins!");
                SetNull();

                i++;

            }
            else
                i=1;




        }
        else if (button[1]=='x' &&  button[4]=='x' && button[7]=='x') {

            if(i==0) {
                draw=0;
                p1Score++; winningTone.start();
                button1.setBackgroundResource(R.drawable.w);
                button4.setBackgroundResource(R.drawable.w);
                button7.setBackgroundResource(R.drawable.w);
                player=2;
                SetNull();
                ShowHighScoreDBox("Player 1 Wins!");
                Toast.makeText(Main2Activity.this,
                        "  Player 1 Wins!  ", Toast.LENGTH_LONG).show();

                i++;


            }
            else
                i=1;



        }

        else if (button[0]=='x' &&  button[4]=='x' && button[8]=='x') {

            if(i==0) {
                draw=0;
                SetNull(); p1Score++;

                draw=0;


                button0.setBackgroundResource(R.drawable.f);
                button4.setBackgroundResource(R.drawable.f);
                button8.setBackgroundResource(R.drawable.f);
                player=2; winningTone.start();
                ShowHighScoreDBox("Player 1 Wins!");
                Toast.makeText(Main2Activity.this,
                        "  Player 1 Wins!  ", Toast.LENGTH_LONG).show();
                i++;

            }
            else
                i=1;



        }



        else if (button[3]=='x' &&  button[4]=='x' && button[5]=='x') {
            if(i==0) {
                draw=0; SetNull(); p1Score++; winningTone.start();


                button3.setBackgroundResource(R.drawable.q);
                button4.setBackgroundResource(R.drawable.q);
                button5.setBackgroundResource(R.drawable.q);
                player=2;
                ShowHighScoreDBox("Player 1 Wins!");
                Toast.makeText(Main2Activity.this,
                        "  Player 1 Wins!  ", Toast.LENGTH_LONG).show();
                i++;

            }
            else
                i=1;

        }
        else if (button[6]=='x' &&  button[7]=='x' && button[8]=='x') {
            if(i==0) {
                draw=0;
                SetNull(); p1Score++; winningTone.start();

                button6.setBackgroundResource(R.drawable.q);
                button7.setBackgroundResource(R.drawable.q);
                button8.setBackgroundResource(R.drawable.q);
                player=2;
                ShowHighScoreDBox("Player 1 Wins!");
                Toast.makeText(Main2Activity.this,
                        "  Player 1 Wins!  ", Toast.LENGTH_LONG).show();

                i++;

            }
            else
                i=1;

        }


        else if (button[2]=='x' &&  button[4]=='x' && button[6]=='x') {
            if(i==0) {
                draw=0; p1Score++; winningTone.start();
                SetNull();
                button2.setBackgroundResource(R.drawable.e);
                button4.setBackgroundResource(R.drawable.e);
                button6.setBackgroundResource(R.drawable.e);
                player=2;
                ShowHighScoreDBox("Player 1 Wins!");
                Toast.makeText(Main2Activity.this,
                        "  Player 1 Wins!  ", Toast.LENGTH_LONG).show();
                i++;

            }
            else
                i=1;
        }
        else if (button[0]=='x' &&  button[3]=='x' && button[6]=='x') {
            if(i==0) {
                draw=0;
                button0.setBackgroundResource(R.drawable.w);
                button3.setBackgroundResource(R.drawable.w);
                button6.setBackgroundResource(R.drawable.w);
                player=2; p1Score++;
                ShowHighScoreDBox("Player 1 Wins!");
                SetNull(); winningTone.start();
                Toast.makeText(Main2Activity.this,
                        "  Player 1 Wins!  ", Toast.LENGTH_LONG).show();
                i++;

            }
            else
                i=1;


        }


        else if (button[2]=='x' &&  button[5]=='x' && button[8]=='x') {
            if(i==0) {
                draw=0; SetNull(); winningTone.start();
                button2.setBackgroundResource(R.drawable.w);
                button5.setBackgroundResource(R.drawable.w);
                button8.setBackgroundResource(R.drawable.w);
                player=2; p1Score++;
                Toast.makeText(Main2Activity.this,
                        "  Player 1 Wins!  ", Toast.LENGTH_LONG).show();
                ShowHighScoreDBox("Player 1 Wins!");
                i++;

            }
            else
                i=1;

        }


        //  %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% PLAYER  2

        else if (button[0]=='o' &&  button[1]=='o' && button[2]=='o') {
            if(i==0) {
                draw=0;
                SetNull();wrongTone.start();
                button0.setBackgroundResource(R.drawable.c);
                button1.setBackgroundResource(R.drawable.c);
                button2.setBackgroundResource(R.drawable.c);
                player=1;
                ShowHighScoreDBox("Player 2 Wins!");
                Toast.makeText(Main2Activity.this,
                        "  Player 2 Wins!  ", Toast.LENGTH_LONG).show();
                p2Score++;

                i++;

            }
            else
                i=1;




        }
        else if (button[1]=='o' &&  button[4]=='o' && button[7]=='o') {

            if(i==0) {
                draw=0;
                SetNull();wrongTone.start();

                button1.setBackgroundResource(R.drawable.n);
                button4.setBackgroundResource(R.drawable.n);
                button7.setBackgroundResource(R.drawable.n);
                player=1;
                ShowHighScoreDBox("Player 2 Wins!");

                Toast.makeText(Main2Activity.this,
                        "  Player 2 Wins!  ", Toast.LENGTH_LONG).show();
                p2Score++;


                i++;


            }
            else
                i=1;



        }

        else if (button[0]=='o' &&  button[4]=='o' && button[8]=='o') {

            if(i==0) {
                draw=0;
                SetNull();
                button0.setBackgroundResource(R.drawable.v);
                button4.setBackgroundResource(R.drawable.v);
                button8.setBackgroundResource(R.drawable.v);
                player=1;wrongTone.start();
                Toast.makeText(Main2Activity.this,
                        
                        "  Player 2 Wins!  ", Toast.LENGTH_LONG).show();
                p2Score++;
                ShowHighScoreDBox("Player 2 Wins!");

                i++;

            }
            else
                i=1;



        }



        else if (button[3]=='o' &&  button[4]=='o' && button[5]=='o') {
            if(i==0) {
                draw=0;
                SetNull();

                wrongTone.start();
                button3.setBackgroundResource(R.drawable.c);
                button4.setBackgroundResource(R.drawable.c);
                button5.setBackgroundResource(R.drawable.c);
                player=1;
                ShowHighScoreDBox("Player 2 Wins!");

                Toast.makeText(Main2Activity.this,
                        "  Player 2 Wins!  ", Toast.LENGTH_LONG).show();
                p2Score++;


                i++;

            }
            else
                i=1;

        }
        else if (button[6]=='o' &&  button[7]=='o' && button[8]=='o') {
            if(i==0) {
                wrongTone.start();
                draw=0;
                SetNull();
                button6.setBackgroundResource(R.drawable.c);
                button7.setBackgroundResource(R.drawable.c);
                button8.setBackgroundResource(R.drawable.c);
                player=1;
                ShowHighScoreDBox("Player 2 Wins!");

                Toast.makeText(Main2Activity.this,
                        "  Player 2 Wins!  ", Toast.LENGTH_LONG).show();
                p2Score++;


                i++;

            }
            else
                i=1;

        }


        else if (button[2]=='o' &&  button[4]=='o' && button[6]=='o') {
            if(i==0) {
                draw=0;
                wrongTone.start();
                SetNull();
                button2.setBackgroundResource(R.drawable.b);
                button4.setBackgroundResource(R.drawable.b);
                button6.setBackgroundResource(R.drawable.b);
                player=1;
                Toast.makeText(Main2Activity.this,
                        "  Player 2 Wins!  ", Toast.LENGTH_LONG).show();
                p2Score++;
                ShowHighScoreDBox("Player 2 Wins!");

                i++;

            }
            else
                i=1;



        }
        else if (button[0]=='o' &&  button[3]=='o' && button[6]=='o') {
            if(i==0) {
                draw=0;
                SetNull();
                wrongTone.start();
                button0.setBackgroundResource(R.drawable.n);
                button3.setBackgroundResource(R.drawable.n);
                button6.setBackgroundResource(R.drawable.n);
                player=1;
                Toast.makeText(Main2Activity.this,
                        "  Player 2 Wins!  ", Toast.LENGTH_LONG).show();
                p2Score++;
                ShowHighScoreDBox("Player 2 Wins!");

                i++;

            }
            else
                i=1;


        }


        else if (button[2]=='o' &&  button[5]=='o' && button[8]=='o') {
            if(i==0) {
                draw=0;
                SetNull();
                wrongTone.start();
                button2.setBackgroundResource(R.drawable.n);
                button5.setBackgroundResource(R.drawable.n);
                button8.setBackgroundResource(R.drawable.n);
                player=1;
                Toast.makeText(Main2Activity.this,
                        "  Player 2 Wins!  ", Toast.LENGTH_LONG).show();
                p2Score++;
                ShowHighScoreDBox("Player 2 Wins!");


                i++;

            }
            else
                i=1;

        }
        else {
            if (draw==9) {
                ShowHighScoreDBox("Its a DRAW!");
                Toast.makeText(Main2Activity.this,"   D. R. A. W  !! ",Toast.LENGTH_LONG).show();
                player=1;
                draw=0;
                i=0;
            }


        }
        ScoreUpdate();


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        wosh= MediaPlayer.create(Main2Activity.this,R.raw.wosh);

        wrongTone= MediaPlayer.create(Main2Activity.this,R.raw.wrong_ans);
        winningTone= MediaPlayer.create(Main2Activity.this,R.raw.winning_tone);

        Score1=(TextView)findViewById(R.id.Score1);
        Score2=(TextView)findViewById(R.id.Score2);
        button0=(ImageButton)findViewById(R.id.button0);
        button1=(ImageButton)findViewById(R.id.button1);
        button2=(ImageButton)findViewById(R.id.button2);
        button3=(ImageButton)findViewById(R.id.button3);
        button4=(ImageButton)findViewById(R.id.button4);
        button5=(ImageButton)findViewById(R.id.button5);
        button6=(ImageButton)findViewById(R.id.button6);
        button7=(ImageButton)findViewById(R.id.button7);
        button8=(ImageButton)findViewById(R.id.button8);
        buttonReset=(ImageButton)findViewById(R.id.reset);
        buttonTurn=(ImageButton)findViewById(R.id.Turn);
        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i = 0; i < 9; i++)
                    buttonI[i] = 0;
                for (int i = 0; i < 9; i++)
                    button[i] = '\0';
                draw = 0;
                wosh.start();
                button0.setBackgroundColor(Color.BLACK);
                button1.setBackgroundColor(Color.BLACK);
                button2.setBackgroundColor(Color.BLACK);
                button3.setBackgroundColor(Color.BLACK);
                button4.setBackgroundColor(Color.BLACK);
                button5.setBackgroundColor(Color.BLACK);
                button6.setBackgroundColor(Color.BLACK);
                button7.setBackgroundColor(Color.BLACK);
                button8.setBackgroundColor(Color.BLACK);
                i = 0;

                Random r = new Random();

                player = r.nextInt(2);



                }

        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (buttonI[0] == 0 && player == 0) {
                    button0.setBackgroundResource(R.drawable.x);

                    button[0] = 'x';
                    buttonI[0] = 1;
                    checkWin();
                    player = 1;
                    Turn();
                    wosh.start();


                } else if (buttonI[0] == 0 && player == 1) {
                    button0.setBackgroundResource(R.drawable.o);
                    button[0] = 'o';
                    buttonI[0] = 1;
                    checkWin();
                    player = 0;
                    Turn();


                }

            }
            });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (buttonI[1]==0&& player==0) {
                    button1.setBackgroundResource(R.drawable.x);
                    button[1]='x';
                    player=1; wosh.start();
                    buttonI[1]=1;
                    checkWin();
                    Turn();

                }

                else if (buttonI[1]==0&& player==1) {
                    button1.setBackgroundResource(R.drawable.o);

                    player=0;
                    button[1]='o';

                    buttonI[1]=1;
                    checkWin();
                    Turn();



                }
            }


    });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {

                wosh.start();
                if (buttonI[2]==0&& player==0) {
                    button2.setBackgroundResource(R.drawable.x);

                    button[2]='x';

                    buttonI[2]=1;
                    checkWin();
                    player=1;
                    Turn();

                }

                else if (buttonI[2]==0&& player==1) {
                    button2.setBackgroundResource(R.drawable.o);

                    button[2]='o';

                    buttonI[2]=1;
                    checkWin();
                    player=0;
                    Turn();

                }}});

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wosh.start();
                if (buttonI[3]==0&& player==0) {
                    button3.setBackgroundResource(R.drawable.x);
                    player=1;
                    button[3]='x';

                    buttonI[3]=1;
                    checkWin();
                    Turn();

                }

                else if (buttonI[3]==0&& player==1) {
                    button3.setBackgroundResource(R.drawable.o);
                    player=0;
                    button[3]='o';

                    buttonI[3]=1;
                    checkWin();
                    Turn();
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }}});

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (buttonI[4] == 0 && player == 0) {
                    button4.setBackgroundResource(R.drawable.x);
                    wosh.start();
                    button[4] = 'x';

                    buttonI[4] = 1;

                    checkWin();
                    player = 1;
                    Turn();

                } else if (buttonI[4] == 0 && player == 1) {
                    button4.setBackgroundResource(R.drawable.o);
                    button[4] = 'o';

                    buttonI[4] = 1;

                    checkWin();
                    player = 0;
                    Turn();


                }
            }});
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (buttonI[5] == 0 && player == 0) {
                    wosh.start();
                    button5.setBackgroundResource(R.drawable.x);
                    player = 1;
                    button[5] = 'x';

                    buttonI[5] = 1;
                    checkWin();
                    Turn();

                } else if (buttonI[5] == 0 && player == 1) {
                    button5.setBackgroundResource(R.drawable.o);
                    player = 0;
                    button[5] = 'o';

                    buttonI[5] = 1;
                    checkWin();

                }
            }
        });


        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wosh.start();
                if (buttonI[6] == 0 && player == 0) {
                    button6.setBackgroundResource(R.drawable.x);
                    player = 1;
                    button[6] = 'x';

                    buttonI[6] = 1;
                    checkWin();
                    Turn();
                } else if (buttonI[6] == 0 && player == 1) {
                    button6.setBackgroundResource(R.drawable.o);
                    player = 0;
                    button[6] = 'o';

                    buttonI[6] = 1;
                    checkWin();
                    Turn();

                }

            }
        });


        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wosh.start();
                if (buttonI[7]==0&& player==0) {
                    button7.setBackgroundResource(R.drawable.x);
                    player=1;
                    button[7]='x';
                    buttonI[7]=1;
                    checkWin();
                    Turn();
                }

                else if (buttonI[7]==0&& player==1) {
                    button7.setBackgroundResource(R.drawable.o);
                    player=0;
                    button[7]='o';

                    buttonI[7]=1;

                    checkWin();
                    Turn();
                }




                Turn();
            }
        });


        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (buttonI[8]==0&& player==0) {
                    button8.setBackgroundResource(R.drawable.x);
                    player=1;
                    wosh.start();

                    button[8]='x';
                    Turn();
                    buttonI[8]=1;
                    checkWin();
                    Turn();

                }

                else if (buttonI[8]==0&& player==1) {
                    button8.setBackgroundResource(R.drawable.o);
                    player=0;
                    button[8]='o';
                    buttonI[8]=1;

                    checkWin();
                    Turn();

                }


            }
        });



    }
    public boolean ShowHighScoreDBox(String cato) {

        final Dialog de = new Dialog(Main2Activity.this);

        de.setTitle("Highest Score");
        de.setContentView(R.layout.highscore_box);
        HSscores=(TextView)de.findViewById(R.id.HSshow);

        HSscores.setText("     " +cato + "    ");
        btnBack = (Button)de.findViewById(R.id.btn_back);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent i=new Intent(Main2Activity.this,Main3Activity.class);
                buttonReset.performClick();
                startActivity(i);
                de.dismiss();
            }

        });

        btnPlayAgain = (Button)de.findViewById(R.id.btn_playagain);
        btnPlayAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               buttonReset.performClick();
                de.dismiss();
            }

        });

        de.show();
        return true;
    }
    @Override
    public void onBackPressed() {
        wosh.start();
        super.onBackPressed();
buttonReset.performClick();
        Intent i=new Intent(this,Main3Activity.class);
        startActivity(i);

    }
}
