package botlabs.com.naksh;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import botlabs.com.naksh.model.College;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by dell on 07-10-2017.
 */

public class DetailCollegeActivity extends AppCompatActivity {

    @BindView(R.id.name)
    TextView name;
    @BindView(R.id.department)
    TextView department;
    @BindView(R.id.faculty)
    TextView faculty;
    @BindView(R.id.program)
    TextView program;
    @BindView(R.id.discipline_group)
    TextView disciplineGroup;
    @BindView(R.id.discipline)
    TextView discipline;
    @BindView(R.id.lrate)
    TextView lrate;
    @BindView(R.id.mfratio)
    TextView mfratio;

    private College college;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ButterKnife.bind(this);

        college = getIntent().getParcelableExtra("model");

        name.setText(college.getName());
        department.setText(college.getDepartment());
        faculty.setText(college.getFaculty());
        program.setText(college.getProgram());
        disciplineGroup.setText(college.getDisciplineGroup());
        discipline.setText(college.getDiscipline());
        lrate.setText(college.getLrate());
        mfratio.setText(college.getMfratio());
    }
}
