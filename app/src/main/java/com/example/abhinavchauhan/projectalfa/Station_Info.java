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
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Abhishek Chauhan on 08-07-2016.
 */
public class Station_Info extends Fragment {
    public static Fragment newInstance(Context context)
    {
        Station_Info frg15=new Station_Info();
        return frg15;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final ListView listView;
        final TextView textView;
        final ImageView imageView;
        String all_stations[]={"AIIMS", "Adarsh Nagar", "Airport", "Akshardham", "Anand Vihar", "Arjan Garh", "Ashok Park Main", "Azadpur", "Badarpur", "Badkhal Mor", "Barakhambha Road", "Bata Chowk", "Belvedere Towers", "Botanical Garden", "Central Secretariat", "Chandni Chowk", "Chawri Bazar", "Chhatarpur", "Civil Lines", "Cyber City", "Delhi Aerocity", "Dhaula Kuan", "Dilshad Garden", "Dwarka", "Dwarka Mor", "Dwarka Sector 8", "Dwarka Sector 9", "Dwarka Sector 10", "Dwarka Sector 11", "Dwarka Sector 12", "Dwarka Sector 13", "Dwarka Sector 14", "Dwarka Sector 21", "Escorts Mujesar", "Faridabad Old", "GTB Nagar", "Ghitorni", "Govind Puri", "Green Park", "Guru Dronacharya", "HUDA City Centre", "Haiderpur", "Hauz Khas", "IFFCO Chowk", "INA", "ITO", "Inderlok", "Indraprastha", "Jahangirpuri", "Janakpuri East", "Janakpuri West", "Jangpura", "Janpath", "Jasola Apollo", "Jawaharlal Nehru Stadium", "Jhandewalan", "Jhilmil", "Jor Bagh", "Kailash Colony", "Kalkaji Mandir", "Kanhiya Nagar", "Karkarduma", "Karol Bagh", "Kashmere Gate", "Kaushambi", "Keshav Puram", "Khan Market", "Kirti Nagar", "Kohat Enclave", "Lajpat Nagar", "Laxmi Nagar", "MG Road", "Madipur", "Malviya Nagar", "Mandi House", "Mansarovar Park", "Mayur Vihar - I", "Mayur Vihar Extension", "Mewla Maharajpur", "Model Town", "Mohan Estate", "Moolchand", "Moti Nagar", "Moulsari Avenue", "Mundka", "NHPC Chowk", "Nangloi", "Nangloi Railway station", "Nawada", "Neelam Chowk Ajronda", "Nehru Place", "Netaji Subhash Place", "New Ashok Nagar", "New Delhi", "Nirman Vihar", "Noida City Centre", "Noida Golf Course", "Noida Sector 15", "Noida Sector 16", "Noida Sector 18", "Okhla", "Paschim Vihar East", "Paschim Vihar West", "Patel Chowk", "Patel Nagar", "Peera Garhi", "Phase 2", "Phase 3", "Pitam Pura", "Pragati Maidan", "Pratap Nagar", "Preet Vihar", "Pul Bangash", "Punjabi Bagh", "Qutub Minar", "Race Course", "Rajdhani Park", "Rajendra Place", "Rajiv Chowk", "Rajouri Garden", "Ramakrishna Ashram Marg", "Ramesh Nagar", "Rithala", "Rohini East", "Rohini Sector 18", "Rohini West", "Saket", "Samaypur Badli", "Sarai", "Sarita Vihar", "Satguru Ramsingh Marg", "Sector 28", "Seelampur", "Shadipur", "Shahdara", "Shastri Nagar", "Shastri Park", "Shivaji Park", "Shivaji Stadium", "Sikandarpur", "Subhash Nagar", "Sultanpur", "Surajmal Stadium", "Tagore Garden", "Tilak Nagar", "Tis Hazari", "Tughlakabad", "Udyog Bhawan", "Udyog Nagar", "Uttam Nagar East", "Uttam Nagar West", "Vaishali", "Vidhan Sabha", "Vishwa Vidyalaya", "Welcome", "Yamuna Bank"};
        ViewGroup root15=(ViewGroup)inflater.inflate(R.layout.station_info,null);
        listView=(ListView)root15.findViewById(R.id.listView9);
        textView=(TextView)root15.findViewById(R.id.textView10);
        imageView=(ImageView)root15.findViewById(R.id.imageView37);
        ArrayAdapter adapter=new ArrayAdapter(getActivity(),R.layout.othershandler,all_stations);
        listView.setAdapter(adapter);
        final String strJson="{ \"Stations\" :[{\"Name\":\"AIIMS\",\"Gate 1\":\"AIIMS Hospital\",\"Gate 2\":\"Ansari Nagar\",\"Gate 3\":\"Safdarjung Hospital\",\"Gate 4\":\"Vardhman Mahavir Medical College\",\"Gate 5\":\"N/A\",\"Gate 6\":\"N/A\",\"Gate 7\":\"N/A\",\"Gate 8\":\"N/A\"},{\"Name\":\"Adarsh Nagar\",\"Gate 1\":\"Moolchand Colony\",\"Gate 2\":\"Majlis Park\",\"Gate 3\":\"New Sabzi Mandi\",\"Gate 4\":\"Fruit Mandi\",\"Gate 5\":\"N/A\",\"Gate 6\":\"N/A\",\"Gate 7\":\"N/A\",\"Gate 8\":\"N/A\"},{\"Name\":\"IGI Airport\",\"Gate 1\":\"N/A\",\"Gate 2\":\"N/A\",\"Gate 3\":\"N/A\",\"Gate 4\":\"N/A\",\"Gate 5\":\"N/A\",\"Gate 6\":\"N/A\",\"Gate 7\":\"N/A\",\"Gate 8\":\"N/A\"},{\"Name\":\"Akshardham\",\"Gate 1\":\"Akshardham Mandir\",\"Gate 2\":\"Parking\",\"Gate 3\":\"N/A\",\"Gate 4\":\"N/A\",\"Gate 5\":\"N/A\",\"Gate 6\":\"N/A\",\"Gate 7\":\"N/A\",\"Gate 8\":\"N/A\"},{\"Name\":\"Anand Vihar\",\"Gate 1\":\"Urban Institute of Management\",\"Gate 2\":\"Anand Vihar ISBT\",\"Gate 3\":\"N/A\",\"Gate 4\":\"N/A\",\"Gate 5\":\"N/A\",\"Gate 6\":\"N/A\",\"Gate 7\":\"N/A\",\"Gate 8\":\"N/A\"},{\"Name\":\"Arjan Garh\",\"Gate 1\":\"Aya Nagar\",\"Gate 2\":\"Air Force Station Arjan Garh\",\"Gate 3\":\"N/A\",\"Gate 4\":\"N/A\",\"Gate 5\":\"N/A\",\"Gate 6\":\"N/A\",\"Gate 7\":\"N/A\",\"Gate 8\":\"N/A\"},{\"Name\":\"Ashok Park Main\",\"Gate 1\":\"Ashok Park Extension\",\"Gate 2\":\"Rampura\",\"Gate 3\":\"N/A\",\"Gate 4\":\"N/A\",\"Gate 5\":\"N/A\",\"Gate 6\":\"N/A\",\"Gate 7\":\"N/A\",\"Gate 8\":\"N/A\"},{\"Name\":\"Azadpur\",\"Gate 1\":\"Model Town III\",\"Gate 2\":\"Not Operational\",\"Gate 3\":\"N/A\",\"Gate 4\":\"N/A\",\"Gate 5\":\"N/A\",\"Gate 6\":\"N/A\",\"Gate 7\":\"N/A\",\"Gate 8\":\"N/A\"},{\"Name\":\"Badarpur\",\"Gate 1\":\"Passengers Underpass\",\"Gate 2\":\"Institute of Hotel Management\",\"Gate 3\":\"N/A\",\"Gate 4\":\"N/A\",\"Gate 5\":\"N/A\",\"Gate 6\":\"N/A\",\"Gate 7\":\"N/A\",\"Gate 8\":\"N/A\"},{\"Name\":\"Badkal Mor\",\"Gate 1\":\"NVM Mall\",\"Gate 2\":\"DPS\",\"Gate 3\":\"West Karkhana Bagh\",\"Gate 4\":\"N/A\",\"Gate 5\":\"N/A\",\"Gate 6\":\"N/A\",\"Gate 7\":\"N/A\",\"Gate 8\":\"N/A\"},{\"Name\":\"Barakhamba\",\"Gate 1\":\"Metro Bhawan\",\"Gate 2\":\"Kanchanjunga Building\",\"Gate 3\":\"DCM Building\",\"Gate 4\":\"I&V Building\",\"Gate 5\":\"Narayan Manjil\",\"Gate 6\":\"New Delhi House\",\"Gate 7\":\"N/A\",\"Gate 8\":\"N/A\"},{\"Name\":\"Bata Chowk\",\"Gate 1\":\"North IMT\",\"Gate 2\":\"SRS Multiplex\",\"Gate 3\":\"Radisson Hotel\",\"Gate 4\":\"N/A\",\"Gate 5\":\"N/A\",\"Gate 6\":\"N/A\",\"Gate 7\":\"N/A\",\"Gate 8\":\"N/A\"},{\"Name\":\"Belvedere Towers\",\"Gate 1\":\"Belvedere Towers\",\"Gate 2\":\"N/A\",\"Gate 3\":\"N/A\",\"Gate 4\":\"N/A\",\"Gate 5\":\"N/A\",\"Gate 6\":\"N/A\",\"Gate 7\":\"N/A\",\"Gate 8\":\"N/A\"},{\"Name\":\"Botanical Garden\",\"Gate 1\":\"Botanical Garden\",\"Gate 2\":\"N/A\",\"Gate 3\":\"N/A\",\"Gate 4\":\"N/A\",\"Gate 5\":\"N/A\",\"Gate 6\":\"N/A\",\"Gate 7\":\"N/A\",\"Gate 8\":\"N/A\"},{\"Name\":\"Central Secretariat\",\"Gate 1\":\"Red Cross Building\",\"Gate 2\":\"Krishi Bhawan\",\"Gate 3\":\"India Gate\",\"Gate 4\":\"Vijay Chowk\",\"Gate 5\":\"Rail Bhawan\",\"Gate 6\":\"N/A\",\"Gate 7\":\"N/A\",\"Gate 8\":\"N/A\"},{\"Name\":\"Chandni Chowk\",\"Gate 1\":\"Kucha Natwa\",\"Gate 2\":\"Delhi Public Library\",\"Gate 3\":\"Old Delhi Railway Station\",\"Gate 4\":\"MCD Parking\",\"Gate 5\":\"Shish Ganj Gurudwara\",\"Gate 6\":\"N/A\",\"Gate 7\":\"N/A\",\"Gate 8\":\"N/A\"},{\"Name\":\"Chawri Bazaar\",\"Gate 1\":\"Ajmeri Gate\",\"Gate 2\":\"Hauz Qazi\",\"Gate 3\":\"Nai Sadak\",\"Gate 4\":\"N/A\",\"Gate 5\":\"N/A\",\"Gate 6\":\"N/A\",\"Gate 7\":\"N/A\",\"Gate 8\":\"N/A\"},{\"Name\":\"Chhattarpur\",\"Gate 1\":\"Vasant Kunj Sec-D\",\"Gate 2\":\"Andheriya Mor\",\"Gate 3\":\"N/A\",\"Gate 4\":\"N/A\",\"Gate 5\":\"N/A\",\"Gate 6\":\"N/A\",\"Gate 7\":\"N/A\",\"Gate 8\":\"N/A\"},{\"Name\":\"Civil Lines\",\"Gate 1\":\"Sant Parmanand Hospital\",\"Gate 2\":\"IP College\",\"Gate 3\":\"Oberoi Maidens Hotel\",\"Gate 4\":\"N/A\",\"Gate 5\":\"N/A\",\"Gate 6\":\"N/A\",\"Gate 7\":\"N/A\",\"Gate 8\":\"N/A\"},{\"Name\":\"Cyber City\",\"Gate 1\":\"Cyber Hub\",\"Gate 2\":\"Gateway Tower\",\"Gate 3\":\"N/A\",\"Gate 4\":\"N/A\",\"Gate 5\":\"N/A\",\"Gate 6\":\"N/A\",\"Gate 7\":\"N/A\",\"Gate 8\":\"N/A\"},{\"Name\":\"Delhi Aerocity\",\"Gate 1\":\"N/A\",\"Gate 2\":\"N/A\",\"Gate 3\":\"N/A\",\"Gate 4\":\"N/A\",\"Gate 5\":\"N/A\",\"Gate 6\":\"N/A\",\"Gate 7\":\"N/A\",\"Gate 8\":\"N/A\"},{\"Name\":\"Dhaula Kuan\",\"Gate 1\":\"N/A\",\"Gate 2\":\"N/A\",\"Gate 3\":\"N/A\",\"Gate 4\":\"N/A\",\"Gate 5\":\"N/A\",\"Gate 6\":\"N/A\",\"Gate 7\":\"N/A\",\"Gate 8\":\"N/A\"},{\"Name\":\"Dilshad Garden\",\"Gate 1\":\"Vivek Vihar\",\"Gate 2\":\"J & K Pocket\",\"Gate 3\":\"N/A\",\"Gate 4\":\"N/A\",\"Gate 5\":\"N/A\",\"Gate 6\":\"N/A\",\"Gate 7\":\"N/A\",\"Gate 8\":\"N/A\"},{\"Name\":\"Dwarka\",\"Gate 1\":\"CRPF Quarters\",\"Gate 2\":\"Kakrola Village\",\"Gate 3\":\"N/A\",\"Gate 4\":\"N/A\",\"Gate 5\":\"N/A\",\"Gate 6\":\"N/A\",\"Gate 7\":\"N/A\",\"Gate 8\":\"N/A\"},{\"Name\":\"Dwarka Mor\",\"Gate 1\":\"Vipin Garden\",\"Gate 2\":\"Rama Park\",\"Gate 3\":\"N/A\",\"Gate 4\":\"N/A\",\"Gate 5\":\"N/A\",\"Gate 6\":\"N/A\",\"Gate 7\":\"N/A\",\"Gate 8\":\"N/A\"},{\"Name\":\"Dwarka Sector - 8\",\"Gate 1\":\"SPG Complex\",\"Gate 2\":\"N/A\",\"Gate 3\":\"N/A\",\"Gate 4\":\"N/A\",\"Gate 5\":\"N/A\",\"Gate 6\":\"N/A\",\"Gate 7\":\"N/A\",\"Gate 8\":\"N/A\"},{\"Name\":\"Dwarka Sector - 9\",\"Gate 1\":\"PF Colony\",\"Gate 2\":\"Bharat Gas Godown\",\"Gate 3\":\"N/A\",\"Gate 4\":\"N/A\",\"Gate 5\":\"N/A\",\"Gate 6\":\"N/A\",\"Gate 7\":\"N/A\",\"Gate 8\":\"N/A\"},{\"Name\":\"Dwarka Sector - 10\",\"Gate 1\":\"Pinacle Mall\",\"Gate 2\":\"Dwarka District Court\",\"Gate 3\":\"N/A\",\"Gate 4\":\"N/A\",\"Gate 5\":\"N/A\",\"Gate 6\":\"N/A\",\"Gate 7\":\"N/A\",\"Gate 8\":\"N/A\"},{\"Name\":\"Dwarka Sector - 11\",\"Gate 1\":\"Amrahi Village\",\"Gate 2\":\"St. Gregorious School\",\"Gate 3\":\"N/A\",\"Gate 4\":\"N/A\",\"Gate 5\":\"N/A\",\"Gate 6\":\"N/A\",\"Gate 7\":\"N/A\",\"Gate 8\":\"N/A\"},{\"Name\":\"Dwarka Sector - 12\",\"Gate 1\":\"Sam International Hospital\",\"Gate 2\":\"Bansup Hospital\",\"Gate 3\":\"N/A\",\"Gate 4\":\"N/A\",\"Gate 5\":\"N/A\",\"Gate 6\":\"N/A\",\"Gate 7\":\"N/A\",\"Gate 8\":\"N/A\"},{\"Name\":\"Dwarka Sector - 13\",\"Gate 1\":\"N/A\",\"Gate 2\":\"Metro View Apartment\",\"Gate 3\":\"N/A\",\"Gate 4\":\"N/A\",\"Gate 5\":\"N/A\",\"Gate 6\":\"N/A\",\"Gate 7\":\"N/A\",\"Gate 8\":\"N/A\"},{\"Name\":\"Dwarka Sector - 14\",\"Gate 1\":\"Eros Metro Mall\",\"Gate 2\":\"NBPS\",\"Gate 3\":\"N/A\",\"Gate 4\":\"N/A\",\"Gate 5\":\"N/A\",\"Gate 6\":\"N/A\",\"Gate 7\":\"N/A\",\"Gate 8\":\"N/A\"},{\"Name\":\"Dwarka Sector - 21\",\"Gate 1\":\"Bijwasan Village\",\"Gate 2\":\"N/A\",\"Gate 3\":\"N/A\",\"Gate 4\":\"N/A\",\"Gate 5\":\"N/A\",\"Gate 6\":\"N/A\",\"Gate 7\":\"N/A\",\"Gate 8\":\"N/A\"},{\"Name\":\"Escorts Mujesar\",\"Gate 1\":\"YMCA Chowk\",\"Gate 2\":\"YMCA University\",\"Gate 3\":\"Mujesar Village\",\"Gate 4\":\"N/A\",\"Gate 5\":\"N/A\",\"Gate 6\":\"N/A\",\"Gate 7\":\"N/A\",\"Gate 8\":\"N/A\"},{\"Name\":\"Faridabad Old\",\"Gate 1\":\"Sector - 16\",\"Gate 2\":\"Sector - 15\",\"Gate 3\":\"EF-3 Mall\",\"Gate 4\":\"N/A\",\"Gate 5\":\"N/A\",\"Gate 6\":\"N/A\",\"Gate 7\":\"N/A\",\"Gate 8\":\"N/A\"}] }";

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String data = "";
                try {
                    JSONObject jsonRootObject = new JSONObject(strJson);
                    JSONArray jsonArray = jsonRootObject.optJSONArray("Stations");
                    JSONObject jsonObject = jsonArray.getJSONObject(position);
                    //int id = Integer.parseInt(jsonObject.optString("Id").toString());
                    String name = jsonObject.optString("Name").toString();
                    String gate1 = jsonObject.optString("Gate 1").toString();
                    String gate2 = jsonObject.optString("Gate 2").toString();
                    String gate3 = jsonObject.optString("Gate 3").toString();
                    String gate4 = jsonObject.optString("Gate 4").toString();
                    String gate5 = jsonObject.optString("Gate 5").toString();
                    String gate6 = jsonObject.optString("Gate 6").toString();
                    String gate7 = jsonObject.optString("Gate 7").toString();
                    String gate8 = jsonObject.optString("Gate 8").toString();
                    data +="Name: "+ name +"\n\nGate 1: "+ gate1 +"\n\nGate 2: " + gate2 + "\n\nGate 3: " + gate3 + "\n\nGate 4: " + gate4 + "\n\nGate 5: " + gate5 + "\n\nGate 6: " + gate6 + "\n\nGate 7: " + gate7 + "\n\nGate 8: " + gate8;
                    textView.setText(data);
                    listView.setVisibility(View.GONE);
                    textView.setVisibility(View.VISIBLE);
                    imageView.setVisibility(View.VISIBLE);
                } catch (JSONException e) {e.printStackTrace();}
            }
        });
        return root15;
    }
}
