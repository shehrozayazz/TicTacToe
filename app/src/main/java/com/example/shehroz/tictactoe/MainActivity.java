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
public class MainActivity extends AppCompatActivity {
    static char button[]=new char[9];
    static int buttonI[]=new int[9];
    static  int player=0;
    TextView HSscores;

    Button btnBack,btnPlayAgain;
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
                ShowHighScoreDBox(" YOU  WIN!!");
                Toast.makeText(MainActivity.this,
                        "  Y.O.U  WIN!!  ", Toast.LENGTH_LONG).show();
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
                ShowHighScoreDBox(" YOU  WIN!!  ");
                Toast.makeText(MainActivity.this,
                        "  Y.O.U  WIN!!  ", Toast.LENGTH_LONG).show();

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
                ShowHighScoreDBox(" YOU  WIN!!  ");
                Toast.makeText(MainActivity.this,
                        "  Y.O.U  WIN!!  ", Toast.LENGTH_LONG).show();
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
                ShowHighScoreDBox(" YOU  WIN!!  ");
                Toast.makeText(MainActivity.this,
                        "  Y.O.U  WIN!!  ", Toast.LENGTH_LONG).show();
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
                ShowHighScoreDBox(" YOU  WIN!!  ");
                Toast.makeText(MainActivity.this,
                        "  Y.O.U  WIN!!  ", Toast.LENGTH_LONG).show();

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
                ShowHighScoreDBox(" YOU  WIN!!  ");
                Toast.makeText(MainActivity.this,
                        "  Y.O.U  WIN!!  ", Toast.LENGTH_LONG).show();
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
                ShowHighScoreDBox(" YOU  WIN!!  ");
                SetNull(); winningTone.start();
                Toast.makeText(MainActivity.this,
                        "  Y.O.U  WIN!!  ", Toast.LENGTH_LONG).show();
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
                ShowHighScoreDBox(" YOU  WIN!!  ");
                Toast.makeText(MainActivity.this,
                        "  Y.O.U  WIN!!  ", Toast.LENGTH_LONG).show();

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
                ShowHighScoreDBox(" YOU  LOSE!!  ");
                Toast.makeText(MainActivity.this,
                        "  Y.O.U  LOSE!!  ", Toast.LENGTH_LONG).show();
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
                ShowHighScoreDBox("  YOU  LOSE!!  ");
                Toast.makeText(MainActivity.this,
                        "  Y.O.U  LOSE!!  ", Toast.LENGTH_LONG).show();
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
                ShowHighScoreDBox(" YOU  LOSE!! ");
                Toast.makeText(MainActivity.this,
                        "  Y.O.U  LOSE!!  ", Toast.LENGTH_LONG).show();
                p2Score++;

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
                ShowHighScoreDBox(" YOU  LOSE!! ");
                Toast.makeText(MainActivity.this,
                        "  Y.O.U  LOSE!!  ", Toast.LENGTH_LONG).show();
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
                ShowHighScoreDBox(" YOU  LOSE!! ");

                Toast.makeText(MainActivity.this,
                        "  Y.O.U  LOSE!!  ", Toast.LENGTH_LONG).show();
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
                ShowHighScoreDBox(" YOU  LOSE!! ");

                Toast.makeText(MainActivity.this,
                        "  Y.O.U  LOSE!!  ", Toast.LENGTH_LONG).show();
                p2Score++;

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
                ShowHighScoreDBox(" YOU  LOSE!! ");

                Toast.makeText(MainActivity.this,
                        "  Y.O.U  LOSE!!  ", Toast.LENGTH_LONG).show();
                p2Score++;

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
                ShowHighScoreDBox(" YOU  LOSE!! ");

                Toast.makeText(MainActivity.this,
                        "  Y.O.U  LOSE!!  ", Toast.LENGTH_LONG).show();
                p2Score++;


