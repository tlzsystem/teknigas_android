package cl.alebran.teknogas.persistencia.departamento;


import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "departamentos")
public class Departamento {

    @PrimaryKey
    @ColumnInfo(name="id_departamento")
    private int id_departamento;
    @NonNull
    @ColumnInfo(name = "id_instalacion")
    private int id_instalacion;
    @ColumnInfo(name = "nombre_morador_departamento")
    private String nombre_morador_departamento;
    @ColumnInfo(name = "color_sello_departamento")
    private int color_sello_departamento;
    @ColumnInfo(name = "nro_sello_departamento")
    private int nro_sello_departamento;
    @ColumnInfo(name = "observacion_departamento")
    private String observacion_departamento;
    @ColumnInfo(name = "nro_departamento")
    private String nro_departamento;
    @ColumnInfo(name = "nro_linea_departamento")
    private String nro_linea_departamento;
    @ColumnInfo(name = "ph_departamento")
    private int ph_departamento;
    @ColumnInfo(name = "ph_ubicacion_departamento")
    private int ph_ubicacion_departamento;
    @ColumnInfo(name = "fecha_creacion")
    private String fecha_creacion;
    @ColumnInfo(name = "usuario_creacion")
    private String usuario_creacion;
    @ColumnInfo(name = "fecha_modificacion")
    private String fecha_modificacion;
    @ColumnInfo(name = "usuario_modificacion")
    private String usuario_modificacion;
    @ColumnInfo(name = "estado")
    private String estado;
    @ColumnInfo(name = "hora_inicio")
    private String hora_inicio;
    @ColumnInfo(name = "hora_termino")
    private String hora_termino;
    @ColumnInfo(name = "fecha_inspeccion")
    private String fecha_inspeccion;
    @ColumnInfo(name = "prueba_hermeticidad")
    private int prueba_hermeticidad;
    @ColumnInfo(name = "valor_fuga")
    private String valor_fuga;
    @ColumnInfo(name = "tiempo_fuga")
    private int tiempo_fuga;
    @ColumnInfo(name = "ph_baja")
    private String ph_baja;
    @ColumnInfo(name = "ph_media")
    private String ph_media;
    @ColumnInfo(name = "observacion_ph")
    private String observacion_ph;
    @ColumnInfo(name = "id_inspeccion")
    private int id_inspeccion;
    @ColumnInfo(name = "presion_inicial")
    private int presion_inicial;
    @ColumnInfo(name = "presion_final")
    private int presion_final;
    @ColumnInfo(name = "diferencia_presion")
    private int diferencia_presion;
    @ColumnInfo(name = "observacion_presion")
    private String observacion_presion;
    @ColumnInfo(name = "evaluacion")
    private int evaluacion;
    @ColumnInfo(name = "ident_equipo_utilizado")
    private String ident_equipo_utilizado;
    @ColumnInfo(name = "combustion_nro")
    private String combustion_nro;
    @ColumnInfo(name = "evaluacion_inspeccion")
    private int evaluacion_inspeccion;


    public int getId_departamento() {
        return id_departamento;
    }

    public void setId_departamento(int id_departamento) {
        this.id_departamento = id_departamento;
    }

    public int getId_instalacion() {
        return id_instalacion;
    }

    public void setId_instalacion(int id_instalacion) {
        this.id_instalacion = id_instalacion;
    }

    public String getNombre_morador_departamento() {
        return nombre_morador_departamento;
    }

    public void setNombre_morador_departamento(String nombre_morador_departamento) {
        this.nombre_morador_departamento = nombre_morador_departamento;
    }

    public int getColor_sello_departamento() {
        return color_sello_departamento;
    }

    public void setColor_sello_departamento(int color_sello_departamento) {
        this.color_sello_departamento = color_sello_departamento;
    }

    public int getNro_sello_departamento() {
        return nro_sello_departamento;
    }

    public void setNro_sello_departamento(int nro_sello_departamento) {
        this.nro_sello_departamento = nro_sello_departamento;
    }

    public String getObservacion_departamento() {
        return observacion_departamento;
    }

    public void setObservacion_departamento(String observacion_departamento) {
        this.observacion_departamento = observacion_departamento;
    }

    public String getNro_departamento() {
        return nro_departamento;
    }

    public void setNro_departamento(String nro_departamento) {
        this.nro_departamento = nro_departamento;
    }

    public String getNro_linea_departamento() {
        return nro_linea_departamento;
    }

