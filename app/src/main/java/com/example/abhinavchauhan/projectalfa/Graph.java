package com.example.abhinavchauhan.projectalfa;

import android.content.Context;
import android.support.v4.app.Fragment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Graph
{
    private int V;   // No. of vertices
    private LinkedList<Integer> adj[]; //Adjacency Lists
    private LinkedList<Integer> path[];
    String stations[]={"HUDA City Centre","IFFCO Chowk","MG Road","Sikanderpur","Guru Dronacharya","Arjangarh","Ghitorni","Sultanpur","Chhattarpur","Qutab Minar","Saket","Malviya Nagar","Hauz Khas","Green Park","AIIMS","INA","Jor Bagh","Race Course","Udyog Bhawan","Central Secretariat","Patel Chowk","Rajiv Chowk","New Delhi","Chawri Bazaar","Chandni Chowk","Kashmere Gate","Civil Lines","Vidhan Sabha","Vishwavidyalaya","GTB Nagar","Model town","Azadpur","Adarsh Nagar","Jahangirpuri","Haiderpur","Rohini sec 18","Samaypur Badli","Dilshad Garden","Jhilmil","Mansarover Park","Shahdra","Welcome","Seelampur","Shastri Park","Tis Hazari","Pulbangash","Pratap Nagar","Shastri Nagar","Inderlok","Kanhaiya Nagar","Keshav Puram","Netaji Subhash Place","Kohat Enclave","Pitampura","Rohini East","Rohini West","Rithala","Satguru Ram Singh Marg","Ashok Park Main","Punjabi Bagh","Shivaji Park","Madipur","Paschim Vihar East","Paschim Vihar West","Peeragarhi","Udyog Nagar","Surajmal Stadium","Nangloi","Nangloi Railway Stadium","Rajdhani Park","Mundka","Dwarka Sec 21","Dwarka Sec 8","Dwarka Sec 9","Dwarka Sec 10","Dwarka Sec 11","Dwarka Sec 12","Dwarka Sec 13","Dwarka Sec 14","Dwarka","Dwarka Mor","Nawada","Uttam Nagar West","Uttam Nagar East","Janakpuri West","Janakpuri East","Tilak Nagar","Subhash Nagar","Tagore Garden","Rajouri Garden","Ramesh Nagar","Moti Nagar","Kirti Nagar","Shadipur","Patel Nagar","Rajendra Place","Karol Bagh","Jhandewalan","R.K Ashram Marg","Barakhamba Road","Mandi House","Pragati Madian","Indraprastha","Yamuna Bank","Akshardham","Mayur Vihar","Mayur Vihar Extn","New Ashok Nagar","Noida Sector 15","Noida Sec 16","Noida Sec 18","Botanical Garden","Golf Course","City Centre","Laxmi Nagar","Nirman Vihar","Preet Vihar","Karkarduma","Anand Vihar ISBT","Kaushambhi","Vaishali","Shivaji Stadium","Dhaula Kuan","Delhi Aero City Centre","IGI Airport","ITO","Janpath","Khan Market","JLN Stadium","Jangpura","Lajpat Nagar","Moolchand","Kailash Colony","Nehru Place","Kalkaji Mandir","Govind Puri","Okhla","Jasola-Apollo","Sarita Vihar","Mohan Estate","Tughlakabad","Badarpur Border","Sarai","NHPC Chowk","Mewala Maharajpur","Sector 28","Badkal Mor","Old Faridabad","Neelam Chowk","Bata chowk","Escort Mujesar"};

    // Constructor
    Graph(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
        path = new LinkedList[v];
        for(int i=0;i<v;++i)
            path[i]=new LinkedList();
    }


    void addedge(int v,int w)
    {
        adj[v].add(w);
    }

    // prints BFS traversal from a given source s
    ArrayList<String> BFS(int s,int d)
    {
        boolean visited[] = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<Integer>();


        visited[s]=true;
        queue.add(s);
        path[s].addLast(s);
        while (queue.size() != 0)
        {

            s = queue.poll();

            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext())
            {
                int n = i.next();
                if (!visited[n])
                {
                    visited[n] = true;
                    queue.add(n);
                    path[n]=(LinkedList)path[s].clone();
                    path[n].addLast(n);
                }
            }
        }
        ArrayList<String> pathway= new ArrayList<String>();
        while(path[d].size()!=0)
        {
            int xyz=path[d].getFirst();
            path[d].poll();
            pathway.add(stations[xyz]);
        }
        return pathway;
    }

    // Driver method to
    public static void main(String args[])
    {
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
            g.addedge(i,i+1);
        for(int i=113;i>=72;i--)
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
    }
}