                i++;

            }
            else
                i=1;

        }
        else {
            if (draw==9) {
                ShowHighScoreDBox("    DRAW!!   ");

                Toast.makeText(MainActivity.this,"   D. R. A. W  !! ",Toast.LENGTH_LONG).show();
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
        setContentView(R.layout.activity_main);
        wosh= MediaPlayer.create(MainActivity.this,R.raw.wosh);

        wrongTone= MediaPlayer.create(MainActivity.this,R.raw.wrong_ans);
        winningTone= MediaPlayer.create(MainActivity.this,R.raw.winning_tone);

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
                if (player == 1) {
                    int x;
                    x = 1 + r.nextInt(8);
                    switch (x) {


                        case 1: {
                            button0.performClick();
                            break;
                        }
                        case 2: {
                            button4.performClick();
                            break;
                        }
                        case 3: {
                            button2.performClick();
                            break;
                        }
                        case 4: {
                            button2.performClick();
                            break;
                        }
                        case 5: {
                            button4.performClick();
                            break;
                        }
                        case 6: {
                            button6.performClick();
                            break;
                        }
                        case 7: {
                            button6.performClick();
                            break;
                        }

                        case 8: {
                            button8.performClick();
                            break;
                        }
                        case 9: {
                            button8.performClick();
                            break;
                        }
                    }
           }
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




                if (buttonI[1] == 0 && buttonI[2] == 0 && buttonI[3] == 0 && buttonI[4] == 0 && button[5] == 0 && buttonI[6] == 0 && buttonI[7] == 0 && buttonI[8] == 0 && player == 1) {
                    button8.performClick();
                }
//                       %%%%%%%%%%%%%%%%%% %%%%%%%%%%%%%%%%%%%%%        Winning check

                else if (button[0] == 'o' && button[1] == 'o' && buttonI[2] == 0 && player == 1)
                    button2.performClick();

                else if (button[1] == 'o' && button[2] == 'o' && buttonI[0] == 0 && player == 1)
                    button0.performClick();

                else if (button[3] == 'o' && button[4] == 'o' && buttonI[5] == 0 && player == 1)
                    button5.performClick();
                else if (button[3] == 'o' && button[5] == 'o' && buttonI[4] == 0 && player == 1)
                    button4.performClick();
                else if (button[4] == 'o' && button[5] == 'o' && buttonI[3] == 0 && player == 1)
                    button3.performClick();
                else if (button[0] == 'o' && button[2] == 'o' && buttonI[1] == 0 && player == 1)
                    button1.performClick();


                else if (button[6] == 'o' && button[7] == 'o' && buttonI[8] == 0 && player == 1)
                    button8.performClick();
                else if (button[6] == 'o' && button[8] == 'o' && buttonI[7] == 0 && player == 1)
                    button7.performClick();
                else if (button[8] == 'o' && button[7] == 'o' && buttonI[6] == 0 && player == 1)
                    button6.performClick();


                else if (button[0] == 'o' && button[3] == 'o' && buttonI[6] == 0 && player == 1)
                    button6.performClick();
                else if (button[0] == 'o' && button[6] == 'o' && buttonI[3] == 0 && player == 1)
                    button3.performClick();
                else if (button[6] == 'o' && button[3] == 'o' && buttonI[0] == 0 && player == 1)
                    button0.performClick();

                else if (button[1] == 'o' && button[4] == 'o' && buttonI[7] == 0 && player == 1)
                    button7.performClick();
                else if (button[1] == 'o' && button[7] == 'o' && buttonI[4] == 0 && player == 1)
                    button4.performClick();
                else if (button[7] == 'o' && button[4] == 'o' && buttonI[1] == 0 && button[0] == 'x' && button[3] == 'x' && button[6] == 'x' && player == 1)
                    button3.performClick();
                else if (button[7] == 'o' && button[4] == 'o' && buttonI[1] == 0 && player == 1)
                    button1.performClick();

                else if (button[2] == 'o' && button[5] == 'o' && buttonI[8] == 0 && player == 1)
                    button8.performClick();
                else if (button[2] == 'o' && button[8] == 'o' && buttonI[5] == 0 && player == 1)
                    button5.performClick();
                else if (button[8] == 'o' && button[5] == 'o' && buttonI[2] == 0 && player == 1)
                    button2.performClick();


                else if (button[0] == 'o' && button[4] == 'o' && buttonI[8] == 0 && player == 1)
                    button8.performClick();
                else if (button[0] == 'o' && button[8] == 'o' && buttonI[4] == 0 && player == 1)
                    button4.performClick();
                else if (button[8] == 'o' && button[4] == 'o' && buttonI[0] == 0 && player == 1)
                    button0.performClick();


                else if (button[2] == 'o' && button[4] == 'o' && buttonI[6] == 0 && player == 1)
                    button6.performClick();
                else if (button[2] == 'o' && button[6] == 'o' && buttonI[4] == 0 && player == 1)
                    button4.performClick();
                else if (button[6] == 'o' && button[4] == 'o' && buttonI[2] == 0 && player == 1)
                    button2.performClick();

                    // bgfg gn ng

                else if (button[0] == 'x' && button[4] == 'x' && buttonI[8] == 0 && player == 1) {

                    button8.performClick();
                } else if (button[0] == 'x' && button[6] == 'x' && buttonI[3] == 0 && player == 1) {

                    button3.performClick();
                } else if (button[0] == 'x' && button[1] == 'x' && buttonI[2] == 0 && player == 1) {

                    button2.performClick();
                } else if (button[1] == 'x' && button[4] == 'x' && buttonI[7] == 0 && player == 1) {

                    button7.performClick();
                } else if (button[1] == 'x' && button[7] == 'x' && buttonI[4] == 0 && player == 1) {

                    button4.performClick();
                } else if (button[7] == 'x' && button[4] == 'x' && buttonI[1] == 0 && player == 1) {

                    button1.performClick();
                } else if (button[7] == 'x' && button[4] == 'x' && buttonI[1] == 0 && player == 1) {

                    button1.performClick();
                } else if (button[1] == 'x' && buttonI[2] == 0 && player == 1) {
                    button2.performClick();
                } else if (button[6] == 'x' && buttonI[3] == 0 && player == 1) {
                    button3.performClick();
                } else if (button[0] == 'x' && button[3] == 'x' && buttonI[6] == 0 && player == 1) {

                    button6.performClick();
                } else if (button[3] == 'x' && buttonI[6] == 0 && player == 1) {
                    button6.performClick();
                } else if (button[8] == 'x' && buttonI[4] == 0 && player == 1) {
                    button4.performClick();
                } else if (button[4] == 'x' && buttonI[8] == 0 && player == 1) {
                    button8.performClick();
                } else if (button[2] == 'x' && buttonI[1] == 0 && player == 1) {

                    button1.performClick();
                }


                // ATTACK



                else if (buttonI[8] == 0 && player == 1) {
                    button8.performClick();
                } else if (buttonI[2] == 0 && player == 1) {
                    button2.performClick();
                } else if (buttonI[6] == 0 && player == 1) {
                    button6.performClick();
                } else if (buttonI[7] == 0 && player == 1) {
                    button7.performClick();
                } else if (buttonI[1] == 0 && player == 1) {
                    button1.performClick();
                } else if (buttonI[5] == 0 && player == 1) {
                    button5.performClick();
                } else if (buttonI[3] == 0 && player == 1) {
                    button3.performClick();
                } else if (buttonI[4] == 0 && player == 1) {
                    button4.performClick();
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

                if (buttonI[0]==0&& buttonI[2]==0&& buttonI[3]==0&& buttonI[4]==0&& button[5]==0&& buttonI[6]==0&& buttonI[7]==0&& buttonI[8]==0&&player==1){

                    button6.performClick();
                }
//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%        Winning check

                else if (button[0]=='o'&&button[1]=='o'&& buttonI[2]==0&&player==1)
                    button2.performClick();
                else if (button[0]=='o'&&button[2]=='o'&& buttonI[1]==0&&player==1)
                    button1.performClick();
                else if (button[1]=='o'&&button[2]=='o'&& buttonI[0]==0&&player==1)
                    button0.performClick();


                else if (button[3]=='o'&&button[4]=='o'&& buttonI[5]==0&&player==1)
                    button5.performClick();
                else if (button[3]=='o'&&button[5]=='o'&& buttonI[4]==0&&player==1)
                    button4.performClick();
                else if (button[4]=='o'&&button[5]=='o'&& buttonI[3]==0&&player==1)
                    button3.performClick();



                else if (button[6]=='o'&&button[7]=='o'&& buttonI[8]==0&&player==1)
                    button8.performClick();
                else if (button[6]=='o'&&button[8]=='o'&& buttonI[7]==0&&player==1)
                    button7.performClick();
                else if (button[8]=='o'&&button[7]=='o'&& buttonI[6]==0&&player==1)
                    button6.performClick();


                else if (button[0]=='o'&&button[3]=='o'&& buttonI[6]==0&&player==1)
                    button6.performClick();
                else if (button[0]=='o'&&button[6]=='o'&& buttonI[3]==0&&player==1)
                    button3.performClick();
                else if (button[6]=='o'&&button[3]=='o'&& buttonI[0]==0&&player==1)
                    button0.performClick();

                else if (button[1]=='o'&&button[4]=='o'&& buttonI[7]==0&&player==1)
                    button7.performClick();
                else if (button[1]=='o'&&button[7]=='o'&& buttonI[4]==0&&player==1)
                    button4.performClick();
                else if (button[7]=='o'&&button[4]=='o'&& buttonI[1]==0&&player==1)
                    button1.performClick();

                else if (button[2]=='o'&&button[5]=='o'&& buttonI[8]==0&&player==1)
                    button8.performClick();
                else if (button[2]=='o'&&button[8]=='o'&& buttonI[5]==0&&player==1)
                    button5.performClick();
                else if (button[8]=='o'&&button[5]=='o'&& buttonI[2]==0&&player==1)
                    button2.performClick();




                else if (button[0]=='o'&&button[4]=='o'&& buttonI[8]==0&&player==1)
                    button8.performClick();
                else if (button[0]=='o'&&button[8]=='o'&& buttonI[4]==0&&player==1)
                    button4.performClick();
                else if (button[8]=='o'&&button[4]=='o'&& buttonI[0]==0&&player==1)
                    button0.performClick();



                else if (button[2]=='o'&&button[4]=='o'&& buttonI[6]==0&&player==1)
                    button6.performClick();
                else if (button[2]=='o'&&button[6]=='o'&& buttonI[4]==0&&player==1)
                    button4.performClick();
                else if (button[6]=='o'&&button[4]=='o'&& buttonI[2]==0&&player==1)
                    button2.performClick();

                    // bgfg gn ng


                    // Main
                else if (button[4]=='x'&&button[1]=='x'&& buttonI[7]==0&&player==1)
                    button7.performClick();
                else if (button[7]=='x'&& buttonI[4]==0&&player==1)
                    button4.performClick();
                else if (button[1]=='x'&& button[4]=='x'&&button[7]=='x'&& buttonI[6]==0 &&player==1)
                    button6.performClick();

                else if (button[0]=='x'&& buttonI[2]==0&&player==1)
                    button2.performClick();
                else if (button[2]=='x'&& buttonI[0]==0&&player==1)
                    button0.performClick();
                else if (button[1]=='x'&& buttonI[6]==0&&player==1)
                    button6.performClick();
                else if (button[7]=='x'&& buttonI[1]==0&&player==1)
                    button1.performClick();
                    //fdfvdfd


                    // ATTACK
                else if (button[0]=='o'&&button[2]=='o'&& button[1]=='x'&&buttonI[6]==0&&player==1)
                    button6.performClick();

                else if (button[0]=='o'&&button[2]=='o'&& button[1]=='x'&&buttonI[6]==0&&player==1)
                    button6.performClick();
                else if (buttonI[6]==0&& player==1) {
                    button6.performClick();}
                else if (buttonI[8]==0&& player==1) {
                    button8.performClick();}

                else if (buttonI[6]==0&& player==1) {
                    button6.performClick();}


                else if (buttonI[4]==0&& player==1) {
                    button4.performClick();}
                else if (buttonI[5]==0&& player==1) {
                    button5.performClick();}
                else if (buttonI[3]==0&& player==1) {
                    button3.performClick();}
                else if (buttonI[0]==0&&  player==1) {
                    button0.performClick();}
                else if (buttonI[7]==0&& player==1) {
                    button7.performClick();}



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

                }
                if (buttonI[0]==0&&buttonI[1]==0&& player==1 && buttonI[3]==0&& buttonI[4]==0&& button[5]==0&& buttonI[6]==0&& buttonI[7]==0&& buttonI[8]==0){

                    button6.performClick();
                }

//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%        Winning check

                else if (button[0]=='o'&&button[1]=='o'&& buttonI[2]==0&&player==1)
                    button2.performClick();
                else if (button[0]=='o'&&button[2]=='o'&& buttonI[1]==0&&player==1)
                    button1.performClick();
                else if (button[1]=='o'&&button[2]=='o'&& buttonI[0]==0&&player==1)
                    button0.performClick();

                else if (button[3]=='o'&&button[4]=='o'&& buttonI[5]==0&&player==1)
                    button5.performClick();
                else if (button[3]=='o'&&button[5]=='o'&& buttonI[4]==0&&player==1)
                    button4.performClick();
                else if (button[4]=='o'&&button[5]=='o'&& buttonI[3]==0&&player==1)
                    button3.performClick();



                else if (button[6]=='o'&&button[7]=='o'&& buttonI[8]==0&&player==1)
                    button8.performClick();
                else if (button[6]=='o'&&button[8]=='o'&& buttonI[7]==0&&player==1)
                    button7.performClick();
                else if (button[8]=='o'&&button[7]=='o'&& buttonI[6]==0&&player==1)
                    button6.performClick();


                else if (button[0]=='o'&&button[3]=='o'&& buttonI[6]==0&&player==1)
                    button6.performClick();
                else if (button[0]=='o'&&button[6]=='o'&& buttonI[3]==0&&player==1)
                    button3.performClick();
                else if (button[6]=='o'&&button[3]=='o'&& buttonI[0]==0&&player==1)
                    button0.performClick();

                else if (button[1]=='o'&&button[4]=='o'&& buttonI[7]==0&&player==1)
                    button7.performClick();
                else if (button[1]=='o'&&button[7]=='o'&& buttonI[4]==0&&player==1)
                    button4.performClick();
                else if (button[7]=='o'&&button[4]=='o'&& buttonI[1]==0&&player==1)
                    button1.performClick();

                else if (button[2]=='o'&&button[5]=='o'&& buttonI[8]==0&&player==1)
                    button8.performClick();
                else if (button[2]=='o'&&button[8]=='o'&& buttonI[5]==0&&player==1)
                    button5.performClick();
                else if (button[8]=='o'&&button[5]=='o'&& buttonI[2]==0&&player==1)
                    button2.performClick();




                else if (button[0]=='o'&&button[4]=='o'&& buttonI[8]==0&&player==1)
                    button8.performClick();
                else if (button[0]=='o'&&button[8]=='o'&& buttonI[4]==0&&player==1)
                    button4.performClick();
                else if (button[8]=='o'&&button[4]=='o'&& buttonI[0]==0&&player==1)
                    button0.performClick();



                else if (button[2]=='o'&&button[4]=='o'&& buttonI[6]==0&&player==1)
                    button6.performClick();
                else if (button[2]=='o'&&button[6]=='o'&& buttonI[4]==0&&player==1)
                    button4.performClick();
                else if (button[6]=='o'&&button[4]=='o'&& buttonI[2]==0&&player==1)
                    button2.performClick();

                    // bgfg gn ng
// Main
                else if (button[0]=='x'&& buttonI[1]==0&&player==1)
                    button1.performClick();
                else if (button[1]=='x'&& buttonI[0]==0&&player==1)
                    button0.performClick();
                else if (button[5]=='x'&& buttonI[8]==0&&player==1)
                    button8.performClick();
                else if (button[8]=='x'&& buttonI[5]==0&&player==1)
                    button5.performClick();
                else if (button[4]=='x'&& buttonI[6]==0&&player==1)
                    button6.performClick();
                else if (button[6]=='x'&& buttonI[4]==0&&player==1)
                    button4.performClick();
                else if (button[6]=='x'&& button[4]=='o'&& buttonI[1]==0&&player==1) {

                    button1.performClick();
                }
                //FVGFGFGV

                // ATTACK


                else if (buttonI[6]==0&& player==1) {
                    button6.performClick();}

                else if (buttonI[8]==0&& player==1) {
                    button8.performClick();}
                else if (buttonI[7]==0&& player==1) {
                    button7.performClick();}
                else if (buttonI[0]==0&& player==1) {
                    button0.performClick();}
                else if (buttonI[1]==0&& player==1) {
                    button1.performClick();}
                else if (buttonI[5]==0&& player==1) {
                    button5.performClick();}
                else if (buttonI[4]==0 &&  player==1) {
                    button4.performClick();}
            }
        });




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
                }

                if (buttonI[0]==0&&buttonI[1]==0&& buttonI[2]==0&& player==1&& buttonI[4]==0&& button[5]==0&& buttonI[6]==0&& buttonI[7]==0&& buttonI[8]==0){


                    button2.performClick();
                }
