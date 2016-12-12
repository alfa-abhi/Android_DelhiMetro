package com.example.abhinavchauhan.projectalfa;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Abhishek Chauhan on 06-07-2016.
 */
public class Path_finder extends Fragment {

    String stations[]={"AIIMS","Adarsh Nagar","Akshardham","Anand Vihar ISBT","Arjangarh","Ashok Park Main","Azadpur","Badarpur Border","Badkal Mor","Barakhamba Road","Bata chowk","Botanical Garden","Central Secretariat","Chandni Chowk","Chawri Bazaar","Chhattarpur","City Centre","Civil Lines","Delhi Aero City Centre","Dhaula Kuan","Dilshad Garden","Dwarka","Dwarka Mor","Dwarka Sec 10","Dwarka Sec 11","Dwarka Sec 12","Dwarka Sec 13","Dwarka Sec 14","Dwarka Sec 21","Dwarka Sec 8","Dwarka Sec 9","Escort Mujesar","GTB Nagar","Ghitorni","Golf Course","Govind Puri","Green Park","Guru Dronacharya","HUDA City Centre","Haiderpur","Hauz Khas","IFFCO Chowk","IGI Airport","INA","ITO","Inderlok","Indraprastha","JLN Stadium","Jahangirpuri","Janakpuri East","Janakpuri West","Jangpura","Janpath","Jasola-Apollo","Jhandewalan","Jhilmil","Jor Bagh","Kailash Colony","Kalkaji Mandir","Kanhaiya Nagar","Karkarduma","Karol Bagh","Kashmere Gate","Kaushambhi","Keshav Puram","Khan Market","Kirti Nagar","Kohat Enclave","Lajpat Nagar","Laxmi Nagar","MG Road","Madipur","Malviya Nagar","Mandi House","Mansarover Park","Mayur Vihar","Mayur Vihar Extn","Mewala Maharajpur","Model town","Mohan Estate","Moolchand","Moti Nagar","Mundka","NHPC Chowk","Nangloi","Nangloi Railway Stadium","Nawada","Neelam Chowk","Nehru Place","Netaji Subhash Place","New Ashok Nagar","New Delhi","Nirman Vihar","Noida Sec 15","Noida Sec 16","Noida Sector 18","Okhla","Old Faridabad","Paschim Vihar East","Paschim Vihar West","Patel Chowk","Patel Nagar","Peeragarhi","Pitampura","Pragati Madian","Pratap Nagar","Preet Vihar","Pulbangash","Punjabi Bagh","Qutab Minar","R.K Ashram Marg","Race Course","Rajdhani Park","Rajendra Place","Rajiv Chowk","Rajouri Garden","Ramesh Nagar","Rithala","Rohini East","Rohini West","Rohini sec 18","Saket","Samaypur Badli","Sarai","Sarita Vihar","Satguru Ram Singh Marg","Sector 28","Seelampur","Shadipur","Shahdra","Shastri Nagar","Shastri Park","Shivaji Park","Shivaji Stadium","Sikanderpur","Subhash Nagar","Sultanpur","Surajmal Stadium","Tagore Garden","Tilak Nagar","Tis Hazari","Tughlakabad","Udyog Bhawan","Udyog Nagar","Uttam Nagar East","Uttam Nagar West","Vaishali","Vidhan Sabha","Vishwavidyalaya","Welcome","Yamuna Bank"};
    String stations1[]={"HUDA City Centre","IFFCO Chowk","MG Road","Sikanderpur","Guru Dronacharya","Arjangarh","Ghitorni","Sultanpur","Chhattarpur","Qutab Minar","Saket","Malviya Nagar","Hauz Khas","Green Park","AIIMS","INA","Jor Bagh","Race Course","Udyog Bhawan","Central Secretariat","Patel Chowk","Rajiv Chowk","New Delhi","Chawri Bazaar","Chandni Chowk","Kashmere Gate","Civil Lines","Vidhan Sabha","Vishwavidyalaya","GTB Nagar","Model town","Azadpur","Adarsh Nagar","Jahangirpuri","Haiderpur","Rohini sec 18","Samaypur Badli","Dilshad Garden","Jhilmil","Mansarover Park","Shahdra","Welcome","Seelampur","Shastri Park","Tis Hazari","Pulbangash","Pratap Nagar","Shastri Nagar","Inderlok","Kanhaiya Nagar","Keshav Puram","Netaji Subhash Place","Kohat Enclave","Pitampura","Rohini East","Rohini West","Rithala","Satguru Ram Singh Marg","Ashok Park Main","Punjabi Bagh","Shivaji Park","Madipur","Paschim Vihar East","Paschim Vihar West","Peeragarhi","Udyog Nagar","Surajmal Stadium","Nangloi","Nangloi Railway Stadium","Rajdhani Park","Mundka","Dwarka Sec 21","Dwarka Sec 8","Dwarka Sec 9","Dwarka Sec 10","Dwarka Sec 11","Dwarka Sec 12","Dwarka Sec 13","Dwarka Sec 14","Dwarka","Dwarka Mor","Nawada","Uttam Nagar West","Uttam Nagar East","Janakpuri West","Janakpuri East","Tilak Nagar","Subhash Nagar","Tagore Garden","Rajouri Garden","Ramesh Nagar","Moti Nagar","Kirti Nagar","Shadipur","Patel Nagar","Rajendra Place","Karol Bagh","Jhandewalan","R.K Ashram Marg","Barakhamba Road","Mandi House","Pragati Madian","Indraprastha","Yamuna Bank","Akshardham","Mayur Vihar","Mayur Vihar Extn","New Ashok Nagar","Noida Sector 15","Noida Sec 16","Noida Sec 18","Botanical Garden","Golf Course","City Centre","Laxmi Nagar","Nirman Vihar","Preet Vihar","Karkarduma","Anand Vihar ISBT","Kaushambhi","Vaishali","Shivaji Stadium","Dhaula Kuan","Delhi Aero City Centre","IGI Airport","ITO","Janpath","Khan Market","JLN Stadium","Jangpura","Lajpat Nagar","Moolchand","Kailash Colony","Nehru Place","Kalkaji Mandir","Govind Puri","Okhla","Jasola-Apollo","Sarita Vihar","Mohan Estate","Tughlakabad","Badarpur Border","Sarai","NHPC Chowk","Mewala Maharajpur","Sector 28","Badkal Mor","Old Faridabad","Neelam Chowk","Bata chowk","Escort Mujesar"};

