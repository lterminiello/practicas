package com.despegar.homecontroller;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class HomeFragment extends Fragment implements listenerFragmen{

    private RaspberryServiceTask raspberryServiceTask;
    private HomeFragment yo;


    public HomeFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home, container, false);
        Button btnApagar = (Button) v.findViewById(R.id.btnApagar);
        Button btnprender = (Button) v.findViewById(R.id.btnPrender);
        yo = this;
        btnApagar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                raspberryServiceTask =  new RaspberryServiceTask(yo);
                raspberryServiceTask.execute("http://192.168.0.109:8080/home?state=0");
            }
        });
        btnprender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                raspberryServiceTask =  new RaspberryServiceTask(yo);
                raspberryServiceTask.execute("http://192.168.0.109:8080/home?state=1");

            }
        });
        return v;
    }

    @Override
    public void onFinish(String status) {
        raspberryServiceTask.cancel(true);
        Toast t = Toast.makeText(getContext(),status,Toast.LENGTH_LONG);
        t.show();
    }


    public class RaspberryServiceTask extends AsyncTask<String, Void, String> {


        private listenerFragmen listenerFragmen;

        public RaspberryServiceTask( listenerFragmen listenerFragmen) {
            this.listenerFragmen = listenerFragmen;
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected void onPostExecute(String string) {
            super.onPostExecute(string);

            listenerFragmen.onFinish(string);
        }

        @Override
        protected String doInBackground(String... params) {
            HttpURLConnection urlConnection = null;
            try {
                Log.e("--->",params[0] );
                URL url = new URL(params[0]);
                urlConnection = (HttpURLConnection) url.openConnection();
                urlConnection.setRequestMethod("GET");
                urlConnection.connect();

                InputStream inputStream = urlConnection.getInputStream();

                BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
                String s = br.readLine();
                return s;

            } catch (IOException e) {
                return null;
            } finally {
                if (urlConnection != null) {
                    urlConnection.disconnect();
                }
            }
        }
    }


}