//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%        Winning check

                else if (button[0]=='o'&&button[1]=='o'&& buttonI[2]==0&&player==1)
                    button2.performClick();
                else if (button[0]=='o'&&button[2]=='o'&& buttonI[1]==0&&player==1)
                    button1.performClick();
                else if (button[1]=='o'&&button[2]=='o'&& buttonI[0]==0&&player==1)
                    button0.performClick();

                else if (button[3]=='o'&&button[4]=='o'&& buttonI[5]==0&&player==1)
                    button5.performClick();
                else if (button[3]=='o'&&button[5]=='o'&& buttonI[4]==0&&player==1)
                    button4.performClick();
                else if (button[4]=='o'&&button[5]=='o'&& buttonI[3]==0&&player==1)
                    button3.performClick();



                else if (button[6]=='o'&&button[7]=='o'&& buttonI[8]==0&&player==1)
                    button8.performClick();
                else if (button[6]=='o'&&button[8]=='o'&& buttonI[7]==0&&player==1)
                    button7.performClick();
                else if (button[8]=='o'&&button[7]=='o'&& buttonI[6]==0&&player==1)
                    button6.performClick();


                else if (button[0]=='o'&&button[3]=='o'&& buttonI[6]==0&&player==1)
                    button6.performClick();
                else if (button[0]=='o'&&button[6]=='o'&& buttonI[3]==0&&player==1)
                    button3.performClick();
                else if (button[6]=='o'&&button[3]=='o'&& buttonI[0]==0&&player==1)
                    button0.performClick();
                else if (button[1]=='o'&&button[4]=='o'&& buttonI[7]==0&&player==1)
                    button7.performClick();
                else if (button[1]=='o'&&button[7]=='o'&& buttonI[4]==0&&player==1)
                    button4.performClick();
                else if (button[7]=='o'&&button[4]=='o'&& buttonI[1]==0&&player==1)
                    button1.performClick();

                else if (button[2]=='o'&&button[5]=='o'&& buttonI[8]==0&&player==1)
                    button8.performClick();
                else if (button[2]=='o'&&button[8]=='o'&& buttonI[5]==0&&player==1)
                    button5.performClick();
                else if (button[8]=='o'&&button[5]=='o'&& buttonI[2]==0&&player==1)
                    button2.performClick();




                else if (button[0]=='o'&&button[4]=='o'&& buttonI[8]==0&&player==1)
                    button8.performClick();
                else if (button[0]=='o'&&button[8]=='o'&& buttonI[4]==0&&player==1)
                    button4.performClick();
                else if (button[8]=='o'&&button[4]=='o'&& buttonI[0]==0&&player==1)
                    button0.performClick();
                else if (button[2]=='o'&&button[4]=='o'&& buttonI[6]==0&&player==1)
                    button6.performClick();
                else if (button[2]=='o'&&button[6]=='o'&& buttonI[4]==0&&player==1)
                    button4.performClick();
                else if (button[6]=='o'&&button[4]=='o'&& buttonI[2]==0&&player==1)
                    button2.performClick();
                    // bgfg gn ng


                    //defensive
                else if (button[0]=='x'&& buttonI[6]==0&&player==1)
                    button6.performClick();
                else if (button[6]=='x'&& buttonI[0]==0&&player==1)
                    button0.performClick();
                else if (button[4]=='x'&& buttonI[5]==0&&player==1)
                    button5.performClick();
                else if (button[5]=='x'&& buttonI[4]==0&&player==1)
                    button4.performClick();
                    //   rvgfgbggb

                    //  ATTACK
                else if (buttonI[8]==0&& player==1) {
                    button8.performClick();}
                else if (buttonI[0]==0&& player==1) {
                    button0.performClick();}
                else if (buttonI[6]==0&& player==1) {
                    button6.performClick();}
                else if (buttonI[7]==0&& player==1) {
                    button7.performClick();}

                else if (buttonI[2]==0&& player==1) {
                    button2.performClick();}



                else if (buttonI[1]==0&& player==1) {
                    button1.performClick();}
                else if (buttonI[5]==0&& player==1) {
                    button5.performClick();}
            }

        });



        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (buttonI[4]==0&& player==0) {
                    button4.setBackgroundResource(R.drawable.x);
                 wosh.start();
                    button[4]='x';

                    buttonI[4]=1;

                    checkWin();
                    player=1;
                    Turn();

                }

                else if (buttonI[4]==0&& player==1) {
                    button4.setBackgroundResource(R.drawable.o);
                    button[4]='o';

                    buttonI[4]=1;

                    checkWin();
                    player=0;
                    Turn();


                }

                if (buttonI[0]==0&&buttonI[1]==0&& buttonI[2]==0&& buttonI[3]==0&& player==1 && button[5]==0&& buttonI[6]==0&& buttonI[7]==0&& buttonI[8]==0){

                    button0.performClick();
                }	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%        Winning check

                else if (button[0]=='o'&&button[1]=='o'&& buttonI[2]==0&&player==1)
                    button2.performClick();
                else if (button[0]=='o'&&button[2]=='o'&& buttonI[1]==0&&player==1)
                    button1.performClick();
                else if (button[1]=='o'&&button[2]=='o'&& buttonI[0]==0&&player==1)
                    button0.performClick();
                else if (button[3]=='o'&&button[4]=='o'&& buttonI[5]==0&&player==1)
                    button5.performClick();
                else if (button[3]=='o'&&button[5]=='o'&& buttonI[4]==0&&player==1)
                    button4.performClick();
                else if (button[4]=='o'&&button[5]=='o'&& buttonI[3]==0&&player==1)
                    button3.performClick();


                else if (button[6]=='o'&&button[7]=='o'&& buttonI[8]==0&&player==1)
                    button8.performClick();
                else if (button[6]=='o'&&button[8]=='o'&& buttonI[7]==0&&player==1)
                    button7.performClick();
                else if (button[8]=='o'&&button[7]=='o'&& buttonI[6]==0&&player==1)
                    button6.performClick();


                else if (button[0]=='o'&&button[3]=='o'&& buttonI[6]==0&&player==1)
                    button6.performClick();
                else if (button[0]=='o'&&button[6]=='o'&& buttonI[3]==0&&player==1)
                    button3.performClick();
                else if (button[6]=='o'&&button[3]=='o'&& buttonI[0]==0&&player==1)
                    button0.performClick();

                else if (button[1]=='o'&&button[4]=='o'&& buttonI[7]==0&&player==1)
                    button7.performClick();
                else if (button[1]=='o'&&button[7]=='o'&& buttonI[4]==0&&player==1)
                    button4.performClick();
                else if (button[7]=='o'&&button[4]=='o'&& buttonI[1]==0&&player==1)
                    button1.performClick();

                else if (button[2]=='o'&&button[5]=='o'&& buttonI[8]==0&&player==1)
                    button8.performClick();
                else if (button[2]=='o'&&button[8]=='o'&& buttonI[5]==0&&player==1)
                    button5.performClick();
                else if (button[8]=='o'&&button[5]=='o'&& buttonI[2]==0&&player==1)
                    button2.performClick();




                else if (button[0]=='o'&&button[4]=='o'&& buttonI[8]==0&&player==1)
                    button8.performClick();
                else if (button[0]=='o'&&button[8]=='o'&& buttonI[4]==0&&player==1)
                    button4.performClick();
                else if (button[8]=='o'&&button[4]=='o'&& buttonI[0]==0&&player==1)
                    button0.performClick();



                else if (button[2]=='o'&&button[4]=='o'&& buttonI[6]==0&&player==1)
                    button6.performClick();
                else if (button[2]=='o'&&button[6]=='o'&& buttonI[4]==0&&player==1)
                    button4.performClick();
                else if (button[6]=='o'&&button[4]=='o'&& buttonI[2]==0&&player==1)
                    button2.performClick();

                    // bgfg gn ng

                    // DEFENSIVE
                else if (button[2]=='x'&& button[6]=='o'&&buttonI[8]==0&&player==1)
                    button8.performClick();
                else if (button[1]=='x'&& button[7]=='x'&&buttonI[8]==0&&player==1)
                    button7.performClick();
                else if (button[2]=='x'&& buttonI[6]==0&&player==1)
                    button6.performClick();
                else if (button[6]=='x'&& buttonI[2]==0&&player==1)
                    button2.performClick();
                else if (button[0]=='x'&& buttonI[8]==0&&player==1)
                    button8.performClick();
                else if (button[8]=='x'&& buttonI[0]==0&&player==1)
                    button0.performClick();
                else if (button[3]=='x'&& buttonI[5]==0&&player==1)
                    button5.performClick();
                else if (button[5]=='x'&& buttonI[3]==0&&player==1)
                    button3.performClick();
                else if (button[1]=='x'&& buttonI[7]==0&&player==1)
                    button7.performClick();
                else if (button[7]=='x'&& buttonI[1]==0&&player==1)
                    button1.performClick();

