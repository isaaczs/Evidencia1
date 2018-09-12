package com.zermeno.isaac.evidencia1;

import android.os.Parcel;
import android.os.Parcelable;

public class Usuario implements Parcelable {
    String nombre;
    String pApellido;
    String sApellido;
    int edad;
    String nFecha;
    String estado;
    String genero;

    public Usuario(){
        this.nombre = "";
        this.pApellido = "";
        this.sApellido = "";
        this.edad = 0;
        this.nFecha = "";
        this.estado = "";
        this.genero = "";
    }
    @Override
    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nombre);
        dest.writeString(pApellido);
        dest.writeString(sApellido);
        dest.writeInt(edad);
        dest.writeString(nFecha);
        dest.writeString(estado);
        dest.writeString(genero);
    }

    public static final Creator<Usuario> CREATOR
            = new Creator<Usuario>(){
        public Usuario createFromParcel(Parcel in){
            return new Usuario(in);
        }

        @Override
        public Usuario[] newArray(int size) {
            return new Usuario[size];
        }
    };

    public Usuario(Parcel in){
        nombre = in.readString();
        pApellido = in.readString();
        sApellido = in.readString();
        edad = in.readInt();
        nFecha = in.readString();
        estado = in.readString();
        genero = in.readString();
    }
}