    public static Fragment newInstance(Context context)
    {
        MapHandler frg4=new MapHandler();
        return frg4;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup root4=(ViewGroup)inflater.inflate(R.layout.path_finder,container,false);
        final AutoCompleteTextView autoCompleteTextView,autoCompleteTextView1;
        final ListView listView,listView1;
        final ImageView imageView,imageView1;
        final TextView tv1,tv2;
        listView=(ListView)root4.findViewById(R.id.listView11);
        listView1=(ListView)root4.findViewById(R.id.listView14);
        imageView1=(ImageView)root4.findViewById(R.id.imageView);
        tv2=(TextView)root4.findViewById(R.id.textView18);
        ArrayAdapter adapter=new ArrayAdapter(getActivity(),R.layout.othershandler,stations);
        listView.setAdapter(adapter);
        autoCompleteTextView=(AutoCompleteTextView)root4.findViewById(R.id.autoCompleteTextView);
        autoCompleteTextView1=(AutoCompleteTextView)root4.findViewById(R.id.autoCompleteTextView2);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_dropdown_item_1line,stations);
        autoCompleteTextView.setAdapter(arrayAdapter);
        autoCompleteTextView.setThreshold(1);
        imageView=(ImageView)root4.findViewById(R.id.imageView6);
        ArrayAdapter<String> arrayAdapter1=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_dropdown_item_1line,stations);
        autoCompleteTextView1.setThreshold(1);
        autoCompleteTextView1.setAdapter(arrayAdapter1);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String station=(String)listView.getItemAtPosition(position);
                if(autoCompleteTextView.getText().toString().equals(""))
                {
                    autoCompleteTextView.setText(station);
                }
                else if(!autoCompleteTextView.getText().toString().equals("") && autoCompleteTextView1.getText().toString().equals(""))
                {
                    autoCompleteTextView1.setText(station);
                }
                else
                {
                    Toast.makeText(getActivity(),"Stations Already Selected",Toast.LENGTH_LONG).show();
                }
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=autoCompleteTextView.getText().toString();
                String b=autoCompleteTextView1.getText().toString();
                int source=-1;
                int destination=-1;
                for(int i=0;i<stations1.length;i++)
                {
                    if (a.equals(stations1[i]))
                    {
                        source=i;
                    }
                    else if(b.equals(stations1[i]))
                    {
                        destination=i;
                    }
                }
                //Toast.makeText(getActivity(),source + " " + destination,Toast.LENGTH_LONG).show();
                Graph g = new Graph(200);

               /* LINKING THE LINES */

                //Yellow Line connected// 0 is HUDA CITY 36 is samaypur badli, 19 is CS, 21 is rajiv chowk,22 is new delhi, 25 is kashmere gate;
                for(int i=0;i<36;i++)
                    g.addedge(i, i+1);
                for(int i=36;i>=1;i--)
                    g.addedge(i,i-1);

                //RED Line : 43 is Shastri park and 44 is tis hazari 48 is inderlok 37 is dilshad garden, 56 is rithala
                for(int i=37;i<56;i++)
                    g.addedge(i,i+1);
                for(int i=56;i>=38;i--)
                    g.addedge(i,i-1);

                //GREEN LINE : 57 is satguru ram singh 70 is mundka
                for(int i=57;i<70;i++)
                    g.addedge(i,i+1);
                for(int i=70;i>=58;i--)
                    g.addedge(i,i-1);

                //BLUE LINE: 71 is dwarka sec21,92 is kirti nagar ,98 is ramakrishna ashram marg,99 barakhamba, 100 mandi house, 103 yamuna bank,113 city centre, 114 laxmi nagar, 120 Vaishali;
                for(int i=71;i<113;i++)
                    if(i!=98)
                        g.addedge(i,i+1);
                for(int i=113;i>=72;i--)
                    if(i!=99)
                        g.addedge(i,i-1);

                for(int i=114;i<120;i++)
                    g.addedge(i,i+1);
                for(int i=120;i>=115;i--)
                    g.addedge(i,i-1);

                //Orange Line : 121 is shivaji stadium, 124 is IGI airport
                for(int i=121;i<124;i++)
                    g.addedge(i,i+1);
                for(int i=124;i>=122;i--)
                    g.addedge(i,i-1);

                //Violet Line :125 is ITO,125 is janpath,126 is khan market,150 is escorts mujesar
                for(int i=125;i<150;i++)
                    g.addedge(i,i+1);
                for(int i=150;i>=126;i--)
                    g.addedge(i,i-1);

	            /* FOLLOWING ARE THE LINE JUNCTIONS*/

                g.addedge(25,43); //Kashmere Gate and shastri park//
                g.addedge(43,25);
                g.addedge(25,44); //Kashmere Gate and Tis Hazari
                g.addedge(44,25);
                g.addedge(48,58); //inderlok and APM
                g.addedge(58,48);
                g.addedge(92,57);//Kirti nagar and satguru ram singh marg
                g.addedge(57,92);
                g.addedge(103,114);//yamuna nagar and laxmi nagar
                g.addedge(114,103);
                g.addedge(21,98);//Rajiv chowk and rk ashram
                g.addedge(98,21);
                g.addedge(21,99);//rajiv chowk and barakhamba
                g.addedge(99,21);
                g.addedge(121,22);//new delhi and shivaji stadium
                g.addedge(22,121);
                g.addedge(71,124);//IGI Airport and dwarka sec 21
                g.addedge(124,71);
                g.addedge(100,125);//mandi house and ITO
                g.addedge(125,100);
                g.addedge(100,126);//mandi house and janpath
                g.addedge(126,100);
                g.addedge(126,19);//janpath and central secretariat
                g.addedge(19,126);
                g.addedge(19,127);//central secretariatc and khan market
                g.addedge(127,19);

                ArrayList<String> arr = new ArrayList<String>();
                if(source!=destination) {
                    arr = g.BFS(source, destination);
                    ArrayAdapter adp = new ArrayAdapter(getActivity(), R.layout.othershandler, arr);
                    listView.setVisibility(View.GONE);
                    autoCompleteTextView.setEnabled(false);
                    autoCompleteTextView1.setEnabled(false);
                    tv2.setText(String.valueOf(arr.size())+"\nStations");
                    tv2.setVisibility(View.VISIBLE);
                    imageView.setVisibility(View.GONE);
                    imageView1.setVisibility(View.VISIBLE);
                    listView1.setVisibility(View.VISIBLE);
                    listView1.setAdapter(adp);
                }
                else
                {
                    Toast.makeText(getActivity(),"Source and Destination Same",Toast.LENGTH_LONG).show();
                }
            }
        });
        return root4;
    }
}