//   ATTACK
                else if (button[4] == 'x'  && player == 1 &&( buttonI[0] != 0 || buttonI[1] != 0||buttonI[2] != 0)) {

                    button7.performClick();
                }
                else if (button[4] == 'x' && buttonI[1] == 0 && player == 1) {

                    button1.performClick();
                }

                else if (button[4] == 'x' && buttonI[5] == 0 && player == 1) {

                    button5.performClick();
                }
                else if (button[4] == 'x' && buttonI[7] == 0 && player == 1) {

                    button7.performClick();
                }
                else if (buttonI[8]==0&& player==1) {
                    button8.performClick();}
                else if (buttonI[2]==0&& player==1) {
                    button2.performClick();}

                else if (buttonI[6]==0&& player==1) {
                    button6.performClick();}
                else if (buttonI[7]==0&& player==1) {
                    button7.performClick();}
                else if (buttonI[1]==0&& player==1) {
                    button1.performClick();}
                else if (buttonI[5]==0&& player==1) {
                    button5.performClick();}
                else if (buttonI[0]==0&& player==1) {
                    button0.performClick();}


            }
        });


        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (buttonI[5]==0&& player==0) {
                    wosh.start();
                    button5.setBackgroundResource(R.drawable.x);
                    player=1;
                    button[5]='x';

                    buttonI[5]=1;
                    checkWin();
                    Turn();

                }

                else if (buttonI[5]==0&& player==1) {
                    button5.setBackgroundResource(R.drawable.o);
                    player=0;
                    button[5]='o';

                    buttonI[5]=1;
                    checkWin();

                }
                if (buttonI[0]==0&&buttonI[1]==0&& buttonI[2]==0&& buttonI[3]==0&& buttonI[4]==0&& player==1 && buttonI[6]==0&& buttonI[7]==0&& buttonI[8]==0){

                    button6.performClick();
                }
