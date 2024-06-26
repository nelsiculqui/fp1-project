package ProyectoF;

public class Desarrollo {

    public static void main(String[] args) {

        String[] TipoFactura = {"Venta","Compra"};//Arreglo con los tipos de factura si es Factura de compra o venta

        String[] NumeroFactura = {"F001-001788C","F001-001789V","F001-001790C","F001-001791C","F001-001792V","F001-010618V",
                "F001-010711C","F001-020719C","F001-020755C","F001-020763C"};//Arreglo con los numeros de las facturas

        String[] RUC = {"20518153197","20554862633","20252907808","20548320101","20546295592","20459857509","20459857509",
                "20516827425","20516827425","20516827425"};//Arreglo con los RUC de clientes o proveedores

        String [] NombreProveedorOCliente = {"GSP INGENIEROS Y CONSTRUCCION SAC","CONSORCIO GRUPO 8","TAYOSA SA",
                "PROYECTO Y SOLUCIONES DE ARQUITECTURA E INGENIERIA SAC","IMITA CONSTRUCTORA & SERV. GRAL. SRL",
                "NOR ORIENTE MATERIALES DE CONSTRUCCION E.I.R.L.","NOR ORIENTE MATERIALES DE CONSTRUCCION E.I.R.L.",
                "DISTRIBUCIONES Y REPRESENTACIONES PORLLES S.A.C.","DISTRIBUCIONES Y REPRESENTACIONES PORLLES S.A.C.",
                "DISTRIBUCIONES Y REPRESENTACIONES PORLLES S.A.C."};//Arreglo con los nombres de los proveedores o clientes
        //Datos de los productos que se compran o venden
        String [] DescripcionProducto={"CEMENTO SOL TIPO 1","CEMENTO ANDINO TIPO 1","FIERRO DE 1/2 ACEROS AREQUIPA","FIERRO DE 5/8 ACEROS AREQUIPA",
                "FIERRO DE 8MM ACEROS AREQUIPA","FIERRO DE 3/8 ACEROS AREQUIPA","FIERRO DE 6MM ACEROS AREQUIPA","FIERRO DE 4.7MM ACEROS AREQUIPA",
                "CEMENTO SOL TIPO 1","CEMENTO ANDINO TIPO 1","FIERRO DE 1/2 ACEROS AREQUIPA","FIERRO DE 5/8 ACEROS AREQUIPA","FIERRO DE 8MM ACEROS AREQUIPA",
                "FIERRO DE 3/8 ACEROS AREQUIPA","FIERRO DE 6MM ACEROS AREQUIPA","FIERRO DE 4.7MM ACEROS AREQUIPA","FIERRO DE 1/2 ACEROS AREQUIPA",
                "FIERRO DE 5/8 ACEROS AREQUIPA","FIERRO DE 8MM ACEROS AREQUIPA","FIERRO DE 3/8 ACEROS AREQUIPA","FIERRO DE 6MM ACEROS AREQUIPA",
                "FIERRO DE 4.7MM ACEROS AREQUIPA","FIERRO DE 1/2 ACEROS AREQUIPA","FIERRO DE 5/8 ACEROS AREQUIPA","FIERRO DE 8MM ACEROS AREQUIPA",
                "FIERRO DE 3/8 ACEROS AREQUIPA","FIERRO DE 6MM ACEROS AREQUIPA","FIERRO DE 4.7MM ACEROS AREQUIPA","CEMENTO SOL TIPO 1","CEMENTO ANDINO TIPO 1",
                "CEMENTO SOL TIPO 1" ,"CEMENTO ANDINO TIPO 1" ,"FIERRO DE 1/2 ACEROS AREQUIPA","FIERRO DE 5/8 ACEROS AREQUIPA","FIERRO DE 8MM ACEROS AREQUIPA",
                "FIERRO DE 3/8 ACEROS AREQUIPA","FIERRO DE 6MM ACEROS AREQUIPA","FIERRO DE 4.7MM ACEROS AREQUIPA" ,"CLAVO ALBAÑIL CON CABEZA 4 X 1 KG- PRODAC",
                "CLAVO ALBAÑIL CON CABEZA 3 X 1 KG- PRODAC","CLAVO ALBAÑIL CON CABEZA 2 1/2 X 1 KG- PRODAC","CLAVO ALBAÑIL CON CABEZA 2 X 1 KG- PRODAC",
                "FIERRO DE 1/2 ACEROS AREQUIPA","FIERRO DE 5/8 ACEROS AREQUIPA","FIERRO DE 8MM ACEROS AREQUIPA","FIERRO DE 3/8 ACEROS AREQUIPA",
                "FIERRO DE 6MM ACEROS AREQUIPA","FIERRO DE 4.7MM ACEROS AREQUIPA","CLAVO ALBAÑIL CON CABEZA 4 X 1 KG- PRODAC","CLAVO ALBAÑIL CON CABEZA 2 X 1 KG- PRODAC",
                "CLAVO ALBAÑIL CON CABEZA 4 X 1 KG- PRODAC","CLAVO ALBAÑIL CON CABEZA 2 X 1 KG- PRODAC","CEMENTO SOL TIPO 1" ,"CEMENTO ANDINO TIPO 1","CEMENTO SOL TIPO 1",
                "CEMENTO ANDINO TIPO 1"};/*Arreglo con la descripcion de los productos que se compran o venden. Ya que en una sola factura pueden haber
        mas de un solo producto*/
        int[] CantidadProducto={100,100,50,35,100,35,25,18,90,90,45,32,90,32,23,16,45,27,58,32,20,25,40,22,53,27,15,20,100,100,85,80,45,27,58,32,
                20,25,20,20,20,20,40,22,53,27,15,20,15,15,15,15,80,50,70,40};
        double[] ImporteProductoSinIGV ={21.61,22.29,29.66,49.32,11.44,16.86,6.36,3.81,23.98,25.00,32.97,53.98,12.97,18.98,7.03,3.98,29.49,49.07,
                10.85,16.61,6.27,3.73,32.97,53.98,12.97,18.98,7.03,3.98,21.69,22.37,23.98,25.00,29.58,49.15,10.93,16.61,6.36,3.81,3.81,3.81,3.81,
                3.81,32.97,53.98,12.97,18.98,7.03,3.98,4.07,4.07,4.07,4.07,21.61,22.37,23.98,25.00};

        String calTipodeCoV = identificarTipoCoV(NumeroFactura,TipoFactura);


        System.out.println(calTipodeCoV);


    }

    private static String identificarTipoCoV(String[] numeroFactura, String[] tipoFactura) {
        String abc = "";
        String dettipo = "";
        int valorc = 0, valorv = 0;
        for (int i=0; i<numeroFactura.length; i++){
            dettipo = numeroFactura[i].substring(11,12);
            if (dettipo.equals("C")){
                valorc++;
            }
            if (dettipo.equals("V")){
                valorv++;
            }
        }
        abc = "La cantidad de facturas de compras fue de: "+valorc+" y la cantidad de facturas de ventas fue de: "+valorv;
        return abc;
    }



}
