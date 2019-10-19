
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mad314a2.R;
import com.example.mad314a2.StudentDataSource;

import java.util.ArrayList;
import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentViewHolder> {
    private LayoutInflater mInflater;
    private List<StudentDataSource> mData = new ArrayList<>();

    public StudentAdapter(Context context) {
        this.mInflater = LayoutInflater.from(context);
        this.mData.addAll(StudentDataSource.getInstance().getStudents());

    }

    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.students_vh, parent, false);
        return new StudentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {

        List<StudentDataSource> students = StudentDataSource.getInstance().getStudents();

        holder.tvName.setText(students.get(position).name);
        holder.tvid.setText(students.get(position).id);
        holder.tvpassword.setText(String.valueOf(students.get(position).password));
    }

    @Override
    public int getItemCount() {
        return StudentDataSource.getInstance().getStudents().size();
    }

    public void update() {
        mData.clear();
        mData.addAll(StudentDataSource.getInstance().getStudents());
        notifyDataSetChanged();
    }
}