//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%        Winning check

                else if (button[0]=='o'&&button[1]=='o'&& buttonI[2]==0&&player==1)
                    button2.performClick();
                else if (button[0]=='o'&&button[2]=='o'&& buttonI[1]==0&&player==1)
                    button1.performClick();

                else if (button[1]=='o'&&button[2]=='o'&& buttonI[0]==0&&player==1)
                    button0.performClick();


                else if (button[3]=='o'&&button[4]=='o'&& buttonI[5]==0&&player==1)
                    button5.performClick();

                else if (button[3]=='o'&&button[5]=='o'&& buttonI[4]==0&&player==1)
                    button4.performClick();

                else if (button[4]=='o'&&button[5]=='o'&& buttonI[3]==0&&player==1)
                    button3.performClick();

                else if (button[6]=='o'&&button[7]=='o'&& buttonI[8]==0&&player==1)
                    button8.performClick();

                else if (button[6]=='o'&&button[8]=='o'&& buttonI[7]==0&&player==1)
                    button7.performClick();

                else if (button[8]=='o'&&button[7]=='o'&& buttonI[6]==0&&player==1)
                    button6.performClick();

                else if (button[0]=='o'&&button[3]=='o'&& buttonI[6]==0&&player==1)
                    button6.performClick();

                else if (button[0]=='o'&&button[6]=='o'&& buttonI[3]==0&&player==1)
                    button3.performClick();

                else if (button[6]=='o'&&button[3]=='o'&& buttonI[0]==0&&player==1)
                    button0.performClick();


                else if (button[1]=='o'&&button[4]=='o'&& buttonI[7]==0&&player==1)
                    button7.performClick();

                else if (button[1]=='o'&&button[7]=='o'&& buttonI[4]==0&&player==1)
                    button4.performClick();

                else if (button[7]=='o'&&button[4]=='o'&& buttonI[1]==0&&player==1)
                    button1.performClick();


                else if (button[2]=='o'&&button[5]=='o'&& buttonI[8]==0&&player==1)
                    button8.performClick();

                else if (button[2]=='o'&&button[8]=='o'&& buttonI[5]==0&&player==1)
                    button5.performClick();

                else if (button[8]=='o'&&button[5]=='o'&& buttonI[2]==0&&player==1)
                    button2.performClick();





                else if (button[0]=='o'&&button[4]=='o'&& buttonI[8]==0&&player==1)
                    button8.performClick();

                else if (button[0]=='o'&&button[8]=='o'&& buttonI[4]==0&&player==1)
                    button4.performClick();

                else if (button[8]=='o'&&button[4]=='o'&& buttonI[0]==0&&player==1)
                    button0.performClick();



                else if (button[2]=='o'&&button[4]=='o'&& buttonI[6]==0&&player==1)
                    button6.performClick();

                else if (button[2]=='o'&&button[6]=='o'&& buttonI[4]==0&&player==1)
                    button4.performClick();

                else if (button[6]=='o'&&button[4]=='o'&& buttonI[2]==0&&player==1)
                    button2.performClick();


                    // bgfg gn ng



                    // Defensive
                else if (button[8]=='x'&& buttonI[2]==0&&player==1)
                    button2.performClick();



                else if (button[3]=='x'&& buttonI[4]==0&&player==1)
                    button4.performClick();

                else if (button[4]=='x'&& buttonI[3]==0&&player==1)
                    button3.performClick();
                else if (button[2]=='x'&& buttonI[8]==0&&player==1)
                    button8.performClick();
                    //rfvgrvrg

                    // fvdfvdfvdf
                else if (buttonI[8]==0&& player==1) {
                    button8.performClick();}
                else if (buttonI[0]==0&& player==1) {
                    button0.performClick();}

                else if (buttonI[2]==0&& player==1) {
                    button2.performClick();}

                else if (buttonI[6]==0&& player==1) {
                    button6.performClick();}
                else if (buttonI[7]==0&& player==1) {
                    button7.performClick();}
                else if (buttonI[1]==0&& player==1) {
                    button1.performClick();}
                else if (buttonI[5]==0&& player==1) {
                    button3.performClick();}




            }
        });


        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wosh.start();
                if (buttonI[6]==0&& player==0) {
                    button6.setBackgroundResource(R.drawable.x);
                    player=1;
                    button[6]='x';

                    buttonI[6]=1;
                    checkWin();
                    Turn();
                }

                else if (buttonI[6]==0&& player==1) {
                    button6.setBackgroundResource(R.drawable.o);
                    player=0;
                    button[6]='o';

                    buttonI[6]=1;
                    checkWin();
                    Turn();

                }
                if (buttonI[0]==0&&buttonI[1]==0&& buttonI[2]==0&& buttonI[3]==0&& buttonI[4]==0&& button[5]==0&& player==1&& buttonI[7]==0&& buttonI[8]==0){

                    button0.performClick();

                }