    public void setNro_linea_departamento(String nro_linea_departamento) {
        this.nro_linea_departamento = nro_linea_departamento;
    }

    public int getPh_departamento() {
        return ph_departamento;
    }

    public void setPh_departamento(int ph_departamento) {
        this.ph_departamento = ph_departamento;
    }

    public int getPh_ubicacion_departamento() {
        return ph_ubicacion_departamento;
    }

    public void setPh_ubicacion_departamento(int ph_ubicacion_departamento) {
        this.ph_ubicacion_departamento = ph_ubicacion_departamento;
    }

    public String getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(String fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public String getUsuario_creacion() {
        return usuario_creacion;
    }

    public void setUsuario_creacion(String usuario_creacion) {
        this.usuario_creacion = usuario_creacion;
    }

    public String getFecha_modificacion() {
        return fecha_modificacion;
    }

    public void setFecha_modificacion(String fecha_modificacion) {
        this.fecha_modificacion = fecha_modificacion;
    }

    public String getUsuario_modificacion() {
        return usuario_modificacion;
    }

    public void setUsuario_modificacion(String usuario_modificacion) {
        this.usuario_modificacion = usuario_modificacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(String hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public String getHora_termino() {
        return hora_termino;
    }

    public void setHora_termino(String hora_termino) {
        this.hora_termino = hora_termino;
    }

    public String getFecha_inspeccion() {
        return fecha_inspeccion;
    }

    public void setFecha_inspeccion(String fecha_inspeccion) {
        this.fecha_inspeccion = fecha_inspeccion;
    }

    public int getPrueba_hermeticidad() {
        return prueba_hermeticidad;
    }

    public void setPrueba_hermeticidad(int prueba_hermeticidad) {
        this.prueba_hermeticidad = prueba_hermeticidad;
    }

    public String getValor_fuga() {
        return valor_fuga;
    }

    public void setValor_fuga(String valor_fuga) {
        this.valor_fuga = valor_fuga;
    }

    public int getTiempo_fuga() {
        return tiempo_fuga;
    }

    public void setTiempo_fuga(int tiempo_fuga) {
        this.tiempo_fuga = tiempo_fuga;
    }

    public String getPh_baja() {
        return ph_baja;
    }

    public void setPh_baja(String ph_baja) {
        this.ph_baja = ph_baja;
    }

    public String getPh_media() {
        return ph_media;
    }

    public void setPh_media(String ph_media) {
        this.ph_media = ph_media;
    }

    public String getObservacion_ph() {
        return observacion_ph;
    }

    public void setObservacion_ph(String observacion_ph) {
        this.observacion_ph = observacion_ph;
    }

    public int getId_inspeccion() {
        return id_inspeccion;
    }

    public void setId_inspeccion(int id_inspeccion) {
        this.id_inspeccion = id_inspeccion;
    }

    public int getPresion_inicial() {
        return presion_inicial;
    }

    public void setPresion_inicial(int presion_inicial) {
        this.presion_inicial = presion_inicial;
    }

    public int getPresion_final() {
        return presion_final;
    }

    public void setPresion_final(int presion_final) {
        this.presion_final = presion_final;
    }

    public int getDiferencia_presion() {
        return diferencia_presion;
    }

    public void setDiferencia_presion(int diferencia_presion) {
        this.diferencia_presion = diferencia_presion;
    }

    public String getObservacion_presion() {
        return observacion_presion;
    }

    public void setObservacion_presion(String observacion_presion) {
        this.observacion_presion = observacion_presion;
    }

    public int getEvaluacion() {
        return evaluacion;
    }

    public void setEvaluacion(int evaluacion) {
        this.evaluacion = evaluacion;
    }

    public String getIdent_equipo_utilizado() {
        return ident_equipo_utilizado;
    }

    public void setIdent_equipo_utilizado(String ident_equipo_utilizado) {
        this.ident_equipo_utilizado = ident_equipo_utilizado;
    }

    public String getCombustion_nro() {
        return combustion_nro;
    }

    public void setCombustion_nro(String combustion_nro) {
        this.combustion_nro = combustion_nro;
    }

    public int getEvaluacion_inspeccion() {
        return evaluacion_inspeccion;
    }

    public void setEvaluacion_inspeccion(int evaluacion_inspeccion) {
        this.evaluacion_inspeccion = evaluacion_inspeccion;
    }
}
