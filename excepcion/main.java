// por ejemplo cuando se hace una división entre cero, o cuuando es nulo, cuando no se abre correctamente un fichero, etc. Cuando se produce una excepción se muestra en la pantalla un mensaje de error y finaliza el programa.
package excepcion;

public class main 
// QUEREMOS QUE NUESTRO PROGRAMA NO SE PARE CUANDO SE PRODUCE LA EXCEPCION
{
    public static int numerador = 10;
    public static Integer denominador = 0;
    public static float division;

    public static void main(String[] args)
    {
        System.out.println("ANTES DE LA EXCEPCION");

     //EN LA 1 PARTE /TRY ES PARA DAR LAS INTRUCCIONES CUANDO AUN NO HAY UNA EXPECIO
     try 
     {
        division = numerador / denominador;
     //2. EL CATCH VEMOS LAS INSTRUCCIONES CUANDO SE PRODUCE LA EXPECION EN ESTE CASO LA ARIMETIC EXCEPCION EX   
     } catch (ArithmeticException ex) {
        division = 0; 
        System.out.println("Error"+ex.getMessage());
    //3. EN LA PARTE DEL /FINALLY LAS INSTRUCCIONES SE EJECUTARAN TANTO SI HAY O NO HAY EXCPECION.

     } finally {
        System.out.println("Division: "+ division);
        System.out.println("CUANDO SE EJECUTA LA EXCEPCION");
     }
     }

        
    }
