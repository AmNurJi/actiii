package com.example.act;

import androidx.appcompat.app.AppCompatActivity;

//import android.content.Intent;
import android.os.Bundle;
//import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class thirdAct extends AppCompatActivity {

    private EditText editnom,editprenom,editage;
    private Button btnAjouter;
    private ListView lsAgent;
    ArrayList<Agent> arag;
    C_agent c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
       // TextView c=findViewById(R.id.c);
       // editnom=findViewById(R.id.editNom);
        editprenom=findViewById(R.id.editPrenom);
        editage=findViewById(R.id.editAge);
        btnAjouter=findViewById(R.id.btnAjouter);
        lsAgent=findViewById(R.id.ListeAgents);
        arag=new ArrayList<Agent>();
        arag.add(new Agent("zzzz",33));
        c=new C_agent(arag);
        lsAgent.setAdapter(c);


        btnAjouter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Agent a=new Agent(editprenom.getText().toString(),Integer.parseInt(editage.getText().toString()));
                arag.add(a);
                c.notifyDataSetChanged();
            }
        });
    }

   /* public void goo(View v){
        Intent intent=new Intent(thirdAct.this,MainActivity.class);
        startActivity(intent);
    }
    */

   /* public void ajouter(View v){
        Agent a=new Agent(editnom.getText().toString(),editprenom.getText().toString(),Integer.parseInt(editage.getText().toString()));
        arag.add(a);
        c.notifyDataSetChanged();
    }

    */


    class C_agent extends BaseAdapter{

        ArrayList<Agent> arr_agent;
        public C_agent(ArrayList<Agent> la){
            this.arr_agent=la;
        }

        @Override
        public int getCount() {
            return arr_agent.size();
        }

        @Override
        public Object getItem(int i) {
            return arr_agent.get(i);
        }

        @Override
        public long getItemId(int i) {
            return arr_agent.get(i).age;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            LayoutInflater li=getLayoutInflater();
            View v =li.inflate(R.layout.listev,null);
            TextView txtprenom,txtage;
          // txtnom =v.findViewById(R.id.txtnom);
            txtprenom=v.findViewById(R.id.txtprenom);
            txtage=v.findViewById(R.id.txtage);
          // txtnom.setText(arr_agent.get(i).nom);
            txtprenom.setText(arr_agent.get(i).prenom);
            txtage.setText(Integer.toString(arr_agent.get(i).age));

            return v;
        }
    }

  /*  public void transp(View v){

        Intent inn=new Intent(thirdAct.this,profile.class);
        inn.putExtra("p","editprenom");
    }

*/

}