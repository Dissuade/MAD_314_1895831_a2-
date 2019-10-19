import com.example.mad314a2.R;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;


public class StudentViewHolder extends ViewHolder {

    public TextView tvName;

    public StudentViewHolder(View itemView) {
        super(itemView);
        tvName = itemView.findViewById(R.id.tvName);

    }

}