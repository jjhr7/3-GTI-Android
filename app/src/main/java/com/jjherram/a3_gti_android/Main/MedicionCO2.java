package com.jjherram.a3_gti_android.Main;



public class MedicionCO2 {

    public double data;
    public String  read_date;
    public int deviceId;

    public MedicionCO2(){
        this.data = 00000;
        this.read_date = "0000-00-00";
        this.deviceId = 1;
    }

    public MedicionCO2(double data, String read_date, int deviceId){
      this.data = data;
      this.read_date = read_date;
      this.deviceId = deviceId;
    }



    public double getData() {
        return data;
    }

    public void setData(double data) {
        this.data = data;
    }

    public String getRead_date() {
        return read_date;
    }

    public void setRead_date(String read_date) {
        this.read_date = read_date;
    }

    public int getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }

    public String toJSON(){
        //return "{\"data\": "+this.data+"\", \"read_date\": "+this.read_date+"\", \"device_id\": "+this.deviceId+"\"}";
        return "data="+this.data+"&read_date="+this.read_date+"&device_id="+this.deviceId;
    }
}
