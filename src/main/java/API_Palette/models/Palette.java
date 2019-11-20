//----------------------------------- API_Palette.models.Palette.java-----------------------------------

package API_Palette.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Palette {

    @SerializedName("id_palette")
    @Expose
    private Integer id_palette;
    @SerializedName("code_palette")
    @Expose
    private String code_palette;
    @SerializedName("poids")
    @Expose
    private Integer poids;
    @SerializedName("nombre")
    @Expose
    private Integer nombre;

    public Integer getIdPalette() {
        return id_palette;
    }

    public void setIdPalette(Integer idPalette) {
        this.id_palette = idPalette;
    }

    public String getCodePalette() {
        return code_palette;
    }

    public void setCodePalette(String codePalette) {
        this.code_palette = codePalette;
    }

    public Integer getPoids() {
        return poids;
    }

    public void setPoids(Integer poids) {
        this.poids = poids;
    }

    public Integer getNombre() {
        return nombre;
    }

    public void setNombre(Integer nombre) {
        this.nombre = nombre;
    }

}