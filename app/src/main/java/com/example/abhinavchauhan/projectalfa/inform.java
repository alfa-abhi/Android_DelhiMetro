package com.example.abhinavchauhan.projectalfa;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class inform extends Fragment {
    public static Fragment newInstance(Context context)
    {
        inform frg17=new inform();
        return frg17;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final ListView listView,listView1;
        String emergencies[]={"\nAll Emergencies","\nPolice","\nFire","\nAmbulance","\nSt. John Ambulance","\nCATS","\nRailway Enquiry"};
        String numbers[]={"\n108","\n100","\n101","\n102","\n911123322237","\n91111099","\n139"};
        ViewGroup root17=(ViewGroup)inflater.inflate(R.layout.inform,null);
        listView=(ListView)root17.findViewById(R.id.listView8);
        listView1=(ListView)root17.findViewById(R.id.listView10);
        ArrayAdapter adapter=new ArrayAdapter(getActivity(),R.layout.othershandler,emergencies);
        ArrayAdapter adapter1=new ArrayAdapter(getActivity(),R.layout.informright,numbers);
        listView.setAdapter(adapter);
        listView1.setAdapter(adapter1);
        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String string="";
                switch (position)
                {
                    case 0:
                        string="108";
                        break;
                    case 1:
                        string="100";
                        break;
                    case 2:
                        string="101";
                        break;
                    case 3:
                        string="102";
                        break;
                    case 4:
                        string="911123322237";
                        break;
                    case 5:
                        string="91111099";
                        break;
                    case 6:
                        string="139";
                        break;
                }
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + string));
                startActivity(intent);
            }
        });

        return root17;
    }
}
