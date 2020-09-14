package ac.id.poltekkampar.projekbaru;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public String str ="";
    Character Yud = 'q';
    float i,num,numtemp;
    EditText showResult;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showResult = findViewById(R.id.result_id);

    }
    public void btn1Clicked(View v){
        insert(1);

    }

    public void btn2Clicked(View v){
        insert(2);

    }
    public void btn3Clicked(View v){
        insert(3);

    }
    public void btn4Clicked(View v){
        insert(4);

    }
    public void btn5Clicked(View v){
        insert(5);

    }
    public void btn6Clicked(View v){
        insert(6);
    }
    public void btn7Clicked(View v){
        insert(7);

    }
    public void btn8Clicked(View v){
        insert(8);

    }
    public void btn9Clicked(View v){
        insert(9);

    }
    public void btn0Clicked(View v){
        insert(0);

    }
    public void btnplusClicked(View v){
        perform();
        Yud = '+';

    }

    public void btnminusClicked(View v){
        perform();
        Yud = '-';

    }
    public void btndivideClicked(View v){
        perform();
        Yud = '/';

    }
    public void btnmultiClicked(View v){
        perform();
        Yud = '*';

    }
    public void btnequalClicked(View v){
        calculate();

    }

    public void btnclearClicked(View v){
        reset();
    }
    private void reset() {
        // TODO Auto-generated method stub
        str ="";
        Yud='q';
        num = 0;
        numtemp = 0;
        showResult.setText("");
    }
    private void insert(int j) {
        // TODO Auto-generated method stub
        str = str+Integer.toString(j);
        num = Integer.valueOf(str).intValue();
        showResult.setText(str);

    }
    private void perform() {
        // TODO Auto-generated method stub
        str = "";
        calculateNoShow();
        numtemp = num;

    }
    private void calculate() {
        // TODO Auto-generated method stub
        if(Yud == '+')
            num = numtemp+num;
        else if(Yud == '-')
            num = numtemp-num;
        else if(Yud == '/')
            num = numtemp/num;
        else if(Yud == '*')
            num = numtemp*num;
        showResult.setText(""+num);
    }

    private void calculateNoShow() {
        // TODO Auto-generated method stub
        if(Yud == '+')
            num = numtemp+num;
        else if(Yud == '-')
            num = numtemp-num;
        else if(Yud == '/')
            num = numtemp/num;
        else if(Yud == '*')
            num = numtemp*num;
    }
}
