package com.example.fragment;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class TeamAdapter extends RecyclerView.Adapter<TeamAdapter.ViewHolder> {
    private Context context;
    private ArrayList<TeamModel> teamModels;

    public TeamAdapter(ArrayList<TeamModel> listData, Context context) {
        this.context = context;
    }

    public TeamAdapter(MainActivity mainActivity) {
    }

    public ArrayList<TeamModel> getTeamModels() {
        return teamModels;
    }

    public void setTeamModels(ArrayList<TeamModel> teamModels) {
        this.teamModels = teamModels;
    }

    @NonNull
    @Override
    public TeamAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemRow = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cetak,parent,false);
        return new ViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull TeamAdapter.ViewHolder holder, int position) {
        Glide.with(context).load(getTeamModels().get(position).getGambarTeam()).into(holder.gambar);
        holder.text.setText(getTeamModels().get(position).getNamaTeam());
    }

    @Override
    public int getItemCount() {
        return getTeamModels().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView gambar;
        private TextView text;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            gambar = itemView.findViewById(R.id.cetak_gambar);
            text = itemView.findViewById(R.id.cetak_text);

        }
    }
}
