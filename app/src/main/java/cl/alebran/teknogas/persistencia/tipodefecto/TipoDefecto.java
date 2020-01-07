package cl.alebran.teknogas.persistencia.tipodefecto;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "tipo_defectos")
public class TipoDefecto implements Parcelable {


    public TipoDefecto() {
    }


    @PrimaryKey
    @NonNull
    @ColumnInfo(name="id_Tipo_Defecto")
    private int id_Tipo_Defecto;
    @ColumnInfo(name="Descripcion")
    private String Descripcion;
    @ColumnInfo(name="id_Clasificacion")
    private int id_Clasificacion;
    @ColumnInfo(name="Estado_Inspeccion")
    private int Estado_Inspeccion;
    @ColumnInfo(name="Codigo_Defecto")
    private int Codigo_Defecto;
    @ColumnInfo(name="Fecha_Creacion")
    private String Fecha_Creacion;
    @ColumnInfo(name="Usuario_Creacion")
    private String Usuario_Creacion;
    @ColumnInfo(name="Fecha_Modificacion")
    private String Fecha_Modificacion;
    @ColumnInfo(name="Usuario_Modificacion")
    private String Usuario_Modificacion;
    @ColumnInfo(name="Estado")
    private String Estado;


    public int getId_Tipo_Defecto() {
        return id_Tipo_Defecto;
    }

    public void setId_Tipo_Defecto(int id_Tipo_Defecto) {
        this.id_Tipo_Defecto = id_Tipo_Defecto;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public int getId_Clasificacion() {
        return id_Clasificacion;
    }

    public void setId_Clasificacion(int id_Clasificacion) {
        this.id_Clasificacion = id_Clasificacion;
    }

    public int getEstado_Inspeccion() {
        return Estado_Inspeccion;
    }

    public void setEstado_Inspeccion(int estado_Inspeccion) {
        Estado_Inspeccion = estado_Inspeccion;
    }

    public int getCodigo_Defecto() {
        return Codigo_Defecto;
    }

    public void setCodigo_Defecto(int codigo_Defecto) {
        Codigo_Defecto = codigo_Defecto;
    }

    public String getFecha_Creacion() {
        return Fecha_Creacion;
    }

    public void setFecha_Creacion(String fecha_Creacion) {
        Fecha_Creacion = fecha_Creacion;
    }

    public String getUsuario_Creacion() {
        return Usuario_Creacion;
    }

    public void setUsuario_Creacion(String usuario_Creacion) {
        Usuario_Creacion = usuario_Creacion;
    }

    public String getFecha_Modificacion() {
        return Fecha_Modificacion;
    }

    public void setFecha_Modificacion(String fecha_Modificacion) {
        Fecha_Modificacion = fecha_Modificacion;
    }

    public String getUsuario_Modificacion() {
        return Usuario_Modificacion;
    }

    public void setUsuario_Modificacion(String usuario_Modificacion) {
        Usuario_Modificacion = usuario_Modificacion;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }

    @NonNull
    @Override
    public String toString() {
        return String.valueOf(getCodigo_Defecto()) + " "+getDescripcion();
    }
}
