package br.com.etecia.myapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private Context mContexto;
    private List<Jogadoras> lstJogadoras;

    public MyAdapter(Context mContexto, List<Jogadoras> listaJogadoras) {
        this.mContexto = mContexto;
        this.lstJogadoras = lstJogadoras;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;

                LayoutInflater inflater = LayoutInflater.from(mContexto);
                view = inflater.inflate(R.layout.modelo_jogadoras, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    holder.idNomeJogadoras.setText(lstJogadoras.get(position).getTitulo());
    holder.idImgJogadoras.setImageResource(lstJogadoras.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return lstJogadoras.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView idNomeJogadoras;
        ImageView idImgJogadoras;
        CardView idCardJogadoras;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            idNomeJogadoras = itemView.findViewById(R.id.idNomeJogadoras);
            idCardJogadoras = itemView.findViewById(R.id.idCardJogadoras);
            idImgJogadoras = itemView.findViewById(R.id.idImgJogadoras);
        }
    }


}
