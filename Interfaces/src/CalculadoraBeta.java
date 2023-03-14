import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author monic on 09/03/2023.
 * @project Interfaces
 */
public class CalculadoraBeta extends Frame {

    private Button [] botones;
    private TextField ventana= new TextField(5);
    private TextField ventana1= new TextField(5);
    private TextField ventana2= new TextField(5);
    private TextField ventana3= new TextField(5);



    CalculadoraBeta(){
        super("GridLayout");
        setSize(400,400);


        // Panel ventananum= new Panel();
        //ventananum.add(ventana);


        //Cierra la ventana al pulsar la X
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        Panel insert = new Panel();
        GridLayout contenedor = new GridLayout(5,4);


        botones = new Button[16];

        botones[0] = new Button("1");
        botones[1]= new Button("2");
        botones[2]= new Button("3");
        botones[3]= new Button("4");
        botones[4]= new Button("5");
        botones[5]= new Button("6");
        botones[6]= new Button("7");
        botones[7]= new Button("8");
        botones[8]= new Button("9");
        botones[9]= new Button("+");
        botones[10]= new Button("-");
        botones[11]= new Button("%");
        botones[12]= new Button("x");
        botones[13]= new Button("=");
        botones[14]=new Button("0");
        botones[15]=new Button(",");



        insert.add(ventana);
       /* ventana.setSize(50,10);
        add(ventana);
        add(ventana2);
        add(ventana3);
        add(ventana1);

        */



        //contenedor.;
        add(botones[0]);
        add(botones[1]);
        add(botones[2]);
        add(botones[9]);

        add(botones[3]);
        add(botones[4]);
        add(botones[5]);
        add(botones[10]);

        add(botones[6]);
        add(botones[7]);
        add(botones[8]);
        add(botones[11]);

        add(botones[15]);
        add(botones[14]);
        add(botones[13]);
        add(botones[12]);




        contenedor.setHgap(10);
        contenedor.setVgap(10);

        setLayout(contenedor);

        // Muestra la ventana ajustada al tamaño de sus componentes
        pack();
        setVisible(true);




    }


}
