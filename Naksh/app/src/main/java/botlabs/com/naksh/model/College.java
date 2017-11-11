package botlabs.com.naksh.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by dell on 23-03-2017.
 */

public class College implements Parcelable {

    private String name;
    private String department;
    private String faculty;
    private String program;
    private String disciplineGroup;
    private String discipline;
    private String lrate;
    private String mfratio;

    public College() {
    }


    protected College(Parcel in) {
        name = in.readString();
        department = in.readString();
        faculty = in.readString();
        program = in.readString();
        disciplineGroup = in.readString();
        discipline = in.readString();
        lrate = in.readString();
        mfratio = in.readString();
    }

    public static final Creator<College> CREATOR = new Creator<College>() {
        @Override
        public College createFromParcel(Parcel in) {
            return new College(in);
        }

        @Override
        public College[] newArray(int size) {
            return new College[size];
        }
    };

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getFaculty() {
        return this.faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getProgram() {
        return this.program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getDisciplineGroup() {
        return this.disciplineGroup;
    }

    public void setDisciplineGroup(String disciplineGroup) {
        this.disciplineGroup = disciplineGroup;
    }

    public String getDiscipline() {
        return this.discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public String getLrate() {
        return this.lrate;
    }

    public void setLrate(String lrate) {
        this.lrate = lrate;
    }

    public String getMfratio() {
        return this.mfratio;
    }

    public void setMfratio(String mfratio) {
        this.mfratio = mfratio;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(department);
        dest.writeString(faculty);
        dest.writeString(program);
        dest.writeString(disciplineGroup);
        dest.writeString(discipline);
        dest.writeString(lrate);
        dest.writeString(mfratio);
    }
}
