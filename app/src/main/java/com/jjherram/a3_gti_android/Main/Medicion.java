package com.jjherram.a3_gti_android.Main;

public class Medicion {

    private String fechaMedicion;
    private String deviceId;
    private String userId ;
    private Float longitud;
    private Float latitud;

    public String getFechaMedicion() {
        return fechaMedicion;
    }

    public void setFechaMedicion(String fechaMedicion) {
        this.fechaMedicion = fechaMedicion;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Float getLongitud() {
        return longitud;
    }

    public void setLongitud(Float longitud) {
        this.longitud = longitud;
    }

    public Float getLatitud() {
        return latitud;
    }

    public void setLatitud(Float latitud) {
        this.latitud = latitud;
    }

    public void mostrarMedicion(String fecha, String deviceId, String userId, Float longitud, Float latitud){
        System.out.println(fecha+":"+deviceId+":"+userId+":"+":"+longitud+":"+latitud);
    }

}
