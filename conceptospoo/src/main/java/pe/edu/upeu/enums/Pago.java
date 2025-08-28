package pe.edu.upeu.enums;

enum TIPO_PAGO {Efectivo,Credito,Transferencia,Yape};

enum MES{Enero, Febrero,}

public class Pago {
  TIPO_PAGO tipo;
   MES mes;
   double monto;
   String cuenta;
   double impuesto;


   public static void main(String[] args) {
       Pago p = new Pago();
       p.tipo = TIPO_PAGO.Efectivo;
       p.mes = MES.Enero;
       p.monto = 100;
       p.cuenta = "14143 51232 64545 31232";
       p.impuesto = 10;
   }




}
