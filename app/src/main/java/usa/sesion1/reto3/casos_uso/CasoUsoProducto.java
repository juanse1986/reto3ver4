package usa.sesion1.reto3.casos_uso;

import android.database.Cursor;

import java.util.ArrayList;

import usa.sesion1.reto3.modelos.Producto;

public class CasoUsoProducto {
    public ArrayList<Producto> llenarListaProductos(Cursor cursor){
        ArrayList<Producto> list = new ArrayList<>();
        if (cursor.getCount() == 0) {
            return list;
        }else{
            while (cursor.moveToNext()){
                Producto producto = new Producto(
                        cursor.getInt(0),
                        cursor.getString(1),
                        cursor.getString(2),
                        cursor.getString(3),
                        cursor.getBlob(4)
                );
                list.add(producto);
            }
            return list;
        }
    }
}