//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%        Winning check

                else if (button[0]=='o'&&button[1]=='o'&& buttonI[2]==0&&player==1)
                    button2.performClick();
                else if (button[0]=='o'&&button[2]=='o'&& buttonI[1]==0&&player==1)
                    button1.performClick();
                else if (button[1]=='o'&&button[2]=='o'&& buttonI[0]==0&&player==1)
                    button0.performClick();

                else if (button[3]=='o'&&button[4]=='o'&& buttonI[5]==0&&player==1)
                    button5.performClick();
                else if (button[3]=='o'&&button[5]=='o'&& buttonI[4]==0&&player==1)
                    button4.performClick();
                else if (button[4]=='o'&&button[5]=='o'&& buttonI[3]==0&&player==1)
                    button3.performClick();


                else if (button[6]=='o'&&button[7]=='o'&& buttonI[8]==0&&player==1)
                    button8.performClick();
                else if (button[6]=='o'&&button[8]=='o'&& buttonI[7]==0&&player==1)
                    button7.performClick();
                else if (button[8]=='o'&&button[7]=='o'&& buttonI[6]==0&&player==1)
                    button6.performClick();


                else if (button[0]=='o'&&button[3]=='o'&& buttonI[6]==0&&player==1)
                    button6.performClick();
                else if (button[0]=='o'&&button[6]=='o'&& buttonI[3]==0&&player==1)
                    button3.performClick();
                else if (button[6]=='o'&&button[3]=='o'&& buttonI[0]==0&&player==1)
                    button0.performClick();
                else if (button[1]=='o'&&button[4]=='o'&& buttonI[7]==0&&player==1)
                    button7.performClick();
                else if (button[1]=='o'&&button[7]=='o'&& buttonI[4]==0&&player==1)
                    button4.performClick();
                else if (button[7]=='o'&&button[4]=='o'&& buttonI[1]==0&&player==1)
                    button1.performClick();

                else if (button[2]=='o'&&button[5]=='o'&& buttonI[8]==0&&player==1)
                    button8.performClick();
                else if (button[2]=='o'&&button[8]=='o'&& buttonI[5]==0&&player==1)
                    button5.performClick();
                else if (button[8]=='o'&&button[5]=='o'&& buttonI[2]==0&&player==1)
                    button2.performClick();
                else if (button[0]=='o'&&button[4]=='o'&& buttonI[8]==0&&player==1)
                    button8.performClick();
                else if (button[0]=='o'&&button[8]=='o'&& buttonI[4]==0&&player==1)
                    button4.performClick();
                else if (button[8]=='o'&&button[4]=='o'&& buttonI[0]==0&&player==1)
                    button0.performClick();
                else if (button[2]=='o'&&button[4]=='o'&& buttonI[6]==0&&player==1)
                    button6.performClick();
                else if (button[2]=='o'&&button[6]=='o'&& buttonI[4]==0&&player==1)
                    button4.performClick();
                else if (button[6]=='o'&&button[4]=='o'&& buttonI[2]==0&&player==1)
                    button2.performClick();

                    // bgfg gn ng


                    // defense
                else if (button[3]=='x'&& buttonI[0]==0&& player==1)
                    button0.performClick();
                else if (button[7]=='x'&& buttonI[8]==0&& player==1)
                    button8.performClick();
                else if (button[8]=='x'&& buttonI[7]==0&& player==1)
                    button7.performClick();
                else if (button[0]=='x'&& buttonI[3]==0&& player==1)
                    button3.performClick();

                else if (button[4]=='x'&& buttonI[2]==0&& player==1)
                    button2.performClick();
                else if (button[2]=='x'&& buttonI[4]==0&& player==1)
                    button4.performClick();
                else if (button[0]=='o'&&button[6]=='x'&& buttonI[4]==0&&player==1)
                    button4.performClick();
                    //rgvgfrbgfb
				/*else if (buttonI[7]==1&& buttonI[8]==0&&player==1)
					Button9.doClick();
				else if (buttonI[8]==1&& buttonI[7]==0&&player==1)
					Button8.doClick();
				else if (buttonI[0]==1&& buttonI[3]==0&&player==1)
					Button4.doClick();
				else if (buttonI[3]==1&& buttonI[0]==0&&player==1)
					Button1.doClick();
				else if (buttonI[4]==1&& buttonI[2]==0&&player==1)
					Button3.doClick();
				else if (buttonI[2]==1&& buttonI[4]==0&&player==1)
					Button5.doClick();*/
                    //
                else if (buttonI[0]==0&& player==1) {
                    button0.performClick();}
                else if (buttonI[7]==0&& player==1) {
                    button7.performClick();}
                else if (buttonI[8]==0&& player==1) {
                    button8.performClick();}
                else if (buttonI[2]==0&& player==1) {
                    button2.performClick();}

                else if (buttonI[6]==0&& player==1) {
                    button4.performClick();}

                else if (buttonI[1]==0&& player==1) {
                    button1.performClick();}
                else if (buttonI[5]==0&& player==1) {
                    button3.performClick();}


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



                if (buttonI[0]==0&&buttonI[1]==0&& buttonI[2]==0&& buttonI[3]==0&& buttonI[4]==0&& button[5]==0&& buttonI[6]==0&& buttonI[8]==0&& player==1){

                   button2.performClick();

                }
