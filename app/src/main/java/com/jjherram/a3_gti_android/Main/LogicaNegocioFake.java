package com.jjherram.a3_gti_android.Main;

public class LogicaNegocioFake {

    private static final String  ADDRESS= "http://vmi621282.contaboserver.net";

    public LogicaNegocioFake(){

    }

    public void publicarMedicion(MedicionCO2 medicionCO2){
        PeticionarioRest peticionarioRest = new PeticionarioRest();

        peticionarioRest.realizarPeticion("POST", ADDRESS + "/api/v1/medicion/create", medicionCO2.toJSON(), new PeticionarioRest.RespuestaREST() {
            @Override
            public void callback(int codigo, String cuerpo) {
                // elTexto.setText ("cdigo respuesta: " + codigo + " <-> \n" + cuerpo);
            }
        });
    }
}
