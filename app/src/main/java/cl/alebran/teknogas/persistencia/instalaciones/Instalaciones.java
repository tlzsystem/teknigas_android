package cl.alebran.teknogas.persistencia.instalaciones;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "instalaciones")
public class Instalaciones implements Parcelable {

    @PrimaryKey
    @NonNull
    @ColumnInfo(name="id_instalacion")
    private int id_instalacion;
    @ColumnInfo(name="direccion_inspeccion")
    private String direccion_inspeccion;
    @ColumnInfo(name="numero")
    private String numero;
    @ColumnInfo(name="codigo_postal_instalacion")
    private String codigo_postal_instalacion;
    @ColumnInfo(name="num_pisos_instalacion")
    private String num_pisos_instalacion;
    @ColumnInfo(name="num_departamentos_instalacion")
    private String num_departamentos_instalacion;
    @ColumnInfo(name="num_artefactos_conducto_piso_instalacion")
    private String num_artefactos_conducto_piso_instalacion;
    @ColumnInfo(name="tipo_instalacion")
    private int tipo_instalacion;
    @ColumnInfo(name="anio_declaracion_instalacion")
    private String anio_declaracion_instalacion;
    @ColumnInfo(name="num_conductos_instalacion")
    private String num_conductos_instalacion;
    @ColumnInfo(name="gas_instalacion")
    private int gas_instalacion;
    @ColumnInfo(name="nombre_pdte_junta_vigilancia_instalacion")
    private String nombre_pdte_junta_vigilancia_instalacion;
    @ColumnInfo(name="fono_pdte_junta_vigilancia_instalacion")
    private String fono_pdte_junta_vigilancia_instalacion;
    @ColumnInfo(name="rut_pdte_junta_vigilancia_instalacion")
    private String rut_pdte_junta_vigilancia_instalacion;
    @ColumnInfo(name="fecha_notificacion_instalacion")
    private String fecha_notificacion_instalacion;
    @ColumnInfo(name="fecha_envio_informe_instalacion")
    private String fecha_envio_informe_instalacion;
    @ColumnInfo(name="color_sello_instalacion")
    private int color_sello_instalacion;
    @ColumnInfo(name="num_correlativo_inspeccion_inspector")
    private String num_correlativo_inspeccion_inspector;
    @ColumnInfo(name="sellos_instalacion")
    private String sellos_instalacion;
    @ColumnInfo(name="fecha_proxima_inspeccion_instalacion")
    private String fecha_proxima_inspeccion_instalacion;
    @ColumnInfo(name="fecha_creacion")
    private String fecha_creacion;
    @ColumnInfo(name="usuario_creacion")
    private String usuario_creacion;
    @ColumnInfo(name="fecha_modificacion")
    private String fecha_modificacion;
    @ColumnInfo(name="id_estado_instalacion")
    private int id_estado_instalacion;
    @ColumnInfo(name="id_empresa_distribuidora")
    private int id_empresa_distribuidora;
    @ColumnInfo(name="telefono_edificio")
    private String telefono_edificio;
    @ColumnInfo(name="id_reinspeccion_instalacion")
    private int id_reinspeccion_instalacion;
    @ColumnInfo(name="id_color_sello_anterior_instalacion")
    private int id_color_sello_anterior_instalacion;
    @ColumnInfo(name="fecha_sello_anterior_instalacion")
    private String fecha_sello_anterior_instalacion;
    @ColumnInfo(name="nro_sello_anterior_instalacion")
    private int nro_sello_anterior_instalacion;
    @ColumnInfo(name="num_sello_instalacion")
    private int num_sello_instalacion;
    @ColumnInfo(name="fecha_inspeccion")
    private String fecha_inspeccion;
    @ColumnInfo(name="hora_inspeccion")
    private String hora_inspeccion;
    @ColumnInfo(name="estado_ultima_inspeccion")
    private int estado_ultima_inspeccion;
    @ColumnInfo(name="codigo_inspeccion")
    private String codigo_inspeccion;
    @ColumnInfo(name="tipo_medidor")
    private String tipo_medidor;
    @ColumnInfo(name="observacion_nicho")
    private String observacion_nicho;
    @ColumnInfo(name="ident_equpos_utilizados")
    private String ident_equpos_utilizados;
    @ColumnInfo(name = "nombre_instalacion")
    private String nombre_instalacion;


    public int getId_instalacion() {
        return id_instalacion;
    }