//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%        Winning check

                else if (button[0]=='o'&&button[1]=='o'&& buttonI[2]==0&&player==1)
                    button2.performClick();
                else if (button[0]=='o'&&button[2]=='o'&& buttonI[1]==0&&player==1)
                    button1.performClick();
                else if (button[3]=='o'&&button[4]=='o'&& buttonI[5]==0&&player==1)
                    button5.performClick();
                else if (button[3]=='o'&&button[5]=='o'&& buttonI[4]==0&&player==1)
                    button4.performClick();
                else if (button[4]=='o'&&button[5]=='o'&& buttonI[3]==0&&player==1)
                    button3.performClick();
                else if (button[6]=='o'&&button[7]=='o'&& buttonI[8]==0&&player==1)
                    button8.performClick();
                else if (button[6]=='o'&&button[8]=='o'&& buttonI[7]==0&&player==1)
                    button7.performClick();
                else if (button[8]=='o'&&button[7]=='o'&& buttonI[6]==0&&player==1)
                    button6.performClick();


                else if (button[0]=='o'&&button[3]=='o'&& buttonI[6]==0&&player==1)
                    button6.performClick();
                else if (button[0]=='o'&&button[6]=='o'&& buttonI[3]==0&&player==1)
                    button3.performClick();
                else if (button[6]=='o'&&button[3]=='o'&& buttonI[0]==0&&player==1)
                    button0.performClick();

                else if (button[1]=='o'&&button[4]=='o'&& buttonI[7]==0&&player==1)
                    button7.performClick();
                else if (button[1]=='o'&&button[7]=='o'&& buttonI[4]==0&&player==1)
                    button4.performClick();
                else if (button[7]=='o'&&button[4]=='o'&& buttonI[1]==0&&player==1)
                    button1.performClick();

                else if (button[2]=='o'&&button[5]=='o'&& buttonI[8]==0&&player==1)
                    button8.performClick();
                else if (button[2]=='o'&&button[8]=='o'&& buttonI[5]==0&&player==1)
                    button5.performClick();
                else if (button[8]=='o'&&button[5]=='o'&& buttonI[2]==0&&player==1)
                    button2.performClick();

                else if (button[1]=='o'&&button[2]=='o'&& buttonI[0]==0&&player==1)
                    button0.performClick();



                else if (button[0]=='o'&&button[4]=='o'&& buttonI[8]==0&&player==1)
                    button8.performClick();
                else if (button[0]=='o'&&button[8]=='o'&& buttonI[4]==0&&player==1)
                    button4.performClick();
                else if (button[8]=='o'&&button[4]=='o'&& buttonI[0]==0&&player==1)
                    button0.performClick();



                else if (button[2]=='o'&&button[4]=='o'&& buttonI[6]==0&&player==1)
                    button6.performClick();
                else if (button[2]=='o'&&button[6]=='o'&& buttonI[4]==0&&player==1)
                    button4.performClick();
                else if (button[6]=='o'&&button[4]=='o'&& buttonI[2]==0&&player==1)
                    button2.performClick();

                    // bgfg gn ng


                else if (button[1]=='x'&& buttonI[4]==0&&player==1)
                    button4.performClick();
                else if (button[4]=='x'&& buttonI[1]==0&&player==1)
                    button1.performClick();
                else if (button[6]=='x'&& buttonI[8]==0&&player==1)
                    button8.performClick();
                else if (button[8]=='x'&& buttonI[6]==0&&player==1)
                    button6.performClick();
                    //gfvfgfgbgfbgf




                else if (buttonI[8]==0&& player==1) {
                    button8.performClick();}
                else if (buttonI[2]==0&& player==1) {
                    button2.performClick();}
                else if (buttonI[0]==0&& player==1) {
                    button0.performClick();}


                else if (buttonI[6]==0&& player==1) {
                    button4.performClick();}
                else if (buttonI[7]==0&& player==1) {
                    button6.performClick();}
                else if (buttonI[1]==0&& player==1) {
                    button1.performClick();}
                else if (buttonI[5]==0&& player==1) {
                    button3.performClick();}


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



                if (buttonI[0]==0&&buttonI[1]==0&& buttonI[2]==0&& buttonI[3]==0&& buttonI[4]==0&& button[5]==0&& buttonI[6]==0&& buttonI[7]==0&& player==1){

                    button3.performClick();

                }
