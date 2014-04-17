package com.example.kwizzeo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

	private TextView titreKwizzeo = null;
	private String hello;
	private String test;
	
	// La chaîne de caractères par défaut
	  private final String defaut = "Vous devez cliquer sur le bouton « Calculer l'IMC » pour obtenir un résultat.";
	  // La chaîne de caractères de la megafonction
	  private final String megaString = "Vous faites un poids parfait ! Wahou ! Trop fort ! On dirait Brad Pitt (si vous êtes un homme)/Angelina Jolie (si vous êtes une femme)/Willy (si vous êtes un orque) !"; 
		
	  Button envoyer = null;
	  Button raz = null;
		
	  EditText poids = null;
	  EditText taille = null;
		
	  RadioGroup group = null;
		
	  TextView result = null;
		
	  CheckBox mega = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        
        //Exemple de modification
        /*hello = getResources().getString(R.string.hello_world);
        hello = hello.replace("world", "les Zéros ");
        
        titreKwizzeo = new TextView(this);
        titreKwizzeo.setText(hello);
        
        titreKwizzeo.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);
        
        setContentView(titreKwizzeo);*/
        
        setContentView(R.layout.activity_main);
        
        
        
        /*
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }*/
        
     // On récupère toutes les vues dont on a besoin
        /*
        envoyer = (Button)findViewById(R.id.calcul);
        	
        raz = (Button)findViewById(R.id.raz);
        	
        taille = (EditText)findViewById(R.id.taille);
        poids = (EditText)findViewById(R.id.poids);
        	
        mega = (CheckBox)findViewById(R.id.mega);
        	
        group = (RadioGroup)findViewById(R.id.group);
        result = (TextView)findViewById(R.id.result);
        
        // On attribue un listener adapté aux vues qui en ont besoin
        envoyer.setOnClickListener(envoyerListener);
        raz.setOnClickListener(razListener);
        taille.addTextChangedListener(textWatcher);
        poids.addTextChangedListener(textWatcher);

        // Solution avec des onKey
        //taille.setOnKeyListener(modificationListener);
        //poids.setOnKeyListener(modificationListener);
        mega.setOnClickListener(checkedListener);*/
        
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
   /* public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }
    */
    
    /*
    private TextWatcher textWatcher = new TextWatcher() {

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
          result.setText(defaut);
        }
    		
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count,
          int after) {
      
        }
      
        @Override
        public void afterTextChanged(Editable s) {
      
        }
      };
    	
      // Uniquement pour le bouton "envoyer"
      private OnClickListener envoyerListener = new OnClickListener() {
        @Override
        public void onClick(View v) {
          if(!mega.isChecked()) {
            // Si la megafonction n'est pas activée
            // On récupère la taille
            String t = taille.getText().toString();
            // On récupère le poids
            String p = poids.getText().toString();
    			
            float tValue = Float.valueOf(t);
    			
            // Puis on vérifie que la taille est cohérente
            if(tValue == 0)
              Toast.makeText(MainActivity.this, "Hého, tu es un Minipouce ou quoi ?", Toast.LENGTH_SHORT).show();
            else {
              float pValue = Float.valueOf(p);
              // Si l'utilisateur a indiqué que la taille était en centimètres
              // On vérifie que la Checkbox sélectionnée est la deuxième à l'aide de son identifiant
              if(group.getCheckedRadioButtonId() == R.id.radio2)
                tValue = tValue / 100;

              tValue = (float)Math.pow(tValue, 2);
              float imc = pValue / tValue;
              result.setText("Votre IMC est " + String.valueOf(imc));
            }
          } else
            result.setText(megaString);
        }
      };
    	
      // Listener du bouton de remise à zéro
      private OnClickListener razListener = new OnClickListener() {
        @Override
        public void onClick(View v) {
          poids.getText().clear();
          taille.getText().clear();
          result.setText(defaut);
        }
      };
    	
      // Listener du bouton de la megafonction.
      private OnClickListener checkedListener = new OnClickListener() {
        @Override
        public void onClick(View v) {
          // On remet le texte par défaut si c'était le texte de la megafonction qui était écrit
          if(!((CheckBox)v).isChecked() && result.getText().equals(megaString))
            result.setText(defaut);
        }
      };
      */

}
