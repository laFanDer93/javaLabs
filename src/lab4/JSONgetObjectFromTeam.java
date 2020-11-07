package lab4;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class JSONgetObjectFromTeam {

    @SerializedName("Team")
    @Expose
    private List<Team> team = null;

    public List<Team> getTeam() {
        return team;
    }

    public void setTeam(List<Team> team) {
        this.team = team;
    }

}