    public void setId_instalacion(int id_instalacion) {
        this.id_instalacion = id_instalacion;
    }

    public String getDireccion_inspeccion() {
        return direccion_inspeccion;
    }

    public void setDireccion_inspeccion(String direccion_inspeccion) {
        this.direccion_inspeccion = direccion_inspeccion;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCodigo_postal_instalacion() {
        return codigo_postal_instalacion;
    }

    public void setCodigo_postal_instalacion(String codigo_postal_instalacion) {
        this.codigo_postal_instalacion = codigo_postal_instalacion;
    }

    public String getNum_pisos_instalacion() {
        return num_pisos_instalacion;
    }

    public void setNum_pisos_instalacion(String num_pisos_instalacion) {
        this.num_pisos_instalacion = num_pisos_instalacion;
    }

    public String getNum_departamentos_instalacion() {
        return num_departamentos_instalacion;
    }

    public void setNum_departamentos_instalacion(String num_departamentos_instalacion) {
        this.num_departamentos_instalacion = num_departamentos_instalacion;
    }

    public String getNum_artefactos_conducto_piso_instalacion() {
        return num_artefactos_conducto_piso_instalacion;
    }

    public void setNum_artefactos_conducto_piso_instalacion(String num_artefactos_conducto_piso_instalacion) {
        this.num_artefactos_conducto_piso_instalacion = num_artefactos_conducto_piso_instalacion;
    }

    public int getTipo_instalacion() {
        return tipo_instalacion;
    }

    public void setTipo_instalacion(int tipo_instalacion) {
        this.tipo_instalacion = tipo_instalacion;
    }

    public String getAnio_declaracion_instalacion() {
        return anio_declaracion_instalacion;
    }

    public void setAnio_declaracion_instalacion(String anio_declaracion_instalacion) {
        this.anio_declaracion_instalacion = anio_declaracion_instalacion;
    }

    public String getNum_conductos_instalacion() {
        return num_conductos_instalacion;
    }

    public void setNum_conductos_instalacion(String num_conductos_instalacion) {
        this.num_conductos_instalacion = num_conductos_instalacion;
    }

    public int getGas_instalacion() {
        return gas_instalacion;
    }

    public void setGas_instalacion(int gas_instalacion) {
        this.gas_instalacion = gas_instalacion;
    }

    public String getNombre_pdte_junta_vigilancia_instalacion() {
        return nombre_pdte_junta_vigilancia_instalacion;
    }

    public void setNombre_pdte_junta_vigilancia_instalacion(String nombre_pdte_junta_vigilancia_instalacion) {
        this.nombre_pdte_junta_vigilancia_instalacion = nombre_pdte_junta_vigilancia_instalacion;
    }

    public String getFono_pdte_junta_vigilancia_instalacion() {
        return fono_pdte_junta_vigilancia_instalacion;
    }

    public void setFono_pdte_junta_vigilancia_instalacion(String fono_pdte_junta_vigilancia_instalacion) {
        this.fono_pdte_junta_vigilancia_instalacion = fono_pdte_junta_vigilancia_instalacion;
    }

    public String getRut_pdte_junta_vigilancia_instalacion() {
        return rut_pdte_junta_vigilancia_instalacion;
    }

    public void setRut_pdte_junta_vigilancia_instalacion(String rut_pdte_junta_vigilancia_instalacion) {
        this.rut_pdte_junta_vigilancia_instalacion = rut_pdte_junta_vigilancia_instalacion;
    }

    public String getFecha_notificacion_instalacion() {
        return fecha_notificacion_instalacion;
    }

    public void setFecha_notificacion_instalacion(String fecha_notificacion_instalacion) {
        this.fecha_notificacion_instalacion = fecha_notificacion_instalacion;
    }

    public String getFecha_envio_informe_instalacion() {
        return fecha_envio_informe_instalacion;
    }

    public void setFecha_envio_informe_instalacion(String fecha_envio_informe_instalacion) {
        this.fecha_envio_informe_instalacion = fecha_envio_informe_instalacion;
    }

    public int getColor_sello_instalacion() {
        return color_sello_instalacion;
    }

    public void setColor_sello_instalacion(int color_sello_instalacion) {
        this.color_sello_instalacion = color_sello_instalacion;
    }

    public String getNum_correlativo_inspeccion_inspector() {
        return num_correlativo_inspeccion_inspector;
    }

    public void setNum_correlativo_inspeccion_inspector(String num_correlativo_inspeccion_inspector) {
        this.num_correlativo_inspeccion_inspector = num_correlativo_inspeccion_inspector;
    }

    public String getSellos_instalacion() {
        return sellos_instalacion;
    }

    public void setSellos_instalacion(String sellos_instalacion) {
        this.sellos_instalacion = sellos_instalacion;
    }

    public String getFecha_proxima_inspeccion_instalacion() {
        return fecha_proxima_inspeccion_instalacion;
    }

    public void setFecha_proxima_inspeccion_instalacion(String fecha_proxima_inspeccion_instalacion) {
        this.fecha_proxima_inspeccion_instalacion = fecha_proxima_inspeccion_instalacion;
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

    public int getId_estado_instalacion() {
        return id_estado_instalacion;
    }

    public void setId_estado_instalacion(int id_estado_instalacion) {
        this.id_estado_instalacion = id_estado_instalacion;
    }

    public int getId_empresa_distribuidora() {
        return id_empresa_distribuidora;
    }

    public void setId_empresa_distribuidora(int id_empresa_distribuidora) {
        this.id_empresa_distribuidora = id_empresa_distribuidora;
    }

    public String getTelefono_edificio() {
        return telefono_edificio;
    }

    public void setTelefono_edificio(String telefono_edificio) {
        this.telefono_edificio = telefono_edificio;
    }

    public int getId_reinspeccion_instalacion() {
        return id_reinspeccion_instalacion;
    }

    public void setId_reinspeccion_instalacion(int id_reinspeccion_instalacion) {
        this.id_reinspeccion_instalacion = id_reinspeccion_instalacion;
    }

    public int getId_color_sello_anterior_instalacion() {
        return id_color_sello_anterior_instalacion;
    }

    public void setId_color_sello_anterior_instalacion(int id_color_sello_anterior_instalacion) {
        this.id_color_sello_anterior_instalacion = id_color_sello_anterior_instalacion;
    }

    public String getFecha_sello_anterior_instalacion() {
        return fecha_sello_anterior_instalacion;
    }

    public void setFecha_sello_anterior_instalacion(String fecha_sello_anterior_instalacion) {
        this.fecha_sello_anterior_instalacion = fecha_sello_anterior_instalacion;
    }

    public int getNro_sello_anterior_instalacion() {
        return nro_sello_anterior_instalacion;
    }

    public void setNro_sello_anterior_instalacion(int nro_sello_anterior_instalacion) {
        this.nro_sello_anterior_instalacion = nro_sello_anterior_instalacion;
    }

    public int getNum_sello_instalacion() {
        return num_sello_instalacion;
    }

    public void setNum_sello_instalacion(int num_sello_instalacion) {
        this.num_sello_instalacion = num_sello_instalacion;
    }

    public String getFecha_inspeccion() {
        return fecha_inspeccion;
    }

    public void setFecha_inspeccion(String fecha_inspeccion) {
        this.fecha_inspeccion = fecha_inspeccion;
    }

    public String getHora_inspeccion() {
        return hora_inspeccion;
    }

    public void setHora_inspeccion(String hora_inspeccion) {
        this.hora_inspeccion = hora_inspeccion;
    }

    public int getEstado_ultima_inspeccion() {
        return estado_ultima_inspeccion;
    }

    public void setEstado_ultima_inspeccion(int estado_ultima_inspeccion) {
        this.estado_ultima_inspeccion = estado_ultima_inspeccion;
    }

    public String getCodigo_inspeccion() {
        return codigo_inspeccion;
    }

    public void setCodigo_inspeccion(String codigo_inspeccion) {
        this.codigo_inspeccion = codigo_inspeccion;
    }

    public String getTipo_medidor() {
        return tipo_medidor;
    }

    public void setTipo_medidor(String tipo_medidor) {
        this.tipo_medidor = tipo_medidor;
    }

    public String getObservacion_nicho() {
        return observacion_nicho;
    }

    public void setObservacion_nicho(String observacion_nicho) {
        this.observacion_nicho = observacion_nicho;
    }

    public String getIdent_equpos_utilizados() {
        return ident_equpos_utilizados;
    }

    public void setIdent_equpos_utilizados(String ident_equpos_utilizados) {
        this.ident_equpos_utilizados = ident_equpos_utilizados;
    }

    public String getNombre_instalacion() {
        return nombre_instalacion;
    }

    public void setNombre_instalacion(String nombre_instalacion) {
        this.nombre_instalacion = nombre_instalacion;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

    }
}