//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%        Winning check

                else if (button[0]=='o'&&button[1]=='o'&& buttonI[2]==0&&player==1)
                    button2.performClick();
                else if (button[0]=='o'&&button[2]=='o'&& buttonI[1]==0&&player==1)
                    button1.performClick();
                else if (button[1]=='o'&&button[2]=='o'&& buttonI[0]==0&&player==1)
                    button0.performClick();

                else if (button[3]=='o'&&button[4]=='o'&& buttonI[5]==0&&player==1)
                    button5.performClick();
                else if (button[3]=='o'&&button[5]=='o'&& buttonI[4]==0&&player==1)
                    button4.performClick();
                else if (button[4]=='o'&&button[5]=='o'&& buttonI[3]==0&&player==1)
                    button3.performClick();



                else if (button[6]=='o'&&button[7]=='o'&& buttonI[8]==0&&player==1)
                    button8.performClick();
                else if (button[6]=='o'&&button[8]=='o'&& buttonI[7]==0&&player==1)
                    button7.performClick();
                else if (button[8]=='o'&&button[7]=='o'&& buttonI[6]==0&&player==1)
                    button6.performClick();


                else if (button[0]=='o'&&button[3]=='o'&& buttonI[6]==0&&player==1)
                    button6.performClick();
                else if (button[0]=='o'&&button[6]=='o'&& buttonI[3]==0&&player==1)
                    button3.performClick();
                else if (button[6]=='o'&&button[3]=='o'&& buttonI[0]==0&&player==1)
                    button0.performClick();

                else if (button[1]=='o'&&button[4]=='o'&& buttonI[7]==0&&player==1)
                    button7.performClick();
                else if (button[1]=='o'&&button[7]=='o'&& buttonI[4]==0&&player==1)
                    button4.performClick();
                else if (button[7]=='o'&&button[4]=='o'&& buttonI[1]==0&&player==1)
                    button1.performClick();
                else if (button[2]=='o'&&button[5]=='o'&& buttonI[8]==0&&player==1)
                    button8.performClick();
                else if (button[2]=='o'&&button[8]=='o'&& buttonI[5]==0&&player==1)
                    button5.performClick();
                else if (button[8]=='o'&&button[5]=='o'&& buttonI[2]==0&&player==1)
                    button2.performClick();




                else if (button[0]=='o'&&button[4]=='o'&& buttonI[8]==0&&player==1)
                    button8.performClick();
                else if (button[0]=='o'&&button[8]=='o'&& buttonI[4]==0&&player==1)
                    button4.performClick();
                else if (button[8]=='o'&&button[4]=='o'&& buttonI[0]==0&&player==1)
                    button0.performClick();
                else if (button[2]=='o'&&button[4]=='o'&& buttonI[6]==0&&player==1)
                    button6.performClick();
                else if (button[2]=='o'&&button[6]=='o'&& buttonI[4]==0&&player==1)
                    button4.performClick();
                else if (button[6]=='o'&&button[4]=='o'&& buttonI[2]==0&&player==1)
                    button2.performClick();

                    // bgfg gn ng


                    // defense
                else if (button[7]=='x'&& buttonI[6]==0&&player==1)
                    button6.performClick();
                else if (button[6]=='x'&& buttonI[7]==0&&player==1)
                    button7.performClick();
                else if (button[2]=='x'&& buttonI[5]==0&&player==1)
                    button5.performClick();
                else if (button[5]=='x'&& buttonI[2]==0&&player==1)
                    button2.performClick();
                else if (button[4]=='x'&& buttonI[0]==0&&player==1)
                    button0.performClick();
                else if (button[0]=='x'&& buttonI[4]==0&&player==1)
                    button4.performClick();
				/*//grbgbgt
				else if (buttonI[7]==1&& buttonI[6]==0&&player==1)
					Button7.doClick();
				else if (buttonI[6]==1&& buttonI[7]==0&&player==1)
					Button8.doClick();
				else if (buttonI[2]==1&& buttonI[5]==0&&player==1)
					Button6.doClick();
				else if (buttonI[5]==1&& buttonI[2]==0&&player==1)
					Button3.doClick();
				else if (buttonI[4]==1&& buttonI[0]==0&&player==1)
					Button1.doClick();
				else if (buttonI[0]==1&& buttonI[4]==0&&player==1)
					Button5.doClick();
				//  frgvgvbf


*/
                else if (buttonI[8]==0&& player==1) {
                    button6.performClick();}
                else if (buttonI[2]==0&& player==1) {
                    button2.performClick();}

                else if (buttonI[6]==0&& player==1) {
                    button4.performClick();}
                else if (buttonI[7]==0&& player==1) {
                    button6.performClick();}
                else if (buttonI[1]==0&& player==1) {
                    button1.performClick();}
                else if (buttonI[5]==0&& player==1) {
                    button3.performClick();}
                else if (buttonI[0]==0&& player==1) {
                    button0.performClick();}




            }
        });



    }
    public boolean ShowHighScoreDBox(String cato) {

        final Dialog de = new Dialog(MainActivity.this);

        de.setTitle("Highest Score");
        de.setContentView(R.layout.highscore_box);
        HSscores=(TextView)de.findViewById(R.id.HSshow);

        HSscores.setText("     " +cato + "    ");
        btnBack = (Button)de.findViewById(R.id.btn_back);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Main3Activity.class);
                buttonReset.performClick();
                SetNull();
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
       SetNull();
       Intent i=new Intent(this,Main3Activity.class);
       startActivity(i);

    }

}
