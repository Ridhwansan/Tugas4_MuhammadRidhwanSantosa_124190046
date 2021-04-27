package com.example.fragment;

import java.util.ArrayList;

public class TeamData {
    private static String[] nama = new String[]{"Team Alliance","Team Evil Geniuses","Team Navi","Team Nigma","Team OG","Team Secret"};

    private static int[] gambar =  new int[]{R.drawable.alliance,R.drawable.evil,R.drawable.navi,R.drawable.nigma,R.drawable.og,R.drawable.secret};

    public static ArrayList<TeamModel> getListData(){
        TeamModel teamModel = null;
        ArrayList<TeamModel> list = new ArrayList<TeamModel>();
        for ( int i = 0;i<nama.length;i++){
            teamModel = new  TeamModel();
            teamModel.setGambarTeam(gambar[i]);
            teamModel.setNamaTeam(nama[i]);
            list.add(teamModel);
        }
        return list;
    }
}
