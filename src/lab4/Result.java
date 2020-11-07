package lab4;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {

    @SerializedName("SkyScannner")
    @Expose
    private List<SkyScannner> skyScannner = null;

    public List<SkyScannner> getSkyScannner() {
        return skyScannner;
    }

    public void setSkyScannner(List<SkyScannner> skyScannner) {
        this.skyScannner = skyScannner;
    }

}